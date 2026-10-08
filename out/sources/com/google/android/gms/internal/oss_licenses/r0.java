package com.google.android.gms.internal.oss_licenses;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f30879a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f30880b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    q0 f30881c;

    public final r0 a(Object obj, Object obj2) {
        int i15 = this.f30880b + 1;
        Object[] objArr = this.f30879a;
        int length = objArr.length;
        int i16 = i15 + i15;
        if (i16 > length) {
            if (i16 > length) {
                length = length + (length >> 1) + 1;
                if (length < i16) {
                    int iHighestOneBit = Integer.highestOneBit(i16 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.f30879a = Arrays.copyOf(objArr, length);
        }
        k0.a(obj, obj2);
        Object[] objArr2 = this.f30879a;
        int i17 = this.f30880b;
        int i18 = i17 + i17;
        objArr2[i18] = obj;
        objArr2[i18 + 1] = obj2;
        this.f30880b = i17 + 1;
        return this;
    }

    public final s0 b() {
        q0 q0Var = this.f30881c;
        if (q0Var != null) {
            throw q0Var.a();
        }
        a1 a1VarF = a1.f(this.f30880b, this.f30879a, this);
        q0 q0Var2 = this.f30881c;
        if (q0Var2 == null) {
            return a1VarF;
        }
        throw q0Var2.a();
    }
}
