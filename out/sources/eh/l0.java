package eh;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class l0 extends r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f50753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f50754b;

    l0(Object obj, Object obj2) {
        this.f50753a = obj;
        this.f50754b = obj2;
    }

    @Override // eh.r, java.util.Map.Entry
    public final Object getKey() {
        return this.f50753a;
    }

    @Override // eh.r, java.util.Map.Entry
    public final Object getValue() {
        return this.f50754b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
