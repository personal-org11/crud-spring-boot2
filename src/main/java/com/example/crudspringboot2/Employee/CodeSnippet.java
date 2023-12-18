package com.example.crudspringboot2.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodeSnippet {
    static int j=10;
    public static void main(String[] args)
    {
//        int arr[] ={10,20,10,30,10};
//        Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach(k,v);

//        int[] arr = {1, 6, 2, 8, 5, 4, 7, 7, 5, 7};
//        Arrays.stream(arr)
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
//                .stream()
//                .collect(Collectors.groupingBy(s -> s))
//                .forEach((k, v) -> System.out.println(k+" "+v.size()));

//        List<Integer> numsList=Arrays.asList(1,2,3,5,2,4,3,1,2,2,4,4,5);
//        Map<Integer, Long> map=numsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        map.forEach((k,v)->{System.out.println(k+" = "+v);});


//        String name ="sneha";
//        char[] arr = name.toCharArray();
//        for (int i=name.length()-1;i>=0;i--)
//        {
//            System.out.print(arr[i]);
//        }

        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
        Set<Integer> element =new HashSet<>();
        List<Integer> list2=list.stream().filter(n->!element.add(n)).collect(Collectors.toList());


        //        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,10,10,10);
//        //unique
//        myList.stream().distinct().forEach(System.out::println);
//        //duplicate count
//        Map<Integer,Long> output = new HashMap<>();
//        output= myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(output);

        List a = new ArrayList();
        a.add(1);
        a.add(2);


        List b = a;
        b.stream().forEach(System.out::println);
        List c = new ArrayList(a);
        c.stream().forEach(System.out::println);
    }
}
