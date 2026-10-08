package ji;

/* JADX INFO: loaded from: classes4.dex */
final class a0 extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f103167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f103168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii.k0 f103169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vh.a f103170d;

    /* synthetic */ a0(Integer num, Integer num2, ii.k0 k0Var, vh.a aVar, byte[] bArr) {
        this.f103167a = num;
        this.f103168b = num2;
        this.f103169c = k0Var;
        this.f103170d = aVar;
    }

    @Override // ji.e, com.google.android.libraries.places.internal.c41
    public final vh.a a() {
        return this.f103170d;
    }

    @Override // ji.e
    public final Integer c() {
        return this.f103168b;
    }

    @Override // ji.e
    public final Integer d() {
        return this.f103167a;
    }

    @Override // ji.e
    public final ii.k0 e() {
        return this.f103169c;
    }

    public final boolean equals(Object obj) {
        vh.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            Integer num = this.f103167a;
            if (num != null ? num.equals(eVar.d()) : eVar.d() == null) {
                Integer num2 = this.f103168b;
                if (num2 != null ? num2.equals(eVar.c()) : eVar.c() == null) {
                    if (this.f103169c.equals(eVar.e()) && ((aVar = this.f103170d) != null ? aVar.equals(eVar.a()) : eVar.a() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f103167a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.f103168b;
        int iHashCode2 = ((((iHashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.f103169c.hashCode();
        vh.a aVar = this.f103170d;
        return (iHashCode2 * 1000003) ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        vh.a aVar = this.f103170d;
        String string = this.f103169c.toString();
        String strValueOf = String.valueOf(aVar);
        Integer num = this.f103167a;
        int length = String.valueOf(num).length();
        Integer num2 = this.f103168b;
        int length2 = String.valueOf(num2).length();
        StringBuilder sb5 = new StringBuilder(length + 50 + length2 + 16 + string.length() + 20 + strValueOf.length() + 1);
        sb5.append("FetchResolvedPhotoUriRequest{maxWidth=");
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
