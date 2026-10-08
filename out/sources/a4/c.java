package a4;

import androidx.compose.ui.platform.f3;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"La4/c;", "Lc5/d;", "La4/q;", "pass", "La4/o;", "k2", "(La4/q;Ltq/e;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Ltq/e;", "", "block", "z1", "(JLer/p;Ltq/e;)Ljava/lang/Object;", "s2", "Lc5/r;", "b", "()J", "size", "Lm3/k;", "O0", "extendedTouchPadding", "A1", "()La4/o;", "currentEvent", "Landroidx/compose/ui/platform/f3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/f3;", "viewConfiguration", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c extends c5.d {
    static /* synthetic */ Object Q0(c cVar, q qVar, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i15 & 1) != 0) {
            qVar = q.Main;
        }
        return cVar.k2(qVar, eVar);
    }

    static /* synthetic */ <T> Object j0(c cVar, long j15, er.p<? super c, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return pVar.B(cVar, eVar);
    }

    static /* synthetic */ <T> Object t1(c cVar, long j15, er.p<? super c, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return pVar.B(cVar, eVar);
    }

    o A1();

    default long O0() {
        return m3.k.INSTANCE.b();
    }

    long b();

    f3 getViewConfiguration();

    Object k2(q qVar, tq.e<? super o> eVar);

    default <T> Object s2(long j15, er.p<? super c, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return j0(this, j15, pVar, eVar);
    }

    default <T> Object z1(long j15, er.p<? super c, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return t1(this, j15, pVar, eVar);
    }
}
