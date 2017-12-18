/*
 * Copyright 2017 original authors
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
package org.particleframework.management.endpoint.beans;

import org.particleframework.inject.BeanDefinition;

import java.util.Collection;

/**
 * <p>Used to respond with bean information used for the {@link BeansEndpoint}</p>
 *
 * @author James Kleeh
 * @since 1.0
 */
public interface BeanDefinitionDataCollector<T> {

    /**
     * @param beanDefinitions A collection of bean definitions
     * @return Data representing all of the given bean definitions
     */
    T getData(Collection<BeanDefinition<?>> beanDefinitions);
}