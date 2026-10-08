package s23;

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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00198\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Ls23/m;", "Ll00/g;", "Ls23/c;", "", "Ls23/d;", "Lyy/a;", "stateMachineFactory", "Lt23/a;", "mapper", "Ls23/b;", "setup", "<init>", "(Lyy/a;Lt23/a;Ls23/b;)V", "state", "Ls23/d$a$a;", "j9", "(Ls23/c;)Ls23/d$a$a;", "b", "Lt23/a;", "c", "Ls23/b;", "Ls23/c$a;", "d", "Ls23/c$a;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ls23/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Ls23/d$a;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t23.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Setup setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c.Content initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<c, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s23.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.a.Content> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f177718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f177719b;

        /* JADX INFO: renamed from: s23.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4537a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f177720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f177721b;

            /* JADX INFO: renamed from: s23.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4538a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f177722d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f177723e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f177724f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f177726h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f177727j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f177728k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f177729l;

                public C4538a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f177722d = obj;
                    this.f177723e |= PKIFailureInfo.systemUnavail;
                    return C4537a.this.F(null, this);
                }
            }

            public C4537a(mu.h hVar, m mVar) {
                this.f177720a = hVar;
                this.f177721b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4538a c4538a;
                if (eVar instanceof C4538a) {
                    c4538a = (C4538a) eVar;
                    int i15 = c4538a.f177723e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4538a.f177723e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4538a = new C4538a(eVar);
                    }
                } else {
                    c4538a = new C4538a(eVar);
                }
                Object obj2 = c4538a.f177722d;
                Object objE = uq.b.e();
                int i16 = c4538a.f177723e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f177720a;
                    d.a.Content contentJ9 = this.f177721b.j9((c) obj);
                    c4538a.f177724f = vq.j.a(obj);
                    c4538a.f177726h = vq.j.a(c4538a);
                    c4538a.f177727j = vq.j.a(obj);
                    c4538a.f177728k = vq.j.a(hVar);
                    c4538a.f177729l = 0;
                    c4538a.f177723e = 1;
                    if (hVar.F(contentJ9, c4538a) == objE) {
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
            this.f177718a = gVar;
            this.f177719b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.a.Content> hVar, tq.e eVar) {
            Object objA = this.f177718a.a(new C4537a(hVar, this.f177719b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls23/a;", "action", "Ls23/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls23/a;Ls23/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<s23.a, c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f177730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f177731f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s23.a aVar = (s23.a) this.f177731f;
            Object objE = uq.b.e();
            int i15 = this.f177730e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<s23.a> bVarY1 = m.this.Y1();
                this.f177731f = vq.j.a(aVar);
                this.f177730e = 1;
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
        public final Object w(s23.a aVar, c cVar, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f177731f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, t23.a aVar2, Setup setup) {
        this.mapper = aVar2;
        this.setup = setup;
        c.Content content = new c.Content(setup.a());
        this.initialState = content;
        this.stateMachine = aVar.a(content, new er.l() { // from class: s23.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.l9(this.f177711a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.a.Content j9(c state) {
        return this.mapper.b(new t23.a.Params(state, b9(s23.a.C4535a.f177695a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final m mVar, v vVar) {
        vVar.c(q0.c(c.class), new er.l() { // from class: s23.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f177710a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        zVar.x(q0.c(s23.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s23.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(Setup setup) {
        super.P5(setup);
    }
}
