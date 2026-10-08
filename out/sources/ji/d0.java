package ji;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class d0 extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ii.c0 f103185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii.d0 f103186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LatLng f103187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f103188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ii.i f103189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f103190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f103191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f103192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f103193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final vh.a f103194k;

    /* synthetic */ d0(String str, ii.c0 c0Var, ii.d0 d0Var, LatLng latLng, List list, ii.i iVar, List list2, Integer num, String str2, boolean z15, vh.a aVar, byte[] bArr) {
        this.f103184a = str;
        this.f103185b = c0Var;
        this.f103186c = d0Var;
        this.f103187d = latLng;
        this.f103188e = list;
        this.f103189f = iVar;
        this.f103190g = list2;
        this.f103191h = num;
        this.f103192i = str2;
        this.f103193j = z15;
        this.f103194k = aVar;
    }

    @Override // ji.g, com.google.android.libraries.places.internal.c41
    public vh.a a() {
        return this.f103194k;
    }

    @Override // ji.g
    public List<String> c() {
        return this.f103188e;
    }

    @Override // ji.g
    public Integer d() {
        return this.f103191h;
    }

    @Override // ji.g
    public ii.c0 e() {
        return this.f103185b;
    }

    public final boolean equals(Object obj) {
        ii.i iVar;
        Integer num;
        String str;
        vh.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str2 = this.f103184a;
            if (str2 != null ? str2.equals(gVar.h()) : gVar.h() == null) {
                ii.c0 c0Var = this.f103185b;
                if (c0Var != null ? c0Var.equals(gVar.e()) : gVar.e() == null) {
                    ii.d0 d0Var = this.f103186c;
                    if (d0Var != null ? d0Var.equals(gVar.f()) : gVar.f() == null) {
                        LatLng latLng = this.f103187d;
                        if (latLng != null ? latLng.equals(gVar.g()) : gVar.g() == null) {
                            if (this.f103188e.equals(gVar.c()) && ((iVar = this.f103189f) != null ? iVar.equals(gVar.j()) : gVar.j() == null) && this.f103190g.equals(gVar.k()) && ((num = this.f103191h) != null ? num.equals(gVar.d()) : gVar.d() == null) && ((str = this.f103192i) != null ? str.equals(gVar.i()) : gVar.i() == null) && this.f103193j == gVar.l() && ((aVar = this.f103194k) != null ? aVar.equals(gVar.a()) : gVar.a() == null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ji.g
    public ii.d0 f() {
        return this.f103186c;
    }

    @Override // ji.g
    public LatLng g() {
        return this.f103187d;
    }

    @Override // ji.g
    public String h() {
        return this.f103184a;
    }

    public final int hashCode() {
        String str = this.f103184a;
        int iHashCode = str == null ? 0 : str.hashCode();
        ii.c0 c0Var = this.f103185b;
        int iHashCode2 = c0Var == null ? 0 : c0Var.hashCode();
        int i15 = iHashCode ^ 1000003;
        ii.d0 d0Var = this.f103186c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (d0Var == null ? 0 : d0Var.hashCode())) * 1000003;
        LatLng latLng = this.f103187d;
        int iHashCode4 = (((iHashCode3 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003) ^ this.f103188e.hashCode()) * 1000003;
        ii.i iVar = this.f103189f;
        int iHashCode5 = (((iHashCode4 ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003) ^ this.f103190g.hashCode()) * 1000003;
        Integer num = this.f103191h;
        int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str2 = this.f103192i;
        int iHashCode7 = (((iHashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.f103193j ? 1237 : 1231)) * 1000003;
        vh.a aVar = this.f103194k;
        return iHashCode7 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // ji.g
    public String i() {
        return this.f103192i;
    }

    @Override // ji.g
    public ii.i j() {
        return this.f103189f;
    }

    @Override // ji.g
    public List<String> k() {
        return this.f103190g;
    }

    @Override // ji.g
    public boolean l() {
        return this.f103193j;
    }

    public final String toString() {
        vh.a aVar = this.f103194k;
        List list = this.f103190g;
        ii.i iVar = this.f103189f;
        List list2 = this.f103188e;
        LatLng latLng = this.f103187d;
        ii.d0 d0Var = this.f103186c;
        String strValueOf = String.valueOf(this.f103185b);
        String strValueOf2 = String.valueOf(d0Var);
        String strValueOf3 = String.valueOf(latLng);
        String string = list2.toString();
        String strValueOf4 = String.valueOf(iVar);
        String string2 = list.toString();
        String strValueOf5 = String.valueOf(aVar);
        String str = this.f103184a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        int length5 = string.length();
        int length6 = strValueOf4.length();
        int length7 = string2.length();
        Integer num = this.f103191h;
        int length8 = String.valueOf(num).length();
        String str2 = this.f103192i;
        int length9 = String.valueOf(str2).length();
        boolean z15 = this.f103193j;
        StringBuilder sb5 = new StringBuilder(length + 56 + length2 + 22 + length3 + 9 + length4 + 12 + length5 + 15 + length6 + 14 + length7 + 14 + length8 + 13 + length9 + 36 + String.valueOf(z15).length() + 20 + strValueOf5.length() + 1);
        sb5.append("FindAutocompletePredictionsRequest{query=");
        sb5.append(str);
        sb5.append(", locationBias=");
        sb5.append(strValueOf);
        sb5.append(", locationRestriction=");
        sb5.append(strValueOf2);
        sb5.append(", origin=");
        sb5.append(strValueOf3);
        sb5.append(", countries=");
        sb5.append(string);
        sb5.append(", sessionToken=");
        sb5.append(strValueOf4);
        sb5.append(", typesFilter=");
        sb5.append(string2);
        sb5.append(", inputOffset=");
        sb5.append(num);
        sb5.append(", regionCode=");
        sb5.append(str2);
        sb5.append(", pureServiceAreaBusinessesIncluded=");
        sb5.append(z15);
        sb5.append(", cancellationToken=");
        sb5.append(strValueOf5);
        sb5.append("}");
        return sb5.toString();
    }
}
