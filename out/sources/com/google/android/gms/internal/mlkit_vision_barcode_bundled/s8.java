package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class s8 extends l3 implements s4 {
    private static final s8 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private int zzi;
    private t7 zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;

    static {
        s8 s8Var = new s8();
        zzb = s8Var;
        l3.C(s8.class, s8Var);
    }

    private s8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဂ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", t8.f30244a, "zzi", "zzj", "zzk", "zzl", u8.f30272a, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i16 == 3) {
            return new s8();
        }
        p6 p6Var = null;
        if (i16 == 4) {
            return new r8(p6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
