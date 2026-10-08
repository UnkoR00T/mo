package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f32518b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f32519c = new i(new g(Collections.EMPTY_LIST));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f32520a;

    private i(g gVar) {
        this.f32520a = gVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).f32520a.equals(this.f32520a);
    }

    public final int hashCode() {
        return ~this.f32520a.hashCode();
    }

    public final String toString() {
        return this.f32520a.toString();
    }
}
