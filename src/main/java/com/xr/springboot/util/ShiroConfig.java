package com.xr.springboot.util;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Shiro的配置类
 */
@Configuration
public class ShiroConfig {
    /**
     * 2.配置Shiro核心 安全管理器 SecurityManager
     * SecurityManager安全管理器：所有与安全有关的操作都会与SecurityManager交互；且它管理着所有Subject；负责与后边介绍的其他组件进行交互。（类似于SpringMVC中的DispatcherServlet控制器）
     */

   @Bean
   public SecurityManager securityManager(){
           DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
           //将自定义的realm交给SecurityManager管理
           securityManager.setRealm(getMyRealm());
           return securityManager;
   }



    /**
     * 1.创建Realm
     */
    @Bean
    public MyRealm getMyRealm(){
        return new MyRealm();
    }
}
