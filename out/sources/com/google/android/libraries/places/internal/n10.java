package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class n10 extends o10 {
    n10(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.o10
    public final void a(Object obj, long j15, byte b15) {
        if (p10.f33254g) {
            p10.c(obj, j15, b15);
        } else {
            p10.d(obj, j15, b15);
        }
    }

    @Override // com.google.android.libraries.places.internal.o10
    public final boolean b(Object obj, long j15) {
        return p10.f33254g ? p10.x(obj, j15) : p10.y(obj, j15);
    }

    /* JADX WARN: Failed to inline method: com.google.android.libraries.places.internal.p10.A(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.libraries.places.internal.p10.z(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.libraries.places.internal.p10.A(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.libraries.places.internal.p10.z(java.lang.Object, long, boolean):void */
    @Override // com.google.android.libraries.places.internal.o10
    public final void c(Object obj, long j15, boolean z15) {
        if (p10.f33254g) {
            p10.z(obj, j15, z15);
        } else {
            p10.A(obj, j15, z15);
        }
    }

    @Override // com.google.android.libraries.places.internal.o10
    public final float d(Object obj, long j15) {
        return Float.intBitsToFloat(this.f33119a.getInt(obj, j15));
    }

    @Override // com.google.android.libraries.places.internal.o10
    public final void e(Object obj, long j15, float f15) {
        this.f33119a.putInt(obj, j15, Float.floatToIntBits(f15));
    }

    @Override // com.google.android.libraries.places.internal.o10
    public final double f(Object obj, long j15) {
        return Double.longBitsToDouble(this.f33119a.getLong(obj, j15));
    }

    @Override // com.google.android.libraries.places.internal.o10
    public final void g(Object obj, long j15, double d15) {
        this.f33119a.putLong(obj, j15, Double.doubleToLongBits(d15));
    }
}
