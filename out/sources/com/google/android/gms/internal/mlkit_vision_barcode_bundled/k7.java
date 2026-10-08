package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class k7 extends l3 implements s4 {
    private static final k7 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        k7 k7Var = new k7();
        zzb = k7Var;
        l3.C(k7.class, k7Var);
    }

    private k7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", l7.f29759a, "zzf"});
        }
        if (i16 == 3) {
            return new k7();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new j7(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
