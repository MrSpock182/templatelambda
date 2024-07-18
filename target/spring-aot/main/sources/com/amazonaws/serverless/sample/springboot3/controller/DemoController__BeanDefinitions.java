package com.amazonaws.serverless.sample.springboot3.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DemoController}.
 */
@Generated
public class DemoController__BeanDefinitions {
  /**
   * Get the bean definition for 'demoController'.
   */
  public static BeanDefinition getDemoControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DemoController.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(DemoController::new);
    return beanDefinition;
  }
}
