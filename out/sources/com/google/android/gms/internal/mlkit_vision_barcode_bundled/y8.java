package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class y8 extends l3 implements s4 {
    private static final y8 zzb;
    private int zzd;
    private int zze;
    private s8 zzf;
    private w7 zzg;
    private v6 zzh;
    private h8 zzi;
    private q7 zzj;
    private a7 zzk;
    private b9 zzl;
    private d7 zzm;
    private c8 zzn;
    private f8 zzo;
    private f8 zzp;
    private f8 zzq;
    private boolean zzr;
    private t7 zzs;
    private int zzt = -1;
    private boolean zzu;
    private w8 zzv;
    private x6 zzw;

    static {
        y8 y8Var = new y8();
        zzb = y8Var;
        l3.C(y8.class, y8Var);
    }

    private y8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\n\u0007ဉ\u000b\bဉ\f\tဇ\r\nဉ\u0005\u000bဉ\u000e\fဉ\u0006\rဉ\u0007\u000eင\u000f\u000fဉ\b\u0010ဇ\u0010\u0011ဉ\u0011\u0012ဉ\t\u0013ဉ\u0012", new Object[]{"zzd", "zze", e7.f29709a, "zzf", "zzg", "zzh", "zzi", "zzo", "zzp", "zzq", "zzr", "zzj", "zzs", "zzk", "zzl", "zzt", "zzm", "zzu", "zzv", "zzn", "zzw"});
        }
        if (i16 == 3) {
            return new y8();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new x8(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
