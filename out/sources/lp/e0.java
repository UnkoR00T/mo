package lp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements hp.c, zo.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f119088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bp.o f119089b;

    public e0(f0 f0Var, bp.o oVar) {
        this.f119088a = f0Var;
        this.f119089b = oVar;
    }

    private float f(ap.a aVar, List<bp.b> list) throws IOException {
        if (!aVar.c().equals("d0") && !aVar.c().equals("d1")) {
            throw new IOException("First operator must be d0 or d1");
        }
        bp.b bVar = list.get(0);
        if (bVar instanceof bp.k) {
            return ((bp.k) bVar).i3();
        }
        throw new IOException("Unexpected argument type: " + bVar.getClass().getName());
    }

    @Override // zo.a
    public InputStream a() {
        return this.f119089b.l5();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bp.o D1() {
        return this.f119089b;
    }

    public hp.h c() {
        return new hp.h(this.f119089b);
    }

    public hp.g d() throws IOException {
        ArrayList arrayList = new ArrayList();
        ep.g gVar = new ep.g(this);
        for (Object objQ = gVar.Q(); objQ != null; objQ = gVar.Q()) {
            if (objQ instanceof ap.a) {
                if (!((ap.a) objQ).c().equals("d1") || arrayList.size() != 6) {
                    return null;
                }
                for (int i15 = 0; i15 < 6; i15++) {
                    if (!(arrayList.get(i15) instanceof bp.k)) {
                        return null;
                    }
                }
                float fI3 = ((bp.k) arrayList.get(2)).i3();
                float fI4 = ((bp.k) arrayList.get(3)).i3();
                return new hp.g(fI3, fI4, ((bp.k) arrayList.get(4)).i3() - fI3, ((bp.k) arrayList.get(5)).i3() - fI4);
            }
            arrayList.add((bp.b) objQ);
        }
        return null;
    }

    public float e() throws IOException {
        ArrayList arrayList = new ArrayList();
        ep.g gVar = new ep.g(this);
        for (Object objQ = gVar.Q(); objQ != null; objQ = gVar.Q()) {
            if (objQ instanceof ap.a) {
                return f((ap.a) objQ, arrayList);
            }
            arrayList.add((bp.b) objQ);
        }
        throw new IOException("Unexpected end of stream");
    }
}
