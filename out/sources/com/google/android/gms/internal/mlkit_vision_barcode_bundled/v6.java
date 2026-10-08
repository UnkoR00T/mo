package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class v6 extends l3 implements s4 {
    private static final v6 zzb;
    private int zzd;
    private int zze = -1;

    static {
        v6 v6Var = new v6();
        zzb = v6Var;
        l3.C(v6.class, v6Var);
    }

    private v6() {
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
            return new v6();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new u6(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
