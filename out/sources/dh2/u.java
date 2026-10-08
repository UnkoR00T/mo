package dh2;

import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Ldh2/u;", "Ll00/g;", "Ldh2/b;", "Ldh2/a;", "Ldh2/c;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "loaderUseCase", "Lvq0/g;", "getOrderedDocumentsUC", "Lbg2/f;", "searchDocumentUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "domainErrorFactory", "Leh2/b;", "mapper", "<init>", "(Lyy/a;Lac4/a;Lvq0/g;Lbg2/f;Lhb4/d;Lib4/c;Leh2/b;)V", "state", "Ldh2/c$a;", "t9", "(Ldh2/b;)Ldh2/c$a;", "b", "Lbg2/f;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Leh2/b;", "Ldh2/b$d;", "f", "Ldh2/b$d;", "initialState", "Lxw/b;", "Ldh2/a$a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<dh2.b, dh2.a> implements dh2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bg2.f searchDocumentUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final eh2.b mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dh2.b.d initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dh2.a.InterfaceC0930a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<dh2.b, dh2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<dh2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<dh2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f42629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f42630b;

        /* JADX INFO: renamed from: dh2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0936a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f42631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f42632b;

            /* JADX INFO: renamed from: dh2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0937a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f42633d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f42634e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f42635f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f42637h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f42638j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f42639k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f42640l;

                public C0937a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f42633d = obj;
                    this.f42634e |= PKIFailureInfo.systemUnavail;
                    return C0936a.this.F(null, this);
                }
            }

            public C0936a(mu.h hVar, u uVar) {
                this.f42631a = hVar;
                this.f42632b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0937a c0937a;
                if (eVar instanceof C0937a) {
                    c0937a = (C0937a) eVar;
                    int i15 = c0937a.f42634e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0937a.f42634e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0937a = new C0937a(eVar);
                    }
                } else {
                    c0937a = new C0937a(eVar);
                }
                Object obj2 = c0937a.f42633d;
                Object objE = uq.b.e();
                int i16 = c0937a.f42634e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f42631a;
                    dh2.c.a aVarT9 = this.f42632b.t9((dh2.b) obj);
                    c0937a.f42635f = vq.j.a(obj);
                    c0937a.f42637h = vq.j.a(c0937a);
                    c0937a.f42638j = vq.j.a(obj);
                    c0937a.f42639k = vq.j.a(hVar);
                    c0937a.f42640l = 0;
                    c0937a.f42634e = 1;
                    if (hVar.F(aVarT9, c0937a) == objE) {
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
            this.f42629a = gVar;
            this.f42630b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dh2.c.a> hVar, tq.e eVar) {
            Object objA = this.f42629a.a(new C0936a(hVar, this.f42630b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh2/a$a;", "action", "Ldh2/b;", "state", "Loq/i0;", "<anonymous>", "(Ldh2/a$a;Ldh2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<dh2.a.InterfaceC0930a, dh2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f42643g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh2.a.InterfaceC0930a interfaceC0930a = (dh2.a.InterfaceC0930a) this.f42642f;
            dh2.b bVar = (dh2.b) this.f42643g;
            Object objE = uq.b.e();
            int i15 = this.f42641e;
            if (i15 == 0) {
                oq.u.b(obj);
                if ((interfaceC0930a instanceof dh2.a.InterfaceC0930a.C0931a) && (bVar instanceof dh2.b.Content) && ((dh2.b.Content) bVar).getIsSearchActive()) {
                    u.this.d9(new dh2.a.OnActiveChange(false));
                    return i0.f148189a;
                }
                u uVar = u.this;
                this.f42642f = vq.j.a(interfaceC0930a);
                this.f42643g = vq.j.a(bVar);
                this.f42641e = 1;
                if (uVar.F(interfaceC0930a, this) == objE) {
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
        public final Object w(dh2.a.InterfaceC0930a interfaceC0930a, dh2.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = u.this.new b(eVar);
            bVar2.f42642f = interfaceC0930a;
            bVar2.f42643g = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldh2/a$f;", "<unused var>", "Lk10/c0;", "Ldh2/b;", "state", "Lk10/l;", "<anonymous>", "(Ldh2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<dh2.a.f, k10.c0<dh2.b>, tq.e<? super k10.l<? extends dh2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ac4.a f42647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ vq0.g f42648h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ u f42649j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ldh2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends dh2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f42650e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ vq0.g f42651f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<dh2.b> f42652g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ u f42653h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(vq0.g gVar, k10.c0<dh2.b> c0Var, u uVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f42651f = gVar;
                this.f42652g = c0Var;
                this.f42653h = uVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final dh2.b.Error Y(final u uVar, dx.b bVar, dh2.b bVar2) {
                return new dh2.b.Error(uVar.errorVMSFactory.a(uVar.domainErrorFactory.b(new ib4.c.Params(bVar, false, new er.l() { // from class: dh2.x
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.c.a.Z(uVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(u uVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    uVar.d9(dh2.a.f.f42570a);
                } else {
                    uVar.d9(dh2.a.InterfaceC0930a.C0931a.f42561a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final dh2.b a0(List list, dh2.b bVar) {
                return list.isEmpty() ? dh2.b.C0932b.f42575a : new dh2.b.Content("", false, list, list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f42650e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vq0.g gVar = this.f42651f;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f42650e = 1;
                    obj = gVar.c(c1792a, this);
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
                k10.c0<dh2.b> c0Var = this.f42652g;
                final u uVar = this.f42653h;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: dh2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.Y(uVar, bVar, (b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: dh2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.c.a.a0(list, (b) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f42651f, this.f42652g, this.f42653h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends dh2.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ac4.a aVar, vq0.g gVar, u uVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f42647g = aVar;
            this.f42648h = gVar;
            this.f42649j = uVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f42646f;
            Object objE = uq.b.e();
            int i15 = this.f42645e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = this.f42647g;
            a aVar2 = new a(this.f42648h, c0Var, this.f42649j, null);
            this.f42646f = vq.j.a(c0Var);
            this.f42645e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dh2.a.f fVar, k10.c0<dh2.b> c0Var, tq.e<? super k10.l<? extends dh2.b>> eVar) {
            c cVar = new c(this.f42647g, this.f42648h, this.f42649j, eVar);
            cVar.f42646f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh2/b$d;", "it", "Loq/i0;", "<anonymous>", "(Ldh2/b$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<dh2.b.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42654e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f42654e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(dh2.a.f.f42570a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dh2.b.d dVar, tq.e<? super i0> eVar) {
            return ((d) v(dVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldh2/a$b;", "action", "Lk10/c0;", "Ldh2/b$a;", "state", "Lk10/l;", "Ldh2/b;", "<anonymous>", "(Ldh2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dh2.a.OnActiveChange, k10.c0<dh2.b.Content>, tq.e<? super k10.l<? extends dh2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f42658g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dh2.b.Content O(dh2.a.OnActiveChange onActiveChange, dh2.b.Content content) {
            return dh2.b.Content.b(content, null, onActiveChange.getActive(), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dh2.a.OnActiveChange onActiveChange = (dh2.a.OnActiveChange) this.f42657f;
            k10.c0 c0Var = (k10.c0) this.f42658g;
            uq.b.e();
            if (this.f42656e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dh2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(onActiveChange, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dh2.a.OnActiveChange onActiveChange, k10.c0<dh2.b.Content> c0Var, tq.e<? super k10.l<? extends dh2.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f42657f = onActiveChange;
            eVar2.f42658g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldh2/a$e;", "action", "Lk10/c0;", "Ldh2/b$a;", "state", "Lk10/l;", "Ldh2/b;", "<anonymous>", "(Ldh2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<dh2.a.OnQueryChange, k10.c0<dh2.b.Content>, tq.e<? super k10.l<? extends dh2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42660f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f42661g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dh2.b.Content O(dh2.a.OnQueryChange onQueryChange, u uVar, k10.c0 c0Var, dh2.b.Content content) {
            return dh2.b.Content.b(content, onQueryChange.getQuery(), false, uVar.searchDocumentUC.a(new bg2.f.Params(((dh2.b.Content) c0Var.a()).d(), onQueryChange.getQuery())), null, 10, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dh2.a.OnQueryChange onQueryChange = (dh2.a.OnQueryChange) this.f42660f;
            final k10.c0 c0Var = (k10.c0) this.f42661g;
            uq.b.e();
            if (this.f42659e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.b(new er.l() { // from class: dh2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(onQueryChange, uVar, c0Var, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dh2.a.OnQueryChange onQueryChange, k10.c0<dh2.b.Content> c0Var, tq.e<? super k10.l<? extends dh2.b>> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f42660f = onQueryChange;
            fVar.f42661g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldh2/a$c;", "<unused var>", "Lk10/c0;", "Ldh2/b$a;", "state", "Lk10/l;", "Ldh2/b;", "<anonymous>", "(Ldh2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dh2.a.c, k10.c0<dh2.b.Content>, tq.e<? super k10.l<? extends dh2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42664f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dh2.b.Content O(dh2.b.Content content) {
            return dh2.b.Content.b(content, "", false, content.d(), null, 10, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f42664f;
            uq.b.e();
            if (this.f42663e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dh2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O((b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dh2.a.c cVar, k10.c0<dh2.b.Content> c0Var, tq.e<? super k10.l<? extends dh2.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f42664f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh2/a$d;", "action", "Ldh2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldh2/a$d;Ldh2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dh2.a.OnClickOrder, dh2.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42666f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r7.F(r2, r6) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            if (r7.F(r2, r6) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
        
            if (r7.F(r2, r6) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f42666f
                dh2.a$d r0 = (dh2.a.OnClickOrder) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f42665e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L23
                if (r2 == r5) goto L1e
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L9b
            L23:
                oq.u.b(r7)
                tq0.k r7 = r0.getOrderedDocument()
                boolean r2 = r7 instanceof tq0.k.b
                if (r2 == 0) goto L4f
                dh2.u r7 = dh2.u.this
                dh2.a$a$c r2 = new dh2.a$a$c
                bh2.b r3 = new bh2.b
                tq0.k r4 = r0.getOrderedDocument()
                tq0.k$b r4 = (tq0.k.b) r4
                r3.<init>(r4)
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f42666f = r0
                r6.f42665e = r5
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L9b
                goto L9a
            L4f:
                boolean r2 = r7 instanceof tq0.k.Generating
                if (r2 == 0) goto L74
                dh2.u r7 = dh2.u.this
                dh2.a$a$b r2 = new dh2.a$a$b
                tq0.k r3 = r0.getOrderedDocument()
                tq0.k$d r3 = (tq0.k.Generating) r3
                java.lang.String r3 = r3.getId()
                r5 = 0
                r2.<init>(r3, r5)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f42666f = r0
                r6.f42665e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L9b
                goto L9a
            L74:
                boolean r2 = r7 instanceof tq0.k.Rejected
                if (r2 != 0) goto L88
                boolean r2 = r7 instanceof tq0.k.GenericError
                if (r2 == 0) goto L7d
                goto L88
            L7d:
                boolean r7 = r7 instanceof tq0.k.PaymentError
                if (r7 == 0) goto L82
                goto L9b
            L82:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L88:
                dh2.u r7 = dh2.u.this
                dh2.a$a$d r2 = dh2.a.InterfaceC0930a.d.f42564a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f42666f = r0
                r6.f42665e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L9b
            L9a:
                return r1
            L9b:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dh2.u.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dh2.a.OnClickOrder onClickOrder, dh2.b.Content content, tq.e<? super i0> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f42666f = onClickOrder;
            return hVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, final ac4.a aVar2, final vq0.g gVar, bg2.f fVar, hb4.d dVar, ib4.c cVar, eh2.b bVar) {
        this.searchDocumentUC = fVar;
        this.errorVMSFactory = dVar;
        this.domainErrorFactory = cVar;
        this.mapper = bVar;
        dh2.b.d dVar2 = dh2.b.d.f42577a;
        this.initialState = dVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar2, new er.l() { // from class: dh2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f42610a, aVar2, gVar, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(dVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(u uVar, k10.z zVar) {
        zVar.C(uVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(u uVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(dh2.a.OnActiveChange.class), oVar, eVar);
        zVar.v(q0.c(dh2.a.OnQueryChange.class), oVar, uVar.new f(null));
        zVar.v(q0.c(dh2.a.c.class), oVar, new g(null));
        zVar.x(q0.c(dh2.a.OnClickOrder.class), oVar, uVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dh2.c.a t9(dh2.b state) {
        eh2.b bVar = this.mapper;
        er.a<i0> aVarB9 = b9(dh2.a.InterfaceC0930a.C0931a.f42561a);
        return bVar.b(new eh2.b.Params(state, new er.l() { // from class: dh2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.u9(this.f42613a, (String) obj);
            }
        }, b9(dh2.a.c.f42566a), new er.l() { // from class: dh2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.v9(this.f42614a, ((Boolean) obj).booleanValue());
            }
        }, aVarB9, new er.p() { // from class: dh2.q
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return u.w9(this.f42615a, (String) obj, (tq0.k) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(u uVar, String str) {
        uVar.d9(new dh2.a.OnQueryChange(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(u uVar, boolean z15) {
        uVar.d9(new dh2.a.OnActiveChange(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(u uVar, String str, tq0.k kVar) {
        uVar.d9(new dh2.a.OnClickOrder(str, kVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final u uVar, final ac4.a aVar, final vq0.g gVar, k10.v vVar) {
        vVar.c(q0.c(dh2.b.class), new er.l() { // from class: dh2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.z9(this.f42616a, aVar, gVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dh2.b.d.class), new er.l() { // from class: dh2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.A9(this.f42619a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dh2.b.Content.class), new er.l() { // from class: dh2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.B9(this.f42620a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(u uVar, ac4.a aVar, vq0.g gVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dh2.a.InterfaceC0930a.class), oVar, bVar);
        zVar.v(q0.c(dh2.a.f.class), oVar, new c(aVar, gVar, uVar, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<dh2.a.InterfaceC0930a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<dh2.b, dh2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dh2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(dh2.a.InterfaceC0930a interfaceC0930a, tq.e<? super i0> eVar) {
        return super.F(interfaceC0930a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
