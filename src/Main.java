
public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.d, 25.0, 225.0d,11.0d};
        double[] rightVals = {50.0d, 92.0, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
//        array variables

//        double value1 = 100.0d;
//        double value2 = 0.0d;
//        double result = 0.0d;
//        char opCode[i] = 'd';

        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {

                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : results)

                System.out.println(currentResult);
        } else if(args.length == 3)
            handleCommandline(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");
    }

    private static void handleCommandline(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);



    }
/* execute method knows how to do the work and perform an operation */
    static double execute(char opCode, double leftVal, double rightVal){
        double result;

        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
//                if(value2 != 0)
//                    result = value1 / value2;

            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
       return result;
    }

}


/*           switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
               if(value2 != 0)
               result = value1 / value2;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    results[i] = 0.0d;
                    break;
            }

  */


//  if(opCode == 'a')
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

        /* Arrays*/
//        int[] array = new int[]{1, 2 , 3, 4 };
//        for (int i = 0; i < 4; i++){
//            System.out.println(array[i]);
//        }
