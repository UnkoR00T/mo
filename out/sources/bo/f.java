package bo;

import ao.a0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import yn.q;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
class f extends z<yn.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f20477a = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20478a;

        static {
            int[] iArr = new int[ho.b.values().length];
            f20478a = iArr;
            try {
                iArr[ho.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20478a[ho.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20478a[ho.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20478a[ho.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20478a[ho.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20478a[ho.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private f() {
    }

    private yn.l f(ho.a aVar, ho.b bVar) throws IOException {
        int i15 = a.f20478a[bVar.ordinal()];
        if (i15 == 3) {
            return new q(aVar.q2());
        }
        if (i15 == 4) {
            return new q(new a0(aVar.q2()));
        }
        if (i15 == 5) {
            return new q(Boolean.valueOf(aVar.M()));
        }
        if (i15 == 6) {
            aVar.O();
            return yn.n.f228069a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private yn.l g(ho.a aVar, ho.b bVar) throws IOException {
        int i15 = a.f20478a[bVar.ordinal()];
        if (i15 == 1) {
            aVar.h();
            return new yn.i();
        }
        if (i15 != 2) {
            return null;
        }
        aVar.Y();
        return new yn.o();
    }

    @Override // yn.z
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yn.l b(ho.a aVar) throws IOException {
        if (aVar instanceof g) {
            return ((g) aVar).d1();
        }
        ho.b bVarA0 = aVar.a0();
        yn.l lVarG = g(aVar, bVarA0);
        if (lVarG == null) {
            return f(aVar, bVarA0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.I()) {
                String strH1 = lVarG instanceof yn.o ? aVar.h1() : null;
                ho.b bVarA1 = aVar.a0();
                yn.l lVarG2 = g(aVar, bVarA1);
                boolean z15 = lVarG2 != null;
                if (lVarG2 == null) {
                    lVarG2 = f(aVar, bVarA1);
                }
                if (lVarG instanceof yn.i) {
                    ((yn.i) lVarG).l(lVarG2);
                } else {
                    ((yn.o) lVarG).l(strH1, lVarG2);
                }
                if (z15) {
                    arrayDeque.addLast(lVarG);
                    lVarG = lVarG2;
                }
            } else {
                if (lVarG instanceof yn.i) {
                    aVar.u();
                } else {
                    aVar.h0();
                }
                if (arrayDeque.isEmpty()) {
                    return lVarG;
                }
                lVarG = (yn.l) arrayDeque.removeLast();
            }
        }
    }

    @Override // yn.z
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(ho.c cVar, yn.l lVar) throws IOException {
        if (lVar == null || lVar.i()) {
            cVar.M();
            return;
        }
        if (lVar.k()) {
            q qVarG = lVar.g();
            if (qVarG.w()) {
                cVar.C0(qVarG.s());
                return;
            } else if (qVarG.u()) {
                cVar.O0(qVarG.o());
                return;
            } else {
                cVar.H0(qVarG.t());
                return;
            }
        }
        if (lVar.h()) {
            cVar.p();
            Iterator<yn.l> it = lVar.e().iterator();
            while (it.hasNext()) {
                d(cVar, it.next());
            }
            cVar.y();
            return;
        }
        if (!lVar.j()) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        cVar.r();
        for (Map.Entry<String, yn.l> entry : lVar.f().entrySet()) {
            cVar.K(entry.getKey());
            d(cVar, entry.getValue());
        }
        cVar.C();
    }
}
