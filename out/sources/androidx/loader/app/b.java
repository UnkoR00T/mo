package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.p016lifecycle.b0;
import androidx.p016lifecycle.c0;
import androidx.p016lifecycle.q;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.x0;
import io.sentry.android.core.c2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import r0.m1;

/* JADX INFO: loaded from: classes3.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f12879c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f12880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f12881b;

    public static class a<D> extends b0<D> implements s7.b.a<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f12882l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f12883m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final s7.b<D> f12884n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private q f12885o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0273b<D> f12886p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private s7.b<D> f12887q;

        a(int i15, Bundle bundle, s7.b<D> bVar, s7.b<D> bVar2) {
            this.f12882l = i15;
            this.f12883m = bundle;
            this.f12884n = bVar;
            this.f12887q = bVar2;
            bVar.r(i15, this);
        }

        @Override // s7.b.a
        public void a(s7.b<D> bVar, D d15) {
            if (b.f12879c) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(d15);
                return;
            }
            if (b.f12879c) {
                c2.g("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d15);
        }

        @Override // androidx.p016lifecycle.y
        protected void k() {
            if (b.f12879c) {
                toString();
            }
            this.f12884n.u();
        }

        @Override // androidx.p016lifecycle.y
        protected void l() {
            if (b.f12879c) {
                toString();
            }
            this.f12884n.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p016lifecycle.y
        public void n(c0<? super D> c0Var) {
            super.n(c0Var);
            this.f12885o = null;
            this.f12886p = null;
        }

        @Override // androidx.p016lifecycle.b0, androidx.p016lifecycle.y
        public void o(D d15) {
            super.o(d15);
            s7.b<D> bVar = this.f12887q;
            if (bVar != null) {
                bVar.s();
                this.f12887q = null;
            }
        }

        s7.b<D> p(boolean z15) {
            if (b.f12879c) {
                toString();
            }
            this.f12884n.b();
            this.f12884n.a();
            C0273b<D> c0273b = this.f12886p;
            if (c0273b != null) {
                n(c0273b);
                if (z15) {
                    c0273b.d();
                }
            }
            this.f12884n.w(this);
            if ((c0273b == null || c0273b.c()) && !z15) {
                return this.f12884n;
            }
            this.f12884n.s();
            return this.f12887q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f12882l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f12883m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f12884n);
            this.f12884n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f12886p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f12886p);
                this.f12886p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        s7.b<D> r() {
            return this.f12884n;
        }

        void s() {
            q qVar = this.f12885o;
            C0273b<D> c0273b = this.f12886p;
            if (qVar == null || c0273b == null) {
                return;
            }
            super.n(c0273b);
            i(qVar, c0273b);
        }

        s7.b<D> t(q qVar, androidx.loader.app.a.InterfaceC0272a<D> interfaceC0272a) {
            C0273b<D> c0273b = new C0273b<>(this.f12884n, interfaceC0272a);
            i(qVar, c0273b);
            C0273b<D> c0273b2 = this.f12886p;
            if (c0273b2 != null) {
                n(c0273b2);
            }
            this.f12885o = qVar;
            this.f12886p = c0273b;
            return this.f12884n;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder(64);
            sb5.append("LoaderInfo{");
            sb5.append(Integer.toHexString(System.identityHashCode(this)));
            sb5.append(" #");
            sb5.append(this.f12882l);
            sb5.append(" : ");
            i6.b.a(this.f12884n, sb5);
            sb5.append("}}");
            return sb5.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0273b<D> implements c0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s7.b<D> f12888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.loader.app.a.InterfaceC0272a<D> f12889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12890c = false;

        C0273b(s7.b<D> bVar, androidx.loader.app.a.InterfaceC0272a<D> interfaceC0272a) {
            this.f12888a = bVar;
            this.f12889b = interfaceC0272a;
        }

        @Override // androidx.p016lifecycle.c0
        public void a(D d15) {
            if (b.f12879c) {
                Objects.toString(this.f12888a);
                this.f12888a.d(d15);
            }
            this.f12889b.e(this.f12888a, d15);
            this.f12890c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f12890c);
        }

        boolean c() {
            return this.f12890c;
        }

        void d() {
            if (this.f12890c) {
                if (b.f12879c) {
                    Objects.toString(this.f12888a);
                }
                this.f12889b.b(this.f12888a);
            }
        }

        public String toString() {
            return this.f12889b.toString();
        }
    }

    static class c extends t0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final w0.c f12891d = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m1<a> f12892b = new m1<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12893c = false;

        static class a implements w0.c {
            a() {
            }

            @Override // androidx.lifecycle.w0.c
            public <T extends t0> T b(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c b9(x0 x0Var) {
            return (c) new w0(x0Var, f12891d).a(c.class);
        }

        @Override // androidx.p016lifecycle.t0
        protected void Y8() {
            super.Y8();
            int iS = this.f12892b.s();
            for (int i15 = 0; i15 < iS; i15++) {
                this.f12892b.t(i15).p(true);
            }
            this.f12892b.c();
        }

        public void Z8(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f12892b.s() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i15 = 0; i15 < this.f12892b.s(); i15++) {
                    a aVarT = this.f12892b.t(i15);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f12892b.m(i15));
                    printWriter.print(": ");
                    printWriter.println(aVarT.toString());
                    aVarT.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void a9() {
            this.f12893c = false;
        }

        <D> a<D> c9(int i15) {
            return this.f12892b.i(i15);
        }

        boolean d9() {
            return this.f12893c;
        }

        void e9() {
            int iS = this.f12892b.s();
            for (int i15 = 0; i15 < iS; i15++) {
                this.f12892b.t(i15).s();
            }
        }

        void f9(int i15, a aVar) {
            this.f12892b.n(i15, aVar);
        }

        void g9(int i15) {
            this.f12892b.o(i15);
        }

        void h9() {
            this.f12893c = true;
        }
    }

    b(q qVar, x0 x0Var) {
        this.f12880a = qVar;
        this.f12881b = c.b9(x0Var);
    }

    private <D> s7.b<D> f(int i15, Bundle bundle, androidx.loader.app.a.InterfaceC0272a<D> interfaceC0272a, s7.b<D> bVar) {
        try {
            this.f12881b.h9();
            s7.b<D> bVarF = interfaceC0272a.f(i15, bundle);
            if (bVarF == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarF.getClass().isMemberClass() && !Modifier.isStatic(bVarF.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarF);
            }
            a aVar = new a(i15, bundle, bVarF, bVar);
            if (f12879c) {
                aVar.toString();
            }
            this.f12881b.f9(i15, aVar);
            this.f12881b.a9();
            return aVar.t(this.f12880a, interfaceC0272a);
        } catch (Throwable th4) {
            this.f12881b.a9();
            throw th4;
        }
    }

    @Override // androidx.loader.app.a
    public void a(int i15) {
        if (this.f12881b.d9()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f12879c) {
            toString();
        }
        a aVarC9 = this.f12881b.c9(i15);
        if (aVarC9 != null) {
            aVarC9.p(true);
            this.f12881b.g9(i15);
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f12881b.Z8(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> s7.b<D> d(int i15, Bundle bundle, androidx.loader.app.a.InterfaceC0272a<D> interfaceC0272a) {
        if (this.f12881b.d9()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarC9 = this.f12881b.c9(i15);
        if (f12879c) {
            toString();
            Objects.toString(bundle);
        }
        if (aVarC9 == null) {
            return f(i15, bundle, interfaceC0272a, null);
        }
        if (f12879c) {
            aVarC9.toString();
        }
        return aVarC9.t(this.f12880a, interfaceC0272a);
    }

    @Override // androidx.loader.app.a
    public void e() {
        this.f12881b.e9();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(128);
        sb5.append("LoaderManager{");
        sb5.append(Integer.toHexString(System.identityHashCode(this)));
        sb5.append(" in ");
        i6.b.a(this.f12880a, sb5);
        sb5.append("}}");
        return sb5.toString();
    }
}
