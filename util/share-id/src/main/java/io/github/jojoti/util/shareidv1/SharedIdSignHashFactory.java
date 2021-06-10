/*
 * Copyright 2021 JoJo Wang , homepage: https://github.com/jojoti.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jojoti.util.shareidv1;

import com.google.inject.assistedinject.Assisted;

/**
 * @author JoJo Wang
 */
public interface SharedIdSignHashFactory {

    /**
     * 创建 shared id 对象，线程 安全
     *
     * @param signStr
     * @param hashIdSlat
     * @return
     */
    SharedId<Long, SharedIdSignDecodeValue> create(
            @Assisted("signStr") String signStr,
            @Assisted("hashIdSlat") String hashIdSlat);

}
