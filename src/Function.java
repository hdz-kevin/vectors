import org.matheclipse.core.eval.ExprEvaluator;

class Function {

    public static void main(String[] args) {
        
        ExprEvaluator evaluator = new ExprEvaluator();

        String function = "x^2 + 3*x";
        String var = "x";
    
        String derivative = evaluator.eval("D[" + function + ", " + var + "]").toString();
        System.out.println(derivative);

        int time = 2;
        String evaluated = evaluator.eval(function.replace("x", "(" + time + ")")).toString();
        System.out.println(evaluated);

        Double.valueOf(evaluated)
    }
    
}
