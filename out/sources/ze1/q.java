package ze1;

import af1.PkdCodeMainSelectionContractData;
import f00.j0;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import ld1.CompanyPkdCode;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xe1.PkdCodeContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u00010B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lze1/q;", "Ll00/g;", "Lze1/i;", "", "Lze1/j;", "Lyy/a;", "stateMachineFactory", "Lbf1/b;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Laf1/a;", "contract", "<init>", "(Lyy/a;Lbf1/b;Lib4/c;Laf1/a;)V", "state", "Lze1/j$a;", "r9", "(Lze1/i;)Lze1/j$a;", "Ldx/b;", "domainError", "Ljb4/b;", "p9", "(Ldx/b;)Ljb4/b;", "b", "Lbf1/b;", "c", "Lib4/c;", "d", "Laf1/a;", "Lxw/b;", "Lze1/f;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<i, Object> implements j, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bf1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final af1.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ze1.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<i, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<j.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lze1/q$a;", "Lf00/j0;", "Laf1/a;", "Lze1/q;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<af1.a, q> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f234706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f234707b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f234708a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f234709b;

            /* JADX INFO: renamed from: ze1.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6322a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f234710d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f234711e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f234712f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f234714h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f234715j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f234716k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f234717l;

                public C6322a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f234710d = obj;
                    this.f234711e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f234708a = hVar;
                this.f234709b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6322a c6322a;
                if (eVar instanceof C6322a) {
                    c6322a = (C6322a) eVar;
                    int i15 = c6322a.f234711e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6322a.f234711e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6322a = new C6322a(eVar);
                    }
                } else {
                    c6322a = new C6322a(eVar);
                }
                Object obj2 = c6322a.f234710d;
                Object objE = uq.b.e();
                int i16 = c6322a.f234711e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f234708a;
                    j.a aVarR9 = this.f234709b.r9((i) obj);
                    c6322a.f234712f = vq.j.a(obj);
                    c6322a.f234714h = vq.j.a(c6322a);
                    c6322a.f234715j = vq.j.a(obj);
                    c6322a.f234716k = vq.j.a(hVar);
                    c6322a.f234717l = 0;
                    c6322a.f234711e = 1;
                    if (hVar.F(aVarR9, c6322a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f234706a = gVar;
            this.f234707b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.a> hVar, tq.e eVar) {
            Object objA = this.f234706a.a(new a(hVar, this.f234707b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lze1/e;", "<unused var>", "Lze1/i;", "Loq/i0;", "<anonymous>", "(Lze1/e;Lze1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ze1.e, i, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234718e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234718e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ze1.f> bVarY1 = q.this.Y1();
                ze1.f.a aVar = ze1.f.a.f234679a;
                this.f234718e = 1;
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
        public final Object w(ze1.e eVar, i iVar, tq.e<? super i0> eVar2) {
            return q.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lze1/i$a;", "state", "Lk10/l;", "Lze1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<i.a>, tq.e<? super k10.l<? extends i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f234720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f234721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f234722g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f234723h;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.Initialized O(List list, q qVar, i.a aVar) {
            PkdCodeMainSelectionContractData pkdCodeMainSelectionContractDataK4 = qVar.contract.k4();
            CompanyPkdCode selectedPkdCode = pkdCodeMainSelectionContractDataK4 != null ? pkdCodeMainSelectionContractDataK4.getSelectedPkdCode() : null;
            return new i.Initialized(list, pq.v.c0(list, selectedPkdCode) ? selectedPkdCode : null, null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f234723h;
            Object objE = uq.b.e();
            int i15 = this.f234722g;
            if (i15 == 0) {
                oq.u.b(obj);
                PkdCodeContractData pkdCodeContractDataJ0 = q.this.contract.j0();
                final List<CompanyPkdCode> listA = pkdCodeContractDataJ0 != null ? pkdCodeContractDataJ0.a() : null;
                final q qVar = q.this;
                List<CompanyPkdCode> list = listA;
                if (list != null && !list.isEmpty()) {
                    return c0Var.d(new er.l() { // from class: ze1.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.d.O(listA, qVar, (i.a) obj2);
                        }
                    });
                }
                xw.b<ze1.f> bVarY1 = qVar.Y1();
                ze1.f.Error error = new ze1.f.Error(qVar.p9(new dx.b.Generic(new NullPointerException("User pkd codes cannot be empty or null"))));
                this.f234723h = c0Var;
                this.f234720e = vq.j.a(listA);
                this.f234721f = 0;
                this.f234722g = 1;
                if (bVarY1.F(error, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<i.a> c0Var, tq.e<? super k10.l<? extends i>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f234723h = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lze1/h;", "action", "Lk10/c0;", "Lze1/i$b;", "state", "Lk10/l;", "Lze1/i;", "<anonymous>", "(Lze1/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SelectPkdCode, c0<i.Initialized>, tq.e<? super k10.l<? extends i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f234727g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.Initialized O(SelectPkdCode selectPkdCode, i.Initialized initialized) {
            return i.Initialized.b(initialized, null, selectPkdCode.getPkdCode(), hz.b.d.f86848c, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectPkdCode selectPkdCode = (SelectPkdCode) this.f234726f;
            c0 c0Var = (c0) this.f234727g;
            uq.b.e();
            if (this.f234725e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ze1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(selectPkdCode, (i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectPkdCode selectPkdCode, c0<i.Initialized> c0Var, tq.e<? super k10.l<? extends i>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f234726f = selectPkdCode;
            eVar2.f234727g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lze1/g;", "<unused var>", "Lk10/c0;", "Lze1/i$b;", "state", "Lk10/l;", "Lze1/i;", "<anonymous>", "(Lze1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<g, c0<i.Initialized>, tq.e<? super k10.l<? extends i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f234728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f234729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f234730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f234731h;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.Initialized O(i.Initialized initialized) {
            return i.Initialized.b(initialized, null, null, new hz.b.Invalid(null, 1, null), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f234731h;
            Object objE = uq.b.e();
            int i15 = this.f234730g;
            if (i15 == 0) {
                oq.u.b(obj);
                CompanyPkdCode selectedPkdCode = ((i.Initialized) c0Var.a()).getSelectedPkdCode();
                if (selectedPkdCode != null) {
                    q qVar = q.this;
                    qVar.contract.f0(new PkdCodeMainSelectionContractData(selectedPkdCode));
                    xw.b<ze1.f> bVarY1 = qVar.Y1();
                    ze1.f.c cVar = ze1.f.c.f234681a;
                    this.f234731h = c0Var;
                    this.f234728e = vq.j.a(selectedPkdCode);
                    this.f234729f = 0;
                    this.f234730g = 1;
                    if (bVarY1.F(cVar, this) == objE) {
                        return objE;
                    }
                }
                return c0Var.b(new er.l() { // from class: ze1.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.f.O((i.Initialized) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarC = c0Var.c();
            if (lVarC != null) {
                return lVarC;
            }
            return c0Var.b(new er.l() { // from class: ze1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O((i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g gVar, c0<i.Initialized> c0Var, tq.e<? super k10.l<? extends i>> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f234731h = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, bf1.b bVar, ib4.c cVar, af1.a aVar2) {
        this.mapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.contract = aVar2;
        i.a aVar3 = i.a.f234684a;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: ze1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f234699a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b p9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ze1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f234698a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(q qVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            throw new oq.p();
        }
        qVar.d9(ze1.e.f234678a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.a r9(i state) {
        return this.mapper.b(new bf1.b.Params(state, new er.l() { // from class: ze1.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f234694a, (CompanyPkdCode) obj);
            }
        }, b9(g.f234682a), b9(ze1.e.f234678a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, CompanyPkdCode companyPkdCode) {
        qVar.d9(new SelectPkdCode(companyPkdCode));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(i.class), new er.l() { // from class: ze1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f234695a, (z) obj);
            }
        });
        vVar.c(q0.c(i.a.class), new er.l() { // from class: ze1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f234696a, (z) obj);
            }
        });
        vVar.c(q0.c(i.Initialized.class), new er.l() { // from class: ze1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f234697a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        zVar.x(q0.c(ze1.e.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, z zVar) {
        zVar.A(qVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(SelectPkdCode.class), oVar, eVar);
        zVar.v(q0.c(g.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ze1.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<i, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(j.a aVar) {
        super.P5(aVar);
    }
}
