package com.caysever.core

class AssertG {

    static NumberAssertion assertion(Number arg) {
        return new NumberAssertion(arg)
    }

    static Assertion assertion(String arg) {
        return new StringAssertion(arg)
    }
}