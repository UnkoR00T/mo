package ea1;

import cl0.BEPassportChildApplicationParentData;
import fr.q0;
import ga1.FieldState;
import i61.ParentFormData;
import java.util.Iterator;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\u001f*\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020'2\u0006\u00104\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010U\u001a\b\u0012\u0004\u0012\u00020P0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR&\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030V8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u00100\u001a\b\u0012\u0004\u0012\u0002010\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lea1/u;", "Ll00/g;", "Lea1/c;", "Lea1/a;", "Lea1/d;", "", "Lyy/a;", "stateMachineFactory", "Lfa1/e;", "mapper", "Lol0/h;", "getChildPassportApplicationParentDataUC", "Lac4/a;", "callActionWithLoaderUseCase", "Ll61/e;", "checkIsPlaceOfBirthCorrectUC", "Ll61/b;", "checkIfDocumentSeriesAndNumberCorrectUC", "Ll61/c;", "checkIfIdCardNameCorrectUC", "Lkx/d;", "intentActionManager", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lea1/b;", "setupData", "<init>", "(Lyy/a;Lfa1/e;Lol0/h;Lac4/a;Ll61/e;Ll61/b;Ll61/c;Lkx/d;Lhb4/d;Lib4/c;Lea1/b;)V", "Lga1/b;", "", "F9", "(Lga1/b;)Z", "Lv91/a;", "G9", "(Lv91/a;)Z", "Lea1/c$b;", "stateSnapshot", "Loq/i0;", "N9", "(Lea1/c$b;)V", "", "value", "U9", "(Ljava/lang/String;)Lga1/b;", "W9", "V9", "state", "Lea1/d$a;", "H9", "(Lea1/c;)Lea1/d$a;", "data", "O9", "(Lea1/b;)V", "b", "Lfa1/e;", "c", "Lol0/h;", "d", "Lac4/a;", "e", "Ll61/e;", "f", "Ll61/b;", "g", "Ll61/c;", "h", "Lkx/d;", "j", "Lhb4/d;", "k", "Lib4/c;", "l", "Lea1/b;", "Lea1/c$a$b;", "m", "Lea1/c$a$b;", "initialState", "Lxw/b;", "Lea1/a$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<ea1.c, ea1.a> implements ea1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fa1.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ol0.h getChildPassportApplicationParentDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l61.e checkIsPlaceOfBirthCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l61.b checkIfDocumentSeriesAndNumberCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final l61.c checkIfIdCardNameCorrectUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ea1.b setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ea1.c.a.b initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ea1.a.InterfaceC1143a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ea1.c, ea1.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<ea1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ea1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f48929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f48930b;

        /* JADX INFO: renamed from: ea1.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1148a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f48931a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f48932b;

            /* JADX INFO: renamed from: ea1.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1149a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f48933d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f48934e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f48935f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f48937h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f48938j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f48939k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f48940l;

                public C1149a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f48933d = obj;
                    this.f48934e |= PKIFailureInfo.systemUnavail;
                    return C1148a.this.F(null, this);
                }
            }

            public C1148a(mu.h hVar, u uVar) {
                this.f48931a = hVar;
                this.f48932b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1149a c1149a;
                if (eVar instanceof C1149a) {
                    c1149a = (C1149a) eVar;
                    int i15 = c1149a.f48934e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1149a.f48934e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1149a = new C1149a(eVar);
                    }
                } else {
                    c1149a = new C1149a(eVar);
                }
                Object obj2 = c1149a.f48933d;
                Object objE = uq.b.e();
                int i16 = c1149a.f48934e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f48931a;
                    ea1.d.a aVarH9 = this.f48932b.H9((ea1.c) obj);
                    c1149a.f48935f = vq.j.a(obj);
                    c1149a.f48937h = vq.j.a(c1149a);
                    c1149a.f48938j = vq.j.a(obj);
                    c1149a.f48939k = vq.j.a(hVar);
                    c1149a.f48940l = 0;
                    c1149a.f48934e = 1;
                    if (hVar.F(aVarH9, c1149a) == objE) {
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
            this.f48929a = gVar;
            this.f48930b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ea1.d.a> hVar, tq.e eVar) {
            Object objA = this.f48929a.a(new C1148a(hVar, this.f48930b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lea1/a$a;", "action", "Lea1/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lea1/a$a;Lea1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ea1.a.InterfaceC1143a, ea1.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48942f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ea1.a.InterfaceC1143a interfaceC1143a = (ea1.a.InterfaceC1143a) this.f48942f;
            Object objE = uq.b.e();
            int i15 = this.f48941e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f48942f = vq.j.a(interfaceC1143a);
                this.f48941e = 1;
                if (uVar.F(interfaceC1143a, this) == objE) {
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
        public final Object w(ea1.a.InterfaceC1143a interfaceC1143a, ea1.c.a aVar, tq.e<? super i0> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f48942f = interfaceC1143a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lea1/c$a$b;", "state", "Lk10/l;", "Lea1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<ea1.c.a.b>, tq.e<? super k10.l<? extends ea1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48945f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lea1/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ea1.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f48947e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f48948f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<ea1.c.a.b> f48949g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<ea1.c.a.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f48948f = uVar;
                this.f48949g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ea1.c.Initialized Z(ParentFormData parentFormData, ea1.c.a.b bVar) {
                cl0.d next;
                BEPassportChildApplicationParentData parentData = parentFormData.getParentData();
                FieldState fieldState = new FieldState(null, iy.c0.e(parentFormData.getBirthPlaceFieldValue()), 1, null);
                FieldState fieldState2 = new FieldState(null, iy.c0.e(parentFormData.getIdCardSeriesAndNumberFieldValue()), 1, null);
                FieldState fieldState3 = new FieldState(null, iy.c0.e(parentFormData.getIdCardNameFieldValue()), 1, null);
                Iterator<cl0.d> it = cl0.d.e().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    cl0.d dVar = next;
                    cl0.d documentType = parentFormData.getDocumentType();
                    if (documentType != null && dVar.ordinal() == documentType.ordinal()) {
                        break;
                    }
                }
                cl0.d dVar2 = next;
                return new ea1.c.Initialized(parentData, fieldState, fieldState2, fieldState3, new DropDownState(dVar2 != null ? Integer.valueOf(dVar2.ordinal()) : null, null, 2, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ea1.c.a.Error a0(final u uVar, dx.b bVar, ea1.c.a.b bVar2) {
                return new ea1.c.a.Error(uVar.errorVMSFactory.a(uVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ea1.y
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.c.a.b0(uVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 b0(u uVar, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Secondary)) {
                    uVar.d9(ea1.a.InterfaceC1143a.C1144a.f48852a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    uVar.d9(ea1.a.g.f48862a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ea1.c.Initialized c0(BEPassportChildApplicationParentData bEPassportChildApplicationParentData, ea1.c.a.b bVar) {
                return new ea1.c.Initialized(bEPassportChildApplicationParentData, null, null, null, null, 30, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objD;
                Object objE = uq.b.e();
                int i15 = this.f48947e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    final ParentFormData parentFormDataQ6 = this.f48948f.setupData.getContract().Q6();
                    if (parentFormDataQ6 != null && (objD = this.f48949g.d(new er.l() { // from class: ea1.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.Z(parentFormDataQ6, (c.a.b) obj2);
                        }
                    })) != null) {
                        return objD;
                    }
                    ol0.h hVar = this.f48948f.getChildPassportApplicationParentDataUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f48947e = 1;
                    obj = hVar.c(c1792a, this);
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
                k10.c0<ea1.c.a.b> c0Var = this.f48949g;
                final u uVar = this.f48948f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ea1.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.a0(uVar, bVar, (c.a.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEPassportChildApplicationParentData bEPassportChildApplicationParentData = (BEPassportChildApplicationParentData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ea1.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.c.a.c0(bEPassportChildApplicationParentData, (c.a.b) obj2);
                    }
                });
            }

            public final tq.e<i0> X(tq.e<?> eVar) {
                return new a(this.f48948f, this.f48949g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ea1.c>> eVar) {
                return ((a) X(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f48945f;
            Object objE = uq.b.e();
            int i15 = this.f48944e;
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
            this.f48945f = vq.j.a(c0Var);
            this.f48944e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ea1.c.a.b> c0Var, tq.e<? super k10.l<? extends ea1.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = u.this.new c(eVar);
            cVar.f48945f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lea1/a$g;", "<unused var>", "Lk10/c0;", "Lea1/c$a$a;", "state", "Lk10/l;", "Lea1/c;", "<anonymous>", "(Lea1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ea1.a.g, k10.c0<ea1.c.a.Error>, tq.e<? super k10.l<? extends ea1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48951f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ea1.c.a.b O(ea1.c.a.Error error) {
            return ea1.c.a.b.f48870a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f48951f;
            uq.b.e();
            if (this.f48950e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ea1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.d.O((c.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ea1.a.g gVar, k10.c0<ea1.c.a.Error> c0Var, tq.e<? super k10.l<? extends ea1.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f48951f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lea1/a$a;", "action", "Lea1/c$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lea1/a$a;Lea1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ea1.a.InterfaceC1143a, ea1.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48954g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ea1.a.InterfaceC1143a interfaceC1143a = (ea1.a.InterfaceC1143a) this.f48953f;
            ea1.c.Initialized initialized = (ea1.c.Initialized) this.f48954g;
            Object objE = uq.b.e();
            int i15 = this.f48952e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(interfaceC1143a, ea1.a.InterfaceC1143a.C1144a.f48852a) || fr.t.c(interfaceC1143a, ea1.a.InterfaceC1143a.c.f48854a)) {
                    u.this.N9(initialized);
                } else {
                    ea1.a.InterfaceC1143a.b bVar = ea1.a.InterfaceC1143a.b.f48853a;
                    if (fr.t.c(interfaceC1143a, bVar) || fr.t.c(interfaceC1143a, ea1.a.InterfaceC1143a.e.f48856a)) {
                        u.this.N9(initialized);
                    } else if (!(interfaceC1143a instanceof ea1.a.InterfaceC1143a.ToDocumentTypePicker) && !fr.t.c(interfaceC1143a, bVar)) {
                        throw new oq.p();
                    }
                }
                u uVar = u.this;
                this.f48953f = vq.j.a(interfaceC1143a);
                this.f48954g = vq.j.a(initialized);
                this.f48952e = 1;
                if (uVar.F(interfaceC1143a, this) == objE) {
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
        public final Object w(ea1.a.InterfaceC1143a interfaceC1143a, ea1.c.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f48953f = interfaceC1143a;
            eVar2.f48954g = initialized;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lea1/a$e;", "action", "Lk10/c0;", "Lea1/c$b;", "state", "Lk10/l;", "Lea1/c;", "<anonymous>", "(Lea1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ea1.a.SetIdCardSeriesAndNumberStateValue, k10.c0<ea1.c.Initialized>, tq.e<? super k10.l<? extends ea1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48958g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ea1.c.Initialized O(ea1.a.SetIdCardSeriesAndNumberStateValue setIdCardSeriesAndNumberStateValue, ea1.c.Initialized initialized) {
            return ea1.c.Initialized.b(initialized, null, null, new FieldState(null, setIdCardSeriesAndNumberStateValue.getValue(), 1, null), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ea1.a.SetIdCardSeriesAndNumberStateValue setIdCardSeriesAndNumberStateValue = (ea1.a.SetIdCardSeriesAndNumberStateValue) this.f48957f;
            k10.c0 c0Var = (k10.c0) this.f48958g;
            uq.b.e();
            if (this.f48956e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ea1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(setIdCardSeriesAndNumberStateValue, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ea1.a.SetIdCardSeriesAndNumberStateValue setIdCardSeriesAndNumberStateValue, k10.c0<ea1.c.Initialized> c0Var, tq.e<? super k10.l<? extends ea1.c>> eVar) {
            f fVar = new f(eVar);
            fVar.f48957f = setIdCardSeriesAndNumberStateValue;
            fVar.f48958g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lea1/a$c;", "action", "Lk10/c0;", "Lea1/c$b;", "state", "Lk10/l;", "Lea1/c;", "<anonymous>", "(Lea1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ea1.a.SetBirthPlaceStateValue, k10.c0<ea1.c.Initialized>, tq.e<? super k10.l<? extends ea1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48961g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ea1.c.Initialized O(ea1.a.SetBirthPlaceStateValue setBirthPlaceStateValue, ea1.c.Initialized initialized) {
            return ea1.c.Initialized.b(initialized, null, new FieldState(null, setBirthPlaceStateValue.getValue(), 1, null), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ea1.a.SetBirthPlaceStateValue setBirthPlaceStateValue = (ea1.a.SetBirthPlaceStateValue) this.f48960f;
            k10.c0 c0Var = (k10.c0) this.f48961g;
            uq.b.e();
            if (this.f48959e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ea1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O(setBirthPlaceStateValue, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ea1.a.SetBirthPlaceStateValue setBirthPlaceStateValue, k10.c0<ea1.c.Initialized> c0Var, tq.e<? super k10.l<? extends ea1.c>> eVar) {
            g gVar = new g(eVar);
            gVar.f48960f = setBirthPlaceStateValue;
            gVar.f48961g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lea1/a$d;", "action", "Lk10/c0;", "Lea1/c$b;", "state", "Lk10/l;", "Lea1/c;", "<anonymous>", "(Lea1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ea1.a.SetIdCardNameFieldValue, k10.c0<ea1.c.Initialized>, tq.e<? super k10.l<? extends ea1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48963f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48964g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ea1.c.Initialized O(ea1.a.SetIdCardNameFieldValue setIdCardNameFieldValue, ea1.c.Initialized initialized) {
            return ea1.c.Initialized.b(initialized, null, null, null, new FieldState(null, setIdCardNameFieldValue.getValue(), 1, null), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ea1.a.SetIdCardNameFieldValue setIdCardNameFieldValue = (ea1.a.SetIdCardNameFieldValue) this.f48963f;
            k10.c0 c0Var = (k10.c0) this.f48964g;
            uq.b.e();
            if (this.f48962e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ea1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(setIdCardNameFieldValue, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ea1.a.SetIdCardNameFieldValue setIdCardNameFieldValue, k10.c0<ea1.c.Initialized> c0Var, tq.e<? super k10.l<? extends ea1.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f48963f = setIdCardNameFieldValue;
            hVar.f48964g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lea1/a$f;", "action", "Lk10/c0;", "Lea1/c$b;", "state", "Lk10/l;", "Lea1/c;", "<anonymous>", "(Lea1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ea1.a.SetPickedDocumentType, k10.c0<ea1.c.Initialized>, tq.e<? super k10.l<? extends ea1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48967g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ea1.c.Initialized O(cl0.d dVar, ea1.c.Initialized initialized) {
            return ea1.c.Initialized.b(initialized, null, null, null, null, new DropDownState(Integer.valueOf(dVar.ordinal()), null, 2, null), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarB;
            ea1.a.SetPickedDocumentType setPickedDocumentType = (ea1.a.SetPickedDocumentType) this.f48966f;
            k10.c0 c0Var = (k10.c0) this.f48967g;
            uq.b.e();
            if (this.f48965e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final cl0.d documentType = setPickedDocumentType.getDocumentType();
            return (documentType == null || (lVarB = c0Var.b(new er.l() { // from class: ea1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.O(documentType, (c.Initialized) obj2);
                }
            })) == null) ? c0Var.c() : lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ea1.a.SetPickedDocumentType setPickedDocumentType, k10.c0<ea1.c.Initialized> c0Var, tq.e<? super k10.l<? extends ea1.c>> eVar) {
            i iVar = new i(eVar);
            iVar.f48966f = setPickedDocumentType;
            iVar.f48967g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lea1/a$b;", "action", "Lea1/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lea1/a$b;Lea1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ea1.a.OpenWebsite, ea1.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48969f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ea1.a.OpenWebsite openWebsite = (ea1.a.OpenWebsite) this.f48969f;
            uq.b.e();
            if (this.f48968e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.intentActionManager.a(new kx.a.OpenUrl(openWebsite.getUrl()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ea1.a.OpenWebsite openWebsite, ea1.c.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f48969f = openWebsite;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lea1/a$h;", "<unused var>", "Lk10/c0;", "Lea1/c$b;", "state", "Lk10/l;", "Lea1/c;", "<anonymous>", "(Lea1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ea1.a.h, k10.c0<ea1.c.Initialized>, tq.e<? super k10.l<? extends ea1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48972f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48974a;

            static {
                int[] iArr = new int[i61.t.values().length];
                try {
                    iArr[i61.t.PARENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i61.t.GUARDIAN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f48974a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ea1.c.Initialized O(FieldState fieldState, FieldState fieldState2, FieldState fieldState3, DropDownState dropDownState, ea1.c.Initialized initialized) {
            return ea1.c.Initialized.b(initialized, null, fieldState, fieldState2, fieldState3, dropDownState, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f48972f;
            uq.b.e();
            if (this.f48971e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            BEPassportChildApplicationParentData parentData = ((ea1.c.Initialized) c0Var.a()).getParentData();
            u uVar = u.this;
            final FieldState idCardSeriesAndNumberFieldState = ((ea1.c.Initialized) c0Var.a()).getIdCardSeriesAndNumberFieldState();
            if (parentData.getIdCardSeriesAndNumber() == null && !idCardSeriesAndNumberFieldState.getValidationState().a()) {
                idCardSeriesAndNumberFieldState = uVar.V9(idCardSeriesAndNumberFieldState.getValue());
            }
            final DropDownState documentTypeDropDownState = ((ea1.c.Initialized) c0Var.a()).getDocumentTypeDropDownState();
            if (parentData.getIdCardSeriesAndNumber() == null && documentTypeDropDownState.getInitialPick() == null) {
                documentTypeDropDownState = new DropDownState(documentTypeDropDownState.getInitialPick(), new hz.b.Invalid(null, 1, null));
            }
            final FieldState idCardNameFieldState = ((ea1.c.Initialized) c0Var.a()).getIdCardNameFieldState();
            if (parentData.getIdCardSeriesAndNumber() == null) {
                Integer initialPick = ((ea1.c.Initialized) c0Var.a()).getDocumentTypeDropDownState().getInitialPick();
                int iOrdinal = cl0.d.OTHER.ordinal();
                if (initialPick != null && initialPick.intValue() == iOrdinal && !idCardNameFieldState.getValidationState().a()) {
                    idCardNameFieldState = uVar.W9(idCardNameFieldState.getValue());
                }
            }
            final FieldState birthPlaceFieldState = ((ea1.c.Initialized) c0Var.a()).getBirthPlaceFieldState();
            if (parentData.getPlaceOfBirth() == null && !birthPlaceFieldState.getValidationState().a()) {
                birthPlaceFieldState = uVar.U9(birthPlaceFieldState.getValue());
            }
            if (!uVar.F9(idCardSeriesAndNumberFieldState) || !uVar.G9(documentTypeDropDownState) || !uVar.F9(idCardNameFieldState) || !uVar.F9(birthPlaceFieldState)) {
                return c0Var.b(new er.l() { // from class: ea1.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.k.O(birthPlaceFieldState, idCardSeriesAndNumberFieldState, idCardNameFieldState, documentTypeDropDownState, (c.Initialized) obj2);
                    }
                });
            }
            i61.t tVarN0 = uVar.setupData.getContract().n0();
            int i15 = tVarN0 == null ? -1 : a.f48974a[tVarN0.ordinal()];
            if (i15 == -1) {
                uVar.d9(ea1.a.InterfaceC1143a.e.f48856a);
            } else if (i15 != 1) {
                if (i15 != 2) {
                    throw new oq.p();
                }
                uVar.d9(ea1.a.InterfaceC1143a.e.f48856a);
            } else {
                uVar.d9(ea1.a.InterfaceC1143a.c.f48854a);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ea1.a.h hVar, k10.c0<ea1.c.Initialized> c0Var, tq.e<? super k10.l<? extends ea1.c>> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f48972f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, fa1.e eVar, ol0.h hVar, ac4.a aVar2, l61.e eVar2, l61.b bVar, l61.c cVar, kx.d dVar, hb4.d dVar2, ib4.c cVar2, ea1.b bVar2) {
        this.mapper = eVar;
        this.getChildPassportApplicationParentDataUC = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.checkIsPlaceOfBirthCorrectUC = eVar2;
        this.checkIfDocumentSeriesAndNumberCorrectUC = bVar;
        this.checkIfIdCardNameCorrectUC = cVar;
        this.intentActionManager = dVar;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar2;
        this.setupData = bVar2;
        ea1.c.a.b bVar3 = ea1.c.a.b.f48870a;
        this.initialState = bVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: ea1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.P9(this.f48914a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), H9(bVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F9(FieldState fieldState) {
        return !(fieldState.getValidationState() instanceof hz.b.Invalid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G9(DropDownState dropDownState) {
        return !(dropDownState.getValidationState() instanceof hz.b.Invalid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ea1.d.a H9(ea1.c state) {
        return this.mapper.b(new fa1.e.Params(state, new er.l() { // from class: ea1.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9(this.f48909a, (String) obj);
            }
        }, new er.l() { // from class: ea1.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f48910a, (String) obj);
            }
        }, new er.l() { // from class: ea1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f48911a, (String) obj);
            }
        }, new er.l() { // from class: ea1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f48912a, (cl0.d) obj);
            }
        }, new er.l() { // from class: ea1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9(this.f48913a, (String) obj);
            }
        }, b9(ea1.a.h.f48863a), b9(ea1.a.InterfaceC1143a.C1144a.f48852a), b9(ea1.a.InterfaceC1143a.b.f48853a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(u uVar, String str) {
        uVar.d9(new ea1.a.SetIdCardSeriesAndNumberStateValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(u uVar, String str) {
        uVar.d9(new ea1.a.SetIdCardNameFieldValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, String str) {
        uVar.d9(new ea1.a.SetBirthPlaceStateValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, cl0.d dVar) {
        uVar.d9(new ea1.a.InterfaceC1143a.ToDocumentTypePicker(dVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(u uVar, String str) {
        uVar.d9(new ea1.a.OpenWebsite(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N9(ea1.c.Initialized stateSnapshot) {
        BEPassportChildApplicationParentData parentData = stateSnapshot.getParentData();
        for (cl0.d dVar : cl0.d.e()) {
            int iOrdinal = dVar.ordinal();
            Integer initialPick = stateSnapshot.getDocumentTypeDropDownState().getInitialPick();
            if (initialPick != null && iOrdinal == initialPick.intValue()) {
                this.setupData.getContract().G4(new ParentFormData(parentData, iy.c0.g(stateSnapshot.getBirthPlaceFieldState().getValue()), iy.c0.g(stateSnapshot.getIdCardSeriesAndNumberFieldState().getValue()), iy.c0.g(stateSnapshot.getIdCardNameFieldState().getValue()), dVar));
            }
        }
        dVar = null;
        this.setupData.getContract().G4(new ParentFormData(parentData, iy.c0.g(stateSnapshot.getBirthPlaceFieldState().getValue()), iy.c0.g(stateSnapshot.getIdCardSeriesAndNumberFieldState().getValue()), iy.c0.g(stateSnapshot.getIdCardNameFieldState().getValue()), dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(ea1.c.a.class), new er.l() { // from class: ea1.k
            @Override // er.l
            public final Object b(Object obj) {
                return u.Q9(this.f48906a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ea1.c.a.b.class), new er.l() { // from class: ea1.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f48907a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ea1.c.a.Error.class), new er.l() { // from class: ea1.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.S9((k10.z) obj);
            }
        });
        vVar.c(q0.c(ea1.c.Initialized.class), new er.l() { // from class: ea1.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.T9(this.f48908a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        zVar.x(q0.c(ea1.a.InterfaceC1143a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(u uVar, k10.z zVar) {
        zVar.A(uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(k10.z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(ea1.a.g.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(u uVar, k10.z zVar) {
        e eVar = uVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ea1.a.InterfaceC1143a.class), oVar, eVar);
        zVar.v(q0.c(ea1.a.SetIdCardSeriesAndNumberStateValue.class), oVar, new f(null));
        zVar.v(q0.c(ea1.a.SetBirthPlaceStateValue.class), oVar, new g(null));
        zVar.v(q0.c(ea1.a.SetIdCardNameFieldValue.class), oVar, new h(null));
        zVar.v(q0.c(ea1.a.SetPickedDocumentType.class), oVar, new i(null));
        zVar.x(q0.c(ea1.a.OpenWebsite.class), oVar, uVar.new j(null));
        zVar.v(q0.c(ea1.a.h.class), oVar, uVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FieldState U9(String value) {
        return new FieldState(hz.b.INSTANCE.a(this.checkIsPlaceOfBirthCorrectUC.b(new l61.e.Params(value))), value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FieldState V9(String value) {
        return new FieldState(hz.b.INSTANCE.a(this.checkIfDocumentSeriesAndNumberCorrectUC.f(new l61.b.Params(value))), value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FieldState W9(String value) {
        return new FieldState(hz.b.INSTANCE.a(this.checkIfIdCardNameCorrectUC.b(new l61.c.Params(value))), value);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ea1.a.InterfaceC1143a interfaceC1143a, tq.e<? super i0> eVar) {
        return super.F(interfaceC1143a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: O9, reason: merged with bridge method [inline-methods] */
    public void P5(ea1.b data) {
        if (data instanceof ea1.b.DocumentPicker) {
            d9(new ea1.a.SetPickedDocumentType(((ea1.b.DocumentPicker) data).getPickedDocumentType()));
        } else if (!(data instanceof ea1.b.Initial)) {
            throw new oq.p();
        }
    }

    @Override // zx.b
    public xw.b<ea1.a.InterfaceC1143a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ea1.c, ea1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ea1.d.a> getState() {
        return this.state;
    }
}
