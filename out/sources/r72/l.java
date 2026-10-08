package r72;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lr72/l;", "Ll00/g;", "Lr72/c;", "", "Lr72/d;", "Lyy/a;", "stateMachineFactory", "Lr72/e;", "mapper", "<init>", "(Lyy/a;Lr72/e;)V", "state", "Lr72/d$a;", "k9", "(Lr72/c;)Lr72/d$a;", "b", "Lr72/e;", "c", "Lr72/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lr72/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r72.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f172298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f172299b;

        /* JADX INFO: renamed from: r72.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4391a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f172300a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f172301b;

            /* JADX INFO: renamed from: r72.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4392a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f172302d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f172303e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f172304f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f172306h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f172307j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f172308k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f172309l;

                public C4392a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f172302d = obj;
                    this.f172303e |= PKIFailureInfo.systemUnavail;
                    return C4391a.this.F(null, this);
                }
            }

            public C4391a(mu.h hVar, l lVar) {
                this.f172300a = hVar;
                this.f172301b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4392a c4392a;
                if (eVar instanceof C4392a) {
                    c4392a = (C4392a) eVar;
                    int i15 = c4392a.f172303e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4392a.f172303e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4392a = new C4392a(eVar);
                    }
                } else {
                    c4392a = new C4392a(eVar);
                }
                Object obj2 = c4392a.f172302d;
                Object objE = uq.b.e();
                int i16 = c4392a.f172303e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f172300a;
                    d.Data dataK9 = this.f172301b.k9((c) obj);
                    c4392a.f172304f = vq.j.a(obj);
                    c4392a.f172306h = vq.j.a(c4392a);
                    c4392a.f172307j = vq.j.a(obj);
                    c4392a.f172308k = vq.j.a(hVar);
                    c4392a.f172309l = 0;
                    c4392a.f172303e = 1;
                    if (hVar.F(dataK9, c4392a) == objE) {
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
            this.f172298a = gVar;
            this.f172299b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f172298a.a(new C4391a(hVar, this.f172299b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr72/a;", "<unused var>", "Lr72/c;", "Loq/i0;", "<anonymous>", "(Lr72/a;Lr72/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<r72.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172310e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f172310e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                r72.b.a aVar = r72.b.a.f172278a;
                this.f172310e = 1;
                if (lVar.F(aVar, this) == objE) {
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
        public final Object w(r72.a aVar, c cVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, e eVar) {
        this.mapper = eVar;
        c cVar = c.f172279a;
        this.initialState = cVar;
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: r72.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f172291a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(cVar));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(c state) {
        return this.mapper.b(new e.Params(state, b9(r72.a.f172277a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: r72.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f172292a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(r72.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<r72.b> Y1() {
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
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(r72.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
