package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class a7 extends l3 implements s4 {
    private static final a7 zzb;
    private int zzd;
    private String zze = "";
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        a7 a7Var = new a7();
        zzb = a7Var;
        l3.C(a7.class, a7Var);
    }

    private a7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", z6.f30348a, "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new a7();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new y6(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
