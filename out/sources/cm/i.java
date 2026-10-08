package cm;

import bm.b;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class i<T extends bm.b> implements bm.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLng f28221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection<T> f28222b = new LinkedHashSet();

    public i(LatLng latLng) {
        this.f28221a = latLng;
    }

    @Override // bm.a
    public Collection<T> a() {
        return this.f28222b;
    }

    public boolean b(T t15) {
        return this.f28222b.add(t15);
    }

    public boolean c(T t15) {
        return this.f28222b.remove(t15);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f28221a.equals(this.f28221a) && iVar.f28222b.equals(this.f28222b);
    }

    @Override // bm.a
    public LatLng getPosition() {
        return this.f28221a;
    }

    @Override // bm.a
    public int getSize() {
        return this.f28222b.size();
    }

    public int hashCode() {
        return this.f28221a.hashCode() + this.f28222b.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f28221a + ", mItems.size=" + this.f28222b.size() + '}';
    }
}
