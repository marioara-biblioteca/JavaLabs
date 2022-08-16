package entities;

import exceptions.ExistsException;

import java.util.*;

public class Business {
    private final Set<Employee> employees=new HashSet<>();
    private final List<Project>projects=new ArrayList<>();
    public void addEmployee(final Employee employee)throws ExistsException{
        if(employees.contains(employee)) throw new ExistsException("This employee already exists in our business");
        employees.add(employee);
    }
    public void addProject(final Project project) throws ExistsException {
        if (projects.contains(project)) throw new ExistsException("Project already exists into the business.");
        projects.add(project);
    }

    public Set<Employee> getEmployees() {
        // TODO: get an immutable set of data
        return Collections.unmodifiableSet(employees);
    }

    public List<Project> getProjects() {
        // TODO: get an immutable list of data
        return Collections.unmodifiableList(projects);
    }
}
