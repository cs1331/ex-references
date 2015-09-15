public class NumberClass {

    // Do not use public class members like this! This is BAD. We are doing it
    // here just for demonstration purposes, for clarity and simplicity of the
    // demo. Doing this for real is very bad. Do NOT do it. Just don't.
    // Plus CHECKSTYLE will mark it wrong and you'll lose points...
    public int num;

    public NumberClass(int value) {
        num = value;
    }

    public String toString() {
        return String.valueOf(num);
    }
}
