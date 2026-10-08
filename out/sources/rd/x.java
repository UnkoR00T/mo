package rd;

/* JADX INFO: loaded from: classes3.dex */
class x {
    static od.i a(sd.c cVar, fd.f fVar) {
        cVar.Y();
        od.i.a aVar = null;
        nd.h hVarK = null;
        nd.d dVarH = null;
        boolean zR = false;
        while (cVar.p()) {
            String strH1 = cVar.h1();
            strH1.getClass();
            switch (strH1) {
                case "o":
                    dVarH = d.h(cVar, fVar);
                    break;
                case "pt":
                    hVarK = d.k(cVar, fVar);
                    break;
                case "inv":
                    zR = cVar.r();
                    break;
                case "mode":
                    String strQ2 = cVar.q2();
                    strQ2.getClass();
                    switch (strQ2) {
                        case "a":
                            aVar = od.i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            fVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = od.i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = od.i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = od.i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            td.e.c("Unknown mask mode " + strH1 + ". Defaulting to Add.");
                            aVar = od.i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    cVar.G0();
                    break;
            }
        }
        cVar.h0();
        return new od.i(aVar, hVarK, dVarH, zR);
    }
}
