package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class m7 extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f92656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f92657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f92660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f92661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f92662h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f92663j;

    m7(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.f92655a = str;
        this.f92656b = num;
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.f92657c = list;
        if (str2 == null) {
            throw new NullPointerException("Null fullText");
        }
        this.f92658d = str2;
        if (str3 == null) {
            throw new NullPointerException("Null primaryText");
        }
        this.f92659e = str3;
        if (str4 == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.f92660f = str4;
        if (list2 == null) {
            throw new NullPointerException("Null fullTextMatchedSubstrings");
        }
        this.f92661g = list2;
        if (list3 == null) {
            throw new NullPointerException("Null primaryTextMatchedSubstrings");
        }
        this.f92662h = list3;
        if (list4 == null) {
            throw new NullPointerException("Null secondaryTextMatchedSubstrings");
        }
        this.f92663j = list4;
    }

    @Override // ii.h
    public Integer b() {
        return this.f92656b;
    }

    @Override // ii.h
    public String c() {
        return this.f92655a;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f92655a.equals(hVar.c()) && ((num = this.f92656b) != null ? num.equals(hVar.b()) : hVar.b() == null) && this.f92657c.equals(hVar.f()) && this.f92658d.equals(hVar.g()) && this.f92659e.equals(hVar.h()) && this.f92660f.equals(hVar.i()) && this.f92661g.equals(hVar.j()) && this.f92662h.equals(hVar.k()) && this.f92663j.equals(hVar.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.h
    public List<String> f() {
        return this.f92657c;
    }

    @Override // ii.h
    final String g() {
        return this.f92658d;
    }

    @Override // ii.h
    final String h() {
        return this.f92659e;
    }

    public final int hashCode() {
        int iHashCode = this.f92655a.hashCode() ^ 1000003;
        Integer num = this.f92656b;
        return (((((((((((((((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f92657c.hashCode()) * 1000003) ^ this.f92658d.hashCode()) * 1000003) ^ this.f92659e.hashCode()) * 1000003) ^ this.f92660f.hashCode()) * 1000003) ^ this.f92661g.hashCode()) * 1000003) ^ this.f92662h.hashCode()) * 1000003) ^ this.f92663j.hashCode();
    }

    @Override // ii.h
    final String i() {
        return this.f92660f;
    }

    @Override // ii.h
    final List j() {
        return this.f92661g;
    }

    @Override // ii.h
    final List k() {
        return this.f92662h;
    }

    @Override // ii.h
    final List l() {
        return this.f92663j;
    }

    public final String toString() {
        List list = this.f92663j;
        List list2 = this.f92662h;
        List list3 = this.f92661g;
        String string = this.f92657c.toString();
        String string2 = list3.toString();
        String string3 = list2.toString();
        String string4 = list.toString();
        Integer num = this.f92656b;
        int length = String.valueOf(num).length();
        int length2 = string.length();
        int length3 = string2.length();
        int length4 = string3.length();
        int length5 = string4.length();
        String str = this.f92655a;
        int length6 = str.length() + 48 + length + 8 + length2;
        String str2 = this.f92658d;
        int length7 = length6 + 11 + str2.length();
        String str3 = this.f92659e;
        int length8 = length7 + 14 + str3.length();
        String str4 = this.f92660f;
        StringBuilder sb5 = new StringBuilder(length8 + 16 + str4.length() + 28 + length3 + 31 + length4 + 33 + length5 + 1);
        sb5.append("AutocompletePrediction{placeId=");
        sb5.append(str);
        sb5.append(", distanceMeters=");
        sb5.append(num);
        sb5.append(", types=");
        sb5.append(string);
        sb5.append(", fullText=");
        sb5.append(str2);
        sb5.append(", primaryText=");
        sb5.append(str3);
        sb5.append(", secondaryText=");
        sb5.append(str4);
        sb5.append(", fullTextMatchedSubstrings=");
        sb5.append(string2);
        sb5.append(", primaryTextMatchedSubstrings=");
        sb5.append(string3);
        sb5.append(", secondaryTextMatchedSubstrings=");
        sb5.append(string4);
        sb5.append("}");
        return sb5.toString();
    }
}
