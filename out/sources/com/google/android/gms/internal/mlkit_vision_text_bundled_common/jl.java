package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class jl implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f30465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30466b = 2;

    protected jl() {
    }

    protected abstract Object a();

    protected final Object c() {
        this.f30466b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f30466b;
        if (i15 == 4) {
            throw new IllegalStateException();
        }
        int i16 = i15 - 1;
        if (i15 == 0) {
            throw null;
        }
        if (i16 == 0) {
            return true;
        }
        if (i16 != 2) {
            this.f30466b = 4;
            this.f30465a = a();
            if (this.f30466b != 3) {
                this.f30466b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f30466b = 2;
        Object obj = this.f30465a;
        this.f30465a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
