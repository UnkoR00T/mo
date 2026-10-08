package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class jn extends az implements i00 {
    private static final jn zzl;
    private static volatile p00 zzm;
    private int zzb;
    private boolean zze;
    private long zzf;
    private long zzg;
    private float zzh;
    private long zzi;
    private long zzj;
    private int zzk;

    static {
        jn jnVar = new jn();
        zzl = jnVar;
        az.r(jn.class, jnVar);
    }

    private jn() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007င\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new jn();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new in(bArr);
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
        synchronized (jn.class) {
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
