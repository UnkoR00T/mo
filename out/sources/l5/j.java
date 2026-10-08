package l5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116067a;

        static {
            int[] iArr = new int[k5.g.a.values().length];
            f116067a = iArr;
            try {
                iArr[k5.g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116067a[k5.g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116067a[k5.g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(k5.g gVar) {
        super(gVar, k5.g.d.VERTICAL_CHAIN);
    }

    @Override // k5.e, k5.a, k5.f
    public void apply() {
        Iterator<Object> it = this.f108489o0.iterator();
        while (it.hasNext()) {
            this.f108487m0.d(it.next()).v();
        }
        k5.a aVar = null;
        k5.a aVar2 = null;
        for (Object obj : this.f108489o0) {
            k5.a aVarD = this.f108487m0.d(obj);
            if (aVar2 == null) {
                Object obj2 = this.S;
                if (obj2 != null) {
                    aVarD.m0(obj2).J(this.f108444o).L(this.f108450u);
                } else {
                    Object obj3 = this.T;
                    if (obj3 != null) {
                        aVarD.l0(obj3).J(this.f108444o).L(this.f108450u);
                    } else {
                        String string = aVarD.getKey().toString();
                        aVarD.m0(k5.g.f108491k).K(Float.valueOf(B0(string))).M(Float.valueOf(A0(string)));
                    }
                }
                aVar2 = aVarD;
            }
            if (aVar != null) {
                String string2 = aVar.getKey().toString();
                String string3 = aVarD.getKey().toString();
                aVar.q(aVarD.getKey()).K(Float.valueOf(z0(string2))).M(Float.valueOf(y0(string2)));
                aVarD.l0(aVar.getKey()).K(Float.valueOf(B0(string3))).M(Float.valueOf(A0(string3)));
            }
            float fC0 = C0(obj.toString());
            if (fC0 != -1.0f) {
                aVarD.d0(fC0);
            }
            aVar = aVarD;
        }
        if (aVar != null) {
            Object obj4 = this.V;
            if (obj4 != null) {
                aVar.q(obj4).J(this.f108445p).L(this.f108451v);
            } else {
                Object obj5 = this.W;
                if (obj5 != null) {
                    aVar.p(obj5).J(this.f108445p).L(this.f108451v);
                } else {
                    String string4 = aVar.getKey().toString();
                    aVar.p(k5.g.f108491k).K(Float.valueOf(z0(string4))).M(Float.valueOf(y0(string4)));
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f15 = this.f116032q0;
        if (f15 != 0.5f) {
            aVar2.q0(f15);
        }
        int i15 = a.f116067a[this.f116038w0.ordinal()];
        if (i15 == 1) {
            aVar2.c0(0);
        } else if (i15 == 2) {
            aVar2.c0(1);
        } else {
            if (i15 != 3) {
                return;
            }
            aVar2.c0(2);
        }
    }
}
