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
public class Course {

    private static Faker faker = new Faker();

    private static List<String> courseList = new ArrayList<>();

    static {
        /*Total 50 Elements*/
        courseList.add("M.A. English");
        courseList.add("M.A. Hindi");
        courseList.add("M.A. Sanskrit");
        courseList.add("M.A. Telugu");
        courseList.add("M.Ed.");
        courseList.add("B.Ed. Special Education (One year duration)");
        courseList.add("M.Com.");
        courseList.add("M.L.I.Sc.");
        courseList.add("M.J.M.C.");
        courseList.add("M.A. Applied Economics");
        courseList.add("M.A. Economics");
        courseList.add("M.A./M.Sc. Quantitative Economics");
        courseList.add("M.A. Adult & Continuing Education");
        courseList.add("M.A. Ancient History & Archaeology");
        courseList.add("M.A. History");
        courseList.add("M.A. Politics");
        courseList.add("M.Phil. Counseling Psychology");
        courseList.add("M.A. Public Administration");
        courseList.add("M.A. Sociology");
        courseList.add("M.A. Psychology");
        courseList.add("M.A./M.Sc. Anthropology");
        courseList.add("M.H.R.M.");
        courseList.add("M.A. Social Work");
        courseList.add("B.F.A. (4 years duration)");
        courseList.add("M.A. Philosophy");
        courseList.add("M.A. Music");
        courseList.add("M.A. Dance (Self Finance)");
        courseList.add("M.Ed. Special Education");
        courseList.add("M.B.A.");
        courseList.add("M.B.A. Retail Management");
        courseList.add("LLB.");
        courseList.add("LLM.");
        courseList.add("M.Phil / Ph.D. (FT. & PT.) programmes in Centre for Study of Social exclusion & Inclusive policy (Dept. of Anthropology).");
        courseList.add("M.Phil. Clinical Psychology.");
        courseList.add("2 Year M.P.Ed. degree course");
        courseList.add("B.P.A. (4 Years) Batchelor of Performing Arts in Theatre Arts");
        courseList.add("5 year Integrated LLB Degree Course");
        courseList.add("5 year Integrated Course in M.S. Economics.");
        courseList.add("M.A. in Women Studies and Computer Applications (2008-09)");
        courseList.add("M.A. in Yoga and Consciousness");
        courseList.add("Master of Finance & Control (Self-finance) (2009-10)");
        courseList.add("Master of Hospital Administration (2009-10)");
        courseList.add("Master of Hospital Administration course offered in School of Distance Education, A.U., VSP. (2011-2012).");
        courseList.add("MJMC s course offered in School of Distance Education, A.U.,VSP.(2011-2012)");
        courseList.add("Master of Computer Applications");
        courseList.add("MSC");
        courseList.add("PGD- Cooperation & Rural Studies (One Year) full time Course");
        courseList.add("PG. Diploma in Raja Basha Hindi (Two year)");
        courseList.add("PGD- Functional Hindi & Translation");
        courseList.add("PGD- Yoga");
    }

    private int id;

    @Builder.Default
    private String name = courseList.get(faker.number().numberBetween(1, 50));

    @Builder.Default
    private int instructorId = faker.number().numberBetween(1, 10);

    @Builder.Default
    private int duration = faker.number().numberBetween(1, 3);

    @Builder.Default
    private String departmentName = new Department().getDepartmentNameByIndex(faker.number().numberBetween(1, 25));
}
