package br.acc.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class EmployeeTest {

    static Employee firstEmployee;

    @BeforeAll
    static void initEmployee(){
        firstEmployee = new Employee("Amy", "Cruz", 1001, 'F', "Developer", 50000.00, "Permanent");
    }


    @Test
    void assertTest(){
        assertTimeout(Duration.ofSeconds(5),
                () -> {firstEmployee.ajustSalary(2000);
                    Employee secondEmployee = new Employee("Brian", "Alford", 1011, 'M', "Developer", 45000.00, "Contract");

                    secondEmployee.ajustSalary(3000);

        });

    }


}
