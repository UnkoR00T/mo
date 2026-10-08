package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class yk extends az implements i00 {
    private static final yk zzs;
    private static volatile p00 zzt;
    private int zzb;
    private int zze;
    private boolean zzg;
    private double zzh;
    private int zzi;
    private boolean zzk;
    private hk zzl;
    private wk zzm;
    private nl zzn;
    private boolean zzo;
    private boolean zzq;
    private boolean zzr;
    private String zzf = "";
    private fz zzj = az.w();
    private String zzp = "";

    static {
        yk ykVar = new yk();
        zzs = ykVar;
        az.r(yk.class, ykVar);
    }

    private yk() {
    }

    public static uk I() {
        return (uk) zzs.o();
    }

    final /* synthetic */ void J(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void K(boolean z15) {
        this.zzb |= 4;
        this.zzg = z15;
    }

    final /* synthetic */ void L(double d15) {
        this.zzb |= 8;
        this.zzh = d15;
    }

    final /* synthetic */ void M(int i15) {
        this.zzb |= 16;
        this.zzi = i15;
    }

    final /* synthetic */ void N(Iterable iterable) {
        fz fzVar = this.zzj;
        if (!fzVar.zza()) {
            this.zzj = az.x(fzVar);
        }
        fx.f(iterable, this.zzj);
    }

    final /* synthetic */ void O(boolean z15) {
        this.zzb |= 32;
        this.zzk = z15;
    }

    final /* synthetic */ void P(hk hkVar) {
        hkVar.getClass();
        this.zzl = hkVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void Q(boolean z15) {
        this.zzb |= 512;
        this.zzo = z15;
    }

    final /* synthetic */ void R(boolean z15) {
        this.zzb |= 2048;
        this.zzq = z15;
    }

    final /* synthetic */ void S(boolean z15) {
        this.zzb |= PKIFailureInfo.certConfirmed;
        this.zzr = z15;
    }

    final /* synthetic */ void U(int i15) {
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
            return az.s(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005င\u0004\u0006'\u0007ဇ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဇ\t\fဈ\n\rဇ\u000b\u000eဇ\f", new Object[]{"zzb", "zze", xk.f34293a, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i16 == 3) {
            return new yk();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new uk(bArr);
        }
        if (i16 == 5) {
            return zzs;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzt;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (yk.class) {
            try {
                vyVar = zzt;
                if (vyVar == null) {
                    vyVar = new vy(zzs);
                    zzt = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
