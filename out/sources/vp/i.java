package vp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gp.h f207799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bp.i f207800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lp.r f207801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f207802d = 12.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private op.a f207803e;

    i(bp.p pVar, gp.h hVar) throws IOException {
        if (pVar == null) {
            throw new IllegalArgumentException("/DA is a required entry. Please set a default appearance first.");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("/DR is a required entry");
        }
        this.f207799a = hVar;
        f(pVar.i3());
    }

    private void f(byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        ep.g gVar = new ep.g(bArr);
        for (Object objQ = gVar.Q(); objQ != null; objQ = gVar.Q()) {
            if (objQ instanceof ap.a) {
                g((ap.a) objQ, arrayList);
                arrayList = new ArrayList();
            } else {
                arrayList.add((bp.b) objQ);
            }
        }
    }

    private void g(ap.a aVar, List<bp.b> list) throws IOException {
        String strC = aVar.c();
        if ("Tf".equals(strC)) {
            h(list);
            return;
        }
        if ("g".equals(strC)) {
            i(list);
        } else if ("rg".equals(strC)) {
            i(list);
        } else if ("k".equals(strC)) {
            i(list);
        }
    }

    private void h(List<bp.b> list) throws IOException {
        if (list.size() < 2) {
            throw new IOException("Missing operands for set font operator " + Arrays.toString(list.toArray()));
        }
        bp.b bVar = list.get(0);
        bp.b bVar2 = list.get(1);
        if ((bVar instanceof bp.i) && (bVar2 instanceof bp.k)) {
            bp.i iVar = (bp.i) bVar;
            lp.r rVarJ = this.f207799a.j(iVar);
            float fI3 = ((bp.k) bVar2).i3();
            if (rVarJ != null) {
                l(iVar);
                j(rVarJ);
                m(fI3);
            } else {
                throw new IOException("Could not find font: /" + iVar.A3());
            }
        }
    }

    private void i(List<bp.b> list) throws IOException {
        op.b bVar;
        int size = list.size();
        if (size == 1) {
            bVar = op.d.f148060c;
        } else {
            if (size != 3 && size != 4) {
                throw new IOException("Missing operands for set non stroking color operator " + Arrays.toString(list.toArray()));
            }
            bVar = op.e.f148062c;
        }
        bp.a aVar = new bp.a();
        aVar.X3(list);
        k(new op.a(aVar, bVar));
    }

    void a(tp.q qVar) {
        gp.h hVarG = qVar.g();
        if (hVarG == null) {
            hVarG = new gp.h();
            qVar.k(hVarG);
        }
        if (hVarG.j(this.f207800b) == null) {
            hVarG.q(this.f207800b, b());
        }
    }

    lp.r b() {
        return this.f207801c;
    }

    op.a c() {
        return this.f207803e;
    }

    bp.i d() {
        return this.f207800b;
    }

    public float e() {
        return this.f207802d;
    }

    void j(lp.r rVar) {
        this.f207801c = rVar;
    }

    void k(op.a aVar) {
        this.f207803e = aVar;
    }

    void l(bp.i iVar) {
        this.f207800b = iVar;
    }

    void m(float f15) {
        this.f207802d = f15;
    }

    void n(gp.f fVar, float f15) throws IOException {
        float fE = e();
        if (fE != 0.0f) {
            f15 = fE;
        }
        fVar.L(b(), f15);
        if (c() != null) {
            fVar.Z(c());
        }
    }
}
