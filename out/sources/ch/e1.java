package ch;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class e1 extends j0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f25846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f25847b;

    e1(Object obj, Object obj2) {
        this.f25846a = obj;
        this.f25847b = obj2;
    }

    @Override // ch.j0, java.util.Map.Entry
    public final Object getKey() {
        return this.f25846a;
    }

    @Override // ch.j0, java.util.Map.Entry
    public final Object getValue() {
        return this.f25847b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
