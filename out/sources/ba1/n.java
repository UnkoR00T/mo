package ba1;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lba1/n;", "Ll00/g;", "Lba1/e;", "", "Lba1/f;", "Lyy/a;", "stateMachineFactory", "Lca1/c;", "mapper", "Lda1/a;", "dataContract", "<init>", "(Lyy/a;Lca1/c;Lda1/a;)V", "state", "Lba1/f$a;", "m9", "(Lba1/e;)Lba1/f$a;", "b", "Lca1/c;", "c", "Lda1/a;", "d", "Lba1/e;", "initialState", "Lxw/b;", "Lba1/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ca1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final da1.a dataContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ba1.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f17836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f17837b;

        /* JADX INFO: renamed from: ba1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0436a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f17838a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f17839b;

            /* JADX INFO: renamed from: ba1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0437a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f17840d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f17841e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f17842f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f17844h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f17845j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f17846k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f17847l;

                public C0437a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f17840d = obj;
                    this.f17841e |= PKIFailureInfo.systemUnavail;
                    return C0436a.this.F(null, this);
                }
            }

            public C0436a(mu.h hVar, n nVar) {
                this.f17838a = hVar;
                this.f17839b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0437a c0437a;
                if (eVar instanceof C0437a) {
                    c0437a = (C0437a) eVar;
                    int i15 = c0437a.f17841e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0437a.f17841e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0437a = new C0437a(eVar);
                    }
                } else {
                    c0437a = new C0437a(eVar);
                }
                Object obj2 = c0437a.f17840d;
                Object objE = uq.b.e();
                int i16 = c0437a.f17841e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f17838a;
                    f.Data dataM9 = this.f17839b.m9((e) obj);
                    c0437a.f17842f = vq.j.a(obj);
                    c0437a.f17844h = vq.j.a(c0437a);
                    c0437a.f17845j = vq.j.a(obj);
                    c0437a.f17846k = vq.j.a(hVar);
                    c0437a.f17847l = 0;
                    c0437a.f17841e = 1;
                    if (hVar.F(dataM9, c0437a) == objE) {
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
            this.f17836a = gVar;
            this.f17837b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f17836a.a(new C0436a(hVar, this.f17837b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lba1/d;", "action", "Lba1/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lba1/d;Lba1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<Next, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17849f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Next next = (Next) this.f17849f;
            Object objE = uq.b.e();
            int i15 = this.f17848e;
            if (i15 == 0) {
                u.b(obj);
                n.this.dataContract.E6(new da1.a.WhoAgreesData(next.getWhoAgrees()));
                n nVar = n.this;
                ba1.c.C0435c c0435c = ba1.c.C0435c.f17814a;
                this.f17849f = vq.j.a(next);
                this.f17848e = 1;
                if (nVar.F(c0435c, this) == objE) {
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
        public final Object w(Next next, e eVar, tq.e<? super i0> eVar2) {
            b bVar = n.this.new b(eVar2);
            bVar.f17849f = next;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lba1/a;", "<unused var>", "Lba1/e;", "Loq/i0;", "<anonymous>", "(Lba1/a;Lba1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ba1.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17851e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17851e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ba1.c> bVarY1 = n.this.Y1();
                ba1.c.a aVar = ba1.c.a.f17812a;
                this.f17851e = 1;
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
        public final Object w(ba1.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lba1/b;", "<unused var>", "Lba1/e;", "Loq/i0;", "<anonymous>", "(Lba1/b;Lba1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ba1.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17853e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17853e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ba1.c> bVarY1 = n.this.Y1();
                ba1.c.b bVar = ba1.c.b.f17813a;
                this.f17853e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ba1.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, ca1.c cVar, da1.a aVar2) {
        this.mapper = cVar;
        this.dataContract = aVar2;
        e eVar = e.f17816a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: ba1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f17829a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data m9(e state) {
        return this.mapper.b(new ca1.c.Params(state, new er.l() { // from class: ba1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f17828a, (i61.t) obj);
            }
        }, b9(ba1.a.f17810a), b9(ba1.b.f17811a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, i61.t tVar) {
        nVar.d9(new Next(tVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: ba1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f17827a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(Next.class), oVar, bVar);
        zVar.x(q0.c(ba1.a.class), oVar, nVar.new c(null));
        zVar.x(q0.c(ba1.b.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ba1.c> Y1() {
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
    public /* bridge */ Object F(ba1.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(da1.a aVar) {
        super.P5(aVar);
    }
}
