package com.caysever.core

class StringAssertion extends Assertion {

    String string

    StringAssertion(String string) {
        this.string = string
    }

    StringAssertion eq(String string) {
        assert this.string == string
        this
    }

    StringAssertion size(Integer size) {
        assert nn() && this.string.length() == size
        this
    }

    StringAssertion starts(String s) {
        assert this.string.startsWith(s)
        this
    }

    StringAssertion ends(String s) {
        assert this.string.endsWith(s)
        this
    }

    StringAssertion contains(String s) {
        assert this.string.contains(s)
        this
    }

    StringAssertion contains(List<String> strings) {
        assert strings.any { it -> this.string.contains(it) }
        this
    }

    StringAssertion notContains(String s) {
        assert (!this.string.contains(s))
        this
    }

    StringAssertion notContains(List<String> strings) {
        assert (!strings.any { it -> this.string.contains(it) })
        this
    }

    StringAssertion nn() {
        assert this.string != null
        this
    }

    StringAssertion isNotNull() {
        assert nn()
        this
    }

    StringAssertion isNull() {
        assert this.string == null
        this
    }

    StringAssertion isEmpty() {
        assert nn() && this.string.length() == 0
        this
    }

    StringAssertion isNotEmpty() {
        assert nn() && this.string.length() > 0
        this
    }

    StringAssertion isBlank() {
        assert nn() && this.string.replace(" ", "").length() == 0
        this
    }

    StringAssertion isNotBlank() {
        assert nn() && this.string.replace(" ", "").length() > 0
        this
    }
}