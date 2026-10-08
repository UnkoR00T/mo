package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class pi extends az implements i00 {
    private static final pi zzg;
    private static volatile p00 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        pi piVar = new pi();
        zzg = piVar;
        az.r(pi.class, piVar);
    }

    private pi() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", oi.f33185a, "zzf"});
        }
        if (i16 == 3) {
            return new pi();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ni(bArr);
        }
        if (i16 == 5) {
            return zzg;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzh;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (pi.class) {
            try {
                vyVar = zzh;
                if (vyVar == null) {
                    vyVar = new vy(zzg);
                    zzh = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
