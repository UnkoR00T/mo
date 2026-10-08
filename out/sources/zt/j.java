package zt;

import st.t0;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f237226a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f237227b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // zt.f
    public boolean a(vr.z zVar) {
        t1 t1Var = zVar.l().get(1);
        t0 t0VarA = sr.o.f183590k.a(ht.e.s(t1Var));
        if (t0VarA != null) {
            return xt.d.w(t0VarA, xt.d.A(t1Var.getType()));
        }
        return false;
    }

    @Override // zt.f
    public /* bridge */ String b(vr.z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // zt.f
    public String getDescription() {
        return f237227b;
    }
}
