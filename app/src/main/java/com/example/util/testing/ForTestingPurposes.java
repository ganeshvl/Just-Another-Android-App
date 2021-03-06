package com.example.util.testing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An annotation that marks elements that only exist for testing purposes.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface ForTestingPurposes {

}
