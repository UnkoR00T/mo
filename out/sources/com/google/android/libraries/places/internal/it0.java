package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class it0 extends az implements i00 {
    private static final it0 zze;
    private static volatile p00 zzf;
    private iz zzb = az.z();

    static {
        it0 it0Var = new it0();
        zze = it0Var;
        az.r(it0.class, it0Var);
    }

    private it0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", nt0.class});
        }
        if (i16 == 3) {
            return new it0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ht0(bArr);
        }
        if (i16 == 5) {
            return zze;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzf;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (it0.class) {
            try {
                vyVar = zzf;
                if (vyVar == null) {
                    vyVar = new vy(zze);
                    zzf = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
