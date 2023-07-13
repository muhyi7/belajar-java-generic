package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Eko");
//        doIt(stringMyData);
//        MyData<Object> objectMyData = stringMyData;

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData;

//        doItinteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData){
        //do nothing
    }
    public static void doItinteger(MyData<Integer> obIntegerMyData){
        //do nothing
    }
}
