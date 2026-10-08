package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ax extends az implements i00 {
    private static final ax zzk;
    private static volatile p00 zzl;
    private int zzb;
    private tv zze;
    private int zzf;
    private hy zzg;
    private hy zzh;
    private hy zzi;
    private int zzj;

    static {
        ax axVar = new ax();
        zzk = axVar;
        az.r(ax.class, axVar);
    }

    private ax() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005င\u0005\u0006ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i16 == 3) {
            return new ax();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zw(bArr);
        }
        if (i16 == 5) {
            return zzk;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzl;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ax.class) {
            try {
                vyVar = zzl;
                if (vyVar == null) {
                    vyVar = new vy(zzk);
                    zzl = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
