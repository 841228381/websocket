package com.lsj.websocket.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Created by XZP on 2018/12/19.
 * 开启WebSocket支持
 * 这里的配置是ServerEndpointExporter的注入，
 * 配置该出会为我们后面使用到@ServerEndPoint注解的地方自动注册Websocket endpoint
 */
@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
