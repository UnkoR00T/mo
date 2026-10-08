package androidx.fragment.app;

import CON.q0;
import CON.s0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.p;
import androidx.p016lifecycle.x0;
import androidx.p016lifecycle.y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class p extends CON.p implements s5.b.InterfaceC4546b {
    final r A;
    final androidx.p016lifecycle.s B;
    boolean C;
    boolean D;
    boolean E;

    class a extends t<p> implements u5.b, u5.c, s5.p, s5.q, y0, s0, p006NUl.i, ua.j, e7.n, j6.o {
        public a() {
            super(p.this);
        }

        @Override // u5.c
        public void A(i6.a<Integer> aVar) {
            p.this.A(aVar);
        }

        @Override // j6.o
        public void B(j6.r rVar) {
            p.this.B(rVar);
        }

        public void C() {
            p.this.i0();
        }

        @Override // androidx.fragment.app.t
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public p v() {
            return p.this;
        }

        @Override // androidx.p016lifecycle.q
        /* JADX INFO: renamed from: a */
        public androidx.p016lifecycle.j getLifecycleRegistry() {
            return p.this.B;
        }

        @Override // e7.n
        public void b(FragmentManager fragmentManager, o oVar) {
            p.this.B0(oVar);
        }

        @Override // s5.q
        public void c(i6.a<s5.t> aVar) {
            p.this.c(aVar);
        }

        @Override // androidx.fragment.app.t, e7.g
        public View e(int i15) {
            return p.this.findViewById(i15);
        }

        @Override // p006NUl.i
        /* JADX INFO: renamed from: f */
        public p006NUl.h getActivityResultRegistry() {
            return p.this.getActivityResultRegistry();
        }

        @Override // androidx.fragment.app.t, e7.g
        public boolean g() {
            Window window = p.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.p016lifecycle.y0
        public x0 h() {
            return p.this.h();
        }

        @Override // u5.b
        public void i(i6.a<Configuration> aVar) {
            p.this.i(aVar);
        }

        @Override // u5.c
        public void j(i6.a<Integer> aVar) {
            p.this.j(aVar);
        }

        @Override // ua.j
        public ua.g k() {
            return p.this.k();
        }

        @Override // s5.q
        public void m(i6.a<s5.t> aVar) {
            p.this.m(aVar);
        }

        @Override // CON.s0
        public q0 o() {
            return p.this.o();
        }

        @Override // s5.p
        public void q(i6.a<s5.i> aVar) {
            p.this.q(aVar);
        }

        @Override // androidx.fragment.app.t
        public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            p.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // s5.p
        public void t(i6.a<s5.i> aVar) {
            p.this.t(aVar);
        }

        @Override // u5.b
        public void u(i6.a<Configuration> aVar) {
            p.this.u(aVar);
        }

        @Override // androidx.fragment.app.t
        public LayoutInflater w() {
            return p.this.getLayoutInflater().cloneInContext(p.this);
        }

        @Override // j6.o
        public void y(j6.r rVar) {
            p.this.y(rVar);
        }

        @Override // androidx.fragment.app.t
        public void z() {
            C();
        }
    }

    public p() {
        this.A = r.b(new a());
        this.B = new androidx.p016lifecycle.s(this);
        this.E = true;
        y0();
    }

    private static boolean A0(FragmentManager fragmentManager, androidx.lifecycle.j.b bVar) {
        boolean zA0 = false;
        for (o oVar : fragmentManager.x0()) {
            if (oVar != null) {
                if (oVar.H() != null) {
                    zA0 |= A0(oVar.y(), bVar);
                }
                g0 g0Var = oVar.f12616w0;
                if (g0Var != null && g0Var.getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.STARTED)) {
                    oVar.f12616w0.g(bVar);
                    zA0 = true;
                }
                if (oVar.f12614v0.getState().e(androidx.lifecycle.j.b.STARTED)) {
                    oVar.f12614v0.n(bVar);
                    zA0 = true;
                }
            }
        }
        return zA0;
    }

    public static /* synthetic */ Bundle t0(p pVar) {
        pVar.z0();
        pVar.B.i(androidx.lifecycle.j.a.ON_STOP);
        return new Bundle();
    }

    private void y0() {
        k().c("android:support:lifecycle", new ua.g.b() { // from class: e7.c
            @Override // ua.g.b
            public final Bundle a() {
                return p.t0(this.f47904a);
            }
        });
        i(new i6.a() { // from class: e7.d
            @Override // i6.a
            public final void accept(Object obj) {
                this.f47905a.A.m();
            }
        });
        Z(new i6.a() { // from class: e7.e
            @Override // i6.a
            public final void accept(Object obj) {
                this.f47906a.A.m();
            }
        });
        Y(new p083nUl.a0() { // from class: e7.f
            @Override // p083nUl.a0
            public final void a(Context context) {
                this.f47907a.A.a(null);
            }
        });
    }

    @Deprecated
    public void B0(o oVar) {
    }

    protected void C0() {
        this.B.i(androidx.lifecycle.j.a.ON_RESUME);
        this.A.h();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (C(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.C);
            printWriter.print(" mResumed=");
            printWriter.print(this.D);
            printWriter.print(" mStopped=");
            printWriter.print(this.E);
            if (getApplication() != null) {
                androidx.loader.app.a.c(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.A.l().X(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // s5.b.InterfaceC4546b
    @Deprecated
    public final void n(int i15) {
    }

    @Override // CON.p, android.app.Activity
    protected void onActivityResult(int i15, int i16, Intent intent) {
        this.A.m();
        super.onActivityResult(i15, i16, intent);
    }

    @Override // CON.p, s5.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B.i(androidx.lifecycle.j.a.ON_CREATE);
        this.A.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewV0 = v0(view, str, context, attributeSet);
        return viewV0 == null ? super.onCreateView(view, str, context, attributeSet) : viewV0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.A.f();
        this.B.i(androidx.lifecycle.j.a.ON_DESTROY);
    }

    @Override // CON.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i15, MenuItem menuItem) {
        if (super.onMenuItemSelected(i15, menuItem)) {
            return true;
        }
        if (i15 == 6) {
            return this.A.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.D = false;
        this.A.g();
        this.B.i(androidx.lifecycle.j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        C0();
    }

    @Override // CON.p, android.app.Activity
    public void onRequestPermissionsResult(int i15, String[] strArr, int[] iArr) {
        this.A.m();
        super.onRequestPermissionsResult(i15, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.A.m();
        super.onResume();
        this.D = true;
        this.A.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.A.m();
        super.onStart();
        this.E = false;
        if (!this.C) {
            this.C = true;
            this.A.c();
        }
        this.A.k();
        this.B.i(androidx.lifecycle.j.a.ON_START);
        this.A.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.A.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.E = true;
        z0();
        this.A.j();
        this.B.i(androidx.lifecycle.j.a.ON_STOP);
    }

    final View v0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.A.n(view, str, context, attributeSet);
    }

    public FragmentManager w0() {
        return this.A.l();
    }

    @Deprecated
    public androidx.loader.app.a x0() {
        return androidx.loader.app.a.c(this);
    }

    void z0() {
        while (A0(w0(), androidx.lifecycle.j.b.CREATED)) {
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewV0 = v0(null, str, context, attributeSet);
        return viewV0 == null ? super.onCreateView(str, context, attributeSet) : viewV0;
    }

    public p(int i15) {
        super(i15);
        this.A = r.b(new a());
        this.B = new androidx.p016lifecycle.s(this);
        this.E = true;
        y0();
    }
}
