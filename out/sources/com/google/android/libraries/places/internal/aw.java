package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class aw extends az implements i00 {
    private static final aw zzo;
    private static volatile p00 zzp;
    private int zzb;
    private h30 zzg;
    private h30 zzh;
    private double zzi;
    private br zzj;
    private f10 zzk;
    private d30 zzn;
    private String zze = "";
    private String zzf = "";
    private String zzl = "";
    private String zzm = "";

    static {
        aw awVar = new aw();
        zzo = awVar;
        az.r(aw.class, awVar);
    }

    private aw() {
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 1) != 0;
    }

    public final h30 K() {
        h30 h30Var = this.zzg;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final boolean L() {
        return (this.zzb & 2) != 0;
    }

    public final h30 M() {
        h30 h30Var = this.zzh;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final double N() {
        return this.zzi;
    }

    public final boolean O() {
        return (this.zzb & 4) != 0;
    }

    public final br P() {
        br brVar = this.zzj;
        return brVar == null ? br.L() : brVar;
    }

    public final boolean Q() {
        return (this.zzb & 8) != 0;
    }

    public final f10 R() {
        f10 f10Var = this.zzk;
        return f10Var == null ? f10.L() : f10Var;
    }

    public final String S() {
        return this.zzl;
    }

    public final boolean T() {
        return (this.zzb & 16) != 0;
    }

    public final d30 U() {
        d30 d30Var = this.zzn;
        return d30Var == null ? d30.L() : d30Var;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzo, "\u0000\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003\u000fȈ\u0010Ȉ\u0011ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzi", "zzg", "zzh", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i16 == 3) {
            return new aw();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zv(bArr);
        }
        if (i16 == 5) {
            return zzo;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzp;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (aw.class) {
            try {
                vyVar = zzp;
                if (vyVar == null) {
                    vyVar = new vy(zzo);
                    zzp = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
