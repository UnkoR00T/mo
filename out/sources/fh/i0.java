package fh;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class i0 extends n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f63090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f63091b;

    i0(Object obj, Object obj2) {
        this.f63090a = obj;
        this.f63091b = obj2;
    }

    @Override // fh.n, java.util.Map.Entry
    public final Object getKey() {
        return this.f63090a;
    }

    @Override // fh.n, java.util.Map.Entry
    public final Object getValue() {
        return this.f63091b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
