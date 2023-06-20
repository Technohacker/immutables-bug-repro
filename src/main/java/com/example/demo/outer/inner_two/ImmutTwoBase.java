package com.example.demo.outer.inner_two;

import org.immutables.value.Value;

import com.example.demo.outer.inner_one.ImmutOne;

@Value.Immutable
public interface ImmutTwoBase {    
    // This fails to compile
    ImmutOne abc();

    // Whereas this compiles successfully
    // com.example.demo.outer.inner_one.ImmutOne abc2();

    // @Enclosing shows the same behaviour
}
