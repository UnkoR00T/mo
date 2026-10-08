package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class s9 extends l3 implements s4 {
    private static final s9 zzb;
    private int zzd;
    private b zze;

    static {
        s9 s9Var = new s9();
        zzb = s9Var;
        l3.C(s9.class, s9Var);
    }

    private s9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i16 == 3) {
            return new s9();
        }
        q9 q9Var = null;
        if (i16 == 4) {
            return new r9(q9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
