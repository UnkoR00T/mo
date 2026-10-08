package vf3;

import android.text.TextUtils;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tv0.BEContactDetailsAddress;
import tv0.BEPersonalData;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import xi0.ContactDetails;
import xw.PhoneNumber;
import yd3.PersonalAddressContainer;
import yd3.PersonalDataContainer;
import yf3.ContactDetailsFields;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0018\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,J\u0018\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b/\u00100J\u0014\u00102\u001a\u000201*\u000201H\u0082@¢\u0006\u0004\b2\u00103J$\u00107\u001a\u00020*2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020504H\u0082@¢\u0006\u0004\b7\u00108J$\u0010:\u001a\u00020*2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020904H\u0082@¢\u0006\u0004\b:\u00108J \u0010>\u001a\u00020*2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b>\u0010?J\u0013\u0010A\u001a\u00020@*\u00020\u0002H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR&\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030i8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010u\u001a\b\u0012\u0004\u0012\u00020p0o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR \u0010{\u001a\b\u0012\u0004\u0012\u00020@0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010z¨\u0006|"}, d2 = {"Lvf3/h0;", "Ll00/g;", "Lvf3/c;", "Lvf3/a;", "Lvf3/d;", "", "Lyy/a;", "stateMachineFactory", "Lxf3/i;", "mapper", "Lae3/c0;", "validPersonalDataUseCase", "Lee3/c;", "startAwaitReadyToSignUC", "Lce3/a;", "downloadContactDetailsDataMonitorUC", "Lui0/a;", "contactDetailsDownloadManager", "Lae3/u;", "sendNewStatementUC", "Lae3/r;", "saveNewCollisionDataUC", "Lib4/c;", "domainErrorMapper", "Lde3/d;", "isWrongStateErrorUC", "Lde3/c;", "isSameVehiclesErrorUC", "Lac4/a;", "callActionWithLoaderUC", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/a;", "checkEmailCorrectUC", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "Lwf3/a;", "contract", "<init>", "(Lyy/a;Lxf3/i;Lae3/c0;Lee3/c;Lce3/a;Lui0/a;Lae3/u;Lae3/r;Lib4/c;Lde3/d;Lde3/c;Lac4/a;Lj14/n;Lj14/a;Lj14/o;Lwf3/a;)V", "Lyd3/e;", "scope", "Loq/i0;", "ba", "(Lyd3/e;Ltq/e;)Ljava/lang/Object;", "Lxi0/e;", "rdkContactDetails", "da", "(Lxi0/e;Ltq/e;)Ljava/lang/Object;", "Lvf3/c$b;", "O9", "(Lvf3/c$b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ltv0/f;", "update", "oa", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltv0/d;", "ma", "Ldx/b;", "domainError", "retryAction", "Q9", "(Ldx/b;Lvf3/a;Ltq/e;)Ljava/lang/Object;", "Lvf3/d$a;", "S9", "(Lvf3/c;)Lvf3/d$a;", "b", "Lxf3/i;", "c", "Lae3/c0;", "d", "Lee3/c;", "e", "Lce3/a;", "f", "Lui0/a;", "g", "Lae3/u;", "h", "Lae3/r;", "j", "Lib4/c;", "k", "Lde3/d;", "l", "Lde3/c;", "m", "Lac4/a;", "n", "Lj14/n;", "p", "Lj14/a;", "q", "Lj14/o;", "r", "Lwf3/a;", "Lvf3/c$a;", "s", "Lvf3/c$a;", "initialState", "Lsu/a;", "t", "Lsu/a;", "updateNewCollisionDataMutex", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lvf3/a$b;", "w", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<vf3.c, vf3.a> implements vf3.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xf3.i mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae3.c0 validPersonalDataUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ee3.c startAwaitReadyToSignUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ce3.a downloadContactDetailsDataMonitorUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ui0.a contactDetailsDownloadManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ae3.u sendNewStatementUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ae3.r saveNewCollisionDataUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final de3.c isSameVehiclesErrorUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final j14.o checkPolishPostalCodeCorrectUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final wf3.a contract;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final vf3.c.a initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final su.a updateNewCollisionDataMutex;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<vf3.c, vf3.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vf3.a.b> navAction;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<vf3.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f206540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f206542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f206543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f206544h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f206545j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f206546k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f206547l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f206548m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f206549n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f206550p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f206551q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f206552r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f206554t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f206552r = obj;
            this.f206554t |= PKIFailureInfo.systemUnavail;
            return h0.this.O9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<vf3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f206555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f206556b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f206557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f206558b;

            /* JADX INFO: renamed from: vf3.h0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5403a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f206559d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f206560e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f206561f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f206563h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f206564j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f206565k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f206566l;

                public C5403a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f206559d = obj;
                    this.f206560e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f206557a = hVar;
                this.f206558b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5403a c5403a;
                if (eVar instanceof C5403a) {
                    c5403a = (C5403a) eVar;
                    int i15 = c5403a.f206560e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5403a.f206560e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5403a = new C5403a(eVar);
                    }
                } else {
                    c5403a = new C5403a(eVar);
                }
                Object obj2 = c5403a.f206559d;
                Object objE = uq.b.e();
                int i16 = c5403a.f206560e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f206557a;
                    vf3.d.a aVarS9 = this.f206558b.S9((vf3.c) obj);
                    c5403a.f206561f = vq.j.a(obj);
                    c5403a.f206563h = vq.j.a(c5403a);
                    c5403a.f206564j = vq.j.a(obj);
                    c5403a.f206565k = vq.j.a(hVar);
                    c5403a.f206566l = 0;
                    c5403a.f206560e = 1;
                    if (hVar.F(aVarS9, c5403a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, h0 h0Var) {
            this.f206555a = gVar;
            this.f206556b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super vf3.d.a> hVar, tq.e eVar) {
            Object objA = this.f206555a.a(new a(hVar, this.f206556b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvf3/a$b;", "action", "Lvf3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvf3/a$b;Lvf3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<vf3.a.b, vf3.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206568f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vf3.a.b bVar = (vf3.a.b) this.f206568f;
            Object objE = uq.b.e();
            int i15 = this.f206567e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                this.f206568f = vq.j.a(bVar);
                this.f206567e = 1;
                if (h0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.b bVar, vf3.c cVar, tq.e<? super oq.i0> eVar) {
            c cVar2 = h0.this.new c(eVar);
            cVar2.f206568f = bVar;
            return cVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv0/f;", "personalData", "Lvf3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ltv0/f;Lvf3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<BEPersonalData, vf3.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206571f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BEPersonalData bEPersonalData = (BEPersonalData) this.f206571f;
            uq.b.e();
            if (this.f206570e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(new vf3.a.OnUpdate(bEPersonalData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(BEPersonalData bEPersonalData, vf3.c cVar, tq.e<? super oq.i0> eVar) {
            d dVar = h0.this.new d(eVar);
            dVar.f206571f = bEPersonalData;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvf3/c$a;", "it", "Loq/i0;", "<anonymous>", "(Lvf3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<vf3.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206573e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f206573e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(new vf3.a.OnUpdate(h0.this.contract.g6()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(vf3.c.a aVar, tq.e<? super oq.i0> eVar) {
            return ((e) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return h0.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$n;", "action", "Lk10/c0;", "Lvf3/c$a;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<vf3.a.OnUpdate, k10.c0<vf3.c.a>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206577g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEPersonalData V(BEPersonalData bEPersonalData) {
            return BEPersonalData.b(bEPersonalData, null, null, null, null, null, true, 31, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(vf3.a.OnUpdate onUpdate, FormData formData, vf3.c.a aVar) {
            boolean externalDataFetched = onUpdate.getPersonalData().getExternalDataFetched();
            if (!externalDataFetched) {
                return new vf3.c.b.Loading(formData);
            }
            if (externalDataFetched) {
                return new vf3.c.b.NotLoading(formData);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnUpdate onUpdate = (vf3.a.OnUpdate) this.f206576f;
            k10.c0 c0Var = (k10.c0) this.f206577g;
            Object objE = uq.b.e();
            int i15 = this.f206575e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!onUpdate.getPersonalData().getExternalDataFetched()) {
                    h0 h0Var = h0.this;
                    er.l lVar = new er.l() { // from class: vf3.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.f.V((BEPersonalData) obj2);
                        }
                    };
                    this.f206576f = onUpdate;
                    this.f206577g = c0Var;
                    this.f206575e = 1;
                    if (h0Var.oa(lVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            ContactDetailsFields.InterfaceC6083a.Phone phone = new ContactDetailsFields.InterfaceC6083a.Phone(ContactDetailsFields.b.PHONE, null, null, onUpdate.getPersonalData().getPhoneNumber(), 6, null);
            ContactDetailsFields.InterfaceC6083a.Input input = new ContactDetailsFields.InterfaceC6083a.Input(ContactDetailsFields.b.EMAIL, null, onUpdate.getPersonalData().getEmail(), 2, null);
            ContactDetailsFields.InterfaceC6083a.Input input2 = new ContactDetailsFields.InterfaceC6083a.Input(ContactDetailsFields.b.POST_CODE, null, onUpdate.getPersonalData().getAddress().getPostcode(), 2, null);
            ContactDetailsFields.InterfaceC6083a.Input input3 = new ContactDetailsFields.InterfaceC6083a.Input(ContactDetailsFields.b.CITY, null, onUpdate.getPersonalData().getAddress().getCity(), 2, null);
            ContactDetailsFields.InterfaceC6083a.Input input4 = new ContactDetailsFields.InterfaceC6083a.Input(ContactDetailsFields.b.STREET, null, onUpdate.getPersonalData().getAddress().getStreet(), 2, null);
            ContactDetailsFields.InterfaceC6083a.Input input5 = new ContactDetailsFields.InterfaceC6083a.Input(ContactDetailsFields.b.BUILDING_NUMBER, null, onUpdate.getPersonalData().getAddress().getBuildingNumber(), 2, null);
            ContactDetailsFields.b bVar = ContactDetailsFields.b.FLAT_NUMBER;
            iy.b0 flatNumber = onUpdate.getPersonalData().getAddress().getFlatNumber();
            if (flatNumber == null) {
                flatNumber = iy.b0.INSTANCE.a();
            }
            final FormData formData = new FormData(new ContactDetailsFields(phone, input, input2, input3, input4, input5, new ContactDetailsFields.InterfaceC6083a.Input(bVar, null, flatNumber, 2, null)), null, 2, null);
            return c0Var.d(new er.l() { // from class: vf3.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.f.X(onUpdate, formData, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnUpdate onUpdate, k10.c0<vf3.c.a> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            f fVar = h0.this.new f(eVar);
            fVar.f206576f = onUpdate;
            fVar.f206577g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$n;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<vf3.a.OnUpdate, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206581g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEPersonalData V(BEPersonalData bEPersonalData) {
            return BEPersonalData.b(bEPersonalData, null, null, null, null, null, true, 31, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(vf3.a.OnUpdate onUpdate, boolean z15, FormData formData, vf3.c.b bVar) {
            boolean z16 = !onUpdate.getPersonalData().getExternalDataFetched() || z15;
            if (z16) {
                return new vf3.c.b.Loading(formData);
            }
            if (z16) {
                throw new oq.p();
            }
            return new vf3.c.b.NotLoading(formData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnUpdate onUpdate = (vf3.a.OnUpdate) this.f206580f;
            k10.c0 c0Var = (k10.c0) this.f206581g;
            Object objE = uq.b.e();
            int i15 = this.f206579e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!onUpdate.getPersonalData().getExternalDataFetched()) {
                    h0 h0Var = h0.this;
                    er.l lVar = new er.l() { // from class: vf3.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.g.V((BEPersonalData) obj2);
                        }
                    };
                    this.f206580f = onUpdate;
                    this.f206581g = c0Var;
                    this.f206579e = 1;
                    if (h0Var.oa(lVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean z15 = c0Var.a() instanceof vf3.c.b.Loading;
            FormData formData = ((vf3.c.b) c0Var.a()).getFormData();
            ContactDetailsFields contactDetailsFields = ((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields();
            ContactDetailsFields.InterfaceC6083a.Phone phoneC = ContactDetailsFields.InterfaceC6083a.Phone.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getPhoneField(), null, null, null, onUpdate.getPersonalData().getPhoneNumber(), 7, null);
            ContactDetailsFields.InterfaceC6083a.Input inputC = ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getEmailField(), null, null, onUpdate.getPersonalData().getEmail(), 3, null);
            ContactDetailsFields.InterfaceC6083a.Input inputC2 = ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getPostCodeField(), null, null, onUpdate.getPersonalData().getAddress().getPostcode(), 3, null);
            ContactDetailsFields.InterfaceC6083a.Input inputC3 = ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getCityField(), null, null, onUpdate.getPersonalData().getAddress().getCity(), 3, null);
            ContactDetailsFields.InterfaceC6083a.Input inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getStreetField(), null, null, onUpdate.getPersonalData().getAddress().getStreet(), 3, null);
            ContactDetailsFields.InterfaceC6083a.Input inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getBuildingNumberField(), null, null, onUpdate.getPersonalData().getAddress().getBuildingNumber(), 3, null);
            ContactDetailsFields.InterfaceC6083a.Input flatNumberField = ((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getFlatNumberField();
            iy.b0 flatNumber = onUpdate.getPersonalData().getAddress().getFlatNumber();
            if (flatNumber == null) {
                flatNumber = iy.b0.INSTANCE.a();
            }
            final FormData formDataB = FormData.b(formData, contactDetailsFields.a(phoneC, inputC, inputC2, inputC3, inputC4, inputC5, ContactDetailsFields.InterfaceC6083a.Input.c(flatNumberField, null, null, flatNumber, 3, null)), null, 2, null);
            return c0Var.d(new er.l() { // from class: vf3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.g.X(onUpdate, z15, formDataB, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnUpdate onUpdate, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            g gVar = h0.this.new g(eVar);
            gVar.f206580f = onUpdate;
            gVar.f206581g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lce3/a$a;", "event", "Lk10/c0;", "Lvf3/c$b$a;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lce3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ce3.a.InterfaceC0680a, k10.c0<vf3.c.b.Loading>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206585g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b.NotLoading O(vf3.c.b.Loading loading) {
            return new vf3.c.b.NotLoading(loading.getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ce3.a.InterfaceC0680a interfaceC0680a = (ce3.a.InterfaceC0680a) this.f206584f;
            k10.c0 c0Var = (k10.c0) this.f206585g;
            uq.b.e();
            if (this.f206583e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            px.f.f163100a.b("Collected event: " + interfaceC0680a, px.c.a(h0.this));
            if (interfaceC0680a instanceof ce3.a.InterfaceC0680a.MIdCardData) {
                h0.this.d9(new vf3.a.OnMIdCardDataLoaded(((ce3.a.InterfaceC0680a.MIdCardData) interfaceC0680a).getScope()));
                return c0Var.c();
            }
            if (interfaceC0680a instanceof ce3.a.InterfaceC0680a.RdkData) {
                h0.this.d9(new vf3.a.OnRdkDataDownloaded(((ce3.a.InterfaceC0680a.RdkData) interfaceC0680a).getRdkContactDetails()));
                return c0Var.c();
            }
            if (fr.t.c(interfaceC0680a, ce3.a.InterfaceC0680a.C0681a.f25553a)) {
                return c0Var.d(new er.l() { // from class: vf3.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.h.O((c.b.Loading) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ce3.a.InterfaceC0680a interfaceC0680a, k10.c0<vf3.c.b.Loading> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            h hVar = h0.this.new h(eVar);
            hVar.f206584f = interfaceC0680a;
            hVar.f206585g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvf3/a;", "action", "Lvf3/c$b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvf3/a;Lvf3/c$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<vf3.a, vf3.c.b.Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206588f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vf3.a aVar = (vf3.a) this.f206588f;
            Object objE = uq.b.e();
            int i15 = this.f206587e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(aVar, vf3.a.o.f206473a) || fr.t.c(aVar, vf3.a.C5398a.f206445a) || (aVar instanceof vf3.a.OnBuildingNumberChanged) || (aVar instanceof vf3.a.OnCityChanged) || (aVar instanceof vf3.a.OnEmailChanged) || (aVar instanceof vf3.a.OnFlatNumberChanged) || (aVar instanceof vf3.a.OnPhoneNumberChanged) || (aVar instanceof vf3.a.OnPhonePrefixChanged) || (aVar instanceof vf3.a.OnPostCodeChanged) || (aVar instanceof vf3.a.OnStreetChanged) || (aVar instanceof vf3.a.b) || fr.t.c(aVar, vf3.a.j.f206466a)) {
                    px.f.f163100a.b("Cancelling download by " + aVar, px.c.a(h0.this));
                    ui0.a aVar2 = h0.this.contactDetailsDownloadManager;
                    this.f206588f = vq.j.a(aVar);
                    this.f206587e = 1;
                    if (aVar2.a(this) == objE) {
                        return objE;
                    }
                } else if (!(aVar instanceof vf3.a.OnUpdate) && !(aVar instanceof vf3.a.OnMIdCardDataLoaded) && !(aVar instanceof vf3.a.OnRdkDataDownloaded)) {
                    throw new oq.p();
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a aVar, vf3.c.b.Loading loading, tq.e<? super oq.i0> eVar) {
            i iVar = h0.this.new i(eVar);
            iVar.f206588f = aVar;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$f;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<vf3.a.OnFlatNumberChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206592g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEContactDetailsAddress V(vf3.a.OnFlatNumberChanged onFlatNumberChanged, BEContactDetailsAddress bEContactDetailsAddress) {
            return BEContactDetailsAddress.c(bEContactDetailsAddress, null, null, null, null, onFlatNumberChanged.getValue(), 15, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), null, null, null, null, null, null, ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getFlatNumberField(), null, hz.b.C2039b.f86846c, null, 5, null), 63, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnFlatNumberChanged onFlatNumberChanged = (vf3.a.OnFlatNumberChanged) this.f206591f;
            final k10.c0 c0Var = (k10.c0) this.f206592g;
            Object objE = uq.b.e();
            int i15 = this.f206590e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.j.V(onFlatNumberChanged, (BEContactDetailsAddress) obj2);
                    }
                };
                this.f206591f = vq.j.a(onFlatNumberChanged);
                this.f206592g = c0Var;
                this.f206590e = 1;
                if (h0Var.ma(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.j.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnFlatNumberChanged onFlatNumberChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            j jVar = h0.this.new j(eVar);
            jVar.f206591f = onFlatNumberChanged;
            jVar.f206592g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$o;", "<unused var>", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<vf3.a.o, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206595f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b O(vf3.c.b bVar, vf3.c.b bVar2) {
            FormData formData = bVar.getFormData();
            ContactDetailsFields.b bVarG = bVar.getFormData().getContactDetailsFields().g();
            return bVar.a(FormData.b(formData, null, bVarG != null ? new d60.j(bVarG) : null, 1, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f206595f;
            Object objE = uq.b.e();
            int i15 = this.f206594e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                vf3.c.b bVar = (vf3.c.b) c0Var.a();
                this.f206595f = c0Var;
                this.f206594e = 1;
                obj = h0Var.O9(bVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final vf3.c.b bVar2 = (vf3.c.b) obj;
            if (!bVar2.getFormData().getContactDetailsFields().l()) {
                return c0Var.d(new er.l() { // from class: vf3.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.k.O(bVar2, (c.b) obj2);
                    }
                });
            }
            h0.this.d9(vf3.a.C5398a.f206445a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.o oVar, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            k kVar = h0.this.new k(eVar);
            kVar.f206595f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvf3/a$a;", "action", "Lvf3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvf3/a$a;Lvf3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<vf3.a.C5398a, vf3.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206598f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f206600e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f206601f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f206602g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f206603h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f206604j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f206605k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f206606l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ h0 f206607m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ vf3.a.C5398a f206608n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, vf3.a.C5398a c5398a, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f206607m = h0Var;
                this.f206608n = c5398a;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00d2 A[PHI: r1 r2
              0x00d2: PHI (r1v10 ae3.u$b) = (r1v7 ae3.u$b), (r1v12 ae3.u$b) binds: [B:23:0x00ce, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x00d2: PHI (r2v5 sv0.y) = (r2v3 sv0.y), (r2v7 sv0.y) binds: [B:23:0x00ce, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:28:0x00f8 A[PHI: r1 r2
              0x00f8: PHI (r1v13 ae3.u$b) = (r1v10 ae3.u$b), (r1v16 ae3.u$b) binds: [B:26:0x00f4, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
              0x00f8: PHI (r2v8 sv0.y) = (r2v5 sv0.y), (r2v11 sv0.y) binds: [B:26:0x00f4, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:30:0x0104  */
            /* JADX WARN: Code duplicated, block: B:35:0x0137  */
            /* JADX WARN: Code duplicated, block: B:38:0x0156 A[PHI: r1 r2
              0x0156: PHI (r1v17 ae3.u$b) = (r1v13 ae3.u$b), (r1v21 ae3.u$b) binds: [B:36:0x0153, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]
              0x0156: PHI (r2v12 sv0.y) = (r2v8 sv0.y), (r2v15 sv0.y) binds: [B:36:0x0153, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0131, code lost:
            
                if (r3.Q9(r5, r4, r6) == r0) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x016d, code lost:
            
                if (r7.F(r3, r6) == r0) goto L40;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vf3.h0.l.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f206607m, this.f206608n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vf3.a.C5398a c5398a = (vf3.a.C5398a) this.f206598f;
            Object objE = uq.b.e();
            int i15 = this.f206597e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = h0.this.callActionWithLoaderUC;
                a aVar2 = new a(h0.this, c5398a, null);
                this.f206598f = vq.j.a(c5398a);
                this.f206597e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.C5398a c5398a, vf3.c.b bVar, tq.e<? super oq.i0> eVar) {
            l lVar = h0.this.new l(eVar);
            lVar.f206598f = c5398a;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvf3/a$g;", "action", "Lvf3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvf3/a$g;Lvf3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<vf3.a.OnMIdCardDataLoaded, vf3.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206610f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vf3.a.OnMIdCardDataLoaded onMIdCardDataLoaded = (vf3.a.OnMIdCardDataLoaded) this.f206610f;
            Object objE = uq.b.e();
            int i15 = this.f206609e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                PersonalDataContainer scope = onMIdCardDataLoaded.getScope();
                this.f206610f = vq.j.a(onMIdCardDataLoaded);
                this.f206609e = 1;
                if (h0Var.ba(scope, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnMIdCardDataLoaded onMIdCardDataLoaded, vf3.c.b bVar, tq.e<? super oq.i0> eVar) {
            m mVar = h0.this.new m(eVar);
            mVar.f206610f = onMIdCardDataLoaded;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvf3/a$l;", "action", "Lvf3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvf3/a$l;Lvf3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<vf3.a.OnRdkDataDownloaded, vf3.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206613f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vf3.a.OnRdkDataDownloaded onRdkDataDownloaded = (vf3.a.OnRdkDataDownloaded) this.f206613f;
            Object objE = uq.b.e();
            int i15 = this.f206612e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                ContactDetails rdkContactDetails = onRdkDataDownloaded.getRdkContactDetails();
                this.f206613f = vq.j.a(onRdkDataDownloaded);
                this.f206612e = 1;
                if (h0Var.da(rdkContactDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnRdkDataDownloaded onRdkDataDownloaded, vf3.c.b bVar, tq.e<? super oq.i0> eVar) {
            n nVar = h0.this.new n(eVar);
            nVar.f206613f = onRdkDataDownloaded;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$h;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<vf3.a.OnPhoneNumberChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206617g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEPersonalData V(vf3.a.OnPhoneNumberChanged onPhoneNumberChanged, BEPersonalData bEPersonalData) {
            return BEPersonalData.b(bEPersonalData, null, null, PhoneNumber.e(bEPersonalData.getPhoneNumber(), null, PhoneNumber.b.c(onPhoneNumberChanged.getPhoneNumber()), 1, null), null, null, false, 59, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), ContactDetailsFields.InterfaceC6083a.Phone.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getPhoneField(), null, hz.b.C2039b.f86846c, null, null, 13, null), null, null, null, null, null, null, 126, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnPhoneNumberChanged onPhoneNumberChanged = (vf3.a.OnPhoneNumberChanged) this.f206616f;
            final k10.c0 c0Var = (k10.c0) this.f206617g;
            Object objE = uq.b.e();
            int i15 = this.f206615e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.o.V(onPhoneNumberChanged, (BEPersonalData) obj2);
                    }
                };
                this.f206616f = vq.j.a(onPhoneNumberChanged);
                this.f206617g = c0Var;
                this.f206615e = 1;
                if (h0Var.oa(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.o.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnPhoneNumberChanged onPhoneNumberChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            o oVar = h0.this.new o(eVar);
            oVar.f206616f = onPhoneNumberChanged;
            oVar.f206617g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$i;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<vf3.a.OnPhonePrefixChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206621g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEPersonalData V(vf3.a.OnPhonePrefixChanged onPhonePrefixChanged, BEPersonalData bEPersonalData) {
            return BEPersonalData.b(bEPersonalData, null, null, PhoneNumber.e(bEPersonalData.getPhoneNumber(), PhoneNumber.c.c(onPhonePrefixChanged.getPhonePrefix()), null, 2, null), null, null, false, 59, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), ContactDetailsFields.InterfaceC6083a.Phone.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getPhoneField(), null, null, hz.b.C2039b.f86846c, null, 11, null), null, null, null, null, null, null, 126, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnPhonePrefixChanged onPhonePrefixChanged = (vf3.a.OnPhonePrefixChanged) this.f206620f;
            final k10.c0 c0Var = (k10.c0) this.f206621g;
            Object objE = uq.b.e();
            int i15 = this.f206619e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.s0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.p.V(onPhonePrefixChanged, (BEPersonalData) obj2);
                    }
                };
                this.f206620f = vq.j.a(onPhonePrefixChanged);
                this.f206621g = c0Var;
                this.f206619e = 1;
                if (h0Var.oa(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.p.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnPhonePrefixChanged onPhonePrefixChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            p pVar = h0.this.new p(eVar);
            pVar.f206620f = onPhonePrefixChanged;
            pVar.f206621g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$e;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<vf3.a.OnEmailChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206625g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEPersonalData V(vf3.a.OnEmailChanged onEmailChanged, BEPersonalData bEPersonalData) {
            return BEPersonalData.b(bEPersonalData, null, null, null, onEmailChanged.getEmail(), null, false, 55, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), null, ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getEmailField(), null, hz.b.C2039b.f86846c, null, 5, null), null, null, null, null, null, 125, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnEmailChanged onEmailChanged = (vf3.a.OnEmailChanged) this.f206624f;
            final k10.c0 c0Var = (k10.c0) this.f206625g;
            Object objE = uq.b.e();
            int i15 = this.f206623e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.u0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.q.V(onEmailChanged, (BEPersonalData) obj2);
                    }
                };
                this.f206624f = vq.j.a(onEmailChanged);
                this.f206625g = c0Var;
                this.f206623e = 1;
                if (h0Var.oa(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.q.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnEmailChanged onEmailChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            q qVar = h0.this.new q(eVar);
            qVar.f206624f = onEmailChanged;
            qVar.f206625g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$k;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<vf3.a.OnPostCodeChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206629g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEContactDetailsAddress V(vf3.a.OnPostCodeChanged onPostCodeChanged, BEContactDetailsAddress bEContactDetailsAddress) {
            return BEContactDetailsAddress.c(bEContactDetailsAddress, null, onPostCodeChanged.getValue(), null, null, null, 29, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), null, null, ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getPostCodeField(), null, hz.b.C2039b.f86846c, null, 5, null), null, null, null, null, 123, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnPostCodeChanged onPostCodeChanged = (vf3.a.OnPostCodeChanged) this.f206628f;
            final k10.c0 c0Var = (k10.c0) this.f206629g;
            Object objE = uq.b.e();
            int i15 = this.f206627e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.w0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.r.V(onPostCodeChanged, (BEContactDetailsAddress) obj2);
                    }
                };
                this.f206628f = vq.j.a(onPostCodeChanged);
                this.f206629g = c0Var;
                this.f206627e = 1;
                if (h0Var.ma(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.r.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnPostCodeChanged onPostCodeChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            r rVar = h0.this.new r(eVar);
            rVar.f206628f = onPostCodeChanged;
            rVar.f206629g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$d;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<vf3.a.OnCityChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206633g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEContactDetailsAddress V(vf3.a.OnCityChanged onCityChanged, BEContactDetailsAddress bEContactDetailsAddress) {
            return BEContactDetailsAddress.c(bEContactDetailsAddress, onCityChanged.getValue(), null, null, null, null, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), null, null, null, ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getCityField(), null, hz.b.C2039b.f86846c, null, 5, null), null, null, null, 119, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnCityChanged onCityChanged = (vf3.a.OnCityChanged) this.f206632f;
            final k10.c0 c0Var = (k10.c0) this.f206633g;
            Object objE = uq.b.e();
            int i15 = this.f206631e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.y0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.s.V(onCityChanged, (BEContactDetailsAddress) obj2);
                    }
                };
                this.f206632f = vq.j.a(onCityChanged);
                this.f206633g = c0Var;
                this.f206631e = 1;
                if (h0Var.ma(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.s.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnCityChanged onCityChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            s sVar = h0.this.new s(eVar);
            sVar.f206632f = onCityChanged;
            sVar.f206633g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$m;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<vf3.a.OnStreetChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206637g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEContactDetailsAddress V(vf3.a.OnStreetChanged onStreetChanged, BEContactDetailsAddress bEContactDetailsAddress) {
            return BEContactDetailsAddress.c(bEContactDetailsAddress, null, null, onStreetChanged.getValue(), null, null, 27, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), null, null, null, null, ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getStreetField(), null, hz.b.C2039b.f86846c, null, 5, null), null, null, 111, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnStreetChanged onStreetChanged = (vf3.a.OnStreetChanged) this.f206636f;
            final k10.c0 c0Var = (k10.c0) this.f206637g;
            Object objE = uq.b.e();
            int i15 = this.f206635e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.a1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.t.V(onStreetChanged, (BEContactDetailsAddress) obj2);
                    }
                };
                this.f206636f = vq.j.a(onStreetChanged);
                this.f206637g = c0Var;
                this.f206635e = 1;
                if (h0Var.ma(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.t.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnStreetChanged onStreetChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            t tVar = h0.this.new t(eVar);
            tVar.f206636f = onStreetChanged;
            tVar.f206637g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvf3/a$c;", "action", "Lk10/c0;", "Lvf3/c$b;", "state", "Lk10/l;", "Lvf3/c;", "<anonymous>", "(Lvf3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<vf3.a.OnBuildingNumberChanged, k10.c0<vf3.c.b>, tq.e<? super k10.l<? extends vf3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f206640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206641g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEContactDetailsAddress V(vf3.a.OnBuildingNumberChanged onBuildingNumberChanged, BEContactDetailsAddress bEContactDetailsAddress) {
            return BEContactDetailsAddress.c(bEContactDetailsAddress, null, null, null, onBuildingNumberChanged.getValue(), null, 23, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vf3.c.b X(k10.c0 c0Var, vf3.c.b bVar) {
            return bVar.a(FormData.b(((vf3.c.b) c0Var.a()).getFormData(), ContactDetailsFields.b(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields(), null, null, null, null, null, ContactDetailsFields.InterfaceC6083a.Input.c(((vf3.c.b) c0Var.a()).getFormData().getContactDetailsFields().getBuildingNumberField(), null, hz.b.C2039b.f86846c, null, 5, null), null, 95, null), null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vf3.a.OnBuildingNumberChanged onBuildingNumberChanged = (vf3.a.OnBuildingNumberChanged) this.f206640f;
            final k10.c0 c0Var = (k10.c0) this.f206641g;
            Object objE = uq.b.e();
            int i15 = this.f206639e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                er.l lVar = new er.l() { // from class: vf3.c1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.u.V(onBuildingNumberChanged, (BEContactDetailsAddress) obj2);
                    }
                };
                this.f206640f = vq.j.a(onBuildingNumberChanged);
                this.f206641g = c0Var;
                this.f206639e = 1;
                if (h0Var.ma(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: vf3.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.u.X(c0Var, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(vf3.a.OnBuildingNumberChanged onBuildingNumberChanged, k10.c0<vf3.c.b> c0Var, tq.e<? super k10.l<? extends vf3.c>> eVar) {
            u uVar = h0.this.new u(eVar);
            uVar.f206640f = onBuildingNumberChanged;
            uVar.f206641g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class v extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f206643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f206645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f206646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f206647h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f206649k;

        v(tq.e<? super v> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f206647h = obj;
            this.f206649k |= PKIFailureInfo.systemUnavail;
            return h0.this.oa(null, this);
        }
    }

    public h0(yy.a aVar, xf3.i iVar, ae3.c0 c0Var, ee3.c cVar, ce3.a aVar2, ui0.a aVar3, ae3.u uVar, ae3.r rVar, ib4.c cVar2, de3.d dVar, de3.c cVar3, ac4.a aVar4, j14.n nVar, j14.a aVar5, j14.o oVar, wf3.a aVar6) {
        this.mapper = iVar;
        this.validPersonalDataUseCase = c0Var;
        this.startAwaitReadyToSignUC = cVar;
        this.downloadContactDetailsDataMonitorUC = aVar2;
        this.contactDetailsDownloadManager = aVar3;
        this.sendNewStatementUC = uVar;
        this.saveNewCollisionDataUC = rVar;
        this.domainErrorMapper = cVar2;
        this.isWrongStateErrorUC = dVar;
        this.isSameVehiclesErrorUC = cVar3;
        this.callActionWithLoaderUC = aVar4;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkEmailCorrectUC = aVar5;
        this.checkPolishPostalCodeCorrectUC = oVar;
        this.contract = aVar6;
        vf3.c.a aVar7 = vf3.c.a.f206481a;
        this.initialState = aVar7;
        this.updateNewCollisionDataMutex = su.g.b(false, 1, null);
        this.stateMachine = aVar.a(aVar7, new er.l() { // from class: vf3.x
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ga(this.f206686a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), S9(aVar7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0259  */
    /* JADX WARN: Code duplicated, block: B:32:0x0296  */
    /* JADX WARN: Code duplicated, block: B:36:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x035a  */
    /* JADX WARN: Code duplicated, block: B:44:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x0403  */
    /* JADX WARN: Code duplicated, block: B:48:0x0405  */
    /* JADX WARN: Code duplicated, block: B:52:0x0469  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object O9(vf3.c.b bVar, tq.e<? super vf3.c.b> eVar) throws Throwable {
        a aVar;
        final ContactDetailsFields contactDetailsFieldsA;
        vf3.c.b bVar2;
        ContactDetailsFields.InterfaceC6083a.Phone phoneField;
        PhoneNumber phoneNumber;
        int i15;
        Object objC;
        ContactDetailsFields contactDetailsFields;
        ContactDetailsFields contactDetailsFields2;
        ContactDetailsFields.InterfaceC6083a.Phone phone;
        int i16;
        PhoneNumber phoneNumber2;
        vf3.c.b bVar3;
        ContactDetailsFields contactDetailsFields3;
        hz.b bVarA;
        ContactDetailsFields contactDetailsFields4;
        Object objC2;
        ContactDetailsFields contactDetailsFields5;
        vf3.c.b bVar4;
        ContactDetailsFields.InterfaceC6083a.Phone phone2;
        hz.b bVar5;
        ContactDetailsFields contactDetailsFields6;
        vf3.c.b bVar6;
        ContactDetailsFields.InterfaceC6083a.Phone phoneC;
        ContactDetailsFields.InterfaceC6083a.Input emailField;
        Object objC3;
        vf3.c.b bVar7;
        ContactDetailsFields contactDetailsFields7;
        ContactDetailsFields.InterfaceC6083a.Phone phone3;
        ContactDetailsFields.InterfaceC6083a.Input input;
        vf3.c.b bVar8;
        ContactDetailsFields.InterfaceC6083a.Input inputC;
        ContactDetailsFields.InterfaceC6083a.Input inputC2;
        ContactDetailsFields.InterfaceC6083a.Input cityField;
        Object objD;
        vf3.c.b bVar9;
        ContactDetailsFields contactDetailsFields8;
        ContactDetailsFields contactDetailsFields9;
        ContactDetailsFields.InterfaceC6083a.Phone phone4;
        ContactDetailsFields.InterfaceC6083a.Input input2;
        ContactDetailsFields.InterfaceC6083a.Input input3;
        ContactDetailsFields contactDetailsFields10;
        vf3.c.b bVar10;
        ContactDetailsFields.InterfaceC6083a.Input inputC3;
        ContactDetailsFields.InterfaceC6083a.Input streetField;
        Object objD2;
        ContactDetailsFields.InterfaceC6083a.Input input4;
        ContactDetailsFields.InterfaceC6083a.Input input5;
        ContactDetailsFields.InterfaceC6083a.Input input6;
        ContactDetailsFields.InterfaceC6083a.Input input7;
        ContactDetailsFields contactDetailsFields11;
        ContactDetailsFields contactDetailsFields12;
        vf3.c.b bVar11;
        ContactDetailsFields.InterfaceC6083a.Input inputC4;
        ContactDetailsFields.InterfaceC6083a.Input buildingNumberField;
        Object objD3;
        Object obj;
        ContactDetailsFields.InterfaceC6083a.Input input8;
        ContactDetailsFields.InterfaceC6083a.Input input9;
        ContactDetailsFields.InterfaceC6083a.Phone phone5;
        ContactDetailsFields contactDetailsFields13;
        ContactDetailsFields contactDetailsFields14;
        ContactDetailsFields.InterfaceC6083a.Input input10;
        ContactDetailsFields contactDetailsFields15;
        ContactDetailsFields.InterfaceC6083a.Input input11;
        ContactDetailsFields contactDetailsFields16;
        ContactDetailsFields.InterfaceC6083a.Phone phone6;
        Object obj2;
        ContactDetailsFields.InterfaceC6083a.Input inputC5;
        ContactDetailsFields.InterfaceC6083a.Input flatNumberField;
        Object objD4;
        ContactDetailsFields contactDetailsFields17;
        vf3.c.b bVar12;
        ContactDetailsFields.InterfaceC6083a.Input input12;
        ContactDetailsFields.InterfaceC6083a.Input input13;
        ContactDetailsFields.InterfaceC6083a.Phone phone7;
        ContactDetailsFields.InterfaceC6083a.Input input14;
        ContactDetailsFields.InterfaceC6083a.Input input15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i17 = aVar.f206554t;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f206554t = i17 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj3 = aVar.f206552r;
        Object objE = uq.b.e();
        switch (aVar.f206554t) {
            case 0:
                oq.u.b(obj3);
                contactDetailsFieldsA = bVar.getFormData().getContactDetailsFields().a(bVar.getFormData().getContactDetailsFields().getPhoneField().d(), bVar.getFormData().getContactDetailsFields().getEmailField().d(), bVar.getFormData().getContactDetailsFields().getPostCodeField().d(), bVar.getFormData().getContactDetailsFields().getCityField().d(), bVar.getFormData().getContactDetailsFields().getStreetField().d(), bVar.getFormData().getContactDetailsFields().getBuildingNumberField().d(), bVar.getFormData().getContactDetailsFields().getFlatNumberField().d());
                er.l<? super BEPersonalData, BEPersonalData> lVar = new er.l() { // from class: vf3.v
                    @Override // er.l
                    public final Object b(Object obj4) {
                        return h0.P9(this.f206681a, contactDetailsFieldsA, (BEPersonalData) obj4);
                    }
                };
                bVar2 = bVar;
                aVar.f206540d = bVar2;
                aVar.f206541e = contactDetailsFieldsA;
                aVar.f206554t = 1;
                if (oa(lVar, aVar) != objE) {
                    phoneField = contactDetailsFieldsA.getPhoneField();
                    phoneNumber = contactDetailsFieldsA.getPhoneField().getPhoneNumber();
                    j14.n nVar = this.checkPhoneNumberCorrectUC;
                    i15 = 2;
                    j14.n.a.CheckNumber checkNumber = new j14.n.a.CheckNumber(contactDetailsFieldsA.getPhoneField().getPhoneNumber(), false, 2, null);
                    aVar.f206540d = bVar2;
                    aVar.f206541e = vq.j.a(contactDetailsFieldsA);
                    aVar.f206542f = contactDetailsFieldsA;
                    aVar.f206543g = phoneField;
                    aVar.f206544h = phoneNumber;
                    aVar.f206545j = contactDetailsFieldsA;
                    aVar.f206551q = 0;
                    aVar.f206554t = 2;
                    objC = nVar.c(checkNumber, aVar);
                    if (objC != objE) {
                        contactDetailsFields = contactDetailsFieldsA;
                        contactDetailsFields2 = contactDetailsFields;
                        phone = phoneField;
                        i16 = 0;
                        obj3 = objC;
                        phoneNumber2 = phoneNumber;
                        bVar3 = bVar2;
                        contactDetailsFields3 = contactDetailsFields2;
                        bVarA = ((hz.g) obj3).a();
                        j14.n nVar2 = this.checkPhoneNumberCorrectUC;
                        contactDetailsFields4 = contactDetailsFields2;
                        j14.n.a.CheckPrefix checkPrefix = new j14.n.a.CheckPrefix(contactDetailsFields.getPhoneField().getPhoneNumber(), false, i15, null);
                        aVar.f206540d = bVar3;
                        aVar.f206541e = vq.j.a(contactDetailsFields4);
                        aVar.f206542f = contactDetailsFields;
                        aVar.f206543g = phone;
                        aVar.f206544h = phoneNumber2;
                        aVar.f206545j = contactDetailsFields3;
                        aVar.f206546k = bVarA;
                        aVar.f206551q = i16;
                        aVar.f206554t = 3;
                        objC2 = nVar2.c(checkPrefix, aVar);
                        if (objC2 != objE) {
                            contactDetailsFields5 = contactDetailsFields4;
                            bVar4 = bVar3;
                            phone2 = phone;
                            bVar5 = bVarA;
                            obj3 = objC2;
                            contactDetailsFields6 = contactDetailsFields;
                            PhoneNumber phoneNumber3 = phoneNumber2;
                            hz.b bVarA2 = ((hz.g) obj3).a();
                            bVar6 = bVar4;
                            phoneC = ContactDetailsFields.InterfaceC6083a.Phone.c(phone2, null, bVar5, bVarA2, phoneNumber3, 1, null);
                            emailField = contactDetailsFields6.getEmailField();
                            j14.a aVar2 = this.checkEmailCorrectUC;
                            j14.a.Params params = new j14.a.Params(contactDetailsFields6.getEmailField().getValue(), false, null, 6, null);
                            aVar.f206540d = bVar6;
                            aVar.f206541e = vq.j.a(contactDetailsFields5);
                            aVar.f206542f = contactDetailsFields6;
                            aVar.f206543g = contactDetailsFields3;
                            aVar.f206544h = phoneC;
                            aVar.f206545j = emailField;
                            aVar.f206546k = null;
                            aVar.f206551q = i16;
                            aVar.f206554t = 4;
                            objC3 = aVar2.c(params, aVar);
                            if (objC3 != objE) {
                                bVar7 = bVar6;
                                contactDetailsFields7 = contactDetailsFields3;
                                phone3 = phoneC;
                                input = emailField;
                                obj3 = objC3;
                                hz.b bVarA3 = ((hz.g) obj3).a();
                                bVar8 = bVar7;
                                inputC = ContactDetailsFields.InterfaceC6083a.Input.c(input, null, bVarA3, null, 5, null);
                                inputC2 = ContactDetailsFields.InterfaceC6083a.Input.c(contactDetailsFields6.getPostCodeField(), null, this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(contactDetailsFields6.getPostCodeField().getValue(), false, 2, null)).a(), null, 5, null);
                                cityField = contactDetailsFields6.getCityField();
                                ae3.c0 c0Var = this.validPersonalDataUseCase;
                                ae3.c0.a.b bVar13 = new ae3.c0.a.b(contactDetailsFields6.getCityField().getValue());
                                aVar.f206540d = bVar8;
                                aVar.f206541e = vq.j.a(contactDetailsFields5);
                                aVar.f206542f = contactDetailsFields6;
                                aVar.f206543g = contactDetailsFields7;
                                aVar.f206544h = phone3;
                                aVar.f206545j = inputC2;
                                aVar.f206546k = inputC;
                                aVar.f206547l = cityField;
                                aVar.f206551q = i16;
                                aVar.f206554t = 5;
                                objD = c0Var.d(bVar13, aVar);
                                if (objD != objE) {
                                    bVar9 = bVar8;
                                    obj3 = objD;
                                    contactDetailsFields8 = contactDetailsFields6;
                                    contactDetailsFields9 = contactDetailsFields7;
                                    phone4 = phone3;
                                    input2 = inputC;
                                    input3 = cityField;
                                    contactDetailsFields10 = contactDetailsFields8;
                                    bVar10 = bVar9;
                                    inputC3 = ContactDetailsFields.InterfaceC6083a.Input.c(input3, null, ((hz.g) obj3).a(), null, 5, null);
                                    streetField = contactDetailsFields10.getStreetField();
                                    ae3.c0 c0Var2 = this.validPersonalDataUseCase;
                                    ae3.c0.a.d dVar = new ae3.c0.a.d(contactDetailsFields10.getStreetField().getValue());
                                    aVar.f206540d = bVar10;
                                    aVar.f206541e = vq.j.a(contactDetailsFields5);
                                    aVar.f206542f = contactDetailsFields10;
                                    aVar.f206543g = contactDetailsFields9;
                                    aVar.f206544h = phone4;
                                    aVar.f206545j = inputC2;
                                    aVar.f206546k = input2;
                                    aVar.f206547l = inputC3;
                                    aVar.f206548m = streetField;
                                    aVar.f206551q = i16;
                                    aVar.f206554t = 6;
                                    objD2 = c0Var2.d(dVar, aVar);
                                    if (objD2 != objE) {
                                        input4 = inputC2;
                                        input5 = input2;
                                        input6 = inputC3;
                                        input7 = streetField;
                                        contactDetailsFields11 = contactDetailsFields10;
                                        obj3 = objD2;
                                        contactDetailsFields12 = contactDetailsFields11;
                                        bVar11 = bVar10;
                                        inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(input7, null, ((hz.g) obj3).a(), null, 5, null);
                                        buildingNumberField = contactDetailsFields12.getBuildingNumberField();
                                        ae3.c0 c0Var3 = this.validPersonalDataUseCase;
                                        ae3.c0.a.C0121a c0121a = new ae3.c0.a.C0121a(contactDetailsFields12.getBuildingNumberField().getValue());
                                        aVar.f206540d = bVar11;
                                        aVar.f206541e = vq.j.a(contactDetailsFields5);
                                        aVar.f206542f = contactDetailsFields12;
                                        aVar.f206543g = contactDetailsFields9;
                                        aVar.f206544h = phone4;
                                        aVar.f206545j = input4;
                                        aVar.f206546k = input5;
                                        aVar.f206547l = input6;
                                        aVar.f206548m = inputC4;
                                        aVar.f206549n = buildingNumberField;
                                        aVar.f206551q = i16;
                                        aVar.f206554t = 7;
                                        objD3 = c0Var3.d(c0121a, aVar);
                                        obj = objE;
                                        if (objD3 == obj) {
                                            return obj;
                                        }
                                        input8 = buildingNumberField;
                                        input9 = input6;
                                        phone5 = phone4;
                                        contactDetailsFields13 = contactDetailsFields5;
                                        contactDetailsFields14 = contactDetailsFields12;
                                        obj3 = objD3;
                                        input10 = input5;
                                        contactDetailsFields15 = contactDetailsFields9;
                                        input11 = input4;
                                        contactDetailsFields16 = contactDetailsFields15;
                                        phone6 = phone5;
                                        obj2 = obj;
                                        inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                                        flatNumberField = contactDetailsFields14.getFlatNumberField();
                                        ae3.c0 c0Var4 = this.validPersonalDataUseCase;
                                        ae3.c0.a.c cVar = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                                        aVar.f206540d = bVar11;
                                        aVar.f206541e = vq.j.a(contactDetailsFields13);
                                        aVar.f206542f = vq.j.a(contactDetailsFields14);
                                        aVar.f206543g = contactDetailsFields16;
                                        aVar.f206544h = phone6;
                                        aVar.f206545j = input11;
                                        aVar.f206546k = input10;
                                        aVar.f206547l = input9;
                                        aVar.f206548m = inputC4;
                                        aVar.f206549n = inputC5;
                                        aVar.f206550p = flatNumberField;
                                        aVar.f206551q = i16;
                                        aVar.f206554t = 8;
                                        objD4 = c0Var4.d(cVar, aVar);
                                        if (objD4 == obj2) {
                                            return obj2;
                                        }
                                        contactDetailsFields17 = contactDetailsFields16;
                                        obj3 = objD4;
                                        bVar12 = bVar11;
                                        input12 = input9;
                                        input13 = input10;
                                        phone7 = phone6;
                                        input14 = flatNumberField;
                                        input15 = inputC5;
                                        return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 1:
                ContactDetailsFields contactDetailsFields18 = (ContactDetailsFields) aVar.f206541e;
                bVar2 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                contactDetailsFieldsA = contactDetailsFields18;
                phoneField = contactDetailsFieldsA.getPhoneField();
                phoneNumber = contactDetailsFieldsA.getPhoneField().getPhoneNumber();
                j14.n nVar3 = this.checkPhoneNumberCorrectUC;
                i15 = 2;
                j14.n.a.CheckNumber checkNumber2 = new j14.n.a.CheckNumber(contactDetailsFieldsA.getPhoneField().getPhoneNumber(), false, 2, null);
                aVar.f206540d = bVar2;
                aVar.f206541e = vq.j.a(contactDetailsFieldsA);
                aVar.f206542f = contactDetailsFieldsA;
                aVar.f206543g = phoneField;
                aVar.f206544h = phoneNumber;
                aVar.f206545j = contactDetailsFieldsA;
                aVar.f206551q = 0;
                aVar.f206554t = 2;
                objC = nVar3.c(checkNumber2, aVar);
                if (objC != objE) {
                    contactDetailsFields = contactDetailsFieldsA;
                    contactDetailsFields2 = contactDetailsFields;
                    phone = phoneField;
                    i16 = 0;
                    obj3 = objC;
                    phoneNumber2 = phoneNumber;
                    bVar3 = bVar2;
                    contactDetailsFields3 = contactDetailsFields2;
                    bVarA = ((hz.g) obj3).a();
                    j14.n nVar4 = this.checkPhoneNumberCorrectUC;
                    contactDetailsFields4 = contactDetailsFields2;
                    j14.n.a.CheckPrefix checkPrefix2 = new j14.n.a.CheckPrefix(contactDetailsFields.getPhoneField().getPhoneNumber(), false, i15, null);
                    aVar.f206540d = bVar3;
                    aVar.f206541e = vq.j.a(contactDetailsFields4);
                    aVar.f206542f = contactDetailsFields;
                    aVar.f206543g = phone;
                    aVar.f206544h = phoneNumber2;
                    aVar.f206545j = contactDetailsFields3;
                    aVar.f206546k = bVarA;
                    aVar.f206551q = i16;
                    aVar.f206554t = 3;
                    objC2 = nVar4.c(checkPrefix2, aVar);
                    if (objC2 != objE) {
                        contactDetailsFields5 = contactDetailsFields4;
                        bVar4 = bVar3;
                        phone2 = phone;
                        bVar5 = bVarA;
                        obj3 = objC2;
                        contactDetailsFields6 = contactDetailsFields;
                        PhoneNumber phoneNumber4 = phoneNumber2;
                        hz.b bVarA4 = ((hz.g) obj3).a();
                        bVar6 = bVar4;
                        phoneC = ContactDetailsFields.InterfaceC6083a.Phone.c(phone2, null, bVar5, bVarA4, phoneNumber4, 1, null);
                        emailField = contactDetailsFields6.getEmailField();
                        j14.a aVar3 = this.checkEmailCorrectUC;
                        j14.a.Params params2 = new j14.a.Params(contactDetailsFields6.getEmailField().getValue(), false, null, 6, null);
                        aVar.f206540d = bVar6;
                        aVar.f206541e = vq.j.a(contactDetailsFields5);
                        aVar.f206542f = contactDetailsFields6;
                        aVar.f206543g = contactDetailsFields3;
                        aVar.f206544h = phoneC;
                        aVar.f206545j = emailField;
                        aVar.f206546k = null;
                        aVar.f206551q = i16;
                        aVar.f206554t = 4;
                        objC3 = aVar3.c(params2, aVar);
                        if (objC3 != objE) {
                            bVar7 = bVar6;
                            contactDetailsFields7 = contactDetailsFields3;
                            phone3 = phoneC;
                            input = emailField;
                            obj3 = objC3;
                            hz.b bVarA5 = ((hz.g) obj3).a();
                            bVar8 = bVar7;
                            inputC = ContactDetailsFields.InterfaceC6083a.Input.c(input, null, bVarA5, null, 5, null);
                            inputC2 = ContactDetailsFields.InterfaceC6083a.Input.c(contactDetailsFields6.getPostCodeField(), null, this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(contactDetailsFields6.getPostCodeField().getValue(), false, 2, null)).a(), null, 5, null);
                            cityField = contactDetailsFields6.getCityField();
                            ae3.c0 c0Var5 = this.validPersonalDataUseCase;
                            ae3.c0.a.b bVar14 = new ae3.c0.a.b(contactDetailsFields6.getCityField().getValue());
                            aVar.f206540d = bVar8;
                            aVar.f206541e = vq.j.a(contactDetailsFields5);
                            aVar.f206542f = contactDetailsFields6;
                            aVar.f206543g = contactDetailsFields7;
                            aVar.f206544h = phone3;
                            aVar.f206545j = inputC2;
                            aVar.f206546k = inputC;
                            aVar.f206547l = cityField;
                            aVar.f206551q = i16;
                            aVar.f206554t = 5;
                            objD = c0Var5.d(bVar14, aVar);
                            if (objD != objE) {
                                bVar9 = bVar8;
                                obj3 = objD;
                                contactDetailsFields8 = contactDetailsFields6;
                                contactDetailsFields9 = contactDetailsFields7;
                                phone4 = phone3;
                                input2 = inputC;
                                input3 = cityField;
                                contactDetailsFields10 = contactDetailsFields8;
                                bVar10 = bVar9;
                                inputC3 = ContactDetailsFields.InterfaceC6083a.Input.c(input3, null, ((hz.g) obj3).a(), null, 5, null);
                                streetField = contactDetailsFields10.getStreetField();
                                ae3.c0 c0Var6 = this.validPersonalDataUseCase;
                                ae3.c0.a.d dVar2 = new ae3.c0.a.d(contactDetailsFields10.getStreetField().getValue());
                                aVar.f206540d = bVar10;
                                aVar.f206541e = vq.j.a(contactDetailsFields5);
                                aVar.f206542f = contactDetailsFields10;
                                aVar.f206543g = contactDetailsFields9;
                                aVar.f206544h = phone4;
                                aVar.f206545j = inputC2;
                                aVar.f206546k = input2;
                                aVar.f206547l = inputC3;
                                aVar.f206548m = streetField;
                                aVar.f206551q = i16;
                                aVar.f206554t = 6;
                                objD2 = c0Var6.d(dVar2, aVar);
                                if (objD2 != objE) {
                                    input4 = inputC2;
                                    input5 = input2;
                                    input6 = inputC3;
                                    input7 = streetField;
                                    contactDetailsFields11 = contactDetailsFields10;
                                    obj3 = objD2;
                                    contactDetailsFields12 = contactDetailsFields11;
                                    bVar11 = bVar10;
                                    inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(input7, null, ((hz.g) obj3).a(), null, 5, null);
                                    buildingNumberField = contactDetailsFields12.getBuildingNumberField();
                                    ae3.c0 c0Var7 = this.validPersonalDataUseCase;
                                    ae3.c0.a.C0121a c0121a2 = new ae3.c0.a.C0121a(contactDetailsFields12.getBuildingNumberField().getValue());
                                    aVar.f206540d = bVar11;
                                    aVar.f206541e = vq.j.a(contactDetailsFields5);
                                    aVar.f206542f = contactDetailsFields12;
                                    aVar.f206543g = contactDetailsFields9;
                                    aVar.f206544h = phone4;
                                    aVar.f206545j = input4;
                                    aVar.f206546k = input5;
                                    aVar.f206547l = input6;
                                    aVar.f206548m = inputC4;
                                    aVar.f206549n = buildingNumberField;
                                    aVar.f206551q = i16;
                                    aVar.f206554t = 7;
                                    objD3 = c0Var7.d(c0121a2, aVar);
                                    obj = objE;
                                    if (objD3 == obj) {
                                        return obj;
                                    }
                                    input8 = buildingNumberField;
                                    input9 = input6;
                                    phone5 = phone4;
                                    contactDetailsFields13 = contactDetailsFields5;
                                    contactDetailsFields14 = contactDetailsFields12;
                                    obj3 = objD3;
                                    input10 = input5;
                                    contactDetailsFields15 = contactDetailsFields9;
                                    input11 = input4;
                                    contactDetailsFields16 = contactDetailsFields15;
                                    phone6 = phone5;
                                    obj2 = obj;
                                    inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                                    flatNumberField = contactDetailsFields14.getFlatNumberField();
                                    ae3.c0 c0Var8 = this.validPersonalDataUseCase;
                                    ae3.c0.a.c cVar2 = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                                    aVar.f206540d = bVar11;
                                    aVar.f206541e = vq.j.a(contactDetailsFields13);
                                    aVar.f206542f = vq.j.a(contactDetailsFields14);
                                    aVar.f206543g = contactDetailsFields16;
                                    aVar.f206544h = phone6;
                                    aVar.f206545j = input11;
                                    aVar.f206546k = input10;
                                    aVar.f206547l = input9;
                                    aVar.f206548m = inputC4;
                                    aVar.f206549n = inputC5;
                                    aVar.f206550p = flatNumberField;
                                    aVar.f206551q = i16;
                                    aVar.f206554t = 8;
                                    objD4 = c0Var8.d(cVar2, aVar);
                                    if (objD4 == obj2) {
                                        return obj2;
                                    }
                                    contactDetailsFields17 = contactDetailsFields16;
                                    obj3 = objD4;
                                    bVar12 = bVar11;
                                    input12 = input9;
                                    input13 = input10;
                                    phone7 = phone6;
                                    input14 = flatNumberField;
                                    input15 = inputC5;
                                    return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
                                }
                            }
                        }
                    }
                }
                return objE;
            case 2:
                i16 = aVar.f206551q;
                contactDetailsFields3 = (ContactDetailsFields) aVar.f206545j;
                PhoneNumber phoneNumber5 = (PhoneNumber) aVar.f206544h;
                ContactDetailsFields.InterfaceC6083a.Phone phone8 = (ContactDetailsFields.InterfaceC6083a.Phone) aVar.f206543g;
                ContactDetailsFields contactDetailsFields19 = (ContactDetailsFields) aVar.f206542f;
                ContactDetailsFields contactDetailsFields20 = (ContactDetailsFields) aVar.f206541e;
                vf3.c.b bVar15 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                contactDetailsFields2 = contactDetailsFields20;
                contactDetailsFields = contactDetailsFields19;
                phone = phone8;
                phoneNumber2 = phoneNumber5;
                bVar3 = bVar15;
                i15 = 2;
                bVarA = ((hz.g) obj3).a();
                j14.n nVar5 = this.checkPhoneNumberCorrectUC;
                contactDetailsFields4 = contactDetailsFields2;
                j14.n.a.CheckPrefix checkPrefix3 = new j14.n.a.CheckPrefix(contactDetailsFields.getPhoneField().getPhoneNumber(), false, i15, null);
                aVar.f206540d = bVar3;
                aVar.f206541e = vq.j.a(contactDetailsFields4);
                aVar.f206542f = contactDetailsFields;
                aVar.f206543g = phone;
                aVar.f206544h = phoneNumber2;
                aVar.f206545j = contactDetailsFields3;
                aVar.f206546k = bVarA;
                aVar.f206551q = i16;
                aVar.f206554t = 3;
                objC2 = nVar5.c(checkPrefix3, aVar);
                if (objC2 != objE) {
                    contactDetailsFields5 = contactDetailsFields4;
                    bVar4 = bVar3;
                    phone2 = phone;
                    bVar5 = bVarA;
                    obj3 = objC2;
                    contactDetailsFields6 = contactDetailsFields;
                    PhoneNumber phoneNumber6 = phoneNumber2;
                    hz.b bVarA6 = ((hz.g) obj3).a();
                    bVar6 = bVar4;
                    phoneC = ContactDetailsFields.InterfaceC6083a.Phone.c(phone2, null, bVar5, bVarA6, phoneNumber6, 1, null);
                    emailField = contactDetailsFields6.getEmailField();
                    j14.a aVar4 = this.checkEmailCorrectUC;
                    j14.a.Params params3 = new j14.a.Params(contactDetailsFields6.getEmailField().getValue(), false, null, 6, null);
                    aVar.f206540d = bVar6;
                    aVar.f206541e = vq.j.a(contactDetailsFields5);
                    aVar.f206542f = contactDetailsFields6;
                    aVar.f206543g = contactDetailsFields3;
                    aVar.f206544h = phoneC;
                    aVar.f206545j = emailField;
                    aVar.f206546k = null;
                    aVar.f206551q = i16;
                    aVar.f206554t = 4;
                    objC3 = aVar4.c(params3, aVar);
                    if (objC3 != objE) {
                        bVar7 = bVar6;
                        contactDetailsFields7 = contactDetailsFields3;
                        phone3 = phoneC;
                        input = emailField;
                        obj3 = objC3;
                        hz.b bVarA7 = ((hz.g) obj3).a();
                        bVar8 = bVar7;
                        inputC = ContactDetailsFields.InterfaceC6083a.Input.c(input, null, bVarA7, null, 5, null);
                        inputC2 = ContactDetailsFields.InterfaceC6083a.Input.c(contactDetailsFields6.getPostCodeField(), null, this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(contactDetailsFields6.getPostCodeField().getValue(), false, 2, null)).a(), null, 5, null);
                        cityField = contactDetailsFields6.getCityField();
                        ae3.c0 c0Var9 = this.validPersonalDataUseCase;
                        ae3.c0.a.b bVar16 = new ae3.c0.a.b(contactDetailsFields6.getCityField().getValue());
                        aVar.f206540d = bVar8;
                        aVar.f206541e = vq.j.a(contactDetailsFields5);
                        aVar.f206542f = contactDetailsFields6;
                        aVar.f206543g = contactDetailsFields7;
                        aVar.f206544h = phone3;
                        aVar.f206545j = inputC2;
                        aVar.f206546k = inputC;
                        aVar.f206547l = cityField;
                        aVar.f206551q = i16;
                        aVar.f206554t = 5;
                        objD = c0Var9.d(bVar16, aVar);
                        if (objD != objE) {
                            bVar9 = bVar8;
                            obj3 = objD;
                            contactDetailsFields8 = contactDetailsFields6;
                            contactDetailsFields9 = contactDetailsFields7;
                            phone4 = phone3;
                            input2 = inputC;
                            input3 = cityField;
                            contactDetailsFields10 = contactDetailsFields8;
                            bVar10 = bVar9;
                            inputC3 = ContactDetailsFields.InterfaceC6083a.Input.c(input3, null, ((hz.g) obj3).a(), null, 5, null);
                            streetField = contactDetailsFields10.getStreetField();
                            ae3.c0 c0Var10 = this.validPersonalDataUseCase;
                            ae3.c0.a.d dVar3 = new ae3.c0.a.d(contactDetailsFields10.getStreetField().getValue());
                            aVar.f206540d = bVar10;
                            aVar.f206541e = vq.j.a(contactDetailsFields5);
                            aVar.f206542f = contactDetailsFields10;
                            aVar.f206543g = contactDetailsFields9;
                            aVar.f206544h = phone4;
                            aVar.f206545j = inputC2;
                            aVar.f206546k = input2;
                            aVar.f206547l = inputC3;
                            aVar.f206548m = streetField;
                            aVar.f206551q = i16;
                            aVar.f206554t = 6;
                            objD2 = c0Var10.d(dVar3, aVar);
                            if (objD2 != objE) {
                                input4 = inputC2;
                                input5 = input2;
                                input6 = inputC3;
                                input7 = streetField;
                                contactDetailsFields11 = contactDetailsFields10;
                                obj3 = objD2;
                                contactDetailsFields12 = contactDetailsFields11;
                                bVar11 = bVar10;
                                inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(input7, null, ((hz.g) obj3).a(), null, 5, null);
                                buildingNumberField = contactDetailsFields12.getBuildingNumberField();
                                ae3.c0 c0Var11 = this.validPersonalDataUseCase;
                                ae3.c0.a.C0121a c0121a3 = new ae3.c0.a.C0121a(contactDetailsFields12.getBuildingNumberField().getValue());
                                aVar.f206540d = bVar11;
                                aVar.f206541e = vq.j.a(contactDetailsFields5);
                                aVar.f206542f = contactDetailsFields12;
                                aVar.f206543g = contactDetailsFields9;
                                aVar.f206544h = phone4;
                                aVar.f206545j = input4;
                                aVar.f206546k = input5;
                                aVar.f206547l = input6;
                                aVar.f206548m = inputC4;
                                aVar.f206549n = buildingNumberField;
                                aVar.f206551q = i16;
                                aVar.f206554t = 7;
                                objD3 = c0Var11.d(c0121a3, aVar);
                                obj = objE;
                                if (objD3 == obj) {
                                    return obj;
                                }
                                input8 = buildingNumberField;
                                input9 = input6;
                                phone5 = phone4;
                                contactDetailsFields13 = contactDetailsFields5;
                                contactDetailsFields14 = contactDetailsFields12;
                                obj3 = objD3;
                                input10 = input5;
                                contactDetailsFields15 = contactDetailsFields9;
                                input11 = input4;
                                contactDetailsFields16 = contactDetailsFields15;
                                phone6 = phone5;
                                obj2 = obj;
                                inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                                flatNumberField = contactDetailsFields14.getFlatNumberField();
                                ae3.c0 c0Var12 = this.validPersonalDataUseCase;
                                ae3.c0.a.c cVar3 = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                                aVar.f206540d = bVar11;
                                aVar.f206541e = vq.j.a(contactDetailsFields13);
                                aVar.f206542f = vq.j.a(contactDetailsFields14);
                                aVar.f206543g = contactDetailsFields16;
                                aVar.f206544h = phone6;
                                aVar.f206545j = input11;
                                aVar.f206546k = input10;
                                aVar.f206547l = input9;
                                aVar.f206548m = inputC4;
                                aVar.f206549n = inputC5;
                                aVar.f206550p = flatNumberField;
                                aVar.f206551q = i16;
                                aVar.f206554t = 8;
                                objD4 = c0Var12.d(cVar3, aVar);
                                if (objD4 == obj2) {
                                    return obj2;
                                }
                                contactDetailsFields17 = contactDetailsFields16;
                                obj3 = objD4;
                                bVar12 = bVar11;
                                input12 = input9;
                                input13 = input10;
                                phone7 = phone6;
                                input14 = flatNumberField;
                                input15 = inputC5;
                                return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
                            }
                        }
                    }
                }
                return objE;
            case 3:
                i16 = aVar.f206551q;
                hz.b bVar17 = (hz.b) aVar.f206546k;
                ContactDetailsFields contactDetailsFields21 = (ContactDetailsFields) aVar.f206545j;
                phoneNumber2 = (PhoneNumber) aVar.f206544h;
                ContactDetailsFields.InterfaceC6083a.Phone phone9 = (ContactDetailsFields.InterfaceC6083a.Phone) aVar.f206543g;
                contactDetailsFields = (ContactDetailsFields) aVar.f206542f;
                ContactDetailsFields contactDetailsFields22 = (ContactDetailsFields) aVar.f206541e;
                bVar4 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                bVar5 = bVar17;
                contactDetailsFields3 = contactDetailsFields21;
                phone2 = phone9;
                contactDetailsFields5 = contactDetailsFields22;
                contactDetailsFields6 = contactDetailsFields;
                PhoneNumber phoneNumber7 = phoneNumber2;
                hz.b bVarA8 = ((hz.g) obj3).a();
                bVar6 = bVar4;
                phoneC = ContactDetailsFields.InterfaceC6083a.Phone.c(phone2, null, bVar5, bVarA8, phoneNumber7, 1, null);
                emailField = contactDetailsFields6.getEmailField();
                j14.a aVar5 = this.checkEmailCorrectUC;
                j14.a.Params params4 = new j14.a.Params(contactDetailsFields6.getEmailField().getValue(), false, null, 6, null);
                aVar.f206540d = bVar6;
                aVar.f206541e = vq.j.a(contactDetailsFields5);
                aVar.f206542f = contactDetailsFields6;
                aVar.f206543g = contactDetailsFields3;
                aVar.f206544h = phoneC;
                aVar.f206545j = emailField;
                aVar.f206546k = null;
                aVar.f206551q = i16;
                aVar.f206554t = 4;
                objC3 = aVar5.c(params4, aVar);
                if (objC3 != objE) {
                    bVar7 = bVar6;
                    contactDetailsFields7 = contactDetailsFields3;
                    phone3 = phoneC;
                    input = emailField;
                    obj3 = objC3;
                    hz.b bVarA9 = ((hz.g) obj3).a();
                    bVar8 = bVar7;
                    inputC = ContactDetailsFields.InterfaceC6083a.Input.c(input, null, bVarA9, null, 5, null);
                    inputC2 = ContactDetailsFields.InterfaceC6083a.Input.c(contactDetailsFields6.getPostCodeField(), null, this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(contactDetailsFields6.getPostCodeField().getValue(), false, 2, null)).a(), null, 5, null);
                    cityField = contactDetailsFields6.getCityField();
                    ae3.c0 c0Var13 = this.validPersonalDataUseCase;
                    ae3.c0.a.b bVar18 = new ae3.c0.a.b(contactDetailsFields6.getCityField().getValue());
                    aVar.f206540d = bVar8;
                    aVar.f206541e = vq.j.a(contactDetailsFields5);
                    aVar.f206542f = contactDetailsFields6;
                    aVar.f206543g = contactDetailsFields7;
                    aVar.f206544h = phone3;
                    aVar.f206545j = inputC2;
                    aVar.f206546k = inputC;
                    aVar.f206547l = cityField;
                    aVar.f206551q = i16;
                    aVar.f206554t = 5;
                    objD = c0Var13.d(bVar18, aVar);
                    if (objD != objE) {
                        bVar9 = bVar8;
                        obj3 = objD;
                        contactDetailsFields8 = contactDetailsFields6;
                        contactDetailsFields9 = contactDetailsFields7;
                        phone4 = phone3;
                        input2 = inputC;
                        input3 = cityField;
                        contactDetailsFields10 = contactDetailsFields8;
                        bVar10 = bVar9;
                        inputC3 = ContactDetailsFields.InterfaceC6083a.Input.c(input3, null, ((hz.g) obj3).a(), null, 5, null);
                        streetField = contactDetailsFields10.getStreetField();
                        ae3.c0 c0Var14 = this.validPersonalDataUseCase;
                        ae3.c0.a.d dVar4 = new ae3.c0.a.d(contactDetailsFields10.getStreetField().getValue());
                        aVar.f206540d = bVar10;
                        aVar.f206541e = vq.j.a(contactDetailsFields5);
                        aVar.f206542f = contactDetailsFields10;
                        aVar.f206543g = contactDetailsFields9;
                        aVar.f206544h = phone4;
                        aVar.f206545j = inputC2;
                        aVar.f206546k = input2;
                        aVar.f206547l = inputC3;
                        aVar.f206548m = streetField;
                        aVar.f206551q = i16;
                        aVar.f206554t = 6;
                        objD2 = c0Var14.d(dVar4, aVar);
                        if (objD2 != objE) {
                            input4 = inputC2;
                            input5 = input2;
                            input6 = inputC3;
                            input7 = streetField;
                            contactDetailsFields11 = contactDetailsFields10;
                            obj3 = objD2;
                            contactDetailsFields12 = contactDetailsFields11;
                            bVar11 = bVar10;
                            inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(input7, null, ((hz.g) obj3).a(), null, 5, null);
                            buildingNumberField = contactDetailsFields12.getBuildingNumberField();
                            ae3.c0 c0Var15 = this.validPersonalDataUseCase;
                            ae3.c0.a.C0121a c0121a4 = new ae3.c0.a.C0121a(contactDetailsFields12.getBuildingNumberField().getValue());
                            aVar.f206540d = bVar11;
                            aVar.f206541e = vq.j.a(contactDetailsFields5);
                            aVar.f206542f = contactDetailsFields12;
                            aVar.f206543g = contactDetailsFields9;
                            aVar.f206544h = phone4;
                            aVar.f206545j = input4;
                            aVar.f206546k = input5;
                            aVar.f206547l = input6;
                            aVar.f206548m = inputC4;
                            aVar.f206549n = buildingNumberField;
                            aVar.f206551q = i16;
                            aVar.f206554t = 7;
                            objD3 = c0Var15.d(c0121a4, aVar);
                            obj = objE;
                            if (objD3 == obj) {
                                return obj;
                            }
                            input8 = buildingNumberField;
                            input9 = input6;
                            phone5 = phone4;
                            contactDetailsFields13 = contactDetailsFields5;
                            contactDetailsFields14 = contactDetailsFields12;
                            obj3 = objD3;
                            input10 = input5;
                            contactDetailsFields15 = contactDetailsFields9;
                            input11 = input4;
                            contactDetailsFields16 = contactDetailsFields15;
                            phone6 = phone5;
                            obj2 = obj;
                            inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                            flatNumberField = contactDetailsFields14.getFlatNumberField();
                            ae3.c0 c0Var16 = this.validPersonalDataUseCase;
                            ae3.c0.a.c cVar4 = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                            aVar.f206540d = bVar11;
                            aVar.f206541e = vq.j.a(contactDetailsFields13);
                            aVar.f206542f = vq.j.a(contactDetailsFields14);
                            aVar.f206543g = contactDetailsFields16;
                            aVar.f206544h = phone6;
                            aVar.f206545j = input11;
                            aVar.f206546k = input10;
                            aVar.f206547l = input9;
                            aVar.f206548m = inputC4;
                            aVar.f206549n = inputC5;
                            aVar.f206550p = flatNumberField;
                            aVar.f206551q = i16;
                            aVar.f206554t = 8;
                            objD4 = c0Var16.d(cVar4, aVar);
                            if (objD4 == obj2) {
                                return obj2;
                            }
                            contactDetailsFields17 = contactDetailsFields16;
                            obj3 = objD4;
                            bVar12 = bVar11;
                            input12 = input9;
                            input13 = input10;
                            phone7 = phone6;
                            input14 = flatNumberField;
                            input15 = inputC5;
                            return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
                        }
                    }
                }
                return objE;
            case 4:
                i16 = aVar.f206551q;
                ContactDetailsFields.InterfaceC6083a.Input input16 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206545j;
                ContactDetailsFields.InterfaceC6083a.Phone phone10 = (ContactDetailsFields.InterfaceC6083a.Phone) aVar.f206544h;
                ContactDetailsFields contactDetailsFields23 = (ContactDetailsFields) aVar.f206543g;
                ContactDetailsFields contactDetailsFields24 = (ContactDetailsFields) aVar.f206542f;
                ContactDetailsFields contactDetailsFields25 = (ContactDetailsFields) aVar.f206541e;
                bVar7 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                input = input16;
                phone3 = phone10;
                contactDetailsFields7 = contactDetailsFields23;
                contactDetailsFields6 = contactDetailsFields24;
                contactDetailsFields5 = contactDetailsFields25;
                hz.b bVarA10 = ((hz.g) obj3).a();
                bVar8 = bVar7;
                inputC = ContactDetailsFields.InterfaceC6083a.Input.c(input, null, bVarA10, null, 5, null);
                inputC2 = ContactDetailsFields.InterfaceC6083a.Input.c(contactDetailsFields6.getPostCodeField(), null, this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(contactDetailsFields6.getPostCodeField().getValue(), false, 2, null)).a(), null, 5, null);
                cityField = contactDetailsFields6.getCityField();
                ae3.c0 c0Var17 = this.validPersonalDataUseCase;
                ae3.c0.a.b bVar19 = new ae3.c0.a.b(contactDetailsFields6.getCityField().getValue());
                aVar.f206540d = bVar8;
                aVar.f206541e = vq.j.a(contactDetailsFields5);
                aVar.f206542f = contactDetailsFields6;
                aVar.f206543g = contactDetailsFields7;
                aVar.f206544h = phone3;
                aVar.f206545j = inputC2;
                aVar.f206546k = inputC;
                aVar.f206547l = cityField;
                aVar.f206551q = i16;
                aVar.f206554t = 5;
                objD = c0Var17.d(bVar19, aVar);
                if (objD != objE) {
                    bVar9 = bVar8;
                    obj3 = objD;
                    contactDetailsFields8 = contactDetailsFields6;
                    contactDetailsFields9 = contactDetailsFields7;
                    phone4 = phone3;
                    input2 = inputC;
                    input3 = cityField;
                    contactDetailsFields10 = contactDetailsFields8;
                    bVar10 = bVar9;
                    inputC3 = ContactDetailsFields.InterfaceC6083a.Input.c(input3, null, ((hz.g) obj3).a(), null, 5, null);
                    streetField = contactDetailsFields10.getStreetField();
                    ae3.c0 c0Var18 = this.validPersonalDataUseCase;
                    ae3.c0.a.d dVar5 = new ae3.c0.a.d(contactDetailsFields10.getStreetField().getValue());
                    aVar.f206540d = bVar10;
                    aVar.f206541e = vq.j.a(contactDetailsFields5);
                    aVar.f206542f = contactDetailsFields10;
                    aVar.f206543g = contactDetailsFields9;
                    aVar.f206544h = phone4;
                    aVar.f206545j = inputC2;
                    aVar.f206546k = input2;
                    aVar.f206547l = inputC3;
                    aVar.f206548m = streetField;
                    aVar.f206551q = i16;
                    aVar.f206554t = 6;
                    objD2 = c0Var18.d(dVar5, aVar);
                    if (objD2 != objE) {
                        input4 = inputC2;
                        input5 = input2;
                        input6 = inputC3;
                        input7 = streetField;
                        contactDetailsFields11 = contactDetailsFields10;
                        obj3 = objD2;
                        contactDetailsFields12 = contactDetailsFields11;
                        bVar11 = bVar10;
                        inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(input7, null, ((hz.g) obj3).a(), null, 5, null);
                        buildingNumberField = contactDetailsFields12.getBuildingNumberField();
                        ae3.c0 c0Var19 = this.validPersonalDataUseCase;
                        ae3.c0.a.C0121a c0121a5 = new ae3.c0.a.C0121a(contactDetailsFields12.getBuildingNumberField().getValue());
                        aVar.f206540d = bVar11;
                        aVar.f206541e = vq.j.a(contactDetailsFields5);
                        aVar.f206542f = contactDetailsFields12;
                        aVar.f206543g = contactDetailsFields9;
                        aVar.f206544h = phone4;
                        aVar.f206545j = input4;
                        aVar.f206546k = input5;
                        aVar.f206547l = input6;
                        aVar.f206548m = inputC4;
                        aVar.f206549n = buildingNumberField;
                        aVar.f206551q = i16;
                        aVar.f206554t = 7;
                        objD3 = c0Var19.d(c0121a5, aVar);
                        obj = objE;
                        if (objD3 == obj) {
                            return obj;
                        }
                        input8 = buildingNumberField;
                        input9 = input6;
                        phone5 = phone4;
                        contactDetailsFields13 = contactDetailsFields5;
                        contactDetailsFields14 = contactDetailsFields12;
                        obj3 = objD3;
                        input10 = input5;
                        contactDetailsFields15 = contactDetailsFields9;
                        input11 = input4;
                        contactDetailsFields16 = contactDetailsFields15;
                        phone6 = phone5;
                        obj2 = obj;
                        inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                        flatNumberField = contactDetailsFields14.getFlatNumberField();
                        ae3.c0 c0Var110 = this.validPersonalDataUseCase;
                        ae3.c0.a.c cVar5 = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                        aVar.f206540d = bVar11;
                        aVar.f206541e = vq.j.a(contactDetailsFields13);
                        aVar.f206542f = vq.j.a(contactDetailsFields14);
                        aVar.f206543g = contactDetailsFields16;
                        aVar.f206544h = phone6;
                        aVar.f206545j = input11;
                        aVar.f206546k = input10;
                        aVar.f206547l = input9;
                        aVar.f206548m = inputC4;
                        aVar.f206549n = inputC5;
                        aVar.f206550p = flatNumberField;
                        aVar.f206551q = i16;
                        aVar.f206554t = 8;
                        objD4 = c0Var110.d(cVar5, aVar);
                        if (objD4 == obj2) {
                            return obj2;
                        }
                        contactDetailsFields17 = contactDetailsFields16;
                        obj3 = objD4;
                        bVar12 = bVar11;
                        input12 = input9;
                        input13 = input10;
                        phone7 = phone6;
                        input14 = flatNumberField;
                        input15 = inputC5;
                        return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
                    }
                }
                return objE;
            case 5:
                i16 = aVar.f206551q;
                ContactDetailsFields.InterfaceC6083a.Input input17 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206547l;
                input2 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206546k;
                ContactDetailsFields.InterfaceC6083a.Input input18 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206545j;
                ContactDetailsFields.InterfaceC6083a.Phone phone11 = (ContactDetailsFields.InterfaceC6083a.Phone) aVar.f206544h;
                ContactDetailsFields contactDetailsFields26 = (ContactDetailsFields) aVar.f206543g;
                contactDetailsFields8 = (ContactDetailsFields) aVar.f206542f;
                ContactDetailsFields contactDetailsFields27 = (ContactDetailsFields) aVar.f206541e;
                bVar9 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                input3 = input17;
                inputC2 = input18;
                phone4 = phone11;
                contactDetailsFields9 = contactDetailsFields26;
                contactDetailsFields5 = contactDetailsFields27;
                contactDetailsFields10 = contactDetailsFields8;
                bVar10 = bVar9;
                inputC3 = ContactDetailsFields.InterfaceC6083a.Input.c(input3, null, ((hz.g) obj3).a(), null, 5, null);
                streetField = contactDetailsFields10.getStreetField();
                ae3.c0 c0Var111 = this.validPersonalDataUseCase;
                ae3.c0.a.d dVar6 = new ae3.c0.a.d(contactDetailsFields10.getStreetField().getValue());
                aVar.f206540d = bVar10;
                aVar.f206541e = vq.j.a(contactDetailsFields5);
                aVar.f206542f = contactDetailsFields10;
                aVar.f206543g = contactDetailsFields9;
                aVar.f206544h = phone4;
                aVar.f206545j = inputC2;
                aVar.f206546k = input2;
                aVar.f206547l = inputC3;
                aVar.f206548m = streetField;
                aVar.f206551q = i16;
                aVar.f206554t = 6;
                objD2 = c0Var111.d(dVar6, aVar);
                if (objD2 != objE) {
                    input4 = inputC2;
                    input5 = input2;
                    input6 = inputC3;
                    input7 = streetField;
                    contactDetailsFields11 = contactDetailsFields10;
                    obj3 = objD2;
                    contactDetailsFields12 = contactDetailsFields11;
                    bVar11 = bVar10;
                    inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(input7, null, ((hz.g) obj3).a(), null, 5, null);
                    buildingNumberField = contactDetailsFields12.getBuildingNumberField();
                    ae3.c0 c0Var112 = this.validPersonalDataUseCase;
                    ae3.c0.a.C0121a c0121a6 = new ae3.c0.a.C0121a(contactDetailsFields12.getBuildingNumberField().getValue());
                    aVar.f206540d = bVar11;
                    aVar.f206541e = vq.j.a(contactDetailsFields5);
                    aVar.f206542f = contactDetailsFields12;
                    aVar.f206543g = contactDetailsFields9;
                    aVar.f206544h = phone4;
                    aVar.f206545j = input4;
                    aVar.f206546k = input5;
                    aVar.f206547l = input6;
                    aVar.f206548m = inputC4;
                    aVar.f206549n = buildingNumberField;
                    aVar.f206551q = i16;
                    aVar.f206554t = 7;
                    objD3 = c0Var112.d(c0121a6, aVar);
                    obj = objE;
                    if (objD3 == obj) {
                        return obj;
                    }
                    input8 = buildingNumberField;
                    input9 = input6;
                    phone5 = phone4;
                    contactDetailsFields13 = contactDetailsFields5;
                    contactDetailsFields14 = contactDetailsFields12;
                    obj3 = objD3;
                    input10 = input5;
                    contactDetailsFields15 = contactDetailsFields9;
                    input11 = input4;
                    contactDetailsFields16 = contactDetailsFields15;
                    phone6 = phone5;
                    obj2 = obj;
                    inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                    flatNumberField = contactDetailsFields14.getFlatNumberField();
                    ae3.c0 c0Var113 = this.validPersonalDataUseCase;
                    ae3.c0.a.c cVar6 = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                    aVar.f206540d = bVar11;
                    aVar.f206541e = vq.j.a(contactDetailsFields13);
                    aVar.f206542f = vq.j.a(contactDetailsFields14);
                    aVar.f206543g = contactDetailsFields16;
                    aVar.f206544h = phone6;
                    aVar.f206545j = input11;
                    aVar.f206546k = input10;
                    aVar.f206547l = input9;
                    aVar.f206548m = inputC4;
                    aVar.f206549n = inputC5;
                    aVar.f206550p = flatNumberField;
                    aVar.f206551q = i16;
                    aVar.f206554t = 8;
                    objD4 = c0Var113.d(cVar6, aVar);
                    if (objD4 == obj2) {
                        return obj2;
                    }
                    contactDetailsFields17 = contactDetailsFields16;
                    obj3 = objD4;
                    bVar12 = bVar11;
                    input12 = input9;
                    input13 = input10;
                    phone7 = phone6;
                    input14 = flatNumberField;
                    input15 = inputC5;
                    return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
                }
                return objE;
            case 6:
                i16 = aVar.f206551q;
                input7 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206548m;
                ContactDetailsFields.InterfaceC6083a.Input input19 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206547l;
                ContactDetailsFields.InterfaceC6083a.Input input20 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206546k;
                ContactDetailsFields.InterfaceC6083a.Input input21 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206545j;
                ContactDetailsFields.InterfaceC6083a.Phone phone12 = (ContactDetailsFields.InterfaceC6083a.Phone) aVar.f206544h;
                ContactDetailsFields contactDetailsFields28 = (ContactDetailsFields) aVar.f206543g;
                ContactDetailsFields contactDetailsFields29 = (ContactDetailsFields) aVar.f206542f;
                ContactDetailsFields contactDetailsFields30 = (ContactDetailsFields) aVar.f206541e;
                vf3.c.b bVar20 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                contactDetailsFields9 = contactDetailsFields28;
                contactDetailsFields5 = contactDetailsFields30;
                bVar10 = bVar20;
                input6 = input19;
                input4 = input21;
                phone4 = phone12;
                contactDetailsFields11 = contactDetailsFields29;
                input5 = input20;
                contactDetailsFields12 = contactDetailsFields11;
                bVar11 = bVar10;
                inputC4 = ContactDetailsFields.InterfaceC6083a.Input.c(input7, null, ((hz.g) obj3).a(), null, 5, null);
                buildingNumberField = contactDetailsFields12.getBuildingNumberField();
                ae3.c0 c0Var114 = this.validPersonalDataUseCase;
                ae3.c0.a.C0121a c0121a7 = new ae3.c0.a.C0121a(contactDetailsFields12.getBuildingNumberField().getValue());
                aVar.f206540d = bVar11;
                aVar.f206541e = vq.j.a(contactDetailsFields5);
                aVar.f206542f = contactDetailsFields12;
                aVar.f206543g = contactDetailsFields9;
                aVar.f206544h = phone4;
                aVar.f206545j = input4;
                aVar.f206546k = input5;
                aVar.f206547l = input6;
                aVar.f206548m = inputC4;
                aVar.f206549n = buildingNumberField;
                aVar.f206551q = i16;
                aVar.f206554t = 7;
                objD3 = c0Var114.d(c0121a7, aVar);
                obj = objE;
                if (objD3 == obj) {
                    return obj;
                }
                input8 = buildingNumberField;
                input9 = input6;
                phone5 = phone4;
                contactDetailsFields13 = contactDetailsFields5;
                contactDetailsFields14 = contactDetailsFields12;
                obj3 = objD3;
                input10 = input5;
                contactDetailsFields15 = contactDetailsFields9;
                input11 = input4;
                contactDetailsFields16 = contactDetailsFields15;
                phone6 = phone5;
                obj2 = obj;
                inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                flatNumberField = contactDetailsFields14.getFlatNumberField();
                ae3.c0 c0Var115 = this.validPersonalDataUseCase;
                ae3.c0.a.c cVar7 = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                aVar.f206540d = bVar11;
                aVar.f206541e = vq.j.a(contactDetailsFields13);
                aVar.f206542f = vq.j.a(contactDetailsFields14);
                aVar.f206543g = contactDetailsFields16;
                aVar.f206544h = phone6;
                aVar.f206545j = input11;
                aVar.f206546k = input10;
                aVar.f206547l = input9;
                aVar.f206548m = inputC4;
                aVar.f206549n = inputC5;
                aVar.f206550p = flatNumberField;
                aVar.f206551q = i16;
                aVar.f206554t = 8;
                objD4 = c0Var115.d(cVar7, aVar);
                if (objD4 == obj2) {
                    return obj2;
                }
                contactDetailsFields17 = contactDetailsFields16;
                obj3 = objD4;
                bVar12 = bVar11;
                input12 = input9;
                input13 = input10;
                phone7 = phone6;
                input14 = flatNumberField;
                input15 = inputC5;
                return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
            case 7:
                i16 = aVar.f206551q;
                ContactDetailsFields.InterfaceC6083a.Input input22 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206549n;
                ContactDetailsFields.InterfaceC6083a.Input input23 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206548m;
                ContactDetailsFields.InterfaceC6083a.Input input24 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206547l;
                ContactDetailsFields.InterfaceC6083a.Input input25 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206546k;
                ContactDetailsFields.InterfaceC6083a.Input input26 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206545j;
                ContactDetailsFields.InterfaceC6083a.Phone phone13 = (ContactDetailsFields.InterfaceC6083a.Phone) aVar.f206544h;
                ContactDetailsFields contactDetailsFields31 = (ContactDetailsFields) aVar.f206543g;
                ContactDetailsFields contactDetailsFields32 = (ContactDetailsFields) aVar.f206542f;
                ContactDetailsFields contactDetailsFields33 = (ContactDetailsFields) aVar.f206541e;
                vf3.c.b bVar21 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                obj = objE;
                bVar11 = bVar21;
                input9 = input24;
                input8 = input22;
                inputC4 = input23;
                input10 = input25;
                contactDetailsFields14 = contactDetailsFields32;
                contactDetailsFields13 = contactDetailsFields33;
                input11 = input26;
                phone5 = phone13;
                contactDetailsFields15 = contactDetailsFields31;
                contactDetailsFields16 = contactDetailsFields15;
                phone6 = phone5;
                obj2 = obj;
                inputC5 = ContactDetailsFields.InterfaceC6083a.Input.c(input8, null, ((hz.g) obj3).a(), null, 5, null);
                flatNumberField = contactDetailsFields14.getFlatNumberField();
                ae3.c0 c0Var116 = this.validPersonalDataUseCase;
                ae3.c0.a.c cVar8 = new ae3.c0.a.c(contactDetailsFields14.getFlatNumberField().getValue());
                aVar.f206540d = bVar11;
                aVar.f206541e = vq.j.a(contactDetailsFields13);
                aVar.f206542f = vq.j.a(contactDetailsFields14);
                aVar.f206543g = contactDetailsFields16;
                aVar.f206544h = phone6;
                aVar.f206545j = input11;
                aVar.f206546k = input10;
                aVar.f206547l = input9;
                aVar.f206548m = inputC4;
                aVar.f206549n = inputC5;
                aVar.f206550p = flatNumberField;
                aVar.f206551q = i16;
                aVar.f206554t = 8;
                objD4 = c0Var116.d(cVar8, aVar);
                if (objD4 == obj2) {
                    return obj2;
                }
                contactDetailsFields17 = contactDetailsFields16;
                obj3 = objD4;
                bVar12 = bVar11;
                input12 = input9;
                input13 = input10;
                phone7 = phone6;
                input14 = flatNumberField;
                input15 = inputC5;
                return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
            case 8:
                input14 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206550p;
                ContactDetailsFields.InterfaceC6083a.Input input27 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206549n;
                inputC4 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206548m;
                ContactDetailsFields.InterfaceC6083a.Input input28 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206547l;
                ContactDetailsFields.InterfaceC6083a.Input input29 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206546k;
                ContactDetailsFields.InterfaceC6083a.Input input30 = (ContactDetailsFields.InterfaceC6083a.Input) aVar.f206545j;
                ContactDetailsFields.InterfaceC6083a.Phone phone14 = (ContactDetailsFields.InterfaceC6083a.Phone) aVar.f206544h;
                ContactDetailsFields contactDetailsFields34 = (ContactDetailsFields) aVar.f206543g;
                bVar12 = (vf3.c.b) aVar.f206540d;
                oq.u.b(obj3);
                input11 = input30;
                phone7 = phone14;
                contactDetailsFields17 = contactDetailsFields34;
                input15 = input27;
                input12 = input28;
                input13 = input29;
                return bVar12.a(new FormData(contactDetailsFields17.a(phone7, input13, input11, input12, inputC4, input15, ContactDetailsFields.InterfaceC6083a.Input.c(input14, null, ((hz.g) obj3).a(), null, 5, null)), null, 2, null));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEPersonalData P9(h0 h0Var, ContactDetailsFields contactDetailsFields, BEPersonalData bEPersonalData) {
        BEContactDetailsAddress address = h0Var.contract.g6().getAddress();
        iy.b0 value = contactDetailsFields.getCityField().getValue();
        iy.b0 value2 = contactDetailsFields.getPostCodeField().getValue();
        iy.b0 value3 = contactDetailsFields.getStreetField().getValue();
        iy.b0 value4 = contactDetailsFields.getBuildingNumberField().getValue();
        iy.b0 value5 = contactDetailsFields.getFlatNumberField().getValue();
        if (fu.r.t0(iy.c0.e(value5))) {
            value5 = null;
        }
        return BEPersonalData.b(bEPersonalData, null, null, contactDetailsFields.getPhoneField().getPhoneNumber(), contactDetailsFields.getEmailField().getValue(), address.b(value, value2, value3, value4, value5), false, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q9(final dx.b bVar, final vf3.a aVar, tq.e<? super oq.i0> eVar) {
        Object objF = F(new vf3.a.b.ShowError(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: vf3.u
            @Override // er.l
            public final Object b(Object obj) {
                return h0.R9(this.f206677a, bVar, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(h0 h0Var, dx.b bVar, vf3.a aVar, ib4.c.b bVar2) {
        if (h0Var.isSameVehiclesErrorUC.c(new de3.c.Params(bVar)).booleanValue()) {
            h0Var.d9(vf3.a.b.f.f206451a);
        } else if (h0Var.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue()) {
            h0Var.d9(vf3.a.b.c.f206448a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            h0Var.d9(aVar);
        } else if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close)) {
            throw new oq.p();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vf3.d.a S9(vf3.c cVar) {
        return this.mapper.b(new xf3.i.Params(cVar, b9(vf3.a.o.f206473a), b9(vf3.a.j.f206466a), new er.l() { // from class: vf3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.T9(this.f206488a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vf3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.U9(this.f206506a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vf3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.V9(this.f206510a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vf3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.W9(this.f206513a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vf3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.X9(this.f206516a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vf3.p
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Y9(this.f206665a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vf3.q
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Z9(this.f206667a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vf3.r
            @Override // er.l
            public final Object b(Object obj) {
                return h0.aa(this.f206669a, (iy.b0) obj);
            }
        }, b9(vf3.a.b.C5399a.f206446a), b9(vf3.a.b.C5400b.f206447a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnPhoneNumberChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnPhonePrefixChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnEmailChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnPostCodeChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnCityChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnStreetChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnBuildingNumberChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(h0 h0Var, iy.b0 b0Var) {
        h0Var.d9(new vf3.a.OnFlatNumberChanged(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ba(final PersonalDataContainer personalDataContainer, tq.e<? super oq.i0> eVar) throws Throwable {
        Object objOa = oa(new er.l() { // from class: vf3.s
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ca(personalDataContainer, (BEPersonalData) obj);
            }
        }, eVar);
        return objOa == uq.b.e() ? objOa : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEPersonalData ca(PersonalDataContainer personalDataContainer, BEPersonalData bEPersonalData) {
        iy.b0 city;
        iy.b0 postcode;
        iy.b0 street;
        iy.b0 buildingNumber;
        iy.b0 flatNumber;
        iy.b0 postalCode;
        String strE;
        String strB;
        iy.b0 name = personalDataContainer.getName();
        if (name == null) {
            name = iy.b0.INSTANCE.a();
        }
        iy.b0 b0Var = name;
        iy.b0 familyName = personalDataContainer.getFamilyName();
        if (familyName == null) {
            familyName = iy.b0.INSTANCE.a();
        }
        iy.b0 b0Var2 = familyName;
        PersonalAddressContainer permanentAddress = personalDataContainer.getPermanentAddress();
        if (permanentAddress == null || (city = permanentAddress.getMunicipality()) == null) {
            city = BEContactDetailsAddress.INSTANCE.a().getCity();
        }
        iy.b0 b0Var3 = city;
        PersonalAddressContainer permanentAddress2 = personalDataContainer.getPermanentAddress();
        if (permanentAddress2 == null || (postalCode = permanentAddress2.getPostalCode()) == null || (strE = iy.c0.e(postalCode)) == null || (strB = t04.a.b(strE, 0, 1, null)) == null || (postcode = iy.c0.g(strB)) == null) {
            postcode = BEContactDetailsAddress.INSTANCE.a().getPostcode();
        }
        iy.b0 b0Var4 = postcode;
        PersonalAddressContainer permanentAddress3 = personalDataContainer.getPermanentAddress();
        if (permanentAddress3 == null || (street = permanentAddress3.getStreetName()) == null) {
            street = BEContactDetailsAddress.INSTANCE.a().getStreet();
        }
        iy.b0 b0Var5 = street;
        PersonalAddressContainer permanentAddress4 = personalDataContainer.getPermanentAddress();
        if (permanentAddress4 == null || (buildingNumber = permanentAddress4.getHouseNumber()) == null) {
            buildingNumber = BEContactDetailsAddress.INSTANCE.a().getBuildingNumber();
        }
        iy.b0 b0Var6 = buildingNumber;
        PersonalAddressContainer permanentAddress5 = personalDataContainer.getPermanentAddress();
        if (permanentAddress5 == null || (flatNumber = permanentAddress5.getApartmentNumber()) == null) {
            flatNumber = BEContactDetailsAddress.INSTANCE.a().getFlatNumber();
        }
        return BEPersonalData.b(bEPersonalData, b0Var, b0Var2, null, null, new BEContactDetailsAddress(b0Var3, b0Var4, b0Var5, b0Var6, flatNumber), false, 44, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object da(ContactDetails contactDetails, tq.e<? super oq.i0> eVar) throws Throwable {
        final iy.b0 value;
        final iy.b0 value2;
        Object next;
        ContactDetail emailData = contactDetails.getEmailData();
        final iy.b0 b0VarG = null;
        if (emailData != null) {
            value = emailData.getValue();
            if (emailData.getStatus() != xi0.c.IN_REGISTRY) {
                value = null;
            }
        } else {
            value = null;
        }
        ContactDetail phoneData = contactDetails.getPhoneData();
        if (phoneData != null) {
            value2 = phoneData.getValue();
            if (phoneData.getStatus() != xi0.c.IN_REGISTRY) {
                value2 = null;
            }
        } else {
            value2 = null;
        }
        ContactDetail phoneData2 = contactDetails.getPhoneData();
        if (phoneData2 != null) {
            Iterator<T> it = phoneData2.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((ContactDetailAdditionalValue) next).getKey(), "PREFIX"));
            ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next;
            iy.b0 value3 = contactDetailAdditionalValue != null ? contactDetailAdditionalValue.getValue() : null;
            if (phoneData2.getStatus() != xi0.c.IN_REGISTRY) {
                value3 = null;
            }
            if (value3 != null) {
                String strE = iy.c0.e(value3);
                if (TextUtils.isDigitsOnly(strE)) {
                    b0VarG = iy.c0.g('+' + strE);
                } else {
                    b0VarG = value3;
                }
            }
        }
        Object objOa = oa(new er.l() { // from class: vf3.t
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ea(value, b0VarG, value2, (BEPersonalData) obj);
            }
        }, eVar);
        return objOa == uq.b.e() ? objOa : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEPersonalData ea(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, BEPersonalData bEPersonalData) {
        if (b0Var == null) {
            b0Var = bEPersonalData.getEmail();
        }
        iy.b0 b0Var4 = b0Var;
        if (b0Var2 == null) {
            b0Var2 = bEPersonalData.getPhoneNumber().h();
        }
        iy.b0 b0VarC = PhoneNumber.c.c(b0Var2);
        if (b0Var3 == null) {
            b0Var3 = bEPersonalData.getPhoneNumber().g();
        }
        return BEPersonalData.b(bEPersonalData, null, null, new PhoneNumber(b0VarC, PhoneNumber.b.c(b0Var3), null), b0Var4, null, false, 51, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(final h0 h0Var, k10.v vVar) {
        vVar.c(fr.q0.c(vf3.c.class), new er.l() { // from class: vf3.o
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ha(this.f206663a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(vf3.c.a.class), new er.l() { // from class: vf3.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ia(this.f206688a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(vf3.c.b.class), new er.l() { // from class: vf3.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ja(this.f206690a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(vf3.c.b.Loading.class), new er.l() { // from class: vf3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ka(this.f206474a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(vf3.c.b.class), new er.l() { // from class: vf3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.la(this.f206479a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(h0 h0Var, k10.z zVar) {
        c cVar = h0Var.new c(null);
        zVar.x(fr.q0.c(vf3.a.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        k10.k.s(zVar, h0Var.contract.i(), null, h0Var.new d(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(h0 h0Var, k10.z zVar) {
        zVar.C(h0Var.new e(null));
        f fVar = h0Var.new f(null);
        zVar.v(fr.q0.c(vf3.a.OnUpdate.class), k10.o.CANCEL_PREVIOUS, fVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(h0 h0Var, k10.z zVar) {
        g gVar = h0Var.new g(null);
        zVar.v(fr.q0.c(vf3.a.OnUpdate.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(h0 h0Var, k10.z zVar) {
        k10.k.m(zVar, h0Var.downloadContactDetailsDataMonitorUC.e(gz.b.a.C1792a.f78542a), null, h0Var.new h(null), 2, null);
        i iVar = h0Var.new i(null);
        zVar.x(fr.q0.c(vf3.a.class), k10.o.CANCEL_PREVIOUS, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(h0 h0Var, k10.z zVar) {
        m mVar = h0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(vf3.a.OnMIdCardDataLoaded.class), oVar, mVar);
        zVar.x(fr.q0.c(vf3.a.OnRdkDataDownloaded.class), oVar, h0Var.new n(null));
        zVar.v(fr.q0.c(vf3.a.OnPhoneNumberChanged.class), oVar, h0Var.new o(null));
        zVar.v(fr.q0.c(vf3.a.OnPhonePrefixChanged.class), oVar, h0Var.new p(null));
        zVar.v(fr.q0.c(vf3.a.OnEmailChanged.class), oVar, h0Var.new q(null));
        zVar.v(fr.q0.c(vf3.a.OnPostCodeChanged.class), oVar, h0Var.new r(null));
        zVar.v(fr.q0.c(vf3.a.OnCityChanged.class), oVar, h0Var.new s(null));
        zVar.v(fr.q0.c(vf3.a.OnStreetChanged.class), oVar, h0Var.new t(null));
        zVar.v(fr.q0.c(vf3.a.OnBuildingNumberChanged.class), oVar, h0Var.new u(null));
        zVar.v(fr.q0.c(vf3.a.OnFlatNumberChanged.class), oVar, h0Var.new j(null));
        zVar.v(fr.q0.c(vf3.a.o.class), oVar, h0Var.new k(null));
        zVar.x(fr.q0.c(vf3.a.C5398a.class), oVar, h0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ma(final er.l<? super BEContactDetailsAddress, BEContactDetailsAddress> lVar, tq.e<? super oq.i0> eVar) throws Throwable {
        Object objOa = oa(new er.l() { // from class: vf3.w
            @Override // er.l
            public final Object b(Object obj) {
                return h0.na(lVar, (BEPersonalData) obj);
            }
        }, eVar);
        return objOa == uq.b.e() ? objOa : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEPersonalData na(er.l lVar, BEPersonalData bEPersonalData) {
        return BEPersonalData.b(bEPersonalData, null, null, null, null, (BEContactDetailsAddress) lVar.b(bEPersonalData.getAddress()), false, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oa(er.l<? super BEPersonalData, BEPersonalData> lVar, tq.e<? super oq.i0> eVar) throws Throwable {
        v vVar;
        su.a aVar;
        int i15;
        Throwable th4;
        su.a aVar2;
        if (eVar instanceof v) {
            vVar = (v) eVar;
            int i16 = vVar.f206649k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                vVar.f206649k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                vVar = new v(eVar);
            }
        } else {
            vVar = new v(eVar);
        }
        Object obj = vVar.f206647h;
        Object objE = uq.b.e();
        int i17 = vVar.f206649k;
        try {
            if (i17 == 0) {
                oq.u.b(obj);
                aVar = this.updateNewCollisionDataMutex;
                vVar.f206643d = lVar;
                vVar.f206644e = aVar;
                vVar.f206645f = 0;
                vVar.f206649k = 1;
                if (aVar.h(null, vVar) != objE) {
                    i15 = 0;
                }
                return objE;
            }
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (su.a) vVar.f206644e;
                try {
                    oq.u.b(obj);
                    oq.i0 i0Var = oq.i0.f148189a;
                    aVar2.r(null);
                    return oq.i0.f148189a;
                } catch (Throwable th5) {
                    th4 = th5;
                    aVar2.r(null);
                    throw th4;
                }
            }
            int i18 = vVar.f206645f;
            su.a aVar3 = (su.a) vVar.f206644e;
            er.l<? super BEPersonalData, BEPersonalData> lVar2 = (er.l) vVar.f206643d;
            oq.u.b(obj);
            aVar = aVar3;
            i15 = i18;
            lVar = lVar2;
            wf3.a aVar4 = this.contract;
            vVar.f206643d = vq.j.a(lVar);
            vVar.f206644e = aVar;
            vVar.f206645f = i15;
            vVar.f206646g = 0;
            vVar.f206649k = 2;
            if (aVar4.D3(lVar, vVar) != objE) {
                aVar2 = aVar;
                oq.i0 i0Var2 = oq.i0.f148189a;
                aVar2.r(null);
                return oq.i0.f148189a;
            }
            return objE;
        } catch (Throwable th6) {
            su.a aVar5 = aVar;
            th4 = th6;
            aVar2 = aVar5;
            aVar2.r(null);
            throw th4;
        }
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(vf3.a.b bVar, tq.e<? super oq.i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    public xw.b<vf3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<vf3.c, vf3.a> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: fa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(wf3.a aVar) {
        super.P5(aVar);
    }

    @Override // l00.e
    public mu.p0<vf3.d.a> getState() {
        return this.state;
    }
}
