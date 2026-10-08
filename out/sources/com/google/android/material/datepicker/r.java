package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j6.l0;

/* JADX INFO: loaded from: classes4.dex */
class r extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f35202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d<?> f35203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f35204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i.m f35205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35206h;

    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f35207a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f35207a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i15, long j15) {
            if (this.f35207a.getAdapter().r(i15)) {
                r.this.f35205g.a(this.f35207a.getAdapter().getItem(i15).longValue());
            }
        }
    }

    public static class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final TextView f35209u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final MaterialCalendarGridView f35210v;

        b(LinearLayout linearLayout, boolean z15) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ri.f.f174011u);
            this.f35209u = textView;
            l0.i0(textView, true);
            this.f35210v = (MaterialCalendarGridView) linearLayout.findViewById(ri.f.f174007q);
            if (z15) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    r(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        p pVarL = aVar.l();
        p pVarH = aVar.h();
        p pVarK = aVar.k();
        if (pVarL.compareTo(pVarK) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (pVarK.compareTo(pVarH) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f35206h = (q.f35194g * i.i2(context)) + (m.u2(context) ? i.i2(context) : 0);
        this.f35202d = aVar;
        this.f35203e = dVar;
        this.f35204f = gVar;
        this.f35205g = mVar;
        A(true);
    }

    p D(int i15) {
        return this.f35202d.l().q(i15);
    }

    CharSequence E(int i15) {
        return D(i15).o();
    }

    int F(p pVar) {
        return this.f35202d.l().r(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(b bVar, int i15) {
        p pVarQ = this.f35202d.l().q(i15);
        bVar.f35209u.setText(pVarQ.o());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f35210v.findViewById(ri.f.f174007q);
        if (materialCalendarGridView.getAdapter() == null || !pVarQ.equals(materialCalendarGridView.getAdapter().f35196a)) {
            q qVar = new q(pVarQ, this.f35203e, this.f35202d, this.f35204f);
            materialCalendarGridView.setNumColumns(pVarQ.f35190d);
            materialCalendarGridView.setAdapter((ListAdapter) qVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b t(ViewGroup viewGroup, int i15) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ri.h.f174035p, viewGroup, false);
        if (!m.u2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f35206h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return this.f35202d.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long h(int i15) {
        return this.f35202d.l().q(i15).p();
    }
}
