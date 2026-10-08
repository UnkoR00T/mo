package ii;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
abstract class r7 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f92752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f92753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f92754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f92755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f92756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Instant f92757f;

    r7(r rVar, Double d15, Integer num, Integer num2, Integer num3, Instant instant) {
        if (rVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f92752a = rVar;
        this.f92753b = d15;
        this.f92754c = num;
        this.f92755d = num2;
        this.f92756e = num3;
        this.f92757f = instant;
    }

    @Override // ii.k
    public final Instant b() {
        return this.f92757f;
    }

    @Override // ii.k
    public final Integer c() {
        return this.f92755d;
    }

    @Override // ii.k
    public final Integer d() {
        return this.f92754c;
    }

    @Override // ii.k
    public final Double e() {
        return this.f92753b;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Instant instant;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f92752a.equals(kVar.g()) && this.f92753b.equals(kVar.e()) && this.f92754c.equals(kVar.d()) && ((num = this.f92755d) != null ? num.equals(kVar.c()) : kVar.c() == null) && ((num2 = this.f92756e) != null ? num2.equals(kVar.f()) : kVar.f() == null) && ((instant = this.f92757f) != null ? instant.equals(kVar.b()) : kVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.k
    public final Integer f() {
        return this.f92756e;
    }

    @Override // ii.k
    public final r g() {
        return this.f92752a;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f92752a.hashCode() ^ 1000003) * 1000003) ^ this.f92753b.hashCode()) * 1000003) ^ this.f92754c.hashCode();
        Integer num = this.f92755d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.f92756e;
        int iHashCode3 = (iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Instant instant = this.f92757f;
        return iHashCode3 ^ (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f92752a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f92757f);
        Double d15 = this.f92753b;
        int length2 = d15.toString().length();
        Integer num = this.f92754c;
        int length3 = num.toString().length();
        Integer num2 = this.f92755d;
        int length4 = String.valueOf(num2).length();
        Integer num3 = this.f92756e;
        StringBuilder sb5 = new StringBuilder(length + 44 + length2 + 8 + length3 + 17 + length4 + 20 + String.valueOf(num3).length() + 29 + strValueOf.length() + 1);
        sb5.append("ConnectorAggregation{type=");
        sb5.append(string);
        sb5.append(", maxChargeRateKw=");
        sb5.append(d15);
        sb5.append(", count=");
        sb5.append(num);
        sb5.append(", availableCount=");
        sb5.append(num2);
        sb5.append(", outOfServiceCount=");
        sb5.append(num3);
        sb5.append(", availabilityLastUpdateTime=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
