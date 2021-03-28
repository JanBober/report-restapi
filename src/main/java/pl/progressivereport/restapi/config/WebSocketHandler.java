package pl.progressivereport.restapi.config;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import java.io.IOException;

public class WebSocketHandler extends AbstractWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {

        String msg = String.valueOf(message.getPayload());
        if ("Notification".equals(msg)) {
            System.out.println("Dog button was pressed");
            session.sendMessage(new TextMessage("Notification"));
        } else {
            System.out.println("Connected to Client");
        }
    }
}
