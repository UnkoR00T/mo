package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class h5 extends AbstractList<String> implements f3, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f3 f31067a;

    public h5(f3 f3Var) {
        this.f31067a = f3Var;
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final void C3(e1 e1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final List<?> c() {
        return this.f31067a.c();
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final f3 d() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        return (String) this.f31067a.get(i15);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new j5(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i15) {
        return new g5(this, i15);
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final Object p(int i15) {
        return this.f31067a.p(i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31067a.size();
    }
}
