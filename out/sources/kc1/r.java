package kc1;

import f00.j0;
import fr.q0;
import hb1.PostOfficeBoxData;
import java.util.List;
import k10.c0;
import lc1.CorrespondenceAddressSelectionContractData;
import ld1.CompanyApplicationCitizenAddress;
import ld1.CompanyApplicationCitizenData;
import ld1.KnownUserDataModel;
import mu.p0;
import oc1.CorrespondencePostOfficeBoxContractData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zb1.BusinessAddressSelectionContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lkc1/r;", "Ll00/g;", "Lkc1/g;", "", "Lkc1/h;", "Lyy/a;", "stateMachineFactory", "Lmc1/b;", "mapper", "Llc1/a;", "contract", "<init>", "(Lyy/a;Lmc1/b;Llc1/a;)V", "state", "Lkc1/h$a;", "o9", "(Lkc1/g;)Lkc1/h$a;", "b", "Lmc1/b;", "c", "Llc1/a;", "Lkc1/g$b;", "d", "Lkc1/g$b;", "initialState", "Lxw/b;", "Lkc1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<kc1.g, Object> implements kc1.h, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mc1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lc1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kc1.g.b initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kc1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kc1.g, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<kc1.h.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lkc1/r$a;", "Lf00/j0;", "Llc1/a;", "Lkc1/r;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<lc1.a, r> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<kc1.h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f109963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f109964b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f109965a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f109966b;

            /* JADX INFO: renamed from: kc1.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2626a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f109967d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f109968e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f109969f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f109971h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f109972j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f109973k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f109974l;

                public C2626a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f109967d = obj;
                    this.f109968e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f109965a = hVar;
                this.f109966b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2626a c2626a;
                if (eVar instanceof C2626a) {
                    c2626a = (C2626a) eVar;
                    int i15 = c2626a.f109968e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2626a.f109968e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2626a = new C2626a(eVar);
                    }
                } else {
                    c2626a = new C2626a(eVar);
                }
                Object obj2 = c2626a.f109967d;
                Object objE = uq.b.e();
                int i16 = c2626a.f109968e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f109965a;
                    kc1.h.a aVarO9 = this.f109966b.o9((kc1.g) obj);
                    c2626a.f109969f = vq.j.a(obj);
                    c2626a.f109971h = vq.j.a(c2626a);
                    c2626a.f109972j = vq.j.a(obj);
                    c2626a.f109973k = vq.j.a(hVar);
                    c2626a.f109974l = 0;
                    c2626a.f109968e = 1;
                    if (hVar.F(aVarO9, c2626a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f109963a = gVar;
            this.f109964b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kc1.h.a> hVar, tq.e eVar) {
            Object objA = this.f109963a.a(new a(hVar, this.f109964b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkc1/a;", "<unused var>", "Lkc1/g;", "Loq/i0;", "<anonymous>", "(Lkc1/a;Lkc1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<kc1.a, kc1.g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109975e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109975e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kc1.b> bVarY1 = r.this.Y1();
                kc1.b.a aVar = kc1.b.a.f109922a;
                this.f109975e = 1;
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
        public final Object w(kc1.a aVar, kc1.g gVar, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkc1/g$b;", "it", "Lk10/l;", "Lkc1/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<kc1.g.b>, tq.e<? super k10.l<? extends kc1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109978f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kc1.g.DataDisplayed O(PostOfficeBoxData postOfficeBoxData, hb1.c cVar, List list, kc1.g.b bVar) {
            kc1.g.c cVar2;
            if (postOfficeBoxData != null) {
                cVar2 = kc1.g.c.PostOfficeBox;
            } else if (hb1.d.c(cVar)) {
                cVar2 = !pq.v.c0(list, cVar) ? kc1.g.c.EnterNewAddress : kc1.g.c.AddressSelected;
            } else {
                cVar2 = kc1.g.c.NoSelection;
            }
            return new kc1.g.DataDisplayed(cVar, list, cVar2, null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CompanyApplicationCitizenData citizenData;
            CompanyApplicationCitizenAddress permanentAddress;
            c0 c0Var = (c0) this.f109978f;
            uq.b.e();
            if (this.f109977e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            KnownUserDataModel knownUserDataModelQ = r.this.contract.q();
            hb1.c cVarD = (knownUserDataModelQ == null || (citizenData = knownUserDataModelQ.getCitizenData()) == null || (permanentAddress = citizenData.getPermanentAddress()) == null) ? null : hb1.d.d(permanentAddress);
            HomeAddressContractData homeAddressContractDataR = r.this.contract.r();
            hb1.c homeAddress = homeAddressContractDataR != null ? homeAddressContractDataR.getHomeAddress() : null;
            BusinessAddressSelectionContractData businessAddressSelectionContractDataE = r.this.contract.E();
            hb1.c businessAddress = businessAddressSelectionContractDataE != null ? businessAddressSelectionContractDataE.getBusinessAddress() : null;
            CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractDataK = r.this.contract.k();
            final hb1.c correspondenceAddress = correspondenceAddressSelectionContractDataK != null ? correspondenceAddressSelectionContractDataK.getCorrespondenceAddress() : null;
            CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractDataE0 = r.this.contract.E0();
            final PostOfficeBoxData postOfficeBoxData = correspondencePostOfficeBoxContractDataE0 != null ? correspondencePostOfficeBoxContractDataE0.getPostOfficeBoxData() : null;
            final List listE0 = pq.v.e0(pq.v.s(cVarD, homeAddress, businessAddress));
            return c0Var.d(new er.l() { // from class: kc1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O(postOfficeBoxData, correspondenceAddress, listE0, (g.b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<kc1.g.b> c0Var, tq.e<? super k10.l<? extends kc1.g>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f109978f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc1/f;", "action", "Lk10/c0;", "Lkc1/g$a;", "state", "Lk10/l;", "Lkc1/g;", "<anonymous>", "(Lkc1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SelectAddress, c0<kc1.g.DataDisplayed>, tq.e<? super k10.l<? extends kc1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f109982g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kc1.g.DataDisplayed O(SelectAddress selectAddress, kc1.g.DataDisplayed dataDisplayed) {
            return kc1.g.DataDisplayed.b(dataDisplayed, selectAddress.getAddress(), null, kc1.g.c.AddressSelected, hz.b.C2039b.f86846c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectAddress selectAddress = (SelectAddress) this.f109981f;
            c0 c0Var = (c0) this.f109982g;
            uq.b.e();
            if (this.f109980e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kc1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(selectAddress, (g.DataDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectAddress selectAddress, c0<kc1.g.DataDisplayed> c0Var, tq.e<? super k10.l<? extends kc1.g>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f109981f = selectAddress;
            eVar2.f109982g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc1/d;", "<unused var>", "Lk10/c0;", "Lkc1/g$a;", "state", "Lk10/l;", "Lkc1/g;", "<anonymous>", "(Lkc1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kc1.d, c0<kc1.g.DataDisplayed>, tq.e<? super k10.l<? extends kc1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109984f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kc1.g.DataDisplayed O(kc1.g.DataDisplayed dataDisplayed) {
            return kc1.g.DataDisplayed.b(dataDisplayed, null, null, kc1.g.c.EnterNewAddress, hz.b.C2039b.f86846c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f109984f;
            uq.b.e();
            if (this.f109983e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kc1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O((g.DataDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kc1.d dVar, c0<kc1.g.DataDisplayed> c0Var, tq.e<? super k10.l<? extends kc1.g>> eVar) {
            f fVar = new f(eVar);
            fVar.f109984f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc1/e;", "<unused var>", "Lk10/c0;", "Lkc1/g$a;", "state", "Lk10/l;", "Lkc1/g;", "<anonymous>", "(Lkc1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kc1.e, c0<kc1.g.DataDisplayed>, tq.e<? super k10.l<? extends kc1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109986f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kc1.g.DataDisplayed O(kc1.g.DataDisplayed dataDisplayed) {
            return kc1.g.DataDisplayed.b(dataDisplayed, null, null, kc1.g.c.PostOfficeBox, hz.b.C2039b.f86846c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f109986f;
            uq.b.e();
            if (this.f109985e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kc1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O((g.DataDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kc1.e eVar, c0<kc1.g.DataDisplayed> c0Var, tq.e<? super k10.l<? extends kc1.g>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f109986f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc1/c;", "<unused var>", "Lk10/c0;", "Lkc1/g$a;", "state", "Lk10/l;", "Lkc1/g;", "<anonymous>", "(Lkc1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<kc1.c, c0<kc1.g.DataDisplayed>, tq.e<? super k10.l<? extends kc1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109988f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f109990a;

            static {
                int[] iArr = new int[kc1.g.c.values().length];
                try {
                    iArr[kc1.g.c.NoSelection.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kc1.g.c.AddressSelected.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kc1.g.c.EnterNewAddress.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[kc1.g.c.PostOfficeBox.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f109990a = iArr;
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kc1.g.DataDisplayed O(kc1.g.DataDisplayed dataDisplayed) {
            return kc1.g.DataDisplayed.b(dataDisplayed, null, null, null, new hz.b.Invalid(null, 1, null), 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r7.F(r2, r6) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            if (r7.F(r2, r6) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
        
            if (r7.F(r2, r6) == r1) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kc1.r.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kc1.c cVar, c0<kc1.g.DataDisplayed> c0Var, tq.e<? super k10.l<? extends kc1.g>> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f109988f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, mc1.b bVar, lc1.a aVar2) {
        this.mapper = bVar;
        this.contract = aVar2;
        kc1.g.b bVar2 = kc1.g.b.f109934a;
        this.initialState = bVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: kc1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.q9(this.f109956a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), o9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kc1.h.a o9(kc1.g state) {
        mc1.b bVar = this.mapper;
        er.a<i0> aVarB9 = b9(kc1.c.f109926a);
        er.a<i0> aVarB10 = b9(kc1.a.f109921a);
        return bVar.b(new mc1.b.Params(state, new er.l() { // from class: kc1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.p9(this.f109955a, (hb1.c) obj);
            }
        }, b9(kc1.d.f109927a), b9(kc1.e.f109928a), aVarB9, aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(r rVar, hb1.c cVar) {
        rVar.d9(new SelectAddress(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(kc1.g.class), new er.l() { // from class: kc1.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.r9(this.f109952a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(kc1.g.b.class), new er.l() { // from class: kc1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9(this.f109953a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(kc1.g.DataDisplayed.class), new er.l() { // from class: kc1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f109954a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(r rVar, k10.z zVar) {
        c cVar = rVar.new c(null);
        zVar.x(q0.c(kc1.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(r rVar, k10.z zVar) {
        zVar.A(rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(r rVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(SelectAddress.class), oVar, eVar);
        zVar.v(q0.c(kc1.d.class), oVar, new f(null));
        zVar.v(q0.c(kc1.e.class), oVar, new g(null));
        zVar.v(q0.c(kc1.c.class), oVar, rVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<kc1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<kc1.g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kc1.h.a> getState() {
        return this.state;
    }
}
