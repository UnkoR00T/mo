package ff1;

import f00.j0;
import fr.q0;
import gf1.StatementContractData;
import hb1.Statement;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lff1/u;", "Ll00/g;", "Lff1/h;", "", "Lff1/i;", "Lyy/a;", "stateMachineFactory", "Lhf1/b;", "mapper", "Lgf1/a;", "contract", "<init>", "(Lyy/a;Lhf1/b;Lgf1/a;)V", "state", "Lff1/i$a;", "m9", "(Lff1/h;)Lff1/i$a;", "b", "Lhf1/b;", "c", "Lgf1/a;", "Lff1/h$b;", "d", "Lff1/h$b;", "initialState", "Lxw/b;", "Lff1/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<ff1.h, Object> implements i, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hf1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gf1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ff1.h.Initialized initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ff1.d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ff1.h, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<i.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lff1/u$a;", "Lf00/j0;", "Lgf1/a;", "Lff1/u;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<gf1.a, u> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f62220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f62221b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f62222a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f62223b;

            /* JADX INFO: renamed from: ff1.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1408a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f62224d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f62225e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f62226f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f62228h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f62229j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f62230k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f62231l;

                public C1408a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f62224d = obj;
                    this.f62225e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f62222a = hVar;
                this.f62223b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1408a c1408a;
                if (eVar instanceof C1408a) {
                    c1408a = (C1408a) eVar;
                    int i15 = c1408a.f62225e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1408a.f62225e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1408a = new C1408a(eVar);
                    }
                } else {
                    c1408a = new C1408a(eVar);
                }
                Object obj2 = c1408a.f62224d;
                Object objE = uq.b.e();
                int i16 = c1408a.f62225e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f62222a;
                    i.a aVarM9 = this.f62223b.m9((ff1.h) obj);
                    c1408a.f62226f = vq.j.a(obj);
                    c1408a.f62228h = vq.j.a(c1408a);
                    c1408a.f62229j = vq.j.a(obj);
                    c1408a.f62230k = vq.j.a(hVar);
                    c1408a.f62231l = 0;
                    c1408a.f62225e = 1;
                    if (hVar.F(aVarM9, c1408a) == objE) {
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

        public b(mu.g gVar, u uVar) {
            this.f62220a = gVar;
            this.f62221b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.a> hVar, tq.e eVar) {
            Object objA = this.f62220a.a(new a(hVar, this.f62221b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lff1/a;", "<unused var>", "Lff1/h$b;", "Loq/i0;", "<anonymous>", "(Lff1/a;Lff1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ff1.a, ff1.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62232e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f62232e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ff1.d> bVarY1 = u.this.Y1();
                ff1.d.a aVar = ff1.d.a.f62177a;
                this.f62232e = 1;
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
        public final Object w(ff1.a aVar, ff1.h.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lff1/c;", "<unused var>", "Lff1/h$b;", "Loq/i0;", "<anonymous>", "(Lff1/c;Lff1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ff1.c, ff1.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62234e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f62234e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ff1.d> bVarY1 = u.this.Y1();
                ff1.d.b bVar = ff1.d.b.f62178a;
                this.f62234e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ff1.c cVar, ff1.h.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lff1/f;", "<unused var>", "Lk10/c0;", "Lff1/h$b;", "state", "Lk10/l;", "Lff1/h;", "<anonymous>", "(Lff1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ff1.f, c0<ff1.h.Initialized>, tq.e<? super k10.l<? extends ff1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62237f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ff1.h.InfoPage O(c0 c0Var, ff1.h.Initialized initialized) {
            return new ff1.h.InfoPage(((ff1.h.Initialized) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f62237f;
            uq.b.e();
            if (this.f62236e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ff1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(c0Var, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ff1.f fVar, c0<ff1.h.Initialized> c0Var, tq.e<? super k10.l<? extends ff1.h>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f62237f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lff1/b;", "action", "Lk10/c0;", "Lff1/h$b;", "state", "Lk10/l;", "Lff1/h;", "<anonymous>", "(Lff1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<CheckboxClicked, c0<ff1.h.Initialized>, tq.e<? super k10.l<? extends ff1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f62240g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ff1.h.Initialized O(CheckboxClicked checkboxClicked, ff1.h.Initialized initialized) {
            boolean checkboxValue = checkboxClicked.getCheckboxValue();
            hz.b validationState = hz.b.d.f86848c;
            if (!(initialized.getFormData().getValidationState() instanceof hz.b.Invalid) || !checkboxClicked.getCheckboxValue()) {
                validationState = null;
            }
            if (validationState == null) {
                validationState = initialized.getFormData().getValidationState();
            }
            return initialized.a(new FormData(checkboxValue, validationState));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CheckboxClicked checkboxClicked = (CheckboxClicked) this.f62239f;
            c0 c0Var = (c0) this.f62240g;
            uq.b.e();
            if (this.f62238e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ff1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(checkboxClicked, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CheckboxClicked checkboxClicked, c0<ff1.h.Initialized> c0Var, tq.e<? super k10.l<? extends ff1.h>> eVar) {
            f fVar = new f(eVar);
            fVar.f62239f = checkboxClicked;
            fVar.f62240g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lff1/e;", "<unused var>", "Lk10/c0;", "Lff1/h$b;", "state", "Lk10/l;", "Lff1/h;", "<anonymous>", "(Lff1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ff1.e, c0<ff1.h.Initialized>, tq.e<? super k10.l<? extends ff1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62242f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ff1.h.Initialized O(c0 c0Var, ff1.h.Initialized initialized) {
            return initialized.a(FormData.b(((ff1.h.Initialized) c0Var.a()).getFormData(), false, new hz.b.Invalid(null, 1, null), 1, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f62242f;
            Object objE = uq.b.e();
            int i15 = this.f62241e;
            if (i15 == 0) {
                oq.u.b(obj);
                boolean statementAccepted = ((ff1.h.Initialized) c0Var.a()).getFormData().getStatementAccepted();
                if (!statementAccepted) {
                    if (statementAccepted) {
                        throw new oq.p();
                    }
                    return c0Var.b(new er.l() { // from class: ff1.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.g.O(c0Var, (h.Initialized) obj2);
                        }
                    });
                }
                u.this.contract.l2(new StatementContractData(new Statement(true)));
                xw.b<ff1.d> bVarY1 = u.this.Y1();
                ff1.d.c cVar = ff1.d.c.f62179a;
                this.f62242f = c0Var;
                this.f62241e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(ff1.e eVar, c0<ff1.h.Initialized> c0Var, tq.e<? super k10.l<? extends ff1.h>> eVar2) {
            g gVar = u.this.new g(eVar2);
            gVar.f62242f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lff1/a;", "<unused var>", "Lk10/c0;", "Lff1/h$a;", "state", "Lk10/l;", "Lff1/h;", "<anonymous>", "(Lff1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ff1.a, c0<ff1.h.InfoPage>, tq.e<? super k10.l<? extends ff1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f62245f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ff1.h.Initialized O(c0 c0Var, ff1.h.InfoPage infoPage) {
            return new ff1.h.Initialized(((ff1.h.InfoPage) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f62245f;
            uq.b.e();
            if (this.f62244e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ff1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(c0Var, (h.InfoPage) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ff1.a aVar, c0<ff1.h.InfoPage> c0Var, tq.e<? super k10.l<? extends ff1.h>> eVar) {
            h hVar = new h(eVar);
            hVar.f62245f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, hf1.b bVar, gf1.a aVar2) {
        Statement statement;
        this.mapper = bVar;
        this.contract = aVar2;
        StatementContractData statementContractDataI5 = aVar2.i5();
        ff1.h.Initialized initialized = new ff1.h.Initialized(new FormData((statementContractDataI5 == null || (statement = statementContractDataI5.getStatement()) == null) ? false : statement.getStatementAccepted(), null, 2, null));
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: ff1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.p9(this.f62213a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.a m9(ff1.h state) {
        return this.mapper.b(new hf1.b.Params(state, b9(ff1.f.f62181a), new er.l() { // from class: ff1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.n9(this.f62212a, ((Boolean) obj).booleanValue());
            }
        }, b9(ff1.e.f62180a), b9(ff1.a.f62172a), b9(ff1.c.f62176a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(u uVar, boolean z15) {
        uVar.d9(new CheckboxClicked(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(ff1.h.Initialized.class), new er.l() { // from class: ff1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.q9(this.f62211a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ff1.h.InfoPage.class), new er.l() { // from class: ff1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.r9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ff1.a.class), oVar, cVar);
        zVar.x(q0.c(ff1.c.class), oVar, uVar.new d(null));
        zVar.v(q0.c(ff1.f.class), oVar, new e(null));
        zVar.v(q0.c(CheckboxClicked.class), oVar, new f(null));
        zVar.v(q0.c(ff1.e.class), oVar, uVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(ff1.a.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ff1.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ff1.h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
