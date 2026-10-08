package st;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f184003a = new c();

    private c() {
    }

    private final boolean c(w1 w1Var, wt.j jVar, wt.p pVar) {
        wt.s sVarJ = w1Var.j();
        if (sVarJ.L0(jVar)) {
            return true;
        }
        if (sVarJ.A(jVar)) {
            return false;
        }
        if (w1Var.o() && sVarJ.C0(jVar)) {
            return true;
        }
        return sVarJ.y0(sVarJ.d(jVar), pVar);
    }

    private final boolean e(w1 w1Var, wt.j jVar, wt.j jVar2) {
        wt.s sVarJ = w1Var.j();
        if (h.f184042b) {
            if (!sVarJ.b(jVar) && !sVarJ.o0(sVarJ.d(jVar))) {
                w1Var.l(jVar);
            }
            if (!sVarJ.b(jVar2)) {
                w1Var.l(jVar2);
            }
        }
        if (sVarJ.A(jVar2) || sVarJ.l0(jVar) || sVarJ.t(jVar)) {
            return true;
        }
        if ((jVar instanceof wt.d) && sVarJ.v((wt.d) jVar)) {
            return true;
        }
        c cVar = f184003a;
        if (cVar.a(w1Var, jVar, w1.c.b.f184165a)) {
            return true;
        }
        if (sVarJ.t(jVar2) || cVar.a(w1Var, jVar2, w1.c.d.f184167a) || sVarJ.o(jVar)) {
            return false;
        }
        return cVar.b(w1Var, jVar, sVarJ.d(jVar2));
    }

    public final boolean a(w1 w1Var, wt.j jVar, w1.c cVar) {
        wt.s sVarJ = w1Var.j();
        if ((sVarJ.o(jVar) && !sVarJ.A(jVar)) || sVarJ.t(jVar)) {
            return true;
        }
        w1Var.k();
        ArrayDeque<wt.j> arrayDequeH = w1Var.h();
        Set<wt.j> setI = w1Var.i();
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            wt.j jVarPop = arrayDequeH.pop();
            if (setI.add(jVarPop)) {
                w1.c cVar2 = sVarJ.A(jVarPop) ? w1.c.C4746c.f184166a : cVar;
                if (fr.t.c(cVar2, w1.c.C4746c.f184166a)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    wt.s sVarJ2 = w1Var.j();
                    Iterator<wt.i> it = sVarJ2.I0(sVarJ2.d(jVarPop)).iterator();
                    while (it.hasNext()) {
                        wt.j jVarA = cVar2.a(w1Var, it.next());
                        if ((sVarJ.o(jVarA) && !sVarJ.A(jVarA)) || sVarJ.t(jVarA)) {
                            w1Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        w1Var.e();
        return false;
    }

    public final boolean b(w1 w1Var, wt.j jVar, wt.p pVar) {
        wt.s sVarJ = w1Var.j();
        if (f184003a.c(w1Var, jVar, pVar)) {
            return true;
        }
        w1Var.k();
        ArrayDeque<wt.j> arrayDequeH = w1Var.h();
        Set<wt.j> setI = w1Var.i();
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            wt.j jVarPop = arrayDequeH.pop();
            if (setI.add(jVarPop)) {
                w1.c cVar = sVarJ.A(jVarPop) ? w1.c.C4746c.f184166a : w1.c.b.f184165a;
                if (fr.t.c(cVar, w1.c.C4746c.f184166a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    wt.s sVarJ2 = w1Var.j();
                    Iterator<wt.i> it = sVarJ2.I0(sVarJ2.d(jVarPop)).iterator();
                    while (it.hasNext()) {
                        wt.j jVarA = cVar.a(w1Var, it.next());
                        if (f184003a.c(w1Var, jVarA, pVar)) {
                            w1Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        w1Var.e();
        return false;
    }

    public final boolean d(w1 w1Var, wt.j jVar, wt.j jVar2) {
        return e(w1Var, jVar, jVar2);
    }
}
