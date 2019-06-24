package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = spy(new FizzBuzz());
    }

    @Test
    void should_call_fizzBuzz_120_times() {
        this.fizzBuzz.action();

        verify(this.fizzBuzz, times(120)).fizzBuzz(anyInt());
    }

    @Test
    void should_return_id_if_not_divide_by_3_5_7() {
        assertEquals("2", this.fizzBuzz.fizzBuzz(2));
    }

    @Test
    void should_return_Fizz_if_divide_by_3_but_not_divide_by_5_7() {
        assertEquals("Fizz", this.fizzBuzz.fizzBuzz(6));
    }

    @Test
    void should_return_Fizz_if_divide_by_5_but_not_divide_by_3_7() {
        assertEquals("Buzz", this.fizzBuzz.fizzBuzz(10));
    }

    @Test
    void should_return_Fizz_if_divide_by_7_but_not_divide_by_3_5() {
        assertEquals("Whizz", this.fizzBuzz.fizzBuzz(14));
    }

    @Test
    void should_return_Fizz_if_divide_by_3_5_but_not_divide_by_7() {
        assertEquals("FizzBuzz", this.fizzBuzz.fizzBuzz(15));
    }

    @Test
    void should_return_Fizz_if_divide_by_3_7_but_not_divide_by_5() {
        assertEquals("FizzWhizz", this.fizzBuzz.fizzBuzz(21));
    }

    @Test
    void should_return_Fizz_if_divide_by_5_7_but_not_divide_by_3() {
        assertEquals("BuzzWhizz", this.fizzBuzz.fizzBuzz(35));
    }

    @Test
    void should_return_Fizz_if_divide_by_3_5_7() {
        assertEquals("FizzBuzzWhizz", this.fizzBuzz.fizzBuzz(105));
    }
}