package com.javacourse.se.lesson11;

public class OperatorSwitch {
    final int Value = 2, Fv = 1, Sv = 2, Tv = 3;

   public void foo() {
       /* switch (52){
            case 40:
                System.out.println(48);
                break;
            case 22:
                System.out.println(22);
                break;
            case 28:
                System.out.println(40);
                break;
            default:
                System.out.println("Not found a nice ass, too bad :(");
        }*/

        switch (Value) {
            case Fv:
                System.out.println(Fv);
                break;
            case Sv:
                System.out.println(Sv);
                break;
            case Tv:
                System.out.println(Tv);
                break;
            default:
                System.out.println("Default");


        }
    }
}
