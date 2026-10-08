package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f36634a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f36634a = field;
    }

    public String toString() {
        return this.f36634a.toString();
    }
}
