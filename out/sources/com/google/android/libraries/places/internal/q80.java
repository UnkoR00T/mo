package com.google.android.libraries.places.internal;

import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class q80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n90 f33398a = n90.a(Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b40 f33399b = b40.f31734c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m80 f33400c;

    q80() {
    }

    public final q80 a(n90 n90Var) {
        this.f33398a = (n90) zj.p.r(n90Var, "StatusOr addresses cannot be null.");
        return this;
    }

    public final q80 b(m80 m80Var) {
        this.f33400c = m80Var;
        return this;
    }

    public final r80 c() {
        return new r80(this.f33398a, this.f33399b, this.f33400c);
    }
}
