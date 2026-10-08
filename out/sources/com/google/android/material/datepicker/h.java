package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class h extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f35127d = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f35128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35130c;

    public h() {
        Calendar calendarI = w.i();
        this.f35128a = calendarI;
        this.f35129b = calendarI.getMaximum(7);
        this.f35130c = calendarI.getFirstDayOfWeek();
    }

    private int b(int i15) {
        int i16 = i15 + this.f35130c;
        int i17 = this.f35129b;
        return i16 > i17 ? i16 - i17 : i16;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i15) {
        if (i15 >= this.f35129b) {
            return null;
        }
        return Integer.valueOf(b(i15));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f35129b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i15) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i15, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ri.h.f174033n, viewGroup, false);
        }
        this.f35128a.set(7, b(i15));
        textView.setText(this.f35128a.getDisplayName(7, f35127d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ri.j.f174057q), this.f35128a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i15) {
        Calendar calendarI = w.i();
        this.f35128a = calendarI;
        this.f35129b = calendarI.getMaximum(7);
        this.f35130c = i15;
    }
}
