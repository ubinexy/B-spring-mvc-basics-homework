package com.thoughtworks.capacity.gtb.mvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;

    @NotNull(message = "Username cannot be empty.")
    @Pattern(regexp="[a-zA-Z0-9_]{3,10}", message = "Invalid username.")
    private String username;

    @NotNull(message = "Password cannot be empty.")
    @Size(min=5, max=12, message = "Invalid password.")
    private String password;

    @Email(message = "Invalid email address.")
    private String email;
}
