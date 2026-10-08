package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g40 f32672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f40 f32673b;

    protected jq0(g40 g40Var, f40 f40Var) {
        this.f32672a = (g40) zj.p.r(g40Var, "channel");
        this.f32673b = (f40) zj.p.r(f40Var, "callOptions");
    }

    protected abstract jq0 a(g40 g40Var, f40 f40Var);

    public final g40 b() {
        return this.f32672a;
    }

    public final f40 c() {
        return this.f32673b;
    }

    public final jq0 d(m40... m40VarArr) {
        return a(o40.a(this.f32672a, Arrays.asList(m40VarArr)), this.f32673b);
    }
}
