package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class bl extends az implements i00 {
    private static final bl zzn;
    private static volatile p00 zzo;
    private int zzb;
    private int zze;
    private iz zzf = az.z();
    private iz zzg = az.z();
    private iz zzh = az.z();
    private iz zzi = az.z();
    private int zzj;
    private hk zzk;
    private nl zzl;
    private boolean zzm;

    static {
        bl blVar = new bl();
        zzn = blVar;
        az.r(bl.class, blVar);
    }

    private bl() {
    }

    public static zk I() {
        return (zk) zzn.o();
    }

    final /* synthetic */ void J(Iterable iterable) {
        iz izVar = this.zzf;
        if (!izVar.zza()) {
            this.zzf = az.A(izVar);
        }
        fx.f(iterable, this.zzf);
    }

    final /* synthetic */ void K(Iterable iterable) {
        iz izVar = this.zzg;
        if (!izVar.zza()) {
            this.zzg = az.A(izVar);
        }
        fx.f(iterable, this.zzg);
    }

    final /* synthetic */ void L(Iterable iterable) {
        iz izVar = this.zzh;
        if (!izVar.zza()) {
            this.zzh = az.A(izVar);
        }
        fx.f(iterable, this.zzh);
    }

    final /* synthetic */ void M(Iterable iterable) {
        iz izVar = this.zzi;
        if (!izVar.zza()) {
            this.zzi = az.A(izVar);
        }
        fx.f(iterable, this.zzi);
    }

    final /* synthetic */ void N(int i15) {
        this.zzb |= 2;
        this.zzj = i15;
    }

    final /* synthetic */ void O(hk hkVar) {
        hkVar.getClass();
        this.zzk = hkVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void P(boolean z15) {
        this.zzb |= 16;
        this.zzm = z15;
    }

    final /* synthetic */ void R(int i15) {
        this.zze = i15 - 1;
        this.zzb |= 1;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0006င\u0001\u0007ဉ\u0002\bဉ\u0003\tဇ\u0004", new Object[]{"zzb", "zze", al.f31664a, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i16 == 3) {
            return new bl();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zk(bArr);
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
        synchronized (bl.class) {
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
