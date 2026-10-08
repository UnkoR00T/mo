package j32;

import a14.w;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import m02.UserDocumentData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.x;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003Ba\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J$\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0082@¢\u0006\u0004\b%\u0010&J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020)2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030G8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lj32/s;", "Ll00/g;", "Lj32/f;", "", "Lj32/g;", "Lyy/a;", "stateMachineFactory", "Lk32/a;", "settingsMapper", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Lp02/q;", "getEdorAddressUseCase", "Lp02/x;", "getOwnerEpuapIdUseCase", "La14/d;", "copyToClipboardUseCase", "Lib4/c;", "genericDomainErrorMapper", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lk02/a;", "electronicDeliveryContainersInteractor", "<init>", "(Lyy/a;Lk32/a;Lmx/c;Lu04/a;Lp02/q;Lp02/x;La14/d;Lib4/c;La14/w;Li70/e;Lk02/a;)V", "state", "Lj32/g$a;", "v9", "(Lj32/f;)Lj32/g$a;", "Lk10/c0;", "Lj32/f$a;", "Lk10/l;", "Lj32/f$b;", "x9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "", "address", "Loq/i0;", "u9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "s9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lk32/a;", "c", "Lmx/c;", "d", "Lu04/a;", "e", "Lp02/q;", "f", "Lp02/x;", "g", "La14/d;", "h", "Lib4/c;", "j", "La14/w;", "k", "Li70/e;", "l", "Lk02/a;", "m", "Lj32/f$a;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lj32/d;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<j32.f, Object> implements j32.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k32.a settingsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p02.q getEdorAddressUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x getOwnerEpuapIdUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k02.a electronicDeliveryContainersInteractor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final j32.f.a initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<j32.f, Object> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j32.d> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<j32.g.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f99292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f99293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f99294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f99295g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f99296h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f99297j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f99298k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f99299l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f99300m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f99302p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f99300m = obj;
            this.f99302p |= PKIFailureInfo.systemUnavail;
            return s.this.x9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<j32.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f99303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f99304b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f99305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f99306b;

            /* JADX INFO: renamed from: j32.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2329a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f99307d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f99308e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f99309f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f99311h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f99312j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f99313k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f99314l;

                public C2329a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f99307d = obj;
                    this.f99308e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f99305a = hVar;
                this.f99306b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2329a c2329a;
                if (eVar instanceof C2329a) {
                    c2329a = (C2329a) eVar;
                    int i15 = c2329a.f99308e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2329a.f99308e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2329a = new C2329a(eVar);
                    }
                } else {
                    c2329a = new C2329a(eVar);
                }
                Object obj2 = c2329a.f99307d;
                Object objE = uq.b.e();
                int i16 = c2329a.f99308e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f99305a;
                    j32.g.a aVarV9 = this.f99306b.v9((j32.f) obj);
                    c2329a.f99309f = vq.j.a(obj);
                    c2329a.f99311h = vq.j.a(c2329a);
                    c2329a.f99312j = vq.j.a(obj);
                    c2329a.f99313k = vq.j.a(hVar);
                    c2329a.f99314l = 0;
                    c2329a.f99308e = 1;
                    if (hVar.F(aVarV9, c2329a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, s sVar) {
            this.f99303a = gVar;
            this.f99304b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j32.g.a> hVar, tq.e eVar) {
            Object objA = this.f99303a.a(new a(hVar, this.f99304b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj32/a;", "<unused var>", "Lj32/f;", "Loq/i0;", "<anonymous>", "(Lj32/a;Lj32/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<j32.a, j32.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99315e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f99315e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j32.d> bVarY1 = s.this.Y1();
                j32.d.a aVar = j32.d.a.f99247a;
                this.f99315e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j32.a aVar, j32.f fVar, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lj32/f$a;", "it", "Lk10/l;", "Lj32/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<j32.f.a>, tq.e<? super k10.l<? extends j32.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f99318f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f99318f;
            Object objE = uq.b.e();
            int i15 = this.f99317e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            s sVar = s.this;
            this.f99318f = vq.j.a(c0Var);
            this.f99317e = 1;
            Object objX9 = sVar.x9(c0Var, this);
            return objX9 == objE ? objE : objX9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<j32.f.a> c0Var, tq.e<? super k10.l<? extends j32.f>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f99318f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj32/b;", "<unused var>", "Lj32/f$b;", "state", "Loq/i0;", "<anonymous>", "(Lj32/b;Lj32/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<j32.b, j32.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f99320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f99321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f99322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f99323h;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j32.f.Initialized initialized = (j32.f.Initialized) this.f99323h;
            Object objE = uq.b.e();
            int i15 = this.f99322g;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 edorAddress = initialized.getEdorAddress();
                if (edorAddress != null) {
                    s sVar = s.this;
                    String strE = iy.c0.e(edorAddress);
                    this.f99323h = vq.j.a(initialized);
                    this.f99320e = vq.j.a(edorAddress);
                    this.f99321f = 0;
                    this.f99322g = 1;
                    if (sVar.u9(strE, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j32.b bVar, j32.f.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f99323h = initialized;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj32/c;", "<unused var>", "Lj32/f$b;", "state", "Loq/i0;", "<anonymous>", "(Lj32/c;Lj32/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<j32.c, j32.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f99326f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j32.f.Initialized initialized = (j32.f.Initialized) this.f99326f;
            Object objE = uq.b.e();
            int i15 = this.f99325e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                String epuapId = initialized.getEpuapId();
                this.f99326f = vq.j.a(initialized);
                this.f99325e = 1;
                if (sVar.u9(epuapId, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j32.c cVar, j32.f.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = s.this.new f(eVar);
            fVar.f99326f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj32/e;", "action", "Lj32/f$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj32/e;Lj32/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OpenUrl, j32.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f99329f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f99329f;
            Object objE = uq.b.e();
            int i15 = this.f99328e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = s.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f99329f = vq.j.a(openUrl);
                this.f99328e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            s sVar = s.this;
            if (iVar instanceof dx.i.Left) {
                sVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, j32.f.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = s.this.new g(eVar);
            gVar.f99329f = openUrl;
            return gVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, k32.a aVar2, mx.c cVar, u04.a aVar3, p02.q qVar, x xVar, a14.d dVar, ib4.c cVar2, w wVar, i70.e eVar, k02.a aVar4) {
        this.settingsMapper = aVar2;
        this.labelProvider = cVar;
        this.commonEndpoints = aVar3;
        this.getEdorAddressUseCase = qVar;
        this.getOwnerEpuapIdUseCase = xVar;
        this.copyToClipboardUseCase = dVar;
        this.genericDomainErrorMapper = cVar2;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.electronicDeliveryContainersInteractor = aVar4;
        j32.f.a aVar5 = j32.f.a.f99250a;
        this.initialState = aVar5;
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: j32.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f99268a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), j32.g.a.C2328a.f99256a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(j32.f.class), new er.l() { // from class: j32.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f99269a, (z) obj);
            }
        });
        vVar.c(q0.c(j32.f.a.class), new er.l() { // from class: j32.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.C9(this.f99270a, (z) obj);
            }
        });
        vVar.c(q0.c(j32.f.Initialized.class), new er.l() { // from class: j32.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.D9(this.f99271a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, z zVar) {
        c cVar = sVar.new c(null);
        zVar.x(q0.c(j32.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(s sVar, z zVar) {
        zVar.A(sVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(s sVar, z zVar) {
        e eVar = sVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(j32.b.class), oVar, eVar);
        zVar.x(q0.c(j32.c.class), oVar, sVar.new f(null));
        zVar.x(q0.c(OpenUrl.class), oVar, sVar.new g(null));
        return i0.f148189a;
    }

    private final Object s9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new j32.d.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: j32.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.t9(this.f99277a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(s sVar, ib4.c.b bVar) {
        sVar.d9(j32.a.f99244a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u9(String str, tq.e<? super i0> eVar) {
        Object objC = this.copyToClipboardUseCase.c(new a14.d.Params(str, this.labelProvider.c(e02.a.f46568m)), eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j32.g.a v9(j32.f state) {
        return this.settingsMapper.b(new k32.a.Params(state, new er.l() { // from class: j32.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f99272a, (String) obj);
            }
        }, b9(j32.a.f99244a), b9(j32.b.f99245a), b9(j32.c.f99246a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, String str) {
        sVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object x9(c0<j32.f.a> c0Var, tq.e<? super k10.l<j32.f.Initialized>> eVar) throws Throwable {
        a aVar;
        c0<j32.f.a> c0Var2;
        final UserDocumentData userDocumentData;
        dx.i iVar;
        c0<j32.f.a> c0Var3;
        int i15;
        int i16;
        c0<j32.f.a> c0Var4;
        b0 b0Var;
        Object objA;
        final b0 b0Var2;
        int i17;
        final String str;
        dx.b generic;
        c0<j32.f.a> c0Var5;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i18 = aVar.f99302p;
            if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f99302p = i18 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f99300m;
        Object objE = uq.b.e();
        int i19 = aVar.f99302p;
        if (i19 == 0) {
            oq.u.b(objC);
            k02.a aVar2 = this.electronicDeliveryContainersInteractor;
            c0Var2 = c0Var;
            aVar.f99292d = c0Var2;
            aVar.f99302p = 1;
            objC = aVar2.c(aVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i19 != 1) {
            if (i19 == 2) {
                c0Var4 = (c0) aVar.f99292d;
                oq.u.b(objC);
                return c0Var4.c();
            }
            if (i19 == 3) {
                i15 = aVar.f99298k;
                i16 = aVar.f99297j;
                userDocumentData = (UserDocumentData) aVar.f99294f;
                iVar = (dx.i) aVar.f99293e;
                c0Var3 = (c0) aVar.f99292d;
                oq.u.b(objC);
                b0Var = (b0) objC;
                x xVar = this.getOwnerEpuapIdUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                aVar.f99292d = c0Var3;
                aVar.f99293e = vq.j.a(iVar);
                aVar.f99294f = userDocumentData;
                aVar.f99295g = b0Var;
                aVar.f99297j = i16;
                aVar.f99298k = i15;
                aVar.f99302p = 4;
                objA = xVar.a(c1792a, aVar);
                if (objA != objE) {
                    int i25 = i16;
                    b0Var2 = b0Var;
                    objC = objA;
                    i17 = i25;
                    str = (String) objC;
                    if (str == null) {
                    }
                    generic = new dx.b.Generic(null, 1, null);
                    aVar.f99292d = c0Var3;
                    aVar.f99293e = vq.j.a(iVar);
                    aVar.f99294f = vq.j.a(userDocumentData);
                    aVar.f99295g = vq.j.a(b0Var2);
                    aVar.f99296h = vq.j.a(str);
                    aVar.f99297j = i17;
                    aVar.f99298k = i15;
                    aVar.f99299l = 0;
                    aVar.f99302p = 5;
                    if (s9(generic, aVar) != objE) {
                        c0Var5 = c0Var3;
                    }
                }
                return objE;
            }
            if (i19 == 4) {
                i15 = aVar.f99298k;
                i17 = aVar.f99297j;
                b0Var2 = (b0) aVar.f99295g;
                userDocumentData = (UserDocumentData) aVar.f99294f;
                iVar = (dx.i) aVar.f99293e;
                c0Var3 = (c0) aVar.f99292d;
                oq.u.b(objC);
                str = (String) objC;
                if (str == null && str.length() != 0) {
                    return c0Var3.d(new er.l() { // from class: j32.q
                        @Override // er.l
                        public final Object b(Object obj) {
                            return s.y9(this.f99273a, b0Var2, str, userDocumentData, (f.a) obj);
                        }
                    });
                }
                generic = new dx.b.Generic(null, 1, null);
                aVar.f99292d = c0Var3;
                aVar.f99293e = vq.j.a(iVar);
                aVar.f99294f = vq.j.a(userDocumentData);
                aVar.f99295g = vq.j.a(b0Var2);
                aVar.f99296h = vq.j.a(str);
                aVar.f99297j = i17;
                aVar.f99298k = i15;
                aVar.f99299l = 0;
                aVar.f99302p = 5;
                if (s9(generic, aVar) != objE) {
                    c0Var5 = c0Var3;
                }
                return objE;
            }
            if (i19 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var5 = (c0) aVar.f99292d;
            oq.u.b(objC);
            return c0Var5.c();
        }
        c0Var2 = (c0) aVar.f99292d;
        oq.u.b(objC);
        dx.i iVar2 = (dx.i) objC;
        if (iVar2 instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
            aVar.f99292d = c0Var2;
            aVar.f99293e = vq.j.a(iVar2);
            aVar.f99294f = vq.j.a(bVar);
            aVar.f99297j = 0;
            aVar.f99298k = 0;
            aVar.f99302p = 2;
            if (s9(bVar, aVar) != objE) {
                c0Var4 = c0Var2;
                return c0Var4.c();
            }
        } else {
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            userDocumentData = (UserDocumentData) ((dx.i.Right) iVar2).b();
            p02.q qVar = this.getEdorAddressUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f99292d = c0Var2;
            aVar.f99293e = vq.j.a(iVar2);
            aVar.f99294f = userDocumentData;
            aVar.f99297j = 0;
            aVar.f99298k = 0;
            aVar.f99302p = 3;
            Object objA2 = qVar.a(c1792a2, aVar);
            if (objA2 != objE) {
                iVar = iVar2;
                c0Var3 = c0Var2;
                objC = objA2;
                i15 = 0;
                i16 = 0;
                b0Var = (b0) objC;
                x xVar2 = this.getOwnerEpuapIdUseCase;
                gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                aVar.f99292d = c0Var3;
                aVar.f99293e = vq.j.a(iVar);
                aVar.f99294f = userDocumentData;
                aVar.f99295g = b0Var;
                aVar.f99297j = i16;
                aVar.f99298k = i15;
                aVar.f99302p = 4;
                objA = xVar2.a(c1792a3, aVar);
                if (objA != objE) {
                    int i26 = i16;
                    b0Var2 = b0Var;
                    objC = objA;
                    i17 = i26;
                    str = (String) objC;
                    if (str == null) {
                    }
                    generic = new dx.b.Generic(null, 1, null);
                    aVar.f99292d = c0Var3;
                    aVar.f99293e = vq.j.a(iVar);
                    aVar.f99294f = vq.j.a(userDocumentData);
                    aVar.f99295g = vq.j.a(b0Var2);
                    aVar.f99296h = vq.j.a(str);
                    aVar.f99297j = i17;
                    aVar.f99298k = i15;
                    aVar.f99299l = 0;
                    aVar.f99302p = 5;
                    if (s9(generic, aVar) != objE) {
                        c0Var5 = c0Var3;
                        return c0Var5.c();
                    }
                }
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j32.f.Initialized y9(s sVar, b0 b0Var, String str, UserDocumentData userDocumentData, j32.f.a aVar) {
        return new j32.f.Initialized(sVar.commonEndpoints.M(), b0Var, str, userDocumentData);
    }

    @Override // zx.b
    public xw.b<j32.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<j32.f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j32.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
