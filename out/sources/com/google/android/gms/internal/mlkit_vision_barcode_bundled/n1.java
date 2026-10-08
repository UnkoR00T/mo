package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends l3 implements s4 {
    private static final n1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        l3.C(n1.class, n1Var);
    }

    private n1() {
    }

    public static n1 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new n1();
        }
        h1 h1Var = null;
        if (i16 == 4) {
            return new m1(h1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zze;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzi;
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzf;
    }

    public final String R() {
        return this.zzk;
    }
}
