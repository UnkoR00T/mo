package js;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<TAnnotation> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f104606c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, c> f104607d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f104608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Object, TAnnotation> f104609b = new ConcurrentHashMap<>();

    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c cVar : c.values()) {
            String strE = cVar.e();
            if (linkedHashMap.get(strE) == null) {
                linkedHashMap.put(strE, cVar);
            }
        }
        f104607d = linkedHashMap;
    }

    public b(e0 e0Var) {
        this.f104608a = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<c> b(Set<? extends c> set) {
        return set.contains(c.TYPE_USE) ? e1.l(e1.k(pq.n.B1(c.values()), c.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final w e(TAnnotation tannotation) {
        rs.m mVarI;
        w wVarU = u(tannotation);
        if (wVarU != null) {
            return wVarU;
        }
        oq.r<TAnnotation, Set<c>> rVarW = w(tannotation);
        if (rVarW == null) {
            return null;
        }
        TAnnotation tannotationA = rVarW.a();
        Set<c> setB = rVarW.b();
        p0 p0VarT = t(tannotation);
        if (p0VarT == null) {
            p0VarT = s(tannotationA);
        }
        if (p0VarT.g() || (mVarI = i(tannotationA, js.a.f104605a)) == null) {
            return null;
        }
        return new w(rs.m.b(mVarI, null, p0VarT.j(), 1, null), setB, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        return false;
    }

    private final rs.m i(TAnnotation tannotation, er.l<? super TAnnotation, Boolean> lVar) {
        rs.m mVarQ;
        rs.m mVarQ2 = q(tannotation, lVar.b(tannotation).booleanValue());
        if (mVarQ2 != null) {
            return mVarQ2;
        }
        TAnnotation tannotationV = v(tannotation);
        if (tannotationV == null) {
            return null;
        }
        p0 p0VarS = s(tannotation);
        if (p0VarS.g() || (mVarQ = q(tannotationV, lVar.b(tannotationV).booleanValue())) == null) {
            return null;
        }
        return rs.m.b(mVarQ, null, p0VarS.j(), 1, null);
    }

    private final TAnnotation j(TAnnotation tannotation, zs.c cVar) {
        for (TAnnotation tannotation2 : m(tannotation)) {
            if (fr.t.c(k(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean n(TAnnotation tannotation, zs.c cVar) {
        Iterable<TAnnotation> iterableM = m(tannotation);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableM.iterator();
        while (it.hasNext()) {
            if (fr.t.c(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = rs.l.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final rs.m q(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            zs.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            js.e0 r2 = r5.f104608a
            er.l r2 = r2.b()
            java.lang.Object r2 = r2.b(r0)
            js.p0 r2 = (js.p0) r2
            boolean r3 = r2.g()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = js.k0.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            rs.l r6 = rs.l.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = js.k0.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            rs.l r6 = rs.l.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = js.k0.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            rs.l r6 = rs.l.FORCE_FLEXIBILITY
            goto L8d
        L43:
            zs.c r3 = js.k0.c()
            boolean r0 = fr.t.c(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = pq.v.m0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            rs.l r6 = rs.l.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            rs.l r6 = rs.l.NULLABLE
            goto L8d
        L8b:
            rs.l r6 = rs.l.NOT_NULL
        L8d:
            rs.m r0 = new rs.m
            boolean r1 = r2.j()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: js.b.q(java.lang.Object, boolean):rs.m");
    }

    private final p0 r(TAnnotation tannotation) {
        zs.c cVarK = k(tannotation);
        return (cVarK == null || !x.b().containsKey(cVarK)) ? s(tannotation) : this.f104608a.b().b(cVarK);
    }

    private final p0 s(TAnnotation tannotation) {
        p0 p0VarT = t(tannotation);
        return p0VarT != null ? p0VarT : this.f104608a.c().c();
    }

    private final p0 t(TAnnotation tannotation) {
        Iterable<String> iterableC;
        String str;
        p0 p0Var = this.f104608a.c().e().get(k(tannotation));
        if (p0Var != null) {
            return p0Var;
        }
        TAnnotation tannotationJ = j(tannotation, k0.p());
        if (tannotationJ == null || (iterableC = c(tannotationJ, false)) == null || (str = (String) pq.v.m0(iterableC)) == null) {
            return null;
        }
        p0 p0VarD = this.f104608a.c().d();
        if (p0VarD != null) {
            return p0VarD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return p0.WARN;
                }
            } else if (str.equals("STRICT")) {
                return p0.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return p0.IGNORE;
        }
        return null;
    }

    private final w u(TAnnotation tannotation) {
        w wVar;
        if (this.f104608a.a() || (wVar = x.a().get(k(tannotation))) == null) {
            return null;
        }
        p0 p0VarR = r(tannotation);
        if (p0VarR == p0.IGNORE) {
            p0VarR = null;
        }
        if (p0VarR == null) {
            return null;
        }
        return w.b(wVar, rs.m.b(wVar.d(), null, p0VarR.j(), 1, null), null, false, false, 14, null);
    }

    private final oq.r<TAnnotation, Set<c>> w(TAnnotation tannotation) {
        TAnnotation tannotationJ;
        TAnnotation next;
        if (this.f104608a.c().f() || (tannotationJ = j(tannotation, k0.g())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = m(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (v(next) == null);
        if (next == null) {
            return null;
        }
        Iterable<String> iterableC = c(tannotationJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it4 = iterableC.iterator();
        while (it4.hasNext()) {
            c cVar = f104607d.get(it4.next());
            if (cVar != null) {
                linkedHashSet.add(cVar);
            }
        }
        return new oq.r<>(next, b(linkedHashSet));
    }

    protected abstract Iterable<String> c(TAnnotation tannotation, boolean z15);

    public final f0 d(f0 f0Var, Iterable<? extends TAnnotation> iterable) {
        EnumMap<c, w> enumMapB;
        if (!this.f104608a.a()) {
            ArrayList<w> arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = iterable.iterator();
            while (it.hasNext()) {
                w wVarE = e(it.next());
                if (wVarE != null) {
                    arrayList.add(wVarE);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(c.class);
                for (w wVar : arrayList) {
                    for (c cVar : wVar.e()) {
                        if (enumMap.containsKey(cVar) && o()) {
                            w wVar2 = (w) enumMap.get(cVar);
                            if (wVar2 != null) {
                                rs.m mVarD = wVar2.d();
                                rs.m mVarD2 = wVar.d();
                                if (!fr.t.c(mVarD2, mVarD) && (!mVarD2.d() || mVarD.d())) {
                                    wVar2 = (mVarD2.d() || !mVarD.d()) ? null : wVar;
                                }
                                enumMap.put(cVar, wVar2);
                            }
                        } else {
                            enumMap.put(cVar, wVar);
                        }
                    }
                }
                EnumMap enumMap2 = (f0Var == null || (enumMapB = f0Var.b()) == null) ? new EnumMap(c.class) : new EnumMap((EnumMap) enumMapB);
                boolean z15 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    c cVar2 = (c) entry.getKey();
                    w wVar3 = (w) entry.getValue();
                    if (wVar3 != null) {
                        enumMap2.put(cVar2, wVar3);
                        z15 = true;
                    }
                }
                if (z15) {
                    return new f0(enumMap2);
                }
            }
        }
        return f0Var;
    }

    public final rs.j g(Iterable<? extends TAnnotation> iterable) {
        rs.j jVar;
        Iterator<? extends TAnnotation> it = iterable.iterator();
        rs.j jVar2 = null;
        while (it.hasNext()) {
            zs.c cVarK = k(it.next());
            if (pq.v.c0(k0.o(), cVarK)) {
                jVar = rs.j.READ_ONLY;
            } else if (pq.v.c0(k0.l(), cVarK)) {
                jVar = rs.j.MUTABLE;
            } else {
                continue;
            }
            if (jVar2 != null && jVar2 != jVar) {
                return null;
            }
            jVar2 = jVar;
        }
        return jVar2;
    }

    public final rs.m h(Iterable<? extends TAnnotation> iterable, er.l<? super TAnnotation, Boolean> lVar) {
        Iterator<? extends TAnnotation> it = iterable.iterator();
        rs.m mVar = null;
        while (it.hasNext()) {
            rs.m mVarI = i(it.next(), lVar);
            if (mVar != null) {
                if (mVarI != null && !fr.t.c(mVarI, mVar) && (!mVarI.d() || mVar.d())) {
                    if (mVarI.d() || !mVar.d()) {
                        return null;
                    }
                }
            }
            mVar = mVarI;
        }
        return mVar;
    }

    protected abstract zs.c k(TAnnotation tannotation);

    protected abstract Object l(TAnnotation tannotation);

    protected abstract Iterable<TAnnotation> m(TAnnotation tannotation);

    public abstract boolean o();

    public final boolean p(TAnnotation tannotation) {
        TAnnotation tannotationJ = j(tannotation, sr.p.a.H);
        if (tannotationJ == null) {
            return false;
        }
        Iterable<String> iterableC = c(tannotationJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableC.iterator();
        while (it.hasNext()) {
            if (fr.t.c(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation v(TAnnotation tannotation) {
        TAnnotation tannotationV;
        if (this.f104608a.c().f()) {
            return null;
        }
        if (pq.v.c0(k0.a(), k(tannotation)) || n(tannotation, k0.f())) {
            return tannotation;
        }
        if (!n(tannotation, k0.h())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f104609b;
        Object objL = l(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(objL);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = m(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotationV = null;
                break;
            }
            tannotationV = v(it.next());
        } while (tannotationV == null);
        if (tannotationV == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objL, tannotationV);
        return tannotationPutIfAbsent == null ? tannotationV : tannotationPutIfAbsent;
    }
}
