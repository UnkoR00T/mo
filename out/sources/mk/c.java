package mk;

import android.security.keystore.KeyGenParameterSpec;
import fk.r;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import tk.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f126952c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f126953d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private KeyStore f126955b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f126956a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        KeyStore f126957b;

        public a() {
            this.f126957b = null;
            if (!c.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f126957b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public c() {
        this(new a());
    }

    static boolean d(String str) {
        c cVar = new c();
        synchronized (f126952c) {
            try {
                if (cVar.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    static void e(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = tk.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g() {
        return true;
    }

    private static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static fk.a i(fk.a aVar) throws KeyStoreException {
        byte[] bArrC = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrC, aVar.decrypt(aVar.a(bArrC, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // fk.r
    public synchronized boolean a(String str) {
        String str2 = this.f126954a;
        if (str2 == null || !str2.equals(str)) {
            return this.f126954a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // fk.r
    public synchronized fk.a b(String str) {
        try {
            String str2 = this.f126954a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f126954a, str));
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return i(new b(tk.r.b("android-keystore://", str), this.f126955b));
    }

    synchronized boolean f(String str) {
        String strB;
        strB = tk.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            c2.g(f126953d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f126955b = keyStore;
                keyStore.load(null);
                return this.f126955b.containsAlias(strB);
            } catch (IOException e15) {
                throw new GeneralSecurityException(e15);
            }
        }
        return this.f126955b.containsAlias(strB);
    }

    private c(a aVar) {
        this.f126954a = aVar.f126956a;
        this.f126955b = aVar.f126957b;
    }
}
