package com.mapsa.validation.domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotEmpty(message = "first name is required here dude!")
    private String firstName;
    @NotNull(message = "hey! i said it's required!")
    private String lastName;
    @Email
    @NotBlank(message = ("I really need to send you a spam email cause i have problems XD"))
    private String email;
    @NotNull(message = "if you don't enter password your stupid")
    @Size(min = 2,max=8)
    private String password;
    @Min(18)
    @Digits(integer = 2, fraction = 0)
    private int age;
    @Pattern(regexp = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$")
    private String subscribedNumber;
    @Past
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}
