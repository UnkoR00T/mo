package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class x7 extends az implements i00 {
    private static final x7 zzq;
    private static volatile p00 zzr;
    private int zzb;
    private hz zze = az.y();
    private hz zzf = az.y();
    private hz zzg = az.y();
    private hz zzh = az.y();
    private hz zzi = az.y();
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private l7 zzo;
    private int zzp;

    static {
        x7 x7Var = new x7();
        zzq = x7Var;
        az.r(x7.class, x7Var);
    }

    private x7() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0000\u0001\u0014\u0002\u0014\u0003\u0014\u0004\u0014\u0005\u0014\u0006င\u0000\u0007᠌\u0001\b᠌\u0002\t᠌\u0003\nင\u0004\u000bဉ\u0005\fင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", w7.f34125a, "zzl", v7.f34051a, "zzm", t7.f33759a, "zzn", "zzo", "zzp"});
        }
        if (i16 == 3) {
            return new x7();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new u7(bArr);
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
        synchronized (x7.class) {
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
