package interpreter;

public class EqualsExpression extends OperatorExpression{

    public EqualsExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    protected void doInterpret(Context context, String leftValue, String rightValue) {
        context.result.push(leftValue == rightValue ? "true" : "false");
    }
}
