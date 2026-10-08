package ii;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
abstract class j1 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.b f92486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f92487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Instant f92488c;

    j1(v.b bVar, e0 e0Var, Instant instant) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f92486a = bVar;
        if (e0Var == null) {
            throw new NullPointerException("Null price");
        }
        this.f92487b = e0Var;
        if (instant == null) {
            throw new NullPointerException("Null updateTime");
        }
        this.f92488c = instant;
    }

    @Override // ii.v
    public final e0 a() {
        return this.f92487b;
    }

    @Override // ii.v
    public final v.b b() {
        return this.f92486a;
    }

    @Override // ii.v
    public final Instant c() {
        return this.f92488c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f92486a.equals(vVar.b()) && this.f92487b.equals(vVar.a()) && this.f92488c.equals(vVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f92486a.hashCode() ^ 1000003) * 1000003) ^ this.f92487b.hashCode()) * 1000003) ^ this.f92488c.hashCode();
    }

    public final String toString() {
        String string = this.f92486a.toString();
        int length = string.length();
        String string2 = this.f92487b.toString();
        int length2 = string2.length();
        String string3 = this.f92488c.toString();
        StringBuilder sb5 = new StringBuilder(length + 23 + length2 + 13 + string3.length() + 1);
        sb5.append("FuelPrice{type=");
        sb5.append(string);
        sb5.append(", price=");
        sb5.append(string2);
        sb5.append(", updateTime=");
        sb5.append(string3);
        sb5.append("}");
        return sb5.toString();
    }
}
