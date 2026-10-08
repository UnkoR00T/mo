package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class c8 extends l3 implements s4 {
    private static final c8 zzb;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private j2 zzh = j2.f29738b;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        c8 c8Var = new c8();
        zzb = c8Var;
        l3.C(c8.class, c8Var);
    }

    private c8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            p3 p3Var = a8.f29642a;
            p3 p3Var2 = b8.f29656a;
            return l3.z(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", p3Var, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", p3Var2, "zzn", p3Var2, "zzo"});
        }
        if (i16 == 3) {
            return new c8();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new z7(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
