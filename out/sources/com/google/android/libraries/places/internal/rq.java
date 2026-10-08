package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class rq extends az implements i00 {
    private static final rq zzf;
    private static volatile p00 zzg;
    private int zzb;
    private int zze;

    static {
        rq rqVar = new rq();
        zzf = rqVar;
        az.r(rq.class, rqVar);
    }

    private rq() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", qq.f33446a});
        }
        if (i16 == 3) {
            return new rq();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new pq(bArr);
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
        synchronized (rq.class) {
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
