package ji;

import ii.t0;
import ii.v0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class m0 extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vh.a f103230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii.c0 f103232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ii.d0 f103233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f103234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Double f103235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f103236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f103237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f103238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p.b f103239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f103240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f103241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f103242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f103243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f103244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f103245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f103246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f103247r;

    /* synthetic */ m0(vh.a aVar, String str, ii.c0 c0Var, ii.d0 d0Var, Integer num, Double d15, boolean z15, List list, List list2, p.b bVar, String str2, boolean z16, String str3, ii.s sVar, t0 t0Var, v0 v0Var, boolean z17, boolean z18, boolean z19, String str4, int i15, byte[] bArr) {
        this.f103230a = aVar;
        this.f103231b = str;
        this.f103232c = c0Var;
        this.f103233d = d0Var;
        this.f103234e = num;
        this.f103235f = d15;
        this.f103236g = z15;
        this.f103237h = list;
        this.f103238i = list2;
        this.f103239j = bVar;
        this.f103240k = str2;
        this.f103241l = z16;
        this.f103242m = str3;
        this.f103243n = z17;
        this.f103244o = z18;
        this.f103245p = z19;
        this.f103246q = str4;
        this.f103247r = i15;
    }

    @Override // com.google.android.libraries.places.internal.c41
    public final vh.a a() {
        return this.f103230a;
    }

    @Override // ji.p
    public ii.s c() {
        return null;
    }

    @Override // ji.p
    public String d() {
        return this.f103231b;
    }

    @Override // ji.p
    public ii.c0 e() {
        return this.f103232c;
    }

    public final boolean equals(Object obj) {
        p.b bVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            vh.a aVar = this.f103230a;
            if (aVar != null ? aVar.equals(pVar.a()) : pVar.a() == null) {
                String str3 = this.f103231b;
                if (str3 != null ? str3.equals(pVar.d()) : pVar.d() == null) {
                    ii.c0 c0Var = this.f103232c;
                    if (c0Var != null ? c0Var.equals(pVar.e()) : pVar.e() == null) {
                        ii.d0 d0Var = this.f103233d;
                        if (d0Var != null ? d0Var.equals(pVar.f()) : pVar.f() == null) {
                            Integer num = this.f103234e;
                            if (num != null ? num.equals(pVar.g()) : pVar.g() == null) {
                                Double d15 = this.f103235f;
                                if (d15 != null ? d15.equals(pVar.h()) : pVar.h() == null) {
                                    if (this.f103236g == pVar.p() && this.f103237h.equals(pVar.i()) && this.f103238i.equals(pVar.j()) && ((bVar = this.f103239j) != null ? bVar.equals(pVar.k()) : pVar.k() == null) && ((str = this.f103240k) != null ? str.equals(pVar.l()) : pVar.l() == null) && this.f103241l == pVar.t() && this.f103242m.equals(pVar.o())) {
                                        pVar.c();
                                        pVar.m();
                                        pVar.n();
                                        if (this.f103243n == pVar.r() && this.f103244o == pVar.q() && this.f103245p == pVar.s() && ((str2 = this.f103246q) != null ? str2.equals(pVar.u()) : pVar.u() == null) && this.f103247r == pVar.v()) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ji.p
    public ii.d0 f() {
        return this.f103233d;
    }

    @Override // ji.p
    public Integer g() {
        return this.f103234e;
    }

    @Override // ji.p
    public Double h() {
        return this.f103235f;
    }

    public final int hashCode() {
        vh.a aVar = this.f103230a;
        int iHashCode = aVar == null ? 0 : aVar.hashCode();
        String str = this.f103231b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i15 = iHashCode ^ 1000003;
        ii.c0 c0Var = this.f103232c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (c0Var == null ? 0 : c0Var.hashCode())) * 1000003;
        ii.d0 d0Var = this.f103233d;
        int iHashCode4 = (iHashCode3 ^ (d0Var == null ? 0 : d0Var.hashCode())) * 1000003;
        Integer num = this.f103234e;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Double d15 = this.f103235f;
        int iHashCode6 = (((((((iHashCode5 ^ (d15 == null ? 0 : d15.hashCode())) * 1000003) ^ (true != this.f103236g ? 1237 : 1231)) * 1000003) ^ this.f103237h.hashCode()) * 1000003) ^ this.f103238i.hashCode()) * 1000003;
        p.b bVar = this.f103239j;
        int iHashCode7 = (iHashCode6 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f103240k;
        int iHashCode8 = (((((((((((iHashCode7 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.f103241l ? 1237 : 1231)) * 1000003) ^ this.f103242m.hashCode()) * 1525764945) ^ (true != this.f103243n ? 1237 : 1231)) * 1000003) ^ (true != this.f103244o ? 1237 : 1231)) * 1000003) ^ (true != this.f103245p ? 1237 : 1231)) * 1000003;
        String str3 = this.f103246q;
        return ((iHashCode8 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.f103247r;
    }

    @Override // ji.p
    public List<ii.l0.d> i() {
        return this.f103237h;
    }

    @Override // ji.p
    public List<Integer> j() {
        return this.f103238i;
    }

    @Override // ji.p
    public p.b k() {
        return this.f103239j;
    }

    @Override // ji.p
    public String l() {
        return this.f103240k;
    }

    @Override // ji.p
    public t0 m() {
        return null;
    }

    @Override // ji.p
    public v0 n() {
        return null;
    }

    @Override // ji.p
    public String o() {
        return this.f103242m;
    }

    @Override // ji.p
    public boolean p() {
        return this.f103236g;
    }

    @Override // ji.p
    public boolean q() {
        return this.f103244o;
    }

    @Override // ji.p
    public boolean r() {
        return this.f103243n;
    }

    @Override // ji.p
    public boolean s() {
        return this.f103245p;
    }

    @Override // ji.p
    public boolean t() {
        return this.f103241l;
    }

    public final String toString() {
        p.b bVar = this.f103239j;
        List list = this.f103238i;
        List list2 = this.f103237h;
        ii.d0 d0Var = this.f103233d;
        ii.c0 c0Var = this.f103232c;
        String strValueOf = String.valueOf(this.f103230a);
        String strValueOf2 = String.valueOf(c0Var);
        String strValueOf3 = String.valueOf(d0Var);
        String string = list2.toString();
        String string2 = list.toString();
        String strValueOf4 = String.valueOf(bVar);
        int length = strValueOf.length();
        String str = this.f103231b;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        Integer num = this.f103234e;
        int length5 = String.valueOf(num).length();
        Double d15 = this.f103235f;
        int length6 = String.valueOf(d15).length();
        boolean z15 = this.f103236g;
        int length7 = String.valueOf(z15).length();
        int length8 = string.length();
        int length9 = string2.length();
        int length10 = strValueOf4.length();
        String str2 = this.f103240k;
        int length11 = String.valueOf(str2).length();
        boolean z16 = this.f103241l;
        int length12 = String.valueOf(z16).length();
        int length13 = "null".length();
        int length14 = "null".length();
        int i15 = length + 53 + length2 + 15 + length3 + 22 + length4 + 17 + length5 + 12 + length6 + 10 + length7 + 14 + length8 + 14 + length9 + 17 + length10 + 13 + length11;
        String str3 = this.f103242m;
        int length15 = i15 + 22 + length12 + 12 + str3.length() + 18 + length13 + 20 + length14;
        boolean z17 = this.f103245p;
        boolean z18 = this.f103244o;
        boolean z19 = this.f103243n;
        int i16 = this.f103247r;
        String str4 = this.f103246q;
        int length16 = length15 + 29 + "null".length() + 27 + String.valueOf(z19).length();
        StringBuilder sb5 = new StringBuilder(length16 + 36 + String.valueOf(z18).length() + 20 + String.valueOf(z17).length() + 12 + String.valueOf(str4).length() + 19 + String.valueOf(i16).length() + 1);
        sb5.append("SearchByTextRequest{cancellationToken=");
        sb5.append(strValueOf);
        sb5.append(", includedType=");
        sb5.append(str);
        sb5.append(", locationBias=");
        sb5.append(strValueOf2);
        sb5.append(", locationRestriction=");
        sb5.append(strValueOf3);
        sb5.append(", maxResultCount=");
        sb5.append(num);
        sb5.append(", minRating=");
        sb5.append(d15);
        sb5.append(", openNow=");
        sb5.append(z15);
        sb5.append(", placeFields=");
        sb5.append(string);
        sb5.append(", priceLevels=");
        sb5.append(string2);
        sb5.append(", rankPreference=");
        sb5.append(strValueOf4);
        sb5.append(", regionCode=");
        sb5.append(str2);
        sb5.append(", strictTypeFiltering=");
        sb5.append(z16);
        sb5.append(", textQuery=");
        sb5.append(str3);
        sb5.append(", evSearchOptions=");
        sb5.append("null");
        sb5.append(", routingParameters=");
        sb5.append("null");
        sb5.append(", searchAlongRouteParameters=");
        sb5.append("null");
        sb5.append(", routingSummariesIncluded=");
        sb5.append(z19);
        sb5.append(", pureServiceAreaBusinessesIncluded=");
        sb5.append(z18);
        sb5.append(", searchUriIncluded=");
        sb5.append(z17);
        sb5.append(", pageToken=");
        sb5.append(str4);
        sb5.append(", requestPageIndex=");
        sb5.append(i16);
        sb5.append("}");
        return sb5.toString();
    }

    @Override // ji.p
    public final String u() {
        return this.f103246q;
    }

    @Override // ji.p
    public final int v() {
        return this.f103247r;
    }

    @Override // ji.p
    public final p.a w() {
        return new l0(this);
    }
}
