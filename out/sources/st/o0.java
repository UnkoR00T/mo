package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends g2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.m1[] f184086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d2[] f184087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f184088e;

    public o0(vr.m1[] m1VarArr, d2[] d2VarArr, boolean z15) {
        this.f184086c = m1VarArr;
        this.f184087d = d2VarArr;
        this.f184088e = z15;
        int length = m1VarArr.length;
        int length2 = d2VarArr.length;
    }

    @Override // st.g2
    public boolean b() {
        return this.f184088e;
    }

    @Override // st.g2
    public d2 e(t0 t0Var) {
        vr.h hVarC = t0Var.T0().c();
        vr.m1 m1Var = hVarC instanceof vr.m1 ? (vr.m1) hVarC : null;
        if (m1Var == null) {
            return null;
        }
        int index = m1Var.getIndex();
        vr.m1[] m1VarArr = this.f184086c;
        if (index >= m1VarArr.length || !fr.t.c(m1VarArr[index].o(), m1Var.o())) {
            return null;
        }
        return this.f184087d[index];
    }

    @Override // st.g2
    public boolean f() {
        return this.f184087d.length == 0;
    }

    public final d2[] i() {
        return this.f184087d;
    }

    public final vr.m1[] j() {
        return this.f184086c;
    }

    public /* synthetic */ o0(vr.m1[] m1VarArr, d2[] d2VarArr, boolean z15, int i15, fr.k kVar) {
        this(m1VarArr, d2VarArr, (i15 & 4) != 0 ? false : z15);
    }

    public o0(List<? extends vr.m1> list, List<? extends d2> list2) {
        this((vr.m1[]) list.toArray(new vr.m1[0]), (d2[]) list2.toArray(new d2[0]), false, 4, null);
    }
}
