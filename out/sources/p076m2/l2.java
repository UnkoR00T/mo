package p076m2;

import er.l;
import er.p;
import p071kotlin.Metadata;
import tq.e;
import tq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\rJ*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lm2/l2;", "Ltq/i$b;", "R", "Lkotlin/Function1;", "", "onFrame", "x1", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "e0", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l2 extends i.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f122995a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <R> R a(l2 l2Var, R r15, p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(l2Var, r15, pVar);
        }

        public static <E extends i.b> E b(l2 l2Var, i.c<E> cVar) {
            return (E) i.b.a.b(l2Var, cVar);
        }

        public static i c(l2 l2Var, i.c<?> cVar) {
            return i.b.a.c(l2Var, cVar);
        }

        public static i d(l2 l2Var, i iVar) {
            return i.b.a.d(l2Var, iVar);
        }
    }

    /* JADX INFO: renamed from: m2.l2$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm2/l2$b;", "Ltq/i$c;", "Lm2/l2;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements i.c<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f122995a = new Companion();

        private Companion() {
        }
    }

    @Override // tq.i.b
    default i.c<?> getKey() {
        return INSTANCE;
    }

    <R> Object x1(l<? super Long, ? extends R> lVar, e<? super R> eVar);
}
