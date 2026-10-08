package ft;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.b f66952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66953b;

    public f(zs.b bVar, int i15) {
        this.f66952a = bVar;
        this.f66953b = i15;
    }

    public final zs.b a() {
        return this.f66952a;
    }

    public final int b() {
        return this.f66953b;
    }

    public final int c() {
        return this.f66953b;
    }

    public final zs.b d() {
        return this.f66952a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fr.t.c(this.f66952a, fVar.f66952a) && this.f66953b == fVar.f66953b;
    }

    public int hashCode() {
        return (this.f66952a.hashCode() * 31) + Integer.hashCode(this.f66953b);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        int i15 = this.f66953b;
        for (int i16 = 0; i16 < i15; i16++) {
            sb5.append("kotlin/Array<");
        }
        sb5.append(this.f66952a);
        int i17 = this.f66953b;
        for (int i18 = 0; i18 < i17; i18++) {
            sb5.append(">");
        }
        return sb5.toString();
    }
}
