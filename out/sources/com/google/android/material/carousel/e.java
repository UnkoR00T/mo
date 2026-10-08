package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f35001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<c> f35003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35006f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f35007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f35008b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f35010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f35011e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c> f35009c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f35012f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f35013g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f35014h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f35015i = -1;

        public b(float f15, int i15) {
            this.f35007a = f15;
            this.f35008b = i15;
        }

        private static float j(float f15, float f16, int i15, int i16) {
            return (f15 - (i15 * f16)) + (i16 * f16);
        }

        public b a(float f15, float f16, float f17) {
            return d(f15, f16, f17, false, true);
        }

        public b b(float f15, float f16, float f17) {
            return c(f15, f16, f17, false);
        }

        public b c(float f15, float f16, float f17, boolean z15) {
            return d(f15, f16, f17, z15, false);
        }

        public b d(float f15, float f16, float f17, boolean z15, boolean z16) {
            float fAbs;
            float f18 = f17 / 2.0f;
            float f19 = f15 - f18;
            float f25 = f18 + f15;
            int i15 = this.f35008b;
            if (f25 > i15) {
                fAbs = Math.abs(f25 - Math.max(f25 - f17, i15));
            } else {
                fAbs = 0.0f;
                if (f19 < 0.0f) {
                    fAbs = Math.abs(f19 - Math.min(f19 + f17, 0.0f));
                }
            }
            return e(f15, f16, f17, z15, z16, fAbs);
        }

        public b e(float f15, float f16, float f17, boolean z15, boolean z16, float f18) {
            return f(f15, f16, f17, z15, z16, f18, 0.0f, 0.0f);
        }

        public b f(float f15, float f16, float f17, boolean z15, boolean z16, float f18, float f19, float f25) {
            if (f17 <= 0.0f) {
                return this;
            }
            if (z16) {
                if (z15) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i15 = this.f35015i;
                if (i15 != -1 && i15 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f35015i = this.f35009c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f15, f16, f17, z16, f18, f19, f25);
            if (z15) {
                if (this.f35010d == null) {
                    this.f35010d = cVar;
                    this.f35012f = this.f35009c.size();
                }
                if (this.f35013g != -1 && this.f35009c.size() - this.f35013g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f17 != this.f35010d.f35019d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f35011e = cVar;
                this.f35013g = this.f35009c.size();
            } else {
                if (this.f35010d == null && cVar.f35019d < this.f35014h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f35011e != null && cVar.f35019d > this.f35014h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f35014h = cVar.f35019d;
            this.f35009c.add(cVar);
            return this;
        }

        public b g(float f15, float f16, float f17, int i15) {
            return h(f15, f16, f17, i15, false);
        }

        public b h(float f15, float f16, float f17, int i15, boolean z15) {
            if (i15 > 0 && f17 > 0.0f) {
                for (int i16 = 0; i16 < i15; i16++) {
                    c((i16 * f17) + f15, f16, f17, z15);
                }
            }
            return this;
        }

        public e i() {
            if (this.f35010d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < this.f35009c.size(); i15++) {
                c cVar = this.f35009c.get(i15);
                arrayList.add(new c(j(this.f35010d.f35017b, this.f35007a, this.f35012f, i15), cVar.f35017b, cVar.f35018c, cVar.f35019d, cVar.f35020e, cVar.f35021f, cVar.f35022g, cVar.f35023h));
            }
            return new e(this.f35007a, arrayList, this.f35012f, this.f35013g, this.f35008b);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f35016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f35017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f35018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f35019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f35020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f35021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f35022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f35023h;

        c(float f15, float f16, float f17, float f18) {
            this(f15, f16, f17, f18, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f15) {
            return new c(si.a.a(cVar.f35016a, cVar2.f35016a, f15), si.a.a(cVar.f35017b, cVar2.f35017b, f15), si.a.a(cVar.f35018c, cVar2.f35018c, f15), si.a.a(cVar.f35019d, cVar2.f35019d, f15));
        }

        c(float f15, float f16, float f17, float f18, boolean z15, float f19, float f25, float f26) {
            this.f35016a = f15;
            this.f35017b = f16;
            this.f35018c = f17;
            this.f35019d = f18;
            this.f35020e = z15;
            this.f35021f = f19;
            this.f35022g = f25;
            this.f35023h = f26;
        }
    }

    static e o(e eVar, e eVar2, float f15) {
        if (eVar.g() != eVar2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listH = eVar.h();
        List<c> listH2 = eVar2.h();
        if (listH.size() != listH2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < eVar.h().size(); i15++) {
            arrayList.add(c.a(listH.get(i15), listH2.get(i15), f15));
        }
        return new e(eVar.g(), arrayList, si.a.c(eVar.c(), eVar2.c(), f15), si.a.c(eVar.j(), eVar2.j(), f15), eVar.f35006f);
    }

    static e p(e eVar, int i15) {
        b bVar = new b(eVar.g(), i15);
        float f15 = (i15 - eVar.k().f35017b) - (eVar.k().f35019d / 2.0f);
        int size = eVar.h().size() - 1;
        while (size >= 0) {
            c cVar = eVar.h().get(size);
            bVar.d((cVar.f35019d / 2.0f) + f15, cVar.f35018c, cVar.f35019d, size >= eVar.c() && size <= eVar.j(), cVar.f35020e);
            f15 += cVar.f35019d;
            size--;
        }
        return bVar.i();
    }

    int a() {
        return this.f35006f;
    }

    c b() {
        return this.f35003c.get(this.f35004d);
    }

    int c() {
        return this.f35004d;
    }

    c d() {
        return this.f35003c.get(0);
    }

    c e() {
        for (int i15 = 0; i15 < this.f35003c.size(); i15++) {
            c cVar = this.f35003c.get(i15);
            if (!cVar.f35020e) {
                return cVar;
            }
        }
        return null;
    }

    List<c> f() {
        return this.f35003c.subList(this.f35004d, this.f35005e + 1);
    }

    float g() {
        return this.f35001a;
    }

    List<c> h() {
        return this.f35003c;
    }

    c i() {
        return this.f35003c.get(this.f35005e);
    }

    int j() {
        return this.f35005e;
    }

    c k() {
        List<c> list = this.f35003c;
        return list.get(list.size() - 1);
    }

    c l() {
        for (int size = this.f35003c.size() - 1; size >= 0; size--) {
            c cVar = this.f35003c.get(size);
            if (!cVar.f35020e) {
                return cVar;
            }
        }
        return null;
    }

    int m() {
        Iterator<c> it = this.f35003c.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            if (it.next().f35020e) {
                i15++;
            }
        }
        return this.f35003c.size() - i15;
    }

    int n() {
        return this.f35002b;
    }

    private e(float f15, List<c> list, int i15, int i16, int i17) {
        this.f35001a = f15;
        this.f35003c = Collections.unmodifiableList(list);
        this.f35004d = i15;
        this.f35005e = i16;
        while (i15 <= i16) {
            if (list.get(i15).f35021f == 0.0f) {
                this.f35002b++;
            }
            i15++;
        }
        this.f35006f = i17;
    }
}
