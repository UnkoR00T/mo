package n5;

/* JADX INFO: loaded from: classes.dex */
public class a extends j {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    public int A1() {
        int i15 = this.N0;
        if (i15 == 0 || i15 == 1) {
            return 0;
        }
        return (i15 == 2 || i15 == 3) ? 1 : -1;
    }

    protected void B1() {
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar = this.L0[i15];
            if (this.O0 || eVar.h()) {
                int i16 = this.N0;
                if (i16 == 0 || i16 == 1) {
                    eVar.V0(0, true);
                } else if (i16 == 2 || i16 == 3) {
                    eVar.V0(1, true);
                }
            }
        }
    }

    public void C1(boolean z15) {
        this.O0 = z15;
    }

    public void D1(int i15) {
        this.N0 = i15;
    }

    public void E1(int i15) {
        this.P0 = i15;
    }

    @Override // n5.e
    public void g(g5.d dVar, boolean z15) {
        d[] dVarArr;
        boolean z16;
        int i15;
        int i16;
        int i17;
        d[] dVarArr2 = this.W;
        dVarArr2[0] = this.O;
        dVarArr2[2] = this.P;
        dVarArr2[1] = this.Q;
        dVarArr2[3] = this.R;
        int i18 = 0;
        while (true) {
            dVarArr = this.W;
            if (i18 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i18];
            dVar2.f131828i = dVar.q(dVar2);
            i18++;
        }
        int i19 = this.N0;
        if (i19 < 0 || i19 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i19];
        if (!this.Q0) {
            w1();
        }
        if (this.Q0) {
            this.Q0 = false;
            int i25 = this.N0;
            if (i25 == 0 || i25 == 1) {
                dVar.f(this.O.f131828i, this.f131850f0);
                dVar.f(this.Q.f131828i, this.f131850f0);
                return;
            } else {
                if (i25 == 2 || i25 == 3) {
                    dVar.f(this.P.f131828i, this.f131852g0);
                    dVar.f(this.R.f131828i, this.f131852g0);
                    return;
                }
                return;
            }
        }
        int i26 = 0;
        while (true) {
            if (i26 >= this.M0) {
                z16 = false;
                break;
            }
            e eVar = this.L0[i26];
            if ((this.O0 || eVar.h()) && ((((i16 = this.N0) == 0 || i16 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.O.f131825f != null && eVar.Q.f131825f != null) || (((i17 = this.N0) == 2 || i17 == 3) && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.P.f131825f != null && eVar.R.f131825f != null))) {
                z16 = true;
                break;
            }
            i26++;
        }
        boolean z17 = this.O.l() || this.Q.l();
        boolean z18 = this.P.l() || this.R.l();
        int i27 = !(!z16 && (((i15 = this.N0) == 0 && z17) || ((i15 == 2 && z18) || ((i15 == 1 && z17) || (i15 == 3 && z18))))) ? 4 : 5;
        for (int i28 = 0; i28 < this.M0; i28++) {
            e eVar2 = this.L0[i28];
            if (this.O0 || eVar2.h()) {
                g5.i iVarQ = dVar.q(eVar2.W[this.N0]);
                d[] dVarArr3 = eVar2.W;
                int i29 = this.N0;
                d dVar4 = dVarArr3[i29];
                dVar4.f131828i = iVarQ;
                d dVar5 = dVar4.f131825f;
                int i35 = (dVar5 == null || dVar5.f131823d != this) ? 0 : dVar4.f131826g;
                if (i29 == 0 || i29 == 2) {
                    dVar.i(dVar3.f131828i, iVarQ, this.P0 - i35, z16);
                } else {
                    dVar.g(dVar3.f131828i, iVarQ, this.P0 + i35, z16);
                }
                dVar.e(dVar3.f131828i, iVarQ, this.P0 + i35, i27);
            }
        }
        int i36 = this.N0;
        if (i36 == 0) {
            dVar.e(this.Q.f131828i, this.O.f131828i, 0, 8);
            dVar.e(this.O.f131828i, this.f131840a0.Q.f131828i, 0, 4);
            dVar.e(this.O.f131828i, this.f131840a0.O.f131828i, 0, 0);
            return;
        }
        if (i36 == 1) {
            dVar.e(this.O.f131828i, this.Q.f131828i, 0, 8);
            dVar.e(this.O.f131828i, this.f131840a0.O.f131828i, 0, 4);
            dVar.e(this.O.f131828i, this.f131840a0.Q.f131828i, 0, 0);
        } else if (i36 == 2) {
            dVar.e(this.R.f131828i, this.P.f131828i, 0, 8);
            dVar.e(this.P.f131828i, this.f131840a0.R.f131828i, 0, 4);
            dVar.e(this.P.f131828i, this.f131840a0.P.f131828i, 0, 0);
        } else if (i36 == 3) {
            dVar.e(this.P.f131828i, this.R.f131828i, 0, 8);
            dVar.e(this.P.f131828i, this.f131840a0.P.f131828i, 0, 4);
            dVar.e(this.P.f131828i, this.f131840a0.R.f131828i, 0, 0);
        }
    }

    @Override // n5.e
    public boolean h() {
        return true;
    }

    @Override // n5.e
    public boolean p0() {
        return this.Q0;
    }

    @Override // n5.e
    public boolean q0() {
        return this.Q0;
    }

    @Override // n5.e
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar = this.L0[i15];
            if (i15 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean w1() {
        int i15;
        int i16;
        int i17;
        boolean z15 = true;
        int i18 = 0;
        while (true) {
            i15 = this.M0;
            if (i18 >= i15) {
                break;
            }
            e eVar = this.L0[i18];
            if ((this.O0 || eVar.h()) && ((((i16 = this.N0) == 0 || i16 == 1) && !eVar.p0()) || (((i17 = this.N0) == 2 || i17 == 3) && !eVar.q0()))) {
                z15 = false;
            }
            i18++;
        }
        if (!z15 || i15 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z16 = false;
        for (int i19 = 0; i19 < this.M0; i19++) {
            e eVar2 = this.L0[i19];
            if (this.O0 || eVar2.h()) {
                if (!z16) {
                    int i25 = this.N0;
                    if (i25 == 0) {
                        iMax = eVar2.o(d.a.LEFT).e();
                    } else if (i25 == 1) {
                        iMax = eVar2.o(d.a.RIGHT).e();
                    } else if (i25 == 2) {
                        iMax = eVar2.o(d.a.TOP).e();
                    } else if (i25 == 3) {
                        iMax = eVar2.o(d.a.BOTTOM).e();
                    }
                    z16 = true;
                }
                int i26 = this.N0;
                if (i26 == 0) {
                    iMax = Math.min(iMax, eVar2.o(d.a.LEFT).e());
                } else if (i26 == 1) {
                    iMax = Math.max(iMax, eVar2.o(d.a.RIGHT).e());
                } else if (i26 == 2) {
                    iMax = Math.min(iMax, eVar2.o(d.a.TOP).e());
                } else if (i26 == 3) {
                    iMax = Math.max(iMax, eVar2.o(d.a.BOTTOM).e());
                }
            }
        }
        int i27 = iMax + this.P0;
        int i28 = this.N0;
        if (i28 == 0 || i28 == 1) {
            I0(i27, i27);
        } else {
            L0(i27, i27);
        }
        this.Q0 = true;
        return true;
    }

    public boolean x1() {
        return this.O0;
    }

    public int y1() {
        return this.N0;
    }

    public int z1() {
        return this.P0;
    }
}
