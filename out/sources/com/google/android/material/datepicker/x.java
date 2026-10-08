package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class x extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i<?> f35216d;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35217a;

        a(int i15) {
            this.f35217a = i15;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x.this.f35216d.o2(x.this.f35216d.e2().f(p.e(this.f35217a, x.this.f35216d.g2().f35188b)));
            x.this.f35216d.p2(i.l.DAY);
            x.this.f35216d.n2();
        }
    }

    public static class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final TextView f35219u;

        b(TextView textView) {
            super(textView);
            this.f35219u = textView;
        }
    }

    x(i<?> iVar) {
        this.f35216d = iVar;
    }

    private View.OnClickListener D(int i15) {
        return new a(i15);
    }

    int E(int i15) {
        return i15 - this.f35216d.e2().l().f35189c;
    }

    int F(int i15) {
        return this.f35216d.e2().l().f35189c + i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(b bVar, int i15) {
        int iF = F(i15);
        bVar.f35219u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iF)));
        TextView textView = bVar.f35219u;
        textView.setContentDescription(e.e(textView.getContext(), iF));
        c cVarF2 = this.f35216d.f2();
        Calendar calendarG = w.g();
        com.google.android.material.datepicker.b bVar2 = calendarG.get(1) == iF ? cVarF2.f35123f : cVarF2.f35121d;
        Iterator<Long> it = this.f35216d.h2().J3().iterator();
        while (it.hasNext()) {
            calendarG.setTimeInMillis(it.next().longValue());
            if (calendarG.get(1) == iF) {
                bVar2 = cVarF2.f35122e;
            }
        }
        bVar2.d(bVar.f35219u);
        bVar.f35219u.setSelected(bVar2 == cVarF2.f35122e);
        bVar.f35219u.setOnClickListener(D(iF));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b t(ViewGroup viewGroup, int i15) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ri.h.f174037r, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return this.f35216d.e2().m();
    }
}
