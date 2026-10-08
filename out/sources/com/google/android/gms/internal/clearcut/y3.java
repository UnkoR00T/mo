package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 extends AbstractList<String> implements u1, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f29607a;

    public y3(u1 u1Var) {
        this.f29607a = u1Var;
    }

    @Override // com.google.android.gms.internal.clearcut.u1
    public final List<?> I2() {
        return this.f29607a.I2();
    }

    @Override // com.google.android.gms.internal.clearcut.u1
    public final Object K(int i15) {
        return this.f29607a.K(i15);
    }

    @Override // com.google.android.gms.internal.clearcut.u1
    public final u1 Q3() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        return (String) this.f29607a.get(i15);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new a4(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i15) {
        return new z3(this, i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29607a.size();
    }
}
