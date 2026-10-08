package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ys extends az implements i00 {
    private static final ys zzg;
    private static volatile p00 zzh;
    private int zzb;
    private iz zze = az.z();
    private iz zzf = az.z();

    static {
        ys ysVar = new ys();
        zzg = ysVar;
        az.r(ys.class, ysVar);
    }

    private ys() {
    }

    public static ys K() {
        return zzg;
    }

    public final int I() {
        return this.zzb;
    }

    public final List J() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"zzb", "zze", vs.class, "zzf", xs.class});
        }
        if (i16 == 3) {
            return new ys();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ts(bArr);
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
        synchronized (ys.class) {
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
