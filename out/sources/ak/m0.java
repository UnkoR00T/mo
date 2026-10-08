package ak;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
class m0<K, V> extends f<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final K f6905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final V f6906b;

    m0(K k15, V v15) {
        this.f6905a = k15;
        this.f6906b = v15;
    }

    @Override // ak.f, java.util.Map.Entry
    public final K getKey() {
        return this.f6905a;
    }

    @Override // ak.f, java.util.Map.Entry
    public final V getValue() {
        return this.f6906b;
    }

    @Override // ak.f, java.util.Map.Entry
    public final V setValue(V v15) {
        throw new UnsupportedOperationException();
    }
}
