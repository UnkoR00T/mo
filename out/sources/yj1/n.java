package yj1;

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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lyj1/n;", "Ll00/g;", "Lyj1/f;", "", "Lyj1/g;", "Lyy/a;", "stateMachineFactory", "Lzj1/a;", "mapper", "<init>", "(Lyy/a;Lzj1/a;)V", "state", "Lyj1/g$a$a;", "k9", "(Lyj1/f;)Lyj1/g$a$a;", "b", "Lzj1/a;", "Lyj1/f$a;", "c", "Lyj1/f$a;", "initialState", "Lxw/b;", "Lyj1/b;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lyj1/g$a;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<f, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zj1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f.a initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yj1.b> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<f, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<g.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.a.Categories> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f227312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f227313b;

        /* JADX INFO: renamed from: yj1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6093a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f227314a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f227315b;

            /* JADX INFO: renamed from: yj1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6094a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f227316d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f227317e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f227318f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f227320h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f227321j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f227322k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f227323l;

                public C6094a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f227316d = obj;
                    this.f227317e |= PKIFailureInfo.systemUnavail;
                    return C6093a.this.F(null, this);
                }
            }

            public C6093a(mu.h hVar, n nVar) {
                this.f227314a = hVar;
                this.f227315b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6094a c6094a;
                if (eVar instanceof C6094a) {
                    c6094a = (C6094a) eVar;
                    int i15 = c6094a.f227317e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6094a.f227317e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6094a = new C6094a(eVar);
                    }
                } else {
                    c6094a = new C6094a(eVar);
                }
                Object obj2 = c6094a.f227316d;
                Object objE = uq.b.e();
                int i16 = c6094a.f227317e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f227314a;
                    g.a.Categories categoriesK9 = this.f227315b.k9((f) obj);
                    c6094a.f227318f = vq.j.a(obj);
                    c6094a.f227320h = vq.j.a(c6094a);
                    c6094a.f227321j = vq.j.a(obj);
                    c6094a.f227322k = vq.j.a(hVar);
                    c6094a.f227323l = 0;
                    c6094a.f227317e = 1;
                    if (hVar.F(categoriesK9, c6094a) == objE) {
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
            this.f227312a = gVar;
            this.f227313b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.a.Categories> hVar, tq.e eVar) {
            Object objA = this.f227312a.a(new C6093a(hVar, this.f227313b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyj1/a;", "<unused var>", "Lyj1/f$a;", "Loq/i0;", "<anonymous>", "(Lyj1/a;Lyj1/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<yj1.a, f.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227324e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227324e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                yj1.b.a aVar = yj1.b.a.f227286a;
                this.f227324e = 1;
                if (nVar.F(aVar, this) == objE) {
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
        public final Object w(yj1.a aVar, f.a aVar2, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyj1/d;", "<unused var>", "Lyj1/f$a;", "Loq/i0;", "<anonymous>", "(Lyj1/d;Lyj1/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yj1.d, f.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227326e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227326e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                yj1.b.c cVar = yj1.b.c.f227288a;
                this.f227326e = 1;
                if (nVar.F(cVar, this) == objE) {
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
        public final Object w(yj1.d dVar, f.a aVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyj1/c;", "<unused var>", "Lyj1/f$a;", "Loq/i0;", "<anonymous>", "(Lyj1/c;Lyj1/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yj1.c, f.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227328e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227328e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                yj1.b.C6091b c6091b = yj1.b.C6091b.f227287a;
                this.f227328e = 1;
                if (nVar.F(c6091b, this) == objE) {
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
        public final Object w(yj1.c cVar, f.a aVar, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyj1/e;", "<unused var>", "Lyj1/f$a;", "Loq/i0;", "<anonymous>", "(Lyj1/e;Lyj1/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yj1.e, f.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227330e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227330e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                yj1.b.d dVar = yj1.b.d.f227289a;
                this.f227330e = 1;
                if (nVar.F(dVar, this) == objE) {
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
        public final Object w(yj1.e eVar, f.a aVar, tq.e<? super i0> eVar2) {
            return n.this.new e(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, zj1.a aVar2) {
        this.mapper = aVar2;
        f.a aVar3 = f.a.f227293a;
        this.initialState = aVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: yj1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f227305a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.a.Categories k9(f state) {
        return this.mapper.b(new zj1.a.Params(state, b9(yj1.a.f227285a), b9(yj1.d.f227291a), b9(yj1.c.f227290a), b9(yj1.e.f227292a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(f.a.class), new er.l() { // from class: yj1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f227306a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(yj1.a.class), oVar, bVar);
        zVar.x(q0.c(yj1.d.class), oVar, nVar.new c(null));
        zVar.x(q0.c(yj1.c.class), oVar, nVar.new d(null));
        zVar.x(q0.c(yj1.e.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<yj1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yj1.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
