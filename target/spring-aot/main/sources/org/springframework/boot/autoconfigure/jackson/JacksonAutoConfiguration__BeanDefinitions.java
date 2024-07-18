package org.springframework.boot.autoconfigure.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.jackson.JsonComponentModule;
import org.springframework.boot.jackson.JsonMixinModule;
import org.springframework.boot.jackson.JsonMixinModuleEntries;
import org.springframework.context.ApplicationContext;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Bean definitions for {@link JacksonAutoConfiguration}.
 */
@Generated
public class JacksonAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonAutoConfiguration'.
   */
  public static BeanDefinition getJacksonAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(JacksonAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jsonComponentModule'.
   */
  private static BeanInstanceSupplier<JsonComponentModule> getJsonComponentModuleInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JsonComponentModule>forFactoryMethod(JacksonAutoConfiguration.class, "jsonComponentModule")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.class).jsonComponentModule());
  }

  /**
   * Get the bean definition for 'jsonComponentModule'.
   */
  public static BeanDefinition getJsonComponentModuleBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonComponentModule.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getJsonComponentModuleInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration}.
   */
  @Generated
  public static class JacksonObjectMapperBuilderConfiguration {
    /**
     * Get the bean definition for 'jacksonObjectMapperBuilderConfiguration'.
     */
    public static BeanDefinition getJacksonObjectMapperBuilderConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration.class);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jacksonObjectMapperBuilder'.
     */
    private static BeanInstanceSupplier<Jackson2ObjectMapperBuilder> getJacksonObjectMapperBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<Jackson2ObjectMapperBuilder>forFactoryMethod(JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration.class, "jacksonObjectMapperBuilder", ApplicationContext.class, List.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration.class).jacksonObjectMapperBuilder(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'jacksonObjectMapperBuilder'.
     */
    public static BeanDefinition getJacksonObjectMapperBuilderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(Jackson2ObjectMapperBuilder.class);
      beanDefinition.setScope("prototype");
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(getJacksonObjectMapperBuilderInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration}.
   */
  @Generated
  public static class Jackson2ObjectMapperBuilderCustomizerConfiguration {
    /**
     * Get the bean definition for 'jackson2ObjectMapperBuilderCustomizerConfiguration'.
     */
    public static BeanDefinition getJacksonObjectMapperBuilderCustomizerConfigurationBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.class);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'standardJacksonObjectMapperBuilderCustomizer'.
     */
    private static BeanInstanceSupplier<JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.StandardJackson2ObjectMapperBuilderCustomizer> getStandardJacksonObjectMapperBuilderCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.StandardJackson2ObjectMapperBuilderCustomizer>forFactoryMethod(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.class, "standardJacksonObjectMapperBuilderCustomizer", JacksonProperties.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.class).standardJacksonObjectMapperBuilderCustomizer(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'standardJacksonObjectMapperBuilderCustomizer'.
     */
    public static BeanDefinition getStandardJacksonObjectMapperBuilderCustomizerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration.StandardJackson2ObjectMapperBuilderCustomizer.class);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(getStandardJacksonObjectMapperBuilderCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonMixinConfiguration}.
   */
  @Generated
  public static class JacksonMixinConfiguration {
    /**
     * Get the bean definition for 'jacksonMixinConfiguration'.
     */
    public static BeanDefinition getJacksonMixinConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.JacksonMixinConfiguration.class);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonMixinConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jsonMixinModule'.
     */
    private static BeanInstanceSupplier<JsonMixinModule> getJsonMixinModuleInstanceSupplier() {
      return BeanInstanceSupplier.<JsonMixinModule>forFactoryMethod(JacksonAutoConfiguration.JacksonMixinConfiguration.class, "jsonMixinModule", ApplicationContext.class, JsonMixinModuleEntries.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.JacksonMixinConfiguration.class).jsonMixinModule(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'jsonMixinModule'.
     */
    public static BeanDefinition getJsonMixinModuleBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonMixinModule.class);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(getJsonMixinModuleInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonObjectMapperConfiguration}.
   */
  @Generated
  public static class JacksonObjectMapperConfiguration {
    /**
     * Get the bean definition for 'jacksonObjectMapperConfiguration'.
     */
    public static BeanDefinition getJacksonObjectMapperConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.JacksonObjectMapperConfiguration.class);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonObjectMapperConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jacksonObjectMapper'.
     */
    private static BeanInstanceSupplier<ObjectMapper> getJacksonObjectMapperInstanceSupplier() {
      return BeanInstanceSupplier.<ObjectMapper>forFactoryMethod(JacksonAutoConfiguration.JacksonObjectMapperConfiguration.class, "jacksonObjectMapper", Jackson2ObjectMapperBuilder.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonAutoConfiguration.JacksonObjectMapperConfiguration.class).jacksonObjectMapper(args.get(0)));
    }

    /**
     * Get the bean definition for 'jacksonObjectMapper'.
     */
    public static BeanDefinition getJacksonObjectMapperBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ObjectMapper.class);
      beanDefinition.setPrimary(true);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(getJacksonObjectMapperInstanceSupplier());
      return beanDefinition;
    }
  }
}