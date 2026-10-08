package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends l3 implements s4 {
    private static final x zzb;

    static {
        x xVar = new x();
        zzb = xVar;
        l3.C(x.class, xVar);
    }

    private x() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        v vVar = null;
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0000", null);
        }
        if (i16 == 3) {
            return new x();
        }
        if (i16 == 4) {
            return new w(vVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
