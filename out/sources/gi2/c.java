package gi2;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f73254c = new a("AES_GCM_NO_PADDING", 0, "AES/GCM/NoPadding", 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f73255d = new b("AES_CBC_PKCS5_PADDING", 1, "AES/CBC/PKCS5Padding", 16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ c[] f73256e = b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f73257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73258b;

    final enum a extends c {
        @Override // gi2.c
        void j(Cipher cipher, int i15, SecretKey secretKey, byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
            try {
                cipher.init(i15, secretKey, new GCMParameterSpec(128, bArr));
            } catch (InvalidAlgorithmParameterException unused) {
                cipher.init(i15, secretKey, new IvParameterSpec(bArr));
            }
        }

        private a(String str, int i15, String str2, int i16) {
            super(str, i15, str2, i16);
        }
    }

    final enum b extends c {
        @Override // gi2.c
        void j(Cipher cipher, int i15, SecretKey secretKey, byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
            cipher.init(i15, secretKey, new IvParameterSpec(bArr));
        }

        private b(String str, int i15, String str2, int i16) {
            super(str, i15, str2, i16);
        }
    }

    private static /* synthetic */ c[] b() {
        return new c[]{f73254c, f73255d};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f73256e.clone();
    }

    int e() {
        return this.f73258b;
    }

    String g() {
        return this.f73257a;
    }

    abstract void j(Cipher cipher, int i15, SecretKey secretKey, byte[] bArr);

    Cipher k(Provider provider) {
        return provider == null ? Cipher.getInstance(this.f73257a) : Cipher.getInstance(this.f73257a, provider);
    }

    private c(String str, int i15, String str2, int i16) {
        super(str, i15);
        this.f73257a = str2;
        this.f73258b = i16;
    }
}
