package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ng extends az implements i00 {
    private static final ng zzn;
    private static volatile p00 zzo;
    private int zzb;
    private int zze;
    private int zzf;
    private fz zzg = az.w();
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private rj zzl;
    private sh zzm;

    static {
        ng ngVar = new ng();
        zzn = ngVar;
        az.r(ng.class, ngVar);
    }

    private ng() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzn, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠬ\u0005ဇ\u0002\u0006ဇ\u0003\u0007᠌\u0004\b᠌\u0005\tဉ\u0006\nဉ\u0007", new Object[]{"zzb", "zze", vh.f34063a, "zzf", xh.f34290a, "zzg", mg.f32943a, "zzh", "zzi", "zzj", wh.f34162a, "zzk", th.f33790a, "zzl", "zzm"});
        }
        if (i16 == 3) {
            return new ng();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new lg(bArr);
        }
        if (i16 == 5) {
            return zzn;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzo;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ng.class) {
            try {
                vyVar = zzo;
                if (vyVar == null) {
                    vyVar = new vy(zzn);
                    zzo = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
