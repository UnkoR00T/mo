package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class k6 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f92555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f92556b;

    k6(List list, List list2) {
        this.f92555a = list;
        this.f92556b = list2;
    }

    @Override // ii.d
    public final List<e> b() {
        return this.f92556b;
    }

    @Override // ii.d
    public final List<y> c() {
        return this.f92555a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            List list = this.f92555a;
            if (list != null ? list.equals(dVar.c()) : dVar.c() == null) {
                List list2 = this.f92556b;
                if (list2 != null ? list2.equals(dVar.b()) : dVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f92555a;
        int iHashCode = list == null ? 0 : list.hashCode();
        List list2 = this.f92556b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List list = this.f92556b;
        String strValueOf = String.valueOf(this.f92555a);
        String strValueOf2 = String.valueOf(list);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 36 + strValueOf2.length() + 1);
        sb5.append("AddressDescriptor{landmarks=");
        sb5.append(strValueOf);
        sb5.append(", areas=");
        sb5.append(strValueOf2);
        sb5.append("}");
        return sb5.toString();
    }
}
