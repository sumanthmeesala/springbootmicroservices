package sumu.project.DiaryService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sumu.project.DiaryService.entity.Diary;
import sumu.project.DiaryService.service.DiaryService;

@RestController
@RequestMapping("diary")
public class DiaryController {
	
	@Autowired
	private DiaryService diaryService;
	
	@GetMapping("/")
	public String welcomeMessage() {
		return "Welcome to Diary Service";
	}
	
	@PostMapping("/add")
	public String addDiary(@RequestBody Diary diary) {
		return diaryService.addDiary(diary);
	}
	
	@GetMapping("/getDiary/{pid}")
	public List<Diary> getPersonDiary(@PathVariable int pid) {
		return diaryService.getPersonDiary(pid);
	}
 	
}
