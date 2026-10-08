package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class h9 extends l3 implements s4 {
    private static final h9 zzb;
    private int zzd;
    private s3 zze = l3.r();
    private String zzf = "";

    static {
        h9 h9Var = new h9();
        zzb = h9Var;
        l3.C(h9.class, h9Var);
    }

    private h9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new h9();
        }
        f9 f9Var = null;
        if (i16 == 4) {
            return new g9(f9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
