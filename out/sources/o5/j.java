package o5;

/* JADX INFO: loaded from: classes.dex */
class j extends p {
    j(n5.e eVar) {
        super(eVar);
        eVar.f131847e.f();
        eVar.f131849f.f();
        this.f142446f = ((n5.h) eVar).v1();
    }

    private void q(f fVar) {
        this.f142448h.f142399k.add(fVar);
        fVar.f142400l.add(this.f142448h);
    }

    @Override // o5.p, o5.d
    public void a(d dVar) {
        f fVar = this.f142448h;
        if (fVar.f142391c && !fVar.f142398j) {
            this.f142448h.d((int) ((fVar.f142400l.get(0).f142395g * ((n5.h) this.f142442b).y1()) + 0.5f));
        }
    }

    @Override // o5.p
    void d() {
        n5.h hVar = (n5.h) this.f142442b;
        int iW1 = hVar.w1();
        int iX1 = hVar.x1();
        hVar.y1();
        if (hVar.v1() == 1) {
            if (iW1 != -1) {
                this.f142448h.f142400l.add(this.f142442b.f131840a0.f131847e.f142448h);
                this.f142442b.f131840a0.f131847e.f142448h.f142399k.add(this.f142448h);
                this.f142448h.f142394f = iW1;
            } else if (iX1 != -1) {
                this.f142448h.f142400l.add(this.f142442b.f131840a0.f131847e.f142449i);
                this.f142442b.f131840a0.f131847e.f142449i.f142399k.add(this.f142448h);
                this.f142448h.f142394f = -iX1;
            } else {
                f fVar = this.f142448h;
                fVar.f142390b = true;
                fVar.f142400l.add(this.f142442b.f131840a0.f131847e.f142449i);
                this.f142442b.f131840a0.f131847e.f142449i.f142399k.add(this.f142448h);
            }
            q(this.f142442b.f131847e.f142448h);
            q(this.f142442b.f131847e.f142449i);
            return;
        }
        if (iW1 != -1) {
            this.f142448h.f142400l.add(this.f142442b.f131840a0.f131849f.f142448h);
            this.f142442b.f131840a0.f131849f.f142448h.f142399k.add(this.f142448h);
            this.f142448h.f142394f = iW1;
        } else if (iX1 != -1) {
            this.f142448h.f142400l.add(this.f142442b.f131840a0.f131849f.f142449i);
            this.f142442b.f131840a0.f131849f.f142449i.f142399k.add(this.f142448h);
            this.f142448h.f142394f = -iX1;
        } else {
            f fVar2 = this.f142448h;
            fVar2.f142390b = true;
            fVar2.f142400l.add(this.f142442b.f131840a0.f131849f.f142449i);
            this.f142442b.f131840a0.f131849f.f142449i.f142399k.add(this.f142448h);
        }
        q(this.f142442b.f131849f.f142448h);
        q(this.f142442b.f131849f.f142449i);
    }

    @Override // o5.p
    public void e() {
        if (((n5.h) this.f142442b).v1() == 1) {
            this.f142442b.p1(this.f142448h.f142395g);
        } else {
            this.f142442b.q1(this.f142448h.f142395g);
        }
    }

    @Override // o5.p
    void f() {
        this.f142448h.c();
    }

    @Override // o5.p
    boolean m() {
        return false;
    }
}
