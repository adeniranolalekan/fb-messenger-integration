package com.fbmessenger.domain.values;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private String mid;
    private String text;

    @JsonProperty("quick_reply")
    private QuickReply quickReply;
}
