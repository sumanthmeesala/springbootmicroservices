package sumu.project.PersonService.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sumu.project.PersonService.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
