
package com.example.datebookingapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder(value = { "userName", "passWord" }, alphabetic = true)
public class UserNameDTO {

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("passWord")
    private String passWord;

    
    public String getUserName() {
    
        return userName;
    }

    
    public void setUserName(String userName) {
    
        this.userName = userName;
    }

    
    public String getPassWord() {
    
        return passWord;
    }

    
    public void setPassWord(String passWord) {
    
        this.passWord = passWord;
    }
}
