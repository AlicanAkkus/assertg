package com.caysever.core

class StringAssertion extends Assertion {

    String string

    StringAssertion(String string) {
        this.string = string
    }

    boolean eq(String string) {
        this.string == string
    }
}