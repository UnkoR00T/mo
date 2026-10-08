package ch;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class b2 extends i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f25777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f25778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f25779f = 1;

    b2(Object[] objArr, int i15, int i16) {
        this.f25777d = objArr;
        this.f25778e = i15;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        t.a(i15, this.f25779f, "index");
        Object obj = this.f25777d[i15 + i15 + this.f25778e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25779f;
    }
}
