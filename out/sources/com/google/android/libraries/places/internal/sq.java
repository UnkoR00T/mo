package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sq extends az implements i00 {
    private static final sq zzq;
    private static volatile p00 zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private iz zzl = az.z();
    private fq zzm;
    private nq zzn;
    private rq zzo;
    private jq zzp;

    static {
        sq sqVar = new sq();
        zzq = sqVar;
        az.r(sq.class, sqVar);
        az.t(z20.I(), sqVar, sqVar, null, 525004180, u10.f33837n, sq.class);
    }

    private sq() {
    }

    public static gq J() {
        return (gq) zzq.o();
    }

    public final List I() {
        return this.zzl;
    }

    final /* synthetic */ void K(Iterable iterable) {
        iz izVar = this.zzl;
        if (!izVar.zza()) {
            this.zzl = az.A(izVar);
        }
        fx.f(iterable, this.zzl);
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0006\u0006\u001a\u0007ဉ\u0007\bဉ\b\tဉ\t\n᠌\u0002\u000bဉ\n\fဈ\u0005", new Object[]{"zzb", "zze", hq.f32508a, "zzf", kq.f32755a, "zzh", "zzi", "zzk", "zzl", "zzm", "zzn", "zzo", "zzg", oq.f33232a, "zzp", "zzj"});
        }
        if (i16 == 3) {
            return new sq();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new gq(bArr);
        }
        if (i16 == 5) {
            return zzq;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzr;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (sq.class) {
            try {
                vyVar = zzr;
                if (vyVar == null) {
                    vyVar = new vy(zzq);
                    zzr = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
