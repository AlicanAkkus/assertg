package com.caysever.core

class NumberAssertion extends Assertion {

    Number ZERO = 0
    Number ONE = 1
    Number number

    NumberAssertion(Number number) {
        this.number = number
    }

    boolean eq(Number expected) {
        this.number == expected
    }

    boolean isEqualTo(Number expected) {
        eq(expected)
    }

    boolean neq(Number expected) {
        !eq(expected)
    }

    boolean isNotEqualTo(Number expected) {
        !isEqualTo(expected)
    }

    boolean lt(Number expected) {
        this.number < expected
    }

    boolean isLessThan(Number expected) {
        lt(expected)
    }

    boolean lte(Number expected) {
        this.number <= expected
    }

    boolean isLessThanOrEqualTo(Number expected) {
        lte(expected)
    }

    boolean gt(Number expected) {
        this.number > expected
    }

    boolean isGreaterThan(Number expected) {
        gt(expected)
    }

    boolean gte(Number expected) {
        this.number >= expected
    }

    boolean isGreaterThanOrEqualTo(Number expected) {
        gte(expected)
    }

    boolean btw(Number start, Number end) {
        gte(start) && lte(end)
    }

    boolean isBetween(Number start, Number end) {
        btw(start, end)
    }

    boolean pos() {
        this.number > ZERO
    }

    boolean npos() {
        !pos()
    }

    boolean isPositive() {
        pos()
    }

    boolean isNotPositive() {
        npos()
    }

    boolean neg() {
        this.number < ZERO
    }

    boolean nneg() {
        !neg()
    }

    boolean isNegative() {
        neg()
    }

    boolean isNotNegative() {
        nneg()
    }

    boolean zero() {
        this.number == ZERO
    }

    boolean isZero() {
        zero()
    }

    boolean one() {
        this.number == ONE
    }

    boolean isOne() {
        one()
    }

    boolean isNotOne() {
        !one()
    }
}