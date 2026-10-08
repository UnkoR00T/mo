package lq2;

import eq2.YourDataValidatedData;
import fr.q0;
import java.util.Iterator;
import jl0.PassportChildAgreementParentData;
import mu.p0;
import nq2.DropDownState;
import nq2.FieldState;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\u001f*\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010(J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR&\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030R8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010+\u001a\b\u0012\u0004\u0012\u00020,0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Llq2/u;", "Ll00/g;", "Llq2/c;", "Llq2/a;", "Llq2/d;", "", "Lyy/a;", "stateMachineFactory", "Lmq2/e;", "mapper", "Ltl0/e;", "getPassportAgreementParentDataUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lep2/f;", "checkIsPlaceOfBirthCorrectUC", "Lep2/b;", "checkIfDocumentSeriesAndNumberCorrectUC", "Lep2/c;", "checkIfIdCardNameCorrectUC", "Lkx/d;", "intentActionManager", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Llq2/b;", "setupData", "<init>", "(Lyy/a;Lmq2/e;Ltl0/e;Lac4/a;Lep2/f;Lep2/b;Lep2/c;Lkx/d;Lhb4/d;Lib4/c;Llq2/b;)V", "Lnq2/b;", "", "F9", "(Lnq2/b;)Z", "Lnq2/a;", "E9", "(Lnq2/a;)Z", "", "value", "S9", "(Ljava/lang/String;)Lnq2/b;", "U9", "T9", "state", "Llq2/d$a;", "G9", "(Llq2/c;)Llq2/d$a;", "data", "Loq/i0;", "M9", "(Llq2/b;)V", "b", "Lmq2/e;", "c", "Ltl0/e;", "d", "Lac4/a;", "e", "Lep2/f;", "f", "Lep2/b;", "g", "Lep2/c;", "h", "Lkx/d;", "j", "Lhb4/d;", "k", "Lib4/c;", "l", "Llq2/b;", "Llq2/c$a$b;", "m", "Llq2/c$a$b;", "initialState", "Lxw/b;", "Llq2/a$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<lq2.c, lq2.a> implements lq2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mq2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tl0.e getPassportAgreementParentDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ep2.f checkIsPlaceOfBirthCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ep2.b checkIfDocumentSeriesAndNumberCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ep2.c checkIfIdCardNameCorrectUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final lq2.b setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final lq2.c.a.b initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lq2.a.InterfaceC2907a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<lq2.c, lq2.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<lq2.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<lq2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f119576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f119577b;

        /* JADX INFO: renamed from: lq2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2912a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f119578a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f119579b;

            /* JADX INFO: renamed from: lq2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2913a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f119580d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f119581e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f119582f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f119584h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f119585j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f119586k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f119587l;

                public C2913a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f119580d = obj;
                    this.f119581e |= PKIFailureInfo.systemUnavail;
                    return C2912a.this.F(null, this);
                }
            }

            public C2912a(mu.h hVar, u uVar) {
                this.f119578a = hVar;
                this.f119579b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2913a c2913a;
                if (eVar instanceof C2913a) {
                    c2913a = (C2913a) eVar;
                    int i15 = c2913a.f119581e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2913a.f119581e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2913a = new C2913a(eVar);
                    }
                } else {
                    c2913a = new C2913a(eVar);
                }
                Object obj2 = c2913a.f119580d;
                Object objE = uq.b.e();
                int i16 = c2913a.f119581e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f119578a;
                    lq2.d.a aVarG9 = this.f119579b.G9((lq2.c) obj);
                    c2913a.f119582f = vq.j.a(obj);
                    c2913a.f119584h = vq.j.a(c2913a);
                    c2913a.f119585j = vq.j.a(obj);
                    c2913a.f119586k = vq.j.a(hVar);
                    c2913a.f119587l = 0;
                    c2913a.f119581e = 1;
                    if (hVar.F(aVarG9, c2913a) == objE) {
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
            this.f119576a = gVar;
            this.f119577b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super lq2.d.a> hVar, tq.e eVar) {
            Object objA = this.f119576a.a(new C2912a(hVar, this.f119577b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llq2/a$a;", "action", "Llq2/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llq2/a$a;Llq2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<lq2.a.InterfaceC2907a, lq2.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119589f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lq2.a.InterfaceC2907a interfaceC2907a = (lq2.a.InterfaceC2907a) this.f119589f;
            Object objE = uq.b.e();
            int i15 = this.f119588e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f119589f = vq.j.a(interfaceC2907a);
                this.f119588e = 1;
                if (uVar.F(interfaceC2907a, this) == objE) {
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
        public final Object w(lq2.a.InterfaceC2907a interfaceC2907a, lq2.c.a aVar, tq.e<? super i0> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f119589f = interfaceC2907a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Llq2/c$a$b;", "state", "Lk10/l;", "Llq2/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<lq2.c.a.b>, tq.e<? super k10.l<? extends lq2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119592f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llq2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lq2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f119594e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f119595f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<lq2.c.a.b> f119596g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<lq2.c.a.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f119595f = uVar;
                this.f119596g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lq2.c.Initialized Z(nq2.d.ParentFormSetupData parentFormSetupData, lq2.c.a.b bVar) {
                nq2.c next;
                PassportChildAgreementParentData parentData = parentFormSetupData.getParentData();
                FieldState fieldState = new FieldState(null, iy.c0.e(parentFormSetupData.getBirthPlaceFieldValue()), 1, null);
                FieldState fieldState2 = new FieldState(null, iy.c0.e(parentFormSetupData.getIdCardSeriesAndNumberFieldValue()), 1, null);
                FieldState fieldState3 = new FieldState(null, iy.c0.e(parentFormSetupData.getIdCardNameFieldValue()), 1, null);
                Iterator<nq2.c> it = nq2.c.e().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    nq2.c cVar = next;
                    nq2.c documentType = parentFormSetupData.getDocumentType();
                    if (documentType != null && cVar.ordinal() == documentType.ordinal()) {
                        break;
                    }
                }
                nq2.c cVar2 = next;
                return new lq2.c.Initialized(parentData, fieldState, fieldState2, fieldState3, new DropDownState(cVar2 != null ? Integer.valueOf(cVar2.ordinal()) : null, null, 2, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lq2.c.a.Error a0(final u uVar, dx.b bVar, lq2.c.a.b bVar2) {
                return new lq2.c.a.Error(uVar.errorVMSFactory.a(uVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: lq2.y
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.c.a.b0(uVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 b0(u uVar, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Secondary)) {
                    uVar.d9(lq2.a.InterfaceC2907a.C2908a.f119499a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    uVar.d9(lq2.a.g.f119509a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final lq2.c.Initialized c0(PassportChildAgreementParentData passportChildAgreementParentData, lq2.c.a.b bVar) {
                return new lq2.c.Initialized(passportChildAgreementParentData, null, null, null, null, 30, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objD;
                Object objE = uq.b.e();
                int i15 = this.f119594e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    final nq2.d.ParentFormSetupData parentFormSetupDataR7 = this.f119595f.setupData.getContract().r7();
                    if (parentFormSetupDataR7 != null && (objD = this.f119596g.d(new er.l() { // from class: lq2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.Z(parentFormSetupDataR7, (c.a.b) obj2);
                        }
                    })) != null) {
                        return objD;
                    }
                    tl0.e eVar = this.f119595f.getPassportAgreementParentDataUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f119594e = 1;
                    obj = eVar.c(c1792a, this);
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
                k10.c0<lq2.c.a.b> c0Var = this.f119596g;
                final u uVar = this.f119595f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: lq2.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.a0(uVar, bVar, (c.a.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final PassportChildAgreementParentData passportChildAgreementParentData = (PassportChildAgreementParentData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: lq2.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.c.a.c0(passportChildAgreementParentData, (c.a.b) obj2);
                    }
                });
            }

            public final tq.e<i0> X(tq.e<?> eVar) {
                return new a(this.f119595f, this.f119596g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lq2.c>> eVar) {
                return ((a) X(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f119592f;
            Object objE = uq.b.e();
            int i15 = this.f119591e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f119592f = vq.j.a(c0Var);
            this.f119591e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<lq2.c.a.b> c0Var, tq.e<? super k10.l<? extends lq2.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = u.this.new c(eVar);
            cVar.f119592f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llq2/a$g;", "<unused var>", "Lk10/c0;", "Llq2/c$a$a;", "state", "Lk10/l;", "Llq2/c;", "<anonymous>", "(Llq2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<lq2.a.g, k10.c0<lq2.c.a.Error>, tq.e<? super k10.l<? extends lq2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119598f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lq2.c.a.b O(lq2.c.a.Error error) {
            return lq2.c.a.b.f119517a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f119598f;
            uq.b.e();
            if (this.f119597e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lq2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.d.O((c.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lq2.a.g gVar, k10.c0<lq2.c.a.Error> c0Var, tq.e<? super k10.l<? extends lq2.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f119598f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llq2/a$a;", "action", "Llq2/c$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Llq2/a$a;Llq2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<lq2.a.InterfaceC2907a, lq2.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119601g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:61:0x0195  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nq2.c cVar;
            iy.b0 b0Var;
            nq2.c cVar2;
            lq2.a.InterfaceC2907a interfaceC2907a = (lq2.a.InterfaceC2907a) this.f119600f;
            lq2.c.Initialized initialized = (lq2.c.Initialized) this.f119601g;
            Object objE = uq.b.e();
            int i15 = this.f119599e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(interfaceC2907a, lq2.a.InterfaceC2907a.C2908a.f119499a)) {
                    nq2.d contract = u.this.setupData.getContract();
                    PassportChildAgreementParentData parentData = initialized.getParentData();
                    Iterator<nq2.c> it = nq2.c.e().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            cVar2 = null;
                            break;
                        }
                        nq2.c next = it.next();
                        int iOrdinal = next.ordinal();
                        Integer initialPick = initialized.getDocumentTypeDropDownState().getInitialPick();
                        if (initialPick != null && iOrdinal == initialPick.intValue()) {
                            cVar2 = next;
                            break;
                        }
                    }
                    contract.F6(new nq2.d.ParentFormSetupData(parentData, iy.c0.g(initialized.getBirthPlaceFieldState().getValue()), iy.c0.g(initialized.getIdCardSeriesAndNumberFieldState().getValue()), iy.c0.g(initialized.getIdCardNameFieldState().getValue()), cVar2));
                } else if (fr.t.c(interfaceC2907a, lq2.a.InterfaceC2907a.c.f119501a) || fr.t.c(interfaceC2907a, lq2.a.InterfaceC2907a.e.f119503a)) {
                    nq2.d contract2 = u.this.setupData.getContract();
                    fz.b.LocalDate dateOfBirth = initialized.getParentData().getDateOfBirth();
                    iy.b0 firstName = initialized.getParentData().getFirstName();
                    iy.b0 pesel = initialized.getParentData().getPesel();
                    iy.b0 surname = initialized.getParentData().getSurname();
                    al0.z gender = initialized.getParentData().getGender();
                    iy.b0 idCardSeriesAndNumber = initialized.getParentData().getIdCardSeriesAndNumber();
                    if (idCardSeriesAndNumber == null) {
                        idCardSeriesAndNumber = iy.c0.g(initialized.getIdCardSeriesAndNumberFieldState().getValue());
                    }
                    iy.b0 b0Var2 = idCardSeriesAndNumber;
                    iy.b0 placeOfBirth = initialized.getParentData().getPlaceOfBirth();
                    if (placeOfBirth == null) {
                        placeOfBirth = iy.c0.g(initialized.getBirthPlaceFieldState().getValue());
                    }
                    iy.b0 b0Var3 = placeOfBirth;
                    iy.b0 secondName = initialized.getParentData().getSecondName();
                    if (initialized.getParentData().getIdCardSeriesAndNumber() == null && initialized.getDocumentTypeDropDownState().getInitialPick() != null) {
                        wq.a<nq2.c> aVarE = nq2.c.e();
                        int iIntValue = initialized.getDocumentTypeDropDownState().getInitialPick().intValue();
                        cVar = (iIntValue < 0 || iIntValue >= aVarE.size()) ? nq2.c.ID_CARD : aVarE.get(iIntValue);
                    } else {
                        cVar = nq2.c.ID_CARD;
                    }
                    nq2.c cVar3 = cVar;
                    iy.b0 b0VarG = iy.c0.g(initialized.getIdCardNameFieldState().getValue());
                    if (initialized.getParentData().getIdCardSeriesAndNumber() == null) {
                        Integer initialPick2 = initialized.getDocumentTypeDropDownState().getInitialPick();
                        int iOrdinal2 = nq2.c.OTHER.ordinal();
                        if (initialPick2 != null && initialPick2.intValue() == iOrdinal2) {
                            b0Var = b0VarG;
                        } else {
                            b0Var = null;
                        }
                    } else {
                        b0Var = null;
                    }
                    contract2.t7(new YourDataValidatedData(dateOfBirth, firstName, pesel, surname, gender, b0Var2, b0Var3, secondName, cVar3, b0Var, initialized.getParentData().getChecksum(), null));
                } else if (!(interfaceC2907a instanceof lq2.a.InterfaceC2907a.ToDocumentTypePicker) && !fr.t.c(interfaceC2907a, lq2.a.InterfaceC2907a.b.f119500a)) {
                    throw new oq.p();
                }
                u uVar = u.this;
                this.f119600f = vq.j.a(interfaceC2907a);
                this.f119601g = vq.j.a(initialized);
                this.f119599e = 1;
                if (uVar.F(interfaceC2907a, this) == objE) {
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
        public final Object w(lq2.a.InterfaceC2907a interfaceC2907a, lq2.c.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f119600f = interfaceC2907a;
            eVar2.f119601g = initialized;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llq2/a$e;", "action", "Lk10/c0;", "Llq2/c$b;", "state", "Lk10/l;", "Llq2/c;", "<anonymous>", "(Llq2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<lq2.a.SetIdCardSeriesAndNumberStateValue, k10.c0<lq2.c.Initialized>, tq.e<? super k10.l<? extends lq2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119605g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lq2.c.Initialized O(lq2.a.SetIdCardSeriesAndNumberStateValue setIdCardSeriesAndNumberStateValue, lq2.c.Initialized initialized) {
            return lq2.c.Initialized.b(initialized, null, null, new FieldState(null, setIdCardSeriesAndNumberStateValue.getValue(), 1, null), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lq2.a.SetIdCardSeriesAndNumberStateValue setIdCardSeriesAndNumberStateValue = (lq2.a.SetIdCardSeriesAndNumberStateValue) this.f119604f;
            k10.c0 c0Var = (k10.c0) this.f119605g;
            uq.b.e();
            if (this.f119603e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lq2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(setIdCardSeriesAndNumberStateValue, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lq2.a.SetIdCardSeriesAndNumberStateValue setIdCardSeriesAndNumberStateValue, k10.c0<lq2.c.Initialized> c0Var, tq.e<? super k10.l<? extends lq2.c>> eVar) {
            f fVar = new f(eVar);
            fVar.f119604f = setIdCardSeriesAndNumberStateValue;
            fVar.f119605g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llq2/a$c;", "action", "Lk10/c0;", "Llq2/c$b;", "state", "Lk10/l;", "Llq2/c;", "<anonymous>", "(Llq2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<lq2.a.SetBirthPlaceStateValue, k10.c0<lq2.c.Initialized>, tq.e<? super k10.l<? extends lq2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119608g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lq2.c.Initialized O(lq2.a.SetBirthPlaceStateValue setBirthPlaceStateValue, lq2.c.Initialized initialized) {
            return lq2.c.Initialized.b(initialized, null, new FieldState(null, setBirthPlaceStateValue.getValue(), 1, null), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lq2.a.SetBirthPlaceStateValue setBirthPlaceStateValue = (lq2.a.SetBirthPlaceStateValue) this.f119607f;
            k10.c0 c0Var = (k10.c0) this.f119608g;
            uq.b.e();
            if (this.f119606e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lq2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O(setBirthPlaceStateValue, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lq2.a.SetBirthPlaceStateValue setBirthPlaceStateValue, k10.c0<lq2.c.Initialized> c0Var, tq.e<? super k10.l<? extends lq2.c>> eVar) {
            g gVar = new g(eVar);
            gVar.f119607f = setBirthPlaceStateValue;
            gVar.f119608g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llq2/a$d;", "action", "Lk10/c0;", "Llq2/c$b;", "state", "Lk10/l;", "Llq2/c;", "<anonymous>", "(Llq2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<lq2.a.SetIdCardNameFieldValue, k10.c0<lq2.c.Initialized>, tq.e<? super k10.l<? extends lq2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119611g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lq2.c.Initialized O(lq2.a.SetIdCardNameFieldValue setIdCardNameFieldValue, lq2.c.Initialized initialized) {
            return lq2.c.Initialized.b(initialized, null, null, null, new FieldState(null, setIdCardNameFieldValue.getValue(), 1, null), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lq2.a.SetIdCardNameFieldValue setIdCardNameFieldValue = (lq2.a.SetIdCardNameFieldValue) this.f119610f;
            k10.c0 c0Var = (k10.c0) this.f119611g;
            uq.b.e();
            if (this.f119609e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: lq2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(setIdCardNameFieldValue, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lq2.a.SetIdCardNameFieldValue setIdCardNameFieldValue, k10.c0<lq2.c.Initialized> c0Var, tq.e<? super k10.l<? extends lq2.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f119610f = setIdCardNameFieldValue;
            hVar.f119611g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llq2/a$f;", "action", "Lk10/c0;", "Llq2/c$b;", "state", "Lk10/l;", "Llq2/c;", "<anonymous>", "(Llq2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<lq2.a.SetPickedDocumentType, k10.c0<lq2.c.Initialized>, tq.e<? super k10.l<? extends lq2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f119614g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lq2.c.Initialized O(nq2.c cVar, lq2.c.Initialized initialized) {
            return lq2.c.Initialized.b(initialized, null, null, null, new FieldState(null, null, 3, null), new DropDownState(Integer.valueOf(cVar.ordinal()), null, 2, null), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarB;
            lq2.a.SetPickedDocumentType setPickedDocumentType = (lq2.a.SetPickedDocumentType) this.f119613f;
            k10.c0 c0Var = (k10.c0) this.f119614g;
            uq.b.e();
            if (this.f119612e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final nq2.c documentType = setPickedDocumentType.getDocumentType();
            return (documentType == null || (lVarB = c0Var.b(new er.l() { // from class: lq2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.O(documentType, (c.Initialized) obj2);
                }
            })) == null) ? c0Var.c() : lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lq2.a.SetPickedDocumentType setPickedDocumentType, k10.c0<lq2.c.Initialized> c0Var, tq.e<? super k10.l<? extends lq2.c>> eVar) {
            i iVar = new i(eVar);
            iVar.f119613f = setPickedDocumentType;
            iVar.f119614g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llq2/a$b;", "action", "Llq2/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llq2/a$b;Llq2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<lq2.a.OpenWebsite, lq2.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119616f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lq2.a.OpenWebsite openWebsite = (lq2.a.OpenWebsite) this.f119616f;
            uq.b.e();
            if (this.f119615e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.intentActionManager.a(new kx.a.OpenUrl(openWebsite.getUrl()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lq2.a.OpenWebsite openWebsite, lq2.c.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f119616f = openWebsite;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llq2/a$h;", "<unused var>", "Lk10/c0;", "Llq2/c$b;", "state", "Lk10/l;", "Llq2/c;", "<anonymous>", "(Llq2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<lq2.a.h, k10.c0<lq2.c.Initialized>, tq.e<? super k10.l<? extends lq2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f119619f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f119621a;

            static {
                int[] iArr = new int[kq2.b.values().length];
                try {
                    iArr[kq2.b.PARENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kq2.b.GUARDIAN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f119621a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lq2.c.Initialized O(FieldState fieldState, FieldState fieldState2, FieldState fieldState3, DropDownState dropDownState, lq2.c.Initialized initialized) {
            return lq2.c.Initialized.b(initialized, null, fieldState, fieldState2, fieldState3, dropDownState, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f119619f;
            uq.b.e();
            if (this.f119618e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            PassportChildAgreementParentData parentData = ((lq2.c.Initialized) c0Var.a()).getParentData();
            u uVar = u.this;
            final FieldState idCardSeriesAndNumberFieldState = ((lq2.c.Initialized) c0Var.a()).getIdCardSeriesAndNumberFieldState();
            if (parentData.getIdCardSeriesAndNumber() == null && !idCardSeriesAndNumberFieldState.getValidationState().a()) {
                idCardSeriesAndNumberFieldState = uVar.T9(idCardSeriesAndNumberFieldState.getValue());
            }
            final DropDownState documentTypeDropDownState = ((lq2.c.Initialized) c0Var.a()).getDocumentTypeDropDownState();
            if (parentData.getIdCardSeriesAndNumber() == null && documentTypeDropDownState.getInitialPick() == null) {
                documentTypeDropDownState = new DropDownState(documentTypeDropDownState.getInitialPick(), new hz.b.Invalid(null, 1, null));
            }
            final FieldState idCardNameFieldState = ((lq2.c.Initialized) c0Var.a()).getIdCardNameFieldState();
            if (parentData.getIdCardSeriesAndNumber() == null) {
                Integer initialPick = ((lq2.c.Initialized) c0Var.a()).getDocumentTypeDropDownState().getInitialPick();
                int iOrdinal = nq2.c.OTHER.ordinal();
                if (initialPick != null && initialPick.intValue() == iOrdinal && !idCardNameFieldState.getValidationState().a()) {
                    idCardNameFieldState = uVar.U9(idCardNameFieldState.getValue());
                }
            }
            final FieldState birthPlaceFieldState = ((lq2.c.Initialized) c0Var.a()).getBirthPlaceFieldState();
            if (parentData.getPlaceOfBirth() == null && !birthPlaceFieldState.getValidationState().a()) {
                birthPlaceFieldState = uVar.S9(birthPlaceFieldState.getValue());
            }
            if (!uVar.F9(idCardSeriesAndNumberFieldState) || !uVar.E9(documentTypeDropDownState) || !uVar.F9(idCardNameFieldState) || !uVar.F9(birthPlaceFieldState)) {
                return c0Var.b(new er.l() { // from class: lq2.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.k.O(birthPlaceFieldState, idCardSeriesAndNumberFieldState, idCardNameFieldState, documentTypeDropDownState, (c.Initialized) obj2);
                    }
                });
            }
            kq2.b bVarN0 = uVar.setupData.getContract().n0();
            int i15 = bVarN0 == null ? -1 : a.f119621a[bVarN0.ordinal()];
            if (i15 == -1) {
                uVar.d9(lq2.a.InterfaceC2907a.e.f119503a);
            } else if (i15 != 1) {
                if (i15 != 2) {
                    throw new oq.p();
                }
                uVar.d9(lq2.a.InterfaceC2907a.e.f119503a);
            } else {
                uVar.d9(lq2.a.InterfaceC2907a.c.f119501a);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lq2.a.h hVar, k10.c0<lq2.c.Initialized> c0Var, tq.e<? super k10.l<? extends lq2.c>> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f119619f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, mq2.e eVar, tl0.e eVar2, ac4.a aVar2, ep2.f fVar, ep2.b bVar, ep2.c cVar, kx.d dVar, hb4.d dVar2, ib4.c cVar2, lq2.b bVar2) {
        this.mapper = eVar;
        this.getPassportAgreementParentDataUC = eVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.checkIsPlaceOfBirthCorrectUC = fVar;
        this.checkIfDocumentSeriesAndNumberCorrectUC = bVar;
        this.checkIfIdCardNameCorrectUC = cVar;
        this.intentActionManager = dVar;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar2;
        this.setupData = bVar2;
        lq2.c.a.b bVar3 = lq2.c.a.b.f119517a;
        this.initialState = bVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: lq2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.N9(this.f119561a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), G9(bVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E9(DropDownState dropDownState) {
        return !(dropDownState.getValidationState() instanceof hz.b.Invalid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F9(FieldState fieldState) {
        return !(fieldState.getValidationState() instanceof hz.b.Invalid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lq2.d.a G9(lq2.c state) {
        return this.mapper.b(new mq2.e.Params(state, new er.l() { // from class: lq2.k
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f119553a, (String) obj);
            }
        }, new er.l() { // from class: lq2.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9(this.f119554a, (String) obj);
            }
        }, new er.l() { // from class: lq2.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f119555a, (String) obj);
            }
        }, new er.l() { // from class: lq2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f119556a, (nq2.c) obj);
            }
        }, new er.l() { // from class: lq2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f119557a, (String) obj);
            }
        }, b9(lq2.a.h.f119510a), b9(lq2.a.InterfaceC2907a.C2908a.f119499a), b9(lq2.a.InterfaceC2907a.b.f119500a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(u uVar, String str) {
        uVar.d9(new lq2.a.SetIdCardSeriesAndNumberStateValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(u uVar, String str) {
        uVar.d9(new lq2.a.SetIdCardNameFieldValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(u uVar, String str) {
        uVar.d9(new lq2.a.SetBirthPlaceStateValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, nq2.c cVar) {
        uVar.d9(new lq2.a.InterfaceC2907a.ToDocumentTypePicker(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, String str) {
        uVar.d9(new lq2.a.OpenWebsite(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(lq2.c.a.class), new er.l() { // from class: lq2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.O9(this.f119558a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(lq2.c.a.b.class), new er.l() { // from class: lq2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.P9(this.f119559a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(lq2.c.a.Error.class), new er.l() { // from class: lq2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.Q9((k10.z) obj);
            }
        });
        vVar.c(q0.c(lq2.c.Initialized.class), new er.l() { // from class: lq2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f119560a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        zVar.x(q0.c(lq2.a.InterfaceC2907a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(u uVar, k10.z zVar) {
        zVar.A(uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(k10.z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(lq2.a.g.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(u uVar, k10.z zVar) {
        e eVar = uVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lq2.a.InterfaceC2907a.class), oVar, eVar);
        zVar.v(q0.c(lq2.a.SetIdCardSeriesAndNumberStateValue.class), oVar, new f(null));
        zVar.v(q0.c(lq2.a.SetBirthPlaceStateValue.class), oVar, new g(null));
        zVar.v(q0.c(lq2.a.SetIdCardNameFieldValue.class), oVar, new h(null));
        zVar.v(q0.c(lq2.a.SetPickedDocumentType.class), oVar, new i(null));
        zVar.x(q0.c(lq2.a.OpenWebsite.class), oVar, uVar.new j(null));
        zVar.v(q0.c(lq2.a.h.class), oVar, uVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FieldState S9(String value) {
        return new FieldState(hz.b.INSTANCE.a(this.checkIsPlaceOfBirthCorrectUC.e(new ep2.f.Params(value))), value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FieldState T9(String value) {
        return new FieldState(hz.b.INSTANCE.a(this.checkIfDocumentSeriesAndNumberCorrectUC.f(new ep2.b.Params(value))), value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FieldState U9(String value) {
        return new FieldState(hz.b.INSTANCE.a(this.checkIfIdCardNameCorrectUC.b(new ep2.c.Params(value))), value);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(lq2.a.InterfaceC2907a interfaceC2907a, tq.e<? super i0> eVar) {
        return super.F(interfaceC2907a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public void P5(lq2.b data) {
        if (data instanceof lq2.b.DocumentPicker) {
            d9(new lq2.a.SetPickedDocumentType(((lq2.b.DocumentPicker) data).getPickedDocumentType()));
        } else if (!(data instanceof lq2.b.Initial)) {
            throw new oq.p();
        }
    }

    @Override // zx.b
    public xw.b<lq2.a.InterfaceC2907a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<lq2.c, lq2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<lq2.d.a> getState() {
        return this.state;
    }
}
