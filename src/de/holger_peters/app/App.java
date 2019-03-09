package de.holger_peters.app;

import de.holger_peters.mylib.Adder;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import com.google.common.primitives.Ints;

public class App {
    public static void main(String[] args) {
        Range<Integer> range1 = Range.closed(0, 9);
        System.out.print("[0,9] : ");
        printRange(range1);

        System.out.println("Hello World");
    }

    private static void printRange(Range<Integer> range) {

        System.out.print("[ ");

        final Adder adder = new Adder(10);

        for (int grade : ContiguousSet.create(range, DiscreteDomain.integers())) {
            System.out.print(adder.add(grade) + " ");
        }
        System.out.println("]");
    }
}
