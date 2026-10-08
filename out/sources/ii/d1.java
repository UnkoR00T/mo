package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class d1 extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f92394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f92395b;

    d1(Integer num, List list) {
        this.f92394a = num;
        if (list == null) {
            throw new NullPointerException("Null connectorAggregations");
        }
        this.f92395b = list;
    }

    @Override // ii.q
    public final List<k> a() {
        return this.f92395b;
    }

    @Override // ii.q
    public final Integer b() {
        return this.f92394a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f92394a.equals(qVar.b()) && this.f92395b.equals(qVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f92394a.hashCode() ^ 1000003) * 1000003) ^ this.f92395b.hashCode();
    }

    public final String toString() {
        String string = this.f92395b.toString();
        Integer num = this.f92394a;
        StringBuilder sb5 = new StringBuilder(num.toString().length() + 55 + string.length() + 1);
        sb5.append("EVChargeOptions{connectorCount=");
        sb5.append(num);
        sb5.append(", connectorAggregations=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
