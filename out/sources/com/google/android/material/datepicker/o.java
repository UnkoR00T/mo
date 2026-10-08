package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class o<S> extends t<S> {
    private int G0;
    private d<S> H0;
    private com.google.android.material.datepicker.a I0;

    class a extends s<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.s
        public void a(S s15) {
            Iterator<s<S>> it = o.this.F0.iterator();
            while (it.hasNext()) {
                it.next().a(s15);
            }
        }
    }

    static <T> o<T> T1(d<T> dVar, int i15, com.google.android.material.datepicker.a aVar) {
        o<T> oVar = new o<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i15);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        oVar.F1(bundle);
        return oVar;
    }

    @Override // androidx.fragment.app.o
    public View B0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.H0.i3(layoutInflater.cloneInContext(new ContextThemeWrapper(z(), this.G0)), viewGroup, bundle, this.I0, new a());
    }

    @Override // androidx.fragment.app.o
    public void T0(Bundle bundle) {
        super.T0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.G0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.H0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.I0);
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle bundle) {
        super.x0(bundle);
        if (bundle == null) {
            bundle = v();
        }
        this.G0 = bundle.getInt("THEME_RES_ID_KEY");
        this.H0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.I0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
