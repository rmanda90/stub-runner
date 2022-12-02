package com.mpk.samples.stubrunner.objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(fluent = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private static Faker faker = new Faker();

    private int id;

    @Builder.Default
    private String firstName = faker.name().firstName();

    @Builder.Default
    private String lastName = faker.name().lastName();

    @Builder.Default
    private String email = faker.internet().emailAddress();

    @Builder.Default
    private String address = faker.address().fullAddress();

    @Builder.Default
    private String phoneNumber = faker.phoneNumber().phoneNumber();
}
