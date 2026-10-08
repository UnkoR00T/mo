package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends l3 implements s4 {
    private static final f zzb;
    private s3 zzd = l3.r();

    static {
        f fVar = new f();
        zzb = fVar;
        l3.C(f.class, fVar);
    }

    private f() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", e.class});
        }
        if (i16 == 3) {
            return new f();
        }
        b bVar = null;
        if (i16 == 4) {
            return new c(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
