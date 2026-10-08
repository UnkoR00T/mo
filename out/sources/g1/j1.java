package g1;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Lg1/e1;", "g", "(IILm2/r;II)Lg1/e1;", "Lg1/k0;", "a", "Lg1/k0;", "EmptyLazyGridLayoutInfo", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k0 f69349a;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"g1/j1$a", "Le4/x0;", "Loq/i0;", "k", "()V", "", "a", "I", "l", "()I", "width", "b", "getHeight", "height", "", "Le4/a;", "c", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p036e4.x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<p036e4.a, Integer> alignmentLines = pq.v0.i();

        a() {
        }

        @Override // p036e4.x0
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getF47359b() {
            return this.height;
        }

        @Override // p036e4.x0
        public Map<p036e4.a, Integer> i() {
            return this.alignmentLines;
        }

        @Override // p036e4.x0
        public void k() {
        }

        @Override // p036e4.x0
        /* JADX INFO: renamed from: l, reason: from getter */
        public int getF47358a() {
            return this.width;
        }
    }

    static {
        a aVar = new a();
        List listN = pq.v.n();
        a2 a2Var = a2.Vertical;
        f69349a = new k0(null, 0, false, 0.0f, aVar, 0.0f, false, ju.q0.a(tq.j.f191408a), c5.f.b(1.0f, 0.0f, 2, null), 0, new er.l() { // from class: g1.h1
            @Override // er.l
            public final Object b(Object obj) {
                return j1.d(((Integer) obj).intValue());
            }
        }, new er.l() { // from class: g1.i1
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(j1.e(((Integer) obj).intValue()));
            }
        }, listN, 0, 0, 0, false, a2Var, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(int i15) {
        return pq.v.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i15) {
        return -1;
    }

    public static final e1 g(final int i15, final int i16, p076m2.r rVar, int i17, int i18) {
        if ((i18 & 1) != 0) {
            i15 = 0;
        }
        if ((i18 & 2) != 0) {
            i16 = 0;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(29186956, i17, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:79)");
        }
        Object[] objArr = new Object[0];
        b3.x<e1, ?> xVarA = e1.INSTANCE.a();
        boolean z15 = true;
        boolean z16 = (((i17 & 14) ^ 6) > 4 && rVar.c(i15)) || (i17 & 6) == 4;
        if ((((i17 & 112) ^ 48) <= 32 || !rVar.c(i16)) && (i17 & 48) != 32) {
            z15 = false;
        }
        boolean z17 = z16 | z15;
        Object objE = rVar.E();
        if (z17 || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: g1.g1
                @Override // er.a
                public final Object a() {
                    return j1.h(i15, i16);
                }
            };
            rVar.v(objE);
        }
        e1 e1Var = (e1) b3.f.i(objArr, xVarA, (er.a) objE, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return e1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 h(int i15, int i16) {
        return new e1(i15, i16);
    }
}
