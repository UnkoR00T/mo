package n5;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends m {
    o5.b M0;
    public o5.e N0;
    private int O0;
    protected o5.b.InterfaceC3522b P0;
    private boolean Q0;
    protected g5.d R0;
    int S0;
    int T0;
    int U0;
    int V0;
    public int W0;
    public int X0;
    c[] Y0;
    c[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f131897a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f131898b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f131899c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f131900d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f131901e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f131902f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f131903g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private boolean f131904h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private boolean f131905i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    int f131906j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private WeakReference<d> f131907k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private WeakReference<d> f131908l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private WeakReference<d> f131909m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private WeakReference<d> f131910n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    HashSet<e> f131911o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public o5.b.a f131912p1;

    public f() {
        this.M0 = new o5.b(this);
        this.N0 = new o5.e(this);
        this.P0 = null;
        this.Q0 = false;
        this.R0 = new g5.d();
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = new c[4];
        this.Z0 = new c[4];
        this.f131897a1 = false;
        this.f131898b1 = false;
        this.f131899c1 = false;
        this.f131900d1 = 0;
        this.f131901e1 = 0;
        this.f131902f1 = 257;
        this.f131903g1 = false;
        this.f131904h1 = false;
        this.f131905i1 = false;
        this.f131906j1 = 0;
        this.f131907k1 = null;
        this.f131908l1 = null;
        this.f131909m1 = null;
        this.f131910n1 = null;
        this.f131911o1 = new HashSet<>();
        this.f131912p1 = new o5.b.a();
    }

    private void B1(e eVar) {
        int i15 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i15 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, U1());
        this.W0++;
    }

    private void E1(d dVar, g5.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void F1(d dVar, g5.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void G1(e eVar) {
        int i15 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i15 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, U1());
        this.X0++;
    }

    public static boolean X1(int i15, e eVar, o5.b.InterfaceC3522b interfaceC3522b, o5.b.a aVar, int i16) {
        int i17;
        int i18;
        if (interfaceC3522b == null) {
            return false;
        }
        if (eVar.X() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f142372e = 0;
            aVar.f142373f = 0;
            return false;
        }
        aVar.f142368a = eVar.A();
        aVar.f142369b = eVar.V();
        aVar.f142370c = eVar.Y();
        aVar.f142371d = eVar.x();
        aVar.f142376i = false;
        aVar.f142377j = i16;
        e.b bVar = aVar.f142368a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z15 = bVar == bVar2;
        boolean z16 = aVar.f142369b == bVar2;
        boolean z17 = z15 && eVar.f131846d0 > 0.0f;
        boolean z18 = z16 && eVar.f131846d0 > 0.0f;
        if (z15 && eVar.c0(0) && eVar.f131883w == 0 && !z17) {
            aVar.f142368a = e.b.WRAP_CONTENT;
            if (z16 && eVar.f131885x == 0) {
                aVar.f142368a = e.b.FIXED;
            }
            z15 = false;
        }
        if (z16 && eVar.c0(1) && eVar.f131885x == 0 && !z18) {
            aVar.f142369b = e.b.WRAP_CONTENT;
            if (z15 && eVar.f131883w == 0) {
                aVar.f142369b = e.b.FIXED;
            }
            z16 = false;
        }
        if (eVar.p0()) {
            aVar.f142368a = e.b.FIXED;
            z15 = false;
        }
        if (eVar.q0()) {
            aVar.f142369b = e.b.FIXED;
            z16 = false;
        }
        if (z17) {
            if (eVar.f131887y[0] == 4) {
                aVar.f142368a = e.b.FIXED;
            } else if (!z16) {
                e.b bVar3 = aVar.f142369b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i18 = aVar.f142371d;
                } else {
                    aVar.f142368a = e.b.WRAP_CONTENT;
                    interfaceC3522b.b(eVar, aVar);
                    i18 = aVar.f142373f;
                }
                aVar.f142368a = bVar4;
                aVar.f142370c = (int) (eVar.v() * i18);
            }
        }
        if (z18) {
            if (eVar.f131887y[1] == 4) {
                aVar.f142369b = e.b.FIXED;
            } else if (!z15) {
                e.b bVar5 = aVar.f142368a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i17 = aVar.f142370c;
                } else {
                    aVar.f142369b = e.b.WRAP_CONTENT;
                    interfaceC3522b.b(eVar, aVar);
                    i17 = aVar.f142372e;
                }
                aVar.f142369b = bVar6;
                if (eVar.w() == -1) {
                    aVar.f142371d = (int) (i17 / eVar.v());
                } else {
                    aVar.f142371d = (int) (eVar.v() * i17);
                }
            }
        }
        interfaceC3522b.b(eVar, aVar);
        eVar.n1(aVar.f142372e);
        eVar.O0(aVar.f142373f);
        eVar.N0(aVar.f142375h);
        eVar.D0(aVar.f142374g);
        aVar.f142377j = o5.b.a.f142365k;
        return aVar.f142376i;
    }

    private void Z1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    public boolean A1(g5.d dVar) {
        f fVar;
        g5.d dVar2;
        boolean zY1 = Y1(64);
        g(dVar, zY1);
        int size = this.L0.size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            e eVar = this.L0.get(i15);
            eVar.V0(0, false);
            eVar.V0(1, false);
            if (eVar instanceof a) {
                z15 = true;
            }
        }
        if (z15) {
            for (int i16 = 0; i16 < size; i16++) {
                e eVar2 = this.L0.get(i16);
                if (eVar2 instanceof a) {
                    ((a) eVar2).B1();
                }
            }
        }
        this.f131911o1.clear();
        for (int i17 = 0; i17 < size; i17++) {
            e eVar3 = this.L0.get(i17);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f131911o1.add(eVar3);
                } else {
                    eVar3.g(dVar, zY1);
                }
            }
        }
        while (this.f131911o1.size() > 0) {
            int size2 = this.f131911o1.size();
            Iterator<e> it = this.f131911o1.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.y1(this.f131911o1)) {
                    lVar.g(dVar, zY1);
                    this.f131911o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f131911o1.size()) {
                Iterator<e> it4 = this.f131911o1.iterator();
                while (it4.hasNext()) {
                    it4.next().g(dVar, zY1);
                }
                this.f131911o1.clear();
            }
        }
        if (g5.d.f70636s) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i18 = 0; i18 < size; i18++) {
                e eVar4 = this.L0.get(i18);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                k.a(this, dVar2, eVar5);
                eVar5.g(dVar2, zY1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i19 = 0; i19 < size; i19++) {
                e eVar6 = fVar.L0.get(i19);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.S0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.j1(e.b.FIXED);
                    }
                    eVar6.g(dVar2, zY1);
                    if (bVar == bVar3) {
                        eVar6.S0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.j1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar2, zY1);
                    }
                }
            }
        }
        if (fVar.W0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.X0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public void C1(d dVar) {
        WeakReference<d> weakReference = this.f131910n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f131910n1.get().e()) {
            this.f131910n1 = new WeakReference<>(dVar);
        }
    }

    public void D1(d dVar) {
        WeakReference<d> weakReference = this.f131908l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f131908l1.get().e()) {
            this.f131908l1 = new WeakReference<>(dVar);
        }
    }

    void H1(d dVar) {
        WeakReference<d> weakReference = this.f131909m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f131909m1.get().e()) {
            this.f131909m1 = new WeakReference<>(dVar);
        }
    }

    void I1(d dVar) {
        WeakReference<d> weakReference = this.f131907k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f131907k1.get().e()) {
            this.f131907k1 = new WeakReference<>(dVar);
        }
    }

    public boolean J1(boolean z15) {
        return this.N0.f(z15);
    }

    public boolean K1(boolean z15) {
        return this.N0.g(z15);
    }

    public boolean L1(boolean z15, int i15) {
        return this.N0.h(z15, i15);
    }

    public void M1(g5.e eVar) {
        this.R0.v(eVar);
    }

    public o5.b.InterfaceC3522b N1() {
        return this.P0;
    }

    public int O1() {
        return this.f131902f1;
    }

    @Override // n5.e
    public void P(StringBuilder sb5) {
        sb5.append(this.f131867o + ":{\n");
        sb5.append("  actualWidth:" + this.f131842b0);
        sb5.append("\n");
        sb5.append("  actualHeight:" + this.f131844c0);
        sb5.append("\n");
        Iterator<e> it = v1().iterator();
        while (it.hasNext()) {
            it.next().P(sb5);
            sb5.append(",\n");
        }
        sb5.append("}");
    }

    public g5.d P1() {
        return this.R0;
    }

    public boolean Q1() {
        return false;
    }

    public void R1() {
        this.N0.j();
    }

    public void S1() {
        this.N0.k();
    }

    public boolean T1() {
        return this.f131905i1;
    }

    public boolean U1() {
        return this.Q0;
    }

    public boolean V1() {
        return this.f131904h1;
    }

    public long W1(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28) {
        this.S0 = i27;
        this.T0 = i28;
        return this.M0.d(this, i15, i27, i28, i16, i17, i18, i19, i25, i26);
    }

    public boolean Y1(int i15) {
        return (this.f131902f1 & i15) == i15;
    }

    public void a2(o5.b.InterfaceC3522b interfaceC3522b) {
        this.P0 = interfaceC3522b;
        this.N0.n(interfaceC3522b);
    }

    public void b2(int i15) {
        this.f131902f1 = i15;
        g5.d.f70636s = Y1(512);
    }

    public void c2(int i15) {
        this.O0 = i15;
    }

    public void d2(boolean z15) {
        this.Q0 = z15;
    }

    public boolean e2(g5.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zY1 = Y1(64);
        t1(dVar, zY1);
        int size = this.L0.size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            e eVar = this.L0.get(i15);
            eVar.t1(dVar, zY1);
            if (eVar.e0()) {
                z15 = true;
            }
        }
        return z15;
    }

    public void f2() {
        this.M0.e(this);
    }

    @Override // n5.e
    public void s1(boolean z15, boolean z16) {
        super.s1(z15, z16);
        int size = this.L0.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.L0.get(i15).s1(z15, z16);
        }
    }

    @Override // n5.m, n5.e
    public void v0() {
        this.R0.E();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f131903g1 = false;
        super.v0();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0214  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0226 A[LOOP:5: B:123:0x0224->B:124:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0308  */
    /* JADX WARN: Code duplicated, block: B:164:0x0329 A[PHI: r13 r19
      0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x032d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // n5.m
    public void w1() {
        int i15;
        int i16;
        boolean z15;
        int i17;
        ?? r18;
        char c15;
        ?? A1;
        int i18;
        ?? E2;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r15;
        int iMax2;
        ?? r111;
        ?? r16;
        int i19;
        ?? r112;
        ?? r17;
        ?? r113;
        e.b bVar;
        e.b bVar2;
        ?? r25;
        ?? r114;
        ?? r26;
        e.b bVar3;
        int i25 = 0;
        this.f131850f0 = 0;
        this.f131852g0 = 0;
        this.f131904h1 = false;
        this.f131905i1 = false;
        int size = this.L0.size();
        int iMax3 = Math.max(0, Y());
        int iMax4 = Math.max(0, x());
        e.b[] bVarArr = this.Z;
        boolean z16 = true;
        e.b bVar4 = bVarArr[1];
        e.b bVar5 = bVarArr[0];
        if (this.O0 == 0 && k.b(this.f131902f1, 1)) {
            o5.h.h(this, N1());
            for (int i26 = 0; i26 < size; i26++) {
                e eVar = this.L0.get(i26);
                if (eVar.o0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof l) && !eVar.n0()) {
                    e.b bVarU = eVar.u(0);
                    e.b bVarU2 = eVar.u(1);
                    e.b bVar6 = e.b.MATCH_CONSTRAINT;
                    if (bVarU != bVar6 || eVar.f131883w == 1 || bVarU2 != bVar6 || eVar.f131885x == 1) {
                        X1(0, eVar, this.P0, new o5.b.a(), o5.b.a.f142365k);
                    }
                }
            }
        }
        char c16 = 2;
        if (size <= 2 || !((bVar5 == (bVar3 = e.b.WRAP_CONTENT) || bVar4 == bVar3) && k.b(this.f131902f1, 1024) && o5.i.c(this, N1()))) {
            i15 = iMax4;
            i16 = iMax3;
            z15 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax3 >= Y() || iMax3 <= 0) {
                    iMax3 = Y();
                } else {
                    n1(iMax3);
                    this.f131904h1 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax4 >= x() || iMax4 <= 0) {
                    iMax4 = x();
                } else {
                    O0(iMax4);
                    this.f131905i1 = true;
                }
            }
            i15 = iMax4;
            i16 = iMax3;
            z15 = true;
        }
        boolean z17 = Y1(64) || Y1(128);
        g5.d dVar = this.R0;
        dVar.f70651i = false;
        dVar.f70652j = false;
        if (this.f131902f1 != 0 && z17) {
            dVar.f70652j = true;
        }
        ArrayList<e> arrayList = this.L0;
        e.b bVarA = A();
        e.b bVar7 = e.b.WRAP_CONTENT;
        boolean z18 = bVarA == bVar7 || V() == bVar7;
        Z1();
        for (int i27 = 0; i27 < size; i27++) {
            e eVar2 = this.L0.get(i27);
            if (eVar2 instanceof m) {
                ((m) eVar2).w1();
            }
        }
        boolean zY1 = Y1(64);
        ?? r115 = z15;
        int i28 = 0;
        ?? r116 = 1;
        while (r116 != 0) {
            int i29 = i28 + 1;
            try {
                this.R0.E();
                Z1();
                m(this.R0);
                int i35 = i25;
                while (i35 < size) {
                    i17 = i25;
                    try {
                        c15 = c16;
                        try {
                            this.L0.get(i35).m(this.R0);
                            i35++;
                            i25 = i17;
                            c16 = c15;
                        } catch (Exception e15) {
                            e = e15;
                            r18 = z16;
                            A1 = r116;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (A1 != 0) {
                                E2 = e2(this.R0, k.f131957a);
                            } else {
                                t1(this.R0, zY1);
                                for (i18 = i17; i18 < size; i18++) {
                                    this.L0.get(i18).t1(this.R0, zY1);
                                }
                                E2 = i17;
                            }
                            if (z18) {
                                r19 = E2 == true ? 1 : 0;
                            } else {
                                r19 = E2 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f131864m0, Y());
                            r15 = r115;
                            r110 = r19;
                            if (iMax > Y()) {
                                n1(iMax);
                                this.Z[i17] = e.b.FIXED;
                                ?? r117 = r18;
                                r110 = r117 == true ? 1 : 0;
                                r15 = r117;
                            }
                            iMax2 = Math.max(this.f131866n0, x());
                            r16 = r15;
                            r111 = r110;
                            if (iMax2 > x()) {
                                O0(iMax2);
                                this.Z[r18] = e.b.FIXED;
                                r114 = r18;
                                r111 = r114 == true ? 1 : 0;
                            }
                            if (r16 == 0) {
                                bVar = this.Z[i17];
                                bVar2 = e.b.WRAP_CONTENT;
                                if (bVar == bVar2) {
                                    r16 = r114;
                                    r25 = r18;
                                    r16 = r16;
                                    r111 = r111;
                                } else {
                                    r16 = r114;
                                    r25 = r18;
                                    r16 = r16;
                                    r111 = r111;
                                }
                                if (this.Z[r25] == bVar2) {
                                    r16 = r114;
                                    i19 = 8;
                                    r17 = r16;
                                    r112 = r111;
                                } else {
                                    r16 = r114;
                                    i19 = 8;
                                    r17 = r16;
                                    r112 = r111;
                                }
                            } else {
                                r16 = r114;
                                i19 = 8;
                                r17 = r16;
                                r112 = r111;
                            }
                            if (i29 > i19) {
                                r113 = i17;
                            } else {
                                r113 = r112;
                            }
                            i28 = i29;
                            i25 = i17;
                            c16 = c15;
                            z16 = true;
                            r115 = r17;
                            r116 = r113;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        c15 = c16;
                    }
                }
                i17 = i25;
                c15 = c16;
                A1 = A1(this.R0);
                WeakReference<d> weakReference = this.f131907k1;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z16;
                } else {
                    boolean z19 = z16;
                    try {
                        F1(this.f131907k1.get(), this.R0.q(this.P));
                        this.f131907k1 = null;
                        r18 = z19;
                    } catch (Exception e17) {
                        e = e17;
                        A1 = A1;
                        r18 = z19;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<d> weakReference2 = this.f131909m1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    E1(this.f131909m1.get(), this.R0.q(this.R));
                    this.f131909m1 = null;
                }
                WeakReference<d> weakReference3 = this.f131908l1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    F1(this.f131908l1.get(), this.R0.q(this.O));
                    this.f131908l1 = null;
                }
                WeakReference<d> weakReference4 = this.f131910n1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    E1(this.f131910n1.get(), this.R0.q(this.Q));
                    this.f131910n1 = null;
                }
                if (A1 != 0) {
                    this.R0.A();
                }
            } catch (Exception e18) {
                e = e18;
                i17 = i25;
                r18 = z16;
                c15 = c16;
                A1 = r116;
            }
            if (A1 != 0) {
                E2 = e2(this.R0, k.f131957a);
            } else {
                t1(this.R0, zY1);
                while (i18 < size) {
                    this.L0.get(i18).t1(this.R0, zY1);
                }
                E2 = i17;
            }
            if (z18 || i29 >= 8 || !k.f131957a[c15]) {
                r19 = E2 == true ? 1 : 0;
            } else {
                int i36 = i17;
                int iMax5 = i36;
                int iMax6 = iMax5;
                while (i36 < size) {
                    r26 = E2;
                    e eVar3 = this.L0.get(i36);
                    iMax5 = Math.max(iMax5, eVar3.f131850f0 + eVar3.Y());
                    iMax6 = Math.max(iMax6, eVar3.f131852g0 + eVar3.x());
                    i36++;
                    r26 = r26 == true ? 1 : 0;
                }
                r26 = E2;
                ?? r118 = r26;
                int iMax7 = Math.max(this.f131864m0, iMax5);
                int iMax8 = Math.max(this.f131866n0, iMax6);
                e.b bVar8 = e.b.WRAP_CONTENT;
                r115 = r115;
                r19 = r118;
                if (bVar5 == bVar8 && Y() < iMax7) {
                    r115 = r115;
                    r19 = r118;
                    n1(iMax7);
                    this.Z[i17] = bVar8;
                    ?? r119 = r18;
                    r19 = r119 == true ? 1 : 0;
                    r115 = r119;
                }
                if (bVar4 == bVar8 && x() < iMax8) {
                    O0(iMax8);
                    this.Z[r18] = bVar8;
                    r115 = r18;
                    r19 = r115 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f131864m0, Y());
            r15 = r115;
            r110 = r19;
            if (iMax > Y()) {
                n1(iMax);
                this.Z[i17] = e.b.FIXED;
                ?? r1110 = r18;
                r110 = r1110 == true ? 1 : 0;
                r15 = r1110;
            }
            iMax2 = Math.max(this.f131866n0, x());
            r16 = r15;
            r111 = r110;
            if (iMax2 > x()) {
                O0(iMax2);
                this.Z[r18] = e.b.FIXED;
                r114 = r18;
                r111 = r114 == true ? 1 : 0;
            }
            if (r16 == 0) {
                bVar = this.Z[i17];
                bVar2 = e.b.WRAP_CONTENT;
                if (bVar == bVar2 || i16 <= 0 || Y() <= i16) {
                    r16 = r114;
                    r25 = r18;
                    r16 = r16;
                    r111 = r111;
                } else {
                    ?? r27 = r18;
                    this.f131904h1 = r27;
                    this.Z[i17] = e.b.FIXED;
                    n1(i16);
                    boolean z25 = r27 == true ? 1 : 0;
                    r111 = z25 ? 1 : 0;
                    r25 = r27;
                    r16 = z25;
                }
                if (this.Z[r25] == bVar2 || i15 <= 0 || x() <= i15) {
                    r16 = r114;
                    i19 = 8;
                    r17 = r16;
                    r112 = r111;
                } else {
                    this.f131905i1 = r25;
                    this.Z[r25] = e.b.FIXED;
                    O0(i15);
                    i19 = 8;
                    r17 = 1;
                    r112 = 1;
                }
            } else {
                r16 = r114;
                i19 = 8;
                r17 = r16;
                r112 = r111;
            }
            if (i29 > i19) {
                r113 = i17;
            } else {
                r113 = r112;
            }
            i28 = i29;
            i25 = i17;
            c16 = c15;
            z16 = true;
            r115 = r17;
            r116 = r113;
        }
        int i37 = i25;
        this.L0 = arrayList;
        if (r115 != 0) {
            e.b[] bVarArr2 = this.Z;
            bVarArr2[i37] = bVar5;
            bVarArr2[1] = bVar4;
        }
        y0(this.R0.w());
    }

    void z1(e eVar, int i15) {
        if (i15 == 0) {
            B1(eVar);
        } else if (i15 == 1) {
            G1(eVar);
        }
    }

    public f(int i15, int i16) {
        super(i15, i16);
        this.M0 = new o5.b(this);
        this.N0 = new o5.e(this);
        this.P0 = null;
        this.Q0 = false;
        this.R0 = new g5.d();
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = new c[4];
        this.Z0 = new c[4];
        this.f131897a1 = false;
        this.f131898b1 = false;
        this.f131899c1 = false;
        this.f131900d1 = 0;
        this.f131901e1 = 0;
        this.f131902f1 = 257;
        this.f131903g1 = false;
        this.f131904h1 = false;
        this.f131905i1 = false;
        this.f131906j1 = 0;
        this.f131907k1 = null;
        this.f131908l1 = null;
        this.f131909m1 = null;
        this.f131910n1 = null;
        this.f131911o1 = new HashSet<>();
        this.f131912p1 = new o5.b.a();
    }
}
