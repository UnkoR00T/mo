package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ya extends az implements i00 {
    private static final ya zzs;
    private static volatile p00 zzt;
    private int zzb;
    private long zze;
    private ma zzf;
    private ma zzg;
    private hb zzh;
    private sa zzi;
    private ca zzj;
    private kb zzk;
    private mb zzl;
    private ab zzm;
    private y9 zzn;
    private ea zzo;
    private wa zzp;
    private cb zzq;
    private eb zzr;

    static {
        ya yaVar = new ya();
        zzs = yaVar;
        az.r(ya.class, yaVar);
    }

    private ya() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i16 == 3) {
            return new ya();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new xa(bArr);
        }
        if (i16 == 5) {
            return zzs;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzt;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ya.class) {
            try {
                vyVar = zzt;
                if (vyVar == null) {
                    vyVar = new vy(zzs);
                    zzt = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
