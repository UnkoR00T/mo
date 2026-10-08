package fs;

import es.f0;
import es.g0;
import es.h0;
import es.j;
import es.s;
import es.t;
import es.u;
import es.w;
import es.z;
import fr.b0;
import java.util.ArrayList;
import java.util.Iterator;
import pq.v;
import us.k;
import us.l;
import us.y;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final fs.a<es.g> a(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.a
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.g) obj).i());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.g) obj).s(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final fs.a<j> b(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.b
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((j) obj).c());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((j) obj).f(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final fs.a<s> c(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.c
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final <Node> fs.b<Node, f0> d(mr.j<Node, Integer> jVar) {
        ws.b.d<k> dVar = ws.b.f214735q;
        wq.a<f0> aVarE = f0.e();
        wq.a<f0> aVarE2 = f0.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE2, 10));
        Iterator<f0> it = aVarE2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return new fs.b<>(jVar, dVar, aVarE, arrayList);
    }

    public static final <Node> fs.b<Node, g0> e(mr.j<Node, Integer> jVar) {
        ws.b.d<l> dVar = ws.b.f214723e;
        wq.a<g0> aVarE = g0.e();
        wq.a<g0> aVarE2 = g0.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE2, 10));
        Iterator<g0> it = aVarE2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return new fs.b<>(jVar, dVar, aVarE, arrayList);
    }

    public static final fs.a<u> f(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.d
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((u) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((u) obj).c(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final fs.a<t> g(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.e
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final fs.a<w> h(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.f
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((w) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((w) obj).f(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final fs.a<es.v> i(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.g
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.v) obj).d());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.v) obj).g(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final fs.a<z> j(fs.d dVar) {
        return new fs.a<>(new b0() { // from class: fs.c.h
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((z) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((z) obj).d(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final <Node> fs.b<Node, h0> k(mr.j<Node, Integer> jVar) {
        ws.b.d<y> dVar = ws.b.f214722d;
        wq.a<h0> aVarE = h0.e();
        wq.a<h0> aVarE2 = h0.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE2, 10));
        Iterator<h0> it = aVarE2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return new fs.b<>(jVar, dVar, aVarE, arrayList);
    }
}
