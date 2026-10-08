package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yr0 f31712a = new yr0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f31713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference[] f31714c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        f31713b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i15 = 0; i15 < iHighestOneBit; i15++) {
            atomicReferenceArr[i15] = new AtomicReference();
        }
        f31714c = atomicReferenceArr;
    }

    public static final yr0 a() {
        AtomicReference atomicReferenceC = c();
        yr0 yr0Var = f31712a;
        yr0 yr0Var2 = (yr0) atomicReferenceC.getAndSet(yr0Var);
        if (yr0Var2 == yr0Var) {
            return new yr0();
        }
        if (yr0Var2 == null) {
            atomicReferenceC.set(null);
            return new yr0();
        }
        atomicReferenceC.set(yr0Var2.f34432f);
        yr0Var2.f34432f = null;
        yr0Var2.f34429c = 0;
        return yr0Var2;
    }

    public static final void b(yr0 yr0Var) {
        if (yr0Var.f34432f != null || yr0Var.f34433g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (yr0Var.f34430d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        yr0 yr0Var2 = f31712a;
        yr0 yr0Var3 = (yr0) atomicReferenceC.getAndSet(yr0Var2);
        if (yr0Var3 != yr0Var2) {
            int i15 = yr0Var3 != null ? yr0Var3.f34429c : 0;
            if (i15 >= 65536) {
                atomicReferenceC.set(yr0Var3);
                return;
            }
            yr0Var.f34432f = yr0Var3;
            yr0Var.f34428b = 0;
            yr0Var.f34429c = i15 + PKIFailureInfo.certRevoked;
            atomicReferenceC.set(yr0Var);
        }
    }

    private static final AtomicReference c() {
        return f31714c[(int) (Thread.currentThread().getId() & (((long) f31713b) - 1))];
    }
}
