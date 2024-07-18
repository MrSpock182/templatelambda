package com.amazonaws.serverless.sample.springboot3;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link StartApplication}.
 */
@Generated
public class StartApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'startApplication'.
   */
  public static BeanDefinition getStartApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StartApplication.class);
    beanDefinition.setTargetType(StartApplication.class);
    beanDefinition.setLazyInit(true);
    ConfigurationClassUtils.initializeConfigurationClass(StartApplication.class);
    beanDefinition.setInstanceSupplier(StartApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
