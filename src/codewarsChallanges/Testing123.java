package codewarsChallanges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Testing123 {

    public static void main(String[] args) {
        List<String> lines = new ArrayList();
            lines.add("a");
            lines.add("b");
            lines.add("c");

        Iterator iterator = lines.iterator();

//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for(int i=1; i<=lines.size(); i++){
            System.out.println(i+": "+ iterator.next());
        }



        //System.out.println(lines);

    }
}
