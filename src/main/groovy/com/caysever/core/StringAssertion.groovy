package com.caysever.core

class StringAssertion extends Assertion {

    String string

    StringAssertion(String string) {
        this.string = string
    }

    boolean eq(String string) {
        this.string == string
    }

    boolean size(Integer size) {
        this.string.length() == size
    }

    boolean starts(String s) {
        this.string.startsWith(s)
    }

    boolean ends(String s) {
        this.string.endsWith(s)
    }

    boolean contains(String s) {
        this.string.contains(s)
    }

    boolean contains(List<String> strings) {
        strings.any { it -> this.string.contains(it) }
    }

    boolean notContains(String s) {
        !contains(s)
    }

    boolean notContains(List<String> strings) {
        !contains(strings)
    }

    boolean nn() {
        this.string != null
    }

    boolean isNotNull() {
        nn()
    }

    boolean isNull() {
        !nn()
    }

    boolean isEmpty() {
        nn() && this.string.length() == 0
    }

    boolean isNotEmpty() {
        nn() && this.string.length() > 0
    }

    boolean isBlank() {
        nn() && this.string.replace(" ", "").length() == 0
    }

    boolean isNotBlank() {
        nn() && this.string.replace(" ", "").length() > 0
    }
}