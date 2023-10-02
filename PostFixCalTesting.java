
public class PostFixCalTesting {

    public double precision(IStack stack, IPostFixCal calculator) {
        double correctCount = 0;
        
        if(calculator.calculate(stack, "12+3*") == 9) {
            correctCount++;
        }
        
        if(calculator.calculate(stack, "12/3*") == 1.5) {
            correctCount++;
        }
        
        if(calculator.calculate(stack, "12-3*") == -3) {
            correctCount++;
        }
        
        if(calculator.calculate(stack, "45*3+") == 23) {
            correctCount++;
        }
        
        if(calculator.calculate(stack, "47-3*") == -9) {
            correctCount++;
        }
        
        return correctCount/5;
    }
}
