package io.github.jojoti.grpcstartersb;

import com.google.common.collect.ImmutableList;
import io.grpc.BindableService;
import io.grpc.ServerInterceptor;

/**
 * ScopeServerInterceptor 会 使用 clone 对象的 模式 来为多个 拦截器创建自己独立的 bean
 *
 * @author JoJo Wang
 * @link github.com/jojoti
 */
public interface ScopeServerInterceptor extends ServerInterceptor, DynamicScopeFilter, Cloneable {

    /**
     * 当前 scope 下 所有的 定义
     *
     * @param currentGRpcScope 该参数的作用在于 为 每个 scope 动态回掉
     * @param scopes
     */
    void aware(GRpcScope currentGRpcScope, ImmutableList<BindableService> scopes);

    ScopeServerInterceptor cloneThis();

}
