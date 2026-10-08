package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class nh extends az implements i00 {
    private static final nh zzb;
    private static volatile p00 zze;

    static {
        nh nhVar = new nh();
        zzb = nhVar;
        az.r(nh.class, nhVar);
    }

    private nh() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (i16 == 2) {
            return az.s(zzb, "\u0001\u0000", null);
        }
        if (i16 == 3) {
            return new nh();
        }
        if (i16 == 4) {
            return new mh(bArr);
        }
        if (i16 == 5) {
            return zzb;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zze;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (nh.class) {
            try {
                vyVar = zze;
                if (vyVar == null) {
                    vyVar = new vy(zzb);
                    zze = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
