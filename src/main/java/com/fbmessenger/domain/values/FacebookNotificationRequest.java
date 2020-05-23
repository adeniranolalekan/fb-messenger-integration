package com.fbmessenger.domain.values;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class FacebookNotificationRequest {

    private MessageActor sender;

    private MessageActor recipient;

    private String timestamp;

    private Message message;

}
