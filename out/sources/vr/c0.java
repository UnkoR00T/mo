package vr;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0<d0> f208025a = new h0<>("InvalidModuleNotifier");

    public static final void a(i0 i0Var) {
        d0 d0Var = (d0) i0Var.L0(f208025a);
        if (d0Var != null) {
            d0Var.a(i0Var);
            return;
        }
        throw new b0("Accessing invalid module descriptor " + i0Var);
    }
}
