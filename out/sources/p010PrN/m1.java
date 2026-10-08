package p010PrN;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.p016lifecycle.w0;
import io.sentry.android.core.c2;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FragmentManager f903a;

    public static abstract class a {
        public void a(int i15, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f905b;

        b(c cVar, int i15) {
            this.f904a = cVar;
            this.f905b = i15;
        }

        public int a() {
            return this.f905b;
        }

        public c b() {
            return this.f904a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CharSequence f912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CharSequence f913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f916g;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private CharSequence f917a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private CharSequence f918b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f919c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private CharSequence f920d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f921e = true;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f922f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f923g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f917a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!i1.e(this.f923g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + i1.a(this.f923g));
                }
                int i15 = this.f923g;
                boolean zC = i15 != 0 ? i1.c(i15) : this.f922f;
                if (TextUtils.isEmpty(this.f920d) && !zC) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f920d) || !zC) {
                    return new d(this.f917a, this.f918b, this.f919c, this.f920d, this.f921e, this.f922f, this.f923g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(int i15) {
                this.f923g = i15;
                return this;
            }

            public a c(boolean z15) {
                this.f921e = z15;
                return this;
            }

            public a d(CharSequence charSequence) {
                this.f919c = charSequence;
                return this;
            }

            public a e(CharSequence charSequence) {
                this.f920d = charSequence;
                return this;
            }

            public a f(CharSequence charSequence) {
                this.f918b = charSequence;
                return this;
            }

            public a g(CharSequence charSequence) {
                this.f917a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z15, boolean z16, int i15) {
            this.f910a = charSequence;
            this.f911b = charSequence2;
            this.f912c = charSequence3;
            this.f913d = charSequence4;
            this.f914e = z15;
            this.f915f = z16;
            this.f916g = i15;
        }

        public int a() {
            return this.f916g;
        }

        public CharSequence b() {
            return this.f912c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f913d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f911b;
        }

        public CharSequence e() {
            return this.f910a;
        }

        public boolean f() {
            return this.f914e;
        }

        @Deprecated
        public boolean g() {
            return this.f915f;
        }
    }

    @SuppressLint({"LambdaLast"})
    public m1(p pVar, Executor executor, a aVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        h(pVar.w0(), g(pVar), executor, aVar);
    }

    private void c(d dVar, c cVar) {
        FragmentManager fragmentManager = this.f903a;
        if (fragmentManager == null) {
            c2.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.S0()) {
            c2.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            f(this.f903a).R1(dVar, cVar);
        }
    }

    private static k1 e(FragmentManager fragmentManager) {
        return (k1) fragmentManager.j0("androidx.biometric.BiometricFragment");
    }

    private static k1 f(FragmentManager fragmentManager) {
        k1 k1VarE = e(fragmentManager);
        if (k1VarE != null) {
            return k1VarE;
        }
        k1 k1VarH2 = k1.h2();
        fragmentManager.o().e(k1VarH2, "androidx.biometric.BiometricFragment").i();
        fragmentManager.f0();
        return k1VarH2;
    }

    private static n1 g(p pVar) {
        if (pVar != null) {
            return (n1) new w0(pVar).a(n1.class);
        }
        return null;
    }

    private void h(FragmentManager fragmentManager, n1 n1Var, Executor executor, a aVar) {
        this.f903a = fragmentManager;
        if (n1Var != null) {
            if (executor != null) {
                n1Var.J9(executor);
            }
            n1Var.I9(aVar);
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c(dVar, null);
    }

    public void b(d dVar, c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int iB = i1.b(dVar, cVar);
        if (i1.f(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && i1.c(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        c(dVar, cVar);
    }

    public void d() {
        FragmentManager fragmentManager = this.f903a;
        if (fragmentManager == null) {
            c2.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        k1 k1VarE = e(fragmentManager);
        if (k1VarE == null) {
            c2.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            k1VarE.U1(3);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final IdentityCredential f909d;

        public c(Signature signature) {
            this.f906a = signature;
            this.f907b = null;
            this.f908c = null;
            this.f909d = null;
        }

        public Cipher a() {
            return this.f907b;
        }

        public IdentityCredential b() {
            return this.f909d;
        }

        public Mac c() {
            return this.f908c;
        }

        public Signature d() {
            return this.f906a;
        }

        public c(Cipher cipher) {
            this.f906a = null;
            this.f907b = cipher;
            this.f908c = null;
            this.f909d = null;
        }

        public c(Mac mac) {
            this.f906a = null;
            this.f907b = null;
            this.f908c = mac;
            this.f909d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f906a = null;
            this.f907b = null;
            this.f908c = null;
            this.f909d = identityCredential;
        }
    }
}
