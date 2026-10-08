package y;

import androidx.p016lifecycle.c0;
import oq.i0;
import p071kotlin.Metadata;
import p105prN.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly/r;", "I", "O", "Landroidx/lifecycle/z;", "initialValue", "LprN/o2;", "mapFunction", "<init>", "(Ljava/lang/Object;LprN/o2;)V", "Landroidx/lifecycle/y;", "liveDataSource", "Loq/i0;", "u", "(Landroidx/lifecycle/y;)V", "f", "()Ljava/lang/Object;", "m", "Ljava/lang/Object;", "n", "LprN/o2;", "o", "Landroidx/lifecycle/y;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class r<I, O> extends androidx.p016lifecycle.z<O> {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final O initialValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final o2<I, O> mapFunction;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.y<I> liveDataSource;

    public r(O o15, o2<I, O> o2Var) {
        this.initialValue = o15;
        this.mapFunction = o2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(androidx.p016lifecycle.y yVar, final r rVar, androidx.p016lifecycle.y yVar2) {
        if (yVar != null) {
            super.q(yVar);
        }
        final er.l lVar = new er.l() { // from class: y.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.w(this.f222508a, obj);
            }
        };
        super.p(yVar2, new c0() { // from class: y.q
            @Override // androidx.p016lifecycle.c0
            public final void a(Object obj) {
                r.x(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(r rVar, Object obj) {
        rVar.o(rVar.mapFunction.apply(obj));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(er.l lVar, Object obj) {
        lVar.b(obj);
    }

    @Override // androidx.p016lifecycle.y
    public O f() {
        androidx.p016lifecycle.y<I> yVar = this.liveDataSource;
        return yVar == null ? this.initialValue : this.mapFunction.apply(yVar.f());
    }

    public final void u(final androidx.p016lifecycle.y<I> liveDataSource) {
        final androidx.p016lifecycle.y<I> yVar = this.liveDataSource;
        this.liveDataSource = liveDataSource;
        w.e(new Runnable() { // from class: y.o
            @Override // java.lang.Runnable
            public final void run() {
                r.v(yVar, this, liveDataSource);
            }
        });
    }
}
