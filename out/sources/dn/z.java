package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends l3 implements s4 {
    private static final z zzb;
    private int zzd;
    private String zze = "";
    private s3 zzf = l3.r();

    static {
        z zVar = new z();
        zzb = zVar;
        l3.C(z.class, zVar);
    }

    private z() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", n0.class});
        }
        if (i16 == 3) {
            return new z();
        }
        b bVar = null;
        if (i16 == 4) {
            return new y(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
