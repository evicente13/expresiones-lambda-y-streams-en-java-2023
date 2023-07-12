package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.Employee;
import com.debuggeando_ideas.fundamentals.Product;

public class AppGenericLambda {

    public static void main(String[] args) {
        //Printer<String> printString = string-> System.out.println(string);
        Printer<Product> printProduct = product -> System.out.println(product);
        Printer<Employee> printEmployee = e -> System.out.println(e);

        Product myProduct = new Product();
        myProduct.setId(21321L);
        myProduct.setPrice(10554.55);
        myProduct.setName("Smartphone");

        printProduct.print(myProduct);

        Employee employee = new Employee();
        employee.setDni("42836787");
        employee.setName("Eduardito");
        employee.setSalary(102.64);

        printEmployee.print(employee);

    }

}
