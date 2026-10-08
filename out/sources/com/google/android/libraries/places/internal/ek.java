package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ek extends az implements i00 {
    private static final ek zzm;
    private static volatile p00 zzn;
    private int zzb;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private int zzl;

    static {
        ek ekVar = new ek();
        zzm = ekVar;
        az.r(ek.class, ekVar);
    }

    private ek() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = ci.f31901a;
            ez ezVar2 = dj.f32046a;
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", ezVar, "zzi", "zzj", "zzk", ezVar2, "zzl", ezVar2});
        }
        if (i16 == 3) {
            return new ek();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new bh(bArr);
        }
        if (i16 == 5) {
            return zzm;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzn;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ek.class) {
            try {
                vyVar = zzn;
                if (vyVar == null) {
                    vyVar = new vy(zzm);
                    zzn = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
