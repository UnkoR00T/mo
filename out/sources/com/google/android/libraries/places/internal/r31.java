package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r31 extends az implements i00 {
    private static final r31 zzn;
    private static volatile p00 zzo;
    private int zzb;
    private gt0 zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private hn zzm;

    static {
        r31 r31Var = new r31();
        zzn = r31Var;
        az.r(r31.class, r31Var);
    }

    private r31() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဇ\u0007\tဉ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", jo.f32668a, "zzi", e71.f32169a, "zzj", "zzk", "zzl", "zzm"});
        }
        if (i16 == 3) {
            return new r31();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new f21(bArr);
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
        synchronized (r31.class) {
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
