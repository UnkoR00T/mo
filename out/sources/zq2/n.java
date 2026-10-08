package zq2;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lzq2/n;", "Ll00/g;", "Lzq2/d;", "", "Lzq2/e;", "Lyy/a;", "stateMachineFactory", "Lbr2/c;", "mapper", "Lar2/a;", "contract", "<init>", "(Lyy/a;Lbr2/c;Lar2/a;)V", "Lzq2/e$a;", "l9", "(Lzq2/d;)Lzq2/e$a;", "b", "Lbr2/c;", "c", "Lar2/a;", "d", "Lzq2/d;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzq2/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final br2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ar2.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zq2.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f236381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f236382b;

        /* JADX INFO: renamed from: zq2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6388a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f236383a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f236384b;

            /* JADX INFO: renamed from: zq2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6389a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f236385d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f236386e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f236387f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f236389h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f236390j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f236391k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f236392l;

                public C6389a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f236385d = obj;
                    this.f236386e |= PKIFailureInfo.systemUnavail;
                    return C6388a.this.F(null, this);
                }
            }

            public C6388a(mu.h hVar, n nVar) {
                this.f236383a = hVar;
                this.f236384b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6389a c6389a;
                if (eVar instanceof C6389a) {
                    c6389a = (C6389a) eVar;
                    int i15 = c6389a.f236386e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6389a.f236386e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6389a = new C6389a(eVar);
                    }
                } else {
                    c6389a = new C6389a(eVar);
                }
                Object obj2 = c6389a.f236385d;
                Object objE = uq.b.e();
                int i16 = c6389a.f236386e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f236383a;
                    e.Data dataL9 = this.f236384b.l9((d) obj);
                    c6389a.f236387f = vq.j.a(obj);
                    c6389a.f236389h = vq.j.a(c6389a);
                    c6389a.f236390j = vq.j.a(obj);
                    c6389a.f236391k = vq.j.a(hVar);
                    c6389a.f236392l = 0;
                    c6389a.f236386e = 1;
                    if (hVar.F(dataL9, c6389a) == objE) {
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
            this.f236381a = gVar;
            this.f236382b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f236381a.a(new C6388a(hVar, this.f236382b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzq2/a;", "<unused var>", "Lzq2/d;", "Loq/i0;", "<anonymous>", "(Lzq2/a;Lzq2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<zq2.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236393e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236393e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<zq2.b> bVarY1 = n.this.Y1();
                zq2.b.a aVar = zq2.b.a.f236357a;
                this.f236393e = 1;
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
        public final Object w(zq2.a aVar, d dVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzq2/c;", "action", "Lzq2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzq2/c;Lzq2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnLocationChosen, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236396f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnLocationChosen onLocationChosen = (OnLocationChosen) this.f236396f;
            Object objE = uq.b.e();
            int i15 = this.f236395e;
            if (i15 == 0) {
                u.b(obj);
                n.this.contract.W7(new ar2.a.Data(onLocationChosen.getLocation()));
                xw.b<zq2.b> bVarY1 = n.this.Y1();
                zq2.b.C6387b c6387b = zq2.b.C6387b.f236358a;
                this.f236396f = vq.j.a(onLocationChosen);
                this.f236395e = 1;
                if (bVarY1.F(c6387b, this) == objE) {
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
        public final Object w(OnLocationChosen onLocationChosen, d dVar, tq.e<? super i0> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f236396f = onLocationChosen;
            return cVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, br2.c cVar, ar2.a aVar2) {
        this.mapper = cVar;
        this.contract = aVar2;
        d dVar = d.f236360a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: zq2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f236374a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(d dVar) {
        return this.mapper.b(new br2.c.Params(dVar, new er.l() { // from class: zq2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f236373a, (yq2.a) obj);
            }
        }, b9(zq2.a.f236356a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, yq2.a aVar) {
        nVar.d9(new OnLocationChosen(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final n nVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: zq2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f236372a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zq2.a.class), oVar, bVar);
        zVar.x(q0.c(OnLocationChosen.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<zq2.b> Y1() {
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
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ar2.a aVar) {
        super.P5(aVar);
    }
}
