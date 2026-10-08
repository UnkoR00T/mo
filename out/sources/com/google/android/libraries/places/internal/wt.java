package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wt extends az implements i00 {
    private static final wt zzh;
    private static volatile p00 zzi;
    private String zzb = "";
    private String zze = "";
    private iz zzf = az.z();
    private String zzg = "";

    static {
        wt wtVar = new wt();
        zzh = wtVar;
        az.r(wt.class, wtVar);
    }

    private wt() {
    }

    public final String I() {
        return this.zzb;
    }

    public final String J() {
        return this.zze;
    }

    public final List K() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new wt();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new vt(bArr);
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
        synchronized (wt.class) {
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
