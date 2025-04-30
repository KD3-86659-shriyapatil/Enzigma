package com.tasks.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString

public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name="AssignedTo")
	private String AssignedTo;
	
	@Column(name="Status")
	private String Status;
	
	private String DueDate;
	
	@Enumerated(EnumType.STRING)
	private Priority Priority;
	
	@Column(name="Comments",length = 30)
	private String Comments;
}
