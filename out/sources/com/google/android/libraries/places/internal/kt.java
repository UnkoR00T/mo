package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class kt extends az implements i00 {
    private static final kt zzh;
    private static volatile p00 zzi;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        kt ktVar = new kt();
        zzh = ktVar;
        az.r(kt.class, ktVar);
    }

    private kt() {
    }

    public static jt I() {
        return (jt) zzh.o();
    }

    public static kt J() {
        return zzh;
    }

    final /* synthetic */ void K(String str) {
        this.zzb = str;
    }

    final /* synthetic */ void L(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void M(String str) {
        this.zzf = str;
    }

    final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new kt();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new jt(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (kt.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
