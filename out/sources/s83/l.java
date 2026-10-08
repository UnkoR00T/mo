package s83;

import er.q;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u83.ReasonListSetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Ls83/l;", "Ll00/g;", "Ls83/d;", "", "Ls83/e;", "Lyy/a;", "stateMachineFactory", "Lt83/b;", "mapper", "Lu83/a;", "setupData", "<init>", "(Lyy/a;Lt83/b;Lu83/a;)V", "state", "Ls83/e$a;", "m9", "(Ls83/d;)Ls83/e$a;", "data", "Loq/i0;", "n9", "(Lu83/a;)V", "b", "Lt83/b;", "c", "Lu83/a;", "Lxw/b;", "Ls83/b;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Ls83/d$a;", "e", "Ls83/d$a;", "getInitialState", "()Ls83/d$a;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t83.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReasonListSetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s83.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f179277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f179278b;

        /* JADX INFO: renamed from: s83.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4607a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f179279a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f179280b;

            /* JADX INFO: renamed from: s83.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4608a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f179281d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f179282e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f179283f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f179285h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f179286j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f179287k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f179288l;

                public C4608a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f179281d = obj;
                    this.f179282e |= PKIFailureInfo.systemUnavail;
                    return C4607a.this.F(null, this);
                }
            }

            public C4607a(mu.h hVar, l lVar) {
                this.f179279a = hVar;
                this.f179280b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4608a c4608a;
                if (eVar instanceof C4608a) {
                    c4608a = (C4608a) eVar;
                    int i15 = c4608a.f179282e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4608a.f179282e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4608a = new C4608a(eVar);
                    }
                } else {
                    c4608a = new C4608a(eVar);
                }
                Object obj2 = c4608a.f179281d;
                Object objE = uq.b.e();
                int i16 = c4608a.f179282e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f179279a;
                    e.a aVarM9 = this.f179280b.m9((d) obj);
                    c4608a.f179283f = vq.j.a(obj);
                    c4608a.f179285h = vq.j.a(c4608a);
                    c4608a.f179286j = vq.j.a(obj);
                    c4608a.f179287k = vq.j.a(hVar);
                    c4608a.f179288l = 0;
                    c4608a.f179282e = 1;
                    if (hVar.F(aVarM9, c4608a) == objE) {
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
            this.f179277a = gVar;
            this.f179278b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.a> hVar, tq.e eVar) {
            Object objA = this.f179277a.a(new C4607a(hVar, this.f179278b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls83/a;", "<unused var>", "Ls83/d;", "Loq/i0;", "<anonymous>", "(Ls83/a;Ls83/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<s83.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179289e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179289e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                s83.b.a aVar = s83.b.a.f179256a;
                this.f179289e = 1;
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
        public final Object w(s83.a aVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls83/c;", "action", "Lk10/c0;", "Ls83/d$a;", "state", "Lk10/l;", "Ls83/d;", "<anonymous>", "(Ls83/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<Setup, c0<d.a>, tq.e<? super k10.l<? extends d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179292f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d.Initialized O(l lVar, d.a aVar) {
            return new d.Initialized(lVar.setupData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f179292f;
            uq.b.e();
            if (this.f179291e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final l lVar = l.this;
            return c0Var.d(new er.l() { // from class: s83.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.c.O(lVar, (d.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Setup setup, c0<d.a> c0Var, tq.e<? super k10.l<? extends d>> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f179292f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, t83.b bVar, ReasonListSetupData reasonListSetupData) {
        this.mapper = bVar;
        this.setupData = reasonListSetupData;
        d.a aVar2 = d.a.f179258a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: s83.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f179270a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a m9(d state) {
        t83.b bVar = this.mapper;
        s83.a aVar = s83.a.f179255a;
        return bVar.b(new t83.b.Params(b9(aVar), b9(aVar), state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: s83.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f179268a, (z) obj);
            }
        });
        vVar.c(q0.c(d.a.class), new er.l() { // from class: s83.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f179269a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(s83.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(l lVar, z zVar) {
        c cVar = lVar.new c(null);
        zVar.v(q0.c(Setup.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s83.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(s83.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public void P5(ReasonListSetupData data) {
        d9(new Setup(data));
    }
}
