package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class o8 extends l3 implements s4 {
    private static final o8 zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        o8 o8Var = new o8();
        zzb = o8Var;
        l3.C(o8.class, o8Var);
    }

    private o8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new o8();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new n8(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
