package interpreter;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        MyExpression input = new MyExpression();

        MyExpression right = new MyExpression();

        input.setValue("четыре");
        right.setValue("4");
        Expression leftEqualsExpression = new EqualsExpression(input, right);

        right.setValue("четыре");
        Expression rightEqualsExpression = new EqualsExpression(input, right);

        Expression expression = new OrExpression(leftEqualsExpression, rightEqualsExpression);

        expression.interpret(context);
        System.out.println(context.result.pop());


        input.setValue("44");
        right.setValue("4");
        leftEqualsExpression = new EqualsExpression(input, right);

        right.setValue("четыре");
        rightEqualsExpression = new EqualsExpression(input, right);

        expression = new OrExpression(leftEqualsExpression, rightEqualsExpression);

        expression.interpret(context);
        System.out.println(context.result.pop());

    }
}
