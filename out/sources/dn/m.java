package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends l3 implements s4 {
    private static final m zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        m mVar = new m();
        zzb = mVar;
        l3.C(m.class, mVar);
    }

    private m() {
    }

    public static m K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new m();
        }
        b bVar = null;
        if (i16 == 4) {
            return new l(bVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String L() {
        return this.zze;
    }

    public final String M() {
        return this.zzf;
    }
}
