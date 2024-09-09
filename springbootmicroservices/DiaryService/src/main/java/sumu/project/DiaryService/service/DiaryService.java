package sumu.project.DiaryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sumu.project.DiaryService.entity.Diary;
import sumu.project.DiaryService.repository.DiaryRepository;

@Service
public class DiaryService {
	
	@Autowired
	DiaryRepository diaryRepo;

	public String addDiary(Diary diary) {
		diaryRepo.save(diary);
		return "Diary added Successfully!";
	}

	public List<Diary> getPersonDiary(int pid) {
		return diaryRepo.findByPersonId(pid);
	}
	
	
	
}
