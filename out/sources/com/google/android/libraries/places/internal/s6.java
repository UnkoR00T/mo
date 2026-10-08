package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s6 extends az implements i00 {
    private static final s6 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private p6 zze;
    private p6 zzf;
    private byte zzg = 2;

    static {
        s6 s6Var = new s6();
        zzh = s6Var;
        az.r(s6.class, s6Var);
    }

    private s6() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new s6();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new r6(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            this.zzg = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (s6.class) {
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
