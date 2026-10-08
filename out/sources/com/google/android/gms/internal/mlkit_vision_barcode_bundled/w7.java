package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class w7 extends l3 implements s4 {
    private static final w7 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        w7 w7Var = new w7();
        zzb = w7Var;
        l3.C(w7.class, w7Var);
    }

    private w7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            p3 p3Var = y7.f30318a;
            p3 p3Var2 = u7.f30271a;
            p3 p3Var3 = x7.f30310a;
            return l3.z(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", p3Var, "zzg", "zzh", p3Var2, "zzi", p3Var3, "zzj", p3Var3, "zzk", p3Var3, "zzl", "zzm"});
        }
        if (i16 == 3) {
            return new w7();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new v7(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
