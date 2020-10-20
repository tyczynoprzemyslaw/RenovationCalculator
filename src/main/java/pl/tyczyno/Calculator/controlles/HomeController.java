package pl.tyczyno.Calculator.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.tyczyno.Calculator.RoomDimensions;

@Controller
public class HomeController {
	
	@Autowired
	private RoomValidator validator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(validator);
	}
	
	@RequestMapping("/hello")
    public String hello(@ModelAttribute("room") @Validated RoomDimensions room, BindingResult result, Model model ) {
		model.addAttribute("RoomDimensions", new RoomDimensions());
        return "hello";
    }
	
	@RequestMapping({"/","/home"})
    public String home() {
       
        return "home";
	}
	
	@RequestMapping("/exception")
    public String exception() {
       
        return "exception";        
        
    }
	
	@PostMapping(value="/send")
	public String postSend(@ModelAttribute ("room") RoomDimensions room, BindingResult result,Model model) {
		
		return "send";
	}
	
	@GetMapping(value="/send")
	public String Send(@ModelAttribute ("room") RoomDimensions room, BindingResult result,Model model) {
		model.addAttribute("RoomDimensions", new RoomDimensions());
		return "send";
	}
}


