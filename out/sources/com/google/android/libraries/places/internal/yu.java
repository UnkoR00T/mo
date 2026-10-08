package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class yu extends az implements i00 {
    private static final yu zzg;
    private static volatile p00 zzh;
    private int zzb;
    private xu zze;
    private xu zzf;

    static {
        yu yuVar = new yu();
        zzg = yuVar;
        az.r(yu.class, yuVar);
    }

    private yu() {
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final xu J() {
        xu xuVar = this.zze;
        return xuVar == null ? xu.O() : xuVar;
    }

    public final boolean K() {
        return (this.zzb & 2) != 0;
    }

    public final xu L() {
        xu xuVar = this.zzf;
        return xuVar == null ? xu.O() : xuVar;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new yu();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new vu(bArr);
        }
        if (i16 == 5) {
            return zzg;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzh;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (yu.class) {
            try {
                vyVar = zzh;
                if (vyVar == null) {
                    vyVar = new vy(zzg);
                    zzh = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
