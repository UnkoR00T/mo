package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import java.util.List;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends o implements androidx.loader.app.a.InterfaceC0272a {
    private ListView F0;
    private ArrayAdapter G0;
    private b H0;
    private String I0;
    private c J0;
    private Context K0;

    @Override // androidx.fragment.app.o
    public final View B0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b bVar = this.H0;
        return layoutInflater.inflate(bVar.f31432a.getIdentifier("license_menu_fragment", "layout", bVar.f31433b), viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void C0() {
        super.C0();
        p pVarR = r();
        if (pVarR != null) {
            pVarR.x0().a(54321);
        }
    }

    final /* synthetic */ b R1() {
        return this.H0;
    }

    final /* synthetic */ Context S1() {
        return this.K0;
    }

    @Override // androidx.fragment.app.o
    public final void W0(View view, Bundle bundle) {
        super.W0(view, bundle);
        p pVarR = r();
        s.l(pVarR);
        pVarR.x0().d(54321, null, this);
        b bVar = this.H0;
        this.F0 = (ListView) view.findViewById(bVar.f31432a.getIdentifier("license_list", "id", bVar.f31433b));
        l lVar = new l(this, pVarR);
        this.G0 = lVar;
        this.F0.setAdapter((ListAdapter) lVar);
        this.F0.setOnItemClickListener(new k(this));
    }

    @Override // androidx.loader.app.a.InterfaceC0272a
    public final void b(s7.b bVar) {
        this.G0.clear();
        this.G0.notifyDataSetChanged();
    }

    @Override // androidx.loader.app.a.InterfaceC0272a
    public final /* bridge */ /* synthetic */ void e(s7.b bVar, Object obj) {
        this.G0.clear();
        this.G0.addAll((List) obj);
        this.G0.notifyDataSetChanged();
    }

    @Override // androidx.loader.app.a.InterfaceC0272a
    public final s7.b f(int i15, Bundle bundle) {
        return new j(this.K0, this.J0);
    }

    @Override // androidx.fragment.app.o
    public final void u0(Context context) {
        super.u0(context);
        this.K0 = context;
        this.J0 = c.a(context);
    }

    @Override // androidx.fragment.app.o
    public final void x0(Bundle bundle) {
        Bundle bundleV;
        super.x0(bundle);
        if (bundle == null && (bundleV = v()) != null) {
            this.I0 = bundleV.getString("license_activity_package_name");
        }
        if (this.I0 == null) {
            this.I0 = this.K0.getPackageName();
        }
        this.H0 = c.b(this.K0, this.I0);
    }
}
