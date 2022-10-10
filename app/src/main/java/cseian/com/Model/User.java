package cseian.com.Model;

public class User {
    private String email,fullname,id,profileimageurl,username,uiuid,phone;

    public User() {
    }

    public User(String email, String fullname, String id, String profileimageurl, String username, String uiu, String phone) {
        this.email = email;
        this.fullname = fullname;
        this.id = id;
        this.profileimageurl = profileimageurl;
        this.username = username;
        this.uiuid = uiuid;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileimageurl() {
        return profileimageurl;
    }

    public void setProfileimageurl(String profileimageurl) {
        this.profileimageurl = profileimageurl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUiuid() {
        return uiuid;
    }

    public void setUiuid(String uiuid) {
        this.uiuid = uiuid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
