package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class zi extends az implements i00 {
    private static final zi zzV;
    private static volatile p00 zzW;
    private lf zzA;
    private dm zzB;
    private boolean zzC;
    private vf zzE;
    private boolean zzF;
    private int zzH;
    private int zzK;
    private int zzM;
    private int zzN;
    private x20 zzO;
    private pe zzP;
    private boolean zzQ;
    private ig zzR;
    private ih zzS;
    private ng zzT;
    private int zzb;
    private int zze;
    private int zzf;
    private j0 zzh;
    private p6 zzi;
    private int zzj;
    private float zzk;
    private nk zzm;
    private yf zzo;
    private sg zzp;
    private fk zzq;
    private nj zzr;
    private xj zzs;
    private tj zzt;
    private kk zzu;
    private mi zzv;
    private bj zzw;
    private zj zzx;
    private pi zzy;
    private vg zzz;
    private byte zzU = 2;
    private int zzg = 1;
    private iz zzl = az.z();
    private iz zzn = az.z();
    private String zzD = "";
    private String zzG = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzL = "";

    static {
        zi ziVar = new zi();
        zzV = ziVar;
        az.r(zi.class, ziVar);
    }

    private zi() {
    }

    public static si I() {
        return (si) zzV.o();
    }

    final /* synthetic */ void J(j0 j0Var) {
        j0Var.getClass();
        this.zzh = j0Var;
        this.zzb |= 4;
    }

    final /* synthetic */ void K(nk nkVar) {
        nkVar.getClass();
        this.zzm = nkVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void L(fk fkVar) {
        fkVar.getClass();
        this.zzq = fkVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void M(nj njVar) {
        njVar.getClass();
        this.zzr = njVar;
        this.zzb |= 1024;
    }

    final /* synthetic */ void N(mi miVar) {
        miVar.getClass();
        this.zzv = miVar;
        this.zzb |= 16384;
    }

    final /* synthetic */ void O(vf vfVar) {
        vfVar.getClass();
        this.zzE = vfVar;
        this.zzb |= 8388608;
    }

    final /* synthetic */ void P(boolean z15) {
        this.zzb |= 16777216;
        this.zzF = z15;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 33554432;
        this.zzG = str;
    }

    final /* synthetic */ void R(String str) {
        this.zzb |= 134217728;
        this.zzI = "5.2.0";
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 1073741824;
        this.zzL = str;
    }

    final /* synthetic */ void T(x20 x20Var) {
        x20Var.getClass();
        this.zzO = x20Var;
        this.zze |= 2;
    }

    final /* synthetic */ void U(pe peVar) {
        peVar.getClass();
        this.zzP = peVar;
        this.zze |= 4;
    }

    final /* synthetic */ void V(boolean z15) {
        this.zze |= 8;
        this.zzQ = z15;
    }

    final /* synthetic */ void W(ig igVar) {
        igVar.getClass();
        this.zzR = igVar;
        this.zze |= 16;
    }

    final /* synthetic */ void Y(int i15) {
        this.zzg = i15;
        this.zzb |= 2;
    }

    final /* synthetic */ void Z(int i15) {
        this.zzK = i15 - 1;
        this.zzb |= PKIFailureInfo.duplicateCertReq;
    }

    final /* synthetic */ void a0(int i15) {
        this.zzM = i15 - 1;
        this.zzb |= PKIFailureInfo.systemUnavail;
    }

    final /* synthetic */ void b0(int i15) {
        this.zzN = i15 - 1;
        this.zze |= 1;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzU);
        }
        if (i16 == 2) {
            return az.s(zzV, "\u0001)\u0000\u0002\u0001))\u0000\u0002\u0003\u0001᠌\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0004\u001b\u0005ᐉ\u0006\u0006\u001b\u0007ဉ\u0007\bᐉ\b\t᠌\u0004\nခ\u0005\u000bဇ\u0015\fဉ\t\rဈ\u0016\u000eဉ\n\u000fဉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0017\u0019င\u0000\u001aဉ\u0014\u001bဇ\u0018\u001cဈ\u0019\u001d᠌\u001a\u001eဈ\u001b\u001fဈ\u001c ᠌\u001d!ဈ\u001e\"᠌\u001f#᠌ $ဉ!%ဉ\"&ဇ#'ဉ$(ဉ%)ဉ&", new Object[]{"zzb", "zze", "zzg", ui.f33938a, "zzh", "zzi", "zzl", zm.class, "zzm", "zzn", yf.class, "zzo", "zzp", "zzj", ti.f33795a, "zzk", "zzC", "zzq", "zzD", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzE", "zzf", "zzB", "zzF", "zzG", "zzH", vi.f34064a, "zzI", "zzJ", "zzK", yi.f34407a, "zzL", "zzM", xi.f34291a, "zzN", wi.f34163a, "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT"});
        }
        if (i16 == 3) {
            return new zi();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new si(bArr);
        }
        if (i16 == 5) {
            return zzV;
        }
        if (i16 != 6) {
            this.zzU = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzW;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (zi.class) {
            try {
                vyVar = zzW;
                if (vyVar == null) {
                    vyVar = new vy(zzV);
                    zzW = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
