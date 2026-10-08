package yb1;

import f00.j0;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import ld1.CompanyApplicationCitizenAddress;
import ld1.CompanyApplicationCitizenData;
import ld1.KnownUserDataModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zb1.BusinessAddressSelectionContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lyb1/q;", "Ll00/g;", "Lyb1/f;", "", "Lyb1/g;", "Lyy/a;", "stateMachineFactory", "Lac1/b;", "mapper", "Lzb1/a;", "contract", "<init>", "(Lyy/a;Lac1/b;Lzb1/a;)V", "state", "Lyb1/g$a;", "o9", "(Lyb1/f;)Lyb1/g$a;", "b", "Lac1/b;", "c", "Lzb1/a;", "Lyb1/f$b;", "d", "Lyb1/f$b;", "initialState", "Lxw/b;", "Lyb1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<yb1.f, Object> implements yb1.g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zb1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yb1.f.b initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yb1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yb1.f, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<yb1.g.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lyb1/q$a;", "Lf00/j0;", "Lzb1/a;", "Lyb1/q;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<zb1.a, q> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<yb1.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f226017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f226018b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f226019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f226020b;

            /* JADX INFO: renamed from: yb1.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6057a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f226021d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f226022e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f226023f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f226025h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f226026j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f226027k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f226028l;

                public C6057a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f226021d = obj;
                    this.f226022e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f226019a = hVar;
                this.f226020b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6057a c6057a;
                if (eVar instanceof C6057a) {
                    c6057a = (C6057a) eVar;
                    int i15 = c6057a.f226022e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6057a.f226022e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6057a = new C6057a(eVar);
                    }
                } else {
                    c6057a = new C6057a(eVar);
                }
                Object obj2 = c6057a.f226021d;
                Object objE = uq.b.e();
                int i16 = c6057a.f226022e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f226019a;
                    yb1.g.a aVarO9 = this.f226020b.o9((yb1.f) obj);
                    c6057a.f226023f = vq.j.a(obj);
                    c6057a.f226025h = vq.j.a(c6057a);
                    c6057a.f226026j = vq.j.a(obj);
                    c6057a.f226027k = vq.j.a(hVar);
                    c6057a.f226028l = 0;
                    c6057a.f226022e = 1;
                    if (hVar.F(aVarO9, c6057a) == objE) {
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
            this.f226017a = gVar;
            this.f226018b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yb1.g.a> hVar, tq.e eVar) {
            Object objA = this.f226017a.a(new a(hVar, this.f226018b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyb1/a;", "<unused var>", "Lyb1/f;", "Loq/i0;", "<anonymous>", "(Lyb1/a;Lyb1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yb1.a, yb1.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226029e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226029e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yb1.b> bVarY1 = q.this.Y1();
                yb1.b.a aVar = yb1.b.a.f225977a;
                this.f226029e = 1;
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
        public final Object w(yb1.a aVar, yb1.f fVar, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyb1/f$b;", "it", "Lk10/l;", "Lyb1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<yb1.f.b>, tq.e<? super k10.l<? extends yb1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226032f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb1.f.DataDisplayed O(hb1.c cVar, List list, yb1.f.b bVar) {
            yb1.f.c cVar2;
            if (hb1.d.c(cVar)) {
                cVar2 = !pq.v.c0(list, cVar) ? yb1.f.c.EnterNewAddress : yb1.f.c.AddressSelected;
            } else {
                cVar2 = yb1.f.c.NoSelection;
            }
            return new yb1.f.DataDisplayed(cVar, list, cVar2, null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CompanyApplicationCitizenData citizenData;
            CompanyApplicationCitizenAddress permanentAddress;
            c0 c0Var = (c0) this.f226032f;
            uq.b.e();
            if (this.f226031e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            KnownUserDataModel knownUserDataModelQ = q.this.contract.q();
            hb1.c cVarD = (knownUserDataModelQ == null || (citizenData = knownUserDataModelQ.getCitizenData()) == null || (permanentAddress = citizenData.getPermanentAddress()) == null) ? null : hb1.d.d(permanentAddress);
            HomeAddressContractData homeAddressContractDataR = q.this.contract.r();
            hb1.c homeAddress = homeAddressContractDataR != null ? homeAddressContractDataR.getHomeAddress() : null;
            BusinessAddressSelectionContractData businessAddressSelectionContractDataE = q.this.contract.E();
            final hb1.c businessAddress = businessAddressSelectionContractDataE != null ? businessAddressSelectionContractDataE.getBusinessAddress() : null;
            final List listE0 = pq.v.e0(pq.v.s(cVarD, homeAddress));
            return c0Var.d(new er.l() { // from class: yb1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(businessAddress, listE0, (f.b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<yb1.f.b> c0Var, tq.e<? super k10.l<? extends yb1.f>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f226032f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb1/e;", "action", "Lk10/c0;", "Lyb1/f$a;", "state", "Lk10/l;", "Lyb1/f;", "<anonymous>", "(Lyb1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SelectAddress, c0<yb1.f.DataDisplayed>, tq.e<? super k10.l<? extends yb1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f226036g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb1.f.DataDisplayed O(SelectAddress selectAddress, yb1.f.DataDisplayed dataDisplayed) {
            return yb1.f.DataDisplayed.b(dataDisplayed, selectAddress.getAddress(), null, yb1.f.c.AddressSelected, hz.b.C2039b.f86846c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectAddress selectAddress = (SelectAddress) this.f226035f;
            c0 c0Var = (c0) this.f226036g;
            uq.b.e();
            if (this.f226034e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yb1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(selectAddress, (f.DataDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectAddress selectAddress, c0<yb1.f.DataDisplayed> c0Var, tq.e<? super k10.l<? extends yb1.f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f226035f = selectAddress;
            eVar2.f226036g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb1/d;", "<unused var>", "Lk10/c0;", "Lyb1/f$a;", "state", "Lk10/l;", "Lyb1/f;", "<anonymous>", "(Lyb1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yb1.d, c0<yb1.f.DataDisplayed>, tq.e<? super k10.l<? extends yb1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226038f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb1.f.DataDisplayed O(yb1.f.DataDisplayed dataDisplayed) {
            return yb1.f.DataDisplayed.b(dataDisplayed, null, null, yb1.f.c.EnterNewAddress, hz.b.C2039b.f86846c, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f226038f;
            uq.b.e();
            if (this.f226037e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yb1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O((f.DataDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yb1.d dVar, c0<yb1.f.DataDisplayed> c0Var, tq.e<? super k10.l<? extends yb1.f>> eVar) {
            f fVar = new f(eVar);
            fVar.f226038f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb1/c;", "<unused var>", "Lk10/c0;", "Lyb1/f$a;", "state", "Lk10/l;", "Lyb1/f;", "<anonymous>", "(Lyb1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yb1.c, c0<yb1.f.DataDisplayed>, tq.e<? super k10.l<? extends yb1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226040f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f226042a;

            static {
                int[] iArr = new int[yb1.f.c.values().length];
                try {
                    iArr[yb1.f.c.NoSelection.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yb1.f.c.AddressSelected.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yb1.f.c.EnterNewAddress.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f226042a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb1.f.DataDisplayed O(yb1.f.DataDisplayed dataDisplayed) {
            return yb1.f.DataDisplayed.b(dataDisplayed, null, null, null, new hz.b.Invalid(null, 1, null), 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
        
            if (r7.F(r2, r6) == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        
            if (r7.F(r2, r6) == r1) goto L28;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f226040f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f226039e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L71
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto La7
            L23:
                oq.u.b(r7)
                java.lang.Object r7 = r0.a()
                yb1.f$a r7 = (yb1.f.DataDisplayed) r7
                yb1.f$c r7 = r7.getSelectionState()
                int[] r2 = yb1.q.g.a.f226042a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 == r4) goto Lac
                if (r7 == r3) goto L7c
                r2 = 3
                if (r7 != r2) goto L76
                yb1.q r7 = yb1.q.this
                xw.b r7 = r7.Y1()
                yb1.b$b r2 = new yb1.b$b
                yb1.q r4 = yb1.q.this
                ac1.b r4 = yb1.q.m9(r4)
                java.lang.Object r5 = r0.a()
                yb1.f$a r5 = (yb1.f.DataDisplayed) r5
                hb1.c r5 = r5.getSelectedAddress()
                if (r5 == 0) goto L5e
                st3.b r5 = r5.getTerytObject()
                goto L5f
            L5e:
                r5 = 0
            L5f:
                st3.d r4 = r4.h(r5)
                r2.<init>(r4)
                r6.f226040f = r0
                r6.f226039e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L71
                goto La6
            L71:
                k10.l r7 = r0.c()
                return r7
            L76:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L7c:
                yb1.q r7 = yb1.q.this
                zb1.a r7 = yb1.q.l9(r7)
                zb1.b r2 = new zb1.b
                java.lang.Object r3 = r0.a()
                yb1.f$a r3 = (yb1.f.DataDisplayed) r3
                hb1.c r3 = r3.getSelectedAddress()
                r2.<init>(r3)
                r7.u0(r2)
                yb1.q r7 = yb1.q.this
                xw.b r7 = r7.Y1()
                yb1.b$c r2 = yb1.b.c.f225979a
                r6.f226040f = r0
                r6.f226039e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto La7
            La6:
                return r1
            La7:
                k10.l r7 = r0.c()
                return r7
            Lac:
                yb1.u r7 = new yb1.u
                r7.<init>()
                k10.l r7 = r0.b(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yb1.q.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yb1.c cVar, c0<yb1.f.DataDisplayed> c0Var, tq.e<? super k10.l<? extends yb1.f>> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f226040f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, ac1.b bVar, zb1.a aVar2) {
        this.mapper = bVar;
        this.contract = aVar2;
        yb1.f.b bVar2 = yb1.f.b.f225987a;
        this.initialState = bVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: yb1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f226010a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), o9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yb1.g.a o9(yb1.f state) {
        ac1.b bVar = this.mapper;
        er.a<i0> aVarB9 = b9(yb1.c.f225980a);
        er.a<i0> aVarB10 = b9(yb1.a.f225976a);
        return bVar.b(new ac1.b.Params(state, new er.l() { // from class: yb1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f226009a, (hb1.c) obj);
            }
        }, b9(yb1.d.f225981a), aVarB9, aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(q qVar, hb1.c cVar) {
        qVar.d9(new SelectAddress(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(yb1.f.class), new er.l() { // from class: yb1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f226006a, (z) obj);
            }
        });
        vVar.c(q0.c(yb1.f.b.class), new er.l() { // from class: yb1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f226007a, (z) obj);
            }
        });
        vVar.c(q0.c(yb1.f.DataDisplayed.class), new er.l() { // from class: yb1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f226008a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        zVar.x(q0.c(yb1.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, z zVar) {
        zVar.A(qVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(SelectAddress.class), oVar, eVar);
        zVar.v(q0.c(yb1.d.class), oVar, new f(null));
        zVar.v(q0.c(yb1.c.class), oVar, qVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<yb1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yb1.f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yb1.g.a> getState() {
        return this.state;
    }
}
