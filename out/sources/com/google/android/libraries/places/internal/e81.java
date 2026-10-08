package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class e81 extends f81 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final f81 f32170e;

    static {
        f81 f81VarB = new e81(null, new r0.l1(0)).b();
        f32170e = f81VarB;
        e81 e81Var = new e81(f81VarB, new r0.l1(), null);
        boolean z15 = !e81Var.h();
        Boolean bool = Boolean.TRUE;
        zj.p.x(z15, "Can't mutate after handing to trace");
        zj.p.q(bool);
        d81 d81Var = f81.f32265d;
        zj.p.x(!e81Var.d(d81Var), "Key already present");
        e81Var.g().put(d81Var, bool);
        e81Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e81(f81 f81Var, r0.l1 l1Var) {
        super(null, l1Var, 0 == true ? 1 : 0);
    }

    /* synthetic */ e81(f81 f81Var, r0.l1 l1Var, byte[] bArr) {
        super(f81Var, l1Var, null);
    }
}
