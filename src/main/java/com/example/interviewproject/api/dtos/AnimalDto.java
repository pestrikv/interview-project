package com.example.interviewproject.api.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@RequiredArgsConstructor
@Validated
public class AnimalDto {
    @NotEmpty
    private String species;
    @NotEmpty
    private String birth;
    @NotEmpty
    private String sex;
    @NotEmpty
    private String name;
    @NotEmpty
    private String host;

}
