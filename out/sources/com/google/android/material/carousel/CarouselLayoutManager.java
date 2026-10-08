package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.carousel.CarouselLayoutManager;
import i6.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.p implements wi.a, RecyclerView.a0.b {
    private int A;
    private Map<Integer, e> B;
    private com.google.android.material.carousel.b C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f34968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f34969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f34970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f34971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c f34972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.c f34973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f34974y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private e f34975z;

    class a extends l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i15) {
            return CarouselLayoutManager.this.d(i15);
        }

        @Override // androidx.recyclerview.widget.l
        public int t(View view, int i15) {
            if (CarouselLayoutManager.this.f34974y == null || !CarouselLayoutManager.this.g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.l
        public int u(View view, int i15) {
            if (CarouselLayoutManager.this.f34974y == null || CarouselLayoutManager.this.g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f34977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f34978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f34979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f34980d;

        b(View view, float f15, float f16, d dVar) {
            this.f34977a = view;
            this.f34978b = f15;
            this.f34979c = f16;
            this.f34980d = dVar;
        }
    }

    private static class c extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f34981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<e.c> f34982b;

        c() {
            Paint paint = new Paint();
            this.f34981a = paint;
            this.f34982b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            super.i(canvas, recyclerView, b0Var);
            this.f34981a.setStrokeWidth(recyclerView.getResources().getDimension(ri.d.f173972s));
            for (e.c cVar : this.f34982b) {
                this.f34981a.setColor(x5.c.c(-65281, -16776961, cVar.f35018c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).g()) {
                    canvas.drawLine(cVar.f35017b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.f35017b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).w2(), this.f34981a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.f35017b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f35017b, this.f34981a);
                }
            }
        }

        void j(List<e.c> list) {
            this.f34982b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e.c f34983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e.c f34984b;

        d(e.c cVar, e.c cVar2) {
            i.a(cVar.f35016a <= cVar2.f35016a);
            this.f34983a = cVar;
            this.f34984b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A2() {
        return this.C.j();
    }

    private int B2() {
        if (R()) {
            return 0;
        }
        return v2() == 1 ? h0() : j0();
    }

    private int C2(int i15, e eVar) {
        return F2() ? (int) (((n2() - eVar.i().f35016a) - (i15 * eVar.g())) - (eVar.g() / 2.0f)) : (int) (((i15 * eVar.g()) - eVar.b().f35016a) + (eVar.g() / 2.0f));
    }

    private int D2(int i15, e eVar) {
        int i16 = Integer.MAX_VALUE;
        for (e.c cVar : eVar.f()) {
            float fG = (i15 * eVar.g()) + (eVar.g() / 2.0f);
            int iN2 = (F2() ? (int) ((n2() - cVar.f35016a) - fG) : (int) (fG - cVar.f35016a)) - this.f34968s;
            if (Math.abs(i16) > Math.abs(iN2)) {
                i16 = iN2;
            }
        }
        return i16;
    }

    private static d E2(List<e.c> list, float f15, boolean z15) {
        float f16 = Float.MAX_VALUE;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        float f17 = -3.4028235E38f;
        float f18 = Float.MAX_VALUE;
        float f19 = Float.MAX_VALUE;
        for (int i19 = 0; i19 < list.size(); i19++) {
            e.c cVar = list.get(i19);
            float f25 = z15 ? cVar.f35017b : cVar.f35016a;
            float fAbs = Math.abs(f25 - f15);
            if (f25 <= f15 && fAbs <= f16) {
                i15 = i19;
                f16 = fAbs;
            }
            if (f25 > f15 && fAbs <= f18) {
                i17 = i19;
                f18 = fAbs;
            }
            if (f25 <= f19) {
                i16 = i19;
                f19 = f25;
            }
            if (f25 > f17) {
                i18 = i19;
                f17 = f25;
            }
        }
        if (i15 == -1) {
            i15 = i16;
        }
        if (i17 == -1) {
            i17 = i18;
        }
        return new d(list.get(i15), list.get(i17));
    }

    private boolean G2(float f15, d dVar) {
        float fZ1 = Z1(f15, t2(f15, dVar) / 2.0f);
        if (F2()) {
            return fZ1 < 0.0f;
        }
        return fZ1 > ((float) n2());
    }

    private boolean H2(float f15, d dVar) {
        float fY1 = Y1(f15, t2(f15, dVar) / 2.0f);
        if (F2()) {
            return fY1 > ((float) n2());
        }
        return fY1 < 0.0f;
    }

    private void I2() {
        if (this.f34971v && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i15 = 0; i15 < O(); i15++) {
                View viewN = N(i15);
                o2(viewN);
                l0(viewN);
            }
        }
    }

    private b J2(RecyclerView.w wVar, float f15, int i15) {
        View viewO = wVar.o(i15);
        E0(viewO, 0, 0);
        float fY1 = Y1(f15, this.f34975z.g() / 2.0f);
        d dVarE2 = E2(this.f34975z.h(), fY1, false);
        return new b(viewO, fY1, d2(fY1, dVarE2), dVarE2);
    }

    private float K2(View view, float f15, float f16, Rect rect) {
        float fY1 = Y1(f15, f16);
        d dVarE2 = E2(this.f34975z.h(), fY1, false);
        float fD2 = d2(fY1, dVarE2);
        super.U(view, rect);
        U2(view, fY1, dVarE2);
        this.C.m(view, rect, f16, fD2);
        return fD2;
    }

    private void L2(RecyclerView.w wVar) {
        View viewO = wVar.o(0);
        E0(viewO, 0, 0);
        e eVarG = this.f34973x.g(this, viewO);
        if (F2()) {
            eVarG = e.p(eVarG, n2());
        }
        this.f34974y = f.f(this, eVarG, p2(), s2(), B2(), this.f34973x.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        this.f34974y = null;
        x1();
    }

    private void N2(RecyclerView.w wVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fO2 = o2(viewN);
            if (!H2(fO2, E2(this.f34975z.h(), fO2, true))) {
                break;
            } else {
                q1(viewN, wVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fO3 = o2(viewN2);
            if (!G2(fO3, E2(this.f34975z.h(), fO3, true))) {
                return;
            } else {
                q1(viewN2, wVar);
            }
        }
    }

    private int O2(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i15 == 0) {
            return 0;
        }
        if (this.f34974y == null) {
            L2(wVar);
        }
        if (a() <= q2(this.f34974y).n()) {
            return 0;
        }
        int iH2 = h2(i15, this.f34968s, this.f34969t, this.f34970u);
        this.f34968s += iH2;
        V2(this.f34974y);
        float fG = this.f34975z.g() / 2.0f;
        float fE2 = e2(l0(N(0)));
        Rect rect = new Rect();
        float f15 = F2() ? this.f34975z.i().f35017b : this.f34975z.b().f35017b;
        float f16 = Float.MAX_VALUE;
        for (int i16 = 0; i16 < O(); i16++) {
            View viewN = N(i16);
            float fAbs = Math.abs(f15 - K2(viewN, fE2, fG, rect));
            if (viewN != null && fAbs < f16) {
                this.F = l0(viewN);
                f16 = fAbs;
            }
            fE2 = Y1(fE2, this.f34975z.g());
        }
        k2(wVar, b0Var);
        return iH2;
    }

    private void P2(RecyclerView recyclerView, int i15) {
        if (g()) {
            recyclerView.scrollBy(i15, 0);
        } else {
            recyclerView.scrollBy(0, i15);
        }
    }

    public static /* synthetic */ void R1(final CarouselLayoutManager carouselLayoutManager, View view, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27) {
        carouselLayoutManager.getClass();
        if (i17 - i15 == i26 - i19 && i18 - i16 == i27 - i25) {
            return;
        }
        view.post(new Runnable() { // from class: wi.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f213575a.M2();
            }
        });
    }

    private void R2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ri.l.f174182l0);
            Q2(typedArrayObtainStyledAttributes.getInt(ri.l.f174190m0, 0));
            T2(typedArrayObtainStyledAttributes.getInt(na.c.f133681b, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void U2(View view, float f15, d dVar) {
        if (view instanceof g) {
            e.c cVar = dVar.f34983a;
            float f16 = cVar.f35018c;
            e.c cVar2 = dVar.f34984b;
            float fB = si.a.b(f16, cVar2.f35018c, cVar.f35016a, cVar2.f35016a, f15);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFE = this.C.e(height, width, si.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), si.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fD2 = d2(f15, dVar);
            RectF rectF = new RectF(fD2 - (rectFE.width() / 2.0f), fD2 - (rectFE.height() / 2.0f), fD2 + (rectFE.width() / 2.0f), (rectFE.height() / 2.0f) + fD2);
            RectF rectF2 = new RectF(x2(), A2(), y2(), w2());
            if (this.f34973x.e() == com.google.android.material.carousel.c.a.CONTAINED) {
                this.C.a(rectFE, rectF, rectF2);
            }
            this.C.l(rectFE, rectF, rectF2);
            ((g) view).a(rectFE);
        }
    }

    private void V2(f fVar) {
        int i15 = this.f34970u;
        int i16 = this.f34969t;
        if (i15 <= i16) {
            this.f34975z = q2(fVar);
        } else {
            this.f34975z = fVar.j(this.f34968s, i16, i15);
        }
        this.f34972w.j(this.f34975z.h());
    }

    private void W2() {
        int iA = a();
        int i15 = this.E;
        if (iA == i15 || this.f34974y == null) {
            return;
        }
        if (this.f34973x.h(this, i15)) {
            M2();
        }
        this.E = iA;
    }

    private void X1(View view, int i15, b bVar) {
        float fG = this.f34975z.g() / 2.0f;
        j(view, i15);
        E0(view, 0, 0);
        float f15 = bVar.f34979c;
        this.C.k(view, (int) (f15 - fG), (int) (f15 + fG));
        U2(view, bVar.f34978b, bVar.f34980d);
    }

    private void X2() {
        if (!this.f34971v || O() < 1) {
            return;
        }
        int i15 = 0;
        while (i15 < O() - 1) {
            int iL0 = l0(N(i15));
            int i16 = i15 + 1;
            int iL1 = l0(N(i16));
            if (iL0 > iL1) {
                I2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i15 + "] had adapter position [" + iL0 + "] and child at index [" + i16 + "] had adapter position [" + iL1 + "].");
            }
            i15 = i16;
        }
    }

    private float Y1(float f15, float f16) {
        return F2() ? f15 - f16 : f15 + f16;
    }

    private float Z1(float f15, float f16) {
        return F2() ? f15 + f16 : f15 - f16;
    }

    private void a2(RecyclerView.w wVar, int i15, int i16) {
        if (i15 < 0 || i15 >= a()) {
            return;
        }
        b bVarJ2 = J2(wVar, e2(i15), i15);
        X1(bVarJ2.f34977a, i16, bVarJ2);
    }

    private void b2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i15) {
        float fE2 = e2(i15);
        while (i15 < b0Var.b()) {
            float fY1 = Y1(fE2, this.f34975z.g() / 2.0f);
            d dVarE2 = E2(this.f34975z.h(), fY1, false);
            float fD2 = d2(fY1, dVarE2);
            if (G2(fD2, dVarE2)) {
                return;
            }
            fE2 = Y1(fE2, this.f34975z.g());
            if (!H2(fD2, dVarE2)) {
                View viewO = wVar.o(i15);
                X1(viewO, -1, new b(viewO, fY1, fD2, dVarE2));
            }
            i15++;
        }
    }

    private void c2(RecyclerView.w wVar, int i15) {
        float fE2 = e2(i15);
        while (i15 >= 0) {
            float fY1 = Y1(fE2, this.f34975z.g() / 2.0f);
            d dVarE2 = E2(this.f34975z.h(), fY1, false);
            float fD2 = d2(fY1, dVarE2);
            if (H2(fD2, dVarE2)) {
                return;
            }
            fE2 = Z1(fE2, this.f34975z.g());
            if (!G2(fD2, dVarE2)) {
                View viewO = wVar.o(i15);
                X1(viewO, 0, new b(viewO, fY1, fD2, dVarE2));
            }
            i15--;
        }
    }

    private float d2(float f15, d dVar) {
        e.c cVar = dVar.f34983a;
        float f16 = cVar.f35017b;
        e.c cVar2 = dVar.f34984b;
        float fB = si.a.b(f16, cVar2.f35017b, cVar.f35016a, cVar2.f35016a, f15);
        if (dVar.f34984b != this.f34975z.d() && dVar.f34983a != this.f34975z.k()) {
            return fB;
        }
        e.c cVar3 = dVar.f34984b;
        return fB + ((f15 - cVar3.f35016a) * (1.0f - cVar3.f35018c));
    }

    private float e2(int i15) {
        return Y1(z2() - this.f34968s, this.f34975z.g() * i15);
    }

    private int f2(RecyclerView.b0 b0Var, f fVar) {
        boolean zF2 = F2();
        e eVarL = zF2 ? fVar.l() : fVar.h();
        e.c cVarB = zF2 ? eVarL.b() : eVarL.i();
        int iB = (int) (((((b0Var.b() - 1) * eVarL.g()) * (zF2 ? -1.0f : 1.0f)) - (cVarB.f35016a - z2())) + (((zF2 ? -1 : 1) * cVarB.f35019d) / 2.0f));
        return zF2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int h2(int i15, int i16, int i17, int i18) {
        int i19 = i16 + i15;
        if (i19 < i17) {
            return i17 - i16;
        }
        return i19 > i18 ? i18 - i16 : i15;
    }

    private int i2(f fVar) {
        boolean zF2 = F2();
        e eVarH = zF2 ? fVar.h() : fVar.l();
        return (int) (z2() - Z1((zF2 ? eVarH.i() : eVarH.b()).f35016a, eVarH.g() / 2.0f));
    }

    private int j2(int i15) {
        int iV2 = v2();
        if (i15 == 1) {
            return -1;
        }
        if (i15 == 2) {
            return 1;
        }
        if (i15 == 17) {
            if (iV2 == 0) {
                return F2() ? 1 : -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 33) {
            if (iV2 == 1) {
                return -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 66) {
            if (iV2 == 0) {
                return F2() ? -1 : 1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 130 && iV2 == 1) {
            return 1;
        }
        return PKIFailureInfo.systemUnavail;
    }

    private void k2(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        N2(wVar);
        if (O() == 0) {
            c2(wVar, this.A - 1);
            b2(wVar, b0Var, this.A);
        } else {
            int iL0 = l0(N(0));
            int iL1 = l0(N(O() - 1));
            c2(wVar, iL0 - 1);
            b2(wVar, b0Var, iL1 + 1);
        }
        X2();
    }

    private View l2() {
        return N(F2() ? 0 : O() - 1);
    }

    private View m2() {
        return N(F2() ? O() - 1 : 0);
    }

    private int n2() {
        return g() ? b() : c();
    }

    private float o2(View view) {
        Rect rect = new Rect();
        super.U(view, rect);
        return g() ? rect.centerX() : rect.centerY();
    }

    private int p2() {
        int i15;
        int i16;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) N(0).getLayoutParams();
        if (this.C.f34993a == 0) {
            i15 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i16 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i15 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i16 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i15 + i16;
    }

    private e q2(f fVar) {
        return F2() ? fVar.h() : fVar.l();
    }

    private e r2(int i15) {
        e eVar;
        Map<Integer, e> map = this.B;
        return (map == null || (eVar = map.get(Integer.valueOf(c6.a.b(i15, 0, Math.max(0, a() + (-1)))))) == null) ? this.f34974y.g() : eVar;
    }

    private int s2() {
        if (R()) {
            return 0;
        }
        return v2() == 1 ? k0() : i0();
    }

    private float t2(float f15, d dVar) {
        e.c cVar = dVar.f34983a;
        float f16 = cVar.f35019d;
        e.c cVar2 = dVar.f34984b;
        return si.a.b(f16, cVar2.f35019d, cVar.f35017b, cVar2.f35017b, f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w2() {
        return this.C.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.C.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.C.h();
    }

    private int z2() {
        return this.C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.b0 b0Var) {
        return this.f34970u - this.f34969t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (p()) {
            return O2(i15, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i15) {
        this.F = i15;
        if (this.f34974y == null) {
            return;
        }
        this.f34968s = C2(i15, r2(i15));
        this.A = c6.a.b(i15, 0, Math.max(0, a() - 1));
        V2(this.f34974y);
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (q()) {
            return O2(i15, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void E0(View view, int i15, int i16) {
        if (!(view instanceof g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        Rect rect = new Rect();
        o(view, rect);
        int i17 = i15 + rect.left + rect.right;
        int i18 = i16 + rect.top + rect.bottom;
        f fVar = this.f34974y;
        float fG = (fVar == null || this.C.f34993a != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : fVar.g().g();
        f fVar2 = this.f34974y;
        view.measure(RecyclerView.p.P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i17, (int) fG, p()), RecyclerView.p.P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i18, (int) ((fVar2 == null || this.C.f34993a != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : fVar2.g().g()), q()));
    }

    boolean F2() {
        return g() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(RecyclerView recyclerView) {
        super.K0(recyclerView);
        this.f34973x.f(recyclerView.getContext());
        M2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i15) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i15);
        N1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iJ2;
        if (O() == 0 || (iJ2 = j2(i15)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iJ2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            a2(wVar, l0(N(0)) - 1, 0);
            return m2();
        }
        if (l0(view) == a() - 1) {
            return null;
        }
        a2(wVar, l0(N(O() - 1)) + 1, -1);
        return l2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void Q2(int i15) {
        this.G = i15;
        M2();
    }

    public void S2(com.google.android.material.carousel.c cVar) {
        this.f34973x = cVar;
        M2();
    }

    public void T2(int i15) {
        if (i15 != 0 && i15 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i15);
        }
        l(null);
        com.google.android.material.carousel.b bVar = this.C;
        if (bVar == null || i15 != bVar.f34993a) {
            this.C = com.google.android.material.carousel.b.c(this, i15);
            M2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (g()) {
            fCenterY = rect.centerX();
        }
        float fT2 = t2(fCenterY, E2(this.f34975z.h(), fCenterY, true));
        float fWidth = g() ? (rect.width() - fT2) / 2.0f : 0.0f;
        float fHeight = g() ? 0.0f : (rect.height() - fT2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i15, int i16) {
        super.V0(recyclerView, i15, i16);
        W2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        super.W0(recyclerView);
        W2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i15, int i16) {
        super.Y0(recyclerView, i15, i16);
        W2();
    }

    @Override // wi.a
    public int b() {
        return s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.b() <= 0 || n2() <= 0.0f) {
            o1(wVar);
            this.A = 0;
            return;
        }
        boolean zF2 = F2();
        f fVar = this.f34974y;
        boolean z15 = fVar == null;
        if (z15 || fVar.g().a() != n2()) {
            L2(wVar);
        }
        int iI2 = i2(this.f34974y);
        int iF2 = f2(b0Var, this.f34974y);
        this.f34969t = zF2 ? iF2 : iI2;
        if (zF2) {
            iF2 = iI2;
        }
        this.f34970u = iF2;
        if (z15) {
            this.f34968s = iI2;
            this.B = this.f34974y.i(a(), this.f34969t, this.f34970u, F2());
            int i15 = this.F;
            if (i15 != -1) {
                this.f34968s = C2(i15, r2(i15));
            }
        }
        int i16 = this.f34968s;
        this.f34968s = i16 + h2(0, i16, this.f34969t, this.f34970u);
        this.A = c6.a.b(this.A, 0, b0Var.b());
        V2(this.f34974y);
        B(wVar);
        k2(wVar, b0Var);
        this.E = a();
    }

    @Override // wi.a
    public int c() {
        return b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.b0 b0Var) {
        super.c1(b0Var);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = l0(N(0));
        }
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF d(int i15) {
        if (this.f34974y == null) {
            return null;
        }
        int iU2 = u2(i15, r2(i15));
        return g() ? new PointF(iU2, 0.0f) : new PointF(0.0f, iU2);
    }

    @Override // wi.a
    public int e() {
        return this.G;
    }

    @Override // wi.a
    public boolean g() {
        return this.C.f34993a == 0;
    }

    int g2(int i15) {
        return (int) (this.f34968s - C2(i15, r2(i15)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return !g();
    }

    int u2(int i15, e eVar) {
        return C2(i15, eVar) - this.f34968s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f34974y == null || a() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f34974y.g().g() / x(b0Var)));
    }

    public int v2() {
        return this.C.f34993a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.b0 b0Var) {
        return this.f34968s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z15, boolean z16) {
        int iD2;
        if (this.f34974y == null || (iD2 = D2(l0(view), r2(l0(view)))) == 0) {
            return false;
        }
        P2(recyclerView, D2(l0(view), this.f34974y.j(this.f34968s + h2(iD2, this.f34968s, this.f34969t, this.f34970u), this.f34969t, this.f34970u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.b0 b0Var) {
        return this.f34970u - this.f34969t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f34974y == null || a() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f34974y.g().g() / A(b0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.b0 b0Var) {
        return this.f34968s;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar) {
        this(cVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar, int i15) {
        this.f34971v = false;
        this.f34972w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: wi.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28) {
                CarouselLayoutManager.R1(this.f213574a, view, i16, i17, i18, i19, i25, i26, i27, i28);
            }
        };
        this.F = -1;
        this.G = 0;
        S2(cVar);
        T2(i15);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i15, int i16) {
        this.f34971v = false;
        this.f34972w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: wi.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i17, int i18, int i19, int i110, int i25, int i26, int i27, int i28) {
                CarouselLayoutManager.R1(this.f213574a, view, i17, i18, i19, i110, i25, i26, i27, i28);
            }
        };
        this.F = -1;
        this.G = 0;
        S2(new h());
        R2(context, attributeSet);
    }
}
