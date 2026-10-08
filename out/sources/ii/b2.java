package ii;

import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class b2 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.b f92370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f92371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f92372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f92373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f92374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Instant f92375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Instant f92376g;

    b2(g0.b bVar, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        this.f92370a = bVar;
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.f92371b = list;
        if (list2 == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.f92372c = list2;
        if (list3 == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.f92373d = list3;
        this.f92374e = bool;
        this.f92375f = instant;
        this.f92376g = instant2;
    }

    @Override // ii.g0
    public g0.b b() {
        return this.f92370a;
    }

    @Override // ii.g0
    public List<j0> c() {
        return this.f92371b;
    }

    @Override // ii.g0
    public List<w0> d() {
        return this.f92372c;
    }

    @Override // ii.g0
    public List<String> e() {
        return this.f92373d;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        Instant instant;
        Instant instant2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            g0.b bVar = this.f92370a;
            if (bVar != null ? bVar.equals(g0Var.b()) : g0Var.b() == null) {
                if (this.f92371b.equals(g0Var.c()) && this.f92372c.equals(g0Var.d()) && this.f92373d.equals(g0Var.e()) && ((bool = this.f92374e) != null ? bool.equals(g0Var.f()) : g0Var.f() == null) && ((instant = this.f92375f) != null ? instant.equals(g0Var.g()) : g0Var.g() == null) && ((instant2 = this.f92376g) != null ? instant2.equals(g0Var.h()) : g0Var.h() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ii.g0
    public final Boolean f() {
        return this.f92374e;
    }

    @Override // ii.g0
    public final Instant g() {
        return this.f92375f;
    }

    @Override // ii.g0
    public final Instant h() {
        return this.f92376g;
    }

    public final int hashCode() {
        g0.b bVar = this.f92370a;
        int iHashCode = (((((((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003) ^ this.f92371b.hashCode()) * 1000003) ^ this.f92372c.hashCode()) * 1000003) ^ this.f92373d.hashCode();
        Boolean bool = this.f92374e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Instant instant = this.f92375f;
        int iHashCode3 = (iHashCode2 ^ (instant == null ? 0 : instant.hashCode())) * 1000003;
        Instant instant2 = this.f92376g;
        return iHashCode3 ^ (instant2 != null ? instant2.hashCode() : 0);
    }

    public final String toString() {
        Instant instant = this.f92376g;
        Instant instant2 = this.f92375f;
        List list = this.f92373d;
        List list2 = this.f92372c;
        List list3 = this.f92371b;
        String strValueOf = String.valueOf(this.f92370a);
        String string = list3.toString();
        String string2 = list2.toString();
        String string3 = list.toString();
        String strValueOf2 = String.valueOf(instant2);
        String strValueOf3 = String.valueOf(instant);
        int length = strValueOf.length();
        int length2 = string.length();
        int length3 = string2.length();
        int length4 = string3.length();
        Boolean bool = this.f92374e;
        int length5 = String.valueOf(bool).length();
        StringBuilder sb5 = new StringBuilder(length + 33 + length2 + 14 + length3 + 14 + length4 + 10 + length5 + 11 + strValueOf2.length() + 12 + strValueOf3.length() + 1);
        sb5.append("OpeningHours{hoursType=");
        sb5.append(strValueOf);
        sb5.append(", periods=");
        sb5.append(string);
        sb5.append(", specialDays=");
        sb5.append(string2);
        sb5.append(", weekdayText=");
        sb5.append(string3);
        sb5.append(", openNow=");
        sb5.append(bool);
        sb5.append(", nextOpen=");
        sb5.append(strValueOf2);
        sb5.append(", nextClose=");
        sb5.append(strValueOf3);
        sb5.append("}");
        return sb5.toString();
    }
}
