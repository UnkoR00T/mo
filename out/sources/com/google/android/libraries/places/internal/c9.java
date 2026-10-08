package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class c9 extends az implements i00 {
    private static final c9 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private long zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private float zzi;

    static {
        c9 c9Var = new c9();
        zzj = c9Var;
        az.r(c9.class, c9Var);
    }

    private c9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new c9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new b9(bArr);
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
        synchronized (c9.class) {
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
