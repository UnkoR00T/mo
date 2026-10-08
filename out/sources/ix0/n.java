package ix0;

import fr.q0;
import iq0.AnonymousFeatureFlag;
import java.util.Iterator;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lix0/n;", "Ll00/g;", "Lix0/g;", "", "Lix0/h;", "Lyy/a;", "stateMachineFactory", "Ljx0/a;", "confirmationMethodScreenMapper", "Lix0/f;", "setupData", "<init>", "(Lyy/a;Ljx0/a;Lix0/f;)V", "state", "Lix0/h$a;", "l9", "(Lix0/g;)Lix0/h$a;", "Lix0/g$a;", "k9", "(Lix0/g$a;Lix0/f;)Lix0/g$a;", "data", "Loq/i0;", "m9", "(Lix0/f;)V", "b", "Ljx0/a;", "c", "Lix0/f;", "d", "Lix0/g$a;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lix0/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<g, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx0.a confirmationMethodScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g.Initialized initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<g, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ix0.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<h.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f97573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f97574b;

        /* JADX INFO: renamed from: ix0.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2291a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f97575a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f97576b;

            /* JADX INFO: renamed from: ix0.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2292a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f97577d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f97578e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f97579f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f97581h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f97582j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f97583k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f97584l;

                public C2292a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f97577d = obj;
                    this.f97578e |= PKIFailureInfo.systemUnavail;
                    return C2291a.this.F(null, this);
                }
            }

            public C2291a(mu.h hVar, n nVar) {
                this.f97575a = hVar;
                this.f97576b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2292a c2292a;
                if (eVar instanceof C2292a) {
                    c2292a = (C2292a) eVar;
                    int i15 = c2292a.f97578e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2292a.f97578e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2292a = new C2292a(eVar);
                    }
                } else {
                    c2292a = new C2292a(eVar);
                }
                Object obj2 = c2292a.f97577d;
                Object objE = uq.b.e();
                int i16 = c2292a.f97578e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f97575a;
                    h.a aVarL9 = this.f97576b.l9((g) obj);
                    c2292a.f97579f = vq.j.a(obj);
                    c2292a.f97581h = vq.j.a(c2292a);
                    c2292a.f97582j = vq.j.a(obj);
                    c2292a.f97583k = vq.j.a(hVar);
                    c2292a.f97584l = 0;
                    c2292a.f97578e = 1;
                    if (hVar.F(aVarL9, c2292a) == objE) {
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
            this.f97573a = gVar;
            this.f97574b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.a> hVar, tq.e eVar) {
            Object objA = this.f97573a.a(new C2291a(hVar, this.f97574b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lix0/c;", "action", "Lk10/c0;", "Lix0/g$a;", "state", "Lk10/l;", "Lix0/g;", "<anonymous>", "(Lix0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<Setup, c0<g.Initialized>, tq.e<? super k10.l<? extends g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f97587g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.Initialized O(n nVar, c0 c0Var, Setup setup, g.Initialized initialized) {
            return nVar.k9((g.Initialized) c0Var.a(), setup.getSetupData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Setup setup = (Setup) this.f97586f;
            final c0 c0Var = (c0) this.f97587g;
            uq.b.e();
            if (this.f97585e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final n nVar = n.this;
            return c0Var.b(new er.l() { // from class: ix0.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.O(nVar, c0Var, setup, (g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Setup setup, c0<g.Initialized> c0Var, tq.e<? super k10.l<? extends g>> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f97586f = setup;
            bVar.f97587g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lix0/a;", "<unused var>", "Lix0/g$a;", "Loq/i0;", "<anonymous>", "(Lix0/a;Lix0/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ix0.a, g.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97589e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f97589e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ix0.b> bVarY1 = n.this.Y1();
                ix0.b.a aVar = ix0.b.a.f97546a;
                this.f97589e = 1;
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
        public final Object w(ix0.a aVar, g.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lix0/e;", "<unused var>", "Lix0/g$a;", "Loq/i0;", "<anonymous>", "(Lix0/e;Lix0/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ix0.e, g.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97591e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f97591e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ix0.b> bVarY1 = n.this.Y1();
                ix0.b.c cVar = ix0.b.c.f97548a;
                this.f97591e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(ix0.e eVar, g.Initialized initialized, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lix0/d;", "<unused var>", "Lix0/g$a;", "Loq/i0;", "<anonymous>", "(Lix0/d;Lix0/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ix0.d, g.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97593e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f97593e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ix0.b> bVarY1 = n.this.Y1();
                ix0.b.C2289b c2289b = ix0.b.C2289b.f97547a;
                this.f97593e = 1;
                if (bVarY1.F(c2289b, this) == objE) {
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
        public final Object w(ix0.d dVar, g.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, jx0.a aVar2, f fVar) {
        this.confirmationMethodScreenMapper = aVar2;
        this.setupData = fVar;
        g.Initialized initializedK9 = k9(new g.Initialized(false, 1, null), fVar);
        this.initialState = initializedK9;
        this.stateMachine = aVar.a(initializedK9, new er.l() { // from class: ix0.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f97566a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), h.a.b.f97559a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Initialized k9(g.Initialized state, f setupData) {
        Object next;
        if (fr.t.c(setupData, f.b.f97553a)) {
            return state;
        }
        if (!(setupData instanceof f.Flags)) {
            throw new oq.p();
        }
        Iterator<T> it = ((f.Flags) setupData).a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AnonymousFeatureFlag) next).getType() != iq0.e.ACTIVATION_BY_ELECTRONIC_ID);
        AnonymousFeatureFlag anonymousFeatureFlag = (AnonymousFeatureFlag) next;
        return state.a(anonymousFeatureFlag != null ? anonymousFeatureFlag.getFeatureActive() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.a l9(g state) {
        return this.confirmationMethodScreenMapper.b(new jx0.a.Params(state, b9(ix0.a.f97545a), b9(ix0.e.f97551a), b9(ix0.d.f97550a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final n nVar, v vVar) {
        vVar.c(q0.c(g.Initialized.class), new er.l() { // from class: ix0.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f97565a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(Setup.class), oVar, bVar);
        zVar.x(q0.c(ix0.a.class), oVar, nVar.new c(null));
        zVar.x(q0.c(ix0.e.class), oVar, nVar.new d(null));
        zVar.x(q0.c(ix0.d.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ix0.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public void P5(f data) {
        if (fr.t.c(data, f.b.f97553a)) {
            return;
        }
        if (!(data instanceof f.Flags)) {
            throw new oq.p();
        }
        d9(new Setup(data));
    }
}
