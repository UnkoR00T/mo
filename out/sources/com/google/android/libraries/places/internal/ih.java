package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ih extends az implements i00 {
    private static final ih zzs;
    private static volatile p00 zzt;
    private int zzb;
    private int zze;
    private int zzf;
    private fz zzg = az.w();
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private rj zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private sh zzr;

    static {
        ih ihVar = new ih();
        zzs = ihVar;
        az.r(ih.class, ihVar);
    }

    private ih() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠬ\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007᠌\u0005\b᠌\u0006\tဉ\u0007\n᠌\b\u000b᠌\t\f᠌\n\r᠌\u000b\u000eဉ\f", new Object[]{"zzb", "zze", ch.f31898a, "zzf", dh.f32036a, "zzg", zg.f34512a, "zzh", fh.f32297a, "zzi", "zzj", "zzk", xg.f34288a, "zzl", th.f33790a, "zzm", "zzn", hh.f32477a, "zzo", vh.f34063a, "zzp", xh.f34290a, "zzq", wh.f34162a, "zzr"});
        }
        if (i16 == 3) {
            return new ih();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new wg(bArr);
        }
        if (i16 == 5) {
            return zzs;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzt;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ih.class) {
            try {
                vyVar = zzt;
                if (vyVar == null) {
                    vyVar = new vy(zzs);
                    zzt = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
