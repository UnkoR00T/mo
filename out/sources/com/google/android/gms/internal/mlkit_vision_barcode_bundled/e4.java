package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends l3 implements s4 {
    private static final e4 zzb;
    private int zzd;
    private e9 zzi;
    private e4 zzj;
    private s9 zzk;
    private byte zzl = 2;
    private String zze = "";
    private s3 zzf = l3.r();
    private s3 zzg = l3.r();
    private s3 zzh = l3.r();

    static {
        e4 e4Var = new e4();
        zzb = e4Var;
        l3.C(e4.class, e4Var);
        l3.j(e9.L(), e4Var, e4Var, null, 12208774, m6.f29776m, e4.class);
    }

    private e4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", i8.class, "zzh", i8.class, "zzg", h9.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new e4();
        }
        d2 d2Var = null;
        if (i16 == 4) {
            return new e3(d2Var);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
