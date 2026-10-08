package ji;

import ii.t0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class q0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f103278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f103279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f103280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f103281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ii.d0 f103282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f103283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final vh.a f103284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r.b f103285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f103286k;

    /* synthetic */ q0(String str, List list, List list2, List list3, List list4, Integer num, ii.d0 d0Var, List list5, vh.a aVar, r.b bVar, t0 t0Var, boolean z15, byte[] bArr) {
        this.f103276a = str;
        this.f103277b = list;
        this.f103278c = list2;
        this.f103279d = list3;
        this.f103280e = list4;
        this.f103281f = num;
        this.f103282g = d0Var;
        this.f103283h = list5;
        this.f103284i = aVar;
        this.f103285j = bVar;
        this.f103286k = z15;
    }

    @Override // ji.r, com.google.android.libraries.places.internal.c41
    public vh.a a() {
        return this.f103284i;
    }

    @Override // ji.r
    public List<String> c() {
        return this.f103280e;
    }

    @Override // ji.r
    public List<String> d() {
        return this.f103278c;
    }

    @Override // ji.r
    public List<String> e() {
        return this.f103279d;
    }

    public final boolean equals(Object obj) {
        vh.a aVar;
        r.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            String str = this.f103276a;
            if (str != null ? str.equals(rVar.k()) : rVar.k() == null) {
                List list = this.f103277b;
                if (list != null ? list.equals(rVar.f()) : rVar.f() == null) {
                    List list2 = this.f103278c;
                    if (list2 != null ? list2.equals(rVar.d()) : rVar.d() == null) {
                        List list3 = this.f103279d;
                        if (list3 != null ? list3.equals(rVar.e()) : rVar.e() == null) {
                            List list4 = this.f103280e;
                            if (list4 != null ? list4.equals(rVar.c()) : rVar.c() == null) {
                                Integer num = this.f103281f;
                                if (num != null ? num.equals(rVar.h()) : rVar.h() == null) {
                                    if (this.f103282g.equals(rVar.g()) && this.f103283h.equals(rVar.i()) && ((aVar = this.f103284i) != null ? aVar.equals(rVar.a()) : rVar.a() == null) && ((bVar = this.f103285j) != null ? bVar.equals(rVar.j()) : rVar.j() == null)) {
                                        rVar.l();
                                        if (this.f103286k == rVar.m()) {
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

    @Override // ji.r
    public List<String> f() {
        return this.f103277b;
    }

    @Override // ji.r
    public ii.d0 g() {
        return this.f103282g;
    }

    @Override // ji.r
    public Integer h() {
        return this.f103281f;
    }

    public final int hashCode() {
        String str = this.f103276a;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.f103277b;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int i15 = iHashCode ^ 1000003;
        List list2 = this.f103278c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.f103279d;
        int iHashCode4 = (iHashCode3 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.f103280e;
        int iHashCode5 = (iHashCode4 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        Integer num = this.f103281f;
        int iHashCode6 = (((((iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f103282g.hashCode()) * 1000003) ^ this.f103283h.hashCode()) * 1000003;
        vh.a aVar = this.f103284i;
        int iHashCode7 = (iHashCode6 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        r.b bVar = this.f103285j;
        return ((iHashCode7 ^ (bVar != null ? bVar.hashCode() : 0)) * (-721379959)) ^ (true != this.f103286k ? 1237 : 1231);
    }

    @Override // ji.r
    public List<ii.l0.d> i() {
        return this.f103283h;
    }

    @Override // ji.r
    public r.b j() {
        return this.f103285j;
    }

    @Override // ji.r
    public String k() {
        return this.f103276a;
    }

    @Override // ji.r
    public t0 l() {
        return null;
    }

    @Override // ji.r
    public boolean m() {
        return this.f103286k;
    }

    public final String toString() {
        r.b bVar = this.f103285j;
        vh.a aVar = this.f103284i;
        List list = this.f103283h;
        ii.d0 d0Var = this.f103282g;
        List list2 = this.f103280e;
        List list3 = this.f103279d;
        List list4 = this.f103278c;
        String strValueOf = String.valueOf(this.f103277b);
        String strValueOf2 = String.valueOf(list4);
        String strValueOf3 = String.valueOf(list3);
        String strValueOf4 = String.valueOf(list2);
        String string = d0Var.toString();
        String string2 = list.toString();
        String strValueOf5 = String.valueOf(aVar);
        String strValueOf6 = String.valueOf(bVar);
        String str = this.f103276a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        int length5 = strValueOf4.length();
        Integer num = this.f103281f;
        int length6 = String.valueOf(num).length();
        int length7 = string.length();
        int length8 = string2.length();
        int length9 = strValueOf5.length();
        int length10 = strValueOf6.length();
        int length11 = "null".length();
        boolean z15 = this.f103286k;
        StringBuilder sb5 = new StringBuilder(length + 47 + length2 + 16 + length3 + 23 + length4 + 23 + length5 + 17 + length6 + 22 + length7 + 14 + length8 + 20 + length9 + 17 + length10 + 20 + length11 + 27 + String.valueOf(z15).length() + 1);
        sb5.append("SearchNearbyRequest{regionCode=");
        sb5.append(str);
        sb5.append(", includedTypes=");
        sb5.append(strValueOf);
        sb5.append(", excludedTypes=");
        sb5.append(strValueOf2);
        sb5.append(", includedPrimaryTypes=");
        sb5.append(strValueOf3);
        sb5.append(", excludedPrimaryTypes=");
        sb5.append(strValueOf4);
        sb5.append(", maxResultCount=");
        sb5.append(num);
        sb5.append(", locationRestriction=");
        sb5.append(string);
        sb5.append(", placeFields=");
        sb5.append(string2);
        sb5.append(", cancellationToken=");
        sb5.append(strValueOf5);
        sb5.append(", rankPreference=");
        sb5.append(strValueOf6);
        sb5.append(", routingParameters=");
        sb5.append("null");
        sb5.append(", routingSummariesIncluded=");
        sb5.append(z15);
        sb5.append("}");
        return sb5.toString();
    }
}
