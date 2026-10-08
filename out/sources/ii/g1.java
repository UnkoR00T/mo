package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class g1 extends u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f92455a;

    g1() {
    }

    @Override // ii.u.a
    public final List<v> b() {
        List<v> list = this.f92455a;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"fuelPrices\" has not been set");
    }

    @Override // ii.u.a
    public final u.a c(List<v> list) {
        if (list == null) {
            throw new NullPointerException("Null fuelPrices");
        }
        this.f92455a = list;
        return this;
    }

    @Override // ii.u.a
    final u d() {
        List list = this.f92455a;
        if (list != null) {
            return new s4(list);
        }
        throw new IllegalStateException("Missing required properties: fuelPrices");
    }
}
