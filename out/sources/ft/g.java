package ft;

import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f66954a;

    public g(T t15) {
        this.f66954a = t15;
    }

    public abstract t0 a(i0 i0Var);

    public T b() {
        return this.f66954a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T tB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return fr.t.c(tB, gVar != null ? gVar.b() : null);
    }

    public int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
