package com.fbmessenger.controllers;

import com.fbmessenger.domain.values.FacebookNotificationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/webhook/facebook")
public class FacebookMessengerWebhooksController {
    private final Logger logger = LoggerFactory.getLogger(FacebookMessengerWebhooksController.class);

    @GetMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String verify(@RequestParam Map<String,String> allRequestParams){
        logger.info("Facebook tried to verify callback with challenge: "+allRequestParams.get("hub.challenge"));
        return allRequestParams.get("hub.challenge");
    }

    @PostMapping(value="/", name="Post a facebook notification")
    @ResponseStatus(HttpStatus.OK)
    private void notification(@RequestBody FacebookNotificationRequest notificationRequest){
        logger.info("Recieved a notification from facebook came with timestamp: "+notificationRequest.getTimestamp());
        logger.info("sender PSID: "+notificationRequest.getSender());
        logger.info(notificationRequest.toString());
    }



}