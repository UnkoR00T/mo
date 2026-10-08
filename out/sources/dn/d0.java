package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends l3 implements s4 {
    private static final d0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private b0 zzj;
    private b0 zzk;

    static {
        d0 d0Var = new d0();
        zzb = d0Var;
        l3.C(d0.class, d0Var);
    }

    private d0() {
    }

    public static d0 M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new d0();
        }
        b bVar = null;
        if (i16 == 4) {
            return new c0(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }

    public final b0 J() {
        b0 b0Var = this.zzk;
        return b0Var == null ? b0.Q() : b0Var;
    }

    public final b0 K() {
        b0 b0Var = this.zzj;
        return b0Var == null ? b0.Q() : b0Var;
    }

    public final String N() {
        return this.zzf;
    }

    public final String O() {
        return this.zzg;
    }

    public final String P() {
        return this.zzh;
    }

    public final String Q() {
        return this.zzi;
    }

    public final String R() {
        return this.zze;
    }
}
