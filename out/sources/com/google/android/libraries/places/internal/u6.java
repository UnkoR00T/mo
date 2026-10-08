package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class u6 extends az implements i00 {
    private static final u6 zzr;
    private static volatile p00 zzs;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
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

    static {
        u6 u6Var = new u6();
        zzr = u6Var;
        az.r(u6.class, u6Var);
    }

    private u6() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i16 == 3) {
            return new u6();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new t6(bArr);
        }
        if (i16 == 5) {
            return zzr;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzs;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (u6.class) {
            try {
                vyVar = zzs;
                if (vyVar == null) {
                    vyVar = new vy(zzr);
                    zzs = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
