package ve;

import r0.l1;

/* JADX INFO: loaded from: classes3.dex */
public final class b<K, V> extends r0.a<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f206275g;

    @Override // r0.l1, java.util.Map
    public void clear() {
        this.f206275g = 0;
        super.clear();
    }

    @Override // r0.l1
    public void g(l1<? extends K, ? extends V> l1Var) {
        this.f206275g = 0;
        super.g(l1Var);
    }

    @Override // r0.l1
    public V h(int i15) {
        this.f206275g = 0;
        return (V) super.h(i15);
    }

    @Override // r0.l1, java.util.Map
    public int hashCode() {
        if (this.f206275g == 0) {
            this.f206275g = super.hashCode();
        }
        return this.f206275g;
    }

    @Override // r0.l1
    public V i(int i15, V v15) {
        this.f206275g = 0;
        return (V) super.i(i15, v15);
    }

    @Override // r0.l1, java.util.Map
    public V put(K k15, V v15) {
        this.f206275g = 0;
        return (V) super.put(k15, v15);
    }
}
