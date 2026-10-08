package o5;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<p> f142378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f142379l;

    public c(n5.e eVar, int i15) {
        super(eVar);
        this.f142378k = new ArrayList<>();
        this.f142446f = i15;
        q();
    }

    private void q() {
        n5.e eVar;
        n5.e eVar2 = this.f142442b;
        n5.e eVarM = eVar2.M(this.f142446f);
        while (true) {
            n5.e eVar3 = eVarM;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarM = eVar2.M(this.f142446f);
            }
        }
        this.f142442b = eVar;
        this.f142378k.add(eVar.O(this.f142446f));
        n5.e eVarK = eVar.K(this.f142446f);
        while (eVarK != null) {
            this.f142378k.add(eVarK.O(this.f142446f));
            eVarK = eVarK.K(this.f142446f);
        }
        for (p pVar : this.f142378k) {
            int i15 = this.f142446f;
            if (i15 == 0) {
                pVar.f142442b.f131843c = this;
            } else if (i15 == 1) {
                pVar.f142442b.f131845d = this;
            }
        }
        if (this.f142446f == 0 && ((n5.f) this.f142442b.L()).U1() && this.f142378k.size() > 1) {
            ArrayList<p> arrayList = this.f142378k;
            this.f142442b = arrayList.get(arrayList.size() - 1).f142442b;
        }
        this.f142379l = this.f142446f == 0 ? this.f142442b.z() : this.f142442b.U();
    }

    private n5.e r() {
        for (int i15 = 0; i15 < this.f142378k.size(); i15++) {
            p pVar = this.f142378k.get(i15);
            if (pVar.f142442b.X() != 8) {
                return pVar.f142442b;
            }
        }
        return null;
    }

    private n5.e s() {
        for (int size = this.f142378k.size() - 1; size >= 0; size--) {
            p pVar = this.f142378k.get(size);
            if (pVar.f142442b.X() != 8) {
                return pVar.f142442b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // o5.p, o5.d
    public void a(d dVar) {
        int i15;
        int i16;
        boolean z15;
        float f15;
        float f16;
        int i17;
        int i18;
        int i19;
        int i25;
        float f17;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z16;
        if (this.f142448h.f142398j && this.f142449i.f142398j) {
            n5.e eVarL = this.f142442b.L();
            boolean zU1 = eVarL instanceof n5.f ? ((n5.f) eVarL).U1() : false;
            int i35 = this.f142449i.f142395g - this.f142448h.f142395g;
            int size = this.f142378k.size();
            int i36 = 0;
            while (true) {
                i15 = -1;
                i16 = 8;
                if (i36 >= size) {
                    i36 = -1;
                    break;
                } else if (this.f142378k.get(i36).f142442b.X() != 8) {
                    break;
                } else {
                    i36++;
                }
            }
            int i37 = size - 1;
            for (int i38 = i37; i38 >= 0; i38--) {
                if (this.f142378k.get(i38).f142442b.X() != 8) {
                    i15 = i38;
                    break;
                }
            }
            int i39 = 0;
            while (true) {
                if (i39 >= 2) {
                    z15 = zU1;
                    f15 = 0.0f;
                    f16 = 0.0f;
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    break;
                }
                int i45 = 0;
                i18 = 0;
                i19 = 0;
                int i46 = 0;
                f16 = 0.0f;
                while (i45 < size) {
                    p pVar = this.f142378k.get(i45);
                    if (pVar.f142442b.X() == i16) {
                        z16 = zU1;
                    } else {
                        i46++;
                        if (i45 > 0 && i45 >= i36) {
                            i18 += pVar.f142448h.f142394f;
                        }
                        g gVar = pVar.f142445e;
                        int i47 = gVar.f142395g;
                        boolean z17 = pVar.f142444d != n5.e.b.MATCH_CONSTRAINT;
                        if (z17) {
                            int i48 = this.f142446f;
                            if (i48 == 0 && !pVar.f142442b.f131847e.f142445e.f142398j) {
                                return;
                            }
                            if (i48 == 1 && !pVar.f142442b.f131849f.f142445e.f142398j) {
                                return;
                            } else {
                                z16 = zU1;
                            }
                        } else {
                            z16 = zU1;
                            if (pVar.f142441a == 1 && i39 == 0) {
                                i47 = gVar.f142410m;
                                i19++;
                            } else if (gVar.f142398j) {
                            }
                            z17 = true;
                        }
                        if (z17) {
                            i18 += i47;
                        } else {
                            i19++;
                            float f18 = pVar.f142442b.D0[this.f142446f];
                            if (f18 >= 0.0f) {
                                f16 += f18;
                            }
                        }
                        if (i45 < i37 && i45 < i15) {
                            i18 += -pVar.f142449i.f142394f;
                        }
                    }
                    i45++;
                    zU1 = z16;
                    i16 = 8;
                }
                z15 = zU1;
                f15 = 0.0f;
                if (i18 < i35 || i19 == 0) {
                    i17 = i46;
                    break;
                } else {
                    i39++;
                    zU1 = z15;
                    i16 = 8;
                }
            }
            int i49 = this.f142448h.f142395g;
            if (z15) {
                i49 = this.f142449i.f142395g;
            }
            float f19 = 0.5f;
            if (i18 > i35) {
                i49 = z15 ? i49 + ((int) (((i18 - i35) / 2.0f) + 0.5f)) : i49 - ((int) (((i18 - i35) / 2.0f) + 0.5f));
            }
            if (i19 > 0) {
                float f25 = i35 - i18;
                int i55 = (int) ((f25 / i19) + 0.5f);
                int i56 = 0;
                int i57 = 0;
                while (i56 < size) {
                    p pVar2 = this.f142378k.get(i56);
                    float f26 = f19;
                    int i58 = i49;
                    if (pVar2.f142442b.X() != 8 && pVar2.f142444d == n5.e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f142445e;
                        if (gVar2.f142398j) {
                            i55 = i55;
                            i57 = i57;
                        } else {
                            int i59 = f16 > f15 ? (int) (((pVar2.f142442b.D0[this.f142446f] * f25) / f16) + f26) : i55;
                            if (this.f142446f == 0) {
                                n5.e eVar = pVar2.f142442b;
                                i28 = eVar.A;
                                i29 = eVar.f131889z;
                            } else {
                                n5.e eVar2 = pVar2.f142442b;
                                i28 = eVar2.D;
                                i29 = eVar2.C;
                            }
                            int i65 = i57;
                            int iMax = Math.max(i29, pVar2.f142441a == 1 ? Math.min(i59, gVar2.f142410m) : i59);
                            if (i28 > 0) {
                                iMax = Math.min(i28, iMax);
                            }
                            if (iMax != i59) {
                                i57 = i65 + 1;
                                i59 = iMax;
                            } else {
                                i57 = i65;
                            }
                            pVar2.f142445e.d(i59);
                        }
                    } else {
                        i55 = i55;
                        i57 = i57;
                    }
                    i56++;
                    f19 = f26;
                    i49 = i58;
                    f25 = f25;
                    i55 = i55;
                }
                i25 = i49;
                f17 = f19;
                int i66 = i57;
                if (i66 > 0) {
                    i19 -= i66;
                    i18 = 0;
                    for (int i67 = 0; i67 < size; i67++) {
                        p pVar3 = this.f142378k.get(i67);
                        if (pVar3.f142442b.X() != 8) {
                            if (i67 > 0 && i67 >= i36) {
                                i18 += pVar3.f142448h.f142394f;
                            }
                            i18 += pVar3.f142445e.f142395g;
                            if (i67 < i37 && i67 < i15) {
                                i18 += -pVar3.f142449i.f142394f;
                            }
                        }
                    }
                }
                i27 = 2;
                if (this.f142379l == 2 && i66 == 0) {
                    i26 = 0;
                    this.f142379l = 0;
                } else {
                    i26 = 0;
                }
            } else {
                i25 = i49;
                f17 = 0.5f;
                i26 = 0;
                i27 = 2;
            }
            if (i18 > i35) {
                this.f142379l = i27;
            }
            if (i17 > 0 && i19 == 0 && i36 == i15) {
                this.f142379l = i27;
            }
            int i68 = this.f142379l;
            if (i68 == 1) {
                int i69 = i17 > 1 ? (i35 - i18) / (i17 - 1) : i17 == 1 ? (i35 - i18) / 2 : i26;
                if (i19 > 0) {
                    i69 = i26;
                }
                int i75 = i25;
                while (i26 < size) {
                    p pVar4 = this.f142378k.get(z15 ? size - (i26 + 1) : i26);
                    if (pVar4.f142442b.X() == 8) {
                        pVar4.f142448h.d(i75);
                        pVar4.f142449i.d(i75);
                    } else {
                        if (i26 > 0) {
                            i75 = z15 ? i75 - i69 : i75 + i69;
                        }
                        if (i26 > 0 && i26 >= i36) {
                            i75 = z15 ? i75 - pVar4.f142448h.f142394f : i75 + pVar4.f142448h.f142394f;
                        }
                        if (z15) {
                            pVar4.f142449i.d(i75);
                        } else {
                            pVar4.f142448h.d(i75);
                        }
                        g gVar3 = pVar4.f142445e;
                        int i76 = gVar3.f142395g;
                        if (pVar4.f142444d == n5.e.b.MATCH_CONSTRAINT && pVar4.f142441a == 1) {
                            i76 = gVar3.f142410m;
                        }
                        i75 = z15 ? i75 - i76 : i75 + i76;
                        if (z15) {
                            pVar4.f142448h.d(i75);
                        } else {
                            pVar4.f142449i.d(i75);
                        }
                        pVar4.f142447g = true;
                        if (i26 < i37 && i26 < i15) {
                            i75 = z15 ? i75 - (-pVar4.f142449i.f142394f) : i75 + (-pVar4.f142449i.f142394f);
                        }
                    }
                    i26++;
                }
                return;
            }
            if (i68 == 0) {
                int i77 = (i35 - i18) / (i17 + 1);
                if (i19 > 0) {
                    i77 = i26;
                }
                int i78 = i25;
                while (i26 < size) {
                    p pVar5 = this.f142378k.get(z15 ? size - (i26 + 1) : i26);
                    if (pVar5.f142442b.X() == 8) {
                        pVar5.f142448h.d(i78);
                        pVar5.f142449i.d(i78);
                    } else {
                        int i79 = z15 ? i78 - i77 : i78 + i77;
                        if (i26 > 0 && i26 >= i36) {
                            i79 = z15 ? i79 - pVar5.f142448h.f142394f : i79 + pVar5.f142448h.f142394f;
                        }
                        if (z15) {
                            pVar5.f142449i.d(i79);
                        } else {
                            pVar5.f142448h.d(i79);
                        }
                        g gVar4 = pVar5.f142445e;
                        int iMin = gVar4.f142395g;
                        if (pVar5.f142444d == n5.e.b.MATCH_CONSTRAINT && pVar5.f142441a == 1) {
                            iMin = Math.min(iMin, gVar4.f142410m);
                        }
                        i78 = z15 ? i79 - iMin : i79 + iMin;
                        if (z15) {
                            pVar5.f142448h.d(i78);
                        } else {
                            pVar5.f142449i.d(i78);
                        }
                        if (i26 < i37 && i26 < i15) {
                            i78 = z15 ? i78 - (-pVar5.f142449i.f142394f) : i78 + (-pVar5.f142449i.f142394f);
                        }
                    }
                    i26++;
                }
                return;
            }
            if (i68 == 2) {
                float fY = this.f142446f == 0 ? this.f142442b.y() : this.f142442b.T();
                if (z15) {
                    fY = 1.0f - fY;
                }
                int i85 = (int) (((i35 - i18) * fY) + f17);
                if (i85 < 0 || i19 > 0) {
                    i85 = i26;
                }
                int i86 = z15 ? i25 - i85 : i25 + i85;
                while (i26 < size) {
                    p pVar6 = this.f142378k.get(z15 ? size - (i26 + 1) : i26);
                    if (pVar6.f142442b.X() == 8) {
                        pVar6.f142448h.d(i86);
                        pVar6.f142449i.d(i86);
                    } else {
                        if (i26 > 0 && i26 >= i36) {
                            i86 = z15 ? i86 - pVar6.f142448h.f142394f : i86 + pVar6.f142448h.f142394f;
                        }
                        if (z15) {
                            pVar6.f142449i.d(i86);
                        } else {
                            pVar6.f142448h.d(i86);
                        }
                        g gVar5 = pVar6.f142445e;
                        int i87 = gVar5.f142395g;
                        if (pVar6.f142444d == n5.e.b.MATCH_CONSTRAINT && pVar6.f142441a == 1) {
                            i87 = gVar5.f142410m;
                        }
                        i86 = z15 ? i86 - i87 : i86 + i87;
                        if (z15) {
                            pVar6.f142448h.d(i86);
                        } else {
                            pVar6.f142449i.d(i86);
                        }
                        if (i26 < i37 && i26 < i15) {
                            i86 = z15 ? i86 - (-pVar6.f142449i.f142394f) : i86 + (-pVar6.f142449i.f142394f);
                        }
                    }
                    i26++;
                }
            }
        }
    }

    @Override // o5.p
    void d() {
        Iterator<p> it = this.f142378k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f142378k.size();
        if (size < 1) {
            return;
        }
        n5.e eVar = this.f142378k.get(0).f142442b;
        n5.e eVar2 = this.f142378k.get(size - 1).f142442b;
        if (this.f142446f == 0) {
            n5.d dVar = eVar.O;
            n5.d dVar2 = eVar2.Q;
            f fVarI = i(dVar, 0);
            int iF = dVar.f();
            n5.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.O.f();
            }
            if (fVarI != null) {
                b(this.f142448h, fVarI, iF);
            }
            f fVarI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            n5.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.Q.f();
            }
            if (fVarI2 != null) {
                b(this.f142449i, fVarI2, -iF2);
            }
        } else {
            n5.d dVar3 = eVar.P;
            n5.d dVar4 = eVar2.R;
            f fVarI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            n5.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.P.f();
            }
            if (fVarI3 != null) {
                b(this.f142448h, fVarI3, iF3);
            }
            f fVarI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            n5.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.R.f();
            }
            if (fVarI4 != null) {
                b(this.f142449i, fVarI4, -iF4);
            }
        }
        this.f142448h.f142389a = this;
        this.f142449i.f142389a = this;
    }

    @Override // o5.p
    public void e() {
        for (int i15 = 0; i15 < this.f142378k.size(); i15++) {
            this.f142378k.get(i15).e();
        }
    }

    @Override // o5.p
    void f() {
        this.f142443c = null;
        Iterator<p> it = this.f142378k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // o5.p
    public long j() {
        int size = this.f142378k.size();
        long j15 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            p pVar = this.f142378k.get(i15);
            j15 = j15 + ((long) pVar.f142448h.f142394f) + pVar.j() + ((long) pVar.f142449i.f142394f);
        }
        return j15;
    }

    @Override // o5.p
    boolean m() {
        int size = this.f142378k.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (!this.f142378k.get(i15).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder("ChainRun ");
        sb5.append(this.f142446f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f142378k) {
            sb5.append("<");
            sb5.append(pVar);
            sb5.append("> ");
        }
        return sb5.toString();
    }
}
