package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class t6 extends l3 implements s4 {
    private static final t6 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        t6 t6Var = new t6();
        zzb = t6Var;
        l3.C(t6.class, t6Var);
    }

    private t6() {
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
            return new t6();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new s6(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
