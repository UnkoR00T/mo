package di3;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ldi3/m;", "Ll00/g;", "Ldi3/d;", "", "Ldi3/e;", "Lyy/a;", "stateMachineFactory", "Lei3/a;", "mapper", "<init>", "(Lyy/a;Lei3/a;)V", "Ldi3/e$a;", "j9", "(Ldi3/d;)Ldi3/e$a;", "b", "Lei3/a;", "c", "Ldi3/d;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ldi3/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ei3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<di3.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f42864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f42865b;

        /* JADX INFO: renamed from: di3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0947a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f42866a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f42867b;

            /* JADX INFO: renamed from: di3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0948a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f42868d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f42869e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f42870f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f42872h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f42873j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f42874k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f42875l;

                public C0948a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f42868d = obj;
                    this.f42869e |= PKIFailureInfo.systemUnavail;
                    return C0947a.this.F(null, this);
                }
            }

            public C0947a(mu.h hVar, m mVar) {
                this.f42866a = hVar;
                this.f42867b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0948a c0948a;
                if (eVar instanceof C0948a) {
                    c0948a = (C0948a) eVar;
                    int i15 = c0948a.f42869e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0948a.f42869e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0948a = new C0948a(eVar);
                    }
                } else {
                    c0948a = new C0948a(eVar);
                }
                Object obj2 = c0948a.f42868d;
                Object objE = uq.b.e();
                int i16 = c0948a.f42869e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f42866a;
                    e.Data dataJ9 = this.f42867b.j9((d) obj);
                    c0948a.f42870f = vq.j.a(obj);
                    c0948a.f42872h = vq.j.a(c0948a);
                    c0948a.f42873j = vq.j.a(obj);
                    c0948a.f42874k = vq.j.a(hVar);
                    c0948a.f42875l = 0;
                    c0948a.f42869e = 1;
                    if (hVar.F(dataJ9, c0948a) == objE) {
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
            this.f42864a = gVar;
            this.f42865b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f42864a.a(new C0947a(hVar, this.f42865b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldi3/a;", "<unused var>", "Ldi3/d;", "Loq/i0;", "<anonymous>", "(Ldi3/a;Ldi3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<di3.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42876e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f42876e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<di3.c> bVarY1 = m.this.Y1();
                di3.c.a aVar = di3.c.a.f42843a;
                this.f42876e = 1;
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
        public final Object w(di3.a aVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldi3/b;", "<unused var>", "Ldi3/d;", "Loq/i0;", "<anonymous>", "(Ldi3/b;Ldi3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<di3.b, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42878e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f42878e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<di3.c> bVarY1 = m.this.Y1();
                di3.c.b bVar = di3.c.b.f42844a;
                this.f42878e = 1;
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
        public final Object w(di3.b bVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, ei3.a aVar2) {
        this.mapper = aVar2;
        d dVar = d.f42845a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: di3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.l9(this.f42857a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9(d dVar) {
        return this.mapper.b(new ei3.a.Params(dVar, b9(di3.a.f42841a), b9(di3.b.f42842a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final m mVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: di3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f42858a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(di3.a.class), oVar, bVar);
        zVar.x(q0.c(di3.b.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<di3.c> Y1() {
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
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
