package om3;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lom3/m;", "Ll00/g;", "Lom3/d;", "", "Lom3/e;", "Lyy/a;", "stateMachineFactory", "Lpm3/b;", "mapper", "<init>", "(Lyy/a;Lpm3/b;)V", "state", "Lom3/e$a;", "l9", "(Lom3/d;)Lom3/e$a;", "b", "Lpm3/b;", "c", "Lom3/d;", "initialState", "Lxw/b;", "Lom3/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pm3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<om3.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f146809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f146810b;

        /* JADX INFO: renamed from: om3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3657a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f146811a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f146812b;

            /* JADX INFO: renamed from: om3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3658a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f146813d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f146814e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f146815f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f146817h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f146818j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f146819k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f146820l;

                public C3658a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f146813d = obj;
                    this.f146814e |= PKIFailureInfo.systemUnavail;
                    return C3657a.this.F(null, this);
                }
            }

            public C3657a(mu.h hVar, m mVar) {
                this.f146811a = hVar;
                this.f146812b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3658a c3658a;
                if (eVar instanceof C3658a) {
                    c3658a = (C3658a) eVar;
                    int i15 = c3658a.f146814e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3658a.f146814e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3658a = new C3658a(eVar);
                    }
                } else {
                    c3658a = new C3658a(eVar);
                }
                Object obj2 = c3658a.f146813d;
                Object objE = uq.b.e();
                int i16 = c3658a.f146814e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f146811a;
                    e.Data dataL9 = this.f146812b.l9((d) obj);
                    c3658a.f146815f = vq.j.a(obj);
                    c3658a.f146817h = vq.j.a(c3658a);
                    c3658a.f146818j = vq.j.a(obj);
                    c3658a.f146819k = vq.j.a(hVar);
                    c3658a.f146820l = 0;
                    c3658a.f146814e = 1;
                    if (hVar.F(dataL9, c3658a) == objE) {
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
            this.f146809a = gVar;
            this.f146810b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f146809a.a(new C3657a(hVar, this.f146810b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lom3/b;", "<unused var>", "Lom3/d;", "Loq/i0;", "<anonymous>", "(Lom3/b;Lom3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<om3.b, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146821e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146821e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                om3.a.C3656a c3656a = om3.a.C3656a.f146787a;
                this.f146821e = 1;
                if (mVar.F(c3656a, this) == objE) {
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
        public final Object w(om3.b bVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lom3/c;", "<unused var>", "Lom3/d;", "Loq/i0;", "<anonymous>", "(Lom3/c;Lom3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<OnCardClick, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146823e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146823e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                om3.a.b bVar = om3.a.b.f146788a;
                this.f146823e = 1;
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
        public final Object w(OnCardClick onCardClick, d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, pm3.b bVar) {
        this.mapper = bVar;
        d dVar = d.f146791a;
        this.initialState = dVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: om3.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f146801a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(d state) {
        return this.mapper.b(new pm3.b.Params(state, b9(om3.b.f146789a), new er.l() { // from class: om3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f146802a, (mk3.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, mk3.a aVar) {
        mVar.d9(new OnCardClick(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: om3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f146803a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(om3.b.class), oVar, bVar);
        zVar.x(q0.c(OnCardClick.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<om3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(om3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
