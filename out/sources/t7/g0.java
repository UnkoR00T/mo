package t7;

import ak.n0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f188203c = o0.u0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f188204d = o0.u0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f188205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0<Integer> f188206b;

    public int a() {
        return this.f188205a.f188179c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f188205a.equals(g0Var.f188205a) && this.f188206b.equals(g0Var.f188206b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f188205a.hashCode() + (this.f188206b.hashCode() * 31);
    }
}
