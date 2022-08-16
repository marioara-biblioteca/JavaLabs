package reports;

import entities.*;
import java.util.*;
import java.util.stream.Collectors;

public class BankReport {
    // Customer = Employee of the Business
    // Business = a client of the Bank
    // Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        List<List<Employee>>emp=new ArrayList<>();
        List.copyOf(bank.getClients()).forEach(business->{
           emp.add(List.copyOf(business.getEmployees()));
       });
        return emp.stream().flatMap(List::stream).toList().size();
    }

    //not much, but honest work, merita revenit ca sa o fac mai lambda-ish
    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank
        List<List<Employee>>emp=new ArrayList<>();
        List.copyOf(bank.getClients()).forEach(business->{
            emp.add(List.copyOf(business.getEmployees()));
        });

        int[] iarr = {0}; //cu un int simplu nu putem
        emp.stream().flatMap(List::stream).toList().forEach(employee -> {
           iarr[0]+=employee.getAccounts().size();
        });
        return iarr[0];
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Display the set of customers in alphabetical order
        SortedSet<Employee>sortedSet=new TreeSet<>(Comparator.comparing(Employee::getName));
        sortedSet.addAll(List.copyOf(bank.getClients().stream().map(Business::getEmployees).flatMap(Set::stream).toList()));
        return sortedSet;
    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances
        List<List<Employee>>emp=new ArrayList<>();
        List.copyOf(bank.getClients()).forEach(business->{
            emp.add(List.copyOf(business.getEmployees()));
        });

        double[] iarr = {0}; //cu un int simplu nu putem
        emp.stream().flatMap(List::stream).toList().forEach(employee -> {
           employee.getAccounts().forEach(account -> {
               iarr[0]+=account.getBalance();
           });
        });
        return iarr[0];
    }

    public static SortedSet<Account> getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance
        SortedSet<Account>sortedSet=new TreeSet<>(Comparator.comparing(Account::getBalance));
        bank
                .getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Set::stream)
                .forEach(employee -> {
                    sortedSet.addAll(employee.getAccounts());
                });
        return sortedSet;

    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts
        Map<Employee, Collection<Account>> map=new HashMap<>();
        bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Set::stream)
                .toList()
                .forEach(employee -> {
                    map.put(employee,employee.getAccounts());
                });
        return map;

    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities
        List<List<Employee>>emp=new ArrayList<>();
        List.copyOf(bank.getClients()).forEach(business->{
            emp.add(List.copyOf(business.getEmployees()));
        });
        return emp.
                stream().flatMap(List::stream).toList().
                stream().collect(Collectors.groupingBy(Employee::getCity));

    }
}
