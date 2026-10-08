package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 extends az implements i00 {
    private static final s1 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private int zze;
    private u1 zzf;
    private c2 zzg;
    private x1 zzh;
    private a2 zzi;

    static {
        s1 s1Var = new s1();
        zzj = s1Var;
        az.r(s1.class, s1Var);
    }

    private s1() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", r1.f33483a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new s1();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new q1(bArr);
        }
        if (i16 == 5) {
            return zzj;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzk;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (s1.class) {
            try {
                vyVar = zzk;
                if (vyVar == null) {
                    vyVar = new vy(zzj);
                    zzk = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
