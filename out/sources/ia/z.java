package ia;

import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lha/g;", "T", "currentInfo", "", "backInfo", "forwardInfo", "Lia/x;", "b", "(Lha/g;Ljava/util/List;Ljava/util/List;Lm2/r;II)Lia/x;", "navigationevent-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z {
    public static final <T extends ha.g> x<T> b(final T t15, final List<? extends T> list, final List<? extends T> list2, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            list = pq.v.n();
        }
        if ((i16 & 4) != 0) {
            list2 = pq.v.n();
        }
        if (p076m2.t.k()) {
            p076m2.t.o(116613162, i15, -1, "androidx.navigationevent.compose.rememberNavigationEventState (RememberNavigationEventState.kt:44)");
        }
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = new x(t15, list, list2);
            rVar.v(objE);
        }
        final x<T> xVar = (x) objE;
        boolean zG = ((((i15 & 14) ^ 6) > 4 && rVar.G(t15)) || (i15 & 6) == 4) | rVar.G(list) | rVar.G(list2);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new er.a() { // from class: ia.y
                @Override // er.a
                public final Object a() {
                    return z.c(xVar, t15, list, list2);
                }
            };
            rVar.v(objE2);
        }
        Function0.g((er.a) objE2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(x xVar, ha.g gVar, List list, List list2) {
        xVar.g(gVar);
        xVar.f(list);
        xVar.h(list2);
        return i0.f148189a;
    }
}
