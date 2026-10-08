package bh;

/* JADX INFO: loaded from: classes3.dex */
final class e0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19425c;

    /* synthetic */ e0(String str, boolean z15, int i15, d0 d0Var) {
        this.f19423a = str;
        this.f19424b = z15;
        this.f19425c = i15;
    }

    @Override // bh.i0
    public final int a() {
        return this.f19425c;
    }

    @Override // bh.i0
    public final String b() {
        return this.f19423a;
    }

    @Override // bh.i0
    public final boolean c() {
        return this.f19424b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f19423a.equals(i0Var.b()) && this.f19424b == i0Var.c() && this.f19425c == i0Var.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f19423a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19424b ? 1237 : 1231)) * 1000003) ^ this.f19425c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f19423a + ", enableFirelog=" + this.f19424b + ", firelogEventType=" + this.f19425c + "}";
    }
}
