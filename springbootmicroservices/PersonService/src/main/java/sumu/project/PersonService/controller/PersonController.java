package sumu.project.PersonService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sumu.project.PersonService.entity.Person;
import sumu.project.PersonService.entity.PersonDiary;
import sumu.project.PersonService.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public String welcomeMessage() {
		return "Welcome to Person service";
	}
	
	@PostMapping("/add")
	public String addPerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@GetMapping("/getPersons")
	public List<Person> getPersons() {
		return personService.getPersons();
	}
	
	@PostMapping("/saveDiary")
	public String saveDiary(@RequestBody PersonDiary personDiary) {
		return personService.saveDiary(personDiary);
	}
	
	@GetMapping("/getDiary/{id}")
	public List<PersonDiary> getDiaryOfAPerson(@PathVariable int id) {
		return personService.getPersonDiaries(id);
	}
	
	
	
}
