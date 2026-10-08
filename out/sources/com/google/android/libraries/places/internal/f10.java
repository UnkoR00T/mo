package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class f10 extends az implements i00 {
    private static final f10 zzf;
    private static volatile p00 zzg;
    private long zzb;
    private int zze;

    static {
        f10 f10Var = new f10();
        zzf = f10Var;
        az.r(f10.class, f10Var);
    }

    private f10() {
    }

    public static e10 K() {
        return (e10) zzf.o();
    }

    public static f10 L() {
        return zzf;
    }

    public final long I() {
        return this.zzb;
    }

    public final int J() {
        return this.zze;
    }

    final /* synthetic */ void M(long j15) {
        this.zzb = j15;
    }

    final /* synthetic */ void N(int i15) {
        this.zze = i15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return new t00(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        if (i16 == 3) {
            return new f10();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new e10(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (f10.class) {
            try {
                vyVar = zzg;
                if (vyVar == null) {
                    vyVar = new vy(zzf);
                    zzg = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
