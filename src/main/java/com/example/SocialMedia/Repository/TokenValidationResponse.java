package com.example.SocialMedia.Repository;

public class TokenValidationResponse {
    private boolean valid;

    public TokenValidationResponse(boolean valid) {
        this.valid = valid;
    }

    // Getter and setter
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
