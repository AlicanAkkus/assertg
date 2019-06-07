package com.caysever.core

import spock.lang.Specification

class StringAssertionTest extends Specification {

    void "should assert strings"() {
        expect:
        new StringAssertion(actual)."$assertion"(expected)

        where:
        actual   | expected       | assertion
        "alican" | "alican"       | "eq"
        "alican" | 6              | "size"
        "alican" | "ali"          | "starts"
        "alican" | "can"          | "ends"
        "alican" | "ali"          | "contains"
        "alican" | "akkus"        | "notContains"
        "alican" | ["ali", "can"] | "contains"
        "alican" | ["cay", "akk"] | "notContains"
    }

    void "should assert strings with no arg"() {
        expect:
        new StringAssertion(actual)."$assertion"()

        where:
        actual     | assertion
        "alican"   | "nn"
        "alican"   | "isNotNull"
        null       | "isNull"
        ""         | "isEmpty"
        " alican " | "isNotEmpty"
        "  "       | "isBlank"
        " alican " | "isNotBlank"
    }

    void "should assert strings with chain"() {
        given:
        def name = "alican"

        when:
        def assertion = new StringAssertion(name)

        then:
        assertion.isNotBlank()
                .isNotEmpty()
                .size(6)
                .eq("alican")
                .starts("ali")
    }
}