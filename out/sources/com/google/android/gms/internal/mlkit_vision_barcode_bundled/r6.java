package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class r6 extends l3 implements s4 {
    private static final r6 zzb;
    private int zzd;
    private int zze;
    private y8 zzf;
    private k8 zzg;
    private m8 zzh;

    static {
        r6 r6Var = new r6();
        zzb = r6Var;
        l3.C(r6.class, r6Var);
    }

    private r6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", r7.f30225a, "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new r6();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new q6(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
