package com.ecommerce.beans;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent{
   
        public CustomEvent(Object source) {
      super(source);
   }
   public String toString(){
      return "This is a custom event";
   }
}
