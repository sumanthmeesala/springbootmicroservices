package sumu.project.DiaryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sumu.project.DiaryService.entity.Diary;

public interface DiaryRepository extends JpaRepository<Diary, Integer> {
	List<Diary> findByPersonId(int id);
}
