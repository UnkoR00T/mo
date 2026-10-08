package p010PrN;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z5.a.c f873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d f874c;

    class a extends z5.a.c {
        a() {
        }

        @Override // z5.a.c
        public void a(int i15, CharSequence charSequence) {
            h1.this.f874c.a(i15, charSequence);
        }

        @Override // z5.a.c
        public void b() {
            h1.this.f874c.b();
        }

        @Override // z5.a.c
        public void c(int i15, CharSequence charSequence) {
            h1.this.f874c.c(charSequence);
        }

        @Override // z5.a.c
        public void d(z5.a.d dVar) {
            h1.this.f874c.d(new m1.b(dVar != null ? p1.c(dVar.a()) : null, 2));
        }
    }

    private static class b {

        class a extends BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f876a;

            a(d dVar) {
                this.f876a = dVar;
            }

            public void onAuthenticationError(int i15, CharSequence charSequence) {
                this.f876a.a(i15, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f876a.b();
            }

            public void onAuthenticationHelp(int i15, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                m1.c cVarB = authenticationResult != null ? p1.b(authenticationResult.getCryptoObject()) : null;
                int i15 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i15 >= 30) {
                    if (authenticationResult != null) {
                        iA = c.a(authenticationResult);
                    }
                } else if (i15 != 29) {
                    iA = 2;
                }
                this.f876a.d(new m1.b(cVarB, iA));
            }
        }

        static BiometricPrompt$AuthenticationCallback a(d dVar) {
            return new a(dVar);
        }
    }

    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class d {
        d() {
        }

        void a(int i15, CharSequence charSequence) {
            throw null;
        }

        void b() {
            throw null;
        }

        void c(CharSequence charSequence) {
            throw null;
        }

        void d(m1.b bVar) {
            throw null;
        }
    }

    h1(d dVar) {
        this.f874c = dVar;
    }

    BiometricPrompt$AuthenticationCallback a() {
        if (this.f872a == null) {
            this.f872a = b.a(this.f874c);
        }
        return this.f872a;
    }

    z5.a.c b() {
        if (this.f873b == null) {
            this.f873b = new a();
        }
        return this.f873b;
    }
}
