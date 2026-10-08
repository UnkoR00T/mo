package pa2;

import fr.q0;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y92.InstitutionHistoryModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lpa2/q;", "Ll00/g;", "Lpa2/m;", "", "Lpa2/n;", "Lyy/a;", "stateMachineFactory", "Lqa2/a;", "mapper", "Lz92/a;", "loadDataTransferInstitutionHistoryUseCase", "Lez/a;", "currentTimeProvider", "<init>", "(Lyy/a;Lqa2/a;Lz92/a;Lez/a;)V", "state", "Lpa2/n$a;", "l9", "(Lpa2/m;)Lpa2/n$a;", "Loq/i0;", "d", "()V", "b", "Lqa2/a;", "c", "Lz92/a;", "Lez/a;", "Lpa2/m$a;", "e", "Lpa2/m$a;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lpa2/l;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<m, Object> implements n, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qa2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z92.a loadDataTransferInstitutionHistoryUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<m, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<n.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, q.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((q) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f153874b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153875a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f153876b;

            /* JADX INFO: renamed from: pa2.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3809a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153877d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153878e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153879f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153881h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153882j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153883k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153884l;

                public C3809a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153877d = obj;
                    this.f153878e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f153875a = hVar;
                this.f153876b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3809a c3809a;
                if (eVar instanceof C3809a) {
                    c3809a = (C3809a) eVar;
                    int i15 = c3809a.f153878e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3809a.f153878e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3809a = new C3809a(eVar);
                    }
                } else {
                    c3809a = new C3809a(eVar);
                }
                Object obj2 = c3809a.f153877d;
                Object objE = uq.b.e();
                int i16 = c3809a.f153878e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f153875a;
                    n.a aVarL9 = this.f153876b.l9((m) obj);
                    c3809a.f153879f = vq.j.a(obj);
                    c3809a.f153881h = vq.j.a(c3809a);
                    c3809a.f153882j = vq.j.a(obj);
                    c3809a.f153883k = vq.j.a(hVar);
                    c3809a.f153884l = 0;
                    c3809a.f153878e = 1;
                    if (hVar.F(aVarL9, c3809a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, q qVar) {
            this.f153873a = gVar;
            this.f153874b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n.a> hVar, tq.e eVar) {
            Object objA = this.f153873a.a(new a(hVar, this.f153874b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lpa2/m;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<m>, tq.e<? super k10.l<? extends m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153886f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m V(List list, m mVar) {
            return new m.Initialized(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m X(m mVar) {
            return m.a.f153858a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f153886f;
            Object objE = uq.b.e();
            int i15 = this.f153885e;
            if (i15 == 0) {
                oq.u.b(obj);
                z92.a aVar = q.this.loadDataTransferInstitutionHistoryUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f153886f = c0Var;
                this.f153885e = 1;
                obj = aVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            q qVar = q.this;
            final ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (((InstitutionHistoryModel) obj2).getTimestamp() > ez.d.k(qVar.currentTimeProvider.f().minusYears(1L))) {
                    arrayList.add(obj2);
                }
            }
            return !arrayList.isEmpty() ? c0Var.b(new er.l() { // from class: pa2.r
                @Override // er.l
                public final Object b(Object obj3) {
                    return q.c.V(arrayList, (m) obj3);
                }
            }) : c0Var.b(new er.l() { // from class: pa2.s
                @Override // er.l
                public final Object b(Object obj3) {
                    return q.c.X((m) obj3);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<m> c0Var, tq.e<? super k10.l<? extends m>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f153886f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpa2/k;", "<unused var>", "Lpa2/m;", "Loq/i0;", "<anonymous>", "(Lpa2/k;Lpa2/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<k, m, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153888e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153888e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l> bVarY1 = q.this.Y1();
                l.a aVar = l.a.f153857a;
                this.f153888e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(k kVar, m mVar, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, qa2.a aVar2, z92.a aVar3, ez.a aVar4) {
        this.mapper = aVar2;
        this.loadDataTransferInstitutionHistoryUseCase = aVar3;
        this.currentTimeProvider = aVar4;
        m.a aVar5 = m.a.f153858a;
        this.initialState = aVar5;
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: pa2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.n9(this.f153864a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), l9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a l9(m state) {
        return this.mapper.b(new qa2.a.Params(state, new a(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(m.class), new er.l() { // from class: pa2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f153865a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, z zVar) {
        zVar.A(qVar.new c(null));
        d dVar = qVar.new d(null);
        zVar.x(q0.c(k.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<l> Y1() {
        return this.navAction;
    }

    @Override // pa2.n
    public void d() {
        d9(k.f153856a);
    }

    @Override // l00.g
    protected k10.t<m, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
