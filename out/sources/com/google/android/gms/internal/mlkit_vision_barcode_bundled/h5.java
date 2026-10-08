package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class h5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f29732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h2 f29733b;

    /* synthetic */ h5(j2 j2Var, g5 g5Var) {
        if (!(j2Var instanceof j5)) {
            this.f29732a = null;
            this.f29733b = (h2) j2Var;
            return;
        }
        j5 j5Var = (j5) j2Var;
        ArrayDeque arrayDeque = new ArrayDeque(j5Var.j());
        this.f29732a = arrayDeque;
        arrayDeque.push(j5Var);
        this.f29733b = c(j5Var.f29746d);
    }

    private final h2 c(j2 j2Var) {
        while (j2Var instanceof j5) {
            j5 j5Var = (j5) j2Var;
            this.f29732a.push(j5Var);
            j2Var = j5Var.f29746d;
        }
        return (h2) j2Var;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h2 next() {
        h2 h2VarC;
        h2 h2Var = this.f29733b;
        if (h2Var == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f29732a;
            h2VarC = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            h2VarC = c(((j5) this.f29732a.pop()).f29747e);
        } while (h2VarC.h() == 0);
        this.f29733b = h2VarC;
        return h2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29733b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
