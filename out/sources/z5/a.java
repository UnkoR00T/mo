package z5;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f232903a;

    /* JADX INFO: renamed from: z5.a$a, reason: collision with other inner class name */
    class C6258a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f232904a;

        C6258a(c cVar) {
            this.f232904a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i15, CharSequence charSequence) {
            this.f232904a.a(i15, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f232904a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i15, CharSequence charSequence) {
            this.f232904a.c(i15, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f232904a.d(new d(a.g(b.b(authenticationResult))));
        }
    }

    static class b {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i15, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i15, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    public static abstract class c {
        public abstract void a(int i15, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i15, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f232905a;

        public d(e eVar) {
            this.f232905a = eVar;
        }

        public e a() {
            return this.f232905a;
        }
    }

    private a(Context context) {
        this.f232903a = context;
    }

    public static a c(Context context) {
        return new a(context);
    }

    private static FingerprintManager d(Context context) {
        return b.c(context);
    }

    static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C6258a(cVar);
    }

    private static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i15, CancellationSignal cancellationSignal, c cVar, Handler handler) {
        FingerprintManager fingerprintManagerD = d(this.f232903a);
        if (fingerprintManagerD != null) {
            b.a(fingerprintManagerD, i(eVar), cancellationSignal, i15, h(cVar), handler);
        }
    }

    @Deprecated
    public void b(e eVar, int i15, e6.d dVar, c cVar, Handler handler) {
        a(eVar, i15, dVar != null ? (CancellationSignal) dVar.b() : null, cVar, handler);
    }

    public boolean e() {
        FingerprintManager fingerprintManagerD = d(this.f232903a);
        return fingerprintManagerD != null && b.d(fingerprintManagerD);
    }

    public boolean f() {
        FingerprintManager fingerprintManagerD = d(this.f232903a);
        return fingerprintManagerD != null && b.e(fingerprintManagerD);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f232906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f232907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f232908c;

        public e(Signature signature) {
            this.f232906a = signature;
            this.f232907b = null;
            this.f232908c = null;
        }

        public Cipher a() {
            return this.f232907b;
        }

        public Mac b() {
            return this.f232908c;
        }

        public Signature c() {
            return this.f232906a;
        }

        public e(Cipher cipher) {
            this.f232907b = cipher;
            this.f232906a = null;
            this.f232908c = null;
        }

        public e(Mac mac) {
            this.f232908c = mac;
            this.f232907b = null;
            this.f232906a = null;
        }
    }
}
