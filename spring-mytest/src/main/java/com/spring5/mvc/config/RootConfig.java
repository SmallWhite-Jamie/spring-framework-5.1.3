package com.spring5.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * RootConfig
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/4 18:22
 */
@Configuration
@ComponentScan("com.spring5.mvc.service")
public class RootConfig {
}
