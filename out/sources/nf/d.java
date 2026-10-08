package nf;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f135537d = bg.c.c(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f135538e = bg.c.c(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f135539f = bg.c.c(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f135540g = bg.c.c(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a<d> f135541h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f135543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f135544c;

    public qf.c a() {
        return null;
    }

    public b b(int i15) {
        throw null;
    }

    public boolean c() {
        return this.f135543b;
    }

    public boolean d(int i15) {
        return e(i15, false);
    }

    public boolean e(int i15, boolean z15) {
        int i16 = this.f135544c[i15];
        if (i16 != 4) {
            return z15 && i16 == 3;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass() && this.f135543b == ((d) obj).f135543b) {
            throw null;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }
}
