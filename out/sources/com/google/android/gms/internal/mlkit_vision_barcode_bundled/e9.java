package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class e9 extends i3 implements s4 {
    private static final e9 zzd;
    private byte zze = 2;

    static {
        e9 e9Var = new e9();
        zzd = e9Var;
        l3.C(e9.class, e9Var);
    }

    private e9() {
    }

    public static e9 L() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zze);
        }
        c9 c9Var = null;
        if (i16 == 2) {
            return l3.z(zzd, "\u0003\u0000", null);
        }
        if (i16 == 3) {
            return new e9();
        }
        if (i16 == 4) {
            return new d9(c9Var);
        }
        if (i16 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
