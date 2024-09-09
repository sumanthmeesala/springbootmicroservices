package sumu.project.PersonService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sumu.project.PersonService.entity.Person;
import sumu.project.PersonService.entity.PersonDiary;
import sumu.project.PersonService.entity.repository.PersonRepository;
import sumu.project.PersonService.feignClient.PersonClientConfiguration;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	PersonClientConfiguration personClient;
	
	public String savePerson(Person person) {
		personRepo.save(person);
		return "Person saved successfully!";
	}

	public List<Person> getPersons() {
		return personRepo.findAll();
	}

	public String saveDiary(PersonDiary personDiary) {
		return personClient.addDiary(personDiary);
	}
	
	public List<PersonDiary> getPersonDiaries(int id) {
		return personClient.getPersonDiary(id);
	}
	
}
