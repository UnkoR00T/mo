package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vr extends az implements i00 {
    private static final vr zze;
    private static volatile p00 zzf;
    private iz zzb = az.z();

    static {
        vr vrVar = new vr();
        zze = vrVar;
        az.r(vr.class, vrVar);
    }

    private vr() {
    }

    public static vr J() {
        return zze;
    }

    public final List I() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", ur.class});
        }
        if (i16 == 3) {
            return new vr();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ir(bArr);
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
        synchronized (vr.class) {
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
