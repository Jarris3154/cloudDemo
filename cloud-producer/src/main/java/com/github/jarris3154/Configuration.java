package com.github.jarris3154;

import org.springframework.context.annotation.PropertySource;

@PropertySource("limits-service")
public class Configuration {
    private Integer minimum;
    private Integer maximum;

    public Integer getMaximum(){
        return this.maximum;
    }
    
    public Integer getMinimum(){
        return this.minimum;
    }    

    public void setMinimum(Integer minimum){
       this.minimum = minimum;
    }

    public void setMaximum(Integer maximum){
        this.maximum = maximum;
     }
}