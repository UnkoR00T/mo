package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class q7 extends l3 implements s4 {
    private static final q7 zzb;
    private int zzd;
    private int zze;
    private i7 zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private s3 zzf = l3.r();
    private int zzg = -1;
    private String zzi = "";
    private r3 zzl = l3.q();
    private String zzm = "";

    static {
        q7 q7Var = new q7();
        zzb = q7Var;
        l3.C(q7.class, q7Var);
    }

    private q7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", l7.f29759a, "zzf", k7.class, "zzg", "zzh", "zzi", "zzj", n7.f30172a, "zzk", o7.f30187a, "zzl", "zzm", "zzn", p7.f30196a});
        }
        if (i16 == 3) {
            return new q7();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new m7(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
