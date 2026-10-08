package me;

import be.r;

/* JADX INFO: loaded from: classes3.dex */
public class e extends ke.e<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // ke.e, be.r
    public void a() {
        ((c) this.f110241a).e().prepareToDraw();
    }

    @Override // be.v
    public void c() {
        ((c) this.f110241a).stop();
        ((c) this.f110241a).k();
    }

    @Override // be.v
    public Class<c> d() {
        return c.class;
    }

    @Override // be.v
    public int getSize() {
        return ((c) this.f110241a).i();
    }
}
