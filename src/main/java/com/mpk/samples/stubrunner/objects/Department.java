package com.mpk.samples.stubrunner.objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Accessors(fluent = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private static final Faker faker = new Faker();

    private static final List<String> departmentList = new ArrayList<>();

    static {
        /*Total 25 Elements*/
        departmentList.add("ANTHROPOLOGY");
        departmentList.add("COMMERCE & MANAGEMENT STUDIES");
        departmentList.add("ECONOMICS");
        departmentList.add("EDUCATION");
        departmentList.add("ENGLISH");
        departmentList.add("FINE ARTS");
        departmentList.add("FOREIGN LANGUAGES");
        departmentList.add("HINDI");
        departmentList.add("HISTORY AND ARCHAEOLOGY");
        departmentList.add("INDUSTRIAL RELATIONS AND PERSONNEL MGMT (MHRM)");
        departmentList.add("JOURNALISM AND MASS COMMUNICATION");
        departmentList.add("LIBRARY AND INFORMATION SCIENCE");
        departmentList.add("LINGUISTICS");
        departmentList.add("MUSIC & DANCE");
        departmentList.add("PHILOSOPHY & RELIGIOUS STUDIES");
        departmentList.add("PHYSICAL EDUCATION & SPORTS SCIENCES");
        departmentList.add("POLITICAL SCIENCE & PUBLIC ADMINISTRATION");
        departmentList.add("SANSKRIT");
        departmentList.add("SOCIAL WORK");
        departmentList.add("SOCIOLOGY");
        departmentList.add("TELUGU");
        departmentList.add("THEATRE ARTS");
        departmentList.add("YOGA AND CONSCIOUSNESS");
        departmentList.add("Computer Applications");
        departmentList.add("Bachelor of Engineering");
    }

    private int id;
    @Builder.Default
    private final String departmentName = departmentList.get(faker.number().numberBetween(1, 25));
    
    public String getDepartmentNameByIndex(int index) {
        return departmentList.get(index);
    }
}
