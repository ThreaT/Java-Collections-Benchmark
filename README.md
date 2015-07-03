#### Summary

* **Lists**: LinkedLists for creates, ArrayLists for reads, Stacks for updates and deletes (never use LinkedList for deletes). 
* **Maps**: HashMap for creates and deletes, LinkedHashMap for reads and updates.
* **Sets**: HashSet for creates, updates and deletes, LinkedHashSet for reads.
* **All**: LinkedList for creates, ArrayList for reads, LinkedHashMap for updates and HashMap for deletes

#### Lists

```
-------------------------------------------------
ArrayList create 1 million execution time: 22ms. Current size: 1000000
Stack create 1 million execution time: 36ms. Current size: 1000000
LinkedList create 1 million execution time: 87ms. Current size: 1000000
-------------------------------------------------
ArrayList create 10 million execution time: 2576ms. Current size: 10000000
Stack create 10 million execution time: 2198ms. Current size: 10000000
LinkedList create 10 million execution time: 1499ms. Current size: 10000000
-------------------------------------------------
ArrayList read 1 million execution time: 12ms. Last value: "999999"
Stack read 1 million execution time: 26ms. Last value: "999999"
LinkedList read 1 million execution time: 17ms. Last value: "999999"
-------------------------------------------------
ArrayList read 10 million execution time: 28ms. Last value: "9999999"
Stack read 10 million execution time: 211ms. Last value: "9999999"
LinkedList read 10 million execution time: 94ms. Last value: "9999999"
-------------------------------------------------
ArrayList update 1 million execution time: 24ms. Last updated value: "1000000"
Stack update 1 million execution time: 38ms. Last updated value: "1000000"
LinkedList update 1 million execution time: 27ms. Last updated value: "1000000"
-------------------------------------------------
ArrayList update 10 million execution time: 4208ms. Last updated value: "10000000"
Stack update 10 million execution time: 494ms. Last updated value: "10000000"
LinkedList update 10 million execution time: 520ms. Last updated value: "10000000"
-------------------------------------------------
ArrayList delete 1 million execution time: 46340ms. Current size: 500000
Stack delete 1 million execution time: 47011ms. Current size: 500000
LinkedList delete 1 million execution time: 587331ms. Current size: 500000
-------------------------------------------------
ArrayList delete 10 million execution time: 9902852ms. Current size: 5000000
Stack delete 10 million execution time: 9643507ms. Current size: 5000000
LinkedList delete 10 million execution time: ??ms. Current size: ??
```

#### Maps

```
-------------------------------------------------
HashMap create 1 million execution time: 92ms. Current size: 1000000
TreeMap create 1 million execution time: 177ms. Current size: 1000000
LinkedHashMap create 1 million execution time: 482ms. Current size: 1000000
-------------------------------------------------
HashMap create 10 million execution time: 2901ms. Current size: 10000000
TreeMap create 10 million execution time: 6005ms. Current size: 10000000
LinkedHashMap create 10 million execution time: 7020ms. Current size: 10000000
-------------------------------------------------
HashMap read 1 million execution time: 19ms. Last value: "temp value"
TreeMap read 1 million execution time: 80ms. Last value: "temp value"
LinkedHashMap read 1 million execution time: 19ms. Last value: "temp value"
-------------------------------------------------
HashMap read 10 million execution time: 679ms. Last value: "temp value"
TreeMap read 10 million execution time: 1110ms. Last value: "temp value"
LinkedHashMap read 10 million execution time: 105ms. Last value: "temp value"
-------------------------------------------------
HashMap update 1 million execution time: 38ms. Last updated value: "updated temp value"
TreeMap update 1 million execution time: 175ms. Last updated value: "updated temp value"
LinkedHashMap update 1 million execution time: 36ms. Last updated value: "updated temp value"
-------------------------------------------------
HashMap update 10 million execution time: 377ms. Last updated value: "updated temp value"
TreeMap update 10 million execution time: 1841ms. Last updated value: "updated temp value"
LinkedHashMap update 10 million execution time: 323ms. Last updated value: "updated temp value"
-------------------------------------------------
HashMap delete 1 million execution time: 21ms. Current size: 0
TreeMap delete 1 million execution time: 81ms. Current size: 0
LinkedHashMap delete 1 million execution time: 25ms. Current size: 0
-------------------------------------------------
HashMap delete 10 million execution time: 237ms. Current size: 0
TreeMap delete 10 million execution time: 711ms. Current size: 0
LinkedHashMap delete 10 million execution time: 239ms. Current size: 0
-------------------------------------------------
```

#### Sets

```
-------------------------------------------------
HashSet create 1 million execution time: 118ms. Current size: 1000000
TreeSet create 1 million execution time: 179ms. Current size: 1000000
LinkedHashSet create 1 million execution time: 547ms. Current size: 1000000
-------------------------------------------------
HashSet create 10 million execution time: 2869ms. Current size: 10000000
TreeSet create 10 million execution time: 6265ms. Current size: 10000000
LinkedHashSet create 10 million execution time: 2847ms. Current size: 10000000
-------------------------------------------------
HashSet read 1 million execution time: 18ms. Last value: "999984"
TreeSet read 1 million execution time: 16ms. Last value: "999999"
LinkedHashSet read 1 million execution time: 17ms. Last value: "999999"
-------------------------------------------------
HashSet read 10 million execution time: 68ms. Last value: "9999975"
TreeSet read 10 million execution time: 88ms. Last value: "9999999"
LinkedHashSet read 10 million execution time: 66ms. Last value: "9999999"
-------------------------------------------------
HashSet update 1 million execution time: 386ms. Last updated value: "1000000"
TreeSet update 1 million execution time: 199ms. Last updated value: "1000000"
LinkedHashSet update 1 million execution time: 4230ms. Last updated value: "1000000"
-------------------------------------------------
HashSet update 10 million execution time: 782ms. Last updated value: "10000000"
TreeSet update 10 million execution time: 8642ms. Last updated value: "10000000"
LinkedHashSet update 10 million execution time: 4304ms. Last updated value: "10000000"
-------------------------------------------------
HashSet delete 1 million execution time: 22ms. Current size: 0
TreeSet delete 1 million execution time: 80ms. Current size: 0
LinkedHashSet delete 1 million execution time: 23ms. Current size: 0
-------------------------------------------------
HashSet delete 10 million execution time: 321ms. Current size: 0
TreeSet delete 10 million execution time: 628ms. Current size: 0
LinkedHashSet delete 10 million execution time: 1594ms. Current size: 0
-------------------------------------------------
```
