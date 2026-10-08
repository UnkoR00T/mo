package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class vf extends az implements i00 {
    private static final vf zzt;
    private static volatile p00 zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private jf zzj;
    private bf zzk;
    private we zzl;
    private ql zzm;
    private df zzn;
    private gf zzo;
    private sl zzp;
    private am zzq;
    private wl zzr;
    private int zzs;

    static {
        vf vfVar = new vf();
        zzt = vfVar;
        az.r(vf.class, vfVar);
    }

    private vf() {
    }

    public static qf I() {
        return (qf) zzt.o();
    }

    final /* synthetic */ void J(int i15) {
        this.zzb |= 4;
        this.zzg = i15;
    }

    final /* synthetic */ void K(jf jfVar) {
        jfVar.getClass();
        this.zzj = jfVar;
        this.zzb |= 32;
    }

    final /* synthetic */ void L(we weVar) {
        weVar.getClass();
        this.zzl = weVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void M(df dfVar) {
        dfVar.getClass();
        this.zzn = dfVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void N(am amVar) {
        amVar.getClass();
        this.zzq = amVar;
        this.zzb |= PKIFailureInfo.certConfirmed;
    }

    final /* synthetic */ void P(int i15) {
        this.zze = i15 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void Q(int i15) {
        this.zzf = i15 - 1;
        this.zzb |= 2;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000f᠌\u000e", new Object[]{"zzb", "zze", sf.f33678a, "zzf", uf.f33892a, "zzg", "zzh", rf.f33507a, "zzi", pf.f33318a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", tf.f33786a});
        }
        if (i16 == 3) {
            return new vf();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new qf(bArr);
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
        synchronized (vf.class) {
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
