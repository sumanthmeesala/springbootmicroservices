package sumu.project.PersonService.feignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import sumu.project.PersonService.entity.PersonDiary;

@FeignClient(url="http://localhost:8080", value="feign-client-project", path="/diary")
public interface PersonClientConfiguration {
	
	@PostMapping("/add")
	public String addDiary(@RequestBody PersonDiary diary);
	
	@GetMapping("/getDiary/{pid}")
	public List<PersonDiary> getPersonDiary(@PathVariable int pid);
	
}
