package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class rj extends az implements i00 {
    private static final rj zzj;
    private static volatile p00 zzk;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        rj rjVar = new rj();
        zzj = rjVar;
        az.r(rj.class, rjVar);
    }

    private rj() {
    }

    public static qj N() {
        return (qj) zzj.o();
    }

    public final boolean I() {
        return this.zze;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return this.zzi;
    }

    final /* synthetic */ void O(boolean z15) {
        this.zzb |= 1;
        this.zze = z15;
    }

    final /* synthetic */ void P(boolean z15) {
        this.zzb |= 2;
        this.zzf = z15;
    }

    final /* synthetic */ void Q(boolean z15) {
        this.zzb |= 4;
        this.zzg = z15;
    }

    final /* synthetic */ void R(boolean z15) {
        this.zzb |= 8;
        this.zzh = z15;
    }

    final /* synthetic */ void S(boolean z15) {
        this.zzb |= 16;
        this.zzi = z15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new rj();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new qj(bArr);
        }
        if (i16 == 5) {
            return zzj;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzk;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (rj.class) {
            try {
                vyVar = zzk;
                if (vyVar == null) {
                    vyVar = new vy(zzj);
                    zzk = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
