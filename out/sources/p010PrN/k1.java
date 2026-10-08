package p010PrN;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.p016lifecycle.c0;
import androidx.p016lifecycle.w0;
import io.sentry.android.core.c2;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public class k1 extends androidx.fragment.app.o {
    Handler F0 = new Handler(Looper.getMainLooper());
    n1 G0;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f880b;

        a(int i15, CharSequence charSequence) {
            this.f879a = i15;
            this.f880b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.G0.g9().a(this.f879a, this.f880b);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.G0.g9().b();
        }
    }

    class c implements c0<m1.b> {
        c() {
        }

        @Override // androidx.p016lifecycle.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m1.b bVar) {
            if (bVar != null) {
                k1.this.l2(bVar);
                k1.this.G0.F9(null);
            }
        }
    }

    class d implements c0<j1> {
        d() {
        }

        @Override // androidx.p016lifecycle.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j1 j1Var) {
            if (j1Var != null) {
                k1.this.i2(j1Var.b(), j1Var.c());
                k1.this.G0.C9(null);
            }
        }
    }

    class e implements c0<CharSequence> {
        e() {
        }

        @Override // androidx.p016lifecycle.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CharSequence charSequence) {
            if (charSequence != null) {
                k1.this.k2(charSequence);
                k1.this.G0.C9(null);
            }
        }
    }

    class f implements c0<Boolean> {
        f() {
        }

        @Override // androidx.p016lifecycle.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                k1.this.j2();
                k1.this.G0.D9(false);
            }
        }
    }

    class g implements c0<Boolean> {
        g() {
        }

        @Override // androidx.p016lifecycle.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                if (k1.this.e2()) {
                    k1.this.n2();
                } else {
                    k1.this.m2();
                }
                k1.this.G0.T9(false);
            }
        }
    }

    class h implements c0<Boolean> {
        h() {
        }

        @Override // androidx.p016lifecycle.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                k1.this.U1(1);
                k1.this.X1();
                k1.this.G0.N9(false);
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.G0.O9(false);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f891b;

        j(int i15, CharSequence charSequence) {
            this.f890a = i15;
            this.f891b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.o2(this.f890a, this.f891b);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m1.b f893a;

        k(m1.b bVar) {
            this.f893a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.G0.g9().c(this.f893a);
        }
    }

    private static class l {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    private static class m {
        static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class n {
        static void a(BiometricPrompt.Builder builder, boolean z15) {
            builder.setConfirmationRequired(z15);
        }

        static void b(BiometricPrompt.Builder builder, boolean z15) {
            builder.setDeviceCredentialAllowed(z15);
        }
    }

    private static class o {
        static void a(BiometricPrompt.Builder builder, int i15) {
            builder.setAllowedAuthenticators(i15);
        }
    }

    private static class p implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f895a = new Handler(Looper.getMainLooper());

        p() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f895a.post(runnable);
        }
    }

    private static class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<k1> f896a;

        q(k1 k1Var) {
            this.f896a = new WeakReference<>(k1Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f896a.get() != null) {
                this.f896a.get().w2();
            }
        }
    }

    private static class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<n1> f897a;

        r(n1 n1Var) {
            this.f897a = new WeakReference<>(n1Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f897a.get() != null) {
                this.f897a.get().M9(false);
            }
        }
    }

    private static class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<n1> f898a;

        s(n1 n1Var) {
            this.f898a = new WeakReference<>(n1Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f898a.get() != null) {
                this.f898a.get().S9(false);
            }
        }
    }

    private static int V1(z5.a aVar) {
        if (aVar.f()) {
            return !aVar.e() ? 11 : 0;
        }
        return 12;
    }

    private void W1() {
        if (r() == null) {
            return;
        }
        n1 n1Var = (n1) new w0(r()).a(n1.class);
        this.G0 = n1Var;
        n1Var.d9().i(this, new c());
        this.G0.b9().i(this, new d());
        this.G0.c9().i(this, new e());
        this.G0.s9().i(this, new f());
        this.G0.A9().i(this, new g());
        this.G0.x9().i(this, new h());
    }

    private void Y1() {
        this.G0.W9(false);
        if (i0()) {
            FragmentManager fragmentManagerN = N();
            s1 s1Var = (s1) fragmentManagerN.j0("androidx.biometric.FingerprintDialogFragment");
            if (s1Var != null) {
                if (s1Var.i0()) {
                    s1Var.V1();
                } else {
                    fragmentManagerN.o().o(s1Var).i();
                }
            }
        }
    }

    private int Z1() {
        Context contextZ = z();
        return (contextZ == null || !q1.f(contextZ, Build.MODEL)) ? 2000 : 0;
    }

    private void a2(int i15) {
        if (i15 == -1) {
            r2(new m1.b(null, 1));
        } else {
            o2(10, Z(a2.f871l));
        }
    }

    private boolean b2() {
        androidx.fragment.app.p pVarR = r();
        return pVarR != null && pVarR.isChangingConfigurations();
    }

    private boolean c2() {
        androidx.fragment.app.p pVarR = r();
        return (pVarR == null || this.G0.i9() == null || !q1.g(pVarR, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean d2() {
        return Build.VERSION.SDK_INT == 28 && !u1.a(z());
    }

    private boolean f2() {
        return Build.VERSION.SDK_INT < 28 || c2() || d2();
    }

    private void g2() {
        androidx.fragment.app.p pVarR = r();
        if (pVarR == null) {
            c2.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = t1.a(pVarR);
        if (keyguardManagerA == null) {
            o2(12, Z(a2.f870k));
            return;
        }
        CharSequence charSequenceR9 = this.G0.r9();
        CharSequence charSequenceQ9 = this.G0.q9();
        CharSequence charSequenceJ9 = this.G0.j9();
        if (charSequenceQ9 == null) {
            charSequenceQ9 = charSequenceJ9;
        }
        Intent intentA = l.a(keyguardManagerA, charSequenceR9, charSequenceQ9);
        if (intentA == null) {
            o2(14, Z(a2.f869j));
            return;
        }
        this.G0.K9(true);
        if (f2()) {
            Y1();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    static k1 h2() {
        return new k1();
    }

    private void p2(int i15, CharSequence charSequence) {
        if (this.G0.v9()) {
            return;
        }
        if (!this.G0.t9()) {
            c2.g("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.G0.G9(false);
            this.G0.h9().execute(new a(i15, charSequence));
        }
    }

    private void q2() {
        if (this.G0.t9()) {
            this.G0.h9().execute(new b());
        } else {
            c2.g("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void r2(m1.b bVar) {
        s2(bVar);
        X1();
    }

    private void s2(m1.b bVar) {
        if (!this.G0.t9()) {
            c2.g("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.G0.G9(false);
            this.G0.h9().execute(new k(bVar));
        }
    }

    private void t2() {
        BiometricPrompt.Builder builderD = m.d(z1().getApplicationContext());
        CharSequence charSequenceR9 = this.G0.r9();
        CharSequence charSequenceQ9 = this.G0.q9();
        CharSequence charSequenceJ9 = this.G0.j9();
        if (charSequenceR9 != null) {
            m.h(builderD, charSequenceR9);
        }
        if (charSequenceQ9 != null) {
            m.g(builderD, charSequenceQ9);
        }
        if (charSequenceJ9 != null) {
            m.e(builderD, charSequenceJ9);
        }
        CharSequence charSequenceP9 = this.G0.p9();
        if (!TextUtils.isEmpty(charSequenceP9)) {
            m.f(builderD, charSequenceP9, this.G0.h9(), this.G0.o9());
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            n.a(builderD, this.G0.u9());
        }
        int iZ8 = this.G0.Z8();
        if (i15 >= 30) {
            o.a(builderD, iZ8);
        } else if (i15 >= 29) {
            n.b(builderD, i1.c(iZ8));
        }
        S1(m.c(builderD), z());
    }

    private void u2() {
        Context applicationContext = z1().getApplicationContext();
        z5.a aVarC = z5.a.c(applicationContext);
        int iV1 = V1(aVarC);
        if (iV1 != 0) {
            o2(iV1, r1.a(applicationContext, iV1));
            return;
        }
        if (i0()) {
            this.G0.O9(true);
            if (!q1.f(applicationContext, Build.MODEL)) {
                this.F0.postDelayed(new i(), 500L);
                s1.k2().g2(N(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.G0.H9(0);
            T1(aVarC, applicationContext);
        }
    }

    private void v2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = Z(a2.f861b);
        }
        this.G0.R9(2);
        this.G0.P9(charSequence);
    }

    void R1(m1.d dVar, m1.c cVar) {
        androidx.fragment.app.p pVarR = r();
        if (pVarR == null) {
            c2.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.G0.V9(dVar);
        int iB = i1.b(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iB == 15 && cVar == null) {
            this.G0.L9(p1.a());
        } else {
            this.G0.L9(cVar);
        }
        if (e2()) {
            this.G0.U9(Z(a2.f860a));
        } else {
            this.G0.U9(null);
        }
        if (e2() && l1.g(pVarR).a(GF2Field.MASK) != 0) {
            this.G0.G9(true);
            g2();
        } else if (this.G0.w9()) {
            this.F0.postDelayed(new q(this), 600L);
        } else {
            w2();
        }
    }

    void S1(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectD = p1.d(this.G0.i9());
        CancellationSignal cancellationSignalB = this.G0.f9().b();
        p pVar = new p();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = this.G0.a9().a();
        try {
            if (cryptoObjectD == null) {
                m.b(biometricPrompt, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            } else {
                m.a(biometricPrompt, cryptoObjectD, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            }
        } catch (NullPointerException e15) {
            c2.f("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e15);
            o2(1, context != null ? context.getString(a2.f861b) : "");
        }
    }

    void T1(z5.a aVar, Context context) {
        try {
            aVar.b(p1.e(this.G0.i9()), 0, this.G0.f9().c(), this.G0.a9().b(), null);
        } catch (NullPointerException e15) {
            c2.f("BiometricFragment", "Got NPE while authenticating with fingerprint.", e15);
            o2(1, r1.a(context, 1));
        }
    }

    @Override // androidx.fragment.app.o
    public void U0() {
        super.U0();
        if (Build.VERSION.SDK_INT == 29 && i1.c(this.G0.Z8())) {
            this.G0.S9(true);
            this.F0.postDelayed(new s(this.G0), 250L);
        }
    }

    void U1(int i15) {
        if (i15 == 3 || !this.G0.z9()) {
            if (f2()) {
                this.G0.H9(i15);
                if (i15 == 1) {
                    p2(10, r1.a(z(), 10));
                }
            }
            this.G0.f9().a();
        }
    }

    @Override // androidx.fragment.app.o
    public void V0() {
        super.V0();
        if (Build.VERSION.SDK_INT >= 29 || this.G0.v9() || b2()) {
            return;
        }
        U1(0);
    }

    void X1() {
        this.G0.W9(false);
        Y1();
        if (!this.G0.v9() && i0()) {
            N().o().o(this).i();
        }
        Context contextZ = z();
        if (contextZ == null || !q1.e(contextZ, Build.MODEL)) {
            return;
        }
        this.G0.M9(true);
        this.F0.postDelayed(new r(this.G0), 600L);
    }

    boolean e2() {
        return Build.VERSION.SDK_INT <= 28 && i1.c(this.G0.Z8());
    }

    void i2(int i15, CharSequence charSequence) {
        if (!r1.b(i15)) {
            i15 = 8;
        }
        Context contextZ = z();
        if (Build.VERSION.SDK_INT < 29 && r1.c(i15) && contextZ != null && t1.b(contextZ) && i1.c(this.G0.Z8())) {
            g2();
            return;
        }
        if (!f2()) {
            if (charSequence == null) {
                charSequence = Z(a2.f861b) + " " + i15;
            }
            o2(i15, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = r1.a(z(), i15);
        }
        if (i15 == 5) {
            int iE9 = this.G0.e9();
            if (iE9 == 0 || iE9 == 3) {
                p2(i15, charSequence);
            }
            X1();
            return;
        }
        if (this.G0.y9()) {
            o2(i15, charSequence);
        } else {
            v2(charSequence);
            this.F0.postDelayed(new j(i15, charSequence), Z1());
        }
        this.G0.O9(true);
    }

    void j2() {
        if (f2()) {
            v2(Z(a2.f868i));
        }
        q2();
    }

    void k2(CharSequence charSequence) {
        if (f2()) {
            v2(charSequence);
        }
    }

    void l2(m1.b bVar) {
        r2(bVar);
    }

    void m2() {
        CharSequence charSequenceP9 = this.G0.p9();
        if (charSequenceP9 == null) {
            charSequenceP9 = Z(a2.f861b);
        }
        o2(13, charSequenceP9);
        U1(2);
    }

    void n2() {
        g2();
    }

    void o2(int i15, CharSequence charSequence) {
        p2(i15, charSequence);
        X1();
    }

    @Override // androidx.fragment.app.o
    public void s0(int i15, int i16, Intent intent) {
        super.s0(i15, i16, intent);
        if (i15 == 1) {
            this.G0.K9(false);
            a2(i16);
        }
    }

    void w2() {
        if (this.G0.B9()) {
            return;
        }
        if (z() == null) {
            c2.g("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.G0.W9(true);
        this.G0.G9(true);
        if (f2()) {
            u2();
        } else {
            t2();
        }
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle bundle) {
        super.x0(bundle);
        W1();
    }
}
