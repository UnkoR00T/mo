package kn;

import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes4.dex */
final class d extends l {
    d() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    @Override // kn.l
    public int b(int i15) {
        if (i15 <= 8) {
            return ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256;
        }
        return 155;
    }

    @Override // kn.l
    public int f() {
        return 10;
    }
}
