package com.pradipta.batsmanrabbitmqconsumer.rabbitmq.consumer;

import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FanoutHandler {
    @Synchronized           //This is just so that all three lines for one queue is printed together
    public void handleMessageForFanout1(String messageBody){
        log.info("Fanout 1");
        log.info("Handling message:");
        log.info(messageBody);
    }
    @Synchronized           //This is just so that all three lines for one queue is printed together
    public void handleMessageForFanout2(String messageBody){
        log.info("Fanout 2");
        log.info("Handling message:");
        log.info(messageBody);
    }
    @Synchronized           //This is just so that all three lines for one queue is printed together
    public void handleMessageForFanout3(String messageBody){
        log.info("Fanout 3");
        log.info("Handling message:");
        log.info(messageBody);
    }
}
