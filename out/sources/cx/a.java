package cx;

import dx.i;
import er.l;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ9\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\t\u0010\nJJ\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcx/a;", "", "RESULT", "", "nextEventDelay", "Lkotlin/Function0;", "event", "Ldx/i;", "Loq/i0;", "c", "(JLer/a;)Ldx/i;", "Lkotlin/Function1;", "Ltq/e;", "b", "(JLer/l;Ltq/e;)Ljava/lang/Object;", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f38376a;

    /* JADX INFO: renamed from: cx.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcx/a$a;", "", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f38376a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ i a(a aVar, long j15, er.a aVar2, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throttle");
        }
        if ((i15 & 1) != 0) {
            j15 = 300;
        }
        return aVar.c(j15, aVar2);
    }

    static /* synthetic */ Object d(a aVar, long j15, l lVar, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: suspendThrottle");
        }
        if ((i15 & 1) != 0) {
            j15 = 300;
        }
        return aVar.b(j15, lVar, eVar);
    }

    <RESULT> Object b(long j15, l<? super e<? super RESULT>, ? extends Object> lVar, e<? super i<i0, ? extends RESULT>> eVar);

    <RESULT> i<i0, RESULT> c(long nextEventDelay, er.a<? extends RESULT> event);
}
