package u6;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lu6/g0;", "T", "", "<init>", "()V", "a", "Lu6/g0$a;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g0<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BQ\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lu6/g0$a;", "T", "Lu6/g0;", "Lkotlin/Function2;", "Ltq/e;", "", "transform", "Lju/x;", "ack", "Lu6/p0;", "lastState", "Ltq/i;", "callerContext", "<init>", "(Ler/p;Lju/x;Lu6/p0;Ltq/i;)V", "a", "Ler/p;", "d", "()Ler/p;", "b", "Lju/x;", "()Lju/x;", "c", "Lu6/p0;", "()Lu6/p0;", "Ltq/i;", "()Ltq/i;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> extends g0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.p<T, tq.e<? super T>, Object> transform;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ju.x<T> ack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p0<T> lastState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final tq.i callerContext;

        /* JADX WARN: Multi-variable type inference failed */
        public a(er.p<? super T, ? super tq.e<? super T>, ? extends Object> pVar, ju.x<T> xVar, p0<T> p0Var, tq.i iVar) {
            super(null);
            this.transform = pVar;
            this.ack = xVar;
            this.lastState = p0Var;
            this.callerContext = iVar;
        }

        public final ju.x<T> a() {
            return this.ack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final tq.i getCallerContext() {
            return this.callerContext;
        }

        public p0<T> c() {
            return this.lastState;
        }

        public final er.p<T, tq.e<? super T>, Object> d() {
            return this.transform;
        }
    }

    public /* synthetic */ g0(fr.k kVar) {
        this();
    }

    private g0() {
    }
}
