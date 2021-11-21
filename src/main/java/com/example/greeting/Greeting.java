package com.example.greeting;

import lombok.*;

/**
 * Greeting
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Greeting {

    private String phrase;
    private String name;

}
