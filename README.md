需求背景
在项目中需要全局拦截用户请求，针对一些特定请求，可进行特殊业务处理和请求过滤

技术点
主要使用了两个对象

1. HandlerInterceptorAdapter对象（org.springframework.web.servlet.handler.HandlerInterceptorAdapter）

2. WebMvcConfigurationSupport对象（org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport）

对于第2点，不同于SpringBoot2中，SpringBoot1使用的是WebMvcConfigurerAdapter对象（org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter）

案例说明
场景案例分析：

1. 拦截所有请求，对特定请求可以进行特殊处理和过滤
2. 可对一批请求，验证固化的一些请求参数
3. 有时需要在拦截器中注入服务层对象，调用业务相关逻辑方法
4. 开启跨域请求访问功能





增加统一异常处理