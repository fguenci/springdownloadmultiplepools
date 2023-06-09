package com.msampietro.springdownloadmultiplepools.module.review.dto;

import com.msampietro.springdownloadmultiplepools.module.base.dto.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class ReviewDTO extends BaseDTO {

    @NotBlank
    @Size(min = 1, max = 50)
    private String comment;

    @NotBlank
    private String username;

}
