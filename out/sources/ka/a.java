package ka;

import er.p;
import ja.CombinedLoadStates;
import ja.n0;
import ja.q0;
import ja.s0;
import mu.f0;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import pq.v;
import tq.e;
import tq.i;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u001a\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u0013\u0010\u0012R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR7\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010+\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010.\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lka/a;", "", "T", "Lmu/g;", "Lja/n0;", "flow", "<init>", "(Lmu/g;)V", "Loq/i0;", "n", "()V", "", "index", "f", "(I)Ljava/lang/Object;", "k", "j", "d", "(Ltq/e;)Ljava/lang/Object;", "e", "a", "Lmu/g;", "Ltq/i;", "b", "Ltq/i;", "mainDispatcher", "ka/a$c", "c", "Lka/a$c;", "pagingDataPresenter", "Lja/v;", "<set-?>", "Lm2/a3;", "h", "()Lja/v;", "l", "(Lja/v;)V", "itemSnapshotList", "Lja/i;", "i", "()Lja/i;", "m", "(Lja/i;)V", "loadState", "g", "()I", "itemCount", "paging-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f109310f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g<n0<T>> flow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i mainDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c pagingDataPresenter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 itemSnapshotList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3 loadState;

    /* JADX INFO: renamed from: ka.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class C2607a<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<T> f109316a;

        C2607a(a<T> aVar) {
            this.f109316a = aVar;
        }

        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(CombinedLoadStates combinedLoadStates, e<? super i0> eVar) {
            this.f109316a.m(combinedLoadStates);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lja/n0;", "it", "Loq/i0;", "<anonymous>", "(Lja/n0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends k implements p<n0<T>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a<T> f109319g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T> aVar, e<? super b> eVar) {
            super(2, eVar);
            this.f109319g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109317e;
            if (i15 == 0) {
                u.b(obj);
                n0<T> n0Var = (n0) this.f109318f;
                c cVar = ((a) this.f109319g).pagingDataPresenter;
                this.f109317e = 1;
                if (cVar.o(n0Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(n0<T> n0Var, e<? super i0> eVar) {
            return ((b) v(n0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f109319g, eVar);
            bVar.f109318f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ka/a$c", "Lja/s0;", "Lja/q0;", "event", "Loq/i0;", "s", "(Lja/q0;Ltq/e;)Ljava/lang/Object;", "paging-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends s0<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ a<T> f109320m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<T> aVar, i iVar, n0<T> n0Var) {
            super(iVar, n0Var);
            this.f109320m = aVar;
        }

        @Override // ja.s0
        public Object s(q0<T> q0Var, e<? super i0> eVar) {
            this.f109320m.n();
            return i0.f148189a;
        }
    }

    public a(g<n0<T>> gVar) {
        this.flow = gVar;
        i iVarA = ka.c.a();
        this.mainDispatcher = iVarA;
        c cVar = new c(this, iVarA, gVar instanceof f0 ? (n0) v.n0(((f0) gVar).c()) : null);
        this.pagingDataPresenter = cVar;
        this.itemSnapshotList = c6.e(cVar.w(), null, 2, null);
        CombinedLoadStates value = cVar.q().getValue();
        this.loadState = c6.e(value == null ? new CombinedLoadStates(ka.b.f109322b.getRefresh(), ka.b.f109322b.getPrepend(), ka.b.f109322b.getAppend(), ka.b.f109322b, null, 16, null) : value, null, 2, null);
    }

    private final void l(ja.v<T> vVar) {
        this.itemSnapshotList.setValue(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(CombinedLoadStates combinedLoadStates) {
        this.loadState.setValue(combinedLoadStates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        l(this.pagingDataPresenter.w());
    }

    public final Object d(e<? super i0> eVar) {
        Object objA = mu.i.x(this.pagingDataPresenter.q()).a(new C2607a(this), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    public final Object e(e<? super i0> eVar) {
        Object objJ = mu.i.j(this.flow, new b(this, null), eVar);
        return objJ == uq.b.e() ? objJ : i0.f148189a;
    }

    public final T f(int index) {
        this.pagingDataPresenter.p(index);
        return h().get(index);
    }

    public final int g() {
        return h().size();
    }

    public final ja.v<T> h() {
        return (ja.v) this.itemSnapshotList.getValue();
    }

    public final CombinedLoadStates i() {
        return (CombinedLoadStates) this.loadState.getValue();
    }

    public final void j() {
        this.pagingDataPresenter.t();
    }

    public final void k() {
        this.pagingDataPresenter.u();
    }
}
