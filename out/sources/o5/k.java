package o5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class k extends p {
    k(n5.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f142448h.f142399k.add(fVar);
        fVar.f142400l.add(this.f142448h);
    }

    @Override // o5.p, o5.d
    public void a(d dVar) {
        n5.a aVar = (n5.a) this.f142442b;
        int iY1 = aVar.y1();
        Iterator<f> it = this.f142448h.f142400l.iterator();
        int i15 = 0;
        int i16 = -1;
        while (it.hasNext()) {
            int i17 = it.next().f142395g;
            if (i16 == -1 || i17 < i16) {
                i16 = i17;
            }
            if (i15 < i17) {
                i15 = i17;
            }
        }
        if (iY1 == 0 || iY1 == 2) {
            this.f142448h.d(i16 + aVar.z1());
        } else {
            this.f142448h.d(i15 + aVar.z1());
        }
    }

    @Override // o5.p
    void d() {
        n5.e eVar = this.f142442b;
        if (eVar instanceof n5.a) {
            this.f142448h.f142390b = true;
            n5.a aVar = (n5.a) eVar;
            int iY1 = aVar.y1();
            boolean zX1 = aVar.x1();
            int i15 = 0;
            if (iY1 == 0) {
                this.f142448h.f142393e = f.a.LEFT;
                while (i15 < aVar.M0) {
                    n5.e eVar2 = aVar.L0[i15];
                    if (zX1 || eVar2.X() != 8) {
                        f fVar = eVar2.f131847e.f142448h;
                        fVar.f142399k.add(this.f142448h);
                        this.f142448h.f142400l.add(fVar);
                    }
                    i15++;
                }
                q(this.f142442b.f131847e.f142448h);
                q(this.f142442b.f131847e.f142449i);
                return;
            }
            if (iY1 == 1) {
                this.f142448h.f142393e = f.a.RIGHT;
                while (i15 < aVar.M0) {
                    n5.e eVar3 = aVar.L0[i15];
                    if (zX1 || eVar3.X() != 8) {
                        f fVar2 = eVar3.f131847e.f142449i;
                        fVar2.f142399k.add(this.f142448h);
                        this.f142448h.f142400l.add(fVar2);
                    }
                    i15++;
                }
                q(this.f142442b.f131847e.f142448h);
                q(this.f142442b.f131847e.f142449i);
                return;
            }
            if (iY1 == 2) {
                this.f142448h.f142393e = f.a.TOP;
                while (i15 < aVar.M0) {
                    n5.e eVar4 = aVar.L0[i15];
                    if (zX1 || eVar4.X() != 8) {
                        f fVar3 = eVar4.f131849f.f142448h;
                        fVar3.f142399k.add(this.f142448h);
                        this.f142448h.f142400l.add(fVar3);
                    }
                    i15++;
                }
                q(this.f142442b.f131849f.f142448h);
                q(this.f142442b.f131849f.f142449i);
                return;
            }
            if (iY1 != 3) {
                return;
            }
            this.f142448h.f142393e = f.a.BOTTOM;
            while (i15 < aVar.M0) {
                n5.e eVar5 = aVar.L0[i15];
                if (zX1 || eVar5.X() != 8) {
                    f fVar4 = eVar5.f131849f.f142449i;
                    fVar4.f142399k.add(this.f142448h);
                    this.f142448h.f142400l.add(fVar4);
                }
                i15++;
            }
            q(this.f142442b.f131849f.f142448h);
            q(this.f142442b.f131849f.f142449i);
        }
    }

    @Override // o5.p
    public void e() {
        n5.e eVar = this.f142442b;
        if (eVar instanceof n5.a) {
            int iY1 = ((n5.a) eVar).y1();
            if (iY1 == 0 || iY1 == 1) {
                this.f142442b.p1(this.f142448h.f142395g);
            } else {
                this.f142442b.q1(this.f142448h.f142395g);
            }
        }
    }

    @Override // o5.p
    void f() {
        this.f142443c = null;
        this.f142448h.c();
    }

    @Override // o5.p
    boolean m() {
        return false;
    }
}
