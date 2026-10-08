package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class f3 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f92437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f92438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f92439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f92440d;

    f3(a0 a0Var, p pVar, b0 b0Var, boolean z15) {
        this.f92437a = a0Var;
        if (pVar == null) {
            throw new NullPointerException("Null day");
        }
        this.f92438b = pVar;
        if (b0Var == null) {
            throw new NullPointerException("Null time");
        }
        this.f92439c = b0Var;
        this.f92440d = z15;
    }

    @Override // ii.y0
    public final a0 b() {
        return this.f92437a;
    }

    @Override // ii.y0
    public final p c() {
        return this.f92438b;
    }

    @Override // ii.y0
    public final b0 d() {
        return this.f92439c;
    }

    @Override // ii.y0
    public final boolean e() {
        return this.f92440d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            a0 a0Var = this.f92437a;
            if (a0Var != null ? a0Var.equals(y0Var.b()) : y0Var.b() == null) {
                if (this.f92438b.equals(y0Var.c()) && this.f92439c.equals(y0Var.d()) && this.f92440d == y0Var.e()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        a0 a0Var = this.f92437a;
        return (((((((a0Var == null ? 0 : a0Var.hashCode()) ^ 1000003) * 1000003) ^ this.f92438b.hashCode()) * 1000003) ^ this.f92439c.hashCode()) * 1000003) ^ (true != this.f92440d ? 1237 : 1231);
    }

    public final String toString() {
        b0 b0Var = this.f92439c;
        p pVar = this.f92438b;
        String strValueOf = String.valueOf(this.f92437a);
        String string = pVar.toString();
        String string2 = b0Var.toString();
        int length = strValueOf.length();
        int length2 = string.length();
        int length3 = string2.length();
        boolean z15 = this.f92440d;
        StringBuilder sb5 = new StringBuilder(length + 22 + length2 + 7 + length3 + 12 + String.valueOf(z15).length() + 1);
        sb5.append("TimeOfWeek{date=");
        sb5.append(strValueOf);
        sb5.append(", day=");
        sb5.append(string);
        sb5.append(", time=");
        sb5.append(string2);
        sb5.append(", truncated=");
        sb5.append(z15);
        sb5.append("}");
        return sb5.toString();
    }
}
