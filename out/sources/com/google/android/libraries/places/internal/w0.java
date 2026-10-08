package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends az implements i00 {
    private static final w0 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private q0 zze;
    private h1 zzf;
    private n1 zzg;
    private x6 zzh;
    private int zzi;

    static {
        w0 w0Var = new w0();
        zzj = w0Var;
        az.r(w0.class, w0Var);
    }

    private w0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဋ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new w0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new v0(bArr);
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
        synchronized (w0.class) {
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
