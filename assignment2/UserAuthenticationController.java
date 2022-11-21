package com.assignment2;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class UserAuthenticationController {
	   private UserAuthentication result;
	   public UserAuthenticationController(UserAuthentication result)
	   {
	       this.result=result;
	   }
	   @GetMapping("/{name}/{password}")
	   public String solution(@PathVariable String name,@PathVariable String password)
	   {
	       boolean sol=result.find(name,password);
	       if(sol)
	       {
	           return "valid user";
	       }
	       else
	       {
	           return "not valid";
	       }
	   }

}
