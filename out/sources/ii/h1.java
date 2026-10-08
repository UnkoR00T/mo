package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class h1 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f92463a;

    h1(List list) {
        if (list == null) {
            throw new NullPointerException("Null fuelPrices");
        }
        this.f92463a = list;
    }

    @Override // ii.u
    public final List<v> a() {
        return this.f92463a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return this.f92463a.equals(((u) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f92463a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.f92463a.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 24);
        sb5.append("FuelOptions{fuelPrices=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
