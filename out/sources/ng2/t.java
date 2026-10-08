package ng2;

import fr.q0;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq0.BELandRegisterDocumentCumulatedSubtypeFee;
import tq0.LandRegisterDocument;
import tq0.LandRegisterSubDocument;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lng2/t;", "Ll00/g;", "Lng2/e;", "", "Lng2/f;", "Lyy/a;", "stateMachineFactory", "Log2/b;", "mapper", "Lac4/a;", "loaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lng2/g;", "setupContract", "<init>", "(Lyy/a;Log2/b;Lac4/a;Lhb4/d;Lib4/c;Lng2/g;)V", "state", "Lng2/f$a;", "u9", "(Lng2/e;)Lng2/f$a;", "Ldx/b;", "error", "Lhb4/c;", "s9", "(Ldx/b;)Lhb4/c;", "b", "Log2/b;", "c", "Lac4/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lng2/g;", "Lng2/e$b;", "g", "Lng2/e$b;", "initialState", "Lxw/b;", "Lng2/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<ng2.e, Object> implements ng2.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final og2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g setupContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ng2.e.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ng2.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ng2.e, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<ng2.f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ng2.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f136203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f136204b;

        /* JADX INFO: renamed from: ng2.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3358a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f136205a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f136206b;

            /* JADX INFO: renamed from: ng2.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3359a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f136207d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f136208e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f136209f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f136211h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f136212j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f136213k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f136214l;

                public C3359a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f136207d = obj;
                    this.f136208e |= PKIFailureInfo.systemUnavail;
                    return C3358a.this.F(null, this);
                }
            }

            public C3358a(mu.h hVar, t tVar) {
                this.f136205a = hVar;
                this.f136206b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3359a c3359a;
                if (eVar instanceof C3359a) {
                    c3359a = (C3359a) eVar;
                    int i15 = c3359a.f136208e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3359a.f136208e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3359a = new C3359a(eVar);
                    }
                } else {
                    c3359a = new C3359a(eVar);
                }
                Object obj2 = c3359a.f136207d;
                Object objE = uq.b.e();
                int i16 = c3359a.f136208e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f136205a;
                    ng2.f.a aVarU9 = this.f136206b.u9((ng2.e) obj);
                    c3359a.f136209f = vq.j.a(obj);
                    c3359a.f136211h = vq.j.a(c3359a);
                    c3359a.f136212j = vq.j.a(obj);
                    c3359a.f136213k = vq.j.a(hVar);
                    c3359a.f136214l = 0;
                    c3359a.f136208e = 1;
                    if (hVar.F(aVarU9, c3359a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f136203a = gVar;
            this.f136204b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ng2.f.a> hVar, tq.e eVar) {
            Object objA = this.f136203a.a(new C3358a(hVar, this.f136204b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lng2/b;", "action", "Lng2/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lng2/b;Lng2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ng2.b, ng2.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136216f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ng2.b bVar = (ng2.b) this.f136216f;
            Object objE = uq.b.e();
            int i15 = this.f136215e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                this.f136216f = vq.j.a(bVar);
                this.f136215e = 1;
                if (tVar.F(bVar, this) == objE) {
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
        public final Object w(ng2.b bVar, ng2.e eVar, tq.e<? super i0> eVar2) {
            b bVar2 = t.this.new b(eVar2);
            bVar2.f136216f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lng2/e$b;", "state", "Lk10/l;", "Lng2/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<ng2.e.b>, tq.e<? super k10.l<? extends ng2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136219f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lng2/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ng2.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f136221e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f136222f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f136223g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f136224h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f136225j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f136226k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f136227l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f136228m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f136229n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f136230p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f136231q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f136232r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ t f136233s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ c0<ng2.e.b> f136234t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, c0<ng2.e.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f136233s = tVar;
                this.f136234t = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ng2.e.Initialized X(LandRegisterDocument landRegisterDocument, Set set, BigDecimal bigDecimal, ng2.e.b bVar) {
                return new ng2.e.Initialized(landRegisterDocument.c(), landRegisterDocument.d(), set, false, bigDecimal);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ng2.e.LoadingError Y(t tVar, dx.b bVar, ng2.e.b bVar2) {
                return new ng2.e.LoadingError(tVar.s9(bVar));
            }

            /* JADX WARN: Not initialized variable reg: 3, insn: 0x0111: INVOKE (r2 I:java.util.List) = (r3 I:java.lang.Object) STATIC call: px.c.a(java.lang.Object):java.util.List A[MD:(java.lang.Object):java.util.List<px.a$a> (m)], block:B:47:0x0111 */
            /* JADX WARN: Type inference failed for: r3v0, types: [dx.j, java.lang.Object] */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i left;
                ?? A;
                Object objB;
                t tVar;
                c0<ng2.e.b> c0Var;
                ex.b bVar;
                ex.b bVar2;
                Object next;
                Object objE = uq.b.e();
                int i15 = this.f136232r;
                try {
                    try {
                        if (i15 == 0) {
                            oq.u.b(obj);
                            tVar = this.f136233s;
                            c0Var = this.f136234t;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            ex.a aVar = new ex.a();
                            g gVar = tVar.setupContract;
                            this.f136221e = tVar;
                            this.f136222f = c0Var;
                            this.f136223g = jVarA;
                            this.f136224h = vq.j.a(aVar);
                            this.f136225j = aVar;
                            this.f136226k = aVar;
                            this.f136227l = 0;
                            this.f136228m = 0;
                            this.f136229n = 0;
                            this.f136230p = 0;
                            this.f136231q = 0;
                            this.f136232r = 1;
                            Object objO0 = gVar.o0(this);
                            if (objO0 == objE) {
                                return objE;
                            }
                            bVar = aVar;
                            obj = objO0;
                            bVar2 = bVar;
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) this.f136226k;
                            bVar2 = (ex.b) this.f136225j;
                            c0Var = (c0) this.f136222f;
                            tVar = (t) this.f136221e;
                            try {
                                oq.u.b(obj);
                            } catch (CancellationException e15) {
                                throw e15;
                            }
                        }
                        final LandRegisterDocument landRegisterDocument = (LandRegisterDocument) bVar.a((dx.i) obj);
                        for (int size = landRegisterDocument.d().size(); 1 < size; size--) {
                            Iterator<T> it = landRegisterDocument.c().iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((BELandRegisterDocumentCumulatedSubtypeFee) next).getTotal() != size);
                            if (((BELandRegisterDocumentCumulatedSubtypeFee) next) == null) {
                                bVar2.b(new dx.b.Generic(new Exception("Cumulated subtypes is missing an entry")));
                                throw new oq.g();
                            }
                        }
                        final Set<LandRegisterSubDocument> setD0 = tVar.setupContract.D0();
                        final BigDecimal bigDecimalB = landRegisterDocument.b(setD0.size());
                        if (bigDecimalB == null) {
                            bVar2.b(new dx.b.Generic(new Exception("Calculated amount is null")));
                            throw new oq.g();
                        }
                        left = new dx.i.Right(c0Var.d(new er.l() { // from class: ng2.u
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.c.a.X(landRegisterDocument, setD0, bigDecimalB, (e.b) obj2);
                            }
                        }));
                        c0<ng2.e.b> c0Var2 = this.f136234t;
                        final t tVar2 = this.f136233s;
                        if (left instanceof dx.i.Left) {
                            final dx.b bVar3 = (dx.b) ((dx.i.Left) left).b();
                            return c0Var2.d(new er.l() { // from class: ng2.v
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return t.c.a.Y(tVar2, bVar3, (e.b) obj2);
                                }
                            });
                        }
                        if (left instanceof dx.i.Right) {
                            return (k10.l) ((dx.i.Right) left).b();
                        }
                        throw new oq.p();
                    } catch (Exception e16) {
                        px.f fVar = px.f.f163100a;
                        String message = e16.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e16, px.c.a(A));
                        dx.i iVarA = A.a(e16);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        left = new dx.i.Left(objB);
                    }
                } catch (ex.c e17) {
                    left = new dx.i.Left((dx.b) ex.d.a(e17));
                } catch (CancellationException e18) {
                    throw e18;
                }
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f136233s, this.f136234t, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ng2.e>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f136219f;
            Object objE = uq.b.e();
            int i15 = this.f136218e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.loaderUseCase;
            a aVar2 = new a(t.this, c0Var, null);
            this.f136219f = vq.j.a(c0Var);
            this.f136218e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ng2.e.b> c0Var, tq.e<? super k10.l<? extends ng2.e>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f136219f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lng2/a;", "<unused var>", "Lk10/c0;", "Lng2/e$c;", "state", "Lk10/l;", "Lng2/e;", "<anonymous>", "(Lng2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ng2.a, c0<ng2.e.LoadingError>, tq.e<? super k10.l<? extends ng2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136236f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ng2.e.b O(ng2.e.LoadingError loadingError) {
            return ng2.e.b.f136171a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f136236f;
            uq.b.e();
            if (this.f136235e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ng2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O((e.LoadingError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ng2.a aVar, c0<ng2.e.LoadingError> c0Var, tq.e<? super k10.l<? extends ng2.e>> eVar) {
            d dVar = new d(eVar);
            dVar.f136236f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lng2/d;", "action", "Lk10/c0;", "Lng2/e$a;", "state", "Lk10/l;", "Lng2/e;", "<anonymous>", "(Lng2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnSelectedItem, c0<ng2.e.Initialized>, tq.e<? super k10.l<? extends ng2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f136239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f136240h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f136241j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f136242k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f136243l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f136244m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f136245n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f136246p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f136247q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f136248r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f136249s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f136250t;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ng2.e.Initialized O(Set set, BigDecimal bigDecimal, ng2.e.Initialized initialized) {
            return ng2.e.Initialized.b(initialized, null, null, set, false, bigDecimal, 3, null);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[Catch: Exception -> 0x0030, c -> 0x0034, CancellationException -> 0x0038, TryCatch #1 {Exception -> 0x0030, blocks: (B:6:0x002b, B:31:0x00c4, B:33:0x00d6, B:34:0x00ec, B:35:0x0100, B:36:0x0101, B:39:0x0110), top: B:62:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00ec A[Catch: Exception -> 0x0030, c -> 0x0034, CancellationException -> 0x0038, TryCatch #1 {Exception -> 0x0030, blocks: (B:6:0x002b, B:31:0x00c4, B:33:0x00d6, B:34:0x00ec, B:35:0x0100, B:36:0x0101, B:39:0x0110), top: B:62:0x000f }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            dx.i left;
            t tVar;
            ex.b aVar;
            ex.b bVar;
            final Set<LandRegisterSubDocument> set;
            final BigDecimal bigDecimalB;
            OnSelectedItem onSelectedItem = (OnSelectedItem) this.f136249s;
            c0 c0Var = (c0) this.f136250t;
            Object objE = uq.b.e();
            int i15 = this.f136248r;
            ?? r15 = 1;
            try {
                try {
                    if (i15 == 0) {
                        oq.u.b(obj);
                        tVar = t.this;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            Set<LandRegisterSubDocument> setJ1 = pq.v.j1(((ng2.e.Initialized) c0Var.a()).e());
                            if (((ng2.e.Initialized) c0Var.a()).e().contains(onSelectedItem.getDocument())) {
                                setJ1.remove(onSelectedItem.getDocument());
                            } else {
                                setJ1.add(onSelectedItem.getDocument());
                            }
                            g gVar = tVar.setupContract;
                            this.f136249s = vq.j.a(onSelectedItem);
                            this.f136250t = c0Var;
                            this.f136237e = tVar;
                            this.f136238f = jVarA;
                            this.f136239g = vq.j.a(aVar);
                            this.f136240h = aVar;
                            this.f136241j = setJ1;
                            this.f136242k = aVar;
                            this.f136243l = 0;
                            this.f136244m = 0;
                            this.f136245n = 0;
                            this.f136246p = 0;
                            this.f136247q = 0;
                            this.f136248r = 1;
                            Object objO0 = gVar.o0(this);
                            if (objO0 == objE) {
                                return objE;
                            }
                            obj = objO0;
                            bVar = aVar;
                            set = setJ1;
                            bigDecimalB = ((LandRegisterDocument) bVar.a((dx.i) obj)).b(set.size());
                            if (bigDecimalB != null) {
                                aVar.b(new dx.b.Generic(new Exception("Calculated amount is null")));
                                throw new oq.g();
                            }
                            tVar.setupContract.K2(set);
                            left = new dx.i.Right(c0Var.b(new er.l() { // from class: ng2.x
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return t.e.O(set, bigDecimalB, (e.Initialized) obj2);
                                }
                            }));
                        } catch (ex.c e15) {
                            e = e15;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            e = e16;
                            throw e;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            Exception exc = e;
                            px.f fVar = px.f.f163100a;
                            String message = exc.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, exc, px.c.a(r15));
                            dx.i iVarA = r15.a(exc);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) this.f136242k;
                        set = (Set) this.f136241j;
                        aVar = (ex.b) this.f136240h;
                        tVar = (t) this.f136237e;
                        try {
                            oq.u.b(obj);
                            bigDecimalB = ((LandRegisterDocument) bVar.a((dx.i) obj)).b(set.size());
                            if (bigDecimalB != null) {
                                aVar.b(new dx.b.Generic(new Exception("Calculated amount is null")));
                                throw new oq.g();
                            }
                            tVar.setupContract.K2(set);
                            left = new dx.i.Right(c0Var.b(new er.l() { // from class: ng2.x
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return t.e.O(set, bigDecimalB, (e.Initialized) obj2);
                                }
                            }));
                        } catch (ex.c e18) {
                            e = e18;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            e = e19;
                            throw e;
                        }
                    }
                } catch (Exception e25) {
                    e = e25;
                }
                if (left instanceof dx.i.Left) {
                    px.f.e(px.f.f163100a, ((dx.b) ((dx.i.Left) left).b()).toString(), null, null, 6, null);
                    return c0Var.c();
                }
                if (left instanceof dx.i.Right) {
                    return (k10.l) ((dx.i.Right) left).b();
                }
                throw new oq.p();
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnSelectedItem onSelectedItem, c0<ng2.e.Initialized> c0Var, tq.e<? super k10.l<? extends ng2.e>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f136249s = onSelectedItem;
            eVar2.f136250t = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lng2/c;", "<unused var>", "Lk10/c0;", "Lng2/e$a;", "state", "Lk10/l;", "Lng2/e;", "<anonymous>", "(Lng2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ng2.c, c0<ng2.e.Initialized>, tq.e<? super k10.l<? extends ng2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136253f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ng2.e.Initialized O(ng2.e.Initialized initialized) {
            return ng2.e.Initialized.b(initialized, null, null, null, true, null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f136253f;
            Object objE = uq.b.e();
            int i15 = this.f136252e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (((ng2.e.Initialized) c0Var.a()).e().isEmpty()) {
                    return c0Var.b(new er.l() { // from class: ng2.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.f.O((e.Initialized) obj2);
                        }
                    });
                }
                t tVar = t.this;
                ng2.b.C3356b c3356b = ng2.b.C3356b.f136162a;
                this.f136253f = c0Var;
                this.f136252e = 1;
                if (tVar.F(c3356b, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ng2.c cVar, c0<ng2.e.Initialized> c0Var, tq.e<? super k10.l<? extends ng2.e>> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f136253f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, og2.b bVar, ac4.a aVar2, hb4.d dVar, ib4.c cVar, g gVar) {
        this.mapper = bVar;
        this.loaderUseCase = aVar2;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        this.setupContract = gVar;
        ng2.e.b bVar2 = ng2.e.b.f136171a;
        this.initialState = bVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: ng2.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f136193a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), u9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(k10.z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(ng2.a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, k10.z zVar) {
        e eVar = tVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnSelectedItem.class), oVar, eVar);
        zVar.v(q0.c(ng2.c.class), oVar, tVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c s9(dx.b error) {
        return this.errorVMSFactory.a(this.errorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: ng2.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f136192a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(t tVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            tVar.d9(ng2.b.a.f136161a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            tVar.d9(ng2.a.f136159a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ng2.f.a u9(ng2.e state) {
        return this.mapper.b(new og2.b.Params(state, b9(ng2.b.a.f136161a), new er.l() { // from class: ng2.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.v9(this.f136191a, (LandRegisterSubDocument) obj);
            }
        }, b9(ng2.c.f136164a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(t tVar, LandRegisterSubDocument landRegisterSubDocument) {
        tVar.d9(new OnSelectedItem(landRegisterSubDocument));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(ng2.e.class), new er.l() { // from class: ng2.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9(this.f136188a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ng2.e.b.class), new er.l() { // from class: ng2.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f136189a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ng2.e.LoadingError.class), new er.l() { // from class: ng2.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9((k10.z) obj);
            }
        });
        vVar.c(q0.c(ng2.e.Initialized.class), new er.l() { // from class: ng2.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f136190a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        zVar.x(q0.c(ng2.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(t tVar, k10.z zVar) {
        zVar.A(tVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ng2.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ng2.e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ng2.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ng2.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(g gVar) {
        super.P5(gVar);
    }
}
