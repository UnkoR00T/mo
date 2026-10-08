package nn2;

import cu0.BadDomainReport;
import cu0.IncidentId;
import cu0.ReportedIncidentReference;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lnn2/m;", "Ll00/g;", "Lnn2/b;", "Lnn2/a;", "Lnn2/c;", "", "Lyy/a;", "stateMachineFactory", "Lnn2/d;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Leu0/b;", "beGetIncidentIdUC", "Lac4/a;", "callActionWithLoaderUseCase", "Leu0/d;", "beSendBadDomainReportUC", "Lon2/a;", "contract", "<init>", "(Lyy/a;Lnn2/d;Lib4/c;Leu0/b;Lac4/a;Leu0/d;Lon2/a;)V", "state", "Lnn2/c$a;", "q9", "(Lnn2/b;)Lnn2/c$a;", "b", "Lnn2/d;", "c", "Lib4/c;", "d", "Leu0/b;", "e", "Lac4/a;", "f", "Leu0/d;", "g", "Lon2/a;", "h", "Lnn2/b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lnn2/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, nn2.a> implements nn2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nn2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final eu0.b beGetIncidentIdUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final eu0.d beSendBadDomainReportUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final on2.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<State, nn2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<nn2.c.Data> state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nn2.a.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<nn2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f137365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f137366b;

        /* JADX INFO: renamed from: nn2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3389a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f137367a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f137368b;

            /* JADX INFO: renamed from: nn2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3390a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f137369d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f137370e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f137371f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f137373h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f137374j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f137375k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f137376l;

                public C3390a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f137369d = obj;
                    this.f137370e |= PKIFailureInfo.systemUnavail;
                    return C3389a.this.F(null, this);
                }
            }

            public C3389a(mu.h hVar, m mVar) {
                this.f137367a = hVar;
                this.f137368b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3390a c3390a;
                if (eVar instanceof C3390a) {
                    c3390a = (C3390a) eVar;
                    int i15 = c3390a.f137370e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3390a.f137370e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3390a = new C3390a(eVar);
                    }
                } else {
                    c3390a = new C3390a(eVar);
                }
                Object obj2 = c3390a.f137369d;
                Object objE = uq.b.e();
                int i16 = c3390a.f137370e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f137367a;
                    nn2.c.Data dataQ9 = this.f137368b.q9((State) obj);
                    c3390a.f137371f = vq.j.a(obj);
                    c3390a.f137373h = vq.j.a(c3390a);
                    c3390a.f137374j = vq.j.a(obj);
                    c3390a.f137375k = vq.j.a(hVar);
                    c3390a.f137376l = 0;
                    c3390a.f137370e = 1;
                    if (hVar.F(dataQ9, c3390a) == objE) {
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
            this.f137365a = gVar;
            this.f137366b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super nn2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f137365a.a(new C3389a(hVar, this.f137366b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnn2/a$b;", "action", "Lnn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnn2/a$b;Lnn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<nn2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137378f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nn2.a.b bVar = (nn2.a.b) this.f137378f;
            Object objE = uq.b.e();
            int i15 = this.f137377e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f137378f = vq.j.a(bVar);
                this.f137377e = 1;
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
        public final Object w(nn2.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = m.this.new b(eVar);
            bVar2.f137378f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnn2/a$a;", "action", "Lnn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnn2/a$a;Lnn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<nn2.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137381f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, nn2.a.Error error, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                mVar.d9(error.getRetryAction());
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nn2.a.Error error = (nn2.a.Error) this.f137381f;
            Object objE = uq.b.e();
            int i15 = this.f137380e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ib4.c cVar = m.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final m mVar2 = m.this;
                nn2.a.b.ToError toError = new nn2.a.b.ToError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: nn2.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.c.O(mVar2, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f137381f = vq.j.a(error);
                this.f137380e = 1;
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
        public final Object w(nn2.a.Error error, State state, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f137381f = error;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnn2/a$c;", "action", "Lnn2/b;", "state", "Loq/i0;", "<anonymous>", "(Lnn2/a$c;Lnn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<nn2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f137385g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f137387e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f137388f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f137389g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f137390h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f137391j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f137392k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f137393l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ m f137394m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ nn2.a.c f137395n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ State f137396p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, nn2.a.c cVar, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f137394m = mVar;
                this.f137395n = cVar;
                this.f137396p = state;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
            /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                m mVar;
                nn2.a.c cVar;
                dx.i iVar;
                Object objE = uq.b.e();
                int i15 = this.f137393l;
                if (i15 == 0) {
                    u.b(obj);
                    eu0.b bVar = this.f137394m.beGetIncidentIdUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f137393l = 1;
                    obj = bVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (nn2.a.c) this.f137389g;
                    mVar = (m) this.f137388f;
                    u.b(obj);
                }
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    mVar.d9(new nn2.a.Error((dx.b) ((dx.i.Left) iVar).b(), cVar));
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    mVar.d9(new nn2.a.Success((ReportedIncidentReference) ((dx.i.Right) iVar).b()));
                }
                return i0.f148189a;
                dx.i iVar2 = (dx.i) obj;
                mVar = this.f137394m;
                nn2.a.c cVar2 = this.f137395n;
                State state = this.f137396p;
                if (!(iVar2 instanceof dx.i.Left)) {
                    if (!(iVar2 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    IncidentId incidentId = (IncidentId) ((dx.i.Right) iVar2).b();
                    eu0.d dVar = mVar.beSendBadDomainReportUC;
                    List<String> listC = state.c();
                    String issueDescription = state.getIssueDescription();
                    String email = state.getContactData().getEmail();
                    if (state.getContactData().getIsAnonymous()) {
                        email = null;
                    }
                    eu0.d.Params params = new eu0.d.Params(incidentId, new BadDomainReport(listC, issueDescription, email));
                    this.f137387e = vq.j.a(iVar2);
                    this.f137388f = mVar;
                    this.f137389g = cVar2;
                    this.f137390h = vq.j.a(incidentId);
                    this.f137391j = 0;
                    this.f137392k = 0;
                    this.f137393l = 2;
                    obj = dVar.c(params, this);
                    if (obj != objE) {
                        cVar = cVar2;
                        iVar = (dx.i) obj;
                        if (iVar instanceof dx.i.Left) {
                            mVar.d9(new nn2.a.Error((dx.b) ((dx.i.Left) iVar).b(), cVar));
                        } else {
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            mVar.d9(new nn2.a.Success((ReportedIncidentReference) ((dx.i.Right) iVar).b()));
                        }
                    }
                    return objE;
                }
                mVar.d9(new nn2.a.Error((dx.b) ((dx.i.Left) iVar2).b(), cVar2));
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f137394m, this.f137395n, this.f137396p, eVar);
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
            nn2.a.c cVar = (nn2.a.c) this.f137384f;
            State state = (State) this.f137385g;
            Object objE = uq.b.e();
            int i15 = this.f137383e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = m.this.callActionWithLoaderUseCase;
                a aVar2 = new a(m.this, cVar, state, null);
                this.f137384f = vq.j.a(cVar);
                this.f137385g = vq.j.a(state);
                this.f137383e = 1;
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
        public final Object w(nn2.a.c cVar, State state, tq.e<? super i0> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f137384f = cVar;
            dVar.f137385g = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnn2/a$d;", "action", "Lnn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnn2/a$d;Lnn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<nn2.a.Success, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137398f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nn2.a.Success success = (nn2.a.Success) this.f137398f;
            Object objE = uq.b.e();
            int i15 = this.f137397e;
            if (i15 == 0) {
                u.b(obj);
                m.this.contract.t();
                m mVar = m.this;
                nn2.a.b.ToSuccess toSuccess = new nn2.a.b.ToSuccess(success.getReportedIncidentReference());
                this.f137398f = vq.j.a(success);
                this.f137397e = 1;
                if (mVar.F(toSuccess, this) == objE) {
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
        public final Object w(nn2.a.Success success, State state, tq.e<? super i0> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f137398f = success;
            return eVar2.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, nn2.d dVar, ib4.c cVar, eu0.b bVar, ac4.a aVar2, eu0.d dVar2, on2.a aVar3) {
        this.mapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.beGetIncidentIdUC = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.beSendBadDomainReportUC = dVar2;
        this.contract = aVar3;
        on2.a.SummaryData summaryDataC = aVar3.c();
        State state = new State(summaryDataC.c(), summaryDataC.getIssueDescription(), summaryDataC.getContactData());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: nn2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(this.f137354a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), q9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nn2.c.Data q9(State state) {
        return this.mapper.b(new nn2.d.Params(state, b9(nn2.a.c.f137325a), b9(nn2.a.b.C3387a.f137321a), b9(nn2.a.b.C3388b.f137322a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: nn2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(this.f137353a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(nn2.a.b.class), oVar, bVar);
        zVar.x(q0.c(nn2.a.Error.class), oVar, mVar.new c(null));
        zVar.x(q0.c(nn2.a.c.class), oVar, mVar.new d(null));
        zVar.x(q0.c(nn2.a.Success.class), oVar, mVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<nn2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, nn2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<nn2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(nn2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(on2.a aVar) {
        super.P5(aVar);
    }
}
