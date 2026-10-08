package cm;

import bm.b;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class h<T extends bm.b> extends a<T> implements g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b<T> f28220b;

    public h(b<T> bVar) {
        this.f28220b = bVar;
    }

    @Override // cm.b
    public Collection<T> a() {
        return this.f28220b.a();
    }

    @Override // cm.g
    public void b(CameraPosition cameraPosition) {
    }

    @Override // cm.b
    public boolean c(Collection<T> collection) {
        return this.f28220b.c(collection);
    }

    @Override // cm.b
    public void d() {
        this.f28220b.d();
    }

    @Override // cm.g
    public boolean e() {
        return false;
    }

    @Override // cm.b
    public Set<? extends bm.a<T>> f(float f15) {
        return this.f28220b.f(f15);
    }

    @Override // cm.b
    public int g() {
        return this.f28220b.g();
    }
}
