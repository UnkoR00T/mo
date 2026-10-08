package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ea extends az implements i00 {
    private static final ea zzm;
    private static volatile p00 zzn;
    private int zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;
    private boolean zzl;

    static {
        ea eaVar = new ea();
        zzm = eaVar;
        az.r(ea.class, eaVar);
    }

    private ea() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"zzb", "zze", "zzf", ta.f33767a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i16 == 3) {
            return new ea();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new da(bArr);
        }
        if (i16 == 5) {
            return zzm;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzn;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ea.class) {
            try {
                vyVar = zzn;
                if (vyVar == null) {
                    vyVar = new vy(zzm);
                    zzn = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
