package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class qm implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f30562a;

    qm(Iterator it) {
        it.getClass();
        this.f30562a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30562a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f30562a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30562a.remove();
    }
}
