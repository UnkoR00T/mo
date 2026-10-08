package d23;

import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ld23/k;", "Ll00/g;", "Ld23/b;", "", "Ld23/c;", "Lyy/a;", "stateMachineFactory", "Le23/a;", "mapper", "<init>", "(Lyy/a;Le23/a;)V", "state", "Ld23/c$a;", "j9", "(Ld23/b;)Ld23/c$a;", "b", "Le23/a;", "c", "Ld23/b;", "initialState", "Lxw/b;", "Ld23/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<d23.b, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e23.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d23.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d23.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<d23.b, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f39505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f39506b;

        /* JADX INFO: renamed from: d23.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0849a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f39507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f39508b;

            /* JADX INFO: renamed from: d23.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0850a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f39509d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f39510e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f39511f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f39513h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f39514j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f39515k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f39516l;

                public C0850a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f39509d = obj;
                    this.f39510e |= PKIFailureInfo.systemUnavail;
                    return C0849a.this.F(null, this);
                }
            }

            public C0849a(mu.h hVar, k kVar) {
                this.f39507a = hVar;
                this.f39508b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0850a c0850a;
                if (eVar instanceof C0850a) {
                    c0850a = (C0850a) eVar;
                    int i15 = c0850a.f39510e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0850a.f39510e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0850a = new C0850a(eVar);
                    }
                } else {
                    c0850a = new C0850a(eVar);
                }
                Object obj2 = c0850a.f39509d;
                Object objE = uq.b.e();
                int i16 = c0850a.f39510e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f39507a;
                    c.Data dataJ9 = this.f39508b.j9((d23.b) obj);
                    c0850a.f39511f = vq.j.a(obj);
                    c0850a.f39513h = vq.j.a(c0850a);
                    c0850a.f39514j = vq.j.a(obj);
                    c0850a.f39515k = vq.j.a(hVar);
                    c0850a.f39516l = 0;
                    c0850a.f39510e = 1;
                    if (hVar.F(dataJ9, c0850a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f39505a = gVar;
            this.f39506b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.Data> hVar, tq.e eVar) {
            Object objA = this.f39505a.a(new C0849a(hVar, this.f39506b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld23/a;", "action", "Ld23/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ld23/a;Ld23/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<d23.a, d23.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39518f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d23.a aVar = (d23.a) this.f39518f;
            Object objE = uq.b.e();
            int i15 = this.f39517e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<d23.a> bVarY1 = k.this.Y1();
                this.f39518f = vq.j.a(aVar);
                this.f39517e = 1;
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
        public final Object w(d23.a aVar, d23.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = k.this.new b(eVar);
            bVar2.f39518f = aVar;
            return bVar2.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, e23.a aVar2) {
        this.mapper = aVar2;
        d23.b bVar = d23.b.f39486a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: d23.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.l9(this.f39498a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.Data j9(d23.b state) {
        return this.mapper.b(new e23.a.Params(state, b9(d23.a.C0848a.f39485a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final k kVar, v vVar) {
        vVar.c(q0.c(d23.b.class), new er.l() { // from class: d23.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f39499a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(d23.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d23.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d23.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
