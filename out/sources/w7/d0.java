package w7;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f210624c = new d0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f210625d = new d0(0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f210626e = o0.u0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f210627f = o0.u0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f210628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f210629b;

    public d0(int i15, int i16) {
        zj.p.d((i15 == -1 || i15 >= 0) && (i16 == -1 || i16 >= 0));
        this.f210628a = i15;
        this.f210629b = i16;
    }

    public int a() {
        return this.f210629b;
    }

    public int b() {
        return this.f210628a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f210628a == d0Var.f210628a && this.f210629b == d0Var.f210629b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = this.f210629b;
        int i16 = this.f210628a;
        return i15 ^ ((i16 >>> 16) | (i16 << 16));
    }

    public String toString() {
        return this.f210628a + "x" + this.f210629b;
    }
}
