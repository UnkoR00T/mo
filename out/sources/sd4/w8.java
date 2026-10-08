package sd4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w8 extends j00.b implements lq.c {
    private ContextWrapper G0;
    private volatile iq.f I0;
    private boolean H0 = false;
    private final Object J0 = new Object();
    private boolean K0 = false;

    private void W1() {
        if (this.G0 == null) {
            this.G0 = iq.f.b(super.z(), this);
            this.H0 = eq.a.a(super.z());
        }
    }

    @Override // androidx.fragment.app.o
    public LayoutInflater G0(Bundle bundle) {
        LayoutInflater layoutInflaterG0 = super.G0(bundle);
        return layoutInflaterG0.cloneInContext(iq.f.c(layoutInflaterG0, this));
    }

    public final iq.f U1() {
        if (this.I0 == null) {
            synchronized (this.J0) {
                try {
                    if (this.I0 == null) {
                        this.I0 = V1();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.I0;
    }

    protected iq.f V1() {
        return new iq.f(this);
    }

    protected void X1() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        ((x5) p()).E((w5) lq.e.a(this));
    }

    @Override // lq.b
    public final Object p() {
        return U1().p();
    }

    @Override // androidx.fragment.app.o
    public void t0(Activity activity) {
        super.t0(activity);
        ContextWrapper contextWrapper = this.G0;
        lq.d.c(contextWrapper == null || iq.f.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W1();
        X1();
    }

    @Override // androidx.fragment.app.o
    public void u0(Context context) {
        super.u0(context);
        W1();
        X1();
    }

    @Override // androidx.fragment.app.o, androidx.p016lifecycle.h
    public androidx.lifecycle.w0.c w() {
        return hq.a.b(this, super.w());
    }

    @Override // androidx.fragment.app.o
    public Context z() {
        if (super.z() == null && !this.H0) {
            return null;
        }
        W1();
        return this.G0;
    }
}
