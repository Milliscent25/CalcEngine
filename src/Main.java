
public class Main {
    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch (opCode){
            case 'a' :
                result = value1 + value2;
                break;
            case 's' :
                result = value1 - value2;
                break;
            case 'm' :
                result = value1 * value2;
                break;
            case 'd' :
                result = value2 != 0 ? value1 / value2 : 0.0d;
//                if(value2 != 0)
//                result = value1 / value2;
                break;
            default:
            System.out.println("Invalid opCode: " + opCode );
            result = 0.0d;

        }
//        if(opCode == 'a')
//            result = value1 + value2;
//        else if(opCode == 's')
//            result = value1 - value2;
//        else if(opCode == 'm')
//            result = value1 * value2;
//        else if(opCode == 'd'){
//            if (value2 != 0)
//                result = value1 / value2;
//        }
//
//        else {
//            System.out.println("Invalid opCode: " + opCode );
//            result = 0.0d;
//        }

        System.out.println(result);
    }



}
//      double value1;
//      double value2;
//      double result;
//      char opCode = 0;
//
//      switch (opCode == 'a'){
//          result = value1 + value2;
//
//          case (opCode == 's'):
//           result = value1 - value2;
//        break;
//          case (opCode == 'm'):
//            result = value1 * value2;
//              break;
//          case (opCode == 'd'):
//              result = value1 / value2;
//              break;
//          case
//          result = 0.0d;
//
//          System.out.println(result);
//        }
//        switch {
//            case : opCode = 'a';
//                result = value1 + value2;
//                break;
//            case : opCode = 's';
//                System.out.println("value1 - value2;");
//                break;
//            case : opCode = 'a';
//                System.out.println("value1 * value2");
//            case : opCode = 'a';
//                System.out.println("value1 / value2");
//                break;
//            default :
//                System.out.println("0.0d");
//        }
//        System.out.println(" result ");
//
//        int a = 10;
//        while (a >= 1){
//            System.out.println(a);
//            a--;
//        }


        /* Arrays*/
//        int[] array = new int[]{1, 2 , 3, 4 };
//        for (int i = 0; i < 4; i++){
//            System.out.println(array[i]);
//        }
