package com.sanjay.mongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection ="User_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	  @Id 
	  
	  private String id;
	  private String firstName;
	  private String lastName;
	  @DBRef
	  private Address address;

}
