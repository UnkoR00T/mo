package mp;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bp.d f127337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f127338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Integer, String> f127339e;

    public b(bp.d dVar) {
        this.f127339e = new HashMap();
        this.f127337c = dVar;
        this.f127338d = null;
        i();
    }

    private void i() {
        bp.b bVarP4 = this.f127337c.p4(bp.i.f20899v2);
        if (bVarP4 instanceof bp.a) {
            bp.a aVar = (bp.a) bVarP4;
            int iJ3 = -1;
            for (int i15 = 0; i15 < aVar.size(); i15++) {
                bp.b bVarK4 = aVar.k4(i15);
                if (bVarK4 instanceof bp.k) {
                    iJ3 = ((bp.k) bVarK4).J3();
                } else if (bVarK4 instanceof bp.i) {
                    bp.i iVar = (bp.i) bVarK4;
                    h(iJ3, iVar.A3());
                    this.f127339e.put(Integer.valueOf(iJ3), iVar.A3());
                    iJ3++;
                }
            }
        }
    }

    @Override // hp.c
    public bp.b D1() {
        return this.f127337c;
    }

    @Override // mp.c
    public String d() {
        if (this.f127338d == null) {
            return "differences";
        }
        return this.f127338d.d() + " with differences";
    }

    public c j() {
        return this.f127338d;
    }

    public Map<Integer, String> k() {
        return this.f127339e;
    }

    public b(bp.d dVar, boolean z15, c cVar) {
        this.f127339e = new HashMap();
        this.f127337c = dVar;
        bp.i iVar = bp.i.f20886u0;
        c cVarE = dVar.J3(iVar) ? c.e(dVar.l4(iVar)) : null;
        if (cVarE != null) {
            cVar = cVarE;
        } else if (z15) {
            cVar = h.f127354d;
        } else if (cVar == null) {
            throw new IllegalArgumentException("Symbolic fonts must have a built-in encoding");
        }
        this.f127338d = cVar;
        this.f127340a.putAll(cVar.f127340a);
        this.f127341b.putAll(cVar.f127341b);
        i();
    }
}
