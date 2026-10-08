package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 extends l3 implements s4 {
    private static final i7 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private s3 zzg = l3.r();
    private int zzh;

    static {
        i7 i7Var = new i7();
        zzb = i7Var;
        l3.C(i7.class, i7Var);
    }

    private i7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", g7.f29730a, "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new i7();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new f7(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
