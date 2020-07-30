package cl.leclerck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/auth")
public class LoginController {

	@GetMapping("/login")
	public String showLogin() {
		return "login/login";
	}
}