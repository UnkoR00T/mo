package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import j6.l0;
import java.util.Calendar;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f35095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35096b;

    class a extends j6.a {
        a() {
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            pVar.q0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i15, Rect rect) {
        if (i15 == 33) {
            setSelection(getAdapter().m());
        } else if (i15 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i15, rect);
        }
    }

    private View c(int i15) {
        return getChildAt(i15 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l15, Long l16, Long l17, Long l18) {
        return l15 == null || l16 == null || l17 == null || l18 == null || l17.longValue() > l16.longValue() || l18.longValue() < l15.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q getAdapter() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iA;
        int iD;
        int iA2;
        int iD2;
        int width;
        int i15;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        q adapter = materialCalendarGridView.getAdapter();
        d<?> dVar = adapter.f35197b;
        c cVar = adapter.f35199d;
        int iMax = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (i6.d<Long, Long> dVar2 : dVar.A2()) {
            Long l15 = dVar2.f89682a;
            if (l15 == null) {
                materialCalendarGridView = this;
            } else if (dVar2.f89683b != null) {
                Long l16 = l15;
                long jLongValue = l16.longValue();
                Long l17 = dVar2.f89683b;
                long jLongValue2 = l17.longValue();
                if (!e(item, item2, l16, l17)) {
                    boolean zG = com.google.android.material.internal.q.g(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        iD = adapter.h(iMax) ? 0 : !zG ? materialCalendarGridView.c(iMax - 1).getRight() : materialCalendarGridView.c(iMax - 1).getLeft();
                        iA = iMax;
                    } else {
                        materialCalendarGridView.f35095a.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f35095a.get(5));
                        iD = d(materialCalendarGridView.c(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iD2 = adapter.i(iMin) ? materialCalendarGridView.getWidth() : !zG ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        materialCalendarGridView.f35095a.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f35095a.get(5));
                        iD2 = d(materialCalendarGridView.c(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i16 = iMax;
                    int i17 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewC = materialCalendarGridView.c(numColumns);
                        int top = viewC.getTop() + cVar.f35118a.c();
                        q qVar = adapter;
                        int bottom = viewC.getBottom() - cVar.f35118a.b();
                        if (zG) {
                            int i18 = iA2 > numColumns2 ? 0 : iD2;
                            width = numColumns > iA ? getWidth() : iD;
                            i15 = i18;
                        } else {
                            i15 = numColumns > iA ? 0 : iD;
                            width = iA2 > numColumns2 ? getWidth() : iD2;
                        }
                        canvas.drawRect(i15, top, width, bottom, cVar.f35125h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = qVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i16;
                    iMin = i17;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z15, int i15, Rect rect) {
        if (z15) {
            a(i15, rect);
        } else {
            super.onFocusChanged(false, i15, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i15, KeyEvent keyEvent) {
        if (!super.onKeyDown(i15, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().b() && selectedItemPosition <= getAdapter().m())) {
            return true;
        }
        if (19 != i15) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i15, int i16) {
        if (!this.f35096b) {
            super.onMeasure(i15, i16);
            return;
        }
        super.onMeasure(i15, View.MeasureSpec.makeMeasureSpec(16777215, PKIFailureInfo.systemUnavail));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i15) {
        if (i15 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i15);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f35095a = w.i();
        if (m.u2(getContext())) {
            setNextFocusLeftId(ri.f.f173991a);
            setNextFocusRightId(ri.f.f173994d);
        }
        this.f35096b = m.w2(getContext());
        l0.h0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof q)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
