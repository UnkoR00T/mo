package vg2;

import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq0.MyRegistry;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lvg2/u;", "Ll00/g;", "Lvg2/b;", "Lvg2/a;", "Lvg2/c;", "", "Lyy/a;", "stateMachineFactory", "Lwg2/b;", "mapper", "Lvq0/f;", "getMyRegistriesUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "domainErrorFactory", "Lac4/a;", "loaderUseCase", "Lvg2/d;", "setupContract", "<init>", "(Lyy/a;Lwg2/b;Lvq0/f;Lhb4/d;Lib4/c;Lac4/a;Lvg2/d;)V", "state", "Lvg2/c$a;", "w9", "(Lvg2/b;)Lvg2/c$a;", "b", "Lwg2/b;", "c", "Lvq0/f;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lvg2/d;", "Lvg2/b$c;", "h", "Lvg2/b$c;", "initialState", "Lxw/b;", "Lvg2/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<vg2.b, vg2.a> implements vg2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wg2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vq0.f getMyRegistriesUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final vg2.d setupContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final vg2.b.c initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vg2.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<vg2.b, vg2.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<vg2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<vg2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f206762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f206763b;

        /* JADX INFO: renamed from: vg2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5411a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f206764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f206765b;

            /* JADX INFO: renamed from: vg2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5412a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f206766d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f206767e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f206768f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f206770h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f206771j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f206772k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f206773l;

                public C5412a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f206766d = obj;
                    this.f206767e |= PKIFailureInfo.systemUnavail;
                    return C5411a.this.F(null, this);
                }
            }

            public C5411a(mu.h hVar, u uVar) {
                this.f206764a = hVar;
                this.f206765b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5412a c5412a;
                if (eVar instanceof C5412a) {
                    c5412a = (C5412a) eVar;
                    int i15 = c5412a.f206767e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5412a.f206767e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5412a = new C5412a(eVar);
                    }
                } else {
                    c5412a = new C5412a(eVar);
                }
                Object obj2 = c5412a.f206766d;
                Object objE = uq.b.e();
                int i16 = c5412a.f206767e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f206764a;
                    vg2.c.a aVarW9 = this.f206765b.w9((vg2.b) obj);
                    c5412a.f206768f = vq.j.a(obj);
                    c5412a.f206770h = vq.j.a(c5412a);
                    c5412a.f206771j = vq.j.a(obj);
                    c5412a.f206772k = vq.j.a(hVar);
                    c5412a.f206773l = 0;
                    c5412a.f206767e = 1;
                    if (hVar.F(aVarW9, c5412a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, u uVar) {
            this.f206762a = gVar;
            this.f206763b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super vg2.c.a> hVar, tq.e eVar) {
            Object objA = this.f206762a.a(new C5411a(hVar, this.f206763b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvg2/a$b;", "action", "Lvg2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvg2/a$b;Lvg2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<vg2.a.b, vg2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206775f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vg2.a.b bVar = (vg2.a.b) this.f206775f;
            Object objE = uq.b.e();
            int i15 = this.f206774e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f206775f = vq.j.a(bVar);
                this.f206774e = 1;
                if (uVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vg2.a.b bVar, vg2.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = u.this.new b(eVar);
            bVar3.f206775f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lvg2/b$c;", "state", "Lk10/l;", "Lvg2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<vg2.b.c>, tq.e<? super k10.l<? extends vg2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206778f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lvg2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends vg2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f206780e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f206781f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<vg2.b.c> f206782g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<vg2.b.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f206781f = uVar;
                this.f206782g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vg2.b.Error Y(final u uVar, dx.b bVar, vg2.b.c cVar) {
                return new vg2.b.Error(uVar.errorVMSFactory.a(uVar.domainErrorFactory.b(new ib4.c.Params(bVar, false, new er.l() { // from class: vg2.x
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.c.a.Z(uVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(u uVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    uVar.d9(vg2.a.c.f206705a);
                } else {
                    uVar.d9(vg2.a.b.C5405a.f206703a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vg2.b.Content a0(List list, vg2.b.c cVar) {
                return new vg2.b.Content(list, null, false, 6, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f206780e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vq0.f fVar = this.f206781f.getMyRegistriesUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f206780e = 1;
                    obj = fVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<vg2.b.c> c0Var = this.f206782g;
                final u uVar = this.f206781f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: vg2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.Y(uVar, bVar, (b.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: vg2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.c.a.a0(list, (b.c) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f206781f, this.f206782g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends vg2.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f206778f;
            Object objE = uq.b.e();
            int i15 = this.f206777e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.loaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f206778f = vq.j.a(c0Var);
            this.f206777e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<vg2.b.c> c0Var, tq.e<? super k10.l<? extends vg2.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = u.this.new c(eVar);
            cVar.f206778f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvg2/a$c;", "<unused var>", "Lk10/c0;", "Lvg2/b$b;", "state", "Lk10/l;", "Lvg2/b;", "<anonymous>", "(Lvg2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<vg2.a.c, k10.c0<vg2.b.Error>, tq.e<? super k10.l<? extends vg2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206784f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vg2.b.c O(vg2.b.Error error) {
            return vg2.b.c.f206713a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f206784f;
            uq.b.e();
            if (this.f206783e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: vg2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.d.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vg2.a.c cVar, k10.c0<vg2.b.Error> c0Var, tq.e<? super k10.l<? extends vg2.b>> eVar) {
            d dVar = new d(eVar);
            dVar.f206784f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvg2/a$d;", "action", "Lk10/c0;", "Lvg2/b$a;", "state", "Lk10/l;", "Lvg2/b;", "<anonymous>", "(Lvg2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<vg2.a.SetSearchActive, k10.c0<vg2.b.Content>, tq.e<? super k10.l<? extends vg2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206787g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vg2.b.Content O(vg2.a.SetSearchActive setSearchActive, vg2.b.Content content) {
            return vg2.b.Content.b(content, null, setSearchActive.getIsActive() ? content.getSearchQuery() : "", setSearchActive.getIsActive(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vg2.a.SetSearchActive setSearchActive = (vg2.a.SetSearchActive) this.f206786f;
            k10.c0 c0Var = (k10.c0) this.f206787g;
            uq.b.e();
            if (this.f206785e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: vg2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(setSearchActive, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vg2.a.SetSearchActive setSearchActive, k10.c0<vg2.b.Content> c0Var, tq.e<? super k10.l<? extends vg2.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f206786f = setSearchActive;
            eVar2.f206787g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvg2/a$a;", "action", "Lvg2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvg2/a$a;Lvg2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<vg2.a.GoToItem, vg2.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206789f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vg2.a.GoToItem goToItem = (vg2.a.GoToItem) this.f206789f;
            Object objE = uq.b.e();
            int i15 = this.f206788e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.setupContract.W5(goToItem.getItem());
                u uVar = u.this;
                vg2.a.b.GoToItem goToItem2 = new vg2.a.b.GoToItem(goToItem.getItem());
                this.f206789f = vq.j.a(goToItem);
                this.f206788e = 1;
                if (uVar.F(goToItem2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vg2.a.GoToItem goToItem, vg2.b.Content content, tq.e<? super i0> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f206789f = goToItem;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvg2/a$e;", "action", "Lk10/c0;", "Lvg2/b$a;", "state", "Lk10/l;", "Lvg2/b;", "<anonymous>", "(Lvg2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<vg2.a.SetSearchQuery, k10.c0<vg2.b.Content>, tq.e<? super k10.l<? extends vg2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206793g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vg2.b.Content O(vg2.a.SetSearchQuery setSearchQuery, vg2.b.Content content) {
            return vg2.b.Content.b(content, null, setSearchQuery.getQuery(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vg2.a.SetSearchQuery setSearchQuery = (vg2.a.SetSearchQuery) this.f206792f;
            k10.c0 c0Var = (k10.c0) this.f206793g;
            uq.b.e();
            if (this.f206791e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: vg2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O(setSearchQuery, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vg2.a.SetSearchQuery setSearchQuery, k10.c0<vg2.b.Content> c0Var, tq.e<? super k10.l<? extends vg2.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f206792f = setSearchQuery;
            gVar.f206793g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, wg2.b bVar, vq0.f fVar, hb4.d dVar, ib4.c cVar, ac4.a aVar2, vg2.d dVar2) {
        this.mapper = bVar;
        this.getMyRegistriesUC = fVar;
        this.errorVMSFactory = dVar;
        this.domainErrorFactory = cVar;
        this.loaderUseCase = aVar2;
        this.setupContract = dVar2;
        vg2.b.c cVar2 = vg2.b.c.f206713a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: vg2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.B9(this.f206751a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), w9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(vg2.b.class), new er.l() { // from class: vg2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.C9(this.f206748a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(vg2.b.c.class), new er.l() { // from class: vg2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f206749a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(vg2.b.Error.class), new er.l() { // from class: vg2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9((k10.z) obj);
            }
        });
        vVar.c(q0.c(vg2.b.Content.class), new er.l() { // from class: vg2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f206750a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        zVar.x(q0.c(vg2.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(u uVar, k10.z zVar) {
        zVar.A(uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(k10.z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(vg2.a.c.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(u uVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(vg2.a.SetSearchActive.class), oVar, eVar);
        zVar.x(q0.c(vg2.a.GoToItem.class), oVar, uVar.new f(null));
        zVar.v(q0.c(vg2.a.SetSearchQuery.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vg2.c.a w9(vg2.b state) {
        return this.mapper.b(new wg2.b.Params(state, b9(vg2.a.b.C5405a.f206703a), new er.l() { // from class: vg2.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.x9(this.f206745a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: vg2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f206746a, (String) obj);
            }
        }, b9(new vg2.a.SetSearchQuery("")), b9(new vg2.a.SetSearchActive(false)), new er.l() { // from class: vg2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.z9(this.f206747a, (MyRegistry) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(u uVar, boolean z15) {
        uVar.d9(new vg2.a.SetSearchActive(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(u uVar, String str) {
        uVar.d9(new vg2.a.SetSearchQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(u uVar, MyRegistry myRegistry) {
        uVar.d9(new vg2.a.GoToItem(myRegistry));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(vg2.d dVar) {
        super.P5(dVar);
    }

    @Override // zx.b
    public xw.b<vg2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<vg2.b, vg2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<vg2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(vg2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
