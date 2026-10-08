package tk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements rk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kk.b.EnumC2684b f190589e = kk.b.EnumC2684b.f111286b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f190590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f190591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f190592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f190593d;

    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac macA = i.f190575c.a(n.this.f190591b);
                macA.init(n.this.f190592c);
                return macA;
            } catch (GeneralSecurityException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public n(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f190590a = aVar;
        if (!f190589e.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f190591b = str;
        this.f190592c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f190593d = 20;
                break;
            case "HMACSHA224":
                this.f190593d = 28;
                break;
            case "HMACSHA256":
                this.f190593d = 32;
                break;
            case "HMACSHA384":
                this.f190593d = 48;
                break;
            case "HMACSHA512":
                this.f190593d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // rk.a
    public byte[] a(byte[] bArr, int i15) throws InvalidAlgorithmParameterException {
        if (i15 > this.f190593d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f190590a.get().update(bArr);
        return Arrays.copyOf(this.f190590a.get().doFinal(), i15);
    }
}
