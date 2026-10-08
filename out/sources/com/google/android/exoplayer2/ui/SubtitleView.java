package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<wf.a> f28911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zf.a f28912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f28914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f28915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28918h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f28919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f28920k;

    interface a {
        void a(List<wf.a> list, zf.a aVar, float f15, int i15, float f16);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28911a = Collections.EMPTY_LIST;
        this.f28912b = zf.a.f234961g;
        this.f28913c = 0;
        this.f28914d = 0.0533f;
        this.f28915e = 0.08f;
        this.f28916f = true;
        this.f28917g = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f28919j = aVar;
        this.f28920k = aVar;
        addView(aVar);
        this.f28918h = 1;
    }

    private wf.a a(wf.a aVar) {
        wf.a.b bVarA = aVar.a();
        if (!this.f28916f) {
            i.c(bVarA);
        } else if (!this.f28917g) {
            i.d(bVarA);
        }
        return bVarA.a();
    }

    private void c(int i15, float f15) {
        this.f28913c = i15;
        this.f28914d = f15;
        d();
    }

    private void d() {
        this.f28919j.a(getCuesWithStylingPreferencesApplied(), this.f28912b, this.f28914d, this.f28913c, this.f28915e);
    }

    private List<wf.a> getCuesWithStylingPreferencesApplied() {
        if (this.f28916f && this.f28917g) {
            return this.f28911a;
        }
        ArrayList arrayList = new ArrayList(this.f28911a.size());
        for (int i15 = 0; i15 < this.f28911a.size(); i15++) {
            arrayList.add(a(this.f28911a.get(i15)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (bg.c.f19281a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private zf.a getUserCaptionStyle() {
        if (bg.c.f19281a < 19 || isInEditMode()) {
            return zf.a.f234961g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? zf.a.f234961g : zf.a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t15) {
        removeView(this.f28920k);
        View view = this.f28920k;
        if (view instanceof j) {
            ((j) view).g();
        }
        this.f28920k = t15;
        this.f28919j = t15;
        addView(t15);
    }

    public void b(float f15, boolean z15) {
        c(z15 ? 1 : 0, f15);
    }

    public void setApplyEmbeddedFontSizes(boolean z15) {
        this.f28917g = z15;
        d();
    }

    public void setApplyEmbeddedStyles(boolean z15) {
        this.f28916f = z15;
        d();
    }

    public void setBottomPaddingFraction(float f15) {
        this.f28915e = f15;
        d();
    }

    public void setCues(List<wf.a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f28911a = list;
        d();
    }

    public void setFractionalTextSize(float f15) {
        b(f15, false);
    }

    public void setStyle(zf.a aVar) {
        this.f28912b = aVar;
        d();
    }

    public void setViewType(int i15) {
        if (this.f28918h == i15) {
            return;
        }
        if (i15 == 1) {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        } else {
            if (i15 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new j(getContext()));
        }
        this.f28918h = i15;
    }
}
