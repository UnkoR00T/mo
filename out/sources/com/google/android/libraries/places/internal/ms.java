package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ms extends az implements i00 {
    private static final ms zzf;
    private static volatile p00 zzg;
    private int zzb;
    private int zze;

    static {
        ms msVar = new ms();
        zzf = msVar;
        az.r(ms.class, msVar);
    }

    private ms() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        if (i16 == 3) {
            return new ms();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ls(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ms.class) {
            try {
                vyVar = zzg;
                if (vyVar == null) {
                    vyVar = new vy(zzf);
                    zzg = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
