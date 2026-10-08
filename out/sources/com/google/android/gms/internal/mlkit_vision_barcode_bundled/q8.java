package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class q8 extends l3 implements s4 {
    private static final q8 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        q8 q8Var = new q8();
        zzb = q8Var;
        l3.C(q8.class, q8Var);
    }

    private q8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new q8();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new p8(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
