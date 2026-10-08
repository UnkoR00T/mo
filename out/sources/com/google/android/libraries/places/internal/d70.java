package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f31981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b40 f31982b = b40.f31734c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f31983c;

    d70() {
    }

    public final d70 a(List list) {
        this.f31981a = list;
        return this;
    }

    public final d70 b(b40 b40Var) {
        this.f31982b = b40Var;
        return this;
    }

    public final d70 c(Object obj) {
        this.f31983c = obj;
        return this;
    }

    public final e70 d() {
        return new e70(this.f31981a, this.f31982b, this.f31983c, null);
    }
}
