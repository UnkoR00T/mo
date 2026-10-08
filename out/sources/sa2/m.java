package sa2;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lsa2/m;", "Ll00/g;", "Lsa2/i;", "", "Lsa2/j;", "Lyy/a;", "stateMachineFactory", "Lta2/a;", "mapper", "<init>", "(Lyy/a;Lta2/a;)V", "state", "Lsa2/j$a$a;", "j9", "(Lsa2/i;)Lsa2/j$a$a;", "", "excludeItems", "Loq/i0;", "l9", "(Z)V", "b", "Lta2/a;", "Lsa2/i$a;", "c", "Lsa2/i$a;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsa2/g;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<i, Object> implements j, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ta2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i.Initialized initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<i, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<j.a.Initialized> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<j.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f179828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f179829b;

        /* JADX INFO: renamed from: sa2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4628a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f179830a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f179831b;

            /* JADX INFO: renamed from: sa2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4629a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f179832d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f179833e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f179834f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f179836h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f179837j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f179838k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f179839l;

                public C4629a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f179832d = obj;
                    this.f179833e |= PKIFailureInfo.systemUnavail;
                    return C4628a.this.F(null, this);
                }
            }

            public C4628a(mu.h hVar, m mVar) {
                this.f179830a = hVar;
                this.f179831b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4629a c4629a;
                if (eVar instanceof C4629a) {
                    c4629a = (C4629a) eVar;
                    int i15 = c4629a.f179833e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4629a.f179833e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4629a = new C4629a(eVar);
                    }
                } else {
                    c4629a = new C4629a(eVar);
                }
                Object obj2 = c4629a.f179832d;
                Object objE = uq.b.e();
                int i16 = c4629a.f179833e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f179830a;
                    j.a.Initialized initializedJ9 = this.f179831b.j9((i) obj);
                    c4629a.f179834f = vq.j.a(obj);
                    c4629a.f179836h = vq.j.a(c4629a);
                    c4629a.f179837j = vq.j.a(obj);
                    c4629a.f179838k = vq.j.a(hVar);
                    c4629a.f179839l = 0;
                    c4629a.f179833e = 1;
                    if (hVar.F(initializedJ9, c4629a) == objE) {
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
            this.f179828a = gVar;
            this.f179829b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f179828a.a(new C4628a(hVar, this.f179829b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsa2/e;", "<unused var>", "Lsa2/i$a;", "Loq/i0;", "<anonymous>", "(Lsa2/e;Lsa2/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e, i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179840e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179840e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g> bVarY1 = m.this.Y1();
                g.a aVar = g.a.f179812a;
                this.f179840e = 1;
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
        public final Object w(e eVar, i.Initialized initialized, tq.e<? super i0> eVar2) {
            return m.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa2/h;", "action", "Lsa2/i$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsa2/h;Lsa2/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnSettingsItemClick, i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179843f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnSettingsItemClick onSettingsItemClick = (OnSettingsItemClick) this.f179843f;
            Object objE = uq.b.e();
            int i15 = this.f179842e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g> bVarY1 = m.this.Y1();
                g settingsItemNavAction = onSettingsItemClick.getSettingsItemNavAction();
                this.f179843f = vq.j.a(onSettingsItemClick);
                this.f179842e = 1;
                if (bVarY1.F(settingsItemNavAction, this) == objE) {
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
        public final Object w(OnSettingsItemClick onSettingsItemClick, i.Initialized initialized, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f179843f = onSettingsItemClick;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsa2/f;", "action", "Lk10/c0;", "Lsa2/i$a;", "state", "Lk10/l;", "Lsa2/i;", "<anonymous>", "(Lsa2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<GoToModelLoaded, c0<i.Initialized>, tq.e<? super k10.l<? extends i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179845e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179846f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179847g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.Initialized O(GoToModelLoaded goToModelLoaded, i.Initialized initialized) {
            return new i.Initialized(goToModelLoaded.getExcludeItems());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final GoToModelLoaded goToModelLoaded = (GoToModelLoaded) this.f179846f;
            c0 c0Var = (c0) this.f179847g;
            uq.b.e();
            if (this.f179845e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: sa2.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.d.O(goToModelLoaded, (i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToModelLoaded goToModelLoaded, c0<i.Initialized> c0Var, tq.e<? super k10.l<? extends i>> eVar) {
            d dVar = new d(eVar);
            dVar.f179846f = goToModelLoaded;
            dVar.f179847g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, ta2.a aVar2) {
        this.mapper = aVar2;
        i.Initialized initialized = new i.Initialized(false);
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: sa2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f179821a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.a.Initialized j9(i state) {
        return this.mapper.b(new ta2.a.Params(state, b9(new OnSettingsItemClick(g.e.f179816a)), b9(new OnSettingsItemClick(g.c.f179814a)), b9(new OnSettingsItemClick(g.b.f179813a)), b9(new OnSettingsItemClick(g.d.f179815a)), b9(e.f179810a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final m mVar, v vVar) {
        vVar.c(q0.c(i.Initialized.class), new er.l() { // from class: sa2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f179822a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e.class), oVar, bVar);
        zVar.x(q0.c(OnSettingsItemClick.class), oVar, mVar.new c(null));
        zVar.v(q0.c(GoToModelLoaded.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<i, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    public void l9(boolean excludeItems) {
        d9(new GoToModelLoaded(excludeItems));
    }
}
