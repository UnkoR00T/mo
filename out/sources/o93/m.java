package o93;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lo93/m;", "Ll00/g;", "Lo93/d;", "", "Lo93/e;", "Lp93/a;", "screenMapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Lp93/a;Lyy/a;)V", "state", "Lo93/e$a;", "j9", "(Lo93/d;)Lo93/e$a;", "b", "Lp93/a;", "c", "Lo93/d;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lo93/c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<d, Object> implements e, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p93.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f143558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f143559b;

        /* JADX INFO: renamed from: o93.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3564a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f143560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f143561b;

            /* JADX INFO: renamed from: o93.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3565a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f143562d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f143563e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f143564f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f143566h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f143567j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f143568k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f143569l;

                public C3565a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f143562d = obj;
                    this.f143563e |= PKIFailureInfo.systemUnavail;
                    return C3564a.this.F(null, this);
                }
            }

            public C3564a(mu.h hVar, m mVar) {
                this.f143560a = hVar;
                this.f143561b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3565a c3565a;
                if (eVar instanceof C3565a) {
                    c3565a = (C3565a) eVar;
                    int i15 = c3565a.f143563e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3565a.f143563e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3565a = new C3565a(eVar);
                    }
                } else {
                    c3565a = new C3565a(eVar);
                }
                Object obj2 = c3565a.f143562d;
                Object objE = uq.b.e();
                int i16 = c3565a.f143563e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f143560a;
                    e.Data dataJ9 = this.f143561b.j9((d) obj);
                    c3565a.f143564f = vq.j.a(obj);
                    c3565a.f143566h = vq.j.a(c3565a);
                    c3565a.f143567j = vq.j.a(obj);
                    c3565a.f143568k = vq.j.a(hVar);
                    c3565a.f143569l = 0;
                    c3565a.f143563e = 1;
                    if (hVar.F(dataJ9, c3565a) == objE) {
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
            this.f143558a = gVar;
            this.f143559b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f143558a.a(new C3564a(hVar, this.f143559b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo93/c;", "action", "Lo93/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo93/c;Lo93/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f143570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f143571f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c cVar = (c) this.f143571f;
            Object objE = uq.b.e();
            int i15 = this.f143570e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<c> bVarY1 = m.this.Y1();
                this.f143571f = vq.j.a(cVar);
                this.f143570e = 1;
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
        public final Object w(c cVar, d dVar, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f143571f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    public m(p93.a aVar, yy.a aVar2) {
        this.screenMapper = aVar;
        d dVar = d.f143541a;
        this.initialState = dVar;
        this.stateMachine = aVar2.a(dVar, new er.l() { // from class: o93.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.l9(this.f143551a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(dVar));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9(d state) {
        return this.screenMapper.b(new p93.a.Params(state, b9(c.a.f143540a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final m mVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: o93.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f143552a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        zVar.x(q0.c(c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c> Y1() {
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
