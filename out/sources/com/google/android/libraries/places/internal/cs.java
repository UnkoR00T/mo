package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cs extends az implements i00 {
    private static final cs zzi;
    private static volatile p00 zzj;
    private int zzb;
    private h30 zzf;
    private yv zzg;
    private String zze = "";
    private iz zzh = az.z();

    static {
        cs csVar = new cs();
        zzi = csVar;
        az.r(cs.class, csVar);
    }

    private cs() {
    }

    public static cs K() {
        return zzi;
    }

    public final h30 I() {
        h30 h30Var = this.zzf;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final List J() {
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
            return az.s(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ț", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new cs();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new bs(bArr);
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
        synchronized (cs.class) {
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
