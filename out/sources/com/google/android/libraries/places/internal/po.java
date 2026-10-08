package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f33342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33343c;

    po(qo qoVar, Object obj, int i15) {
        Objects.requireNonNull(qoVar);
        this.f33342b = new LinkedHashMap();
        this.f33341a = obj;
        this.f33343c = i15;
    }

    final boolean a() {
        return this.f33342b.isEmpty();
    }

    final boolean b() {
        return this.f33342b.isEmpty() && this.f33343c == 0;
    }

    final /* synthetic */ Object c() {
        return this.f33341a;
    }

    final /* synthetic */ int d() {
        return this.f33343c;
    }

    final /* synthetic */ void e(int i15) {
        this.f33343c = i15;
    }
}
