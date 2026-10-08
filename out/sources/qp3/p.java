package qp3;

import a14.w;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oo0.IdeaVoteRound;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BA\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J8\u0010)\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020!0&2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020!0&H\u0082@¢\u0006\u0004\b)\u0010*J\u0018\u0010-\u001a\u00020!2\u0006\u0010,\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010N\u001a\b\u0012\u0004\u0012\u00020I0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020P0O8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010Q¨\u0006S"}, d2 = {"Lqp3/p;", "Ll00/g;", "Lqp3/b;", "Lqp3/a;", "Lqp3/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lrp3/a;", "screenMapper", "La14/w;", "openUrlIntentUseCase", "Lpo0/b;", "fetchIdeaVoteRoundActive", "snackBarManagerStateHolder", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lyy/a;Lrp3/a;La14/w;Lpo0/b;Li70/n;Lib4/c;Lac4/a;)V", "state", "Lqp3/c$a;", "x9", "(Lqp3/b;)Lqp3/c$a;", "Lk10/c0;", "Lqp3/b$a;", "Lk10/l;", "u9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "", "url", "Loq/i0;", "z9", "(Ljava/lang/String;)V", "Ldx/b;", "domainError", "Lkotlin/Function0;", "retryAction", "closeAction", "v9", "(Ldx/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lrp3/a;", "c", "La14/w;", "d", "Lpo0/b;", "e", "Li70/n;", "f", "Lib4/c;", "g", "Lac4/a;", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lqp3/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<qp3.b, qp3.a> implements qp3.c, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rp3.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final po0.b fetchIdeaVoteRoundActive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<qp3.b, qp3.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<qp3.c.a> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qp3.a.c> navAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqp3/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qp3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f167976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f167977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f167978h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f167979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f167980k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c0<qp3.b.a> f167982m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<qp3.b.a> c0Var, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f167982m = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qp3.b.Initialized V(IdeaVoteRound ideaVoteRound, qp3.b.a aVar) {
            return new qp3.b.Initialized(ideaVoteRound);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0<qp3.b.a> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f167980k;
            if (i15 == 0) {
                u.b(obj);
                po0.b bVar = p.this.fetchIdeaVoteRoundActive;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f167980k = 1;
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
                c0Var = (c0) this.f167976f;
                u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            p pVar = p.this;
            c0<qp3.b.a> c0Var2 = this.f167982m;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final IdeaVoteRound ideaVoteRound = (IdeaVoteRound) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: qp3.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.a.V(ideaVoteRound, (b.a) obj2);
                    }
                });
            }
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            er.a aVarB9 = pVar.b9(qp3.a.b.f167936a);
            er.a aVarB10 = pVar.b9(qp3.a.C4237a.f167935a);
            this.f167975e = vq.j.a(iVar);
            this.f167976f = c0Var2;
            this.f167977g = vq.j.a(bVar2);
            this.f167978h = 0;
            this.f167979j = 0;
            this.f167980k = 2;
            if (pVar.v9(bVar2, aVarB9, aVarB10, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return p.this.new a(this.f167982m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<? extends qp3.b>> eVar) {
            return ((a) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167983e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f167985g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f167985g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167983e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = p.this.openUrlIntentUseCase;
                w.Params params = new w.Params(this.f167985g, false, 2, null);
                this.f167983e = 1;
                obj = wVar.c(params, this);
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
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new b(this.f167985g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<qp3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f167986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f167987b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f167988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f167989b;

            /* JADX INFO: renamed from: qp3.p$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4241a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f167990d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f167991e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f167992f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f167994h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f167995j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f167996k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f167997l;

                public C4241a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f167990d = obj;
                    this.f167991e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f167988a = hVar;
                this.f167989b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4241a c4241a;
                if (eVar instanceof C4241a) {
                    c4241a = (C4241a) eVar;
                    int i15 = c4241a.f167991e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4241a.f167991e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4241a = new C4241a(eVar);
                    }
                } else {
                    c4241a = new C4241a(eVar);
                }
                Object obj2 = c4241a.f167990d;
                Object objE = uq.b.e();
                int i16 = c4241a.f167991e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f167988a;
                    qp3.c.a aVarX9 = this.f167989b.x9((qp3.b) obj);
                    c4241a.f167992f = vq.j.a(obj);
                    c4241a.f167994h = vq.j.a(c4241a);
                    c4241a.f167995j = vq.j.a(obj);
                    c4241a.f167996k = vq.j.a(hVar);
                    c4241a.f167997l = 0;
                    c4241a.f167991e = 1;
                    if (hVar.F(aVarX9, c4241a) == objE) {
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

        public c(mu.g gVar, p pVar) {
            this.f167986a = gVar;
            this.f167987b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qp3.c.a> hVar, tq.e eVar) {
            Object objA = this.f167986a.a(new a(hVar, this.f167987b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqp3/a$a;", "<unused var>", "Lqp3/b;", "Loq/i0;", "<anonymous>", "(Lqp3/a$a;Lqp3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<qp3.a.C4237a, qp3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167998e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167998e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qp3.a.c> bVarY1 = p.this.Y1();
                qp3.a.c.C4238a c4238a = qp3.a.c.C4238a.f167937a;
                this.f167998e = 1;
                if (bVarY1.F(c4238a, this) == objE) {
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
        public final Object w(qp3.a.C4237a c4237a, qp3.b bVar, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqp3/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lqp3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<qp3.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168000e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f168000e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            p.this.d9(qp3.a.b.f167936a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(qp3.b.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqp3/a$b;", "<unused var>", "Lk10/c0;", "Lqp3/b$a;", "state", "Lk10/l;", "Lqp3/b;", "<anonymous>", "(Lqp3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qp3.a.b, c0<qp3.b.a>, tq.e<? super k10.l<? extends qp3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168003f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f168003f;
            Object objE = uq.b.e();
            int i15 = this.f168002e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p pVar = p.this;
            this.f168003f = vq.j.a(c0Var);
            this.f168002e = 1;
            Object objU9 = pVar.u9(c0Var, this);
            return objU9 == objE ? objE : objU9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qp3.a.b bVar, c0<qp3.b.a> c0Var, tq.e<? super k10.l<? extends qp3.b>> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f168003f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqp3/a$d;", "action", "Lqp3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqp3/a$d;Lqp3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qp3.a.OpenUrlIntent, qp3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168006f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qp3.a.OpenUrlIntent openUrlIntent = (qp3.a.OpenUrlIntent) this.f168006f;
            uq.b.e();
            if (this.f168005e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            p.this.z9(openUrlIntent.getUrl());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qp3.a.OpenUrlIntent openUrlIntent, qp3.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f168006f = openUrlIntent;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, rp3.a aVar2, w wVar, po0.b bVar, i70.n nVar, ib4.c cVar, ac4.a aVar3) {
        this.screenMapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.fetchIdeaVoteRoundActive = bVar;
        this.snackBarManagerStateHolder = nVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        qp3.b.a aVar4 = qp3.b.a.f167940a;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: qp3.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f167958a, (v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), x9(aVar4));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final p pVar, v vVar) {
        vVar.c(q0.c(qp3.b.class), new er.l() { // from class: qp3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f167960a, (z) obj);
            }
        });
        vVar.c(q0.c(qp3.b.a.class), new er.l() { // from class: qp3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.D9(this.f167961a, (z) obj);
            }
        });
        vVar.c(q0.c(qp3.b.Initialized.class), new er.l() { // from class: qp3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.E9(this.f167962a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, z zVar) {
        d dVar = pVar.new d(null);
        zVar.x(q0.c(qp3.a.C4237a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(p pVar, z zVar) {
        zVar.C(pVar.new e(null));
        f fVar = pVar.new f(null);
        zVar.v(q0.c(qp3.a.b.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, z zVar) {
        g gVar = pVar.new g(null);
        zVar.x(q0.c(qp3.a.OpenUrlIntent.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u9(c0<qp3.b.a> c0Var, tq.e<? super k10.l<? extends qp3.b>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new qp3.a.c.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: qp3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(aVar, aVar2, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        } else {
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qp3.c.a x9(qp3.b state) {
        return this.screenMapper.b(new rp3.a.Params(state, b9(qp3.a.C4237a.f167935a), new er.l() { // from class: qp3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f167959a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, String str) {
        pVar.d9(new qp3.a.OpenUrlIntent(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z9(String url) {
        i00.a.a(this, new b(url, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<qp3.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<qp3.b, qp3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qp3.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
