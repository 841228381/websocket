package com.lsj.websocket;

import com.lsj.websocket.server.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by XZP on 2018/12/19.
 */
@RestController
@RequestMapping("/")
public class SendTest {
    @Resource
    WebSocketServer webSocketServer;


    @RequestMapping("/send")
    public String send(){
        try {
            webSocketServer.sendToUser("普通用户信息，管理员收得到 ","1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "普通用户信息，管理员收得到";
    }

    @RequestMapping("/send2")
    public void send2(){
        try {
            webSocketServer.sendToUser("管理员专属信息 ","2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
