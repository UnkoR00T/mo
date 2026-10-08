package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ev extends az implements i00 {
    private static final ev zzl;
    private static volatile p00 zzm;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private fz zzj = az.w();
    private int zzk;

    static {
        ev evVar = new ev();
        zzl = evVar;
        az.r(ev.class, evVar);
    }

    private ev() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = jo.f32668a;
            ez ezVar2 = du.f32101a;
            return az.s(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ࠞ\u0007᠌\u0005", new Object[]{"zzb", "zze", ezVar, "zzf", "zzg", "zzh", "zzi", "zzj", ezVar2, "zzk", ezVar2});
        }
        if (i16 == 3) {
            return new ev();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new bt(bArr);
        }
        if (i16 == 5) {
            return zzl;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzm;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ev.class) {
            try {
                vyVar = zzm;
                if (vyVar == null) {
                    vyVar = new vy(zzl);
                    zzm = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
