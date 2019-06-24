package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}