package js;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zs.c f104610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zs.c f104611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zs.c f104612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zs.c f104613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f104614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final zs.c[] f104615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l0<c0> f104616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c0 f104617h;

    static {
        zs.c cVar = new zs.c("org.jspecify.nullness");
        f104610a = cVar;
        zs.c cVar2 = new zs.c("org.jspecify.annotations");
        f104611b = cVar2;
        zs.c cVar3 = new zs.c("io.reactivex.rxjava3.annotations");
        f104612c = cVar3;
        zs.c cVar4 = new zs.c("org.checkerframework.checker.nullness.compatqual");
        f104613d = cVar4;
        String strA = cVar3.a();
        f104614e = strA;
        f104615f = new zs.c[]{new zs.c(strA + ".Nullable"), new zs.c(strA + ".NonNull")};
        zs.c cVar5 = new zs.c("org.jetbrains.annotations");
        c0.a aVar = c0.f104627d;
        oq.r rVarA = oq.y.a(cVar5, aVar.a());
        oq.r rVarA2 = oq.y.a(new zs.c("androidx.annotation"), aVar.a());
        oq.r rVarA3 = oq.y.a(new zs.c("android.support.annotation"), aVar.a());
        oq.r rVarA4 = oq.y.a(new zs.c("android.annotation"), aVar.a());
        oq.r rVarA5 = oq.y.a(new zs.c("com.android.annotations"), aVar.a());
        oq.r rVarA6 = oq.y.a(new zs.c("org.eclipse.jdt.annotation"), aVar.a());
        oq.r rVarA7 = oq.y.a(new zs.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        oq.r rVarA8 = oq.y.a(cVar4, aVar.a());
        oq.r rVarA9 = oq.y.a(new zs.c("javax.annotation"), aVar.a());
        oq.r rVarA10 = oq.y.a(new zs.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        oq.r rVarA11 = oq.y.a(new zs.c("io.reactivex.annotations"), aVar.a());
        zs.c cVar6 = new zs.c("androidx.annotation.RecentlyNullable");
        p0 p0Var = p0.WARN;
        oq.r rVarA12 = oq.y.a(cVar6, new c0(p0Var, null, null, 4, null));
        oq.r rVarA13 = oq.y.a(new zs.c("androidx.annotation.RecentlyNonNull"), new c0(p0Var, null, null, 4, null));
        oq.r rVarA14 = oq.y.a(new zs.c("lombok"), aVar.a());
        oq.i iVar = new oq.i(2, 1);
        p0 p0Var2 = p0.STRICT;
        f104616g = new n0(pq.v0.l(rVarA, rVarA2, rVarA3, rVarA4, rVarA5, rVarA6, rVarA7, rVarA8, rVarA9, rVarA10, rVarA11, rVarA12, rVarA13, rVarA14, oq.y.a(cVar, new c0(p0Var, iVar, p0Var2)), oq.y.a(cVar2, new c0(p0Var, new oq.i(2, 1), p0Var2)), oq.y.a(cVar3, new c0(p0Var, new oq.i(1, 8), p0Var2)), oq.y.a(new zs.c("jakarta.annotation"), new c0(p0Var, new oq.i(2, 4), p0Var2))));
        f104617h = new c0(p0Var, null, null, 4, null);
    }

    public static final h0 a(oq.i iVar) {
        c0 c0Var = f104617h;
        p0 p0VarC = (c0Var.d() == null || c0Var.d().compareTo(iVar) > 0) ? c0Var.c() : c0Var.b();
        return new h0(p0VarC, b(p0VarC), null, 4, null);
    }

    public static final p0 b(p0 p0Var) {
        if (p0Var == p0.WARN) {
            return null;
        }
        return p0Var;
    }

    public static final p0 c(zs.c cVar, oq.i iVar) {
        return f(cVar, l0.f104709a.a(), iVar);
    }

    public static final zs.c d() {
        return f104611b;
    }

    public static final zs.c[] e() {
        return f104615f;
    }

    public static final p0 f(zs.c cVar, l0<? extends p0> l0Var, oq.i iVar) {
        p0 p0VarA = l0Var.a(cVar);
        if (p0VarA != null) {
            return p0VarA;
        }
        c0 c0VarA = f104616g.a(cVar);
        if (c0VarA == null) {
            return p0.IGNORE;
        }
        return (c0VarA.d() == null || c0VarA.d().compareTo(iVar) > 0) ? c0VarA.c() : c0VarA.b();
    }
}
