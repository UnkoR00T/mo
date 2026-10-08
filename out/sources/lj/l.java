package lj;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f118527m = new j(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f118528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f118529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f118530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f118531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f118532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f118533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f118534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    d f118535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f118536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f118537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f118538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f118539l;

    public interface c {
        d a(d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i15, int i16) {
        return c(context, i15, i16, 0);
    }

    private static b c(Context context, int i15, int i16, int i17) {
        return d(context, i15, i16, new lj.a(i17));
    }

    private static b d(Context context, int i15, int i16, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i15);
        if (i16 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i16, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ri.l.Y3);
        try {
            int i17 = typedArrayObtainStyledAttributes.getInt(ri.l.Z3, 0);
            int i18 = typedArrayObtainStyledAttributes.getInt(ri.l.f174114c4, i17);
            int i19 = typedArrayObtainStyledAttributes.getInt(ri.l.f174122d4, i17);
            int i25 = typedArrayObtainStyledAttributes.getInt(ri.l.f174106b4, i17);
            int i26 = typedArrayObtainStyledAttributes.getInt(ri.l.f174098a4, i17);
            d dVarM = m(typedArrayObtainStyledAttributes, ri.l.f174130e4, dVar);
            d dVarM2 = m(typedArrayObtainStyledAttributes, ri.l.f174154h4, dVarM);
            d dVarM3 = m(typedArrayObtainStyledAttributes, ri.l.f174162i4, dVarM);
            d dVarM4 = m(typedArrayObtainStyledAttributes, ri.l.f174146g4, dVarM);
            return new b().A(i18, dVarM2).E(i19, dVarM3).w(i25, dVarM4).s(i26, m(typedArrayObtainStyledAttributes, ri.l.f174138f4, dVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i15, int i16) {
        return f(context, attributeSet, i15, i16, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i15, int i16, int i17) {
        return g(context, attributeSet, i15, i16, new lj.a(i17));
    }

    public static b g(Context context, AttributeSet attributeSet, int i15, int i16, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ri.l.f174209o3, i15, i16);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ri.l.f174217p3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ri.l.f174225q3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static d m(TypedArray typedArray, int i15, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i15);
        if (typedValuePeekValue != null) {
            int i16 = typedValuePeekValue.type;
            if (i16 == 5) {
                return new lj.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i16 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g h() {
        return this.f118538k;
    }

    public e i() {
        return this.f118531d;
    }

    public d j() {
        return this.f118535h;
    }

    public e k() {
        return this.f118530c;
    }

    public d l() {
        return this.f118534g;
    }

    public g n() {
        return this.f118539l;
    }

    public g o() {
        return this.f118537j;
    }

    public g p() {
        return this.f118536i;
    }

    public e q() {
        return this.f118528a;
    }

    public d r() {
        return this.f118532e;
    }

    public e s() {
        return this.f118529b;
    }

    public d t() {
        return this.f118533f;
    }

    public String toString() {
        return "[" + r() + ", " + t() + ", " + l() + ", " + j() + "]";
    }

    public boolean u() {
        return (this.f118529b instanceof k) && (this.f118528a instanceof k) && (this.f118530c instanceof k) && (this.f118531d instanceof k);
    }

    public boolean v(RectF rectF) {
        boolean z15 = this.f118539l.getClass().equals(g.class) && this.f118537j.getClass().equals(g.class) && this.f118536i.getClass().equals(g.class) && this.f118538k.getClass().equals(g.class);
        float fA = this.f118532e.a(rectF);
        return z15 && ((this.f118533f.a(rectF) > fA ? 1 : (this.f118533f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f118535h.a(rectF) > fA ? 1 : (this.f118535h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f118534g.a(rectF) > fA ? 1 : (this.f118534g.a(rectF) == fA ? 0 : -1)) == 0) && u();
    }

    public b w() {
        return new b(this);
    }

    public l x(float f15) {
        return w().o(f15).m();
    }

    public l y(d dVar) {
        return w().p(dVar).m();
    }

    public l z(c cVar) {
        return w().D(cVar.a(r())).H(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    private l(b bVar) {
        this.f118528a = bVar.f118540a;
        this.f118529b = bVar.f118541b;
        this.f118530c = bVar.f118542c;
        this.f118531d = bVar.f118543d;
        this.f118532e = bVar.f118544e;
        this.f118533f = bVar.f118545f;
        this.f118534g = bVar.f118546g;
        this.f118535h = bVar.f118547h;
        this.f118536i = bVar.f118548i;
        this.f118537j = bVar.f118549j;
        this.f118538k = bVar.f118550k;
        this.f118539l = bVar.f118551l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f118540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f118541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f118542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f118543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f118544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f118545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f118546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f118547h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g f118548i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f118549j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g f118550k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g f118551l;

        public b() {
            this.f118540a = i.b();
            this.f118541b = i.b();
            this.f118542c = i.b();
            this.f118543d = i.b();
            this.f118544e = new lj.a(0.0f);
            this.f118545f = new lj.a(0.0f);
            this.f118546g = new lj.a(0.0f);
            this.f118547h = new lj.a(0.0f);
            this.f118548i = i.c();
            this.f118549j = i.c();
            this.f118550k = i.c();
            this.f118551l = i.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof k) {
                return ((k) eVar).f118526a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f118475a;
            }
            return -1.0f;
        }

        public b A(int i15, d dVar) {
            return B(i.a(i15)).D(dVar);
        }

        public b B(e eVar) {
            this.f118540a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                C(fN);
            }
            return this;
        }

        public b C(float f15) {
            this.f118544e = new lj.a(f15);
            return this;
        }

        public b D(d dVar) {
            this.f118544e = dVar;
            return this;
        }

        public b E(int i15, d dVar) {
            return F(i.a(i15)).H(dVar);
        }

        public b F(e eVar) {
            this.f118541b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                G(fN);
            }
            return this;
        }

        public b G(float f15) {
            this.f118545f = new lj.a(f15);
            return this;
        }

        public b H(d dVar) {
            this.f118545f = dVar;
            return this;
        }

        public l m() {
            return new l(this);
        }

        public b o(float f15) {
            return C(f15).G(f15).y(f15).u(f15);
        }

        public b p(d dVar) {
            return D(dVar).H(dVar).z(dVar).v(dVar);
        }

        public b q(int i15, float f15) {
            return r(i.a(i15)).o(f15);
        }

        public b r(e eVar) {
            return B(eVar).F(eVar).x(eVar).t(eVar);
        }

        public b s(int i15, d dVar) {
            return t(i.a(i15)).v(dVar);
        }

        public b t(e eVar) {
            this.f118543d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                u(fN);
            }
            return this;
        }

        public b u(float f15) {
            this.f118547h = new lj.a(f15);
            return this;
        }

        public b v(d dVar) {
            this.f118547h = dVar;
            return this;
        }

        public b w(int i15, d dVar) {
            return x(i.a(i15)).z(dVar);
        }

        public b x(e eVar) {
            this.f118542c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                y(fN);
            }
            return this;
        }

        public b y(float f15) {
            this.f118546g = new lj.a(f15);
            return this;
        }

        public b z(d dVar) {
            this.f118546g = dVar;
            return this;
        }

        public b(l lVar) {
            this.f118540a = i.b();
            this.f118541b = i.b();
            this.f118542c = i.b();
            this.f118543d = i.b();
            this.f118544e = new lj.a(0.0f);
            this.f118545f = new lj.a(0.0f);
            this.f118546g = new lj.a(0.0f);
            this.f118547h = new lj.a(0.0f);
            this.f118548i = i.c();
            this.f118549j = i.c();
            this.f118550k = i.c();
            this.f118551l = i.c();
            this.f118540a = lVar.f118528a;
            this.f118541b = lVar.f118529b;
            this.f118542c = lVar.f118530c;
            this.f118543d = lVar.f118531d;
            this.f118544e = lVar.f118532e;
            this.f118545f = lVar.f118533f;
            this.f118546g = lVar.f118534g;
            this.f118547h = lVar.f118535h;
            this.f118548i = lVar.f118536i;
            this.f118549j = lVar.f118537j;
            this.f118550k = lVar.f118538k;
            this.f118551l = lVar.f118539l;
        }
    }

    public l() {
        this.f118528a = i.b();
        this.f118529b = i.b();
        this.f118530c = i.b();
        this.f118531d = i.b();
        this.f118532e = new lj.a(0.0f);
        this.f118533f = new lj.a(0.0f);
        this.f118534g = new lj.a(0.0f);
        this.f118535h = new lj.a(0.0f);
        this.f118536i = i.c();
        this.f118537j = i.c();
        this.f118538k = i.c();
        this.f118539l = i.c();
    }
}
