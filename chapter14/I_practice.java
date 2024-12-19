package chapter14;

// === 직원 관리 시스템 === //

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2. 직원 목록 필터링 & 정렬
@AllArgsConstructor
@Getter
@ToString
class Employees {
    private String department;
    private String name;
    private double salary;
}

public class I_practice {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("IT", "이승아", 5000),
                new Employees("HR", "조승범", 7000),
                new Employees("IT", "김준일", 6500),
                new Employees("Finance", "전예찬", 4000),
                new Employees("HR", "윤대휘", 6300)
        );

        // 1. 급여가 6000 이상인 직원 필터링
        List<Employees> highSalaryEmployees = employees.stream()
                .filter(employee -> employee.getSalary() >= 6000)
                .collect(Collectors.toList());

        // 2. IT 부서 직원의 이름만 추출
        List<String> itEmployeeNames = employees.stream()
                .filter(employee -> "IT".equals(employee.getDepartment()))
                .map(Employees::getName)
                .collect(Collectors.toList());

        // 3. 특정 부서(HR) 직원 중 이름에 '조'가 포함된 직원 필터링
        List<Employees> employeesWithJo = employees.stream()
                .filter(employee -> employee.getDepartment().equals("HR"))
                .filter(employee -> employee.getName().contains("조"))
                .collect(Collectors.toList());
    }
}