package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class a3<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f30959a;

    public a3(Iterator<Map.Entry<K, Object>> it) {
        this.f30959a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30959a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f30959a.next();
        return next.getValue() instanceof z2 ? new b3(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30959a.remove();
    }
}
