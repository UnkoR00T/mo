package cm2;

import a14.w;
import du0.Article;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcm2/q;", "Ll00/g;", "Lcm2/c;", "Lcm2/a;", "Lcm2/d;", "", "Lyy/a;", "stateMachineFactory", "La14/w;", "openUrlUseCase", "Lfu0/a;", "beGetArticleDetailsUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorHandler", "Ldm2/a;", "mapper", "Lcm2/b;", "setupData", "<init>", "(Lyy/a;La14/w;Lfu0/a;Lac4/a;Lib4/c;Ldm2/a;Lcm2/b;)V", "state", "Lcm2/d$a;", "s9", "(Lcm2/c;)Lcm2/d$a;", "b", "La14/w;", "c", "Lfu0/a;", "d", "Lac4/a;", "e", "Lib4/c;", "f", "Ldm2/a;", "g", "Lcm2/b;", "Lcm2/c$a;", "h", "Lcm2/c$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lcm2/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<cm2.c, cm2.a> implements cm2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w openUrlUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fu0.a beGetArticleDetailsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dm2.a mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final NetworkSecurityIssuesKnowledgeBaseDetailsNavigationParams setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final cm2.c.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<cm2.c, cm2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cm2.a.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<cm2.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<cm2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f28265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f28266b;

        /* JADX INFO: renamed from: cm2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0726a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f28267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f28268b;

            /* JADX INFO: renamed from: cm2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0727a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f28269d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f28270e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f28271f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f28273h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f28274j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f28275k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f28276l;

                public C0727a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f28269d = obj;
                    this.f28270e |= PKIFailureInfo.systemUnavail;
                    return C0726a.this.F(null, this);
                }
            }

            public C0726a(mu.h hVar, q qVar) {
                this.f28267a = hVar;
                this.f28268b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0727a c0727a;
                if (eVar instanceof C0727a) {
                    c0727a = (C0727a) eVar;
                    int i15 = c0727a.f28270e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0727a.f28270e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0727a = new C0727a(eVar);
                    }
                } else {
                    c0727a = new C0727a(eVar);
                }
                Object obj2 = c0727a.f28269d;
                Object objE = uq.b.e();
                int i16 = c0727a.f28270e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f28267a;
                    cm2.d.a aVarS9 = this.f28268b.s9((cm2.c) obj);
                    c0727a.f28271f = vq.j.a(obj);
                    c0727a.f28273h = vq.j.a(c0727a);
                    c0727a.f28274j = vq.j.a(obj);
                    c0727a.f28275k = vq.j.a(hVar);
                    c0727a.f28276l = 0;
                    c0727a.f28270e = 1;
                    if (hVar.F(aVarS9, c0727a) == objE) {
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
            this.f28265a = gVar;
            this.f28266b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super cm2.d.a> hVar, tq.e eVar) {
            Object objA = this.f28265a.a(new C0726a(hVar, this.f28266b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcm2/a$a;", "<unused var>", "Lcm2/c;", "Loq/i0;", "<anonymous>", "(Lcm2/a$a;Lcm2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<cm2.a.C0723a, cm2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28277e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f28277e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cm2.a.c> bVarY1 = q.this.Y1();
                cm2.a.c.C0724a c0724a = cm2.a.c.C0724a.f28226a;
                this.f28277e = 1;
                if (bVarY1.F(c0724a, this) == objE) {
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
        public final Object w(cm2.a.C0723a c0723a, cm2.c cVar, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcm2/a$b;", "action", "Lcm2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcm2/a$b;Lcm2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<cm2.a.Error, cm2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28280f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(q qVar, cm2.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    qVar.d9(cm2.a.C0723a.f28224a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    qVar.d9(error);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cm2.a.Error error = (cm2.a.Error) this.f28280f;
            Object objE = uq.b.e();
            int i15 = this.f28279e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cm2.a.c> bVarY1 = q.this.Y1();
                ib4.c cVar = q.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final q qVar = q.this;
                cm2.a.c.Error error2 = new cm2.a.c.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: cm2.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.O(qVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f28280f = vq.j.a(error);
                this.f28279e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cm2.a.Error error, cm2.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = q.this.new c(eVar);
            cVar2.f28280f = error;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcm2/c$a;", "it", "Loq/i0;", "<anonymous>", "(Lcm2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<cm2.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28282e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f28282e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new cm2.a.Setup(q.this.setupData.getArticleId()));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(cm2.c.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return q.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcm2/a$e;", "action", "Lk10/c0;", "Lcm2/c$a;", "state", "Lk10/l;", "Lcm2/c;", "<anonymous>", "(Lcm2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<cm2.a.Setup, c0<cm2.c.a>, tq.e<? super k10.l<? extends cm2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f28286g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcm2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cm2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28288e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f28289f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ cm2.a.Setup f28290g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<cm2.c.a> f28291h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, cm2.a.Setup setup, c0<cm2.c.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f28289f = qVar;
                this.f28290g = setup;
                this.f28291h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cm2.c.Initialized V(Article article, cm2.c.a aVar) {
                return new cm2.c.Initialized(article);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f28288e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    fu0.a aVar = this.f28289f.beGetArticleDetailsUC;
                    fu0.a.Params params = new fu0.a.Params(this.f28290g.getArticleId());
                    this.f28288e = 1;
                    obj = aVar.c(params, this);
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
                q qVar = this.f28289f;
                c0<cm2.c.a> c0Var = this.f28291h;
                if (iVar instanceof dx.i.Left) {
                    qVar.d9(new cm2.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final Article article = (Article) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: cm2.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.e.a.V(article, (c.a) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f28289f, this.f28290g, this.f28291h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cm2.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cm2.a.Setup setup = (cm2.a.Setup) this.f28285f;
            c0 c0Var = (c0) this.f28286g;
            Object objE = uq.b.e();
            int i15 = this.f28284e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.callActionWithLoaderUseCase;
            a aVar2 = new a(q.this, setup, c0Var, null);
            this.f28285f = vq.j.a(setup);
            this.f28286g = vq.j.a(c0Var);
            this.f28284e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cm2.a.Setup setup, c0<cm2.c.a> c0Var, tq.e<? super k10.l<? extends cm2.c>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f28285f = setup;
            eVar2.f28286g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcm2/a$d;", "action", "Lcm2/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcm2/a$d;Lcm2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<cm2.a.OpenUrl, cm2.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28293f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cm2.a.OpenUrl openUrl = (cm2.a.OpenUrl) this.f28293f;
            Object objE = uq.b.e();
            int i15 = this.f28292e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = q.this.openUrlUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f28293f = vq.j.a(openUrl);
                this.f28292e = 1;
                obj = wVar.c(params, this);
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
            q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                qVar.d9(new cm2.a.Error((dx.b.Business) ((dx.i.Left) iVar).b()));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cm2.a.OpenUrl openUrl, cm2.c.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f28293f = openUrl;
            return fVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, w wVar, fu0.a aVar2, ac4.a aVar3, ib4.c cVar, dm2.a aVar4, NetworkSecurityIssuesKnowledgeBaseDetailsNavigationParams networkSecurityIssuesKnowledgeBaseDetailsNavigationParams) {
        this.openUrlUseCase = wVar;
        this.beGetArticleDetailsUC = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.genericDomainErrorHandler = cVar;
        this.mapper = aVar4;
        this.setupData = networkSecurityIssuesKnowledgeBaseDetailsNavigationParams;
        cm2.c.a aVar5 = cm2.c.a.f28231a;
        this.initialState = aVar5;
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: cm2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f28254a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cm2.d.a s9(cm2.c state) {
        return this.mapper.b(new dm2.a.Params(state, new er.l() { // from class: cm2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f28253a, (String) obj);
            }
        }, b9(cm2.a.C0723a.f28224a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, String str) {
        qVar.d9(new cm2.a.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(cm2.c.class), new er.l() { // from class: cm2.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f28250a, (z) obj);
            }
        });
        vVar.c(q0.c(cm2.c.a.class), new er.l() { // from class: cm2.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f28251a, (z) obj);
            }
        });
        vVar.c(q0.c(cm2.c.Initialized.class), new er.l() { // from class: cm2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f28252a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cm2.a.C0723a.class), oVar, bVar);
        zVar.x(q0.c(cm2.a.Error.class), oVar, qVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, z zVar) {
        zVar.C(qVar.new d(null));
        e eVar = qVar.new e(null);
        zVar.v(q0.c(cm2.a.Setup.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, z zVar) {
        f fVar = qVar.new f(null);
        zVar.x(q0.c(cm2.a.OpenUrl.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<cm2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<cm2.c, cm2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<cm2.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(NetworkSecurityIssuesKnowledgeBaseDetailsNavigationParams networkSecurityIssuesKnowledgeBaseDetailsNavigationParams) {
        super.P5(networkSecurityIssuesKnowledgeBaseDetailsNavigationParams);
    }
}
