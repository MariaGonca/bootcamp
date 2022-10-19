package com.bootcamp.bootcamp;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Note {

	
	private Integer id;
	private String test;
	private LocalDate date;
	private LocalDate estimated;
	private LocalDate completion;
	private String link;
	private String mentions;
	private int priority;
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDate getEstimated() {
		return estimated;
	}
	public void setEstimated(LocalDate estimated) {
		this.estimated = estimated;
	}
	public LocalDate getCompletion() {
		return completion;
	}
	public void setCompletion(LocalDate completion) {
		this.completion = completion;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getMentions() {
		return mentions;
	}
	public void setMentions(String mentions) {
		this.mentions = mentions;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Note(int id, String test, LocalDate date, LocalDate estimated, LocalDate completion, String link,
			String mentions, Integer priority) {
		super();
		this.id = id;
		this.test = test;
		this.date = date;
		this.estimated = estimated;
		this.completion = completion;
		this.link = link;
		this.mentions = mentions;
		this.priority = priority;
	}
	public Note() {
		super();
	}
	

}
