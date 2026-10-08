package un;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f199287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecretKey f199288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKey f199289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f199290d;

    public j(SecretKey secretKey) throws sn.x {
        this.f199287a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f199288b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f199289c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f199290d = 16;
        } else if (encoded.length == 48) {
            this.f199288b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f199289c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f199290d = 24;
        } else {
            if (encoded.length != 64) {
                throw new sn.x("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
            }
            this.f199288b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.f199289c = new SecretKeySpec(encoded, 32, 32, "AES");
            this.f199290d = 32;
        }
    }

    public SecretKey a() {
        return this.f199289c;
    }

    public SecretKey b() {
        return this.f199288b;
    }

    public int c() {
        return this.f199290d;
    }
}
