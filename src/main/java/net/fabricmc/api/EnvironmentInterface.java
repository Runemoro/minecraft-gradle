/*
 * Copyright 2016 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.api;

import java.lang.annotation.*;

/**
 * Applied to declare that an interface implementation is present only in the specified environment.
 * Use with caution, as Fabric-loader will completely remove interface implementations in a mismatched environment!
 * Implemented methods are not removed. To remove implemented methods, use {@link Environment}.
 */
@Retention(RetentionPolicy.CLASS)
@Repeatable(EnvironmentInterfaces.class)
@Target(ElementType.TYPE)
public @interface EnvironmentInterface {
    EnvType value();
    Class<?> itf();
}
