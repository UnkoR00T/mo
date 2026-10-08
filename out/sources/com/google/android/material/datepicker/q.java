package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class q extends BaseAdapter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f35194g = w.i().getMaximum(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f35195h = (w.i().getMaximum(5) + w.i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p f35196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d<?> f35197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection<Long> f35198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c f35199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final a f35200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final g f35201f;

    q(p pVar, d<?> dVar, a aVar, g gVar) {
        this.f35196a = pVar;
        this.f35197b = dVar;
        this.f35200e = aVar;
        this.f35201f = gVar;
        this.f35198c = dVar.J3();
    }

    private String c(Context context, long j15) {
        return e.a(context, j15, l(j15), k(j15), g(j15));
    }

    private void f(Context context) {
        if (this.f35199d == null) {
            this.f35199d = new c(context);
        }
    }

    private boolean j(long j15) {
        Iterator<Long> it = this.f35197b.J3().iterator();
        while (it.hasNext()) {
            if (w.a(j15) == w.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j15) {
        return w.g().getTimeInMillis() == j15;
    }

    private void o(TextView textView, long j15, int i15) {
        boolean zJ;
        b bVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j15);
        textView.setContentDescription(strC);
        boolean zF1 = this.f35200e.g().F1(j15);
        if (zF1) {
            textView.setEnabled(true);
            zJ = j(j15);
            textView.setSelected(zJ);
            if (zJ) {
                bVar = this.f35199d.f35119b;
            } else {
                bVar = l(j15) ? this.f35199d.f35120c : this.f35199d.f35118a;
            }
        } else {
            zJ = false;
            textView.setEnabled(false);
            bVar = this.f35199d.f35124g;
        }
        boolean z15 = zJ;
        g gVar = this.f35201f;
        if (gVar == null || i15 == -1) {
            bVar.d(textView);
            return;
        }
        p pVar = this.f35196a;
        int i16 = pVar.f35189c;
        int i17 = pVar.f35188b;
        bVar.e(textView, gVar.a(context, i16, i17, i15, zF1, z15), this.f35201f.g(context, i16, i17, i15, zF1, z15));
        textView.setCompoundDrawables(this.f35201f.c(context, i16, i17, i15, zF1, z15), this.f35201f.e(context, i16, i17, i15, zF1, z15), this.f35201f.d(context, i16, i17, i15, zF1, z15), this.f35201f.b(context, i16, i17, i15, zF1, z15));
        textView.setContentDescription(this.f35201f.f(context, i16, i17, i15, zF1, z15, strC));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j15) {
        if (p.g(j15).equals(this.f35196a)) {
            int iN = this.f35196a.n(j15);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iN) - materialCalendarGridView.getFirstVisiblePosition()), j15, iN);
        }
    }

    int a(int i15) {
        return b() + (i15 - 1);
    }

    int b() {
        return this.f35196a.k(this.f35200e.i());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i15) {
        if (i15 < b() || i15 > m()) {
            return null;
        }
        return Long.valueOf(this.f35196a.l(n(i15)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i15, View view, ViewGroup viewGroup) {
        int i16;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ri.h.f174032m, viewGroup, false);
        }
        int iB = i15 - b();
        if (iB >= 0) {
            p pVar = this.f35196a;
            if (iB >= pVar.f35191e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i16 = -1;
            } else {
                i16 = iB + 1;
                textView.setTag(pVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i16)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i16 = -1;
        }
        Long item = getItem(i15);
        if (item == null) {
            return textView;
        }
        o(textView, item.longValue(), i16);
        return textView;
    }

    boolean g(long j15) {
        Iterator<i6.d<Long, Long>> it = this.f35197b.A2().iterator();
        while (it.hasNext()) {
            Long l15 = it.next().f89683b;
            if (l15 != null && l15.longValue() == j15) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f35195h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i15) {
        return i15 / this.f35196a.f35190d;
    }

    boolean h(int i15) {
        return i15 % this.f35196a.f35190d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i15) {
        return (i15 + 1) % this.f35196a.f35190d == 0;
    }

    boolean k(long j15) {
        Iterator<i6.d<Long, Long>> it = this.f35197b.A2().iterator();
        while (it.hasNext()) {
            Long l15 = it.next().f89682a;
            if (l15 != null && l15.longValue() == j15) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.f35196a.f35191e) - 1;
    }

    int n(int i15) {
        return (i15 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f35198c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        d<?> dVar = this.f35197b;
        if (dVar != null) {
            Iterator<Long> it4 = dVar.J3().iterator();
            while (it4.hasNext()) {
                p(materialCalendarGridView, it4.next().longValue());
            }
            this.f35198c = this.f35197b.J3();
        }
    }

    boolean r(int i15) {
        return i15 >= b() && i15 <= m();
    }
}
