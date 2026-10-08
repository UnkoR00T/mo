package com.google.android.libraries.places.internal;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class ov extends az implements i00 {
    private static final ov zzaM;
    private static volatile p00 zzaN;
    private int zzA;
    private o30 zzB;
    private int zzE;
    private d30 zzF;
    private int zzG;
    private int zzI;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private cv zzX;
    private boolean zzaB;
    private yq zzaC;
    private ru zzaD;
    private wv zzaE;
    private lv zzaF;
    private nu zzaG;
    private tu zzaH;
    private ju zzaI;
    private xr zzaL;
    private h30 zzaa;
    private boolean zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private boolean zzam;
    private hv zzan;
    private fv zzao;
    private ut zzaq;
    private boolean zzar;
    private boolean zzas;
    private boolean zzat;
    private boolean zzau;
    private boolean zzav;
    private ft zzaw;
    private ys zzax;
    private pu zzay;
    private yt zzaz;
    private int zzb;
    private int zze;
    private h30 zzh;
    private h30 zzk;
    private h30 zzl;
    private m30 zzq;
    private jv zzs;
    private f30 zzt;
    private fp zzu;
    private double zzv;
    private cv zzz;
    private String zzf = "";
    private String zzg = "";
    private iz zzi = az.z();
    private String zzj = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private iz zzr = az.z();
    private String zzw = "";
    private String zzx = "";
    private iz zzy = az.z();
    private iz zzC = az.z();
    private String zzD = "";
    private iz zzH = az.z();
    private String zzJ = "";
    private String zzK = "";
    private iz zzY = az.z();
    private iz zzZ = az.z();
    private iz zzap = az.z();
    private iz zzaA = az.z();
    private String zzaJ = "";
    private String zzaK = "";

    static {
        ov ovVar = new ov();
        zzaM = ovVar;
        az.r(ov.class, ovVar);
    }

    private ov() {
    }

    public static ov A1() {
        return zzaM;
    }

    public final List A0() {
        return this.zzap;
    }

    public final ut B0() {
        ut utVar = this.zzaq;
        return utVar == null ? ut.Q() : utVar;
    }

    public final boolean C0() {
        return (this.zze & 16384) != 0;
    }

    public final String C1() {
        return this.zzg;
    }

    public final ft D0() {
        ft ftVar = this.zzaw;
        return ftVar == null ? ft.J() : ftVar;
    }

    public final boolean D1() {
        return (this.zzb & 1) != 0;
    }

    public final boolean E0() {
        return (this.zze & 32768) != 0;
    }

    public final h30 E1() {
        h30 h30Var = this.zzh;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final ys F0() {
        ys ysVar = this.zzax;
        return ysVar == null ? ys.K() : ysVar;
    }

    public final List F1() {
        return this.zzi;
    }

    public final boolean G0() {
        return (this.zze & PKIFailureInfo.notAuthorized) != 0;
    }

    public final String G1() {
        return this.zzj;
    }

    public final boolean H1() {
        return (this.zzb & 2) != 0;
    }

    public final boolean I() {
        return (this.zzb & 128) != 0;
    }

    public final pu I0() {
        pu puVar = this.zzay;
        return puVar == null ? pu.N() : puVar;
    }

    public final h30 I1() {
        h30 h30Var = this.zzk;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final cv J() {
        cv cvVar = this.zzz;
        return cvVar == null ? cv.S() : cvVar;
    }

    public final List J0() {
        return this.zzaA;
    }

    public final String J1() {
        return this.zzm;
    }

    public final boolean K() {
        return (this.zzb & 256) != 0;
    }

    public final boolean K0() {
        return this.zzQ;
    }

    public final String K1() {
        return this.zzn;
    }

    public final int L() {
        return this.zzA;
    }

    public final boolean L0() {
        return (this.zzb & PKIFailureInfo.transactionIdInUse) != 0;
    }

    public final String L1() {
        return this.zzo;
    }

    public final boolean M() {
        return (this.zzb & 512) != 0;
    }

    public final boolean M0() {
        return this.zzR;
    }

    public final String M1() {
        return this.zzp;
    }

    public final o30 N() {
        o30 o30Var = this.zzB;
        return o30Var == null ? o30.J() : o30Var;
    }

    public final boolean N0() {
        return (this.zzb & PKIFailureInfo.signerNotTrusted) != 0;
    }

    public final boolean N1() {
        return (this.zzb & 8) != 0;
    }

    public final List O() {
        return this.zzC;
    }

    public final boolean O0() {
        return this.zzS;
    }

    public final m30 O1() {
        m30 m30Var = this.zzq;
        return m30Var == null ? m30.S() : m30Var;
    }

    public final String P() {
        return this.zzD;
    }

    public final boolean P0() {
        return (this.zzb & PKIFailureInfo.badCertTemplate) != 0;
    }

    public final List P1() {
        return this.zzr;
    }

    public final cu Q() {
        cu cuVar;
        int i15 = this.zzE;
        if (i15 == 0) {
            cuVar = cu.BUSINESS_STATUS_UNSPECIFIED;
        } else if (i15 == 1) {
            cuVar = cu.OPERATIONAL;
        } else if (i15 == 2) {
            cuVar = cu.CLOSED_TEMPORARILY;
        } else if (i15 != 3) {
            cuVar = i15 != 4 ? null : cu.FUTURE_OPENING;
        } else {
            cuVar = cu.CLOSED_PERMANENTLY;
        }
        return cuVar == null ? cu.UNRECOGNIZED : cuVar;
    }

    public final boolean Q0() {
        return this.zzT;
    }

    public final boolean Q1() {
        return (this.zzb & 16) != 0;
    }

    public final uv R() {
        uv uvVar;
        int i15 = this.zzG;
        if (i15 == 0) {
            uvVar = uv.PRICE_LEVEL_UNSPECIFIED;
        } else if (i15 == 1) {
            uvVar = uv.PRICE_LEVEL_FREE;
        } else if (i15 == 2) {
            uvVar = uv.PRICE_LEVEL_INEXPENSIVE;
        } else if (i15 == 3) {
            uvVar = uv.PRICE_LEVEL_MODERATE;
        } else if (i15 != 4) {
            uvVar = i15 != 5 ? null : uv.PRICE_LEVEL_VERY_EXPENSIVE;
        } else {
            uvVar = uv.PRICE_LEVEL_EXPENSIVE;
        }
        return uvVar == null ? uv.UNRECOGNIZED : uvVar;
    }

    public final boolean R0() {
        return (this.zzb & PKIFailureInfo.badSenderNonce) != 0;
    }

    public final jv R1() {
        jv jvVar = this.zzs;
        return jvVar == null ? jv.K() : jvVar;
    }

    public final List S() {
        return this.zzH;
    }

    public final boolean S0() {
        return this.zzU;
    }

    public final boolean S1() {
        return (this.zzb & 32) != 0;
    }

    public final boolean T() {
        return (this.zzb & 2048) != 0;
    }

    public final boolean T0() {
        return (this.zzb & 4194304) != 0;
    }

    public final f30 T1() {
        f30 f30Var = this.zzt;
        return f30Var == null ? f30.L() : f30Var;
    }

    public final int U() {
        return this.zzI;
    }

    public final boolean U0() {
        return this.zzV;
    }

    public final boolean U1() {
        return (this.zzb & 64) != 0;
    }

    public final String V() {
        return this.zzJ;
    }

    public final boolean V0() {
        return (this.zzb & 8388608) != 0;
    }

    public final fp V1() {
        fp fpVar = this.zzu;
        return fpVar == null ? fp.L() : fpVar;
    }

    public final String W() {
        return this.zzK;
    }

    public final boolean W0() {
        return this.zzW;
    }

    public final double W1() {
        return this.zzv;
    }

    public final boolean X() {
        return (this.zzb & PKIFailureInfo.certConfirmed) != 0;
    }

    public final boolean X0() {
        return (this.zzb & 16777216) != 0;
    }

    public final String X1() {
        return this.zzw;
    }

    public final boolean Y() {
        return this.zzL;
    }

    public final cv Y0() {
        cv cvVar = this.zzX;
        return cvVar == null ? cv.S() : cvVar;
    }

    public final String Y1() {
        return this.zzx;
    }

    public final boolean Z() {
        return (this.zzb & PKIFailureInfo.certRevoked) != 0;
    }

    public final List Z0() {
        return this.zzY;
    }

    public final List Z1() {
        return this.zzy;
    }

    public final boolean a0() {
        return this.zzM;
    }

    public final List a1() {
        return this.zzZ;
    }

    public final boolean b0() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean b1() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean c0() {
        return this.zzN;
    }

    public final h30 c1() {
        h30 h30Var = this.zzaa;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final boolean d0() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean e0() {
        return this.zzO;
    }

    public final boolean e1() {
        return (this.zzb & 67108864) != 0;
    }

    public final boolean f0() {
        return (this.zzb & PKIFailureInfo.notAuthorized) != 0;
    }

    public final boolean f1() {
        return this.zzab;
    }

    public final boolean g0() {
        return this.zzP;
    }

    public final boolean g1() {
        return (this.zzb & 134217728) != 0;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzaM, "\u0000U\u0000\u0002\u0001aU\u0000\t\u0000\u0001Ȉ\u0002Ȉ\u0005Ț\u0007Ȉ\bȈ\tȈ\n\u001b\u000bဉ\u0004\fဉ\u0005\rဉ\u0006\u000e\u0000\u000fȈ\u0010Ȉ\u0015ဉ\u0007\u0016င\b\u0018Ȉ\u0019\f\u001a\f\u001b\u001b\u001cင\u000b\u001dȈ\u001eȈ\u001fဉ\u0000 ဉ\u0001!ဇ\f\"ဇ\r#ဇ\u000e$ဇ\u000f&ဇ\u0010'ဇ\u0011(ဇ\u0012)ဇ\u0013*ဇ\u0014+ဇ\u0015,ဇ\u0016-ဇ\u0017.ဉ\u0018/\u001b1\u001b2Ȉ3Ȉ4ဉ\u00195\u001b6\u001b7ဇ\u001a8ဇ\u001b9ဇ\u001c:ဇ\u001d;ဇ\u001e<ဇ\u001f=ဇ >ဇ!?ဇ\"@ဇ#Aဇ$Bဇ%Cဉ&Fဉ'G\u001bHဉ(Iဇ)Jဇ*Kဇ+Lဇ,Mဇ-Nဉ.Oဉ/Pဉ0Qဉ1R\u001bSဇ2Tဉ3Uဉ4Vဉ5Wဉ6Xဉ\tYဉ7Zဉ\u0003[ဉ8\\ဉ9]Ȉ^Ȉ_ဉ\n`ဉ\u0002aဉ:", new Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzm", "zzn", "zzo", "zzr", wt.class, "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzz", "zzA", "zzD", "zzE", "zzG", "zzH", au.class, "zzI", "zzJ", "zzK", "zzh", "zzk", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", cv.class, "zzZ", cv.class, "zzj", "zzp", "zzaa", "zzy", aw.class, "zzC", qt.class, "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", nv.class, "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", "zzaz", "zzaA", lu.class, "zzaB", "zzaC", "zzaD", "zzaE", "zzaF", "zzB", "zzaG", "zzq", "zzaH", "zzaI", "zzaJ", "zzaK", "zzF", "zzl", "zzaL"});
        }
        if (i16 == 3) {
            return new ov();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new bu(bArr);
        }
        if (i16 == 5) {
            return zzaM;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzaN;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ov.class) {
            try {
                vyVar = zzaN;
                if (vyVar == null) {
                    vyVar = new vy(zzaM);
                    zzaN = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }

    public final boolean h0() {
        return (this.zzb & PKIFailureInfo.unsupportedVersion) != 0;
    }

    public final boolean h1() {
        return this.zzac;
    }

    public final String i0() {
        return this.zzf;
    }

    public final boolean i1() {
        return (this.zzb & 268435456) != 0;
    }

    public final boolean j0() {
        return this.zzae;
    }

    public final boolean j1() {
        return this.zzad;
    }

    public final boolean k0() {
        return (this.zzb & 1073741824) != 0;
    }

    public final boolean k1() {
        return (this.zzb & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean l0() {
        return this.zzaf;
    }

    public final boolean l1() {
        return (this.zze & PKIFailureInfo.transactionIdInUse) != 0;
    }

    public final boolean m0() {
        return (this.zzb & PKIFailureInfo.systemUnavail) != 0;
    }

    public final boolean m1() {
        return this.zzaB;
    }

    public final boolean n0() {
        return this.zzag;
    }

    public final boolean n1() {
        return (this.zze & PKIFailureInfo.signerNotTrusted) != 0;
    }

    public final boolean o0() {
        return (this.zze & 2) != 0;
    }

    public final yq o1() {
        yq yqVar = this.zzaC;
        return yqVar == null ? yq.K() : yqVar;
    }

    public final boolean p0() {
        return this.zzai;
    }

    public final boolean p1() {
        return (this.zze & PKIFailureInfo.badCertTemplate) != 0;
    }

    public final boolean q0() {
        return (this.zze & 4) != 0;
    }

    public final ru q1() {
        ru ruVar = this.zzaD;
        return ruVar == null ? ru.N() : ruVar;
    }

    public final boolean r0() {
        return this.zzaj;
    }

    public final wv r1() {
        wv wvVar = this.zzaE;
        return wvVar == null ? wv.M() : wvVar;
    }

    public final boolean s0() {
        return (this.zze & 8) != 0;
    }

    public final boolean s1() {
        return (this.zze & 4194304) != 0;
    }

    public final boolean t0() {
        return this.zzak;
    }

    public final lv t1() {
        lv lvVar = this.zzaF;
        return lvVar == null ? lv.M() : lvVar;
    }

    public final boolean u0() {
        return (this.zze & 16) != 0;
    }

    public final boolean u1() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean v0() {
        return this.zzal;
    }

    public final nu v1() {
        nu nuVar = this.zzaG;
        return nuVar == null ? nu.R() : nuVar;
    }

    public final boolean w0() {
        return (this.zze & 32) != 0;
    }

    public final boolean w1() {
        return (this.zze & 16777216) != 0;
    }

    public final boolean x0() {
        return this.zzam;
    }

    public final tu x1() {
        tu tuVar = this.zzaH;
        return tuVar == null ? tu.O() : tuVar;
    }

    public final hv y0() {
        hv hvVar = this.zzan;
        return hvVar == null ? hv.Q() : hvVar;
    }

    public final boolean y1() {
        return (this.zze & 33554432) != 0;
    }

    public final fv z0() {
        fv fvVar = this.zzao;
        return fvVar == null ? fv.W() : fvVar;
    }

    public final ju z1() {
        ju juVar = this.zzaI;
        return juVar == null ? ju.M() : juVar;
    }
}
