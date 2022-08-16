package clasa;
/*
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        //whenNamesPresent();
        //whenNamesPresentBoth();
       // testPredicate();
        //testFunction();
        //testSupplier();
    }
    public static void testSupplier(){
        Supplier<Double>doubleSupplier=()->Math.random();
        DoubleSupplier doubleSupplier1=Math::random;
        System.out.println(doubleSupplier.get());
        System.out.println(doubleSupplier1.getAsDouble());
    }
    public static void testFunction(){
        List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
        Function<String,Integer>nameMappingFunction=s->s.length();
        List<Integer>lenghts=names.stream().map(nameMappingFunction).collect(Collectors.toList());
        System.out.println(lenghts);
    }
    public static void testPredicate(){
        List<String>cities=Arrays.asList("Barcelona","Madrid","Valencia","Vienna");
        Predicate<String>nameStratsWith=name->name.startsWith("V");
        cities.stream().filter(nameStratsWith).forEach(System.out::println);
    }
    public static void whenNamesPresent(){
        Consumer<String> printConsumer= t->System.out.println(t);
        Stream<String> cities=Stream.of("Bucuresti","Cluj","Pitesti");
        cities.forEach(printConsumer);
    }
    public static void whenNamesPresentBoth(){
        List<String>cities=Arrays.asList("Sydney","Rome","Paris");
        Consumer<List<String>>upperCaseConsumer=list->{
            for(int i=0;i<list.size();i++){
                list.set(i,list.get(i).toUpperCase());
            }
        };
        Consumer<List<String>>printConsumer=list->list.stream().forEach(System.out::println);
        upperCaseConsumer.andThen(printConsumer).accept(cities);
    }
}
*/