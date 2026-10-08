package l5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i extends d {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116066a;

        static {
            int[] iArr = new int[k5.g.a.values().length];
            f116066a = iArr;
            try {
                iArr[k5.g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116066a[k5.g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116066a[k5.g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(k5.g gVar) {
        super(gVar, k5.g.d.HORIZONTAL_CHAIN);
    }

    @Override // k5.e, k5.a, k5.f
    public void apply() {
        Iterator<Object> it = this.f108489o0.iterator();
        while (it.hasNext()) {
            this.f108487m0.d(it.next()).u();
        }
        k5.a aVar = null;
        k5.a aVar2 = null;
        for (Object obj : this.f108489o0) {
            k5.a aVarD = this.f108487m0.d(obj);
            if (aVar2 == null) {
                Object obj2 = this.O;
                if (obj2 != null) {
                    aVarD.i0(obj2).J(this.f108442m).L(this.f108448s);
                } else {
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        aVarD.h0(obj3).J(this.f108442m).L(this.f108448s);
                    } else {
                        Object obj4 = this.K;
                        if (obj4 != null) {
                            aVarD.i0(obj4).J(this.f108438k).L(this.f108446q);
                        } else {
                            Object obj5 = this.L;
                            if (obj5 != null) {
                                aVarD.h0(obj5).J(this.f108438k).L(this.f108446q);
                            } else {
                                String string = aVarD.getKey().toString();
                                aVarD.i0(k5.g.f108491k).K(Float.valueOf(B0(string))).M(Float.valueOf(A0(string)));
                            }
                        }
                    }
                }
                aVar2 = aVarD;
            }
            if (aVar != null) {
                String string2 = aVar.getKey().toString();
                String string3 = aVarD.getKey().toString();
                aVar.A(aVarD.getKey()).K(Float.valueOf(z0(string2))).M(Float.valueOf(y0(string2)));
                aVarD.h0(aVar.getKey()).K(Float.valueOf(B0(string3))).M(Float.valueOf(A0(string3)));
            }
            float fC0 = C0(obj.toString());
            if (fC0 != -1.0f) {
                aVarD.a0(fC0);
            }
            aVar = aVarD;
        }
        if (aVar != null) {
            Object obj6 = this.Q;
            if (obj6 != null) {
                aVar.A(obj6).J(this.f108443n).L(this.f108449t);
            } else {
                Object obj7 = this.R;
                if (obj7 != null) {
                    aVar.z(obj7).J(this.f108443n).L(this.f108449t);
                } else {
                    Object obj8 = this.M;
                    if (obj8 != null) {
                        aVar.A(obj8).J(this.f108440l).L(this.f108447r);
                    } else {
                        Object obj9 = this.N;
                        if (obj9 != null) {
                            aVar.z(obj9).J(this.f108440l).L(this.f108447r);
                        } else {
                            String string4 = aVar.getKey().toString();
                            aVar.z(k5.g.f108491k).K(Float.valueOf(z0(string4))).M(Float.valueOf(y0(string4)));
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f15 = this.f116032q0;
        if (f15 != 0.5f) {
            aVar2.F(f15);
        }
        int i15 = a.f116066a[this.f116038w0.ordinal()];
        if (i15 == 1) {
            aVar2.Z(0);
        } else if (i15 == 2) {
            aVar2.Z(1);
        } else {
            if (i15 != 3) {
                return;
            }
            aVar2.Z(2);
        }
    }
}
