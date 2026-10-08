package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class p7 extends az implements i00 {
    private static final p7 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private long zze;
    private long zzf;

    static {
        p7 p7Var = new p7();
        zzg = p7Var;
        az.r(p7.class, p7Var);
    }

    private p7() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new p7();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new o7(bArr);
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
        synchronized (p7.class) {
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
