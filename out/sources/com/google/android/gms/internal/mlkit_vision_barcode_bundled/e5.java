package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f29707a = new ArrayDeque();

    /* synthetic */ e5(d5 d5Var) {
    }

    static /* bridge */ /* synthetic */ j2 a(e5 e5Var, j2 j2Var, j2 j2Var2) {
        e5Var.b(j2Var);
        e5Var.b(j2Var2);
        j2 j5Var = (j2) e5Var.f29707a.pop();
        while (!e5Var.f29707a.isEmpty()) {
            j5Var = new j5((j2) e5Var.f29707a.pop(), j5Var);
        }
        return j5Var;
    }

    private final void b(j2 j2Var) {
        i5 i5Var;
        if (!j2Var.k()) {
            if (!(j2Var instanceof j5)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(j2Var.getClass())));
            }
            j5 j5Var = (j5) j2Var;
            b(j5Var.f29746d);
            b(j5Var.f29747e);
            return;
        }
        int iC = c(j2Var.h());
        ArrayDeque arrayDeque = this.f29707a;
        int iQ = j5.Q(iC + 1);
        if (arrayDeque.isEmpty() || ((j2) this.f29707a.peek()).h() >= iQ) {
            this.f29707a.push(j2Var);
            return;
        }
        int iQ2 = j5.Q(iC);
        j2 j5Var2 = (j2) this.f29707a.pop();
        while (true) {
            i5Var = null;
            if (this.f29707a.isEmpty() || ((j2) this.f29707a.peek()).h() >= iQ2) {
                break;
            } else {
                j5Var2 = new j5((j2) this.f29707a.pop(), j5Var2);
            }
        }
        j5 j5Var3 = new j5(j5Var2, j2Var);
        while (!this.f29707a.isEmpty()) {
            int iC2 = c(j5Var3.h()) + 1;
            ArrayDeque arrayDeque2 = this.f29707a;
            if (((j2) arrayDeque2.peek()).h() >= j5.Q(iC2)) {
                break;
            } else {
                j5Var3 = new j5((j2) this.f29707a.pop(), j5Var3);
            }
        }
        this.f29707a.push(j5Var3);
    }

    private static final int c(int i15) {
        int iBinarySearch = Arrays.binarySearch(j5.f29744h, i15);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
