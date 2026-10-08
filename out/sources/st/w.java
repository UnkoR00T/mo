package st;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f184142a;

    private final boolean f(vr.h hVar) {
        return (ut.l.m(hVar) || dt.i.E(hVar)) ? false : true;
    }

    @Override // st.x1
    public abstract vr.h c();

    protected final boolean e(vr.h hVar, vr.h hVar2) {
        if (!fr.t.c(hVar.getName(), hVar2.getName())) {
            return false;
        }
        vr.m mVarB = hVar.b();
        for (vr.m mVarB2 = hVar2.b(); mVarB != null && mVarB2 != null; mVarB2 = mVarB2.b()) {
            if (mVarB instanceof vr.i0) {
                return mVarB2 instanceof vr.i0;
            }
            if (mVarB2 instanceof vr.i0) {
                return false;
            }
            if (mVarB instanceof vr.o0) {
                return (mVarB2 instanceof vr.o0) && fr.t.c(((vr.o0) mVarB).g(), ((vr.o0) mVarB2).g());
            }
            if ((mVarB2 instanceof vr.o0) || !fr.t.c(mVarB.getName(), mVarB2.getName())) {
                return false;
            }
            mVarB = mVarB.b();
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1) || obj.hashCode() != hashCode()) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (x1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        vr.h hVarC = c();
        vr.h hVarC2 = x1Var.c();
        if (hVarC2 != null && f(hVarC) && f(hVarC2)) {
            return g(hVarC2);
        }
        return false;
    }

    protected abstract boolean g(vr.h hVar);

    public int hashCode() {
        int i15 = this.f184142a;
        if (i15 != 0) {
            return i15;
        }
        vr.h hVarC = c();
        int iHashCode = f(hVarC) ? dt.i.m(hVarC).hashCode() : System.identityHashCode(this);
        this.f184142a = iHashCode;
        return iHashCode;
    }
}
