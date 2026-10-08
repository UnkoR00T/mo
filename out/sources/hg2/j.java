package hg2;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lhg2/j;", "Ll00/g;", "Lhg2/b;", "", "Lhg2/c;", "Lyy/a;", "stateMachineFactory", "Lig2/a;", "mapper", "<init>", "(Lyy/a;Lig2/a;)V", "state", "Lhg2/c$a$a;", "k9", "(Lhg2/b;)Lhg2/c$a$a;", "b", "Lig2/a;", "Lhg2/b$a;", "c", "Lhg2/b$a;", "initialState", "Lxw/b;", "Lhg2/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lhg2/c$a;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<hg2.b, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ig2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hg2.b.a initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hg2.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<hg2.b, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f84563b;

        /* JADX INFO: renamed from: hg2.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1960a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f84565b;

            /* JADX INFO: renamed from: hg2.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1961a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84566d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84567e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84568f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84570h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84571j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84572k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84573l;

                public C1961a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84566d = obj;
                    this.f84567e |= PKIFailureInfo.systemUnavail;
                    return C1960a.this.F(null, this);
                }
            }

            public C1960a(mu.h hVar, j jVar) {
                this.f84564a = hVar;
                this.f84565b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1961a c1961a;
                if (eVar instanceof C1961a) {
                    c1961a = (C1961a) eVar;
                    int i15 = c1961a.f84567e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1961a.f84567e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1961a = new C1961a(eVar);
                    }
                } else {
                    c1961a = new C1961a(eVar);
                }
                Object obj2 = c1961a.f84566d;
                Object objE = uq.b.e();
                int i16 = c1961a.f84567e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f84564a;
                    c.a.Initialized initializedK9 = this.f84565b.k9((hg2.b) obj);
                    c1961a.f84568f = vq.j.a(obj);
                    c1961a.f84570h = vq.j.a(c1961a);
                    c1961a.f84571j = vq.j.a(obj);
                    c1961a.f84572k = vq.j.a(hVar);
                    c1961a.f84573l = 0;
                    c1961a.f84567e = 1;
                    if (hVar.F(initializedK9, c1961a) == objE) {
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
            this.f84562a = gVar;
            this.f84563b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f84562a.a(new C1960a(hVar, this.f84563b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhg2/a;", "action", "Lhg2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhg2/a;Lhg2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<hg2.a, hg2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84575f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hg2.a aVar = (hg2.a) this.f84575f;
            Object objE = uq.b.e();
            int i15 = this.f84574e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                this.f84575f = vq.j.a(aVar);
                this.f84574e = 1;
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
        public final Object w(hg2.a aVar, hg2.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = j.this.new b(eVar);
            bVar2.f84575f = aVar;
            return bVar2.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, ig2.a aVar2) {
        this.mapper = aVar2;
        hg2.b.a aVar3 = hg2.b.a.f84545a;
        this.initialState = aVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: hg2.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.m9(this.f84555a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.a.Initialized k9(hg2.b state) {
        return this.mapper.b(new ig2.a.Params(state, b9(hg2.a.C1958a.f84541a), b9(hg2.a.b.f84542a), b9(hg2.a.c.f84543a), b9(hg2.a.d.f84544a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final j jVar, v vVar) {
        vVar.c(q0.c(hg2.b.class), new er.l() { // from class: hg2.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.n9(this.f84556a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(hg2.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hg2.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<hg2.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hg2.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
