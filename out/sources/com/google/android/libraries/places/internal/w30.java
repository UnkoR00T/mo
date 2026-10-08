package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34104a = p30.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f34105b = p30.a(0);

    /* synthetic */ w30(int i15, int i16, v30 v30Var) {
    }

    public final w30 a(u30 u30Var) {
        this.f34104a.add(u30Var);
        return this;
    }

    public final x30 b() {
        return new x30(this.f34104a, this.f34105b, null);
    }
}
