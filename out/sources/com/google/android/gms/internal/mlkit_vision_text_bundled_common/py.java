package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class py extends qy {
    py(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qy
    public final double a(Object obj, long j15) {
        return Double.longBitsToDouble(this.f30569a.getLong(obj, j15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qy
    public final float b(Object obj, long j15) {
        return Float.intBitsToFloat(this.f30569a.getInt(obj, j15));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ry.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ry.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ry.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ry.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qy
    public final void c(Object obj, long j15, boolean z15) {
        if (ry.f30623h) {
            ry.n(obj, j15, z15);
        } else {
            ry.o(obj, j15, z15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qy
    public final void d(Object obj, long j15, byte b15) {
        if (ry.f30623h) {
            ry.d(obj, j15, b15);
        } else {
            ry.e(obj, j15, b15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qy
    public final void e(Object obj, long j15, double d15) {
        this.f30569a.putLong(obj, j15, Double.doubleToLongBits(d15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qy
    public final void f(Object obj, long j15, float f15) {
        this.f30569a.putInt(obj, j15, Float.floatToIntBits(f15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qy
    public final boolean g(Object obj, long j15) {
        return ry.f30623h ? ry.y(obj, j15) : ry.z(obj, j15);
    }
}
