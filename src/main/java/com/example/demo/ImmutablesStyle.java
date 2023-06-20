package com.example.demo;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.PACKAGE, ElementType.TYPE})
// @Retention(RetentionPolicy.CLASS) // Make it class retention for incremental compilation
@Value.Style(
    // Require the base abstract type to have a suffix
    typeAbstract = {"*Base"},
    // Have the Generated class keep the same base name as the type
    typeImmutable = "*",
    // Provide better compile time safety with Staged builders
    stagedBuilder = true
)
@interface ImmutablesStyle {}
