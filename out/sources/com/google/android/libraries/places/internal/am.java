package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class am extends az implements i00 {
    private static final am zzk;
    private static volatile p00 zzl;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private boolean zzi;
    private int zzj;

    static {
        am amVar = new am();
        zzk = amVar;
        az.r(am.class, amVar);
    }

    private am() {
    }

    public static zl I() {
        return (zl) zzk.o();
    }

    final /* synthetic */ void J(int i15) {
        this.zzb |= 1;
        this.zze = i15;
    }

    final /* synthetic */ void K(int i15) {
        this.zzb |= 2;
        this.zzf = i15;
    }

    final /* synthetic */ void L(int i15) {
        this.zzb |= 4;
        this.zzg = i15;
    }

    final /* synthetic */ void M(boolean z15) {
        this.zzb |= 16;
        this.zzi = z15;
    }

    final /* synthetic */ void N(int i15) {
        this.zzb |= 32;
        this.zzj = i15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zl(bArr);
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
        synchronized (am.class) {
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
