package com.example.customer_management_api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // lombok
@NoArgsConstructor 
@AllArgsConstructor 
public class CustomerDTO {

    @Schema(description = "Unique ID of the customer", example = "1")
    private Long id;

    @NotBlank(message = "Customer name cannot be blank") 
    @Schema(description = "Full name of the customer", example = "John Doe")
    private String name;

    @Email(message = "Invalid email format") 
    @NotBlank(message = "Email address cannot be blank") 
    @Schema(description = "Email address", example = "john.doe@example.com")
    private String email;
}
