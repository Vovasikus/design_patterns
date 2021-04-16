package interpreter;

public class MyExpression implements Expression{
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        context.result.push(value);
    }
}
