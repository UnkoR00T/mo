package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.p016lifecycle.C6451z0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class n extends o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler F0;
    private boolean O0;
    private Dialog Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private Runnable G0 = new a();
    private DialogInterface.OnCancelListener H0 = new b();
    private DialogInterface.OnDismissListener I0 = new c();
    private int J0 = 0;
    private int K0 = 0;
    private boolean L0 = true;
    private boolean M0 = true;
    private int N0 = -1;
    private androidx.p016lifecycle.c0<androidx.p016lifecycle.q> P0 = new d();
    private boolean U0 = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.I0.onDismiss(n.this.Q0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (n.this.Q0 != null) {
                n nVar = n.this;
                nVar.onCancel(nVar.Q0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (n.this.Q0 != null) {
                n nVar = n.this;
                nVar.onDismiss(nVar.Q0);
            }
        }
    }

    class d implements androidx.p016lifecycle.c0<androidx.p016lifecycle.q> {
        d() {
        }

        @Override // androidx.p016lifecycle.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.p016lifecycle.q qVar) {
            if (qVar == null || !n.this.M0) {
                return;
            }
            View viewA1 = n.this.A1();
            if (viewA1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (n.this.Q0 != null) {
                if (FragmentManager.L0(3)) {
                    toString();
                    Objects.toString(n.this.Q0);
                }
                n.this.Q0.setContentView(viewA1);
            }
        }
    }

    class e extends e7.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e7.g f12587a;

        e(e7.g gVar) {
            this.f12587a = gVar;
        }

        @Override // e7.g
        public View e(int i15) {
            return this.f12587a.g() ? this.f12587a.e(i15) : n.this.a2(i15);
        }

        @Override // e7.g
        public boolean g() {
            return this.f12587a.g() || n.this.b2();
        }
    }

    private void W1(boolean z15, boolean z16, boolean z17) {
        if (this.S0) {
            return;
        }
        this.S0 = true;
        this.T0 = false;
        Dialog dialog = this.Q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.Q0.dismiss();
            if (!z16) {
                if (Looper.myLooper() == this.F0.getLooper()) {
                    onDismiss(this.Q0);
                } else {
                    this.F0.post(this.G0);
                }
            }
        }
        this.R0 = true;
        if (this.N0 >= 0) {
            if (z17) {
                N().b1(this.N0, 1);
            } else {
                N().Y0(this.N0, 1, z15);
            }
            this.N0 = -1;
            return;
        }
        c0 c0VarO = N().o();
        c0VarO.u(true);
        c0VarO.o(this);
        if (z17) {
            c0VarO.j();
        } else if (z15) {
            c0VarO.i();
        } else {
            c0VarO.h();
        }
    }

    private void c2(Bundle bundle) {
        if (this.M0 && !this.U0) {
            try {
                this.O0 = true;
                Dialog dialogZ1 = Z1(bundle);
                this.Q0 = dialogZ1;
                if (this.M0) {
                    f2(dialogZ1, this.J0);
                    Context contextZ = z();
                    if (contextZ instanceof Activity) {
                        this.Q0.setOwnerActivity((Activity) contextZ);
                    }
                    this.Q0.setCancelable(this.L0);
                    this.Q0.setOnCancelListener(this.H0);
                    this.Q0.setOnDismissListener(this.I0);
                    this.U0 = true;
                } else {
                    this.Q0 = null;
                }
            } finally {
                this.O0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.o
    public void E0() {
        super.E0();
        Dialog dialog = this.Q0;
        if (dialog != null) {
            this.R0 = true;
            dialog.setOnDismissListener(null);
            this.Q0.dismiss();
            if (!this.S0) {
                onDismiss(this.Q0);
            }
            this.Q0 = null;
            this.U0 = false;
        }
    }

    @Override // androidx.fragment.app.o
    public void F0() {
        super.F0();
        if (!this.T0 && !this.S0) {
            this.S0 = true;
        }
        e0().n(this.P0);
    }

    @Override // androidx.fragment.app.o
    public LayoutInflater G0(Bundle bundle) {
        LayoutInflater layoutInflaterG0 = super.G0(bundle);
        if (this.M0 && !this.O0) {
            c2(bundle);
            if (FragmentManager.L0(2)) {
                toString();
            }
            Dialog dialog = this.Q0;
            if (dialog != null) {
                return layoutInflaterG0.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.L0(2)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("getting layout inflater for DialogFragment ");
            sb5.append(this);
        }
        return layoutInflaterG0;
    }

    @Override // androidx.fragment.app.o
    public void T0(Bundle bundle) {
        super.T0(bundle);
        Dialog dialog = this.Q0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i15 = this.J0;
        if (i15 != 0) {
            bundle.putInt("android:style", i15);
        }
        int i16 = this.K0;
        if (i16 != 0) {
            bundle.putInt("android:theme", i16);
        }
        boolean z15 = this.L0;
        if (!z15) {
            bundle.putBoolean("android:cancelable", z15);
        }
        boolean z16 = this.M0;
        if (!z16) {
            bundle.putBoolean("android:showsDialog", z16);
        }
        int i17 = this.N0;
        if (i17 != -1) {
            bundle.putInt("android:backStackId", i17);
        }
    }

    @Override // androidx.fragment.app.o
    public void U0() {
        super.U0();
        Dialog dialog = this.Q0;
        if (dialog != null) {
            this.R0 = false;
            dialog.show();
            View decorView = this.Q0.getWindow().getDecorView();
            C6451z0.b(decorView, this);
            androidx.p016lifecycle.View.b(decorView, this);
            ua.n.b(decorView, this);
        }
    }

    public void U1() {
        W1(false, false, false);
    }

    @Override // androidx.fragment.app.o
    public void V0() {
        super.V0();
        Dialog dialog = this.Q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void V1() {
        W1(true, false, false);
    }

    @Override // androidx.fragment.app.o
    public void X0(Bundle bundle) {
        Bundle bundle2;
        super.X0(bundle);
        if (this.Q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.Q0.onRestoreInstanceState(bundle2);
    }

    public Dialog X1() {
        return this.Q0;
    }

    public int Y1() {
        return this.K0;
    }

    public Dialog Z1(Bundle bundle) {
        if (FragmentManager.L0(3)) {
            toString();
        }
        return new CON.w(z1(), Y1());
    }

    View a2(int i15) {
        Dialog dialog = this.Q0;
        if (dialog != null) {
            return dialog.findViewById(i15);
        }
        return null;
    }

    boolean b2() {
        return this.U0;
    }

    public final Dialog d2() {
        Dialog dialogX1 = X1();
        if (dialogX1 != null) {
            return dialogX1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.o
    void e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.e1(layoutInflater, viewGroup, bundle);
        if (this.R != null || this.Q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.Q0.onRestoreInstanceState(bundle2);
    }

    public void e2(boolean z15) {
        this.M0 = z15;
    }

    public void f2(Dialog dialog, int i15) {
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void g2(FragmentManager fragmentManager, String str) {
        this.S0 = false;
        this.T0 = true;
        c0 c0VarO = fragmentManager.o();
        c0VarO.u(true);
        c0VarO.e(this, str);
        c0VarO.h();
    }

    @Override // androidx.fragment.app.o
    e7.g l() {
        return new e(super.l());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.R0) {
            return;
        }
        if (FragmentManager.L0(3)) {
            toString();
        }
        W1(true, true, false);
    }

    @Override // androidx.fragment.app.o
    @Deprecated
    public void r0(Bundle bundle) {
        super.r0(bundle);
    }

    @Override // androidx.fragment.app.o
    public void u0(Context context) {
        super.u0(context);
        e0().j(this.P0);
        if (this.T0) {
            return;
        }
        this.S0 = false;
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle bundle) {
        super.x0(bundle);
        this.F0 = new Handler();
        this.M0 = this.D == 0;
        if (bundle != null) {
            this.J0 = bundle.getInt("android:style", 0);
            this.K0 = bundle.getInt("android:theme", 0);
            this.L0 = bundle.getBoolean("android:cancelable", true);
            this.M0 = bundle.getBoolean("android:showsDialog", this.M0);
            this.N0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
