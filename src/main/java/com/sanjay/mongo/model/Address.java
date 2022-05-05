package com.sanjay.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection ="Address_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	 @Id 
	  private String id;
	 private String StreetName;
	 private String mobileNumber;
	 private int pincode;
	 

}
