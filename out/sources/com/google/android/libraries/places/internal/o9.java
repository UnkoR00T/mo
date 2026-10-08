package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class o9 extends az implements i00 {
    private static final o9 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private int zze;
    private float zzf;
    private int zzg;
    private float zzh;
    private int zzi;

    static {
        o9 o9Var = new o9();
        zzj = o9Var;
        az.r(o9.class, o9Var);
    }

    private o9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new o9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new n9(bArr);
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
        synchronized (o9.class) {
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
