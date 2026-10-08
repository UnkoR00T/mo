package nr1;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001b098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lnr1/h0;", "Ll00/g;", "Lnr1/l;", "", "Lnr1/m;", "Lyy/a;", "stateMachineFactory", "Lor1/a;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lnr1/o;", "developerPagingMonitorUC", "Lnr1/n;", "developerPagingLoadUC", "<init>", "(Lyy/a;Lor1/a;Lhb4/d;Lib4/c;Lnr1/o;Lnr1/n;)V", "Lfy/c;", "Lnr1/a;", "pageState", "Lk10/c0;", "state", "Lk10/l;", "t9", "(Lfy/c;Lk10/c0;)Lk10/l;", "Lnr1/m$a;", "s9", "(Lnr1/l;)Lnr1/m$a;", "b", "Lor1/a;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lnr1/o;", "f", "Lnr1/n;", "Lnr1/l$d;", "g", "Lnr1/l$d;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lnr1/k;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<l, Object> implements m, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final or1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o developerPagingMonitorUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n developerPagingLoadUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final l.d initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<l, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<m.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<m.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f137909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f137910b;

        /* JADX INFO: renamed from: nr1.h0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3402a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f137911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f137912b;

            /* JADX INFO: renamed from: nr1.h0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3403a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f137913d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f137914e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f137915f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f137917h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f137918j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f137919k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f137920l;

                public C3403a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f137913d = obj;
                    this.f137914e |= PKIFailureInfo.systemUnavail;
                    return C3402a.this.F(null, this);
                }
            }

            public C3402a(mu.h hVar, h0 h0Var) {
                this.f137911a = hVar;
                this.f137912b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3403a c3403a;
                if (eVar instanceof C3403a) {
                    c3403a = (C3403a) eVar;
                    int i15 = c3403a.f137914e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3403a.f137914e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3403a = new C3403a(eVar);
                    }
                } else {
                    c3403a = new C3403a(eVar);
                }
                Object obj2 = c3403a.f137913d;
                Object objE = uq.b.e();
                int i16 = c3403a.f137914e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f137911a;
                    m.a aVarS9 = this.f137912b.s9((l) obj);
                    c3403a.f137915f = vq.j.a(obj);
                    c3403a.f137917h = vq.j.a(c3403a);
                    c3403a.f137918j = vq.j.a(obj);
                    c3403a.f137919k = vq.j.a(hVar);
                    c3403a.f137920l = 0;
                    c3403a.f137914e = 1;
                    if (hVar.F(aVarS9, c3403a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, h0 h0Var) {
            this.f137909a = gVar;
            this.f137910b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super m.a> hVar, tq.e eVar) {
            Object objA = this.f137909a.a(new C3402a(hVar, this.f137910b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.a implements er.q<fy.c<Cheese>, k10.c0<l>, tq.e<? super k10.l<? extends l>>, Object> {
        b(Object obj) {
            super(3, obj, h0.class, "mapPagingToState", "mapPagingToState(Lpl/gov/coi/common/domain/paging/PageState;Lpl/gov/coi/common/statemachine/State;)Lpl/gov/coi/common/statemachine/ChangedState;", 4);
        }

        @Override // er.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object w(fy.c<Cheese> cVar, k10.c0<l> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            return h0.B9((h0) this.f66376a, cVar, c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnr1/k;", "action", "Lnr1/l;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnr1/k;Lnr1/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<k, l, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137922f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k kVar = (k) this.f137922f;
            Object objE = uq.b.e();
            int i15 = this.f137921e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<k> bVarY1 = h0.this.Y1();
                this.f137922f = vq.j.a(kVar);
                this.f137921e = 1;
                if (bVarY1.F(kVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(k kVar, l lVar, tq.e<? super oq.i0> eVar) {
            c cVar = h0.this.new c(eVar);
            cVar.f137922f = kVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnr1/l$d;", "it", "Loq/i0;", "<anonymous>", "(Lnr1/l$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<l.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137924e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137924e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = h0.this.developerPagingLoadUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f137924e = 1;
                if (nVar.a(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(l.d dVar, tq.e<? super oq.i0> eVar) {
            return ((d) v(dVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return h0.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnr1/j;", "<unused var>", "Lnr1/l$a;", "Loq/i0;", "<anonymous>", "(Lnr1/j;Lnr1/l$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<j, l.Content, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137926e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137926e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = h0.this.developerPagingLoadUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f137926e = 1;
                if (nVar.a(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j jVar, l.Content content, tq.e<? super oq.i0> eVar) {
            return h0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnr1/j;", "<unused var>", "Lnr1/l$c;", "Loq/i0;", "<anonymous>", "(Lnr1/j;Lnr1/l$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<j, l.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137928e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f137928e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = h0.this.developerPagingLoadUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f137928e = 1;
                if (nVar.a(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j jVar, l.Error error, tq.e<? super oq.i0> eVar) {
            return h0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnr1/i;", "action", "Lk10/c0;", "Lnr1/l$c;", "state", "Lk10/l;", "Lnr1/l;", "<anonymous>", "(Lnr1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<CloseError, k10.c0<l.Error>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137932g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Content O(CloseError closeError, l.Error error) {
            return new l.Content(closeError.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CloseError closeError = (CloseError) this.f137931f;
            k10.c0 c0Var = (k10.c0) this.f137932g;
            uq.b.e();
            if (this.f137930e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: nr1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.g.O(closeError, (l.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CloseError closeError, k10.c0<l.Error> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            g gVar = new g(eVar);
            gVar.f137931f = closeError;
            gVar.f137932g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    public h0(yy.a aVar, or1.a aVar2, hb4.d dVar, ib4.c cVar, o oVar, n nVar) {
        this.mapper = aVar2;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        this.developerPagingMonitorUC = oVar;
        this.developerPagingLoadUC = nVar;
        l.d dVar2 = l.d.f137941a;
        this.initialState = dVar2;
        this.stateMachine = aVar.a(dVar2, new er.l() { // from class: nr1.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.z9(this.f137967a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(dVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(h0 h0Var, k10.z zVar) {
        k10.k.m(zVar, h0Var.developerPagingMonitorUC.b(gz.b.a.C1792a.f78542a), null, new b(h0Var), 2, null);
        c cVar = h0Var.new c(null);
        zVar.x(q0.c(k.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object B9(h0 h0Var, fy.c cVar, k10.c0 c0Var, tq.e eVar) {
        return h0Var.t9(cVar, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(h0 h0Var, k10.z zVar) {
        zVar.C(h0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(h0 h0Var, k10.z zVar) {
        e eVar = h0Var.new e(null);
        zVar.x(q0.c(j.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(h0 h0Var, k10.z zVar) {
        f fVar = h0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(j.class), oVar, fVar);
        zVar.v(q0.c(CloseError.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.a s9(l lVar) {
        return this.mapper.b(new or1.a.Params(lVar, b9(j.f137935a), b9(k.a.f137936a)));
    }

    private final k10.l<l> t9(final fy.c<Cheese> pageState, k10.c0<l> state) {
        px.f.f163100a.b("Map pageState: " + pageState, px.c.a(this));
        if (pageState instanceof fy.c.Initial) {
            return state.c();
        }
        if (pageState instanceof fy.c.Content) {
            return state.d(new er.l() { // from class: nr1.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.u9(pageState, (l) obj);
                }
            });
        }
        if (pageState instanceof fy.c.Error) {
            return state.d(new er.l() { // from class: nr1.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.v9(this.f137886a, pageState, (l) obj);
                }
            });
        }
        if (pageState instanceof fy.c.Loading) {
            return ((fy.c.Loading) pageState).getPage().a().isEmpty() ? state.c() : state.d(new er.l() { // from class: nr1.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.x9(pageState, (l) obj);
                }
            });
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l u9(fy.c cVar, l lVar) {
        return ((fy.c.Content) cVar).getPage().a().isEmpty() ? l.b.f137939a : new l.Content(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l.Error v9(final h0 h0Var, final fy.c cVar, l lVar) {
        return new l.Error(h0Var.errorVMSFactory.a(h0Var.errorMapper.b(new ib4.c.Params(((fy.c.Error) cVar).getError(), false, new er.l() { // from class: nr1.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.w9(this.f137896a, cVar, (ib4.c.b) obj);
            }
        }, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(h0 h0Var, fy.c cVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            h0Var.d9(j.f137935a);
        } else {
            h0Var.d9(new CloseError(cVar));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l.Content x9(fy.c cVar, l lVar) {
        return new l.Content(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(final h0 h0Var, k10.v vVar) {
        vVar.c(q0.c(l.class), new er.l() { // from class: nr1.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.A9(this.f137968a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l.d.class), new er.l() { // from class: nr1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.C9(this.f137860a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l.Content.class), new er.l() { // from class: nr1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.D9(this.f137863a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l.Error.class), new er.l() { // from class: nr1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.E9(this.f137883a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<k> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<l, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
