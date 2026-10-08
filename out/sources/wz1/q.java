package wz1;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import un0.ElectionSupportsHistory;
import un0.ElectionSupportsHistoryGrantedSupportsByAction;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lwz1/q;", "Ll00/g;", "Lwz1/c;", "Lwz1/a;", "Lwz1/d;", "", "Lxz1/b;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lvn0/c;", "getSupportHistoryUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lwz1/b;", "setupData", "Lyy/a;", "stateMachineFactory", "<init>", "(Lxz1/b;Lib4/c;Lhb4/d;Lvn0/c;Lac4/a;Lwz1/b;Lyy/a;)V", "state", "Lwz1/d$a;", "v9", "(Lwz1/c;)Lwz1/d$a;", "Ldx/b;", "domainError", "retryAction", "Lhb4/c;", "t9", "(Ldx/b;Lwz1/a;)Lhb4/c;", "b", "Lxz1/b;", "c", "Lib4/c;", "d", "Lhb4/d;", "e", "Lvn0/c;", "f", "Lac4/a;", "g", "Lwz1/b;", "Lwz1/c$b;", "h", "Lwz1/c$b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwz1/a$b;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<wz1.c, wz1.a> implements wz1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xz1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vn0.c getSupportHistoryUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wz1.c.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<wz1.c, wz1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wz1.a.b> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<wz1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<wz1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f216056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f216057b;

        /* JADX INFO: renamed from: wz1.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5744a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f216058a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f216059b;

            /* JADX INFO: renamed from: wz1.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5745a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f216060d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f216061e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f216062f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f216064h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f216065j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f216066k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f216067l;

                public C5745a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f216060d = obj;
                    this.f216061e |= PKIFailureInfo.systemUnavail;
                    return C5744a.this.F(null, this);
                }
            }

            public C5744a(mu.h hVar, q qVar) {
                this.f216058a = hVar;
                this.f216059b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5745a c5745a;
                if (eVar instanceof C5745a) {
                    c5745a = (C5745a) eVar;
                    int i15 = c5745a.f216061e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5745a.f216061e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5745a = new C5745a(eVar);
                    }
                } else {
                    c5745a = new C5745a(eVar);
                }
                Object obj2 = c5745a.f216060d;
                Object objE = uq.b.e();
                int i16 = c5745a.f216061e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f216058a;
                    wz1.d.a aVarV9 = this.f216059b.v9((wz1.c) obj);
                    c5745a.f216062f = vq.j.a(obj);
                    c5745a.f216064h = vq.j.a(c5745a);
                    c5745a.f216065j = vq.j.a(obj);
                    c5745a.f216066k = vq.j.a(hVar);
                    c5745a.f216067l = 0;
                    c5745a.f216061e = 1;
                    if (hVar.F(aVarV9, c5745a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f216056a = gVar;
            this.f216057b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wz1.d.a> hVar, tq.e eVar) {
            Object objA = this.f216056a.a(new C5744a(hVar, this.f216057b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwz1/a$b;", "action", "Lwz1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwz1/a$b;Lwz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<wz1.a.b, wz1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216069f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wz1.a.b bVar = (wz1.a.b) this.f216069f;
            Object objE = uq.b.e();
            int i15 = this.f216068e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                this.f216069f = vq.j.a(bVar);
                this.f216068e = 1;
                if (qVar.F(bVar, this) == objE) {
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
        public final Object w(wz1.a.b bVar, wz1.c cVar, tq.e<? super i0> eVar) {
            b bVar2 = q.this.new b(eVar);
            bVar2.f216069f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwz1/c$b;", "state", "Lk10/l;", "Lwz1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<wz1.c.b>, tq.e<? super k10.l<? extends wz1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216072f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwz1/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends wz1.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f216074e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f216075f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<wz1.c.b> f216076g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<wz1.c.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f216075f = qVar;
                this.f216076g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wz1.c.Error X(q qVar, dx.b bVar, wz1.c.b bVar2) {
                return new wz1.c.Error(qVar.t9(bVar, wz1.a.C5739a.f216014a));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wz1.c.Initialized Y(ElectionSupportsHistory electionSupportsHistory, wz1.c.b bVar) {
                return new wz1.c.Initialized(electionSupportsHistory);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f216074e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vn0.c cVar = this.f216075f.getSupportHistoryUC;
                    vn0.c.Params params = new vn0.c.Params(this.f216075f.setupData.getJwtToken());
                    this.f216074e = 1;
                    obj = cVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                c0<wz1.c.b> c0Var = this.f216076g;
                final q qVar = this.f216075f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: wz1.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.c.a.X(qVar, bVar, (c.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final ElectionSupportsHistory electionSupportsHistory = (ElectionSupportsHistory) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: wz1.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.a.Y(electionSupportsHistory, (c.b) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f216075f, this.f216076g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends wz1.c>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f216072f;
            Object objE = uq.b.e();
            int i15 = this.f216071e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.callActionWithLoaderUseCase;
            a aVar2 = new a(q.this, c0Var, null);
            this.f216072f = vq.j.a(c0Var);
            this.f216071e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<wz1.c.b> c0Var, tq.e<? super k10.l<? extends wz1.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f216072f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwz1/a$c;", "action", "Lwz1/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwz1/a$c;Lwz1/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wz1.a.SupportSelect, wz1.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216078f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wz1.a.SupportSelect supportSelect = (wz1.a.SupportSelect) this.f216078f;
            Object objE = uq.b.e();
            int i15 = this.f216077e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                wz1.a.b.Next next = new wz1.a.b.Next(supportSelect.getGrantedSupport());
                this.f216078f = vq.j.a(supportSelect);
                this.f216077e = 1;
                if (qVar.F(next, this) == objE) {
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
        public final Object w(wz1.a.SupportSelect supportSelect, wz1.c.Initialized initialized, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f216078f = supportSelect;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwz1/a$a;", "<unused var>", "Lk10/c0;", "Lwz1/c$a;", "state", "Lk10/l;", "Lwz1/c;", "<anonymous>", "(Lwz1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<wz1.a.C5739a, c0<wz1.c.Error>, tq.e<? super k10.l<? extends wz1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216081f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wz1.c.b O(wz1.c.Error error) {
            return wz1.c.b.f216021a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f216081f;
            uq.b.e();
            if (this.f216080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: wz1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O((c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wz1.a.C5739a c5739a, c0<wz1.c.Error> c0Var, tq.e<? super k10.l<? extends wz1.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f216081f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public q(xz1.b bVar, ib4.c cVar, hb4.d dVar, vn0.c cVar2, ac4.a aVar, SetupData setupData, yy.a aVar2) {
        this.mapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.getSupportHistoryUC = cVar2;
        this.callActionWithLoaderUseCase = aVar;
        this.setupData = setupData;
        wz1.c.b bVar2 = wz1.c.b.f216021a;
        this.initialState = bVar2;
        this.stateMachine = aVar2.a(bVar2, new er.l() { // from class: wz1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f216045a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), v9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(q qVar, z zVar) {
        zVar.A(qVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(q qVar, z zVar) {
        d dVar = qVar.new d(null);
        zVar.x(q0.c(wz1.a.SupportSelect.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(wz1.a.C5739a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c t9(dx.b domainError, final wz1.a retryAction) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: wz1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f216043a, retryAction, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, wz1.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            qVar.d9(aVar);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            qVar.d9(wz1.a.b.C5740a.f216015a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wz1.d.a v9(wz1.c state) {
        return this.mapper.b(new xz1.b.Params(state, b9(wz1.a.b.C5740a.f216015a), new er.l() { // from class: wz1.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f216039a, (ElectionSupportsHistoryGrantedSupportsByAction) obj);
            }
        }, b9(wz1.a.b.C5741b.f216016a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, ElectionSupportsHistoryGrantedSupportsByAction electionSupportsHistoryGrantedSupportsByAction) {
        qVar.d9(new wz1.a.SupportSelect(electionSupportsHistoryGrantedSupportsByAction));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(wz1.c.class), new er.l() { // from class: wz1.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f216040a, (z) obj);
            }
        });
        vVar.c(q0.c(wz1.c.b.class), new er.l() { // from class: wz1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.A9(this.f216041a, (z) obj);
            }
        });
        vVar.c(q0.c(wz1.c.Initialized.class), new er.l() { // from class: wz1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f216042a, (z) obj);
            }
        });
        vVar.c(q0.c(wz1.c.Error.class), new er.l() { // from class: wz1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(wz1.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<wz1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<wz1.c, wz1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wz1.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(wz1.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
