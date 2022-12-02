package com.mpk.samples.stubrunner.objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.StringUtils.hasText;

@Data
@Builder
@Accessors(fluent = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Instructor {

    private static Faker faker = new Faker();

    private static List<String> facultyList = new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            String fullName = faker.name().prefix() + " " + faker.name().fullName();
            facultyList.add(hasText(fullName) ? fullName : "Default Name.");
        }
    }

    private int id;

    @Builder.Default
    private String departmentName = new Department().getDepartmentNameByIndex(faker.number().numberBetween(1, 25));

    @Builder.Default
    private String handleBy = faker.options().option("Raja", "Indu", "Pavan", "Anusha");

    @Builder.Default
    private String fullName = facultyList.get(faker.number().randomDigitNotZero());

    @Builder.Default
    private String phoneNumber = faker.phoneNumber().phoneNumber();
}
