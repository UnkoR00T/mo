package op;

import bp.i;
import bp.l;
import gp.h;
import io.sentry.android.core.c2;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected bp.a f148059a;

    public static b a(bp.b bVar, h hVar) {
        return b(bVar, hVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    public static b b(bp.b bVar, h hVar, boolean z15) throws IOException {
        i iVar;
        if (bVar instanceof l) {
            return c((l) bVar, hVar);
        }
        if (bVar instanceof i) {
            i iVar2 = (i) bVar;
            if (hVar != null) {
                if (iVar2.equals(i.f20834p2)) {
                    iVar = i.f20735f2;
                    if (!hVar.o(iVar)) {
                        if (iVar2.equals(i.f20867s2)) {
                            iVar = i.f20765i2;
                            if (!hVar.o(iVar)) {
                                if (iVar2.equals(i.f20845q2)) {
                                    iVar = i.f20756h2;
                                    if (!hVar.o(iVar)) {
                                        iVar = null;
                                    }
                                } else {
                                    iVar = null;
                                }
                            }
                        } else if (iVar2.equals(i.f20845q2)) {
                            iVar = i.f20756h2;
                            if (!hVar.o(iVar)) {
                                iVar = null;
                            }
                        } else {
                            iVar = null;
                        }
                    }
                } else if (iVar2.equals(i.f20867s2)) {
                    iVar = i.f20765i2;
                    if (!hVar.o(iVar)) {
                        if (iVar2.equals(i.f20845q2)) {
                            iVar = i.f20756h2;
                            if (!hVar.o(iVar)) {
                                iVar = null;
                            }
                        } else {
                            iVar = null;
                        }
                    }
                } else if (iVar2.equals(i.f20845q2)) {
                    iVar = i.f20756h2;
                    if (!hVar.o(iVar)) {
                        iVar = null;
                    }
                } else {
                    iVar = null;
                }
                if (hVar.o(iVar) && !z15) {
                    return hVar.i(iVar, true);
                }
            }
            if (iVar2 == i.f20834p2) {
                c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar2 + ". Will try DeviceRGB instead");
                return e.f148062c;
            }
            if (iVar2 == i.f20867s2) {
                return e.f148062c;
            }
            if (iVar2 == i.f20845q2) {
                return d.f148060c;
            }
            if (iVar2 == i.O6) {
                c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar2 + ". Will try DeviceRGB instead");
                return e.f148062c;
            }
            if (hVar == null) {
                throw new gp.b("Unknown color space: " + iVar2.A3());
            }
            if (hVar.o(iVar2)) {
                return hVar.h(iVar2);
            }
            throw new gp.b("Missing color space: " + iVar2.A3());
        }
        if (!(bVar instanceof bp.a)) {
            if (bVar instanceof bp.d) {
                bp.d dVar = (bp.d) bVar;
                i iVar3 = i.I1;
                if (dVar.J3(iVar3)) {
                    bp.b bVarP4 = dVar.p4(iVar3);
                    if (bVarP4 != bVar) {
                        return b(bVarP4, hVar, z15);
                    }
                    throw new IOException("Recursion in colorspace: " + dVar.C4(iVar3) + " points to itself");
                }
            }
            throw new IOException("Expected a name or array but got: " + bVar);
        }
        bp.a aVar = (bp.a) bVar;
        if (aVar.size() == 0) {
            throw new IOException("Colorspace array is empty");
        }
        bp.b bVarK4 = aVar.k4(0);
        if (!(bVarK4 instanceof i)) {
            throw new IOException("First element in colorspace array must be a name");
        }
        i iVar4 = (i) bVarK4;
        if (iVar4 == i.V0) {
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.W0) {
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.f20856r2) {
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.f20945z4) {
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.P7) {
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.f20817n4) {
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.S4) {
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.O6) {
            aVar.size();
            c2.e("PdfBox-Android", "Unsupported color space kind: " + iVar4 + ". Will try DeviceRGB instead");
            return e.f148062c;
        }
        if (iVar4 == i.f20834p2 || iVar4 == i.f20867s2 || iVar4 == i.f20845q2) {
            return b(iVar4, hVar, z15);
        }
        throw new IOException("Invalid color space kind: " + iVar4);
    }

    private static b c(l lVar, h hVar) {
        b bVarC;
        if (hVar != null && hVar.n() != null && (bVarC = hVar.n().c(lVar)) != null) {
            return bVarC;
        }
        b bVarA = a(lVar.X3(), hVar);
        if (hVar != null && hVar.n() != null && bVarA != null) {
            hVar.n().b(lVar, bVarA);
        }
        return bVarA;
    }

    @Override // hp.c
    public bp.b D1() {
        return this.f148059a;
    }

    public abstract String d();

    public abstract int e();
}
