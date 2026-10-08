package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes5.dex */
public class HQCParameters implements KEMParameters {
    static final int GF_MUL_ORDER = 255;
    static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters("hqc-128", 17669, 46, MLKEMEngine.KyberPolyBytes, 16, 31, 15, 66, 75, 4, 243079, 2241, 2321, new int[]{89, 69, 153, 116, 176, 117, 111, 75, 73, 233, 242, 233, 65, 210, 21, 139, 103, 173, 67, 118, 105, 210, 174, 110, 74, 69, 228, 82, 255, 181, 1});
    public static final HQCParameters hqc192 = new HQCParameters("hqc-192", 35851, 56, 640, 24, 33, 16, 100, 114, 5, 119800, 4514, 4602, new int[]{45, 216, 239, 24, 253, 104, 27, 40, 107, 50, 163, 210, 227, 134, BERTags.FLAGS, 158, 119, 13, 158, 1, 238, 164, 82, 43, 15, 232, 246, 142, 50, 189, 29, 232, 1});
    public static final HQCParameters hqc256 = new HQCParameters("hqc-256", 57637, 90, 640, 32, 59, 29, 131, 149, 5, 74517, 7237, 7333, new int[]{49, 167, 49, 39, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 121, 124, 91, 240, 63, 148, 71, 150, 123, 87, 101, 32, 215, 159, 71, 201, 115, 97, 210, 186, 183, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 217, 123, 12, 31, 243, 180, 219, 152, 239, 99, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 4, 246, 191, 144, 8, 232, 47, 27, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 178, 130, 64, 124, 47, 39, 188, 216, 48, 199, 187, 1});
    private final HQCEngine hqcEngine;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f149473n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final int f149474n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private final int f149475n2;
    private final String name;
    private final int publicKeyBytes;
    private final int secretKeyBytes;

    private HQCParameters(String str, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29, int i35, int i36, int[] iArr) {
        this.name = str;
        this.f149473n = i15;
        this.f149474n1 = i16;
        this.f149475n2 = i17;
        this.publicKeyBytes = i35;
        this.secretKeyBytes = i36;
        this.hqcEngine = new HQCEngine(i15, i16, i17, i18, i19, i25, i26, i27, i28, i29, i35, iArr);
    }

    HQCEngine getEngine() {
        return this.hqcEngine;
    }

    int getN1N2_BYTES() {
        return ((this.f149474n1 * this.f149475n2) + 7) / 8;
    }

    int getN_BYTES() {
        return (this.f149473n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    int getSALT_SIZE_BYTES() {
        return 16;
    }

    int getSHA512_BYTES() {
        return 64;
    }

    public int getSecretKeyBytes() {
        return this.secretKeyBytes;
    }

    public int getSessionKeySize() {
        return 256;
    }
}
