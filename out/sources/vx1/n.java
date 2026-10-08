package vx1;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lvx1/n;", "Ll00/g;", "Lvx1/e;", "", "Lvx1/f;", "Lyy/a;", "stateMachineFactory", "Lwx1/a;", "mapper", "<init>", "(Lyy/a;Lwx1/a;)V", "state", "Lvx1/f$a;", "k9", "(Lvx1/e;)Lvx1/f$a;", "b", "Lwx1/a;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lvx1/c;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wx1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vx1.c> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f208625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f208626b;

        /* JADX INFO: renamed from: vx1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5482a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f208627a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f208628b;

            /* JADX INFO: renamed from: vx1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5483a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f208629d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f208630e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f208631f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f208633h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f208634j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f208635k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f208636l;

                public C5483a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f208629d = obj;
                    this.f208630e |= PKIFailureInfo.systemUnavail;
                    return C5482a.this.F(null, this);
                }
            }

            public C5482a(mu.h hVar, n nVar) {
                this.f208627a = hVar;
                this.f208628b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5483a c5483a;
                if (eVar instanceof C5483a) {
                    c5483a = (C5483a) eVar;
                    int i15 = c5483a.f208630e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5483a.f208630e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5483a = new C5483a(eVar);
                    }
                } else {
                    c5483a = new C5483a(eVar);
                }
                Object obj2 = c5483a.f208629d;
                Object objE = uq.b.e();
                int i16 = c5483a.f208630e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f208627a;
                    f.Data dataK9 = this.f208628b.k9((e) obj);
                    c5483a.f208631f = vq.j.a(obj);
                    c5483a.f208633h = vq.j.a(c5483a);
                    c5483a.f208634j = vq.j.a(obj);
                    c5483a.f208635k = vq.j.a(hVar);
                    c5483a.f208636l = 0;
                    c5483a.f208630e = 1;
                    if (hVar.F(dataK9, c5483a) == objE) {
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
            this.f208625a = gVar;
            this.f208626b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f208625a.a(new C5482a(hVar, this.f208626b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvx1/a;", "<unused var>", "Lvx1/e;", "Loq/i0;", "<anonymous>", "(Lvx1/a;Lvx1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<vx1.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208637e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f208637e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vx1.c> bVarY1 = n.this.Y1();
                vx1.c.a aVar = vx1.c.a.f208604a;
                this.f208637e = 1;
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
        public final Object w(vx1.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvx1/d;", "<unused var>", "Lvx1/e;", "Loq/i0;", "<anonymous>", "(Lvx1/d;Lvx1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<vx1.d, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208639e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f208639e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vx1.c> bVarY1 = n.this.Y1();
                vx1.c.C5481c c5481c = vx1.c.C5481c.f208606a;
                this.f208639e = 1;
                if (bVarY1.F(c5481c, this) == objE) {
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
        public final Object w(vx1.d dVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvx1/b;", "<unused var>", "Lvx1/e;", "Loq/i0;", "<anonymous>", "(Lvx1/b;Lvx1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<vx1.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208641e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f208641e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vx1.c> bVarY1 = n.this.Y1();
                vx1.c.Faq faq = new vx1.c.Faq(n.this.mapper.e());
                this.f208641e = 1;
                if (bVarY1.F(faq, this) == objE) {
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
        public final Object w(vx1.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, wx1.a aVar2) {
        this.mapper = aVar2;
        e eVar = e.f208608a;
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: vx1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f208619a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(e state) {
        return this.mapper.b(new wx1.a.Params(state, b9(vx1.a.f208602a), b9(vx1.d.f208607a), b9(vx1.b.f208603a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: vx1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f208620a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(vx1.a.class), oVar, bVar);
        zVar.x(q0.c(vx1.d.class), oVar, nVar.new c(null));
        zVar.x(q0.c(vx1.b.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<vx1.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
