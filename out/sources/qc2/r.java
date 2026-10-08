package qc2;

import fr.q0;
import hl0.IdCardInvalidationInitData;
import k10.c0;
import k10.z;
import mu.p0;
import ob2.WelcomeData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lqc2/r;", "Ll00/g;", "Lqc2/b;", "Lqc2/a;", "Lqc2/c;", "", "Lyy/a;", "stateMachineFactory", "Lsc2/c;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lrl0/a;", "getIdCardInvalidationInitDataUC", "Lsc2/b;", "errorMapper", "Lrc2/a;", "contract", "<init>", "(Lyy/a;Lsc2/c;Lac4/a;Lrl0/a;Lsc2/b;Lrc2/a;)V", "state", "Lqc2/c$a;", "r9", "(Lqc2/b;)Lqc2/c$a;", "b", "Lsc2/c;", "c", "Lac4/a;", "d", "Lrl0/a;", "e", "Lsc2/b;", "f", "Lrc2/a;", "Lqc2/b$b;", "g", "Lqc2/b$b;", "initialState", "Lxw/b;", "Lqc2/a$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<qc2.b, qc2.a> implements qc2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sc2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rl0.a getIdCardInvalidationInitDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sc2.b errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final rc2.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qc2.b.C4149b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qc2.a.InterfaceC4147a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qc2.b, qc2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<qc2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<qc2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f166019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f166020b;

        /* JADX INFO: renamed from: qc2.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4151a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f166021a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f166022b;

            /* JADX INFO: renamed from: qc2.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4152a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f166023d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166024e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f166025f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f166027h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f166028j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f166029k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f166030l;

                public C4152a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f166023d = obj;
                    this.f166024e |= PKIFailureInfo.systemUnavail;
                    return C4151a.this.F(null, this);
                }
            }

            public C4151a(mu.h hVar, r rVar) {
                this.f166021a = hVar;
                this.f166022b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4152a c4152a;
                if (eVar instanceof C4152a) {
                    c4152a = (C4152a) eVar;
                    int i15 = c4152a.f166024e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4152a.f166024e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4152a = new C4152a(eVar);
                    }
                } else {
                    c4152a = new C4152a(eVar);
                }
                Object obj2 = c4152a.f166023d;
                Object objE = uq.b.e();
                int i16 = c4152a.f166024e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f166021a;
                    qc2.c.a aVarR9 = this.f166022b.r9((qc2.b) obj);
                    c4152a.f166025f = vq.j.a(obj);
                    c4152a.f166027h = vq.j.a(c4152a);
                    c4152a.f166028j = vq.j.a(obj);
                    c4152a.f166029k = vq.j.a(hVar);
                    c4152a.f166030l = 0;
                    c4152a.f166024e = 1;
                    if (hVar.F(aVarR9, c4152a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f166019a = gVar;
            this.f166020b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qc2.c.a> hVar, tq.e eVar) {
            Object objA = this.f166019a.a(new C4151a(hVar, this.f166020b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqc2/a$b;", "<unused var>", "Lqc2/b;", "Loq/i0;", "<anonymous>", "(Lqc2/a$b;Lqc2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<qc2.a.b, qc2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166031e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166031e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qc2.a.InterfaceC4147a> bVarY1 = r.this.Y1();
                qc2.a.InterfaceC4147a.C4148a c4148a = qc2.a.InterfaceC4147a.C4148a.f165977a;
                this.f166031e = 1;
                if (bVarY1.F(c4148a, this) == objE) {
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
        public final Object w(qc2.a.b bVar, qc2.b bVar2, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqc2/a$c;", "action", "Lqc2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqc2/a$c;Lqc2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qc2.a.OnError, qc2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166034f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qc2.a.InterfaceC4147a error;
            qc2.a.OnError onError = (qc2.a.OnError) this.f166034f;
            Object objE = uq.b.e();
            int i15 = this.f166033e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qc2.a.InterfaceC4147a> bVarY1 = r.this.Y1();
                sc2.b.c cVarB = r.this.errorMapper.b(onError.getParams());
                if (cVarB instanceof sc2.b.c.CustomError) {
                    error = new qc2.a.InterfaceC4147a.CustomError(((sc2.b.c.CustomError) cVarB).getData());
                } else {
                    if (!(cVarB instanceof sc2.b.c.Error)) {
                        throw new oq.p();
                    }
                    error = new qc2.a.InterfaceC4147a.Error(((sc2.b.c.Error) cVarB).getErrorData());
                }
                this.f166034f = vq.j.a(onError);
                this.f166033e = 1;
                if (bVarY1.F(error, this) == objE) {
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
        public final Object w(qc2.a.OnError onError, qc2.b bVar, tq.e<? super i0> eVar) {
            c cVar = r.this.new c(eVar);
            cVar.f166034f = onError;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqc2/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lqc2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<qc2.b.C4149b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166036e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166036e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(qc2.a.d.f165983a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(qc2.b.C4149b c4149b, tq.e<? super i0> eVar) {
            return ((d) v(c4149b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqc2/a$d;", "action", "Lk10/c0;", "Lqc2/b$b;", "state", "Lk10/l;", "Lqc2/b;", "<anonymous>", "(Lqc2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qc2.a.d, c0<qc2.b.C4149b>, tq.e<? super k10.l<? extends qc2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166040g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqc2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qc2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f166042e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f166043f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ qc2.a.d f166044g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<qc2.b.C4149b> f166045h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, qc2.a.d dVar, c0<qc2.b.C4149b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f166043f = rVar;
                this.f166044g = dVar;
                this.f166045h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qc2.b.Initialized V(IdCardInvalidationInitData idCardInvalidationInitData, qc2.b.C4149b c4149b) {
                return new qc2.b.Initialized(idCardInvalidationInitData);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f166042e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    rl0.a aVar = this.f166043f.getIdCardInvalidationInitDataUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f166042e = 1;
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
                dx.i iVar = (dx.i) obj;
                r rVar = this.f166043f;
                qc2.a.d dVar = this.f166044g;
                c0<qc2.b.C4149b> c0Var = this.f166045h;
                if (iVar instanceof dx.i.Left) {
                    rVar.d9(new qc2.a.OnError(new sc2.b.Params((dx.b) ((dx.i.Left) iVar).b(), rVar.b9(dVar), rVar.b9(qc2.a.b.f165981a))));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final IdCardInvalidationInitData idCardInvalidationInitData = (IdCardInvalidationInitData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: qc2.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.e.a.V(idCardInvalidationInitData, (b.C4149b) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f166043f, this.f166044g, this.f166045h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qc2.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qc2.a.d dVar = (qc2.a.d) this.f166039f;
            c0 c0Var = (c0) this.f166040g;
            Object objE = uq.b.e();
            int i15 = this.f166038e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, dVar, c0Var, null);
            this.f166039f = vq.j.a(dVar);
            this.f166040g = vq.j.a(c0Var);
            this.f166038e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qc2.a.d dVar, c0<qc2.b.C4149b> c0Var, tq.e<? super k10.l<? extends qc2.b>> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f166039f = dVar;
            eVar2.f166040g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqc2/a$e;", "<unused var>", "Lqc2/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lqc2/a$e;Lqc2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qc2.a.e, qc2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166047f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qc2.b.Initialized initialized = (qc2.b.Initialized) this.f166047f;
            Object objE = uq.b.e();
            int i15 = this.f166046e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.contract.u4(new WelcomeData(initialized.getData()));
                xw.b<qc2.a.InterfaceC4147a> bVarY1 = r.this.Y1();
                qc2.a.InterfaceC4147a.d dVar = qc2.a.InterfaceC4147a.d.f165980a;
                this.f166047f = vq.j.a(initialized);
                this.f166046e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(qc2.a.e eVar, qc2.b.Initialized initialized, tq.e<? super i0> eVar2) {
            f fVar = r.this.new f(eVar2);
            fVar.f166047f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, sc2.c cVar, ac4.a aVar2, rl0.a aVar3, sc2.b bVar, rc2.a aVar4) {
        this.mapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getIdCardInvalidationInitDataUC = aVar3;
        this.errorMapper = bVar;
        this.contract = aVar4;
        qc2.b.C4149b c4149b = qc2.b.C4149b.f165986a;
        this.initialState = c4149b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c4149b, new er.l() { // from class: qc2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f166009a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), r9(c4149b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qc2.c.a r9(qc2.b state) {
        return this.mapper.b(new sc2.c.Params(state, b9(qc2.a.e.f165984a), b9(qc2.a.b.f165981a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(qc2.b.class), new er.l() { // from class: qc2.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f166006a, (z) obj);
            }
        });
        vVar.c(q0.c(qc2.b.C4149b.class), new er.l() { // from class: qc2.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f166007a, (z) obj);
            }
        });
        vVar.c(q0.c(qc2.b.Initialized.class), new er.l() { // from class: qc2.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f166008a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qc2.a.b.class), oVar, bVar);
        zVar.x(q0.c(qc2.a.OnError.class), oVar, rVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(r rVar, z zVar) {
        zVar.C(rVar.new d(null));
        e eVar = rVar.new e(null);
        zVar.v(q0.c(qc2.a.d.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, z zVar) {
        f fVar = rVar.new f(null);
        zVar.x(q0.c(qc2.a.e.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qc2.a.InterfaceC4147a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<qc2.b, qc2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qc2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(rc2.a aVar) {
        super.P5(aVar);
    }
}
