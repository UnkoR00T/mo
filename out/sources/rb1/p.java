package rb1;

import f00.j0;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import lc1.CorrespondenceAddressSelectionContractData;
import ld1.CompanyApplicationCitizenAddress;
import ld1.CompanyApplicationCitizenData;
import ld1.KnownUserDataModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sb1.AccountingDocumentAddressSelectionContractData;
import zb1.BusinessAddressSelectionContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lrb1/p;", "Ll00/g;", "Lrb1/j;", "", "Lrb1/k;", "Lyy/a;", "stateMachineFactory", "Ltb1/b;", "mapper", "Lsb1/a;", "contract", "<init>", "(Lyy/a;Ltb1/b;Lsb1/a;)V", "state", "Lrb1/k$a;", "n9", "(Lrb1/j;)Lrb1/k$a;", "b", "Ltb1/b;", "c", "Lsb1/a;", "Lrb1/j$a;", "d", "Lrb1/j$a;", "initialState", "Lxw/b;", "Lrb1/f;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<j, Object> implements k, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tb1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sb1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j.a initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rb1.f> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<j, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<k.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lrb1/p$a;", "Lf00/j0;", "Lsb1/a;", "Lrb1/p;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<sb1.a, p> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f172955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f172956b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f172957a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f172958b;

            /* JADX INFO: renamed from: rb1.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4411a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f172959d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f172960e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f172961f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f172963h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f172964j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f172965k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f172966l;

                public C4411a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f172959d = obj;
                    this.f172960e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f172957a = hVar;
                this.f172958b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4411a c4411a;
                if (eVar instanceof C4411a) {
                    c4411a = (C4411a) eVar;
                    int i15 = c4411a.f172960e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4411a.f172960e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4411a = new C4411a(eVar);
                    }
                } else {
                    c4411a = new C4411a(eVar);
                }
                Object obj2 = c4411a.f172959d;
                Object objE = uq.b.e();
                int i16 = c4411a.f172960e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f172957a;
                    k.a aVarN9 = this.f172958b.n9((j) obj);
                    c4411a.f172961f = vq.j.a(obj);
                    c4411a.f172963h = vq.j.a(c4411a);
                    c4411a.f172964j = vq.j.a(obj);
                    c4411a.f172965k = vq.j.a(hVar);
                    c4411a.f172966l = 0;
                    c4411a.f172960e = 1;
                    if (hVar.F(aVarN9, c4411a) == objE) {
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

        public b(mu.g gVar, p pVar) {
            this.f172955a = gVar;
            this.f172956b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k.a> hVar, tq.e eVar) {
            Object objA = this.f172955a.a(new a(hVar, this.f172956b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lrb1/j$a;", "it", "Lk10/l;", "Lrb1/j;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<j.a>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172968f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Initialized O(hb1.c cVar, List list, j.a aVar) {
            j.c cVar2;
            if (hb1.d.c(cVar)) {
                cVar2 = !pq.v.c0(list, cVar) ? j.c.EnterNewAddress : j.c.AddressSelected;
            } else {
                cVar2 = j.c.NoSelection;
            }
            return new j.Initialized(cVar, list, cVar2, null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CompanyApplicationCitizenData citizenData;
            CompanyApplicationCitizenAddress permanentAddress;
            c0 c0Var = (c0) this.f172968f;
            uq.b.e();
            if (this.f172967e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            KnownUserDataModel knownUserDataModelQ = p.this.contract.q();
            hb1.c cVarD = (knownUserDataModelQ == null || (citizenData = knownUserDataModelQ.getCitizenData()) == null || (permanentAddress = citizenData.getPermanentAddress()) == null) ? null : hb1.d.d(permanentAddress);
            HomeAddressContractData homeAddressContractDataR = p.this.contract.r();
            hb1.c homeAddress = homeAddressContractDataR != null ? homeAddressContractDataR.getHomeAddress() : null;
            AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractDataN2 = p.this.contract.n2();
            final hb1.c accountingDocumentAddress = accountingDocumentAddressSelectionContractDataN2 != null ? accountingDocumentAddressSelectionContractDataN2.getAccountingDocumentAddress() : null;
            BusinessAddressSelectionContractData businessAddressSelectionContractDataE = p.this.contract.E();
            hb1.c businessAddress = businessAddressSelectionContractDataE != null ? businessAddressSelectionContractDataE.getBusinessAddress() : null;
            CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractDataK = p.this.contract.k();
            final List listE0 = pq.v.e0(pq.v.s(cVarD, homeAddress, businessAddress, correspondenceAddressSelectionContractDataK != null ? correspondenceAddressSelectionContractDataK.getCorrespondenceAddress() : null));
            return c0Var.d(new er.l() { // from class: rb1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(accountingDocumentAddress, listE0, (j.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<j.a> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f172968f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrb1/e;", "<unused var>", "Lrb1/j$b;", "Loq/i0;", "<anonymous>", "(Lrb1/e;Lrb1/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<rb1.e, j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172970e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f172970e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<rb1.f> bVarY1 = p.this.Y1();
                rb1.f.a aVar = rb1.f.a.f172923a;
                this.f172970e = 1;
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
        public final Object w(rb1.e eVar, j.Initialized initialized, tq.e<? super i0> eVar2) {
            return p.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lrb1/i;", "action", "Lk10/c0;", "Lrb1/j$b;", "state", "Lk10/l;", "Lrb1/j;", "<anonymous>", "(Lrb1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SelectAddress, c0<j.Initialized>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f172974g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Initialized O(SelectAddress selectAddress, j.Initialized initialized) {
            return j.Initialized.b(initialized, selectAddress.getSelectedItem(), null, j.c.AddressSelected, hz.b.d.f86848c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectAddress selectAddress = (SelectAddress) this.f172973f;
            c0 c0Var = (c0) this.f172974g;
            uq.b.e();
            if (this.f172972e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: rb1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(selectAddress, (j.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectAddress selectAddress, c0<j.Initialized> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f172973f = selectAddress;
            eVar2.f172974g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lrb1/h;", "<unused var>", "Lk10/c0;", "Lrb1/j$b;", "state", "Lk10/l;", "Lrb1/j;", "<anonymous>", "(Lrb1/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h, c0<j.Initialized>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172976f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Initialized O(j.Initialized initialized) {
            return j.Initialized.b(initialized, null, null, j.c.EnterNewAddress, hz.b.d.f86848c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f172976f;
            uq.b.e();
            if (this.f172975e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: rb1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O((j.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h hVar, c0<j.Initialized> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            f fVar = new f(eVar);
            fVar.f172976f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lrb1/g;", "<unused var>", "Lk10/c0;", "Lrb1/j$b;", "state", "Lk10/l;", "Lrb1/j;", "<anonymous>", "(Lrb1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<rb1.g, c0<j.Initialized>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172978f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f172980a;

            static {
                int[] iArr = new int[j.c.values().length];
                try {
                    iArr[j.c.AddressSelected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.c.EnterNewAddress.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.c.NoSelection.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f172980a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Initialized O(j.Initialized initialized) {
            return j.Initialized.b(initialized, null, null, null, new hz.b.Invalid(null, 1, null), 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        
            if (r7.F(r2, r6) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
        
            if (r7.F(r2, r6) == r1) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f172978f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f172977e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L81
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto Lb1
            L23:
                oq.u.b(r7)
                java.lang.Object r7 = r0.a()
                rb1.j$b r7 = (rb1.j.Initialized) r7
                rb1.j$c r7 = r7.getSelectionState()
                int[] r2 = rb1.p.g.a.f172980a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 == r4) goto L86
                if (r7 == r3) goto L4f
                r1 = 3
                if (r7 != r1) goto L49
                rb1.t r7 = new rb1.t
                r7.<init>()
                k10.l r7 = r0.b(r7)
                return r7
            L49:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L4f:
                rb1.p r7 = rb1.p.this
                xw.b r7 = r7.Y1()
                rb1.f$b r2 = new rb1.f$b
                rb1.p r4 = rb1.p.this
                tb1.b r4 = rb1.p.l9(r4)
                java.lang.Object r5 = r0.a()
                rb1.j$b r5 = (rb1.j.Initialized) r5
                hb1.c r5 = r5.getSelectedAddress()
                if (r5 == 0) goto L6e
                st3.b r5 = r5.getTerytObject()
                goto L6f
            L6e:
                r5 = 0
            L6f:
                st3.d r4 = r4.h(r5)
                r2.<init>(r4)
                r6.f172978f = r0
                r6.f172977e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L81
                goto Lb0
            L81:
                k10.l r7 = r0.c()
                return r7
            L86:
                rb1.p r7 = rb1.p.this
                sb1.a r7 = rb1.p.k9(r7)
                sb1.b r2 = new sb1.b
                java.lang.Object r3 = r0.a()
                rb1.j$b r3 = (rb1.j.Initialized) r3
                hb1.c r3 = r3.getSelectedAddress()
                r2.<init>(r3)
                r7.x7(r2)
                rb1.p r7 = rb1.p.this
                xw.b r7 = r7.Y1()
                rb1.f$c r2 = rb1.f.c.f172925a
                r6.f172978f = r0
                r6.f172977e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto Lb1
            Lb0:
                return r1
            Lb1:
                k10.l r7 = r0.c()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: rb1.p.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rb1.g gVar, c0<j.Initialized> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            g gVar2 = p.this.new g(eVar);
            gVar2.f172978f = c0Var;
            return gVar2.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, tb1.b bVar, sb1.a aVar2) {
        this.mapper = bVar;
        this.contract = aVar2;
        j.a aVar3 = j.a.f172929a;
        this.initialState = aVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: rb1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f172948a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), n9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.a n9(j state) {
        return this.mapper.b(new tb1.b.Params(state, new er.l() { // from class: rb1.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f172945a, (hb1.c) obj);
            }
        }, b9(h.f172927a), b9(rb1.g.f172926a), b9(rb1.e.f172922a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(p pVar, hb1.c cVar) {
        pVar.d9(new SelectAddress(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(j.a.class), new er.l() { // from class: rb1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f172946a, (z) obj);
            }
        });
        vVar.c(q0.c(j.Initialized.class), new er.l() { // from class: rb1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f172947a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, z zVar) {
        zVar.A(pVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(p pVar, z zVar) {
        d dVar = pVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rb1.e.class), oVar, dVar);
        zVar.v(q0.c(SelectAddress.class), oVar, new e(null));
        zVar.v(q0.c(h.class), oVar, new f(null));
        zVar.v(q0.c(rb1.g.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<rb1.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<j, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k.a aVar) {
        super.P5(aVar);
    }
}
