package ub1;

import f00.j0;
import fr.q0;
import java.util.Map;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import wb1.AccountingDocumentSelectionContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001.B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lub1/t;", "Ll00/g;", "Lub1/m;", "", "Lub1/n;", "Lyy/a;", "stateMachineFactory", "Lxb1/c;", "mapper", "Lnb1/a;", "validateAccountingDocumentUC", "Lwb1/a;", "contract", "<init>", "(Lyy/a;Lxb1/c;Lnb1/a;Lwb1/a;)V", "state", "Lub1/n$a;", "o9", "(Lub1/m;)Lub1/n$a;", "b", "Lxb1/c;", "c", "Lnb1/a;", "d", "Lwb1/a;", "e", "Lub1/m;", "initialState", "Lxw/b;", "Lub1/e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<Initialized, Object> implements n, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xb1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nb1.a validateAccountingDocumentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wb1.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Initialized initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ub1.e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<Initialized, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<n.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lub1/t$a;", "Lf00/j0;", "Lwb1/a;", "Lub1/t;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<wb1.a, t> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f197265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f197266b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f197267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f197268b;

            /* JADX INFO: renamed from: ub1.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5130a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f197269d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f197270e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f197271f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f197273h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f197274j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f197275k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f197276l;

                public C5130a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f197269d = obj;
                    this.f197270e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f197267a = hVar;
                this.f197268b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5130a c5130a;
                if (eVar instanceof C5130a) {
                    c5130a = (C5130a) eVar;
                    int i15 = c5130a.f197270e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5130a.f197270e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5130a = new C5130a(eVar);
                    }
                } else {
                    c5130a = new C5130a(eVar);
                }
                Object obj2 = c5130a.f197269d;
                Object objE = uq.b.e();
                int i16 = c5130a.f197270e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f197267a;
                    n.Data dataO9 = this.f197268b.o9((Initialized) obj);
                    c5130a.f197271f = vq.j.a(obj);
                    c5130a.f197273h = vq.j.a(c5130a);
                    c5130a.f197274j = vq.j.a(obj);
                    c5130a.f197275k = vq.j.a(hVar);
                    c5130a.f197276l = 0;
                    c5130a.f197270e = 1;
                    if (hVar.F(dataO9, c5130a) == objE) {
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

        public b(mu.g gVar, t tVar) {
            this.f197265a = gVar;
            this.f197266b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n.Data> hVar, tq.e eVar) {
            Object objA = this.f197265a.a(new a(hVar, this.f197266b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lub1/d;", "<unused var>", "Lub1/m;", "Loq/i0;", "<anonymous>", "(Lub1/d;Lub1/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ub1.d, Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197277e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f197277e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ub1.e> bVarY1 = t.this.Y1();
                ub1.e.a aVar = ub1.e.a.f197229a;
                this.f197277e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(ub1.d dVar, Initialized initialized, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lub1/g;", "action", "Lk10/c0;", "Lub1/m;", "state", "Lk10/l;", "<anonymous>", "(Lub1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnAccountingOfficeChanged, k10.c0<Initialized>, tq.e<? super k10.l<? extends Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197281g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Initialized O(OnAccountingOfficeChanged onAccountingOfficeChanged, Initialized initialized) {
            return Initialized.b(initialized, null, new Field(null, onAccountingOfficeChanged.getAccountingOffice(), 1, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnAccountingOfficeChanged onAccountingOfficeChanged = (OnAccountingOfficeChanged) this.f197280f;
            k10.c0 c0Var = (k10.c0) this.f197281g;
            uq.b.e();
            if (this.f197279e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ub1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(onAccountingOfficeChanged, (Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnAccountingOfficeChanged onAccountingOfficeChanged, k10.c0<Initialized> c0Var, tq.e<? super k10.l<Initialized>> eVar) {
            d dVar = new d(eVar);
            dVar.f197280f = onAccountingOfficeChanged;
            dVar.f197281g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lub1/h;", "action", "Lk10/c0;", "Lub1/m;", "state", "Lk10/l;", "<anonymous>", "(Lub1/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnNipNumberChanged, k10.c0<Initialized>, tq.e<? super k10.l<? extends Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197284g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Initialized O(OnNipNumberChanged onNipNumberChanged, Initialized initialized) {
            return Initialized.b(initialized, null, null, new Field(null, onNipNumberChanged.getNipNumber(), 1, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnNipNumberChanged onNipNumberChanged = (OnNipNumberChanged) this.f197283f;
            k10.c0 c0Var = (k10.c0) this.f197284g;
            uq.b.e();
            if (this.f197282e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ub1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(onNipNumberChanged, (Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnNipNumberChanged onNipNumberChanged, k10.c0<Initialized> c0Var, tq.e<? super k10.l<Initialized>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f197283f = onNipNumberChanged;
            eVar2.f197284g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lub1/j;", "action", "Lk10/c0;", "Lub1/m;", "state", "Lk10/l;", "<anonymous>", "(Lub1/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SelectAccountingDocument, k10.c0<Initialized>, tq.e<? super k10.l<? extends Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197287g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Initialized O(SelectAccountingDocument selectAccountingDocument, Initialized initialized) {
            return Initialized.b(initialized, selectAccountingDocument.getSelectedItem(), null, null, hz.b.d.f86848c, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectAccountingDocument selectAccountingDocument = (SelectAccountingDocument) this.f197286f;
            k10.c0 c0Var = (k10.c0) this.f197287g;
            uq.b.e();
            if (this.f197285e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ub1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(selectAccountingDocument, (Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectAccountingDocument selectAccountingDocument, k10.c0<Initialized> c0Var, tq.e<? super k10.l<Initialized>> eVar) {
            f fVar = new f(eVar);
            fVar.f197286f = selectAccountingDocument;
            fVar.f197287g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lub1/i;", "<unused var>", "Lk10/c0;", "Lub1/m;", "state", "Lk10/l;", "<anonymous>", "(Lub1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i, k10.c0<Initialized>, tq.e<? super k10.l<? extends Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197289f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Initialized O(Initialized initialized) {
            return Initialized.b(initialized, null, null, null, hz.b.d.f86848c, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f197289f;
            uq.b.e();
            if (this.f197288e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.contract.T1(new AccountingDocumentSelectionContractData(new ib1.b.AccountingOffice(((Initialized) c0Var.a()).d().getValue(), ((Initialized) c0Var.a()).c().getValue())));
            return c0Var.b(new er.l() { // from class: ub1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O((Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i iVar, k10.c0<Initialized> c0Var, tq.e<? super k10.l<Initialized>> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f197289f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lub1/f;", "<unused var>", "Lk10/c0;", "Lub1/m;", "state", "Lk10/l;", "<anonymous>", "(Lub1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ub1.f, k10.c0<Initialized>, tq.e<? super k10.l<? extends Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f197291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f197293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f197294h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f197296a;

            static {
                int[] iArr = new int[ib1.a.values().length];
                try {
                    iArr[ib1.a.ACCOUNTING_OFFICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ib1.a.SELF_ACCOUNTING_OFFICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ib1.a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f197296a = iArr;
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Initialized V(Map map, Initialized initialized) {
            Field<String> fieldC = initialized.c();
            Object objJ = v0.j(map, k.ACCOUNTING_OFFICE);
            hz.b.Companion companion = hz.b.INSTANCE;
            return Initialized.b(initialized, null, Field.b(fieldC, companion.a((hz.g) objJ), null, 2, null), Field.b(initialized.d(), companion.a((hz.g) v0.j(map, k.NIP_NUMBER)), null, 2, null), null, 9, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Initialized X(Initialized initialized) {
            return Initialized.b(initialized, null, null, null, new hz.b.Invalid(null, 1, null), 7, null);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:44:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:32:0x00c9->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        
            if (r10.F(r2, r9) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
        
            if (r2.F(r3, r9) == r1) goto L40;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ub1.t.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ub1.f fVar, k10.c0<Initialized> c0Var, tq.e<? super k10.l<Initialized>> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f197294h = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, xb1.c cVar, nb1.a aVar2, wb1.a aVar3) {
        ib1.b accountingDocumentPlace;
        ib1.a type;
        this.mapper = cVar;
        this.validateAccountingDocumentUC = aVar2;
        this.contract = aVar3;
        AccountingDocumentSelectionContractData accountingDocumentSelectionContractDataM4 = aVar3.m4();
        Initialized initialized = new Initialized((accountingDocumentSelectionContractDataM4 == null || (accountingDocumentPlace = accountingDocumentSelectionContractDataM4.getAccountingDocumentPlace()) == null || (type = accountingDocumentPlace.getType()) == null) ? ib1.a.NONE : type, null, null, null, 14, null);
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: ub1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f197257a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), o9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.Data o9(Initialized state) {
        return this.mapper.b(new xb1.c.Params(state, new er.l() { // from class: ub1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.p9(this.f197254a, (ib1.a) obj);
            }
        }, new er.l() { // from class: ub1.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.q9(this.f197255a, (String) obj);
            }
        }, new er.l() { // from class: ub1.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.r9(this.f197256a, (String) obj);
            }
        }, b9(ub1.f.f197231a), b9(ub1.d.f197228a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(t tVar, ib1.a aVar) {
        tVar.d9(new SelectAccountingDocument(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(t tVar, String str) {
        tVar.d9(new OnNipNumberChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(t tVar, String str) {
        tVar.d9(new OnAccountingOfficeChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(Initialized.class), new er.l() { // from class: ub1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.u9(this.f197253a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(t tVar, k10.z zVar) {
        c cVar = tVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ub1.d.class), oVar, cVar);
        zVar.v(q0.c(OnAccountingOfficeChanged.class), oVar, new d(null));
        zVar.v(q0.c(OnNipNumberChanged.class), oVar, new e(null));
        zVar.v(q0.c(SelectAccountingDocument.class), oVar, new f(null));
        zVar.v(q0.c(i.class), oVar, tVar.new g(null));
        zVar.v(q0.c(ub1.f.class), oVar, tVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ub1.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<Initialized, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(n.Data data) {
        super.P5(data);
    }
}
