package cn2;

import cu0.IllegalContentReport;
import fr.q0;
import java.util.List;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcn2/m;", "Ll00/g;", "Lcn2/b;", "Lcn2/a;", "Lcn2/c;", "", "Lyy/a;", "stateMachineFactory", "Lcn2/d;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Leu0/f;", "beSendIllegalContentReportUC", "Ldn2/a;", "contract", "<init>", "(Lyy/a;Lcn2/d;Lib4/c;Lac4/a;Leu0/f;Ldn2/a;)V", "state", "Lcn2/c$a;", "p9", "(Lcn2/b;)Lcn2/c$a;", "b", "Lcn2/d;", "c", "Lib4/c;", "d", "Lac4/a;", "e", "Leu0/f;", "f", "Ldn2/a;", "g", "Lcn2/b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lcn2/a$b;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, cn2.a> implements cn2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cn2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final eu0.f beSendIllegalContentReportUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dn2.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, cn2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<cn2.c.Data> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cn2.a.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<cn2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f28367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f28368b;

        /* JADX INFO: renamed from: cn2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0732a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f28369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f28370b;

            /* JADX INFO: renamed from: cn2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0733a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f28371d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f28372e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f28373f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f28375h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f28376j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f28377k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f28378l;

                public C0733a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f28371d = obj;
                    this.f28372e |= PKIFailureInfo.systemUnavail;
                    return C0732a.this.F(null, this);
                }
            }

            public C0732a(mu.h hVar, m mVar) {
                this.f28369a = hVar;
                this.f28370b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0733a c0733a;
                if (eVar instanceof C0733a) {
                    c0733a = (C0733a) eVar;
                    int i15 = c0733a.f28372e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0733a.f28372e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0733a = new C0733a(eVar);
                    }
                } else {
                    c0733a = new C0733a(eVar);
                }
                Object obj2 = c0733a.f28371d;
                Object objE = uq.b.e();
                int i16 = c0733a.f28372e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f28369a;
                    cn2.c.Data dataP9 = this.f28370b.p9((State) obj);
                    c0733a.f28373f = vq.j.a(obj);
                    c0733a.f28375h = vq.j.a(c0733a);
                    c0733a.f28376j = vq.j.a(obj);
                    c0733a.f28377k = vq.j.a(hVar);
                    c0733a.f28378l = 0;
                    c0733a.f28372e = 1;
                    if (hVar.F(dataP9, c0733a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, m mVar) {
            this.f28367a = gVar;
            this.f28368b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super cn2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f28367a.a(new C0732a(hVar, this.f28368b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcn2/a$b;", "action", "Lcn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcn2/a$b;Lcn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<cn2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28380f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cn2.a.b bVar = (cn2.a.b) this.f28380f;
            Object objE = uq.b.e();
            int i15 = this.f28379e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f28380f = vq.j.a(bVar);
                this.f28379e = 1;
                if (mVar.F(bVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cn2.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = m.this.new b(eVar);
            bVar2.f28380f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcn2/a$a;", "action", "Lcn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcn2/a$a;Lcn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<cn2.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28383f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, cn2.a.Error error, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                mVar.d9(error.getRetryAction());
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cn2.a.Error error = (cn2.a.Error) this.f28383f;
            Object objE = uq.b.e();
            int i15 = this.f28382e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ib4.c cVar = m.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final m mVar2 = m.this;
                cn2.a.b.ToError toError = new cn2.a.b.ToError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: cn2.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.c.O(mVar2, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f28383f = vq.j.a(error);
                this.f28382e = 1;
                if (mVar.F(toError, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cn2.a.Error error, State state, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f28383f = error;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcn2/a$c;", "action", "Lcn2/b;", "state", "Loq/i0;", "<anonymous>", "(Lcn2/a$c;Lcn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<cn2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f28387g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28389e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f28390f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ State f28391g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ cn2.a.c f28392h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, State state, cn2.a.c cVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f28390f = mVar;
                this.f28391g = state;
                this.f28392h = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f28389e;
                if (i15 == 0) {
                    u.b(obj);
                    eu0.f fVar = this.f28390f.beSendIllegalContentReportUC;
                    List<String> listB = this.f28391g.b();
                    String issueDescription = this.f28391g.getIssueDescription();
                    if (this.f28391g.getIssueDescription().length() <= 0) {
                        issueDescription = null;
                    }
                    eu0.f.Params params = new eu0.f.Params(new IllegalContentReport(listB, issueDescription, !this.f28391g.getContactData().getIsAnonymous() ? this.f28391g.getContactData().getEmail() : null, null, 8, null));
                    this.f28389e = 1;
                    obj = fVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                m mVar = this.f28390f;
                cn2.a.c cVar = this.f28392h;
                if (iVar instanceof dx.i.Left) {
                    mVar.d9(new cn2.a.Error((dx.b) ((dx.i.Left) iVar).b(), cVar));
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    mVar.d9(cn2.a.d.f28329a);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f28390f, this.f28391g, this.f28392h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cn2.a.c cVar = (cn2.a.c) this.f28386f;
            State state = (State) this.f28387g;
            Object objE = uq.b.e();
            int i15 = this.f28385e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = m.this.callActionWithLoaderUseCase;
                a aVar2 = new a(m.this, state, cVar, null);
                this.f28386f = vq.j.a(cVar);
                this.f28387g = vq.j.a(state);
                this.f28385e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cn2.a.c cVar, State state, tq.e<? super i0> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f28386f = cVar;
            dVar.f28387g = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcn2/a$d;", "<unused var>", "Lcn2/b;", "Loq/i0;", "<anonymous>", "(Lcn2/a$d;Lcn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<cn2.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28393e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f28393e;
            if (i15 == 0) {
                u.b(obj);
                m.this.contract.t();
                m mVar = m.this;
                cn2.a.b.d dVar = cn2.a.b.d.f28327a;
                this.f28393e = 1;
                if (mVar.F(dVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cn2.a.d dVar, State state, tq.e<? super i0> eVar) {
            return m.this.new e(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, cn2.d dVar, ib4.c cVar, ac4.a aVar2, eu0.f fVar, dn2.a aVar3) {
        this.mapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.beSendIllegalContentReportUC = fVar;
        this.contract = aVar3;
        dn2.a.SummaryData summaryDataC = aVar3.c();
        State state = new State(summaryDataC.b(), summaryDataC.getIssueDescription(), summaryDataC.getContactData());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: cn2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f28357a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cn2.c.Data p9(State state) {
        return this.mapper.b(new cn2.d.Params(state, b9(cn2.a.c.f28328a), b9(cn2.a.b.C0730a.f28324a), b9(cn2.a.b.C0731b.f28325a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: cn2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(this.f28356a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cn2.a.b.class), oVar, bVar);
        zVar.x(q0.c(cn2.a.Error.class), oVar, mVar.new c(null));
        zVar.x(q0.c(cn2.a.c.class), oVar, mVar.new d(null));
        zVar.x(q0.c(cn2.a.d.class), oVar, mVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<cn2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, cn2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<cn2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(cn2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(dn2.a aVar) {
        super.P5(aVar);
    }
}
