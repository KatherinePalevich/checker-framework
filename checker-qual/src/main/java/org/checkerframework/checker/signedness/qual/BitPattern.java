package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.SupertypeOf;

/**
 * A type qualifier for values that are not arithmetic quantities, but are manipulated as a pattern
 * of bits.
 *
 * <p>All bitwise operators and shifts are permitted. All arithmetic operators are forbidden.
 *
 * <p>This type qualifier is a subtype of {@link UnknownSignedness} and a supertype of {@link
 * SignednessBottom}, but is unrelated to all other type qualifiers.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class, SignednessBottom.class})
public @interface BitPattern {}
