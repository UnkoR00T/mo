package zj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.d f235424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f235425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f235426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f235427d;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zj.d f235428a;

        /* JADX INFO: renamed from: zj.t$a$a, reason: collision with other inner class name */
        class C6353a extends c {
            C6353a(t tVar, CharSequence charSequence) {
                super(tVar, charSequence);
            }

            @Override // zj.t.c
            int f(int i15) {
                return i15 + 1;
            }

            @Override // zj.t.c
            int g(int i15) {
                return a.this.f235428a.i(this.f235432c, i15);
            }
        }

        a(zj.d dVar) {
            this.f235428a = dVar;
        }

        @Override // zj.t.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(t tVar, CharSequence charSequence) {
            return new C6353a(tVar, charSequence);
        }
    }

    class b implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f235430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f235431b;

        b(t tVar, CharSequence charSequence) {
            this.f235430a = charSequence;
            this.f235431b = tVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f235431b.i(this.f235430a);
        }

        public String toString() {
            i iVarH = i.h(", ");
            StringBuilder sb5 = new StringBuilder();
            sb5.append('[');
            StringBuilder sbC = iVarH.c(sb5, this);
            sbC.append(']');
            return sbC.toString();
        }
    }

    private static abstract class c extends zj.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f235432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final zj.d f235433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f235434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f235435f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f235436g;

        protected c(t tVar, CharSequence charSequence) {
            this.f235433d = tVar.f235424a;
            this.f235434e = tVar.f235425b;
            this.f235436g = tVar.f235427d;
            this.f235432c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // zj.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i15 = this.f235435f;
            while (true) {
                int i16 = this.f235435f;
                if (i16 == -1) {
                    return c();
                }
                int iG = g(i16);
                if (iG == -1) {
                    iG = this.f235432c.length();
                    this.f235435f = -1;
                } else {
                    this.f235435f = f(iG);
                }
                int i17 = this.f235435f;
                if (i17 == i15) {
                    int i18 = i17 + 1;
                    this.f235435f = i18;
                    if (i18 > this.f235432c.length()) {
                        this.f235435f = -1;
                    }
                } else {
                    while (i15 < iG && this.f235433d.n(this.f235432c.charAt(i15))) {
                        i15++;
                    }
                    while (iG > i15 && this.f235433d.n(this.f235432c.charAt(iG - 1))) {
                        iG--;
                    }
                    if (!this.f235434e || i15 != iG) {
                        int i19 = this.f235436g;
                        if (i19 == 1) {
                            iG = this.f235432c.length();
                            this.f235435f = -1;
                            while (iG > i15 && this.f235433d.n(this.f235432c.charAt(iG - 1))) {
                                iG--;
                            }
                        } else {
                            this.f235436g = i19 - 1;
                        }
                        return this.f235432c.subSequence(i15, iG).toString();
                    }
                    i15 = this.f235435f;
                }
            }
        }

        abstract int f(int i15);

        abstract int g(int i15);
    }

    private interface d {
        Iterator<String> a(t tVar, CharSequence charSequence);
    }

    private t(d dVar) {
        this(dVar, false, zj.d.r(), Integer.MAX_VALUE);
    }

    public static t e(char c15) {
        return f(zj.d.j(c15));
    }

    public static t f(zj.d dVar) {
        p.q(dVar);
        return new t(new a(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> i(CharSequence charSequence) {
        return this.f235426c.a(this, charSequence);
    }

    public Iterable<String> g(CharSequence charSequence) {
        p.q(charSequence);
        return new b(this, charSequence);
    }

    public List<String> h(CharSequence charSequence) {
        p.q(charSequence);
        Iterator<String> itI = i(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itI.hasNext()) {
            arrayList.add(itI.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public t j() {
        return k(zj.d.u());
    }

    public t k(zj.d dVar) {
        p.q(dVar);
        return new t(this.f235426c, this.f235425b, dVar, this.f235427d);
    }

    private t(d dVar, boolean z15, zj.d dVar2, int i15) {
        this.f235426c = dVar;
        this.f235425b = z15;
        this.f235424a = dVar2;
        this.f235427d = i15;
    }
}
