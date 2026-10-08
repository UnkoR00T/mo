package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f28937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<wf.a> f28938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f28940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zf.a f28941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f28942f;

    public a(Context context) {
        this(context, null);
    }

    private static wf.a b(wf.a aVar) {
        wf.a.b bVarI = aVar.a().f(-3.4028235E38f).g(PKIFailureInfo.systemUnavail).i(null);
        if (aVar.f212950f == 0) {
            bVarI.d(1.0f - aVar.f212949e, 0);
        } else {
            bVarI.d((-aVar.f212949e) - 1.0f, 1);
        }
        int i15 = aVar.f212951g;
        if (i15 == 0) {
            bVarI.e(2);
        } else if (i15 == 2) {
            bVarI.e(0);
        }
        return bVarI.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<wf.a> list, zf.a aVar, float f15, int i15, float f16) {
        this.f28938b = list;
        this.f28941e = aVar;
        this.f28940d = f15;
        this.f28939c = i15;
        this.f28942f = f16;
        while (this.f28937a.size() < list.size()) {
            this.f28937a.add(new f(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<wf.a> list = this.f28938b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i15 = paddingBottom - paddingTop;
        float f15 = i.f(this.f28939c, this.f28940d, height, i15);
        if (f15 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            wf.a aVarB = list.get(i16);
            if (aVarB.f212960p != Integer.MIN_VALUE) {
                aVarB = b(aVarB);
            }
            this.f28937a.get(i16).b(aVarB, this.f28941e, f15, i.f(aVarB.f212958n, aVarB.f212959o, height, i15), this.f28942f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28937a = new ArrayList();
        this.f28938b = Collections.EMPTY_LIST;
        this.f28939c = 0;
        this.f28940d = 0.0533f;
        this.f28941e = zf.a.f234961g;
        this.f28942f = 0.08f;
    }
}
