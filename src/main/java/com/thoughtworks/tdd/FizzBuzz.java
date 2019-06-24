package com.thoughtworks.tdd;

public class FizzBuzz {

    public void action() {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    public String fizzBuzz(int id) {
        if (id % 3 != 0 && id % 5 != 0 && id % 7 != 0) {
            return "" + id;
        } else {
            String result = "";
            if (id % 3 == 0) {
                result += "Fizz";
            }
            if (id % 5 == 0) {
                result += "Buzz";
            }
            if (id % 7 == 0) {
                result += "Whizz";
            }
            return result;
        }
    }

}
