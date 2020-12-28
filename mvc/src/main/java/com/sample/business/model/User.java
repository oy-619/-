package com.sample.business.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class User {
	@NotNull
	@Size(min=3,max=3)
	private String id;

	@NotNull
	@Size(min=1)
	private String name;

	@NotNull
	@Range(min=10, max=99)
	private int age;

	private Date upDate; //更新日
}