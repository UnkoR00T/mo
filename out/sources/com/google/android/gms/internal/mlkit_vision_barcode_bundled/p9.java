package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class p9 extends l3 implements s4 {
    private static final p9 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private e9 zzg;
    private byte zzh = 2;

    static {
        p9 p9Var = new p9();
        zzb = p9Var;
        l3.C(p9.class, p9Var);
        l3.j(e9.L(), p9Var, p9Var, null, 13258261, m6.f29776m, p9.class);
    }

    private p9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new p9();
        }
        n9 n9Var = null;
        if (i16 == 4) {
            return new o9(n9Var);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
