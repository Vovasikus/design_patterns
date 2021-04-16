package interpreter;

public abstract class OperatorExpression implements Expression{
    public Expression left;
    public Expression right;

    @Override
    public void interpret(Context context) {
        left.interpret(context);
        String leftValue = context.result.pop();

        right.interpret(context);
        String rightValue = context.result.pop();

        doInterpret(context, leftValue, rightValue);
    }

    protected abstract void doInterpret(Context context, String leftValue, String rightValue);
}
