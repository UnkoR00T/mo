package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class br extends bw implements kx {
    private static final br zbb;
    private boolean zbh;
    private boolean zbi;
    private boolean zbn;
    private boolean zbo;
    private dx zbd = dx.b();
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";
    private String zbj = "";
    private String zbk = "";
    private String zbl = "";
    private jw zbm = bw.C();
    private String zbp = "";
    private jw zbq = bw.C();

    static {
        br brVar = new br();
        zbb = brVar;
        bw.l(br.class, brVar);
    }

    private br() {
    }

    public static zq E() {
        return (zq) zbb.u();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u000e\u0000\u0000\u0001\u0010\u000e\u0001\u0002\u0000\u00012\u0004\u0007\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\tȈ\nȈ\u000bȚ\f\u0007\rȈ\u000e\u0007\u000fȈ\u0010Ț", new Object[]{"zbd", ar.f30354a, "zbi", "zbe", "zbf", "zbj", "zbh", "zbk", "zbl", "zbm", "zbn", "zbg", "zbo", "zbp", "zbq"});
        }
        if (i16 == 3) {
            return new br();
        }
        yq yqVar = null;
        if (i16 == 4) {
            return new zq(yqVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
