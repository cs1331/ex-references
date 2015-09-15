public class References {

    private static final int STARTING_VALUE = 42;

    public static void main(String[] args) {
        // 0. First let's look at how values normally change.
        modifyValuesNormally();

        // 1. What happens if we modify copies?
        //modifyCopies();

        // 2. What happens if we modify method arguments?
        //modifyInMethod();

        // 3. What happens if we modify array elements in a standard for loop?
        //modifyInForLoop();

        // 4. What happens if we modify array elements in a for-each loop?
        //modifyInForEachLoop();
    }

    private static void modifyValuesNormally() {
        System.out.println("Modifying values normally...");

        int basic = STARTING_VALUE;
        NumberClass reference = new NumberClass(STARTING_VALUE);

        System.out.println("Before: basic type = " + basic
                + ", object reference = " + reference);

        ++basic;
        ++reference.num;

        System.out.println("After: basic type = " + basic
                + ", object reference = " + reference);
    }

    private static void modifyCopies() {
        System.out.println("Modifying copies...");

        int basic = STARTING_VALUE;
        NumberClass reference = new NumberClass(STARTING_VALUE);

        int basicCopy = basic;
        NumberClass referenceCopy = reference;

        System.out.println("Before: basic type = " + basic
                + ", object reference = " + reference);

        ++basicCopy;
        ++referenceCopy.num;

        System.out.println("After: basic type = " + basic
                + ", object reference = " + reference);
    }

    private static void modifyInMethod() {
        System.out.println("Modifying arguments of a method call...");

        int basic = STARTING_VALUE;
        NumberClass reference = new NumberClass(STARTING_VALUE);

        System.out.println("Before: basic type = " + basic
                + ", object reference = " + reference);

        modifyArguments(basic, reference);

        System.out.println("After: basic type = " + basic
                + ", object reference = " + reference);
    }

    private static void modifyArguments(int basicArg,
                                        NumberClass referenceArg) {
        ++basicArg;
        ++referenceArg.num;
    }

    private static void modifyInForLoop() {
        System.out.println("Modifying values inside a for loop...");
        int[] basic = {STARTING_VALUE};
        NumberClass[] reference = {new NumberClass(STARTING_VALUE)};

        System.out.println("Before: basic type = " + basic[0]
                + ", object reference = " + reference[0]);

        for (int i = 0; i < 1; ++i) {
            ++basic[i];
            ++reference[i].num;
        }

        System.out.println("After: basic type = " + basic[0]
                + ", object reference = " + reference[0]);
    }

    private static void modifyInForEachLoop() {
        System.out.println("Modifying values inside a for-each loop...");
        int[] basic = {STARTING_VALUE};
        NumberClass[] reference = {new NumberClass(STARTING_VALUE)};

        System.out.println("Before: basic type = " + basic[0]
                + ", object reference = " + reference[0]);

        for (int value: basic) {
            ++value;
        }
        for (NumberClass value: reference) {
            ++value.num;
        }

        System.out.println("After: basic type = " + basic[0]
                + ", object reference = " + reference[0]);
    }
}
