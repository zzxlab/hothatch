package com.zzxlab.input.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 服务配置
 *
 * @author zhaoxq
 */
@Configuration
public class ServerConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
