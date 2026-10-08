package v7;

import ak.n0;
import ak.n1;
import java.util.List;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n1<a> f204204c = n1.d().f(new zj.g() { // from class: v7.b
        @Override // zj.g
        public final Object apply(Object obj) {
            return Integer.valueOf(((a) obj).f204185r);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f204205d = new c(n0.C(), 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f204206e = o0.u0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f204207f = o0.u0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0<a> f204208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f204209b;

    public c(List<a> list, long j15) {
        this.f204208a = n0.T(f204204c, list);
        this.f204209b = j15;
    }
}
