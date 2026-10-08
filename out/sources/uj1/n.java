package uj1;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Luj1/n;", "Ll00/g;", "Luj1/d;", "", "Luj1/e;", "Lyy/a;", "stateMachineFactory", "Lvj1/b;", "mapper", "Luj1/f;", "setupContract", "<init>", "(Lyy/a;Lvj1/b;Luj1/f;)V", "state", "Luj1/e$a$a;", "m9", "(Luj1/d;)Luj1/e$a$a;", "b", "Lvj1/b;", "c", "Luj1/f;", "Luj1/d$a;", "d", "Luj1/d$a;", "initialState", "Lxw/b;", "Luj1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Luj1/e$a;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vj1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f setupContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d.Types initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uj1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.a.Types> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f198577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f198578b;

        /* JADX INFO: renamed from: uj1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5168a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f198579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f198580b;

            /* JADX INFO: renamed from: uj1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5169a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f198581d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f198582e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f198583f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f198585h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f198586j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f198587k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f198588l;

                public C5169a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f198581d = obj;
                    this.f198582e |= PKIFailureInfo.systemUnavail;
                    return C5168a.this.F(null, this);
                }
            }

            public C5168a(mu.h hVar, n nVar) {
                this.f198579a = hVar;
                this.f198580b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5169a c5169a;
                if (eVar instanceof C5169a) {
                    c5169a = (C5169a) eVar;
                    int i15 = c5169a.f198582e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5169a.f198582e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5169a = new C5169a(eVar);
                    }
                } else {
                    c5169a = new C5169a(eVar);
                }
                Object obj2 = c5169a.f198581d;
                Object objE = uq.b.e();
                int i16 = c5169a.f198582e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f198579a;
                    e.a.Types typesM9 = this.f198580b.m9((d) obj);
                    c5169a.f198583f = vq.j.a(obj);
                    c5169a.f198585h = vq.j.a(c5169a);
                    c5169a.f198586j = vq.j.a(obj);
                    c5169a.f198587k = vq.j.a(hVar);
                    c5169a.f198588l = 0;
                    c5169a.f198582e = 1;
                    if (hVar.F(typesM9, c5169a) == objE) {
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
            this.f198577a = gVar;
            this.f198578b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.a.Types> hVar, tq.e eVar) {
            Object objA = this.f198577a.a(new C5168a(hVar, this.f198578b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luj1/a;", "<unused var>", "Luj1/d$a;", "Loq/i0;", "<anonymous>", "(Luj1/a;Luj1/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<uj1.a, d.Types, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198589e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198589e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                uj1.b.a aVar = uj1.b.a.f198554a;
                this.f198589e = 1;
                if (nVar.F(aVar, this) == objE) {
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
        public final Object w(uj1.a aVar, d.Types types, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luj1/c;", "action", "Luj1/d$a;", "state", "Loq/i0;", "<anonymous>", "(Luj1/c;Luj1/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<TypeSelected, d.Types, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198592f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            TypeSelected typeSelected = (TypeSelected) this.f198592f;
            Object objE = uq.b.e();
            int i15 = this.f198591e;
            if (i15 == 0) {
                u.b(obj);
                n.this.setupContract.K6(typeSelected.getTypeCode());
                n nVar = n.this;
                uj1.b.C5166b c5166b = uj1.b.C5166b.f198555a;
                this.f198592f = vq.j.a(typeSelected);
                this.f198591e = 1;
                if (nVar.F(c5166b, this) == objE) {
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
        public final Object w(TypeSelected typeSelected, d.Types types, tq.e<? super i0> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f198592f = typeSelected;
            return cVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, vj1.b bVar, f fVar) {
        this.mapper = bVar;
        this.setupContract = fVar;
        d.Types types = new d.Types(fVar.S1());
        this.initialState = types;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(types, new er.l() { // from class: uj1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f198570a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(types));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a.Types m9(d state) {
        return this.mapper.b(new vj1.b.Params(state, b9(uj1.a.f198553a), new er.l() { // from class: uj1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f198569a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, String str) {
        nVar.d9(new TypeSelected(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(d.Types.class), new er.l() { // from class: uj1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f198568a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(uj1.a.class), oVar, bVar);
        zVar.x(q0.c(TypeSelected.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<uj1.b> Y1() {
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
    public /* bridge */ Object F(uj1.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(f fVar) {
        super.P5(fVar);
    }
}
