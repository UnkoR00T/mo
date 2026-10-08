package rd;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173169a = sd.c.a.a("k", "x", "y");

    public static nd.e a(sd.c cVar, fd.f fVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.y() == sd.c.b.BEGIN_ARRAY) {
            cVar.h();
            while (cVar.p()) {
                arrayList.add(z.a(cVar, fVar));
            }
            cVar.m();
            u.b(arrayList);
        } else {
            arrayList.add(new ud.a(s.e(cVar, td.m.e())));
        }
        return new nd.e(arrayList);
    }

    static nd.o<PointF, PointF> b(sd.c cVar, fd.f fVar) {
        cVar.Y();
        nd.e eVarA = null;
        nd.b bVarE = null;
        boolean z15 = false;
        nd.b bVarE2 = null;
        while (cVar.y() != sd.c.b.END_OBJECT) {
            int iE = cVar.E(f173169a);
            if (iE == 0) {
                eVarA = a(cVar, fVar);
            } else if (iE != 1) {
                if (iE != 2) {
                    cVar.H();
                    cVar.G0();
                } else if (cVar.y() == sd.c.b.STRING) {
                    cVar.G0();
                    z15 = true;
                } else {
                    bVarE = d.e(cVar, fVar);
                }
            } else if (cVar.y() == sd.c.b.STRING) {
                cVar.G0();
                z15 = true;
            } else {
                bVarE2 = d.e(cVar, fVar);
            }
        }
        cVar.h0();
        if (z15) {
            fVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new nd.i(bVarE2, bVarE);
    }
}
