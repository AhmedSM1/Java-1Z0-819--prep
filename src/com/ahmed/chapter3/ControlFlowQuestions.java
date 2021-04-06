package com.ahmed.chapter3;

public class ControlFlowQuestions {
    //TODO Switch expressions must be one of those type:
    // - String
    // - enum
    // - int
    // - char
    // - byte
    // - short
    // - var if it can be resolved to one of the previous types


    //for-each loop is determined and you can only start from first element


    public static void main(String[] args) {
        System.out.println("Question 2 ");
        controlFlowQuestion2();
        System.out.println("Question 3 ");

        controlFlowQuestion3();
        System.out.println("Question 8 ");
        controlFlowQuestion8();
        System.out.println("\n Question 18 ");
        controlFlowQuestion18();
        System.out.println("Question 22 ");
        controlFlowQuestion22();
    }



    private static  void  controlFlowQuestion2(){
        var gas = true;
        do {
            System.out.println("helium") ;

            // exclusiveOR True ^ True = False



            gas = gas ^ gas;
            gas = !gas;
        }while (!gas);

        // do must have { not (
//        do (
//        System.out.println("helium") ;
//        gas = gas ^ gas;
//        gas = !gas;
//        ) while (!gas);
    }


    private static  void  controlFlowQuestion3(){
//        int m = 0, n = 0;
//        while (m < 5) {
//            n++;
//            if (m == 3)
//                continue;
//
//            switch (m) {
//                case 0:
//                case 1:
//                    n++;
//                default:
//                    n++;
//            }
//            m++;
//        }
//        System.out.println(m + " " + n);
    }


    private static  void  controlFlowQuestion8(){

        //Brackets issue answer it doesnt compile
        var plan = 1;
        plan = plan++ + --plan;
        if(plan==1) {
            System.out.print("Plan A");
        } else {
            if(plan==2) System.out.print("Plan B");
         else System.out.print("Plan C"); }
    }

    private static void controlFlowQuestion14(){
        int colorOfRainbow = 10;

        //value of case statement must be a constant,literal or final
        //default case is optional in switch expressions
//        final int red = 5;
//        LOOP: do{
//
//
//        }while (red > 1);
//        continue LOOP;
//        switch(colorOfRainbow) {
//            default:
//                System.out.print("Home");
//                break;
//            case red:
//                System.out.print("Away");
//        }
    }



    private static void controlFlowQuestion18(){
//        for ( ;  ;) {
//            System.out.println("infinite loop");
//        }

    }

    private static void controlFlowQuestion22(){
        boolean balloonInflated = false;
        do {
            // the curly brackets inside if must be true
            // the curly brackets inside while is different  while (if (balloonInflated = false) )
            if (! balloonInflated) {
                balloonInflated = true;
                System.out.print("inflate-");
            }
        } while (! balloonInflated);
        System.out.println("done");
    }
    enum Season { SPRING, SUMMER, WINTER }
    private static void controlFlowQuestion(Season s){
//            switch (s) {
//                default:
//                case WINTER: return 30;
//                case SPRING:
//            }
    }


}




