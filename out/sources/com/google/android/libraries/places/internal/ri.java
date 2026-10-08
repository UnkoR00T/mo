package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ri extends az implements i00 {
    private static final ri zzf;
    private static volatile p00 zzg;
    private int zzb;
    private int zze;

    static {
        ri riVar = new ri();
        zzf = riVar;
        az.r(ri.class, riVar);
    }

    private ri() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", ne.f33056a});
        }
        if (i16 == 3) {
            return new ri();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new qi(bArr);
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
        synchronized (ri.class) {
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
