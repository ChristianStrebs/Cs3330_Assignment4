package edu.oop.guild.notification;

public class LegacyOwlScroll {
	
	 public String dispatchScroll(String recipient, String inscription) 
	 {

	        if (recipient == null) 
	        {
	            throw new IllegalArgumentException("recipient is invalid");
	        }
	        

	        if (recipient.trim().isEmpty()) 
	        {
	            throw new IllegalArgumentException("recipient is invalid");
	        }

	        if (inscription == null) 
	        {
	            throw new IllegalArgumentException("inscription is invalid");
	        }

	        if (inscription.trim().isEmpty()) 
	        {
	            throw new IllegalArgumentException("inscription is invalid");
	        }
	        
	        String result = "Owl scroll sent to " + recipient + ": " + inscription; 
	        return result;
	  }
}
