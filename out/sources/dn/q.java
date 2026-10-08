package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends l3 implements s4 {
    private static final q zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        q qVar = new q();
        zzb = qVar;
        l3.C(q.class, qVar);
    }

    private q() {
    }

    public static q K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", o.f43488a, "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new q();
        }
        b bVar = null;
        if (i16 == 4) {
            return new n(bVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String L() {
        return this.zzg;
    }

    public final String M() {
        return this.zze;
    }

    public final int N() {
        int iA = p.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
