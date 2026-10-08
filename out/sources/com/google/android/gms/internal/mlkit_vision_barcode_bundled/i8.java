package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 extends l3 implements s4 {
    private static final i8 zzb;
    private int zzd;
    private int zzg;
    private p9 zzh;
    private k9 zzi;
    private e9 zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private s3 zzf = l3.r();
    private s3 zzl = l3.r();

    static {
        i8 i8Var = new i8();
        zzb = i8Var;
        l3.C(i8.class, i8Var);
    }

    private i8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", h7.f29734a, "zzf", i.class, "zzg", "zzh", "zzi", "zzk", "zzl", l.class, "zzj"});
        }
        if (i16 == 3) {
            return new i8();
        }
        f5 f5Var = null;
        if (i16 == 4) {
            return new g6(f5Var);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
