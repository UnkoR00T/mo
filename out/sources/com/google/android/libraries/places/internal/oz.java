package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class oz implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f33246a;

    public oz(Iterator it) {
        this.f33246a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33246a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f33246a.next();
        return entry.getValue() instanceof pz ? new nz(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f33246a.remove();
    }
}
