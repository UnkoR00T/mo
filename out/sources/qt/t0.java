package qt;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f168392c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t0 f168393d = new t0(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f168394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f168395b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public t0(boolean z15, List<String> list) {
        this.f168394a = z15;
        this.f168395b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f168394a == t0Var.f168394a && fr.t.c(this.f168395b, t0Var.f168395b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f168394a) * 31) + this.f168395b.hashCode();
    }

    public String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f168394a + ", poisoningFeatures=" + this.f168395b + ')';
    }

    public /* synthetic */ t0(boolean z15, List list, int i15, fr.k kVar) {
        this(z15, (i15 & 2) != 0 ? pq.v.n() : list);
    }
}
