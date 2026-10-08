package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class dp0 extends az implements i00 {
    private static final dp0 zzu;
    private static volatile p00 zzv;
    private int zzb;
    private gt0 zze;
    private wh0 zzf;
    private iz zzg = az.z();
    private iz zzh = az.z();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private boolean zzs;
    private boolean zzt;

    static {
        dp0 dp0Var = new dp0();
        zzu = dp0Var;
        az.r(dp0.class, dp0Var);
    }

    private dp0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzu, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\fဂ\t\rဂ\n\u000e᠌\u000b\u000fဇ\f\u0010ဇ\r", new Object[]{"zzb", "zze", "zzf", "zzg", bn0.class, "zzh", bn0.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", co0.f31920a, "zzs", "zzt"});
        }
        if (i16 == 3) {
            return new dp0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zk0(bArr);
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
        synchronized (dp0.class) {
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
