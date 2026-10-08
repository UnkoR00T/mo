package f3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lf3/o;", "Ltq/i$b;", "", "Z", "()F", "scaleFactor", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "M", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface o extends tq.i.b {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f58763a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <R> R a(o oVar, R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
            return (R) tq.i.b.a.a(oVar, r15, pVar);
        }

        public static <E extends tq.i.b> E b(o oVar, tq.i.c<E> cVar) {
            return (E) tq.i.b.a.b(oVar, cVar);
        }

        public static tq.i c(o oVar, tq.i.c<?> cVar) {
            return tq.i.b.a.c(oVar, cVar);
        }

        public static tq.i d(o oVar, tq.i iVar) {
            return tq.i.b.a.d(oVar, iVar);
        }
    }

    /* JADX INFO: renamed from: f3.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf3/o$b;", "Ltq/i$c;", "Lf3/o;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements tq.i.c<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f58763a = new Companion();

        private Companion() {
        }
    }

    float Z();

    @Override // tq.i.b
    default tq.i.c<?> getKey() {
        return INSTANCE;
    }
}
