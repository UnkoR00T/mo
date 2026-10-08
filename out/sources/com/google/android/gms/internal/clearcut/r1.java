package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class r1<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f29530a;

    public r1(Iterator<Map.Entry<K, Object>> it) {
        this.f29530a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29530a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f29530a.next();
        return next.getValue() instanceof o1 ? new q1(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f29530a.remove();
    }
}
