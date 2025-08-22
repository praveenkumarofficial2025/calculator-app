public class CalculatorApp {

    public static void main(String[] args) {

        if(args!=null && args.length==3){

            String calType = args[0];
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);
            int reult = 0;

            if(calType.equals("+"))
                reult= Addition.cal(x,y);

            else if (calType.equals("-")) {
                reult= Substraction.cal(x,y);
            }
            else if (calType.equals("*")) {
                reult= Multiplication.cal(x,y);
            }

            System.out.println("result="+reult);

        }
    }
}
