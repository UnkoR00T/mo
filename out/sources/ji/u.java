package ji;

/* JADX INFO: loaded from: classes4.dex */
final class u extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f103298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f103299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii.k0 f103300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vh.a f103301d;

    /* synthetic */ u(Integer num, Integer num2, ii.k0 k0Var, vh.a aVar, byte[] bArr) {
        this.f103298a = num;
        this.f103299b = num2;
        this.f103300c = k0Var;
        this.f103301d = aVar;
    }

    @Override // ji.a, com.google.android.libraries.places.internal.c41
    public final vh.a a() {
        return this.f103301d;
    }

    @Override // ji.a
    public final Integer c() {
        return this.f103299b;
    }

    @Override // ji.a
    public final Integer d() {
        return this.f103298a;
    }

    @Override // ji.a
    public final ii.k0 e() {
        return this.f103300c;
    }

    public final boolean equals(Object obj) {
        vh.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar2 = (a) obj;
            Integer num = this.f103298a;
            if (num != null ? num.equals(aVar2.d()) : aVar2.d() == null) {
                Integer num2 = this.f103299b;
                if (num2 != null ? num2.equals(aVar2.c()) : aVar2.c() == null) {
                    if (this.f103300c.equals(aVar2.e()) && ((aVar = this.f103301d) != null ? aVar.equals(aVar2.a()) : aVar2.a() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f103298a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.f103299b;
        int iHashCode2 = ((((iHashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.f103300c.hashCode();
        vh.a aVar = this.f103301d;
        return (iHashCode2 * 1000003) ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        vh.a aVar = this.f103301d;
        String string = this.f103300c.toString();
        String strValueOf = String.valueOf(aVar);
        Integer num = this.f103298a;
        int length = String.valueOf(num).length();
        Integer num2 = this.f103299b;
        int length2 = String.valueOf(num2).length();
        StringBuilder sb5 = new StringBuilder(length + 39 + length2 + 16 + string.length() + 20 + strValueOf.length() + 1);
        sb5.append("FetchPhotoRequest{maxWidth=");
        sb5.append(num);
        sb5.append(", maxHeight=");
        sb5.append(num2);
        sb5.append(", photoMetadata=");
        sb5.append(string);
        sb5.append(", cancellationToken=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
