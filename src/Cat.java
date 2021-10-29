import java.util.*;

public class Cat {


    private String name;
    private String name2;




    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, String name2) {
        this.name = name;
        this.name2 = name2;
    }

    @Override
public int hashCode(){
        int code = 31+5;
        int code1 = code + name.hashCode() - 3;
        code1 = code + name2.hashCode() + 5;
        return code1;
}



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args){


        List<Cat> cats = new ArrayList<>();


//        List lst = new ArrayList();
//        lst.add("str");
//        lst.add(new Cat("adg"));



        Cat cat1 = new Cat("qwerty", "adfa");
        Cat cat2 = new Cat("vasya", "dima");


//        cats.add(new Cat("Bobik1"));
//        cats.add(new Cat("Bobik2"));
//        cats.add(new Cat("Bobik1"));




        cats.add(cat1);


//        cats.get(0);

        System.out.println(cats.get(0));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());


        Map<String, Cat> stringCatMap = new HashMap<>();
        stringCatMap.put("001", cat1);
        stringCatMap.put("key", cat2);

        stringCatMap.

        System.out.println(stringCatMap.isEmpty());

    }




}
