package org.springframework.cloud.function.serverless.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;

/**
 * Bean definitions for {@link ServerlessAutoConfiguration}.
 */
@Generated
public class ServerlessAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'serverlessAutoConfiguration'.
   */
  public static BeanDefinition getServerlessAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServerlessAutoConfiguration.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(ServerlessAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'servletWebServerFactory'.
   */
  private static BeanInstanceSupplier<ServletWebServerFactory> getServletWebServerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletWebServerFactory>forFactoryMethod(ServerlessAutoConfiguration.class, "servletWebServerFactory")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ServerlessAutoConfiguration.class).servletWebServerFactory());
  }

  /**
   * Get the bean definition for 'servletWebServerFactory'.
   */
  public static BeanDefinition getServletWebServerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletWebServerFactory.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getServletWebServerFactoryInstanceSupplier());
    return beanDefinition;
  }
}
