package com.example.interviewproject.api.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@RequiredArgsConstructor
@Validated
public class UserDto {
    @NotNull
    private String username;
    @NotNull
    private String password;
}
