package k71;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lk71/j;", "Ll00/g;", "Lk71/b;", "", "Lk71/c;", "Lyy/a;", "stateMachineFactory", "Ll71/a;", "mapper", "<init>", "(Lyy/a;Ll71/a;)V", "state", "Lk71/c$a;", "j9", "(Lk71/b;)Lk71/c$a;", "b", "Ll71/a;", "c", "Lk71/b;", "initialState", "Lxw/b;", "Lk71/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<k71.b, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l71.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k71.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k71.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<k71.b, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f108920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f108921b;

        /* JADX INFO: renamed from: k71.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2592a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f108922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f108923b;

            /* JADX INFO: renamed from: k71.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2593a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f108924d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f108925e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f108926f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f108928h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f108929j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f108930k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f108931l;

                public C2593a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f108924d = obj;
                    this.f108925e |= PKIFailureInfo.systemUnavail;
                    return C2592a.this.F(null, this);
                }
            }

            public C2592a(mu.h hVar, j jVar) {
                this.f108922a = hVar;
                this.f108923b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2593a c2593a;
                if (eVar instanceof C2593a) {
                    c2593a = (C2593a) eVar;
                    int i15 = c2593a.f108925e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2593a.f108925e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2593a = new C2593a(eVar);
                    }
                } else {
                    c2593a = new C2593a(eVar);
                }
                Object obj2 = c2593a.f108924d;
                Object objE = uq.b.e();
                int i16 = c2593a.f108925e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f108922a;
                    c.Data dataJ9 = this.f108923b.j9((k71.b) obj);
                    c2593a.f108926f = vq.j.a(obj);
                    c2593a.f108928h = vq.j.a(c2593a);
                    c2593a.f108929j = vq.j.a(obj);
                    c2593a.f108930k = vq.j.a(hVar);
                    c2593a.f108931l = 0;
                    c2593a.f108925e = 1;
                    if (hVar.F(dataJ9, c2593a) == objE) {
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

        public a(mu.g gVar, j jVar) {
            this.f108920a = gVar;
            this.f108921b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.Data> hVar, tq.e eVar) {
            Object objA = this.f108920a.a(new C2592a(hVar, this.f108921b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk71/a;", "action", "Lk71/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lk71/a;Lk71/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<k71.a, k71.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108933f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k71.a aVar = (k71.a) this.f108933f;
            Object objE = uq.b.e();
            int i15 = this.f108932e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k71.a> bVarY1 = j.this.Y1();
                this.f108933f = vq.j.a(aVar);
                this.f108932e = 1;
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
        public final Object w(k71.a aVar, k71.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = j.this.new b(eVar);
            bVar2.f108933f = aVar;
            return bVar2.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, l71.a aVar2) {
        this.mapper = aVar2;
        k71.b bVar = k71.b.f108901a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: k71.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.l9(this.f108913a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.Data j9(k71.b state) {
        return this.mapper.b(new l71.a.Params(state, b9(k71.a.C2591a.f108896a), b9(k71.a.b.f108897a), b9(k71.a.c.f108898a), b9(k71.a.e.f108900a), b9(k71.a.d.f108899a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final j jVar, v vVar) {
        vVar.c(q0.c(k71.b.class), new er.l() { // from class: k71.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.m9(this.f108914a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(k71.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<k71.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<k71.b, Object> e9() {
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
