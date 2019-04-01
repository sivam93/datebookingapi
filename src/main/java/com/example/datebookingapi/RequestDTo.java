package com.example.datebookingapi;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;




@JsonInclude(JsonInclude.Include.ALWAYS)

public class RequestDTo {
    @JsonProperty("expertsNAme")
    private String name;
    
    
    public String getName() {
    
        return name;
    }

    
    public void setName(String name) {
    
        this.name = name;
    }

    
    public Date getSample() {
    
        return sample;
    }

    
    public void setSample(Date sample) {
    
        this.sample = sample;
    }

    @JsonProperty("date")
    private Date sample;
    
}
