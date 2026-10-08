package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class az0 extends az implements i00 {
    private static final az0 zzq;
    private static volatile p00 zzr;
    private int zzb;
    private pt0 zze;
    private vb zzf;
    private i61 zzg;
    private d71 zzh;
    private r31 zzi;
    private k zzj;
    private e11 zzk;
    private z81 zzl;
    private p5 zzm;
    private n3 zzn;
    private v91 zzo;
    private l1 zzp;

    static {
        az0 az0Var = new az0();
        zzq = az0Var;
        az.r(az0.class, az0Var);
    }

    private az0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဉ\t\nဉ\u0000\u000bဉ\n\fဉ\u000b", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zze", "zzo", "zzp"});
        }
        if (i16 == 3) {
            return new az0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new by0(bArr);
        }
        if (i16 == 5) {
            return zzq;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzr;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (az0.class) {
            try {
                vyVar = zzr;
                if (vyVar == null) {
                    vyVar = new vy(zzq);
                    zzr = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
