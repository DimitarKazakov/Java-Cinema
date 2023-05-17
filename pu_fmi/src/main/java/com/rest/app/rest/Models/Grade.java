package com.rest.app.rest.Models;
import java.time.LocalDateTime;

public class Grade {
	private int score;
	private Subject subject;
	private LocalDateTime date = LocalDateTime.now();
	private String reason;
	
	public Grade() {
		
	}
	
	public Grade(int score, Subject subject, String reason) {
		this.score = score;
		this.subject = subject;
		this.reason = reason;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
}
