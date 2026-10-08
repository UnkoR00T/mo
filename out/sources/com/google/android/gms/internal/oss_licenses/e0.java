package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements ju.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f30774c = new d0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f30775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f30776b;

    public e0(x xVar, boolean z15, boolean z16) {
        this.f30776b = xVar;
        this.f30775a = new c0(xVar, z15);
    }

    @Override // ju.a3
    public final /* bridge */ /* synthetic */ void C1(tq.i iVar, Object obj) {
        a0 a0Var = (a0) obj;
        v vVarC = j.c();
        j.f(vVarC, a0Var.f30728a, 3);
        vVarC.f30916d = a0Var.f30729b;
        vVarC.f30915c = a0Var.f30730c;
    }

    @Override // tq.i
    public final /* bridge */ tq.i D1(tq.i.c cVar) {
        return ju.f0.a.c(this, cVar);
    }

    @Override // ju.f0
    public final tq.i L(tq.i.b bVar) {
        return new e0(this.f30776b, j.d(), false);
    }

    @Override // ju.a3
    public final /* bridge */ /* synthetic */ Object M(tq.i iVar) {
        v vVarC = j.c();
        c0 c0Var = vVarC.f30916d;
        y yVar = vVarC.f30914b;
        y yVar2 = vVarC.f30915c;
        c0 c0Var2 = this.f30775a;
        if (yVar2 == null) {
            vVarC.f30915c = yVar != null ? yVar : c0Var2.f30760a;
        }
        vVarC.f30916d = c0Var2;
        j.f(vVarC, c0Var2.f30760a, 1);
        return new a0(yVar, c0Var, yVar2);
    }

    @Override // ju.f0
    public final ju.f0 b0() {
        return new e0(this.f30776b, j.d(), false);
    }

    @Override // tq.i.b
    public final tq.i.c getKey() {
        return f30774c;
    }

    @Override // tq.i.b, tq.i
    public final /* bridge */ tq.i.b m(tq.i.c cVar) {
        return ju.f0.a.b(this, cVar);
    }

    @Override // tq.i
    public final /* bridge */ tq.i n0(tq.i iVar) {
        return ju.f0.a.d(this, iVar);
    }

    @Override // tq.i
    public final /* bridge */ Object s1(Object obj, er.p pVar) {
        return ju.f0.a.a(this, obj, pVar);
    }
}
