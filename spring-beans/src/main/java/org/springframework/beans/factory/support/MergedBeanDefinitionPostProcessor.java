/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Post-processor callback interface for <i>merged</i> bean definitions at runtime.
 * {@link BeanPostProcessor} implementations may implement this sub-interface in order
 * to post-process the merged bean definition (a processed copy of the original bean
 * definition) that the Spring {@code BeanFactory} uses to create a bean instance.
 *
 * <p>The {@link #postProcessMergedBeanDefinition} method may for example introspect
 * the bean definition in order to prepare some cached metadata before post-processing
 * actual instances of a bean. It is also allowed to modify the bean definition but
 * <i>only</i> for definition properties which are actually intended for concurrent
 * modification. Essentially, this only applies to operations defined on the
 * {@link RootBeanDefinition} itself but not to the properties of its base classes.
 *
 *
 *  * 用于在运行时后处理合并的 bean 定义的回调接口。
 *  * BeanPostProcessor 实现可以实现此子接口，以便在 Spring 的 BeanFactory
 *  * 用于创建 bean 实例的时候对已合并的 bean 定义（原始 bean 定义的处理副本）进行后处理。
 *  *
 *  * #postProcessMergedBeanDefinition 方法可以用于内省 bean 定义，
 *  * 例如在后缀处理器 bean 的实例之前准备一些缓存的元数据。它也允许修改 bean 定义，
 *  * 但仅限于那些实际上用于并发修改的定义属性。本质上，这只应用于 RootBeanDefinition
 *  * 本身上定义的操作，但不包括其基类的属性。
 *
 * @author Juergen Hoeller
 * @since 2.5
 * @see org.springframework.beans.factory.config.ConfigurableBeanFactory#getMergedBeanDefinition
 */
public interface MergedBeanDefinitionPostProcessor extends BeanPostProcessor {

	/**
	 * 后处理指定 bean 的给定合并 bean 定义。在这里可以访问合并后的Bean定义可以修改Bean定义，例如改变属性值
	 * Post-process the given merged bean definition for the specified bean.
	 *
	 * @param beanDefinition the merged bean definition for the bean
	 * @param beanType       the actual type of the managed bean instance
	 * @param beanName       the name of the bean
	 * @see AbstractAutowireCapableBeanFactory#applyMergedBeanDefinitionPostProcessors
	 */
	void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName);

	/**
	 * 通知指定名称的 bean 定义已被重置，
	 * 这个 post-processor 应该清除受影响的 bean 的任何元数据。
	 * 默认实现是空的。
	 * A notification that the bean definition for the specified name has been reset,
	 * and that this post-processor should clear any metadata for the affected bean.
	 * <p>The default implementation is empty.
	 * @param beanName the name of the bean
	 * @since 5.1
	 * @see DefaultListableBeanFactory#resetBeanDefinition
	 */
	default void resetBeanDefinition(String beanName) {
	}

}
