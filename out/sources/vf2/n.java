package vf2;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lvf2/n;", "Ll00/g;", "Lvf2/e;", "", "Lvf2/f;", "Lyy/a;", "stateMachineFactory", "Lwf2/b;", "mapper", "Lwf2/a;", "faqMapper", "<init>", "(Lyy/a;Lwf2/b;Lwf2/a;)V", "state", "Lvf2/f$a;", "k9", "(Lvf2/e;)Lvf2/f$a;", "b", "Lwf2/b;", "c", "Lwf2/a;", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lvf2/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wf2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wf2.a faqMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vf2.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f206425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f206426b;

        /* JADX INFO: renamed from: vf2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5396a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f206427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f206428b;

            /* JADX INFO: renamed from: vf2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5397a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f206429d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f206430e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f206431f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f206433h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f206434j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f206435k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f206436l;

                public C5397a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f206429d = obj;
                    this.f206430e |= PKIFailureInfo.systemUnavail;
                    return C5396a.this.F(null, this);
                }
            }

            public C5396a(mu.h hVar, n nVar) {
                this.f206427a = hVar;
                this.f206428b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5397a c5397a;
                if (eVar instanceof C5397a) {
                    c5397a = (C5397a) eVar;
                    int i15 = c5397a.f206430e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5397a.f206430e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5397a = new C5397a(eVar);
                    }
                } else {
                    c5397a = new C5397a(eVar);
                }
                Object obj2 = c5397a.f206429d;
                Object objE = uq.b.e();
                int i16 = c5397a.f206430e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f206427a;
                    f.Data dataK9 = this.f206428b.k9((e) obj);
                    c5397a.f206431f = vq.j.a(obj);
                    c5397a.f206433h = vq.j.a(c5397a);
                    c5397a.f206434j = vq.j.a(obj);
                    c5397a.f206435k = vq.j.a(hVar);
                    c5397a.f206436l = 0;
                    c5397a.f206430e = 1;
                    if (hVar.F(dataK9, c5397a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f206425a = gVar;
            this.f206426b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f206425a.a(new C5396a(hVar, this.f206426b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvf2/a;", "<unused var>", "Lvf2/e;", "Loq/i0;", "<anonymous>", "(Lvf2/a;Lvf2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<vf2.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206437e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f206437e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vf2.c> bVarY1 = n.this.Y1();
                vf2.c.a aVar = vf2.c.a.f206403a;
                this.f206437e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(vf2.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvf2/d;", "<unused var>", "Lvf2/e;", "Loq/i0;", "<anonymous>", "(Lvf2/d;Lvf2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<vf2.d, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206439e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f206439e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vf2.c> bVarY1 = n.this.Y1();
                vf2.c.C5395c c5395c = vf2.c.C5395c.f206405a;
                this.f206439e = 1;
                if (bVarY1.F(c5395c, this) == objE) {
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
        public final Object w(vf2.d dVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvf2/b;", "<unused var>", "Lvf2/e;", "Loq/i0;", "<anonymous>", "(Lvf2/b;Lvf2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<vf2.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206441e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f206441e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vf2.c> bVarY1 = n.this.Y1();
                vf2.c.Faq faq = new vf2.c.Faq(n.this.faqMapper.b(i0.f148189a));
                this.f206441e = 1;
                if (bVarY1.F(faq, this) == objE) {
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
        public final Object w(vf2.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, wf2.b bVar, wf2.a aVar2) {
        this.mapper = bVar;
        this.faqMapper = aVar2;
        e eVar = e.f206407a;
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: vf2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f206418a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(e state) {
        return this.mapper.b(new wf2.b.Params(state, b9(vf2.a.f206401a), b9(vf2.d.f206406a), b9(vf2.b.f206402a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: vf2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f206419a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(vf2.a.class), oVar, bVar);
        zVar.x(q0.c(vf2.d.class), oVar, nVar.new c(null));
        zVar.x(q0.c(vf2.b.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<vf2.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
