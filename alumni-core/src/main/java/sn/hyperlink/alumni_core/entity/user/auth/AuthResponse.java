package sn.hyperlink.alumni_core.entity.user.auth;

public class AuthResponse {

    private String token;
    private String tokenType = "Bearer";

    public AuthResponse(String token) {
        this.token = token;
    }

    // Getters et setters
}
