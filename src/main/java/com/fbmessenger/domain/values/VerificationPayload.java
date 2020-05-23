package com.fbmessenger.domain.values;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerificationPayload {
    private String mode;
    private String token;
    private String challenge;
}
