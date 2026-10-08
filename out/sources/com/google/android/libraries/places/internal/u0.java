package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends az implements i00 {
    private static final u0 zzt;
    private static volatile p00 zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;

    static {
        u0 u0Var = new u0();
        zzt = u0Var;
        az.r(u0.class, u0Var);
    }

    private u0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f\u000eဋ\r\u000fဋ\u000e", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i16 == 3) {
            return new u0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new t0(bArr);
        }
        if (i16 == 5) {
            return zzt;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzu;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (u0.class) {
            try {
                vyVar = zzu;
                if (vyVar == null) {
                    vyVar = new vy(zzt);
                    zzu = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
