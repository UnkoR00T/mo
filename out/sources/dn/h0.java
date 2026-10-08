package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends l3 implements s4 {
    private static final h0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        h0 h0Var = new h0();
        zzb = h0Var;
        l3.C(h0.class, h0Var);
    }

    private h0() {
    }

    public static h0 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i16 == 3) {
            return new h0();
        }
        b bVar = null;
        if (i16 == 4) {
            return new g0(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzk;
    }

    public final String M() {
        return this.zzl;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzm;
    }

    public final String P() {
        return this.zzq;
    }

    public final String Q() {
        return this.zze;
    }

    public final String R() {
        return this.zzp;
    }

    public final String S() {
        return this.zzf;
    }

    public final String T() {
        return this.zzi;
    }

    public final String U() {
        return this.zzo;
    }

    public final String V() {
        return this.zzr;
    }

    public final String W() {
        return this.zzh;
    }

    public final String X() {
        return this.zzn;
    }

    public final String Y() {
        return this.zzg;
    }
}
