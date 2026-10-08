package o5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n5.f f142380a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n5.f f142383d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f142381b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f142382c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<p> f142384e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<m> f142385f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC3522b f142386g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f142387h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<m> f142388i = new ArrayList<>();

    public e(n5.f fVar) {
        this.f142380a = fVar;
        this.f142383d = fVar;
    }

    private void a(f fVar, int i15, int i16, f fVar2, ArrayList<m> arrayList, m mVar) {
        int i17;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.f142392d;
        if (pVar.f142443c == null) {
            n5.f fVar4 = this.f142380a;
            if (pVar == fVar4.f131847e || pVar == fVar4.f131849f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i16);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f142443c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f142448h.f142399k) {
                if (dVar instanceof f) {
                    i17 = i15;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i17, 0, fVar3, arrayList2, mVar2);
                } else {
                    i17 = i15;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i15 = i17;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i18 = i15;
            f fVar5 = fVar2;
            ArrayList<m> arrayList3 = arrayList;
            for (d dVar2 : pVar.f142449i.f142399k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i18, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i18 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f142424k.f142399k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i18, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f142448h.f142400l) {
                if (fVar6 == fVar5) {
                    mVar2.f142418b = true;
                }
                a(fVar6, i18, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f142449i.f142400l) {
                if (fVar7 == fVar5) {
                    mVar2.f142418b = true;
                }
                a(fVar7, i18, 1, fVar5, arrayList3, mVar2);
            }
            if (i18 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f142424k.f142400l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i18, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private boolean b(n5.f fVar) {
        n5.e.b bVar;
        int i15;
        char c15;
        n5.e.b bVar2;
        n5.e.b bVar3;
        n5.e.b bVar4;
        n5.e.b bVar5;
        for (n5.e eVar : fVar.L0) {
            n5.e.b[] bVarArr = eVar.Z;
            n5.e.b bVar6 = bVarArr[0];
            n5.e.b bVar7 = bVarArr[1];
            if (eVar.X() == 8) {
                eVar.f131839a = true;
            } else {
                if (eVar.B < 1.0f && bVar6 == n5.e.b.MATCH_CONSTRAINT) {
                    eVar.f131883w = 2;
                }
                if (eVar.E < 1.0f && bVar7 == n5.e.b.MATCH_CONSTRAINT) {
                    eVar.f131885x = 2;
                }
                if (eVar.v() > 0.0f) {
                    n5.e.b bVar8 = n5.e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == n5.e.b.WRAP_CONTENT || bVar7 == n5.e.b.FIXED)) {
                        eVar.f131883w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == n5.e.b.WRAP_CONTENT || bVar6 == n5.e.b.FIXED)) {
                        eVar.f131885x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f131883w == 0) {
                            eVar.f131883w = 3;
                        }
                        if (eVar.f131885x == 0) {
                            eVar.f131885x = 3;
                        }
                    }
                }
                n5.e.b bVar9 = n5.e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f131883w == 1 && (eVar.O.f131825f == null || eVar.Q.f131825f == null)) {
                    bVar6 = n5.e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar.f131885x == 1 && (eVar.P.f131825f == null || eVar.R.f131825f == null)) {
                    bVar7 = n5.e.b.WRAP_CONTENT;
                }
                l lVar = eVar.f131847e;
                lVar.f142444d = bVar6;
                int i16 = eVar.f131883w;
                lVar.f142441a = i16;
                n nVar = eVar.f131849f;
                nVar.f142444d = bVar7;
                int i17 = eVar.f131885x;
                nVar.f142441a = i17;
                n5.e.b bVar10 = n5.e.b.MATCH_PARENT;
                if ((bVar6 == bVar10 || bVar6 == n5.e.b.FIXED || bVar6 == n5.e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == n5.e.b.FIXED || bVar7 == n5.e.b.WRAP_CONTENT)) {
                    n5.e.b bVar11 = bVar7;
                    n5.e.b bVar12 = bVar6;
                    int iY = eVar.Y();
                    if (bVar12 == bVar10) {
                        iY = (fVar.Y() - eVar.O.f131826g) - eVar.Q.f131826g;
                        bVar12 = n5.e.b.FIXED;
                    }
                    int i18 = iY;
                    int iX = eVar.x();
                    if (bVar11 == bVar10) {
                        iX = (fVar.x() - eVar.P.f131826g) - eVar.R.f131826g;
                        bVar11 = n5.e.b.FIXED;
                    }
                    l(eVar, bVar12, i18, bVar11, iX);
                    eVar.f131847e.f142445e.d(eVar.Y());
                    eVar.f131849f.f142445e.d(eVar.x());
                    eVar.f131839a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        n5.e.b bVar13 = n5.e.b.WRAP_CONTENT;
                        c15 = 0;
                        if (bVar7 != bVar13 && bVar7 != n5.e.b.FIXED) {
                            bVar = bVar7;
                            i15 = 3;
                        } else if (i16 == 3) {
                            if (bVar7 == bVar13) {
                                l(eVar, bVar13, 0, bVar13, 0);
                            }
                            int iX2 = eVar.x();
                            int i19 = (int) ((iX2 * eVar.f131846d0) + 0.5f);
                            n5.e.b bVar14 = n5.e.b.FIXED;
                            l(eVar, bVar14, i19, bVar14, iX2);
                            eVar.f131847e.f142445e.d(eVar.Y());
                            eVar.f131849f.f142445e.d(eVar.x());
                            eVar.f131839a = true;
                        } else if (i16 == 1) {
                            l(eVar, bVar13, 0, bVar7, 0);
                            eVar.f131847e.f142445e.f142410m = eVar.Y();
                        } else {
                            bVar = bVar7;
                            i15 = 3;
                            if (i16 == 2) {
                                n5.e.b bVar15 = fVar.Z[0];
                                n5.e.b bVar16 = n5.e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(eVar, bVar16, (int) ((eVar.B * fVar.Y()) + 0.5f), bVar, eVar.x());
                                    eVar.f131847e.f142445e.d(eVar.Y());
                                    eVar.f131849f.f142445e.d(eVar.x());
                                    eVar.f131839a = true;
                                }
                            } else {
                                n5.d[] dVarArr = eVar.W;
                                if (dVarArr[0].f131825f == null || dVarArr[1].f131825f == null) {
                                    l(eVar, bVar13, 0, bVar, 0);
                                    eVar.f131847e.f142445e.d(eVar.Y());
                                    eVar.f131849f.f142445e.d(eVar.x());
                                    eVar.f131839a = true;
                                } else if (bVar == bVar2 || !(bVar6 == (bVar4 = n5.e.b.WRAP_CONTENT) || bVar6 == n5.e.b.FIXED)) {
                                    bVar3 = bVar6;
                                    if (bVar3 != bVar2 && bVar == bVar2) {
                                        if (i16 == 1 || i17 == 1) {
                                            n5.e.b bVar17 = n5.e.b.WRAP_CONTENT;
                                            l(eVar, bVar17, 0, bVar17, 0);
                                            eVar.f131847e.f142445e.f142410m = eVar.Y();
                                            eVar.f131849f.f142445e.f142410m = eVar.x();
                                        } else if (i17 == 2 && i16 == 2) {
                                            n5.e.b[] bVarArr2 = fVar.Z;
                                            n5.e.b bVar18 = bVarArr2[c15];
                                            n5.e.b bVar19 = n5.e.b.FIXED;
                                            if (bVar18 == bVar19 && bVarArr2[1] == bVar19) {
                                                l(eVar, bVar19, (int) ((eVar.B * fVar.Y()) + 0.5f), bVar19, (int) ((eVar.E * fVar.x()) + 0.5f));
                                                eVar.f131847e.f142445e.d(eVar.Y());
                                                eVar.f131849f.f142445e.d(eVar.x());
                                                eVar.f131839a = true;
                                            }
                                        }
                                    }
                                } else if (i17 == i15) {
                                    if (bVar6 == bVar4) {
                                        l(eVar, bVar4, 0, bVar4, 0);
                                    }
                                    int iY2 = eVar.Y();
                                    float f15 = eVar.f131846d0;
                                    if (eVar.w() == -1) {
                                        f15 = 1.0f / f15;
                                    }
                                    n5.e.b bVar20 = n5.e.b.FIXED;
                                    l(eVar, bVar20, iY2, bVar20, (int) ((iY2 * f15) + 0.5f));
                                    eVar.f131847e.f142445e.d(eVar.Y());
                                    eVar.f131849f.f142445e.d(eVar.x());
                                    eVar.f131839a = true;
                                } else if (i17 == 1) {
                                    l(eVar, bVar6, 0, bVar4, 0);
                                    eVar.f131849f.f142445e.f142410m = eVar.x();
                                } else {
                                    bVar3 = bVar6;
                                    if (i17 == 2) {
                                        n5.e.b bVar21 = fVar.Z[1];
                                        bVar5 = bVar;
                                        n5.e.b bVar22 = n5.e.b.FIXED;
                                        if (bVar21 == bVar22 || bVar21 == bVar10) {
                                            l(eVar, bVar3, eVar.Y(), bVar22, (int) ((eVar.E * fVar.x()) + 0.5f));
                                            eVar.f131847e.f142445e.d(eVar.Y());
                                            eVar.f131849f.f142445e.d(eVar.x());
                                            eVar.f131839a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    } else {
                                        bVar5 = bVar;
                                        n5.d[] dVarArr2 = eVar.W;
                                        if (dVarArr2[2].f131825f == null || dVarArr2[i15].f131825f == null) {
                                            l(eVar, bVar4, 0, bVar5, 0);
                                            eVar.f131847e.f142445e.d(eVar.Y());
                                            eVar.f131849f.f142445e.d(eVar.x());
                                            eVar.f131839a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i15 = 3;
                        c15 = 0;
                        bVar2 = bVar9;
                    }
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar6;
                    if (bVar3 != bVar2) {
                    }
                }
            }
        }
        return false;
    }

    private int e(n5.f fVar, int i15) {
        int size = this.f142388i.size();
        long jMax = 0;
        for (int i16 = 0; i16 < size; i16++) {
            jMax = Math.max(jMax, this.f142388i.get(i16).b(fVar, i15));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i15, ArrayList<m> arrayList) {
        for (d dVar : pVar.f142448h.f142399k) {
            if (dVar instanceof f) {
                a((f) dVar, i15, 0, pVar.f142449i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f142448h, i15, 0, pVar.f142449i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f142449i.f142399k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i15, 1, pVar.f142448h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f142449i, i15, 1, pVar.f142448h, arrayList, null);
            }
        }
        int i16 = i15;
        if (i16 == 1) {
            for (d dVar3 : ((n) pVar).f142424k.f142399k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i16, 2, null, arrayList, null);
                }
                i16 = i15;
            }
        }
    }

    private void l(n5.e eVar, n5.e.b bVar, int i15, n5.e.b bVar2, int i16) {
        b.a aVar = this.f142387h;
        aVar.f142368a = bVar;
        aVar.f142369b = bVar2;
        aVar.f142370c = i15;
        aVar.f142371d = i16;
        this.f142386g.b(eVar, aVar);
        eVar.n1(this.f142387h.f142372e);
        eVar.O0(this.f142387h.f142373f);
        eVar.N0(this.f142387h.f142375h);
        eVar.D0(this.f142387h.f142374g);
    }

    public void c() {
        d(this.f142384e);
        this.f142388i.clear();
        m.f142416h = 0;
        i(this.f142380a.f131847e, 0, this.f142388i);
        i(this.f142380a.f131849f, 1, this.f142388i);
        this.f142381b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f142383d.f131847e.f();
        this.f142383d.f131849f.f();
        arrayList.add(this.f142383d.f131847e);
        arrayList.add(this.f142383d.f131849f);
        HashSet hashSet = null;
        for (n5.e eVar : this.f142383d.L0) {
            if (eVar instanceof n5.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.k0()) {
                    if (eVar.f131843c == null) {
                        eVar.f131843c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f131843c);
                } else {
                    arrayList.add(eVar.f131847e);
                }
                if (eVar.m0()) {
                    if (eVar.f131845d == null) {
                        eVar.f131845d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f131845d);
                } else {
                    arrayList.add(eVar.f131849f);
                }
                if (eVar instanceof n5.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (p pVar : arrayList) {
            if (pVar.f142442b != this.f142383d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z15) {
        boolean z16;
        boolean z17 = false;
        if (this.f142381b || this.f142382c) {
            for (n5.e eVar : this.f142380a.L0) {
                eVar.n();
                eVar.f131839a = false;
                eVar.f131847e.r();
                eVar.f131849f.q();
            }
            this.f142380a.n();
            n5.f fVar = this.f142380a;
            fVar.f131839a = false;
            fVar.f131847e.r();
            this.f142380a.f131849f.q();
            this.f142382c = false;
        }
        if (b(this.f142383d)) {
            return false;
        }
        this.f142380a.p1(0);
        this.f142380a.q1(0);
        n5.e.b bVarU = this.f142380a.u(0);
        n5.e.b bVarU2 = this.f142380a.u(1);
        if (this.f142381b) {
            c();
        }
        int iZ = this.f142380a.Z();
        int iA0 = this.f142380a.a0();
        this.f142380a.f131847e.f142448h.d(iZ);
        this.f142380a.f131849f.f142448h.d(iA0);
        m();
        n5.e.b bVar = n5.e.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z15) {
                Iterator<p> it = this.f142384e.iterator();
                while (it.hasNext()) {
                    if (!it.next().m()) {
                        z15 = false;
                        break;
                    }
                }
            }
            if (z15 && bVarU == n5.e.b.WRAP_CONTENT) {
                this.f142380a.S0(n5.e.b.FIXED);
                n5.f fVar2 = this.f142380a;
                fVar2.n1(e(fVar2, 0));
                n5.f fVar3 = this.f142380a;
                fVar3.f131847e.f142445e.d(fVar3.Y());
            }
            if (z15 && bVarU2 == n5.e.b.WRAP_CONTENT) {
                this.f142380a.j1(n5.e.b.FIXED);
                n5.f fVar4 = this.f142380a;
                fVar4.O0(e(fVar4, 1));
                n5.f fVar5 = this.f142380a;
                fVar5.f131849f.f142445e.d(fVar5.x());
            }
        }
        n5.f fVar6 = this.f142380a;
        n5.e.b bVar2 = fVar6.Z[0];
        n5.e.b bVar3 = n5.e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == n5.e.b.MATCH_PARENT) {
            int iY = fVar6.Y() + iZ;
            this.f142380a.f131847e.f142449i.d(iY);
            this.f142380a.f131847e.f142445e.d(iY - iZ);
            m();
            n5.f fVar7 = this.f142380a;
            n5.e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == n5.e.b.MATCH_PARENT) {
                int iX = fVar7.x() + iA0;
                this.f142380a.f131849f.f142449i.d(iX);
                this.f142380a.f131849f.f142445e.d(iX - iA0);
            }
            m();
            z16 = true;
        } else {
            z16 = false;
        }
        for (p pVar : this.f142384e) {
            if (pVar.f142442b != this.f142380a || pVar.f142447g) {
                pVar.e();
            }
        }
        for (p pVar2 : this.f142384e) {
            if (z16 || pVar2.f142442b != this.f142380a) {
                if (!pVar2.f142448h.f142398j || ((!pVar2.f142449i.f142398j && !(pVar2 instanceof j)) || (!pVar2.f142445e.f142398j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    this.f142380a.S0(bVarU);
                    this.f142380a.j1(bVarU2);
                    return z17;
                }
            }
        }
        z17 = true;
        this.f142380a.S0(bVarU);
        this.f142380a.j1(bVarU2);
        return z17;
    }

    public boolean g(boolean z15) {
        if (this.f142381b) {
            for (n5.e eVar : this.f142380a.L0) {
                eVar.n();
                eVar.f131839a = false;
                l lVar = eVar.f131847e;
                lVar.f142445e.f142398j = false;
                lVar.f142447g = false;
                lVar.r();
                n nVar = eVar.f131849f;
                nVar.f142445e.f142398j = false;
                nVar.f142447g = false;
                nVar.q();
            }
            this.f142380a.n();
            n5.f fVar = this.f142380a;
            fVar.f131839a = false;
            l lVar2 = fVar.f131847e;
            lVar2.f142445e.f142398j = false;
            lVar2.f142447g = false;
            lVar2.r();
            n nVar2 = this.f142380a.f131849f;
            nVar2.f142445e.f142398j = false;
            nVar2.f142447g = false;
            nVar2.q();
            c();
        }
        if (b(this.f142383d)) {
            return false;
        }
        this.f142380a.p1(0);
        this.f142380a.q1(0);
        this.f142380a.f131847e.f142448h.d(0);
        this.f142380a.f131849f.f142448h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    public boolean h(boolean z15, int i15) {
        boolean z16;
        n5.e.b bVar;
        boolean z17 = false;
        n5.e.b bVarU = this.f142380a.u(0);
        n5.e.b bVarU2 = this.f142380a.u(1);
        int iZ = this.f142380a.Z();
        int iA0 = this.f142380a.a0();
        if (z15 && (bVarU == (bVar = n5.e.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            for (p pVar : this.f142384e) {
                if (pVar.f142446f == i15 && !pVar.m()) {
                    z15 = false;
                    break;
                }
            }
            if (i15 == 0) {
                if (z15 && bVarU == n5.e.b.WRAP_CONTENT) {
                    this.f142380a.S0(n5.e.b.FIXED);
                    n5.f fVar = this.f142380a;
                    fVar.n1(e(fVar, 0));
                    n5.f fVar2 = this.f142380a;
                    fVar2.f131847e.f142445e.d(fVar2.Y());
                }
            } else if (z15 && bVarU2 == n5.e.b.WRAP_CONTENT) {
                this.f142380a.j1(n5.e.b.FIXED);
                n5.f fVar3 = this.f142380a;
                fVar3.O0(e(fVar3, 1));
                n5.f fVar4 = this.f142380a;
                fVar4.f131849f.f142445e.d(fVar4.x());
            }
        }
        if (i15 == 0) {
            n5.f fVar5 = this.f142380a;
            n5.e.b bVar2 = fVar5.Z[0];
            if (bVar2 == n5.e.b.FIXED || bVar2 == n5.e.b.MATCH_PARENT) {
                int iY = fVar5.Y() + iZ;
                this.f142380a.f131847e.f142449i.d(iY);
                this.f142380a.f131847e.f142445e.d(iY - iZ);
                z16 = true;
            } else {
                z16 = false;
            }
        } else {
            n5.f fVar6 = this.f142380a;
            n5.e.b bVar3 = fVar6.Z[1];
            if (bVar3 == n5.e.b.FIXED || bVar3 == n5.e.b.MATCH_PARENT) {
                int iX = fVar6.x() + iA0;
                this.f142380a.f131849f.f142449i.d(iX);
                this.f142380a.f131849f.f142445e.d(iX - iA0);
                z16 = true;
            } else {
                z16 = false;
            }
        }
        m();
        for (p pVar2 : this.f142384e) {
            if (pVar2.f142446f == i15 && (pVar2.f142442b != this.f142380a || pVar2.f142447g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : this.f142384e) {
            if (pVar3.f142446f == i15 && (z16 || pVar3.f142442b != this.f142380a)) {
                if (!pVar3.f142448h.f142398j || !pVar3.f142449i.f142398j || (!(pVar3 instanceof c) && !pVar3.f142445e.f142398j)) {
                    this.f142380a.S0(bVarU);
                    this.f142380a.j1(bVarU2);
                    return z17;
                }
            }
        }
        z17 = true;
        this.f142380a.S0(bVarU);
        this.f142380a.j1(bVarU2);
        return z17;
    }

    public void j() {
        this.f142381b = true;
    }

    public void k() {
        this.f142382c = true;
    }

    public void m() {
        g gVar;
        for (n5.e eVar : this.f142380a.L0) {
            if (!eVar.f131839a) {
                n5.e.b[] bVarArr = eVar.Z;
                boolean z15 = false;
                n5.e.b bVar = bVarArr[0];
                n5.e.b bVar2 = bVarArr[1];
                int i15 = eVar.f131883w;
                int i16 = eVar.f131885x;
                n5.e.b bVar3 = n5.e.b.WRAP_CONTENT;
                boolean z16 = bVar == bVar3 || (bVar == n5.e.b.MATCH_CONSTRAINT && i15 == 1);
                if (bVar2 == bVar3 || (bVar2 == n5.e.b.MATCH_CONSTRAINT && i16 == 1)) {
                    z15 = true;
                }
                g gVar2 = eVar.f131847e.f142445e;
                boolean z17 = gVar2.f142398j;
                g gVar3 = eVar.f131849f.f142445e;
                boolean z18 = gVar3.f142398j;
                if (z17 && z18) {
                    n5.e.b bVar4 = n5.e.b.FIXED;
                    l(eVar, bVar4, gVar2.f142395g, bVar4, gVar3.f142395g);
                    eVar.f131839a = true;
                } else if (z17 && z15) {
                    l(eVar, n5.e.b.FIXED, gVar2.f142395g, bVar3, gVar3.f142395g);
                    if (bVar2 == n5.e.b.MATCH_CONSTRAINT) {
                        eVar.f131849f.f142445e.f142410m = eVar.x();
                    } else {
                        eVar.f131849f.f142445e.d(eVar.x());
                        eVar.f131839a = true;
                    }
                } else if (z18 && z16) {
                    l(eVar, bVar3, gVar2.f142395g, n5.e.b.FIXED, gVar3.f142395g);
                    if (bVar == n5.e.b.MATCH_CONSTRAINT) {
                        eVar.f131847e.f142445e.f142410m = eVar.Y();
                    } else {
                        eVar.f131847e.f142445e.d(eVar.Y());
                        eVar.f131839a = true;
                    }
                }
                if (eVar.f131839a && (gVar = eVar.f131849f.f142425l) != null) {
                    gVar.d(eVar.p());
                }
            }
        }
    }

    public void n(b.InterfaceC3522b interfaceC3522b) {
        this.f142386g = interfaceC3522b;
    }
}
