package com.ipru.icm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class ICM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String description;
	@Column
	private String role;
	@Column
	private String assignee;
	@Column
	private String assigned;
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="icm_id")
	private List<Cases> cases;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getAssigned() {
		return assigned;
	}
	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}
	public List<Cases> getCases() {
		return cases;
	}
	public void setCases(List<Cases> cases) {
		this.cases = cases;
	}
	@Override
	public String toString() {
		return "ICM [id=" + id + ", description=" + description + ", role=" + role + ", assignee=" + assignee
				+ ", assigned=" + assigned + ", cases=" + cases + "]";
	}
	
	
}
