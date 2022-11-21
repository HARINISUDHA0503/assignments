package com.assignment2;

	import org.springframework.stereotype.Component;

	@Component
	public class UserAuthentication {
	  private String username="Harini";
	  private String password="12345";
	  public boolean find(String username1,String password1)
	  {
	     /* if((username==username1)&&(password==password1))
	      {
	          return true;
	      }
	      else
	      {
	          return false;
	      }
	  }*/
	      
	      return username.equals(username1)&&password.equals(password1);
	}
	}
