package ji;

/* JADX INFO: loaded from: classes4.dex */
final class j0 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii.l0 f103206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vh.a f103209d;

    /* synthetic */ j0(ii.l0 l0Var, String str, long j15, vh.a aVar, byte[] bArr) {
        this.f103206a = l0Var;
        this.f103207b = str;
        this.f103208c = j15;
        this.f103209d = aVar;
    }

    @Override // ji.k, com.google.android.libraries.places.internal.c41
    public final vh.a a() {
        return this.f103209d;
    }

    public final boolean equals(Object obj) {
        vh.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            ii.l0 l0Var = this.f103206a;
            if (l0Var != null ? l0Var.equals(kVar.f()) : kVar.f() == null) {
                String str = this.f103207b;
                if (str != null ? str.equals(kVar.g()) : kVar.g() == null) {
                    if (this.f103208c == kVar.h() && ((aVar = this.f103209d) != null ? aVar.equals(kVar.a()) : kVar.a() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ji.k
    public final ii.l0 f() {
        return this.f103206a;
    }

    @Override // ji.k
    public final String g() {
        return this.f103207b;
    }

    @Override // ji.k
    public final long h() {
        return this.f103208c;
    }

    public final int hashCode() {
        ii.l0 l0Var = this.f103206a;
        int iHashCode = l0Var == null ? 0 : l0Var.hashCode();
        String str = this.f103207b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i15 = iHashCode ^ 1000003;
        long j15 = this.f103208c;
        vh.a aVar = this.f103209d;
        return (((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003) ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        vh.a aVar = this.f103209d;
        String strValueOf = String.valueOf(this.f103206a);
        String strValueOf2 = String.valueOf(aVar);
        int length = strValueOf.length();
        String str = this.f103207b;
        int length2 = String.valueOf(str).length();
        long j15 = this.f103208c;
        StringBuilder sb5 = new StringBuilder(length + 30 + length2 + 16 + String.valueOf(j15).length() + 20 + strValueOf2.length() + 1);
        sb5.append("IsOpenRequest{place=");
        sb5.append(strValueOf);
        sb5.append(", placeId=");
        sb5.append(str);
        sb5.append(", utcTimeMillis=");
        sb5.append(j15);
        sb5.append(", cancellationToken=");
        sb5.append(strValueOf2);
        sb5.append("}");
        return sb5.toString();
    }
}
