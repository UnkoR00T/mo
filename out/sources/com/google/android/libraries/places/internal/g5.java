package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class g5 extends az implements i00 {
    private static final g5 zzx;
    private static volatile p00 zzy;
    private int zzb;
    private long zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private y zzv;
    private y zzw;

    static {
        g5 g5Var = new g5();
        zzx = g5Var;
        az.r(g5.class, g5Var);
    }

    private g5() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011င\u0010\u0012ဉ\u0011\u0013ဉ\u0012", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        }
        if (i16 == 3) {
            return new g5();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new f5(bArr);
        }
        if (i16 == 5) {
            return zzx;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzy;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (g5.class) {
            try {
                vyVar = zzy;
                if (vyVar == null) {
                    vyVar = new vy(zzx);
                    zzy = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
