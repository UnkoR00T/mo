package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class m8 extends l3 implements s4 {
    private static final m8 zzb;
    private int zzd;
    private s3 zze = l3.r();
    private o8 zzf;
    private t6 zzg;

    static {
        m8 m8Var = new m8();
        zzb = m8Var;
        l3.C(m8.class, m8Var);
    }

    private m8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", y8.class, "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new m8();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new l8(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
