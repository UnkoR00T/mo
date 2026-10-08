package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class z3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f30337a;

    public z3(Iterator it) {
        this.f30337a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30337a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f30337a.next();
        return entry.getValue() instanceof a4 ? new y3(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30337a.remove();
    }
}
