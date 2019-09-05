package com.ellen.core.interceptor;

import com.ellen.core.model.Thing;
import java.io.File;

@FunctionalInterface
public interface ThingInterceptor {
    void apply(Thing thing);
}