package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j41 {
    abstract j41 a(int i15);

    public abstract j41 b(k41 k41Var);

    abstract l41 c();

    public final l41 d() {
        l41 l41VarC = c();
        zj.p.e(!l41VarC.a().isEmpty(), "Package name must not be empty.");
        return l41VarC;
    }
}
