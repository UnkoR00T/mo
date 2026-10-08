package z6;

import android.util.AndroidRuntimeException;
import android.view.View;
import j6.l0;
import java.util.ArrayList;
import z6.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T extends e<T>> implements z6.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f233138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f233139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f233140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f233141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final z6.f f233142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f233143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f233144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f233145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f233146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f233147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f233148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f233149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private z6.b f233150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f233125n = new g("translationX");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f233126o = new h("translationY");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f233127p = new i("translationZ");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f233128q = new j("scaleX");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f233129r = new k("scaleY");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f233130s = new l("rotation");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f233131t = new m("rotationX");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f233132u = new n("rotationY");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f233133v = new o("x");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f233134w = new a("y");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f233135x = new b("z");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f233136y = new c("alpha");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f233137z = new d("scrollX");
    public static final s A = new C6273e("scrollY");

    class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setY(f15);
        }
    }

    class b extends s {
        b(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return l0.I(view);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            l0.x0(view, f15);
        }
    }

    class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setAlpha(f15);
        }
    }

    class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setScrollX((int) f15);
        }
    }

    /* JADX INFO: renamed from: z6.e$e, reason: collision with other inner class name */
    class C6273e extends s {
        C6273e(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setScrollY((int) f15);
        }
    }

    class f extends z6.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z6.g f233151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, z6.g gVar) {
            super(str);
            this.f233151b = gVar;
        }

        @Override // z6.f
        public float a(Object obj) {
            return this.f233151b.a();
        }

        @Override // z6.f
        public void b(Object obj, float f15) {
            this.f233151b.b(f15);
        }
    }

    class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setTranslationX(f15);
        }
    }

    class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setTranslationY(f15);
        }
    }

    class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return l0.F(view);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            l0.v0(view, f15);
        }
    }

    class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setScaleX(f15);
        }
    }

    class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setScaleY(f15);
        }
    }

    class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setRotation(f15);
        }
    }

    class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setRotationX(f15);
        }
    }

    class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setRotationY(f15);
        }
    }

    class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f15) {
            view.setX(f15);
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f233153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f233154b;

        p() {
        }
    }

    public interface q {
        void a(e eVar, boolean z15, float f15, float f16);
    }

    public interface r {
        void m(e eVar, float f15, float f16);
    }

    public static abstract class s extends z6.f<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    e(z6.g gVar) {
        this.f233138a = 0.0f;
        this.f233139b = Float.MAX_VALUE;
        this.f233140c = false;
        this.f233143f = false;
        this.f233144g = Float.MAX_VALUE;
        this.f233145h = -Float.MAX_VALUE;
        this.f233146i = 0L;
        this.f233148k = new ArrayList<>();
        this.f233149l = new ArrayList<>();
        this.f233141d = null;
        this.f233142e = new f("FloatValueHolder", gVar);
        this.f233147j = 1.0f;
    }

    private void d(boolean z15) {
        this.f233143f = false;
        e().k(this);
        this.f233146i = 0L;
        this.f233140c = false;
        for (int i15 = 0; i15 < this.f233148k.size(); i15++) {
            if (this.f233148k.get(i15) != null) {
                this.f233148k.get(i15).a(this, z15, this.f233139b, this.f233138a);
            }
        }
        i(this.f233148k);
    }

    private float f() {
        return this.f233142e.a(this.f233141d);
    }

    private static <T> void i(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void r() {
        if (this.f233143f) {
            return;
        }
        this.f233143f = true;
        if (!this.f233140c) {
            this.f233139b = f();
        }
        float f15 = this.f233139b;
        if (f15 > this.f233144g || f15 < this.f233145h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        e().d(this, 0L);
    }

    @Override // z6.b.c
    public boolean a(long j15) {
        long j16 = this.f233146i;
        if (j16 == 0) {
            this.f233146i = j15;
            m(this.f233139b);
            return false;
        }
        long j17 = j15 - j16;
        this.f233146i = j15;
        float fG = e().g();
        boolean zS = s(fG == 0.0f ? 2147483647L : (long) (j17 / fG));
        float fMin = Math.min(this.f233139b, this.f233144g);
        this.f233139b = fMin;
        float fMax = Math.max(fMin, this.f233145h);
        this.f233139b = fMax;
        m(fMax);
        if (zS) {
            d(false);
        }
        return zS;
    }

    public T b(q qVar) {
        if (!this.f233148k.contains(qVar)) {
            this.f233148k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (h()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f233149l.contains(rVar)) {
            this.f233149l.add(rVar);
        }
        return this;
    }

    public z6.b e() {
        z6.b bVar = this.f233150m;
        return bVar != null ? bVar : z6.b.h();
    }

    float g() {
        return this.f233147j * 0.75f;
    }

    public boolean h() {
        return this.f233143f;
    }

    public T j(float f15) {
        this.f233144g = f15;
        return this;
    }

    public T k(float f15) {
        this.f233145h = f15;
        return this;
    }

    public T l(float f15) {
        if (f15 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f233147j = f15;
        p(f15 * 0.75f);
        return this;
    }

    void m(float f15) {
        this.f233142e.b(this.f233141d, f15);
        for (int i15 = 0; i15 < this.f233149l.size(); i15++) {
            if (this.f233149l.get(i15) != null) {
                this.f233149l.get(i15).m(this, this.f233139b, this.f233138a);
            }
        }
        i(this.f233149l);
    }

    public T n(float f15) {
        this.f233139b = f15;
        this.f233140c = true;
        return this;
    }

    public T o(float f15) {
        this.f233138a = f15;
        return this;
    }

    abstract void p(float f15);

    public void q() {
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f233143f) {
            return;
        }
        r();
    }

    abstract boolean s(long j15);

    <K> e(K k15, z6.f<K> fVar) {
        this.f233138a = 0.0f;
        this.f233139b = Float.MAX_VALUE;
        this.f233140c = false;
        this.f233143f = false;
        this.f233144g = Float.MAX_VALUE;
        this.f233145h = -Float.MAX_VALUE;
        this.f233146i = 0L;
        this.f233148k = new ArrayList<>();
        this.f233149l = new ArrayList<>();
        this.f233141d = k15;
        this.f233142e = fVar;
        if (fVar != f233130s && fVar != f233131t && fVar != f233132u) {
            if (fVar == f233136y) {
                this.f233147j = 0.00390625f;
                return;
            } else if (fVar != f233128q && fVar != f233129r) {
                this.f233147j = 1.0f;
                return;
            } else {
                this.f233147j = 0.002f;
                return;
            }
        }
        this.f233147j = 0.1f;
    }
}
