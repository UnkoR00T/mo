package ut;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import pq.e1;
import pq.v;
import st.d2;
import st.t0;
import st.x1;
import vr.i0;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f201331a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i0 f201332b = e.f201256a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f201333c = new a(zs.f.p(String.format(b.ERROR_CLASS.e(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t0 f201334d = d(k.f201325y, new String[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final t0 f201335e = d(k.R0, new String[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z0 f201336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<z0> f201337g;

    static {
        f fVar = new f();
        f201336f = fVar;
        f201337g = e1.d(fVar);
    }

    private l() {
    }

    public static final g a(h hVar, boolean z15, String... strArr) {
        return z15 ? new m(hVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final g b(h hVar, String... strArr) {
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i d(k kVar, String... strArr) {
        return f201331a.g(kVar, v.n(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean m(vr.m mVar) {
        if (mVar == null) {
            return false;
        }
        l lVar = f201331a;
        return lVar.n(mVar) || lVar.n(mVar.b()) || mVar == f201332b;
    }

    private final boolean n(vr.m mVar) {
        return mVar instanceof a;
    }

    public static final boolean o(t0 t0Var) {
        if (t0Var == null) {
            return false;
        }
        x1 x1VarT0 = t0Var.T0();
        return (x1VarT0 instanceof j) && ((j) x1VarT0).e() == k.B;
    }

    public final i c(k kVar, x1 x1Var, String... strArr) {
        return f(kVar, v.n(), x1Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final j e(k kVar, String... strArr) {
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i f(k kVar, List<? extends d2> list, x1 x1Var, String... strArr) {
        return new i(x1Var, b(h.ERROR_TYPE_SCOPE, x1Var.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i g(k kVar, List<? extends d2> list, String... strArr) {
        return f(kVar, list, e(kVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final a h() {
        return f201333c;
    }

    public final i0 i() {
        return f201332b;
    }

    public final Set<z0> j() {
        return f201337g;
    }

    public final t0 k() {
        return f201335e;
    }

    public final t0 l() {
        return f201334d;
    }

    public final String p(t0 t0Var) {
        xt.d.z(t0Var);
        return ((j) t0Var.T0()).f(0);
    }
}
