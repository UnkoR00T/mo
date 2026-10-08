package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class b3 extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f92377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f92378b;

    b3(a0 a0Var, boolean z15) {
        if (a0Var == null) {
            throw new NullPointerException("Null date");
        }
        this.f92377a = a0Var;
        this.f92378b = z15;
    }

    @Override // ii.w0
    public final a0 b() {
        return this.f92377a;
    }

    @Override // ii.w0
    public final boolean c() {
        return this.f92378b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f92377a.equals(w0Var.b()) && this.f92378b == w0Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f92377a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f92378b ? 1237 : 1231);
    }

    public final String toString() {
        String string = this.f92377a.toString();
        int length = string.length();
        boolean z15 = this.f92378b;
        StringBuilder sb5 = new StringBuilder(length + 30 + String.valueOf(z15).length() + 1);
        sb5.append("SpecialDay{date=");
        sb5.append(string);
        sb5.append(", exceptional=");
        sb5.append(z15);
        sb5.append("}");
        return sb5.toString();
    }
}
