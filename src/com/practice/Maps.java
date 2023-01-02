package com.practice;

import com.ismail.Strings;

import java.util.*;
import java.util.function.BiFunction;

public class Maps {
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        //CREATING AN ENUMMAP OF THE SIZE ENUM
        EnumMap<Size, Integer> sizes1 = new EnumMap<Size, Integer>(Size.class);

        //using the put method
        sizes1.put(Size.SMALL, 28);
        sizes1.put(Size.MEDIUM, 32);
        System.out.println("EnumMap1: " + sizes1);

        EnumMap<Size, Integer> sizes2 = new EnumMap<Size, Integer>(Size.class);

        //using the putall method
        sizes2.putAll(sizes1);
        sizes2.put(Size.LARGE, 36);
        System.out.println("EnumMap2: " + sizes2);

        //using the entryset() method
        System.out.println("Key/Value Mappings: " + sizes2.entrySet());

        //using the keyset() method
        System.out.println("Keys: " + sizes2.keySet());

        //using the values() method
        System.out.println("ValueSet: " + sizes2.values());
        sizes2.put(Size.EXTRALARGE, 40);
        System.out.println("ENUMMAp: " + sizes2);

        //using the get() method
        int valueee = sizes2.get(Size.MEDIUM);
        System.out.println("Value of Medium: " + valueee);

        //Remove EnumMap Elements
        //using the remove() method
        Integer valueee2 = sizes2.remove(Size.MEDIUM);
        System.out.println("Removed value: " + valueee2);

        boolean result = sizes2.remove(Size.SMALL, 28);
        System.out.println("Is the entry {SMALL=28} removed: " + result);

        System.out.println("Updated ENUMMAP NOW: " + sizes2);

        //Replace EnumMap Elements
        EnumMap<Size, Integer> size3 = new EnumMap<Size, Integer>(Size.class);
        size3.put(Size.SMALL, 20);
        size3.put(Size.MEDIUM, 30);
        size3.put(Size.LARGE, 40);
        size3.put(Size.EXTRALARGE, 50);
        System.out.println("EnumSet size3: " + size3);

        //using the replace() method
        size3.replace(Size.MEDIUM, 35);
        size3.replace(Size.LARGE, 40, 45);
        System.out.println("EnumMap using replace(): " + size3);

        //using replaceAll() method
        size3.replaceAll((key, value) -> value + 3);
        System.out.println("replaceAll" + size3);


        //Implementing HashMap Class
        //creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        //inserts elements to the map
        numbers.put("One", 10);
        numbers.put("Two", 20);
        System.out.println("Numbers: " + numbers);

        //Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        //Access values of the map
        System.out.println("Values: " + numbers.values());

        //Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        //remove elements from the map
        int value = numbers.remove("One");
        System.out.println("Removed value: " + value);

        // Implementing TreeMap Class
        //creating a map using TreeMap
        Map<String, Integer> values = new TreeMap<>();

        //inserts elements to the map
        values.put("Second", 20);
        values.put("First", 10);
        System.out.println("Map using TreeMap: " + values);

        //Replacing the values
        values.replace("Second", 22);
        values.replace("First", 11);
        System.out.println("New Map: " + values);

        //remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed value: " + removedValue);


        //Create a HashMap
        Map<String, Integer> languages = new HashMap<>();
        //Add elements to HashMap
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        System.out.println("HashMap: " + languages);

        //Insert Item with Duplicate Key
        //Create an HashMap
        Map<String, String> capitals = new HashMap<>();

        capitals.put("Hyderabad", "TS");
        capitals.put("Kurnool", "AP");
        capitals.put("Chennai", "TN");
        System.out.println("Capitals: " + capitals);

        //add element with duplicate key
        String a = capitals.put("Hyderabad", "India");
        System.out.println("Updated Capitals: " + capitals);

        //display the replace value
        System.out.println("ReplacedValue: " + a);


        // Change All Values to Uppercase
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Ismail");
        names.put(2, "Jabiulla");
        names.put(3, "Shaik");
        System.out.println("======================================");
        System.out.println("Names: " + names);

        //change all values to uppercase


        System.out.println("==============================: " + names);

        // Java HashMap putAll()
        Map<String, Integer> primeNumbers = new HashMap<>();
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        System.out.println("PrimeNumbers: " + primeNumbers);

        Map<String, Integer> num = new HashMap<>();
        num.put("One", 1);
        num.put("Two", 22);

        //Add All Mappings from primeNumbers to num
        num.putAll(primeNumbers);
        System.out.println(num);

        //Insert Mappings from TreeMap to HashMap
        //create a TreeMap of  String Map
        Map<String, String> treemap = new TreeMap<>();

        //add mapping to the TreeMap
        treemap.put("A", "Apple");
        treemap.put("B", "Bat");
        treemap.put("C", "Cat");
        System.out.println("TreeMap: " + treemap);

        //create a HashMap
        Map<String, String> hashmapp = new HashMap<>();

        //add mapping to HashMap
        hashmapp.put("Y", "Yak");
        hashmapp.put("Z", "Zibra");
        System.out.println("Initial HashMap: " + hashmapp);

        //add all mappings from TreeMap to HashMap
        hashmapp.putAll(treemap);
        System.out.println("Updated HashMap: " + hashmapp);


        //Java HashMap putIfAbsent()
        Map<Integer, String> lang = new HashMap<>();
        //add mappings to HashMap
        lang.put(1, "Python");
        lang.put(2, "C");
        lang.put(3, "Java");
        System.out.println("Lang: " + lang);

        //key already not present in HashMap
        lang.putIfAbsent(4, "JavaScript");

        //key already present in HashMap
        lang.putIfAbsent(2, "Swift");
        System.out.println("Updated lang: " + lang);


        //Access HashMap Elements
        Map<Integer, String> langs = new HashMap<>();
        langs.put(1, "Java");
        langs.put(2, "Python");
        langs.put(3, "C");
        System.out.println("Langs: " + langs);

        //get() method to get value
        String val = langs.get(1);
        System.out.println("Value at index 1: " + val);


        //Java HashMap getOrDefault()
        //create an HashMap
        Map<Integer, String> numbers1 = new HashMap<>();

        //Inserts entries to the HashMap
        numbers1.put(1, "Java");
        numbers1.put(2, "Python");
        numbers1.put(3, "JavaScript");
        System.out.println("HashMap: " + numbers1);

        //mapping for the key is present in HashMap
        String value1 = numbers1.getOrDefault(1, "NotFound");
        System.out.println("Value for key 1: " + value1);

        //mapping for the key is not present in HashMap
        String value2 = numbers1.getOrDefault(4, "NotFound");
        System.out.println("Value for key 4: " + value2);

        System.out.println("+++++++++++++++++++++: " + names);

        //Creating HashMap from Other Maps
        //create a TreeMap
        TreeMap<String, Integer> dis = new TreeMap<>();
        dis.put("two", 2);
        dis.put("four", 4);
        System.out.println("TreeMap: " + dis);

        //create HashMap from the TreeMap
        HashMap<String, Integer> dis2 = new HashMap<>(dis);
        dis2.put("three", 3);
        System.out.println("HashMap: " + dis2);



        //Creating LinkedHashMap from Other Maps
        //creating a linkedhashmap of numbersLH
        LinkedHashMap<String,Integer> numbersLH = new LinkedHashMap<>();
        numbersLH.put("Two",2);
        numbersLH.put("Four",4);
        System.out.println("LinkedHashMap1: "+ numbersLH);

        //creting a linkedhashmap from other linkedhashmap
        LinkedHashMap<String,Integer> numbersLH2 = new LinkedHashMap<>(numbersLH);
        numbersLH2.put("Three",3);
        System.out.println("LinkedHashMap2: "+ numbersLH2);

        //using putifabsent()
        numbersLH2.putIfAbsent("Five",5);
        System.out.println("Updated LinkedHashMap: "+ numbersLH2);

        //using putAll()
        LinkedHashMap<String,Integer> numbersLH3 = new LinkedHashMap<>();
        numbersLH3.put("One",1);
        numbersLH3.putAll(numbersLH2);
        System.out.println("New LinkedHashMap: "+ numbersLH3);

        System.out.println("+==================+");
        System.out.println("NumberLH3: "+ numbersLH3);

        //using get()
        int value22 = numbersLH3.get("Three");
        System.out.println("Returned number: "+ value22);

        //remove() method single parameter
        int value33 = numbersLH3.remove("Four");
        System.out.println("Removed value: "+ value33);

        //remove() method with two parameter
        boolean value44 = numbersLH3.remove("Three",3);
        System.out.println("is the entry three removed?: "+ value44);




        //Differences Between HashMap and WeakHashMap
        WeakHashMap<String,Integer> number55 = new WeakHashMap<>();
        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        number55.put(two, twoValue);
        number55.put(four, fourValue);
        System.out.println("WeakHashMap: " + number55);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection: " + number55);

        //creating a HashMap
        HashMap<String,Integer> num55 = new HashMap<>();
        String two2 = new String("Twoo");
        Integer two2Value = 2;
        String four2 = new String("Fourr");
        Integer four2Value = 4;

        //Add elements
        num55.put(two2,two2Value);
        num55.put(four2,four2Value);
        System.out.println("HashMap: "+ num55);

        //make the reference null
        two2 = null;

        //perform garbage collection
        System.gc();

        System.out.println("HashMap after garbage collection: "+ num55);

        //Creating WeakHashMap from Other Maps
        //creating a HashMap
        HashMap<String,Integer> evenNum = new HashMap<>();
        String one = new String("One");
        Integer oneValue = 1;
        evenNum.put(one,oneValue);
        System.out.println("HashMap of evenNum: "+ evenNum);

        //creating a WeakHashMap from other HashMap
        WeakHashMap<String,Integer> evenNum2 = new WeakHashMap<>(evenNum);
        String eleven = new String("Eleven");
        Integer elevenValue = 11;

        evenNum2.put(eleven,elevenValue);
        System.out.println("WeakHashMap: "+ evenNum2);

        //using putifAbsent
        String fourty = new String("Fourty");
        Integer fourtyValue = 40;

        evenNum2.putIfAbsent(fourty,fourtyValue);
        System.out.println("WeakHashMap of evenNum2: "+ evenNum2);

        //Creating a WeakHashMap
        WeakHashMap<String,Integer> evenNum33 = new WeakHashMap<>();
        String five = new String("Five");
        Integer fiveValue = 5;
        evenNum33.put(five,fiveValue);

        //using putAll()
        evenNum33.putAll(evenNum2);
        System.out.println("Weak?HashMap of evenNum33: "+ evenNum33);

        //Access WeakHashMap elements
       //using entrySet()
        System.out.println("Key/Value mappings: "+ evenNum33.entrySet());

        //using keySet()
        System.out.println("Keys: "+ evenNum33.keySet());

        //using values()
        System.out.println("Values: "+ evenNum33.values());

        //using get() and getordefault()
        //using get()
        int value40 = evenNum33.get("Fourty");
        System.out.println("Value in Fourty: "+ value40);
        System.out.println("Using get(): "+ evenNum33.get("One"));

        //using getordefault()
        int value00 = evenNum33.getOrDefault("Ten",10);
        System.out.println("Using getorDefault: " + value00);

        //Remove WeakHashMap Elements
        //creating a WeakHashMap of oddNum
        WeakHashMap<String,Integer> oddNum = new WeakHashMap<>();

        String seven = new String("Seven");
        Integer sevenValue = 7;
        String nine = new String("Nine");
        Integer nineValue = 9;

        oddNum.put(seven,sevenValue);
        oddNum.put(nine,nineValue);
        System.out.println("OddNum: "+ oddNum);

        //using remove with single parameter
        int value7 = oddNum.remove(seven);
        System.out.println("Value on seven: "+ value7);
        System.out.println("OddNum: "+ oddNum);

        //using remove with two parameters
        boolean result9 = oddNum.remove(nine,19);
        System.out.println("Is the entry {nine=9} is removed: "+ result9);
        System.out.println("OddNum Now: "+ oddNum);

        //isEmpty()
        boolean result2 = oddNum.isEmpty();
        System.out.println("Is oddNum is empty: "+ result2);

        //clear()
         oddNum.clear();
        System.out.println("oddNum: "+ oddNum);


        //TreeMap
        //creating a TeaMap of M
        TreeMap<String,Integer> M = new TreeMap<>();

        //using put()
        M.put("Two",2);
        M.put("Four",4);

        //using ifAbsent
        M.putIfAbsent("Six",6);
        System.out.println("TreeMap of M: "+ M);

        //creating TreeMap of N
        TreeMap<String,Integer> N = new TreeMap<>();
        N.put("One",1);

        //using putall
        N.putAll(M);
        System.out.println("TreeMap Of N: "+ N);

        //using replace
        N.replace("Four",40);
        N.replace("One",10);
        System.out.println("TreeMap of N after replace(): "+ N);

        //using replaceAll()
        N.replaceAll((k,v)-> v +2);
        System.out.println("TreeMap value of N after replaceAll(): "+ N);

        //using firstkey() method
        String firstkey = N.firstKey();
        System.out.println("FirstKey of N: "+ firstkey);

        //using the lastkey method
        String lastkey = N.lastKey();
        System.out.println("LastKey of N: "+ lastkey);

        //using the firstentry()
        System.out.println("First Entry: "+ N.firstEntry());

        //using lastentry()
        System.out.println("Last Entry: "+ N.lastEntry());

        TreeMap<String,Integer> p = new TreeMap<>();
        p.put("One",1);
        p.put("Two",2);
        p.put("Three",3);
        p.put("Four",4);
        System.out.println("TreeMap of p: "+ p);

        //using higher()
        System.out.println("using higherkey(): "+ p.higherKey("Four"));

        TreeMap<String,Integer> q = new TreeMap<>();
        q.put("First",1);
        q.put("Second",5);
        q.put("Third",4);
        q.put("Fourth",6);
        System.out.println("TreeMap od q: "+ q);
        System.out.println("using higherkey(): "+ q.higherKey("Third"));

        //pollFirtstEntry
        System.out.println("treemap of q: "+ q);

        System.out.println("Using pollFirstEntry: "+ q.pollFirstEntry());
        System.out.println("Using pollLastEntry: " + q.pollLastEntry());
        System.out.println(q);

        TreeMap<String,Integer> r = new TreeMap<>();
        r.put("First",1);
        r.put("Second",2);
        r.put("Third",3);
        r.put("Fourth",4);
        System.out.println("TreeMap of r: "+ r);

        System.out.println("/n using headMap() method: ");
        //using headMap() with default boolean value
        System.out.println("without boolean value: "+ r.headMap("Fourth"));
        //using headMap() with specified boolean value
        System.out.println("with boolean value: "+ r.headMap("Fourth",true));

        //tailMap(key, booleanValue)
        //using tailMap() with default boolean value
        System.out.println("without boolean value : "+ r.tailMap("Foruth") );
        //uisng tailMap() with specified boolean value
        System.out.println("With specified boolean value: "+ r.tailMap("Fourth",false));

        //subMap(k1, bV1, k2, bV2)
        System.out.println("/nUsing SubMap() Method: ");
        //using submap() with default boolean value
        System.out.println("without boolean value: "+ r.subMap("Fourth","Third"));
        //using submap() with specified boolean value
        System.out.println("using boolean value: "+ r.subMap("Fourth",false,"Third",true));
      //clone()
        System.out.println("The copy of the treemap: "+ r.clone() );

        //TreeMap Comparator
        //creating a treemap with customized comparator
        TreeMap<String, Integer> numbers20 = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);
    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String number1, String number2) {
            int value =  number1.compareTo(number2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }


















    }


}
