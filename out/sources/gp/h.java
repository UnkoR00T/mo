package gp;

import bp.l;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lp.r;
import lp.t;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f75815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f75816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<bp.i, SoftReference<r>> f75817c;

    public h() {
        this.f75817c = new HashMap();
        this.f75815a = new bp.d();
        this.f75816b = null;
    }

    private bp.i a(bp.i iVar, String str, hp.c cVar) {
        bp.d dVarK4 = this.f75815a.k4(iVar);
        if (dVarK4 != null && dVarK4.X3(cVar.D1())) {
            return dVarK4.E4(cVar.D1());
        }
        if (dVarK4 != null && bp.i.H3.equals(iVar)) {
            for (Map.Entry<bp.i, bp.b> entry : dVarK4.entrySet()) {
                if ((entry.getValue() instanceof l) && cVar.D1() == ((l) entry.getValue()).X3()) {
                    return entry.getKey();
                }
            }
        }
        bp.i iVarE = e(iVar, str);
        p(iVar, iVarE, cVar);
        return iVarE;
    }

    private bp.i e(bp.i iVar, String str) {
        String str2;
        bp.d dVarK4 = this.f75815a.k4(iVar);
        if (dVarK4 == null) {
            return bp.i.J3(str + 1);
        }
        int size = dVarK4.O4().size();
        do {
            size++;
            str2 = str + size;
        } while (dVarK4.N3(str2));
        return bp.i.J3(str2);
    }

    private bp.b f(bp.i iVar, bp.i iVar2) {
        bp.d dVarK4 = this.f75815a.k4(iVar);
        if (dVarK4 == null) {
            return null;
        }
        return dVarK4.p4(iVar2);
    }

    private l l(bp.i iVar, bp.i iVar2) {
        bp.d dVarK4 = this.f75815a.k4(iVar);
        if (dVarK4 == null) {
            return null;
        }
        bp.b bVarC4 = dVarK4.C4(iVar2);
        if (bVarC4 instanceof l) {
            return (l) bVarC4;
        }
        return null;
    }

    private Iterable<bp.i> m(bp.i iVar) {
        bp.d dVarK4 = this.f75815a.k4(iVar);
        return dVarK4 == null ? Collections.EMPTY_SET : dVarK4.O4();
    }

    private void p(bp.i iVar, bp.i iVar2, hp.c cVar) {
        bp.d dVarK4 = this.f75815a.k4(iVar);
        if (dVarK4 == null) {
            dVarK4 = new bp.d();
            this.f75815a.Y4(iVar, dVarK4);
        }
        dVarK4.Z4(iVar2, cVar);
    }

    public bp.i b(r rVar) {
        return a(bp.i.H3, "F", rVar);
    }

    public bp.i c(op.b bVar) {
        return a(bp.i.I1, "cs", bVar);
    }

    public bp.i d(qp.d dVar) {
        return a(bp.i.N9, "Im", dVar);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f75815a;
    }

    public op.b h(bp.i iVar) {
        return i(iVar, false);
    }

    public op.b i(bp.i iVar, boolean z15) {
        op.b bVarC;
        bp.i iVar2 = bp.i.I1;
        l lVarL = l(iVar2, iVar);
        j jVar = this.f75816b;
        if (jVar != null && lVarL != null && (bVarC = jVar.c(lVarL)) != null) {
            return bVarC;
        }
        bp.b bVarF = f(iVar2, iVar);
        op.b bVarB = bVarF != null ? op.b.b(bVarF, this, z15) : op.b.b(iVar, this, z15);
        j jVar2 = this.f75816b;
        if (jVar2 != null && lVarL != null) {
            jVar2.b(lVarL, bVarB);
        }
        return bVarB;
    }

    public r j(bp.i iVar) {
        SoftReference<r> softReference;
        r rVar;
        bp.i iVar2 = bp.i.H3;
        l lVarL = l(iVar2, iVar);
        j jVar = this.f75816b;
        if (jVar != null && lVarL != null) {
            r rVarA = jVar.a(lVarL);
            if (rVarA != null) {
                return rVarA;
            }
        } else if (lVarL == null && (softReference = this.f75817c.get(iVar)) != null && (rVar = softReference.get()) != null) {
            return rVar;
        }
        bp.b bVarF = f(iVar2, iVar);
        r rVarB = bVarF instanceof bp.d ? t.b((bp.d) bVarF, this.f75816b) : null;
        j jVar2 = this.f75816b;
        if (jVar2 != null && lVarL != null) {
            jVar2.d(lVarL, rVarB);
            return rVarB;
        }
        if (lVarL == null) {
            this.f75817c.put(iVar, new SoftReference<>(rVarB));
        }
        return rVarB;
    }

    public Iterable<bp.i> k() {
        return m(bp.i.H3);
    }

    public j n() {
        return this.f75816b;
    }

    public boolean o(bp.i iVar) {
        return f(bp.i.I1, iVar) != null;
    }

    public void q(bp.i iVar, r rVar) {
        p(bp.i.H3, iVar, rVar);
    }

    public h(bp.d dVar, j jVar) {
        this.f75817c = new HashMap();
        if (dVar != null) {
            this.f75815a = dVar;
            this.f75816b = jVar;
            return;
        }
        throw new IllegalArgumentException("resourceDictionary is null");
    }
}
