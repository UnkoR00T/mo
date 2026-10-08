package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import wl.z;

/* JADX INFO: loaded from: classes4.dex */
class a extends a0<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a f36827a = new a();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0765a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36828a;

        static {
            int[] iArr = new int[zl.b.values().length];
            f36828a = iArr;
            try {
                iArr[zl.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36828a[zl.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36828a[zl.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36828a[zl.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36828a[zl.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36828a[zl.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private a() {
    }

    private l f(zl.a aVar, zl.b bVar) throws IOException {
        int i15 = C0765a.f36828a[bVar.ordinal()];
        if (i15 == 3) {
            return new r(aVar.q2());
        }
        if (i15 == 4) {
            return new r(new z(aVar.q2()));
        }
        if (i15 == 5) {
            return new r(Boolean.valueOf(aVar.M()));
        }
        if (i15 == 6) {
            aVar.O();
            return n.f36856a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private l g(zl.a aVar, zl.b bVar) throws IOException {
        int i15 = C0765a.f36828a[bVar.ordinal()];
        if (i15 == 1) {
            aVar.h();
            return new i();
        }
        if (i15 != 2) {
            return null;
        }
        aVar.Y();
        return new o();
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public l b(zl.a aVar) throws IOException {
        if (aVar instanceof b) {
            return ((b) aVar).i1();
        }
        zl.b bVarA0 = aVar.a0();
        l lVarG = g(aVar, bVarA0);
        if (lVarG == null) {
            return f(aVar, bVarA0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.I()) {
                String strH1 = lVarG instanceof o ? aVar.h1() : null;
                zl.b bVarA1 = aVar.a0();
                l lVarG2 = g(aVar, bVarA1);
                boolean z15 = lVarG2 != null;
                if (lVarG2 == null) {
                    lVarG2 = f(aVar, bVarA1);
                }
                if (lVarG instanceof i) {
                    ((i) lVarG).o(lVarG2);
                } else {
                    ((o) lVarG).o(strH1, lVarG2);
                }
                if (z15) {
                    arrayDeque.addLast(lVarG);
                    lVarG = lVarG2;
                }
            } else {
                if (lVarG instanceof i) {
                    aVar.u();
                } else {
                    aVar.h0();
                }
                if (arrayDeque.isEmpty()) {
                    return lVarG;
                }
                lVarG = (l) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(zl.c cVar, l lVar) throws IOException {
        if (lVar == null || lVar.k()) {
            cVar.M();
            return;
        }
        if (lVar.n()) {
            r rVarG = lVar.g();
            if (rVarG.z()) {
                cVar.C0(rVarG.h());
                return;
            } else if (rVarG.w()) {
                cVar.O0(rVarG.s());
                return;
            } else {
                cVar.H0(rVarG.i());
                return;
            }
        }
        if (lVar.j()) {
            cVar.p();
            Iterator<l> it = lVar.e().iterator();
            while (it.hasNext()) {
                d(cVar, it.next());
            }
            cVar.y();
            return;
        }
        if (!lVar.l()) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        cVar.r();
        for (Map.Entry<String, l> entry : lVar.f().entrySet()) {
            cVar.K(entry.getKey());
            d(cVar, entry.getValue());
        }
        cVar.C();
    }
}
