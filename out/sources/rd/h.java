package rd;

/* JADX INFO: loaded from: classes3.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173186a = sd.c.a.a("ty", "d");

    static od.c a(sd.c cVar, fd.f fVar) {
        od.c cVarA;
        String strQ2;
        cVar.Y();
        byte b15 = 2;
        int iNextInt = 2;
        while (true) {
            cVarA = null;
            if (!cVar.p()) {
                strQ2 = null;
                break;
            }
            int iE = cVar.E(f173186a);
            if (iE == 0) {
                strQ2 = cVar.q2();
                break;
            }
            if (iE != 1) {
                cVar.H();
                cVar.G0();
            } else {
                iNextInt = cVar.nextInt();
            }
        }
        if (strQ2 == null) {
            return null;
        }
        switch (strQ2.hashCode()) {
            case 3239:
                b15 = !strQ2.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b15 = !strQ2.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strQ2.equals("gf")) {
                    b15 = -1;
                }
                break;
            case 3307:
                b15 = !strQ2.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b15 = !strQ2.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b15 = !strQ2.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b15 = !strQ2.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b15 = !strQ2.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b15 = !strQ2.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b15 = !strQ2.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b15 = !strQ2.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b15 = !strQ2.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b15 = !strQ2.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b15 = !strQ2.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b15 = -1;
                break;
        }
        switch (b15) {
            case 0:
                cVarA = f.a(cVar, fVar, iNextInt);
                break;
            case 1:
                cVarA = i0.a(cVar, fVar);
                break;
            case 2:
                cVarA = p.a(cVar, fVar);
                break;
            case 3:
                cVarA = j0.a(cVar, fVar);
                break;
            case 4:
                cVarA = q.a(cVar, fVar);
                break;
            case 5:
                cVarA = y.a(cVar);
                fVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVarA = d0.a(cVar, fVar);
                break;
            case 7:
                cVarA = f0.a(cVar, fVar);
                break;
            case 8:
                cVarA = e0.a(cVar, fVar);
                break;
            case 9:
                cVarA = k0.a(cVar, fVar);
                break;
            case 10:
                cVarA = c0.a(cVar, fVar, iNextInt);
                break;
            case 11:
                cVarA = l0.a(cVar, fVar);
                break;
            case 12:
                cVarA = m0.a(cVar, fVar);
                break;
            case 13:
                cVarA = c.h(cVar, fVar);
                break;
            default:
                td.e.c("Unknown shape type " + strQ2);
                break;
        }
        while (cVar.p()) {
            cVar.G0();
        }
        cVar.h0();
        return cVarA;
    }
}
