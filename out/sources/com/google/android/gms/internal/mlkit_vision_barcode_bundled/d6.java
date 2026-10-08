package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class d6 extends e6 {
    d6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e6
    public final double a(Object obj, long j15) {
        return Double.longBitsToDouble(this.f29708a.getLong(obj, j15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e6
    public final float b(Object obj, long j15) {
        return Float.intBitsToFloat(this.f29708a.getInt(obj, j15));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f6.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f6.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z15' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f6.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z15' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f6.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e6
    public final void c(Object obj, long j15, boolean z15) {
        if (f6.f29724h) {
            f6.n(obj, j15, z15);
        } else {
            f6.o(obj, j15, z15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e6
    public final void d(Object obj, long j15, byte b15) {
        if (f6.f29724h) {
            f6.d(obj, j15, b15);
        } else {
            f6.e(obj, j15, b15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e6
    public final void e(Object obj, long j15, double d15) {
        this.f29708a.putLong(obj, j15, Double.doubleToLongBits(d15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e6
    public final void f(Object obj, long j15, float f15) {
        this.f29708a.putInt(obj, j15, Float.floatToIntBits(f15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e6
    public final boolean g(Object obj, long j15) {
        return f6.f29724h ? f6.y(obj, j15) : f6.z(obj, j15);
    }
}
