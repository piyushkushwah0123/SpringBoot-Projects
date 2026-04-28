package com.app.piyush;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Component // Isse ye class Spring container me bean ban jaati hai
@Getter // Getter methods auto generate
@Setter // Setter methods auto generate
@ToString // toString() method auto generate
@NoArgsConstructor // Default constructor
@AllArgsConstructor // All arguments constructor
public class Process1 {

	private String code;

	private int port;


	

}
