package sumu.project.DiaryService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Diary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer diaryId;
	Integer personId;
	String title;
	String content;
	
}
