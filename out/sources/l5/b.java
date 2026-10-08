package l5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b extends k5.e {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f116027q0;

    public b(k5.g gVar) {
        super(gVar, k5.g.d.ALIGN_VERTICALLY);
        this.f116027q0 = 0.5f;
    }

    @Override // k5.e, k5.a, k5.f
    public void apply() {
        Iterator<Object> it = this.f108489o0.iterator();
        while (it.hasNext()) {
            k5.a aVarD = this.f108487m0.d(it.next());
            aVarD.v();
            Object obj = this.S;
            if (obj != null) {
                aVarD.m0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    aVarD.l0(obj2);
                } else {
                    aVarD.m0(k5.g.f108491k);
                }
            }
            Object obj3 = this.V;
            if (obj3 != null) {
                aVarD.q(obj3);
            } else {
                Object obj4 = this.W;
                if (obj4 != null) {
                    aVarD.p(obj4);
                } else {
                    aVarD.p(k5.g.f108491k);
                }
            }
            float f15 = this.f116027q0;
            if (f15 != 0.5f) {
                aVarD.q0(f15);
            }
        }
    }
}
