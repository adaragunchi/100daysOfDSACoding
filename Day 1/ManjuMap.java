package com.test.Testing;

public class ManjuMap {
    int initialCapacity=10;
    Entry[] table=new Entry[initialCapacity];

    public String get(String key){
        int buckeLocation=Math.abs(key.hashCode()%initialCapacity);
        Entry e=table[buckeLocation];
        while(e!=null){
            if(e.key.equals(key)){
                return e.value;
            }
            e=e.next;
        }
        return null;
    }

    public void put(String key,String value){
        int bucketLocation=Math.abs(key.hashCode()%initialCapacity);
        Entry e=table[bucketLocation];
        if(e!=null){
            //If we have same key
            if(e.key.equals(key)){
                e.value=value;
            }else{

                // if we have same hashcode then need to insert at the end of the list
                while (e.next!=null){
                    e=e.next;
                }
                Entry oldEntry=new Entry(key,value);
                e.next=oldEntry;
            }
        }else{

            //create the new location and store the values
            Entry newValue=new Entry(key,value);
            table[bucketLocation]=newValue;
        }

    }


    public static void main(String[] args) {
        ManjuMap manjuMap=new ManjuMap();
        manjuMap.put("Manju","S");
        manjuMap.put("John","A");

        String value=manjuMap.get("Manju");
        System.out.println(value);
    }
}
