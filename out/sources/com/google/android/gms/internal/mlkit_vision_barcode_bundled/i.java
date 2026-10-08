package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends l3 implements s4 {
    private static final i zzb;
    private int zzd;
    private s9 zzj;
    private e9 zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private r3 zzg = l3.q();
    private String zzh = "";
    private String zzi = "";

    static {
        i iVar = new i();
        zzb = iVar;
        l3.C(i.class, iVar);
        l3.j(e9.L(), iVar, iVar, null, 308676116, m6.f29776m, i.class);
    }

    private i() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", h.f29731a, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i16 == 3) {
            return new i();
        }
        f fVar = null;
        if (i16 == 4) {
            return new g(fVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
