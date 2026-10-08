package rd;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173227a = sd.c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173228b = sd.c.a.a("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final sd.c.a f173229c = sd.c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f173230a;

        static {
            int[] iArr = new int[pd.e.b.values().length];
            f173230a = iArr;
            try {
                iArr[pd.e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f173230a[pd.e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static pd.e a(fd.f fVar) {
        Rect rectB = fVar.b();
        List list = Collections.EMPTY_LIST;
        return new pd.e(list, fVar, "__container", -1L, pd.e.a.PRE_COMP, -1L, null, list, new nd.n(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, pd.e.b.NONE, null, false, null, null, od.h.NORMAL);
    }

    public static pd.e b(sd.c cVar, fd.f fVar) {
        float f15;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        pd.e.b bVar = pd.e.b.NONE;
        od.h hVar = od.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.Y();
        boolean z15 = false;
        pd.e.b bVar2 = bVar;
        od.h hVar2 = hVar;
        float fNextDouble = 0.0f;
        float f16 = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strQ2 = null;
        nd.j jVarD = null;
        nd.k kVarA = null;
        nd.b bVarF = null;
        od.a aVarB = null;
        j jVarB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zR = false;
        long jNextInt2 = -1;
        float fNextDouble5 = 1.0f;
        String strQ3 = "UNSET";
        String strQ4 = null;
        nd.n nVar = null;
        pd.e.a aVar = null;
        boolean z16 = false;
        while (cVar.p()) {
            switch (cVar.E(f173227a)) {
                case 0:
                    strQ3 = cVar.q2();
                    z15 = false;
                    break;
                case 1:
                    jNextInt = cVar.nextInt();
                    z15 = false;
                    break;
                case 2:
                    strQ2 = cVar.q2();
                    z15 = false;
                    break;
                case 3:
                    f15 = fNextDouble5;
                    int iNextInt3 = cVar.nextInt();
                    aVar = pd.e.a.UNKNOWN;
                    if (iNextInt3 < aVar.ordinal()) {
                        aVar = pd.e.a.values()[iNextInt3];
                    }
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 4:
                    jNextInt2 = cVar.nextInt();
                    z15 = false;
                    break;
                case 5:
                    iNextInt = (int) (cVar.nextInt() * td.m.e());
                    z15 = false;
                    break;
                case 6:
                    iNextInt2 = (int) (cVar.nextInt() * td.m.e());
                    z15 = false;
                    break;
                case 7:
                    color = Color.parseColor(cVar.q2());
                    z15 = false;
                    break;
                case 8:
                    nVar = c.h(cVar, fVar);
                    z15 = false;
                    break;
                case 9:
                    f15 = fNextDouble5;
                    int iNextInt4 = cVar.nextInt();
                    if (iNextInt4 >= pd.e.b.values().length) {
                        fVar.a("Unsupported matte type: " + iNextInt4);
                    } else {
                        bVar2 = pd.e.b.values()[iNextInt4];
                        int i15 = a.f173230a[bVar2.ordinal()];
                        if (i15 == 1) {
                            fVar.a("Unsupported matte type: Luma");
                        } else if (i15 == 2) {
                            fVar.a("Unsupported matte type: Luma Inverted");
                        }
                        fVar.s(1);
                    }
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 10:
                    f15 = fNextDouble5;
                    cVar.h();
                    while (cVar.p()) {
                        arrayList.add(x.a(cVar, fVar));
                    }
                    fVar.s(arrayList.size());
                    cVar.m();
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 11:
                    f15 = fNextDouble5;
                    cVar.h();
                    while (cVar.p()) {
                        od.c cVarA = h.a(cVar, fVar);
                        if (cVarA != null) {
                            arrayList2.add(cVarA);
                        }
                    }
                    cVar.m();
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 12:
                    f15 = fNextDouble5;
                    cVar.Y();
                    while (cVar.p()) {
                        int iE = cVar.E(f173228b);
                        if (iE == 0) {
                            jVarD = d.d(cVar, fVar);
                        } else if (iE != 1) {
                            cVar.H();
                            cVar.G0();
                        } else {
                            cVar.h();
                            if (cVar.p()) {
                                kVarA = b.a(cVar, fVar);
                            }
                            while (cVar.p()) {
                                cVar.G0();
                            }
                            cVar.m();
                        }
                    }
                    cVar.h0();
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 13:
                    f15 = fNextDouble5;
                    cVar.h();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.p()) {
                        cVar.Y();
                        while (cVar.p()) {
                            int iE2 = cVar.E(f173229c);
                            if (iE2 == 0) {
                                int iNextInt5 = cVar.nextInt();
                                if (iNextInt5 == 29) {
                                    aVarB = e.b(cVar, fVar);
                                } else if (iNextInt5 == 25) {
                                    jVarB = new k().b(cVar, fVar);
                                }
                            } else if (iE2 != 1) {
                                cVar.H();
                                cVar.G0();
                            } else {
                                arrayList3.add(cVar.q2());
                            }
                        }
                        cVar.h0();
                    }
                    cVar.m();
                    fVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 14:
                    fNextDouble5 = (float) cVar.nextDouble();
                    z15 = false;
                    break;
                case 15:
                    fNextDouble4 = (float) cVar.nextDouble();
                    z15 = false;
                    break;
                case 16:
                    f15 = fNextDouble5;
                    fNextDouble2 = (float) (cVar.nextDouble() * ((double) td.m.e()));
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 17:
                    f15 = fNextDouble5;
                    fNextDouble3 = (float) (cVar.nextDouble() * ((double) td.m.e()));
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
                case 18:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 19:
                    f16 = (float) cVar.nextDouble();
                    break;
                case 20:
                    bVarF = d.f(cVar, fVar, z15);
                    break;
                case 21:
                    strQ4 = cVar.q2();
                    break;
                case 22:
                    zR = cVar.r();
                    break;
                case 23:
                    z16 = cVar.nextInt() != 1 ? z15 : true;
                    break;
                case 24:
                    int iNextInt6 = cVar.nextInt();
                    if (iNextInt6 < od.h.values().length) {
                        hVar2 = od.h.values()[iNextInt6];
                    } else {
                        fVar.a("Unsupported Blend Mode: " + iNextInt6);
                        hVar2 = od.h.NORMAL;
                    }
                    break;
                default:
                    cVar.H();
                    cVar.G0();
                    f15 = fNextDouble5;
                    fNextDouble5 = f15;
                    z15 = false;
                    break;
            }
        }
        float f17 = fNextDouble5;
        cVar.h0();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new ud.a(fVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (f16 <= 0.0f) {
            f16 = fVar.f();
        }
        arrayList4.add(new ud.a(fVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(f16)));
        arrayList4.add(new ud.a(fVar, fValueOf, fValueOf, null, f16, Float.valueOf(Float.MAX_VALUE)));
        if (strQ3.endsWith(".ai") || "ai".equals(strQ4)) {
            fVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z16 != 0) {
            if (nVar == null) {
                nVar = new nd.n();
            }
            nVar.p(z16);
        }
        return new pd.e(arrayList2, fVar, strQ3, jNextInt, aVar, jNextInt2, strQ2, arrayList, nVar, iNextInt, iNextInt2, color, f17, fNextDouble4, fNextDouble2, fNextDouble3, jVarD, kVarA, arrayList4, bVar2, bVarF, zR, aVarB, jVarB, hVar2);
    }
}
