package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dx extends az implements i00 {
    private static final dx zzi;
    private static volatile p00 zzj;
    private iz zzb = az.z();
    private iz zze = az.z();
    private iz zzf = az.z();
    private String zzg = "";
    private String zzh = "";

    static {
        dx dxVar = new dx();
        zzi = dxVar;
        az.r(dx.class, dxVar);
    }

    private dx() {
    }

    public static dx M() {
        return zzi;
    }

    public final List I() {
        return this.zzb;
    }

    public final List J() {
        return this.zze;
    }

    public final String K() {
        return this.zzg;
    }

    public final String L() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"zzb", ov.class, "zze", jw.class, "zzf", qs.class, "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new dx();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new cx(bArr);
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
        synchronized (dx.class) {
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
