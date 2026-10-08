package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class pw extends az implements i00 {
    private static final pw zzt;
    private static volatile p00 zzu;
    private int zzb;
    private int zzk;
    private ow zzl;
    private int zzm;
    private ew zzn;
    private boolean zzo;
    private double zzp;
    private boolean zzr;
    private boolean zzs;
    private String zze = "";
    private String zzf = "";
    private iz zzg = az.z();
    private iz zzh = az.z();
    private iz zzi = az.z();
    private iz zzj = az.z();
    private fz zzq = az.w();

    static {
        pw pwVar = new pw();
        zzt = pwVar;
        az.r(pw.class, pwVar);
    }

    private pw() {
    }

    public static kw I() {
        return (kw) zzt.o();
    }

    public static pw J() {
        return zzt;
    }

    final /* synthetic */ void K(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void L(String str) {
        this.zzf = str;
    }

    final /* synthetic */ void M(Iterable iterable) {
        iz izVar = this.zzg;
        if (!izVar.zza()) {
            this.zzg = az.A(izVar);
        }
        fx.f(iterable, this.zzg);
    }

    final /* synthetic */ void N(Iterable iterable) {
        iz izVar = this.zzh;
        if (!izVar.zza()) {
            this.zzh = az.A(izVar);
        }
        fx.f(iterable, this.zzh);
    }

    final /* synthetic */ void O(Iterable iterable) {
        iz izVar = this.zzi;
        if (!izVar.zza()) {
            this.zzi = az.A(izVar);
        }
        fx.f(iterable, this.zzi);
    }

    final /* synthetic */ void P(Iterable iterable) {
        iz izVar = this.zzj;
        if (!izVar.zza()) {
            this.zzj = az.A(izVar);
        }
        fx.f(iterable, this.zzj);
    }

    final /* synthetic */ void Q(int i15) {
        this.zzk = i15;
    }

    final /* synthetic */ void R(ow owVar) {
        owVar.getClass();
        this.zzl = owVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void T(int i15) {
        this.zzm = i15 - 2;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzt, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0005\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007\u0004\bဉ\u0000\t\f\nဉ\u0001\u000b\u0007\f\u0000\r,\u000e\u0007\u000f\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i16 == 3) {
            return new pw();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new kw(bArr);
        }
        if (i16 == 5) {
            return zzt;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzu;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (pw.class) {
            try {
                vyVar = zzu;
                if (vyVar == null) {
                    vyVar = new vy(zzt);
                    zzu = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
