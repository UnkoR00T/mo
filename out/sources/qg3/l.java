package qg3;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lqg3/l;", "Ll00/g;", "Lqg3/c;", "", "Lqg3/d;", "Lyy/a;", "stateMachineFactory", "Lrg3/a;", "mapper", "<init>", "(Lyy/a;Lrg3/a;)V", "Lqg3/d$a;", "j9", "(Lqg3/c;)Lqg3/d$a;", "b", "Lrg3/a;", "c", "Lqg3/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqg3/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rg3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qg3.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f166414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f166415b;

        /* JADX INFO: renamed from: qg3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4176a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f166416a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f166417b;

            /* JADX INFO: renamed from: qg3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4177a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f166418d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166419e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f166420f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f166422h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f166423j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f166424k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f166425l;

                public C4177a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f166418d = obj;
                    this.f166419e |= PKIFailureInfo.systemUnavail;
                    return C4176a.this.F(null, this);
                }
            }

            public C4176a(mu.h hVar, l lVar) {
                this.f166416a = hVar;
                this.f166417b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4177a c4177a;
                if (eVar instanceof C4177a) {
                    c4177a = (C4177a) eVar;
                    int i15 = c4177a.f166419e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4177a.f166419e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4177a = new C4177a(eVar);
                    }
                } else {
                    c4177a = new C4177a(eVar);
                }
                Object obj2 = c4177a.f166418d;
                Object objE = uq.b.e();
                int i16 = c4177a.f166419e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f166416a;
                    d.Data dataJ9 = this.f166417b.j9((c) obj);
                    c4177a.f166420f = vq.j.a(obj);
                    c4177a.f166422h = vq.j.a(c4177a);
                    c4177a.f166423j = vq.j.a(obj);
                    c4177a.f166424k = vq.j.a(hVar);
                    c4177a.f166425l = 0;
                    c4177a.f166419e = 1;
                    if (hVar.F(dataJ9, c4177a) == objE) {
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
            this.f166414a = gVar;
            this.f166415b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f166414a.a(new C4176a(hVar, this.f166415b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqg3/a;", "<unused var>", "Lqg3/c;", "Loq/i0;", "<anonymous>", "(Lqg3/a;Lqg3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<qg3.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166426e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166426e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qg3.b> bVarY1 = l.this.Y1();
                qg3.b.a aVar = qg3.b.a.f166391a;
                this.f166426e = 1;
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
        public final Object w(qg3.a aVar, c cVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, rg3.a aVar2) {
        this.mapper = aVar2;
        c cVar = c.f166392a;
        this.initialState = cVar;
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: qg3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f166407a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(c cVar) {
        return this.mapper.b(new rg3.a.Params(cVar, b9(qg3.a.f166390a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: qg3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f166408a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(qg3.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qg3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
