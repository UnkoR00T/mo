package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 extends l3 implements s4 {
    private static final h8 zzb;
    private int zzd;
    private int zze;

    static {
        h8 h8Var = new h8();
        zzb = h8Var;
        l3.C(h8.class, h8Var);
    }

    private h8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i16 == 3) {
            return new h8();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new g8(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
