package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class i9 extends az implements i00 {
    private static final i9 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private long zze;
    private long zzf;
    private long zzg;

    static {
        i9 i9Var = new i9();
        zzh = i9Var;
        az.r(i9.class, i9Var);
    }

    private i9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new i9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new h9(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (i9.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
