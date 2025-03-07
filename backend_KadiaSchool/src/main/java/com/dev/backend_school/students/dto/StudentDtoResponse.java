package com.dev.backend_school.students.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class StudentDtoResponse {
    private Long id;
    @NotBlank(message = "Le prénom est requis!")
    private String firstName;
    @NotBlank(message = "Le nom est requis!")
    private String lastName;
    @NotBlank(message = "L'email Pro est requis!")
    private String emailPro;
    @NotBlank(message = "L'email est requis!")
    private String emailPerso;
    @NotBlank(message = "Le numéro est requis!")
    private String phoneNumber;
    @NotBlank(message = "L'adresse est requis!")
    private String address;
    private boolean archive;
    private String registrationNo;
}
