package ys2;

import bt2.PeselRestrictionHistoryChecksDetailsDestinationParams;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lys2/n;", "Ll00/g;", "Lys2/d;", "", "Lys2/e;", "Lyy/a;", "stateMachineFactory", "Lat2/a;", "mapper", "Lbt2/a;", "setupData", "<init>", "(Lyy/a;Lat2/a;Lbt2/a;)V", "state", "Lys2/e$a;", "k9", "(Lys2/d;)Lys2/e$a;", "data", "Loq/i0;", "l9", "(Lbt2/a;)V", "b", "Lat2/a;", "c", "Lbt2/a;", "Lys2/d$a;", "d", "Lys2/d$a;", "initialState", "Lxw/b;", "Lys2/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final at2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private PeselRestrictionHistoryChecksDetailsDestinationParams setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d.a initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ys2.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f229254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f229255b;

        /* JADX INFO: renamed from: ys2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6154a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f229256a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f229257b;

            /* JADX INFO: renamed from: ys2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6155a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f229258d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f229259e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f229260f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f229262h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f229263j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f229264k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f229265l;

                public C6155a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f229258d = obj;
                    this.f229259e |= PKIFailureInfo.systemUnavail;
                    return C6154a.this.F(null, this);
                }
            }

            public C6154a(mu.h hVar, n nVar) {
                this.f229256a = hVar;
                this.f229257b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6155a c6155a;
                if (eVar instanceof C6155a) {
                    c6155a = (C6155a) eVar;
                    int i15 = c6155a.f229259e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6155a.f229259e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6155a = new C6155a(eVar);
                    }
                } else {
                    c6155a = new C6155a(eVar);
                }
                Object obj2 = c6155a.f229258d;
                Object objE = uq.b.e();
                int i16 = c6155a.f229259e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f229256a;
                    e.a aVarK9 = this.f229257b.k9((d) obj);
                    c6155a.f229260f = vq.j.a(obj);
                    c6155a.f229262h = vq.j.a(c6155a);
                    c6155a.f229263j = vq.j.a(obj);
                    c6155a.f229264k = vq.j.a(hVar);
                    c6155a.f229265l = 0;
                    c6155a.f229259e = 1;
                    if (hVar.F(aVarK9, c6155a) == objE) {
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
            this.f229254a = gVar;
            this.f229255b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.a> hVar, tq.e eVar) {
            Object objA = this.f229254a.a(new C6154a(hVar, this.f229255b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lys2/c;", "action", "Lk10/c0;", "Lys2/d$a;", "state", "Lk10/l;", "Lys2/d;", "<anonymous>", "(Lys2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<Setup, c0<d.a>, tq.e<? super k10.l<? extends d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229268g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d.Initialized O(Setup setup, d.a aVar) {
            return new d.Initialized(setup.getRestrictionCheck());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Setup setup = (Setup) this.f229267f;
            c0 c0Var = (c0) this.f229268g;
            uq.b.e();
            if (this.f229266e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: ys2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.O(setup, (d.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Setup setup, c0<d.a> c0Var, tq.e<? super k10.l<? extends d>> eVar) {
            b bVar = new b(eVar);
            bVar.f229267f = setup;
            bVar.f229268g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lys2/a;", "<unused var>", "Lys2/d$b;", "Loq/i0;", "<anonymous>", "(Lys2/a;Lys2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ys2.a, d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229269e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229269e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ys2.b> bVarY1 = n.this.Y1();
                ys2.b.a aVar = ys2.b.a.f229228a;
                this.f229269e = 1;
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
        public final Object w(ys2.a aVar, d.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, at2.a aVar2, PeselRestrictionHistoryChecksDetailsDestinationParams peselRestrictionHistoryChecksDetailsDestinationParams) {
        this.mapper = aVar2;
        this.setupData = peselRestrictionHistoryChecksDetailsDestinationParams;
        d.a aVar3 = d.a.f229230a;
        this.initialState = aVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: ys2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f229247a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a k9(d state) {
        return this.mapper.b(new at2.a.Params(state, b9(ys2.a.f229227a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(d.a.class), new er.l() { // from class: ys2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9((z) obj);
            }
        });
        vVar.c(q0.c(d.Initialized.class), new er.l() { // from class: ys2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f229246a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(z zVar) {
        b bVar = new b(null);
        zVar.v(q0.c(Setup.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        zVar.x(q0.c(ys2.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ys2.b> Y1() {
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
    public void P5(PeselRestrictionHistoryChecksDetailsDestinationParams data) {
        this.setupData = data;
        d9(new Setup(data.getRestrictionCheck()));
    }
}
