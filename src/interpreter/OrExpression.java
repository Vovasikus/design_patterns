package interpreter;

public class OrExpression extends OperatorExpression{

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    protected void doInterpret(Context context, String leftValue, String rightValue) {
        context.result.push(leftValue == "true" || rightValue == "true" ? "true" : "false");
    }
}
