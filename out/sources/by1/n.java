package by1;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00198\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u001f\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lby1/n;", "Ll00/g;", "Lby1/j;", "", "Lby1/k;", "Lyy/a;", "stateMachineFactory", "Lcy1/b;", "welcomePageMapper", "Lcy1/a;", "faqScreenMapper", "<init>", "(Lyy/a;Lcy1/b;Lcy1/a;)V", "state", "Lby1/k$a;", "k9", "(Lby1/j;)Lby1/k$a;", "b", "Lcy1/b;", "getWelcomePageMapper", "()Lcy1/b;", "c", "Lcy1/a;", "j9", "()Lcy1/a;", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lby1/i;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<j, Object> implements k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cy1.b welcomePageMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cy1.a faqScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<j, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<k.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<k.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f21985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f21986b;

        /* JADX INFO: renamed from: by1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0581a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f21987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f21988b;

            /* JADX INFO: renamed from: by1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0582a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f21989d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f21990e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f21991f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f21993h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f21994j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f21995k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f21996l;

                public C0582a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f21989d = obj;
                    this.f21990e |= PKIFailureInfo.systemUnavail;
                    return C0581a.this.F(null, this);
                }
            }

            public C0581a(mu.h hVar, n nVar) {
                this.f21987a = hVar;
                this.f21988b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0582a c0582a;
                if (eVar instanceof C0582a) {
                    c0582a = (C0582a) eVar;
                    int i15 = c0582a.f21990e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0582a.f21990e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0582a = new C0582a(eVar);
                    }
                } else {
                    c0582a = new C0582a(eVar);
                }
                Object obj2 = c0582a.f21989d;
                Object objE = uq.b.e();
                int i16 = c0582a.f21990e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f21987a;
                    k.Data dataK9 = this.f21988b.k9((j) obj);
                    c0582a.f21991f = vq.j.a(obj);
                    c0582a.f21993h = vq.j.a(c0582a);
                    c0582a.f21994j = vq.j.a(obj);
                    c0582a.f21995k = vq.j.a(hVar);
                    c0582a.f21996l = 0;
                    c0582a.f21990e = 1;
                    if (hVar.F(dataK9, c0582a) == objE) {
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
            this.f21985a = gVar;
            this.f21986b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k.Data> hVar, tq.e eVar) {
            Object objA = this.f21985a.a(new C0581a(hVar, this.f21986b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lby1/f;", "<unused var>", "Lby1/j;", "Loq/i0;", "<anonymous>", "(Lby1/f;Lby1/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f, j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21997e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f21997e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i> bVarY1 = n.this.Y1();
                i.a aVar = i.a.f21970a;
                this.f21997e = 1;
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
        public final Object w(f fVar, j jVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lby1/g;", "<unused var>", "Lby1/j;", "Loq/i0;", "<anonymous>", "(Lby1/g;Lby1/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<g, j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21999e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f21999e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i> bVarY1 = n.this.Y1();
                i.b bVar = i.b.f21971a;
                this.f21999e = 1;
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
        public final Object w(g gVar, j jVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lby1/h;", "<unused var>", "Lby1/j;", "Loq/i0;", "<anonymous>", "(Lby1/h;Lby1/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<h, j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22001e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22001e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i> bVarY1 = n.this.Y1();
                i.GoToFaq goToFaq = new i.GoToFaq(n.this.getFaqScreenMapper().b(i0.f148189a));
                this.f22001e = 1;
                if (bVarY1.F(goToFaq, this) == objE) {
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
        public final Object w(h hVar, j jVar, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, cy1.b bVar, cy1.a aVar2) {
        this.welcomePageMapper = bVar;
        this.faqScreenMapper = aVar2;
        j jVar = j.f21973a;
        this.stateMachine = aVar.a(jVar, new er.l() { // from class: by1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f21978a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.Data k9(j state) {
        return this.welcomePageMapper.b(new cy1.b.Params(state, b9(f.f21967a), b9(g.f21968a), b9(h.f21969a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(j.class), new er.l() { // from class: by1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f21979a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(f.class), oVar, bVar);
        zVar.x(q0.c(g.class), oVar, nVar.new c(null));
        zVar.x(q0.c(h.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<j, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k.Data> getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: j9, reason: from getter */
    public final cy1.a getFaqScreenMapper() {
        return this.faqScreenMapper;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
