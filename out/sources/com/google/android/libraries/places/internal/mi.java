package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class mi extends az implements i00 {
    private static final mi zzx;
    private static volatile p00 zzy;
    private int zzb;
    private int zze;
    private int zzf = 1;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private hi zzv;
    private int zzw;

    static {
        mi miVar = new mi();
        zzx = miVar;
        az.r(mi.class, miVar);
    }

    private mi() {
    }

    public static ii I() {
        return (ii) zzx.o();
    }

    final /* synthetic */ void J(boolean z15) {
        this.zzb |= 4;
        this.zzg = z15;
    }

    final /* synthetic */ void K(boolean z15) {
        this.zzb |= 8;
        this.zzh = z15;
    }

    final /* synthetic */ void L(boolean z15) {
        this.zzb |= 16;
        this.zzi = z15;
    }

    final /* synthetic */ void M(int i15) {
        this.zzb |= 32;
        this.zzj = i15;
    }

    final /* synthetic */ void N(int i15) {
        this.zzb |= 64;
        this.zzk = i15;
    }

    final /* synthetic */ void O(int i15) {
        this.zzb |= 128;
        this.zzl = i15;
    }

    final /* synthetic */ void P(int i15) {
        this.zzb |= 256;
        this.zzm = i15;
    }

    final /* synthetic */ void Q(int i15) {
        this.zzb |= 512;
        this.zzn = i15;
    }

    final /* synthetic */ void R(int i15) {
        this.zzb |= 1024;
        this.zzo = i15;
    }

    final /* synthetic */ void S(int i15) {
        this.zzb |= 2048;
        this.zzp = i15;
    }

    final /* synthetic */ void T(boolean z15) {
        this.zzb |= PKIFailureInfo.certConfirmed;
        this.zzq = z15;
    }

    final /* synthetic */ void U(int i15) {
        this.zzb |= PKIFailureInfo.certRevoked;
        this.zzr = i15;
    }

    final /* synthetic */ void V(hi hiVar) {
        hiVar.getClass();
        this.zzv = hiVar;
        this.zzb |= PKIFailureInfo.unsupportedVersion;
    }

    final /* synthetic */ void W(int i15) {
        this.zzb |= PKIFailureInfo.transactionIdInUse;
        this.zzw = i15;
    }

    final /* synthetic */ void Y(int i15) {
        this.zze = i15 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void Z(int i15) {
        this.zzf = i15;
        this.zzb |= 2;
    }

    final /* synthetic */ void a0(int i15) {
        this.zzu = i15 - 1;
        this.zzb |= PKIFailureInfo.notAuthorized;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzx, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e\u0011᠌\u000f\u0012᠌\u0010\u0013ဉ\u0011\u0014င\u0012", new Object[]{"zzb", "zze", li.f32832a, "zzf", ei.f32210a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzm", "zzs", "zzt", ji.f32658a, "zzu", ki.f32739a, "zzv", "zzw"});
        }
        if (i16 == 3) {
            return new mi();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ii(bArr);
        }
        if (i16 == 5) {
            return zzx;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzy;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (mi.class) {
            try {
                vyVar = zzy;
                if (vyVar == null) {
                    vyVar = new vy(zzx);
                    zzy = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
