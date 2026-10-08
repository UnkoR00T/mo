package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 extends az implements i00 {
    private static final x5 zzv;
    private static volatile p00 zzw;
    private int zzb;
    private Object zzf;
    private q5 zzg;
    private m5 zzh;
    private u5 zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private int zze = 0;
    private hz zzs = az.y();
    private hz zzt = az.y();
    private iz zzu = az.z();

    static {
        x5 x5Var = new x5();
        zzv = x5Var;
        az.r(x5.class, x5Var);
    }

    private x5() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = b6.f31745a;
            ez ezVar2 = a6.f31567a;
            return az.s(zzv, "\u0001\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00035\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006\u083f\u0000\u00077\u0000\bဂ\u0005\t᠌\u0006\n᠌\u0007\u000bဂ\b\fင\t\rဂ\n\u000eဂ\u000b\u000f%\u0010%\u0011\u001b\u0012ဉ\u0002", new Object[]{"zzf", "zze", "zzb", "zzg", "zzh", "zzj", ezVar, "zzk", ezVar2, ys0.a(), "zzl", "zzm", ezVar, "zzn", ezVar2, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", w5.class, "zzi"});
        }
        if (i16 == 3) {
            return new x5();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new k5(bArr);
        }
        if (i16 == 5) {
            return zzv;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzw;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (x5.class) {
            try {
                vyVar = zzw;
                if (vyVar == null) {
                    vyVar = new vy(zzv);
                    zzw = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
