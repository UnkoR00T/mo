package im3;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lim3/l;", "Ll00/g;", "Lim3/d;", "", "Lim3/e;", "Lyy/a;", "stateMachineFactory", "Ljm3/a;", "mapper", "<init>", "(Lyy/a;Ljm3/a;)V", "state", "Lim3/e$a;", "k9", "(Lim3/d;)Lim3/e$a;", "b", "Ljm3/a;", "c", "Lim3/d;", "initialState", "Lxw/b;", "Lim3/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jm3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<im3.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f93466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f93467b;

        /* JADX INFO: renamed from: im3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2208a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f93468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f93469b;

            /* JADX INFO: renamed from: im3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2209a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f93470d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f93471e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f93472f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f93474h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f93475j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f93476k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f93477l;

                public C2209a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f93470d = obj;
                    this.f93471e |= PKIFailureInfo.systemUnavail;
                    return C2208a.this.F(null, this);
                }
            }

            public C2208a(mu.h hVar, l lVar) {
                this.f93468a = hVar;
                this.f93469b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2209a c2209a;
                if (eVar instanceof C2209a) {
                    c2209a = (C2209a) eVar;
                    int i15 = c2209a.f93471e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2209a.f93471e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2209a = new C2209a(eVar);
                    }
                } else {
                    c2209a = new C2209a(eVar);
                }
                Object obj2 = c2209a.f93470d;
                Object objE = uq.b.e();
                int i16 = c2209a.f93471e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f93468a;
                    e.Data dataK9 = this.f93469b.k9((d) obj);
                    c2209a.f93472f = vq.j.a(obj);
                    c2209a.f93474h = vq.j.a(c2209a);
                    c2209a.f93475j = vq.j.a(obj);
                    c2209a.f93476k = vq.j.a(hVar);
                    c2209a.f93477l = 0;
                    c2209a.f93471e = 1;
                    if (hVar.F(dataK9, c2209a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f93466a = gVar;
            this.f93467b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f93466a.a(new C2208a(hVar, this.f93467b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lim3/b;", "<unused var>", "Lim3/d;", "Loq/i0;", "<anonymous>", "(Lim3/b;Lim3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<im3.b, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93478e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93478e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                im3.a.C2207a c2207a = im3.a.C2207a.f93446a;
                this.f93478e = 1;
                if (lVar.F(c2207a, this) == objE) {
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
        public final Object w(im3.b bVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lim3/c;", "<unused var>", "Lim3/d;", "Loq/i0;", "<anonymous>", "(Lim3/c;Lim3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<im3.c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93480e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93480e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                im3.a.b bVar = im3.a.b.f93447a;
                this.f93480e = 1;
                if (lVar.F(bVar, this) == objE) {
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
        public final Object w(im3.c cVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, jm3.a aVar2) {
        this.mapper = aVar2;
        d dVar = d.f93450a;
        this.initialState = dVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: im3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f93459a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9(d state) {
        return this.mapper.b(new jm3.a.Params(state, b9(im3.b.f93448a), b9(im3.c.f93449a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: im3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f93460a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(im3.b.class), oVar, bVar);
        zVar.x(q0.c(im3.c.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<im3.a> Y1() {
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
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(im3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
