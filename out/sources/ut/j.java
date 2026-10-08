package ut;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import pq.v;
import st.t0;
import st.x1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f201285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f201286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f201287c;

    public j(k kVar, String... strArr) {
        this.f201285a = kVar;
        this.f201286b = strArr;
        String strE = b.ERROR_TYPE.e();
        String strE2 = kVar.e();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f201287c = String.format(strE, Arrays.copyOf(new Object[]{String.format(strE2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // st.x1
    public x1 a(tt.g gVar) {
        return this;
    }

    @Override // st.x1
    public vr.h c() {
        return l.f201331a.h();
    }

    @Override // st.x1
    public boolean d() {
        return false;
    }

    public final k e() {
        return this.f201285a;
    }

    public final String f(int i15) {
        return this.f201286b[i15];
    }

    @Override // st.x1
    public List<m1> getParameters() {
        return v.n();
    }

    @Override // st.x1
    public sr.j i() {
        return sr.g.f183554h.a();
    }

    @Override // st.x1
    public Collection<t0> q() {
        return v.n();
    }

    public String toString() {
        return this.f201287c;
    }
}
