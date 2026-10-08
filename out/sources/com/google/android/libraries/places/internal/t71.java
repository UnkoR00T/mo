package com.google.android.libraries.places.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
abstract class t71 extends o71 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f81 f33760e;

    t71(String str, UUID uuid, String str2, f81 f81Var, l81 l81Var) {
        super("<skip trace>", uuid, str2, l81Var);
        zj.p.d(f81Var.e());
        this.f33760e = f81Var;
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final f81 i() {
        return f81.a(this.f33760e, k());
    }
}
