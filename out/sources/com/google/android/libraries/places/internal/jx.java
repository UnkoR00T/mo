package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
abstract class jx extends AbstractList implements iz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32677a;

    jx(boolean z15) {
        this.f32677a = z15;
    }

    private void f() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i15, Collection collection) {
        e();
        return super.addAll(i15, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        super.clear();
    }

    protected final void e() {
        if (this.f32677a) {
            return;
        }
        f();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i15 = 0; i15 < size; i15++) {
            if (!get(i15).equals(list.get(i15))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i15);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        e();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        e();
        return super.retainAll(collection);
    }

    @Override // com.google.android.libraries.places.internal.iz
    public final boolean zza() {
        return this.f32677a;
    }

    @Override // com.google.android.libraries.places.internal.iz
    public final void zzb() {
        if (this.f32677a) {
            this.f32677a = false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        return super.addAll(collection);
    }
}
