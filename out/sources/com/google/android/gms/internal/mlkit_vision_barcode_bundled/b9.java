package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class b9 extends l3 implements s4 {
    private static final b9 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        b9 b9Var = new b9();
        zzb = b9Var;
        l3.C(b9.class, b9Var);
    }

    private b9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", z8.f30349a, "zzg"});
        }
        if (i16 == 3) {
            return new b9();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new a9(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
