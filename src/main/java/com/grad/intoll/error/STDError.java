package com.grad.intoll.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class STDError {

    private String description;

    private String value;

    private int code;
}
