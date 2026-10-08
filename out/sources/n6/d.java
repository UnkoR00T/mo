package n6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import x5.h;

/* JADX INFO: loaded from: classes.dex */
public class d extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f132359c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b> f132360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f132361b;

    class a implements b.a.InterfaceC3287a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f132362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f132363b;

        a(FrameLayout.LayoutParams layoutParams, View view) {
            this.f132362a = layoutParams;
            this.f132363b = view;
        }

        @Override // n6.b.a.InterfaceC3287a
        public void a(int i15) {
            FrameLayout.LayoutParams layoutParams = this.f132362a;
            layoutParams.height = i15;
            this.f132363b.setLayoutParams(layoutParams);
        }

        @Override // n6.b.a.InterfaceC3287a
        public void b(boolean z15) {
            this.f132363b.setVisibility(z15 ? 0 : 4);
        }

        @Override // n6.b.a.InterfaceC3287a
        public void c(float f15) {
            this.f132363b.setAlpha(f15);
        }

        @Override // n6.b.a.InterfaceC3287a
        public void d(int i15) {
            FrameLayout.LayoutParams layoutParams = this.f132362a;
            layoutParams.width = i15;
            this.f132363b.setLayoutParams(layoutParams);
        }

        @Override // n6.b.a.InterfaceC3287a
        public void e(float f15) {
            this.f132363b.setTranslationX(f15);
        }

        @Override // n6.b.a.InterfaceC3287a
        public void f(float f15) {
            this.f132363b.setTranslationY(f15);
        }

        @Override // n6.b.a.InterfaceC3287a
        public void g(Drawable drawable) {
            this.f132363b.setBackground(drawable);
        }

        @Override // n6.b.a.InterfaceC3287a
        public void h(h hVar) {
            FrameLayout.LayoutParams layoutParams = this.f132362a;
            layoutParams.leftMargin = hVar.f216813a;
            layoutParams.topMargin = hVar.f216814b;
            layoutParams.rightMargin = hVar.f216815c;
            layoutParams.bottomMargin = hVar.f216816d;
            this.f132363b.setLayoutParams(layoutParams);
        }
    }

    public d(Context context, List<b> list) {
        super(context);
        this.f132360a = new ArrayList();
        setProtections(list);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    private void a(Context context, int i15, b bVar) {
        int iQ;
        int i16;
        int iM;
        b.a aVarC = bVar.c();
        int iE = bVar.e();
        int i17 = -1;
        if (iE != 1) {
            if (iE == 2) {
                iM = aVarC.m();
                i16 = 48;
            } else if (iE == 4) {
                iQ = aVarC.q();
                i16 = 5;
            } else {
                if (iE != 8) {
                    throw new IllegalArgumentException("Unexpected side: " + bVar.e());
                }
                iM = aVarC.m();
                i16 = 80;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i17, iM, i16);
            h hVarN = aVarC.n();
            layoutParams.leftMargin = hVarN.f216813a;
            layoutParams.topMargin = hVarN.f216814b;
            layoutParams.rightMargin = hVarN.f216815c;
            layoutParams.bottomMargin = hVarN.f216816d;
            View view = new View(context);
            view.setTag(f132359c);
            view.setTranslationX(aVarC.o());
            view.setTranslationY(aVarC.p());
            view.setAlpha(aVarC.k());
            view.setVisibility(aVarC.r() ? 0 : 4);
            view.setBackground(aVarC.l());
            aVarC.t(new a(layoutParams, view));
            addView(view, i15, layoutParams);
        }
        iQ = aVarC.q();
        i16 = 3;
        i17 = iQ;
        iM = -1;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i17, iM, i16);
        h hVarN2 = aVarC.n();
        layoutParams2.leftMargin = hVarN2.f216813a;
        layoutParams2.topMargin = hVarN2.f216814b;
        layoutParams2.rightMargin = hVarN2.f216815c;
        layoutParams2.bottomMargin = hVarN2.f216816d;
        View view2 = new View(context);
        view2.setTag(f132359c);
        view2.setTranslationX(aVarC.o());
        view2.setTranslationY(aVarC.p());
        view2.setAlpha(aVarC.k());
        view2.setVisibility(aVarC.r() ? 0 : 4);
        view2.setBackground(aVarC.l());
        aVarC.t(new a(layoutParams2, view2));
        addView(view2, i15, layoutParams2);
    }

    private void b() {
        if (this.f132360a.isEmpty()) {
            return;
        }
        this.f132361b = new c(getOrInstallSystemBarStateMonitor(), this.f132360a);
        int childCount = getChildCount();
        int i15 = this.f132361b.i();
        for (int i16 = 0; i16 < i15; i16++) {
            a(getContext(), i16 + childCount, this.f132361b.h(i16));
        }
    }

    private void c() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(r5.e.R);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.k()) {
                return;
            }
            gVar.h();
            viewGroup.setTag(r5.e.R, null);
        }
    }

    private void d() {
        if (this.f132361b != null) {
            removeViews(getChildCount() - this.f132361b.i(), this.f132361b.i());
            int i15 = this.f132361b.i();
            for (int i16 = 0; i16 < i15; i16++) {
                this.f132361b.h(i16).c().t(null);
            }
            this.f132361b.g();
            this.f132361b = null;
        }
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(r5.e.R);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(r5.e.R, gVar);
        return gVar;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f132359c) {
            c cVar = this.f132361b;
            int childCount = getChildCount() - (cVar != null ? cVar.i() : 0);
            if (i15 > childCount || i15 < 0) {
                i15 = childCount;
            }
        }
        super.addView(view, i15, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f132361b != null) {
            d();
        }
        b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c();
    }

    public void setProtections(List<b> list) {
        this.f132360a.clear();
        this.f132360a.addAll(list);
        if (isAttachedToWindow()) {
            d();
            b();
            requestApplyInsets();
        }
    }
}
