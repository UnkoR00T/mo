package com.google.android.libraries.places.internal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;

/* JADX INFO: loaded from: classes4.dex */
public class v41 extends androidx.appcompat.app.c {
    private int H;
    private int I;
    public BaseAutocompleteImplFragment K;

    public v41() {
        super(fi.f.f64079a);
        this.I = fi.i.f64102c;
    }

    public final void P0(int i15, ii.l0 l0Var, Status status) throws Throwable {
        try {
            Intent intent = new Intent();
            if (l0Var != null) {
                intent.putExtra("places/selected_place", l0Var);
            }
            intent.putExtra("places/status", status);
            setResult(i15, intent);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.K;
            if (baseAutocompleteImplFragment != null) {
                baseAutocompleteImplFragment.R1();
            }
            finish();
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    public final void Q0(int i15, ii.h hVar, ii.i iVar, Status status) throws Throwable {
        try {
            Intent intent = new Intent();
            if (hVar != null && iVar != null) {
                intent.putExtra("places/selected_prediction", hVar);
                intent.putExtra("places/session_token", iVar);
            }
            intent.putExtra("places/status", status);
            setResult(i15, intent);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.K;
            if (baseAutocompleteImplFragment != null) {
                baseAutocompleteImplFragment.R1();
            }
            finish();
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    public final void R0(int i15, Status status) {
        try {
            Intent intent = new Intent();
            intent.putExtra("places/status", status);
            setResult(i15, intent);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) throws Throwable {
        Integer f157901e;
        try {
            zj.p.x(gi.a.b(), "Places must be initialized.");
            zj.p.x(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            y41 y41VarA = b51.a(getIntent());
            pi.c cVarO = y41VarA.o();
            if (cVarO != null && (f157901e = cVarO.getF157901e()) != null) {
                this.I = f157901e.intValue();
            }
            this.H = fi.f.f64080b;
            setTheme(this.I);
            FragmentManager fragmentManagerW0 = w0();
            int i15 = this.H;
            y61 y61VarA = x61.a();
            y61VarA.b(this);
            y61VarA.a(y41VarA.a() == e61.JWT_AND_ONE_PLATFORM ? k41.PLACES_UI_KIT : k41.ONE_PLATFORM_AUTOCOMPLETE_WIDGET);
            fragmentManagerW0.r1(new com.google.android.libraries.places.widget.internal.autocomplete.ui.c(i15, y61VarA.zza(), y41VarA, this.I));
            super.onCreate(bundle);
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = (BaseAutocompleteImplFragment) w0().i0(fi.e.f64048f);
            this.K = baseAutocompleteImplFragment;
            zj.p.w(baseAutocompleteImplFragment != null);
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }
}
