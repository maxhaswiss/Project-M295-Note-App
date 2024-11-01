package ch.zero.project295.dto;

public class UserDTO {
    private long userId;
    private String username;
    private String email;

    public UserDTO() {
        // no constructor so that the json can fill it
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
