package p010PrN;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import io.sentry.android.core.c2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiometricManager f900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z5.a f901c;

    private static class a {
        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    private static class b {
        static int a(BiometricManager biometricManager, int i15) {
            return biometricManager.canAuthenticate(i15);
        }
    }

    private static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f902a;

        c(Context context) {
            this.f902a = context.getApplicationContext();
        }

        @Override // PrN.l1.d
        public boolean a() {
            return t1.a(this.f902a) != null;
        }

        @Override // PrN.l1.d
        public boolean b() {
            return t1.b(this.f902a);
        }

        @Override // PrN.l1.d
        public boolean c() {
            return q1.a(this.f902a, Build.MODEL);
        }

        @Override // PrN.l1.d
        public z5.a d() {
            return z5.a.c(this.f902a);
        }

        @Override // PrN.l1.d
        public BiometricManager e() {
            return a.b(this.f902a);
        }

        @Override // PrN.l1.d
        public boolean f() {
            return u1.a(this.f902a);
        }
    }

    interface d {
        boolean a();

        boolean b();

        boolean c();

        z5.a d();

        BiometricManager e();

        boolean f();
    }

    l1(d dVar) {
        this.f899a = dVar;
        int i15 = Build.VERSION.SDK_INT;
        this.f900b = i15 >= 29 ? dVar.e() : null;
        this.f901c = i15 <= 29 ? dVar.d() : null;
    }

    private int b(int i15) {
        if (!i1.e(i15)) {
            return -2;
        }
        if (i15 == 0 || !this.f899a.a()) {
            return 12;
        }
        if (i1.c(i15)) {
            return this.f899a.b() ? 0 : 11;
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 == 29) {
            return i1.f(i15) ? f() : e();
        }
        if (i16 != 28) {
            return c();
        }
        if (this.f899a.f()) {
            return d();
        }
        return 12;
    }

    private int c() {
        z5.a aVar = this.f901c;
        if (aVar == null) {
            c2.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (aVar.f()) {
            return !this.f901c.e() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        if (this.f899a.b()) {
            return c() == 0 ? 0 : -1;
        }
        return c();
    }

    private int e() {
        BiometricPrompt.CryptoObject cryptoObjectD;
        Method methodC = a.c();
        if (methodC != null && (cryptoObjectD = p1.d(p1.a())) != null) {
            try {
                Object objInvoke = methodC.invoke(this.f900b, cryptoObjectD);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                c2.g("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e15) {
                e = e15;
                c2.h("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (IllegalArgumentException e16) {
                e = e16;
                c2.h("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (InvocationTargetException e17) {
                e = e17;
                c2.h("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iF = f();
        return (this.f899a.c() || iF != 0) ? iF : d();
    }

    private int f() {
        BiometricManager biometricManager = this.f900b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        c2.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static l1 g(Context context) {
        return new l1(new c(context));
    }

    public int a(int i15) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i15);
        }
        BiometricManager biometricManager = this.f900b;
        if (biometricManager != null) {
            return b.a(biometricManager, i15);
        }
        c2.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
