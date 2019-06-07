package com.caysever.core

import spock.lang.Specification

import static com.caysever.core.AssertG.assertion

class NumberAssertionTest extends Specification {

    void "should assert numbers"() {
        expect:
        assertion(actual)."$assertion"(expected)

        where:
        actual                   | expected                 | assertion
        123                      | 123                      | "eq"
        0                        | 0                        | "eq"
        -123                     | -123                     | "eq"
        -123                     | -123                     | "isEqualTo"
        BigDecimal.valueOf(9.99) | BigDecimal.valueOf(9.99) | "isEqualTo"
        BigDecimal.valueOf(9.99) | BigDecimal.valueOf(9.98) | "neq"
        BigDecimal.valueOf(9.99) | BigDecimal.valueOf(9.97) | "isNotEqualTo"
        369                      | 368                      | "gte"
        369                      | 368                      | "isGreaterThan"
        BigDecimal.valueOf(10.1) | BigDecimal.valueOf(10.0) | "isGreaterThan"
        369                      | 369                      | "gte"
        368                      | 369                      | "lte"
        368                      | 368                      | "lte"
        368                      | 368                      | "isLessThanOrEqualTo"
        368                      | [367, 369]               | "btw"
        368                      | [367, 369]               | "isBetween"
    }

    void "should assert numbers with no arg"() {
        expect:
        assertion(actual)."$assertion"()

        where:
        actual | assertion
        368    | "pos"
        368    | "isPositive"
        -368   | "npos"
        -368   | "isNotPositive"
        -368   | "neg"
        368    | "nneg"
        -368   | "isNegative"
        368    | "isNotNegative"
        0      | "zero"
        0      | "isZero"
        1      | "one"
        1      | "isOne"
        -1     | "isNotOne"
    }
}