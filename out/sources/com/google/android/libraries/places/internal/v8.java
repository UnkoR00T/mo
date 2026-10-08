package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class v8 extends az implements i00 {
    private static final v8 zzi;
    private static volatile p00 zzj;
    private int zzb;
    private long zze;
    private long zzf;
    private int zzg;
    private int zzh;

    static {
        v8 v8Var = new v8();
        zzi = v8Var;
        az.r(v8.class, v8Var);
    }

    private v8() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new v8();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new u8(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (v8.class) {
            try {
                vyVar = zzj;
                if (vyVar == null) {
                    vyVar = new vy(zzi);
                    zzj = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
