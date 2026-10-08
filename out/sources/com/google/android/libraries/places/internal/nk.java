package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class nk extends az implements i00 {
    private static final nk zzB;
    private static volatile p00 zzC;
    private int zzb;
    private int zze;
    private kg zzh;
    private el zzi;
    private ij zzj;
    private ai zzk;
    private gj zzl;
    private di zzm;
    private ej zzn;
    private hl zzo;
    private hl zzp;
    private kj zzq;
    private ri zzr;
    private pk zzs;
    private rk zzt;
    private bk zzu;
    private pj zzv;
    private tk zzw;
    private yk zzx;
    private bl zzy;
    private gj zzz;
    private byte zzA = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        nk nkVar = new nk();
        zzB = nkVar;
        az.r(nk.class, nkVar);
    }

    private nk() {
    }

    public static lk I() {
        return (lk) zzB.o();
    }

    final /* synthetic */ void J(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    final /* synthetic */ void L(gj gjVar) {
        gjVar.getClass();
        this.zzl = gjVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void M(di diVar) {
        diVar.getClass();
        this.zzm = diVar;
        this.zzb |= 256;
    }

    final /* synthetic */ void N(yk ykVar) {
        ykVar.getClass();
        this.zzx = ykVar;
        this.zzb |= PKIFailureInfo.signerNotTrusted;
    }

    final /* synthetic */ void O(bl blVar) {
        blVar.getClass();
        this.zzy = blVar;
        this.zzb |= PKIFailureInfo.badCertTemplate;
    }

    final /* synthetic */ void P(gj gjVar) {
        gjVar.getClass();
        this.zzz = gjVar;
        this.zzb |= PKIFailureInfo.badSenderNonce;
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
            return Byte.valueOf(this.zzA);
        }
        if (i16 == 2) {
            return az.s(zzB, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new Object[]{"zzb", "zze", mk.f32953a, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i16 == 3) {
            return new nk();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new lk(bArr);
        }
        if (i16 == 5) {
            return zzB;
        }
        if (i16 != 6) {
            this.zzA = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzC;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (nk.class) {
            try {
                vyVar = zzC;
                if (vyVar == null) {
                    vyVar = new vy(zzB);
                    zzC = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
