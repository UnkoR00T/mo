package com.google.android.libraries.places.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.c;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.internal.b51;
import com.google.android.libraries.places.internal.k41;
import com.google.android.libraries.places.internal.n41;
import com.google.android.libraries.places.internal.x61;
import com.google.android.libraries.places.internal.y41;
import com.google.android.libraries.places.internal.y61;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.n;
import fi.e;
import fi.f;
import fi.i;
import ii.l0;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class AutocompleteActivity extends c implements oi.a {
    private int H;
    private int I;
    private boolean K;

    public AutocompleteActivity() {
        super(f.f64086h);
        this.K = false;
    }

    private final void R0(int i15, l0 l0Var, Status status) throws Throwable {
        try {
            Intent intent = new Intent();
            if (l0Var != null) {
                intent.putExtra("places/selected_place", l0Var);
            }
            intent.putExtra("places/status", status);
            setResult(i15, intent);
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

    final /* synthetic */ boolean P0(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.K = false;
        View viewC0 = autocompleteImplFragment.c0();
        if (viewC0 == null || motionEvent.getY() <= viewC0.getBottom()) {
            return false;
        }
        this.K = true;
        view.performClick();
        return true;
    }

    final /* synthetic */ void Q0(View view) throws Throwable {
        if (this.K) {
            R0(0, null, new Status(16));
        }
    }

    @Override // oi.a
    public void b(@RecentlyNonNull Status status) throws Throwable {
        R0(true != status.y() ? 2 : 0, null, status);
    }

    @Override // oi.a
    public void e(@RecentlyNonNull l0 l0Var) throws Throwable {
        R0(-1, l0Var, Status.f29007f);
    }

    @Override // androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) throws Throwable {
        try {
            p.x(gi.a.b(), "Places must be initialized.");
            p.x(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            y41 y41VarA = b51.a(getIntent());
            pi.a aVar = pi.a.FULLSCREEN;
            int iOrdinal = y41VarA.b().ordinal();
            if (iOrdinal == 0) {
                this.H = f.f64087i;
                this.I = i.f64100a;
            } else if (iOrdinal == 1) {
                this.H = f.f64088j;
                this.I = i.f64101b;
            }
            FragmentManager fragmentManagerW0 = w0();
            int i15 = this.H;
            y61 y61VarA = x61.a();
            y61VarA.b(this);
            y61VarA.a(k41.AUTOCOMPLETE_WIDGET);
            fragmentManagerW0.r1(new n(i15, y61VarA.zza(), y41VarA));
            setTheme(this.I);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) w0().i0(e.E);
            p.w(autocompleteImplFragment != null);
            autocompleteImplFragment.R1(this);
            final View viewFindViewById = findViewById(R.id.content);
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.b
                @Override // android.view.View.OnTouchListener
                public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f34582a.P0(autocompleteImplFragment, viewFindViewById, view, motionEvent);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.a
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) throws Throwable {
                    this.f34581a.Q0(view);
                }
            });
            if (y41VarA.c().isEmpty()) {
                R0(2, null, new Status(9012, "Place Fields must not be empty."));
            }
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
