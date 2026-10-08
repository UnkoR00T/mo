package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class qd extends az implements i00 {
    private static final qd zzq;
    private static volatile p00 zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private iz zzm = az.z();
    private int zzn;
    private int zzo;
    private int zzp;

    static {
        qd qdVar = new qd();
        zzq = qdVar;
        az.r(qd.class, qdVar);
    }

    private qd() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b\nင\b\u000b᠌\t\fင\n", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", pd.class, "zzn", "zzo", sc.f33675a, "zzp"});
        }
        if (i16 == 3) {
            return new qd();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new nd(bArr);
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
        synchronized (qd.class) {
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
