package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class i8 extends az implements i00 {
    private static final i8 zzu;
    private static volatile p00 zzv;
    private int zzb;
    private long zze;
    private j0 zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;

    static {
        i8 i8Var = new i8();
        zzu = i8Var;
        az.r(i8.class, i8Var);
    }

    private i8() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzu, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဇ\t\u000bင\n\fဂ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i16 == 3) {
            return new i8();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new h8(bArr);
        }
        if (i16 == 5) {
            return zzu;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzv;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (i8.class) {
            try {
                vyVar = zzv;
                if (vyVar == null) {
                    vyVar = new vy(zzu);
                    zzv = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
