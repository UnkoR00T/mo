package yk;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0<?> f227511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f227512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f227513c;

    private q(Class<?> cls, int i15, int i16) {
        this((d0<?>) d0.b(cls), i15, i16);
    }

    private static String a(int i15) {
        if (i15 == 0) {
            return "direct";
        }
        if (i15 == 1) {
            return "provider";
        }
        if (i15 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i15);
    }

    @Deprecated
    public static q g(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q i(d0<?> d0Var) {
        return new q(d0Var, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q k(d0<?> d0Var) {
        return new q(d0Var, 1, 0);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public d0<?> b() {
        return this.f227511a;
    }

    public boolean c() {
        return this.f227513c == 2;
    }

    public boolean d() {
        return this.f227513c == 0;
    }

    public boolean e() {
        return this.f227512b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f227511a.equals(qVar.f227511a) && this.f227512b == qVar.f227512b && this.f227513c == qVar.f227513c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f227512b == 2;
    }

    public int hashCode() {
        return ((((this.f227511a.hashCode() ^ 1000003) * 1000003) ^ this.f227512b) * 1000003) ^ this.f227513c;
    }

    public String toString() {
        String str;
        StringBuilder sb5 = new StringBuilder("Dependency{anInterface=");
        sb5.append(this.f227511a);
        sb5.append(", type=");
        int i15 = this.f227512b;
        if (i15 == 1) {
            str = "required";
        } else {
            str = i15 == 0 ? "optional" : "set";
        }
        sb5.append(str);
        sb5.append(", injection=");
        sb5.append(a(this.f227513c));
        sb5.append("}");
        return sb5.toString();
    }

    private q(d0<?> d0Var, int i15, int i16) {
        this.f227511a = (d0) c0.c(d0Var, "Null dependency anInterface.");
        this.f227512b = i15;
        this.f227513c = i16;
    }
}
