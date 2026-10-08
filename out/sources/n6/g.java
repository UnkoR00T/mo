package n6;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j6.a1;
import j6.f1;
import j6.l0;
import j6.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import x5.h;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f132367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<c> f132368b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f132369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f132370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f132371e;

    class a extends View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f132372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ViewGroup viewGroup) {
            super(context);
            this.f132372a = viewGroup;
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.f132372a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (g.this.f132371e != color) {
                g.this.f132371e = color;
                for (int size = g.this.f132368b.size() - 1; size >= 0; size--) {
                    ((c) g.this.f132368b.get(size)).e(color);
                }
            }
        }
    }

    class b extends a1.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap<a1, Integer> f132374c;

        b(int i15) {
            super(i15);
            this.f132374c = new HashMap<>();
        }

        private boolean g(a1 a1Var) {
            return (a1Var.d() & f1.p.i()) != 0;
        }

        @Override // j6.a1.b
        public void c(a1 a1Var) {
            if (g(a1Var)) {
                this.f132374c.remove(a1Var);
                for (int size = g.this.f132368b.size() - 1; size >= 0; size--) {
                    ((c) g.this.f132368b.get(size)).d();
                }
            }
        }

        @Override // j6.a1.b
        public void d(a1 a1Var) {
            if (g(a1Var)) {
                for (int size = g.this.f132368b.size() - 1; size >= 0; size--) {
                    ((c) g.this.f132368b.get(size)).c();
                }
            }
        }

        @Override // j6.a1.b
        public f1 e(f1 f1Var, List<a1> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i15 = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                a1 a1Var = list.get(size);
                Integer num = this.f132374c.get(a1Var);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = a1Var.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                    i15 |= iIntValue;
                }
            }
            h hVarI = g.this.i(f1Var);
            for (int size2 = g.this.f132368b.size() - 1; size2 >= 0; size2--) {
                ((c) g.this.f132368b.get(size2)).a(i15, hVarI, rectF);
            }
            return f1Var;
        }

        @Override // j6.a1.b
        public a1.a f(a1 a1Var, a1.a aVar) {
            if (!g(a1Var)) {
                return aVar;
            }
            h hVarB = aVar.b();
            h hVarA = aVar.a();
            int i15 = hVarB.f216813a != hVarA.f216813a ? 1 : 0;
            if (hVarB.f216814b != hVarA.f216814b) {
                i15 |= 2;
            }
            if (hVarB.f216815c != hVarA.f216815c) {
                i15 |= 4;
            }
            if (hVarB.f216816d != hVarA.f216816d) {
                i15 |= 8;
            }
            this.f132374c.put(a1Var, Integer.valueOf(i15));
            return aVar;
        }
    }

    interface c {
        void a(int i15, h hVar, RectF rectF);

        void b(h hVar, h hVar2);

        void c();

        void d();

        void e(int i15);
    }

    g(ViewGroup viewGroup) {
        h hVar = h.f216812e;
        this.f132369c = hVar;
        this.f132370d = hVar;
        Drawable background = viewGroup.getBackground();
        this.f132371e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.f132367a = aVar;
        aVar.setWillNotDraw(true);
        l0.q0(aVar, new y() { // from class: n6.e
            @Override // j6.y
            public final f1 b(View view, f1 f1Var) {
                return g.b(this.f132365a, view, f1Var);
            }
        });
        l0.w0(aVar, new b(0));
        viewGroup.addView(aVar, 0);
    }

    public static /* synthetic */ void a(g gVar) {
        ViewParent parent = gVar.f132367a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(gVar.f132367a);
        }
    }

    public static /* synthetic */ f1 b(g gVar, View view, f1 f1Var) {
        h hVarI = gVar.i(f1Var);
        h hVarJ = gVar.j(f1Var);
        if (!hVarI.equals(gVar.f132369c) || !hVarJ.equals(gVar.f132370d)) {
            gVar.f132369c = hVarI;
            gVar.f132370d = hVarJ;
            for (int size = gVar.f132368b.size() - 1; size >= 0; size--) {
                gVar.f132368b.get(size).b(hVarI, hVarJ);
            }
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h i(f1 f1Var) {
        return h.b(f1Var.f(f1.p.i()), f1Var.f(f1.p.k()));
    }

    private h j(f1 f1Var) {
        return h.b(f1Var.g(f1.p.i()), f1Var.g(f1.p.k()));
    }

    void g(c cVar) {
        if (this.f132368b.contains(cVar)) {
            return;
        }
        this.f132368b.add(cVar);
        cVar.b(this.f132369c, this.f132370d);
        cVar.e(this.f132371e);
    }

    void h() {
        this.f132367a.post(new Runnable() { // from class: n6.f
            @Override // java.lang.Runnable
            public final void run() {
                g.a(this.f132366a);
            }
        });
    }

    boolean k() {
        return !this.f132368b.isEmpty();
    }

    void l(c cVar) {
        this.f132368b.remove(cVar);
    }
}
