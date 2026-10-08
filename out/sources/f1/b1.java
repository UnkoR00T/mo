package f1;

import java.util.Map;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Lf1/y0;", "c", "(IILm2/r;II)Lf1/y0;", "Lf1/i0;", "a", "Lf1/i0;", "EmptyLazyListMeasureResult", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f54742a = new i0(null, 0, false, 0.0f, new a(), 0.0f, false, ju.q0.a(tq.j.f191408a), c5.f.b(1.0f, 0.0f, 2, null), c5.c.b(0, 0, 0, 0, 15, null), pq.v.n(), 0, 0, 0, false, a2.Vertical, 0, 0, null);

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"f1/b1$a", "Le4/x0;", "Loq/i0;", "k", "()V", "", "a", "I", "l", "()I", "width", "b", "getHeight", "height", "", "Le4/a;", "c", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public static final y0 c(final int i15, final int i16, p076m2.r rVar, int i17, int i18) {
        if ((i18 & 1) != 0) {
            i15 = 0;
        }
        if ((i18 & 2) != 0) {
            i16 = 0;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(1470655220, i17, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:78)");
        }
        Object[] objArr = new Object[0];
        b3.x<y0, ?> xVarA = y0.INSTANCE.a();
        boolean z15 = true;
        boolean z16 = (((i17 & 14) ^ 6) > 4 && rVar.c(i15)) || (i17 & 6) == 4;
        if ((((i17 & 112) ^ 48) <= 32 || !rVar.c(i16)) && (i17 & 48) != 32) {
            z15 = false;
        }
        boolean z17 = z16 | z15;
        Object objE = rVar.E();
        if (z17 || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: f1.a1
                @Override // er.a
                public final Object a() {
                    return b1.d(i15, i16);
                }
            };
            rVar.v(objE);
        }
        y0 y0Var = (y0) b3.f.i(objArr, xVarA, (er.a) objE, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 d(int i15, int i16) {
        return new y0(i15, i16);
    }
}
