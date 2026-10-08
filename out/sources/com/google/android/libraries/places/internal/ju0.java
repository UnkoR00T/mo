package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ju0 extends az implements i00 {
    private static final ju0 zzm;
    private static volatile p00 zzn;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        ju0 ju0Var = new ju0();
        zzm = ju0Var;
        az.r(ju0.class, ju0Var);
    }

    private ju0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", qu0.f33449a, "zzj", pu0.f33352a, "zzk", ou0.f33235a, "zzl"});
        }
        if (i16 == 3) {
            return new ju0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new iu0(bArr);
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
        synchronized (ju0.class) {
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
