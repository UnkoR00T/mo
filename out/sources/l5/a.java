package l5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a extends k5.e {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f116026q0;

    public a(k5.g gVar) {
        super(gVar, k5.g.d.ALIGN_VERTICALLY);
        this.f116026q0 = 0.5f;
    }

    @Override // k5.e, k5.a, k5.f
    public void apply() {
        Iterator<Object> it = this.f108489o0.iterator();
        while (it.hasNext()) {
            k5.a aVarD = this.f108487m0.d(it.next());
            aVarD.u();
            Object obj = this.O;
            if (obj != null) {
                aVarD.i0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    aVarD.h0(obj2);
                } else {
                    aVarD.i0(k5.g.f108491k);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                aVarD.A(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    aVarD.z(obj4);
                } else {
                    aVarD.z(k5.g.f108491k);
                }
            }
            float f15 = this.f116026q0;
            if (f15 != 0.5f) {
                aVarD.F(f15);
            }
        }
    }
}
