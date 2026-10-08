package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends l3 implements s4 {
    private static final f0 zzb;
    private int zzd;
    private n1 zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private s3 zzh = l3.r();
    private s3 zzi = l3.r();
    private s3 zzj = l3.r();
    private s3 zzk = l3.r();
    private String zzl = "";

    static {
        f0 f0Var = new f0();
        zzb = f0Var;
        l3.C(f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 L() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", r1.class, "zzi", l0.class, "zzj", "zzk", l1.class, "zzl"});
        }
        if (i16 == 3) {
            return new f0();
        }
        b bVar = null;
        if (i16 == 4) {
            return new e0(bVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final n1 J() {
        n1 n1Var = this.zze;
        return n1Var == null ? n1.K() : n1Var;
    }

    public final String M() {
        return this.zzf;
    }

    public final String N() {
        return this.zzg;
    }

    public final List O() {
        return this.zzk;
    }

    public final List P() {
        return this.zzi;
    }

    public final List Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzj;
    }
}
