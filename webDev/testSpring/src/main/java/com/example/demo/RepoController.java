package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/test")
public class RepoController {
	
  @Autowired
	private ContactsRepository repo;
	
	
	@PostMapping(path="/add")
	public @ResponseBody String addContact(@RequestParam String name, @RequestParam Integer number) {
		
		Contact contact = new Contact();
		contact.setName(name);
		contact.setName(number.toString());
		repo.save(contact);
		return ("Contact " + name + " saved");
	}
	
	@PostMapping(path="/update")
	public @ResponseBody String updateContact(@RequestParam Integer id, @RequestParam String name, @RequestParam Integer number) {
		Optional<Contact> optional = repo.findById(id);
		if(optional.isPresent()) {
			Contact contact = optional.get();
			contact.setName(name);
			contact.setNumber(number);
			repo.save(contact);
			return "Contact " + name + " updated";
		}
		return "Contact not found";
	}
	
	@PostMapping(path="/delete")
	public @ResponseBody String deleteContact(@RequestParam Integer id) {
		Optional<Contact> optional = repo.findById(id);
		if(optional.isPresent()) {
			Contact contact = optional.get();
			repo.delete(contact);
			return "Contact " + contact.getName() + " deleted";
		}
		return "Contact not found";	
	}

}
