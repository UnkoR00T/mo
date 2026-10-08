package id;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class t<K, A> extends a<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f91033i;

    public t(ud.c<A> cVar) {
        this(cVar, null);
    }

    @Override // id.a
    float c() {
        return 1.0f;
    }

    @Override // id.a
    public A h() {
        ud.c<A> cVar = this.f90958e;
        A a15 = this.f91033i;
        return cVar.b(0.0f, 0.0f, a15, a15, f(), f(), f());
    }

    @Override // id.a
    A i(ud.a<K> aVar, float f15) {
        return h();
    }

    @Override // id.a
    public void l() {
        if (this.f90958e != null) {
            super.l();
        }
    }

    @Override // id.a
    public void n(float f15) {
        this.f90957d = f15;
    }

    public t(ud.c<A> cVar, A a15) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f91033i = a15;
    }
}
