package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class x extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii.i f103310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vh.a f103311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103312e;

    /* synthetic */ x(String str, List list, ii.i iVar, vh.a aVar, String str2, byte[] bArr) {
        this.f103308a = str;
        this.f103309b = list;
        this.f103310c = iVar;
        this.f103311d = aVar;
        this.f103312e = str2;
    }

    @Override // ji.c, com.google.android.libraries.places.internal.c41
    public final vh.a a() {
        return this.f103311d;
    }

    @Override // ji.c
    public final List<ii.l0.d> c() {
        return this.f103309b;
    }

    @Override // ji.c
    public final String d() {
        return this.f103308a;
    }

    @Override // ji.c
    public final String e() {
        return this.f103312e;
    }

    public final boolean equals(Object obj) {
        ii.i iVar;
        vh.a aVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f103308a.equals(cVar.d()) && this.f103309b.equals(cVar.c()) && ((iVar = this.f103310c) != null ? iVar.equals(cVar.f()) : cVar.f() == null) && ((aVar = this.f103311d) != null ? aVar.equals(cVar.a()) : cVar.a() == null) && ((str = this.f103312e) != null ? str.equals(cVar.e()) : cVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ji.c
    public final ii.i f() {
        return this.f103310c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f103308a.hashCode() ^ 1000003) * 1000003) ^ this.f103309b.hashCode();
        ii.i iVar = this.f103310c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        vh.a aVar = this.f103311d;
        int iHashCode3 = (iHashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str = this.f103312e;
        return iHashCode3 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f103309b.toString();
        int length = string.length();
        vh.a aVar = this.f103311d;
        String strValueOf = String.valueOf(this.f103310c);
        String strValueOf2 = String.valueOf(aVar);
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        String str = this.f103312e;
        int length4 = String.valueOf(str).length();
        String str2 = this.f103308a;
        StringBuilder sb5 = new StringBuilder(str2.length() + 40 + length + 15 + length2 + 20 + length3 + 13 + length4 + 1);
        sb5.append("FetchPlaceRequest{placeId=");
        sb5.append(str2);
        sb5.append(", placeFields=");
        sb5.append(string);
        sb5.append(", sessionToken=");
        sb5.append(strValueOf);
        sb5.append(", cancellationToken=");
        sb5.append(strValueOf2);
        sb5.append(", regionCode=");
        sb5.append(str);
        sb5.append("}");
        return sb5.toString();
    }
}
