package vo2;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00128\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lvo2/n;", "Ll00/g;", "Lvo2/d;", "", "Lvo2/e;", "Lyy/a;", "stateMachineFactory", "Lwo2/a;", "screenMapper", "<init>", "(Lyy/a;Lwo2/a;)V", "Lvo2/e$a;", "j9", "()Lvo2/e$a;", "b", "Lwo2/a;", "getScreenMapper", "()Lwo2/a;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lvo2/c;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wo2.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vo2.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state = a9(new a(e9().getState(), this), j9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f207694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f207695b;

        /* JADX INFO: renamed from: vo2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5451a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f207696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f207697b;

            /* JADX INFO: renamed from: vo2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5452a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f207698d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f207699e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f207700f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f207702h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f207703j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f207704k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f207705l;

                public C5452a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f207698d = obj;
                    this.f207699e |= PKIFailureInfo.systemUnavail;
                    return C5451a.this.F(null, this);
                }
            }

            public C5451a(mu.h hVar, n nVar) {
                this.f207696a = hVar;
                this.f207697b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5452a c5452a;
                if (eVar instanceof C5452a) {
                    c5452a = (C5452a) eVar;
                    int i15 = c5452a.f207699e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5452a.f207699e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5452a = new C5452a(eVar);
                    }
                } else {
                    c5452a = new C5452a(eVar);
                }
                Object obj2 = c5452a.f207698d;
                Object objE = uq.b.e();
                int i16 = c5452a.f207699e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f207696a;
                    e.Data dataJ9 = this.f207697b.j9();
                    c5452a.f207700f = vq.j.a(obj);
                    c5452a.f207702h = vq.j.a(c5452a);
                    c5452a.f207703j = vq.j.a(obj);
                    c5452a.f207704k = vq.j.a(hVar);
                    c5452a.f207705l = 0;
                    c5452a.f207699e = 1;
                    if (hVar.F(dataJ9, c5452a) == objE) {
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
            this.f207694a = gVar;
            this.f207695b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f207694a.a(new C5451a(hVar, this.f207695b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvo2/a;", "<unused var>", "Lvo2/d;", "Loq/i0;", "<anonymous>", "(Lvo2/a;Lvo2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<vo2.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207706e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207706e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vo2.c> bVarY1 = n.this.Y1();
                vo2.c.a aVar = vo2.c.a.f207671a;
                this.f207706e = 1;
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
        public final Object w(vo2.a aVar, d dVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvo2/b;", "<unused var>", "Lvo2/d;", "Loq/i0;", "<anonymous>", "(Lvo2/b;Lvo2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<vo2.b, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207708e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207708e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vo2.c> bVarY1 = n.this.Y1();
                vo2.c.b bVar = vo2.c.b.f207672a;
                this.f207708e = 1;
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
        public final Object w(vo2.b bVar, d dVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, wo2.a aVar2) {
        this.screenMapper = aVar2;
        this.stateMachine = aVar.a(d.f207673a, new er.l() { // from class: vo2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f207688a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9() {
        return this.screenMapper.b(new wo2.a.Params(b9(vo2.a.f207669a), b9(vo2.b.f207670a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final n nVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: vo2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f207689a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(vo2.a.class), oVar, bVar);
        zVar.x(q0.c(vo2.b.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<vo2.c> Y1() {
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
