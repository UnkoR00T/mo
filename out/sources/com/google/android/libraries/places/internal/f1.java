package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends az implements i00 {
    private static final f1 zzy;
    private static volatile p00 zzz;
    private int zzb;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;

    static {
        f1 f1Var = new f1();
        zzy = f1Var;
        az.r(f1.class, f1Var);
    }

    private f1() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzy, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nင\t\u000bဇ\n\fင\u000b\rဇ\f\u000eင\r\u000fဇ\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013င\u0012\u0014ဋ\u0013", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx"});
        }
        if (i16 == 3) {
            return new f1();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new e1(bArr);
        }
        if (i16 == 5) {
            return zzy;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzz;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (f1.class) {
            try {
                vyVar = zzz;
                if (vyVar == null) {
                    vyVar = new vy(zzy);
                    zzz = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
