package n5;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class l extends j {
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private int U0 = 0;
    private boolean V0 = false;
    private int W0 = 0;
    private int X0 = 0;
    protected o5.b.a Y0 = new o5.b.a();
    o5.b.InterfaceC3522b Z0 = null;

    public int A1() {
        return this.W0;
    }

    public int B1() {
        return this.O0;
    }

    public int C1() {
        return this.T0;
    }

    public int D1() {
        return this.U0;
    }

    public int E1() {
        return this.N0;
    }

    public void F1(int i15, int i16, int i17, int i18) {
    }

    protected void G1(e eVar, e.b bVar, int i15, e.b bVar2, int i16) {
        while (this.Z0 == null && L() != null) {
            this.Z0 = ((f) L()).N1();
        }
        o5.b.a aVar = this.Y0;
        aVar.f142368a = bVar;
        aVar.f142369b = bVar2;
        aVar.f142370c = i15;
        aVar.f142371d = i16;
        this.Z0.b(eVar, aVar);
        eVar.n1(this.Y0.f142372e);
        eVar.O0(this.Y0.f142373f);
        eVar.N0(this.Y0.f142375h);
        eVar.D0(this.Y0.f142374g);
    }

    protected boolean H1() {
        e eVar = this.f131840a0;
        o5.b.InterfaceC3522b interfaceC3522bN1 = eVar != null ? ((f) eVar).N1() : null;
        if (interfaceC3522bN1 == null) {
            return false;
        }
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar2 = this.L0[i15];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarU = eVar2.u(0);
                e.b bVarU2 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || eVar2.f131883w == 1 || bVarU2 != bVar || eVar2.f131885x == 1) {
                    if (bVarU == bVar) {
                        bVarU = e.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = e.b.WRAP_CONTENT;
                    }
                    o5.b.a aVar = this.Y0;
                    aVar.f142368a = bVarU;
                    aVar.f142369b = bVarU2;
                    aVar.f142370c = eVar2.Y();
                    this.Y0.f142371d = eVar2.x();
                    interfaceC3522bN1.b(eVar2, this.Y0);
                    eVar2.n1(this.Y0.f142372e);
                    eVar2.O0(this.Y0.f142373f);
                    eVar2.D0(this.Y0.f142374g);
                }
            }
        }
        return true;
    }

    public boolean I1() {
        return this.V0;
    }

    protected void J1(boolean z15) {
        this.V0 = z15;
    }

    public void K1(int i15, int i16) {
        this.W0 = i15;
        this.X0 = i16;
    }

    public void L1(int i15) {
        this.P0 = i15;
        this.N0 = i15;
        this.Q0 = i15;
        this.O0 = i15;
        this.R0 = i15;
        this.S0 = i15;
    }

    public void M1(int i15) {
        this.O0 = i15;
    }

    public void N1(int i15) {
        this.S0 = i15;
    }

    public void O1(int i15) {
        this.P0 = i15;
        this.T0 = i15;
    }

    public void P1(int i15) {
        this.Q0 = i15;
        this.U0 = i15;
    }

    public void Q1(int i15) {
        this.R0 = i15;
        this.T0 = i15;
        this.U0 = i15;
    }

    public void R1(int i15) {
        this.N0 = i15;
    }

    @Override // n5.j, n5.i
    public void c(f fVar) {
        x1();
    }

    public void w1(boolean z15) {
        int i15 = this.R0;
        if (i15 > 0 || this.S0 > 0) {
            if (z15) {
                this.T0 = this.S0;
                this.U0 = i15;
            } else {
                this.T0 = i15;
                this.U0 = this.S0;
            }
        }
    }

    public void x1() {
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar = this.L0[i15];
            if (eVar != null) {
                eVar.X0(true);
            }
        }
    }

    public boolean y1(HashSet<e> hashSet) {
        for (int i15 = 0; i15 < this.M0; i15++) {
            if (hashSet.contains(this.L0[i15])) {
                return true;
            }
        }
        return false;
    }

    public int z1() {
        return this.X0;
    }
}
