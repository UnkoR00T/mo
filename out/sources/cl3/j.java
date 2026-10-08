package cl3;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcl3/j;", "Ll00/g;", "Lcl3/f;", "", "Lyy/a;", "stateMachineFactory", "Lcl3/a;", "contract", "Ldl3/a;", "mapper", "<init>", "(Lyy/a;Lcl3/a;Ldl3/a;)V", "state", "Lcl3/g;", "l9", "(Lcl3/f;)Lcl3/g;", "b", "Lcl3/a;", "k9", "()Lcl3/a;", "c", "Ldl3/a;", "d", "Lcl3/f;", "initialState", "Lxw/b;", "Lcl3/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<f, Object> implements l00.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cl3.a contract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dl3.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<f, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f28184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f28185b;

        /* JADX INFO: renamed from: cl3.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0721a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f28186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f28187b;

            /* JADX INFO: renamed from: cl3.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0722a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f28188d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f28189e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f28190f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f28192h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f28193j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f28194k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f28195l;

                public C0722a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f28188d = obj;
                    this.f28189e |= PKIFailureInfo.systemUnavail;
                    return C0721a.this.F(null, this);
                }
            }

            public C0721a(mu.h hVar, j jVar) {
                this.f28186a = hVar;
                this.f28187b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0722a c0722a;
                if (eVar instanceof C0722a) {
                    c0722a = (C0722a) eVar;
                    int i15 = c0722a.f28189e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0722a.f28189e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0722a = new C0722a(eVar);
                    }
                } else {
                    c0722a = new C0722a(eVar);
                }
                Object obj2 = c0722a.f28188d;
                Object objE = uq.b.e();
                int i16 = c0722a.f28189e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f28186a;
                    g gVarL9 = this.f28187b.l9((f) obj);
                    c0722a.f28190f = vq.j.a(obj);
                    c0722a.f28192h = vq.j.a(c0722a);
                    c0722a.f28193j = vq.j.a(obj);
                    c0722a.f28194k = vq.j.a(hVar);
                    c0722a.f28195l = 0;
                    c0722a.f28189e = 1;
                    if (hVar.F(gVarL9, c0722a) == objE) {
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
            this.f28184a = gVar;
            this.f28185b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g> hVar, tq.e eVar) {
            Object objA = this.f28184a.a(new C0721a(hVar, this.f28185b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcl3/e;", "<unused var>", "Lcl3/f;", "Loq/i0;", "<anonymous>", "(Lcl3/e;Lcl3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<e, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28196e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f28196e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                d.a aVar = d.a.f28172a;
                this.f28196e = 1;
                if (jVar.F(aVar, this) == objE) {
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
        public final Object w(e eVar, f fVar, tq.e<? super i0> eVar2) {
            return j.this.new b(eVar2).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, cl3.a aVar2, dl3.a aVar3) {
        this.contract = aVar2;
        this.mapper = aVar3;
        f fVar = f.f28174a;
        this.initialState = fVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(fVar, new er.l() { // from class: cl3.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.n9(this.f28176a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g l9(f state) {
        return this.mapper.b(new dl3.a.Params(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final j jVar, v vVar) {
        vVar.c(q0.c(f.class), new er.l() { // from class: cl3.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.o9(this.f28177a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(e.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<f, Object> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    /* JADX INFO: renamed from: k9, reason: from getter */
    public cl3.a getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
