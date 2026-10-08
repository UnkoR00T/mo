package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class e7 extends az implements i00 {
    private static final e7 zzf;
    private static volatile p00 zzg;
    private int zzb;
    private int zze;

    static {
        e7 e7Var = new e7();
        zzf = e7Var;
        az.r(e7.class, e7Var);
    }

    private e7() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", d7.f31980a});
        }
        if (i16 == 3) {
            return new e7();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new c7(bArr);
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
        synchronized (e7.class) {
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
