package yu2;

import bu2.VerificationCheckData;
import fr.q0;
import mu.p0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vu2.PeselVerificationInputData;
import zt2.VerificationCheckValidation;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u001b\u0010\u001b\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003088\u0014X\u0094\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010#\u001a\b\u0012\u0004\u0012\u00020$0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lyu2/y;", "Ll00/g;", "Lyu2/n;", "", "Lyu2/o;", "Lyy/a;", "stateMachineFactory", "Lav2/d;", "verificationCheckMapper", "Lzt2/i;", "checkVerificationDataCorrectUseCase", "Lyu2/m;", "setupContract", "<init>", "(Lyy/a;Lav2/d;Lzt2/i;Lyu2/m;)V", "Lbv2/a;", "", "savedPeselNumber", "Lmx/a;", "M9", "(Lbv2/a;Ljava/lang/String;)Lmx/a;", "savedIdNumber", "L9", "O9", "N9", "Lhz/b;", "validationState", "A9", "(Lbv2/a;Lhz/b;)Lhz/b;", "I9", "Lyu2/n$b;", "snapshot", "K9", "(Lyu2/n$b;)Ljava/lang/String;", "J9", "state", "Lyu2/o$a;", "B9", "(Lyu2/n;)Lyu2/o$a;", "b", "Lav2/d;", "c", "Lzt2/i;", "d", "Lyu2/m;", "Lyu2/n$a;", "e", "Lyu2/n$a;", "initialState", "Lxw/b;", "Lyu2/e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<n, Object> implements o, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final av2.d verificationCheckMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zt2.i checkVerificationDataCorrectUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m setupContract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yu2.e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<n, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<o.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<o.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f229670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f229671b;

        /* JADX INFO: renamed from: yu2.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6166a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f229672a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f229673b;

            /* JADX INFO: renamed from: yu2.y$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6167a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f229674d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f229675e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f229676f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f229678h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f229679j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f229680k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f229681l;

                public C6167a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f229674d = obj;
                    this.f229675e |= PKIFailureInfo.systemUnavail;
                    return C6166a.this.F(null, this);
                }
            }

            public C6166a(mu.h hVar, y yVar) {
                this.f229672a = hVar;
                this.f229673b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6167a c6167a;
                if (eVar instanceof C6167a) {
                    c6167a = (C6167a) eVar;
                    int i15 = c6167a.f229675e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6167a.f229675e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6167a = new C6167a(eVar);
                    }
                } else {
                    c6167a = new C6167a(eVar);
                }
                Object obj2 = c6167a.f229674d;
                Object objE = uq.b.e();
                int i16 = c6167a.f229675e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f229672a;
                    o.Data dataB9 = this.f229673b.B9((n) obj);
                    c6167a.f229676f = vq.j.a(obj);
                    c6167a.f229678h = vq.j.a(c6167a);
                    c6167a.f229679j = vq.j.a(obj);
                    c6167a.f229680k = vq.j.a(hVar);
                    c6167a.f229681l = 0;
                    c6167a.f229675e = 1;
                    if (hVar.F(dataB9, c6167a) == objE) {
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

        public a(mu.g gVar, y yVar) {
            this.f229670a = gVar;
            this.f229671b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o.Data> hVar, tq.e eVar) {
            Object objA = this.f229670a.a(new C6166a(hVar, this.f229671b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyu2/n$a;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<n.a>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229683f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized V(y yVar, VerificationCheckData verificationCheckData, n.a aVar) {
            Label labelM9 = yVar.M9(verificationCheckData.getSelectedRadioButtonId(), verificationCheckData.getPesel());
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return new n.Initialized(new PeselVerificationInputData(labelM9, c2039b), new PeselVerificationInputData(yVar.L9(verificationCheckData.getSelectedRadioButtonId(), verificationCheckData.getIdNumber()), c2039b), new PeselVerificationInputData(yVar.O9(verificationCheckData.getSelectedRadioButtonId(), verificationCheckData.getPesel()), c2039b), new PeselVerificationInputData(yVar.N9(verificationCheckData.getSelectedRadioButtonId(), verificationCheckData.getIdNumber()), c2039b), new PeselVerificationInputData(mx.b.b(verificationCheckData.getReason(), "reason"), c2039b), verificationCheckData.getSelectedRadioButtonId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized X(k10.c0 c0Var, n.a aVar) {
            return new n.Initialized(((n.a) c0Var.a()).getCitizenPeselNumberInputData(), ((n.a) c0Var.a()).getCitizenIdNumberInputData(), ((n.a) c0Var.a()).getNonCitizenPeselNumberInputData(), ((n.a) c0Var.a()).getNonCitizenIdNumberInputData(), ((n.a) c0Var.a()).getReasonInputData(), ((n.a) c0Var.a()).getSelectedRadioButtonId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f229683f;
            Object objE = uq.b.e();
            int i15 = this.f229682e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = y.this.setupContract;
                this.f229683f = c0Var;
                this.f229682e = 1;
                obj = mVar.s(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final VerificationCheckData verificationCheckData = (VerificationCheckData) obj;
            if (verificationCheckData != null) {
                final y yVar = y.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: yu2.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.b.V(yVar, verificationCheckData, (n.a) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            return c0Var.d(new er.l() { // from class: yu2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.b.X(c0Var, (n.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<n.a> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = y.this.new b(eVar);
            bVar.f229683f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu2/l;", "action", "Lk10/c0;", "Lyu2/n$b;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lyu2/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnVerificationCheckRadioButtonChanged, k10.c0<n.Initialized>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229687g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized O(OnVerificationCheckRadioButtonChanged onVerificationCheckRadioButtonChanged, n.Initialized initialized) {
            bv2.a radioButtonId = onVerificationCheckRadioButtonChanged.getRadioButtonId();
            PeselVerificationInputData citizenPeselNumberInputData = initialized.getCitizenPeselNumberInputData();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return n.Initialized.h(initialized, PeselVerificationInputData.b(citizenPeselNumberInputData, null, c2039b, 1, null), PeselVerificationInputData.b(initialized.getCitizenIdNumberInputData(), null, c2039b, 1, null), PeselVerificationInputData.b(initialized.getNonCitizenPeselNumberInputData(), null, c2039b, 1, null), PeselVerificationInputData.b(initialized.getNonCitizenIdNumberInputData(), null, c2039b, 1, null), null, radioButtonId, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnVerificationCheckRadioButtonChanged onVerificationCheckRadioButtonChanged = (OnVerificationCheckRadioButtonChanged) this.f229686f;
            k10.c0 c0Var = (k10.c0) this.f229687g;
            uq.b.e();
            if (this.f229685e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.c.O(onVerificationCheckRadioButtonChanged, (n.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnVerificationCheckRadioButtonChanged onVerificationCheckRadioButtonChanged, k10.c0<n.Initialized> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            c cVar = new c(eVar);
            cVar.f229686f = onVerificationCheckRadioButtonChanged;
            cVar.f229687g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu2/g;", "action", "Lk10/c0;", "Lyu2/n$b;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lyu2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnCitizenPeselPeselChanged, k10.c0<n.Initialized>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229690g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized O(OnCitizenPeselPeselChanged onCitizenPeselPeselChanged, n.Initialized initialized) {
            return n.Initialized.h(initialized, new PeselVerificationInputData(mx.b.b(onCitizenPeselPeselChanged.getPesel(), "pesel"), hz.b.C2039b.f86846c), null, null, null, null, null, 62, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCitizenPeselPeselChanged onCitizenPeselPeselChanged = (OnCitizenPeselPeselChanged) this.f229689f;
            k10.c0 c0Var = (k10.c0) this.f229690g;
            uq.b.e();
            if (this.f229688e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.d.O(onCitizenPeselPeselChanged, (n.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCitizenPeselPeselChanged onCitizenPeselPeselChanged, k10.c0<n.Initialized> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            d dVar = new d(eVar);
            dVar.f229689f = onCitizenPeselPeselChanged;
            dVar.f229690g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu2/f;", "action", "Lk10/c0;", "Lyu2/n$b;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lyu2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnCitizenIdNumberChanged, k10.c0<n.Initialized>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229693g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized O(OnCitizenIdNumberChanged onCitizenIdNumberChanged, n.Initialized initialized) {
            return n.Initialized.h(initialized, null, new PeselVerificationInputData(mx.b.b(onCitizenIdNumberChanged.getIdNumber(), "idNumber"), hz.b.C2039b.f86846c), null, null, null, null, 61, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCitizenIdNumberChanged onCitizenIdNumberChanged = (OnCitizenIdNumberChanged) this.f229692f;
            k10.c0 c0Var = (k10.c0) this.f229693g;
            uq.b.e();
            if (this.f229691e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.e.O(onCitizenIdNumberChanged, (n.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCitizenIdNumberChanged onCitizenIdNumberChanged, k10.c0<n.Initialized> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f229692f = onCitizenIdNumberChanged;
            eVar2.f229693g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu2/j;", "action", "Lk10/c0;", "Lyu2/n$b;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lyu2/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnNonCitizenPeselPeselChanged, k10.c0<n.Initialized>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229696g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized O(OnNonCitizenPeselPeselChanged onNonCitizenPeselPeselChanged, n.Initialized initialized) {
            return n.Initialized.h(initialized, null, null, new PeselVerificationInputData(mx.b.b(onNonCitizenPeselPeselChanged.getPesel(), "pesel"), hz.b.C2039b.f86846c), null, null, null, 59, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnNonCitizenPeselPeselChanged onNonCitizenPeselPeselChanged = (OnNonCitizenPeselPeselChanged) this.f229695f;
            k10.c0 c0Var = (k10.c0) this.f229696g;
            uq.b.e();
            if (this.f229694e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.f.O(onNonCitizenPeselPeselChanged, (n.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnNonCitizenPeselPeselChanged onNonCitizenPeselPeselChanged, k10.c0<n.Initialized> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            f fVar = new f(eVar);
            fVar.f229695f = onNonCitizenPeselPeselChanged;
            fVar.f229696g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu2/i;", "action", "Lk10/c0;", "Lyu2/n$b;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lyu2/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnNonCitizenIdNumberChanged, k10.c0<n.Initialized>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229699g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized O(OnNonCitizenIdNumberChanged onNonCitizenIdNumberChanged, n.Initialized initialized) {
            return n.Initialized.h(initialized, null, null, null, new PeselVerificationInputData(mx.b.b(onNonCitizenIdNumberChanged.getIdNumber(), "idNumber"), hz.b.C2039b.f86846c), null, null, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnNonCitizenIdNumberChanged onNonCitizenIdNumberChanged = (OnNonCitizenIdNumberChanged) this.f229698f;
            k10.c0 c0Var = (k10.c0) this.f229699g;
            uq.b.e();
            if (this.f229697e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu2.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.g.O(onNonCitizenIdNumberChanged, (n.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnNonCitizenIdNumberChanged onNonCitizenIdNumberChanged, k10.c0<n.Initialized> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            g gVar = new g(eVar);
            gVar.f229698f = onNonCitizenIdNumberChanged;
            gVar.f229699g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu2/k;", "action", "Lk10/c0;", "Lyu2/n$b;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lyu2/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<OnReasonChanged, k10.c0<n.Initialized>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229702g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized O(OnReasonChanged onReasonChanged, n.Initialized initialized) {
            return n.Initialized.h(initialized, null, null, null, null, new PeselVerificationInputData(mx.b.b(onReasonChanged.getReason(), "reason"), hz.b.C2039b.f86846c), null, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnReasonChanged onReasonChanged = (OnReasonChanged) this.f229701f;
            k10.c0 c0Var = (k10.c0) this.f229702g;
            uq.b.e();
            if (this.f229700e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.h.O(onReasonChanged, (n.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnReasonChanged onReasonChanged, k10.c0<n.Initialized> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            h hVar = new h(eVar);
            hVar.f229701f = onReasonChanged;
            hVar.f229702g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu2/h;", "<unused var>", "Lk10/c0;", "Lyu2/n$b;", "state", "Lk10/l;", "Lyu2/n;", "<anonymous>", "(Lyu2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yu2.h, k10.c0<n.Initialized>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f229704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229705g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.Initialized O(y yVar, k10.c0 c0Var, VerificationCheckValidation verificationCheckValidation, n.Initialized initialized) {
            return n.Initialized.h(initialized, PeselVerificationInputData.b(initialized.getCitizenPeselNumberInputData(), null, yVar.A9(((n.Initialized) c0Var.a()).getSelectedRadioButtonId(), verificationCheckValidation.getPeselNumberValidation().a()), 1, null), PeselVerificationInputData.b(initialized.getCitizenIdNumberInputData(), null, yVar.A9(((n.Initialized) c0Var.a()).getSelectedRadioButtonId(), verificationCheckValidation.getIdNumberValidation().a()), 1, null), PeselVerificationInputData.b(initialized.getNonCitizenPeselNumberInputData(), null, yVar.I9(((n.Initialized) c0Var.a()).getSelectedRadioButtonId(), verificationCheckValidation.getPeselNumberValidation().a()), 1, null), PeselVerificationInputData.b(initialized.getNonCitizenIdNumberInputData(), null, yVar.I9(((n.Initialized) c0Var.a()).getSelectedRadioButtonId(), verificationCheckValidation.getIdNumberValidation().a()), 1, null), PeselVerificationInputData.b(initialized.getReasonInputData(), null, verificationCheckValidation.getReasonValidation().a(), 1, null), null, 32, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00e5, code lost:
        
            if (r11.F(r4, r10) == r1) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: yu2.y.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu2.h hVar, k10.c0<n.Initialized> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f229705g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    public y(yy.a aVar, av2.d dVar, zt2.i iVar, m mVar) {
        this.verificationCheckMapper = dVar;
        this.checkVerificationDataCorrectUseCase = iVar;
        this.setupContract = mVar;
        n.a aVar2 = n.a.f229640g;
        this.initialState = aVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: yu2.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.Q9(this.f229662a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), B9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b A9(bv2.a aVar, hz.b bVar) {
        return aVar == bv2.a.POLISH_CITIZENSHIP ? bVar : hz.b.C2039b.f86846c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.Data B9(n state) {
        return this.verificationCheckMapper.b(new av2.d.Params(state, b9(yu2.h.f229624a), new er.l() { // from class: yu2.p
            @Override // er.l
            public final Object b(Object obj) {
                return y.C9(this.f229654a, (bv2.a) obj);
            }
        }, new er.l() { // from class: yu2.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.D9(this.f229655a, (String) obj);
            }
        }, new er.l() { // from class: yu2.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.E9(this.f229656a, (String) obj);
            }
        }, new er.l() { // from class: yu2.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.F9(this.f229657a, (String) obj);
            }
        }, new er.l() { // from class: yu2.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.G9(this.f229658a, (String) obj);
            }
        }, new er.l() { // from class: yu2.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.H9(this.f229659a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(y yVar, bv2.a aVar) {
        yVar.d9(new OnVerificationCheckRadioButtonChanged(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(y yVar, String str) {
        yVar.d9(new OnCitizenPeselPeselChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(y yVar, String str) {
        yVar.d9(new OnNonCitizenPeselPeselChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(y yVar, String str) {
        yVar.d9(new OnCitizenIdNumberChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(y yVar, String str) {
        yVar.d9(new OnNonCitizenIdNumberChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(y yVar, String str) {
        yVar.d9(new OnReasonChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b I9(bv2.a aVar, hz.b bVar) {
        return aVar == bv2.a.NO_POLISH_CITIZENSHIP ? bVar : hz.b.C2039b.f86846c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String J9(n.Initialized snapshot) {
        return getState().getValue().getSelectedRadioButtonId() == bv2.a.POLISH_CITIZENSHIP ? snapshot.getCitizenIdNumberInputData().getContent().getText() : snapshot.getNonCitizenIdNumberInputData().getContent().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String K9(n.Initialized snapshot) {
        return getState().getValue().getSelectedRadioButtonId() == bv2.a.POLISH_CITIZENSHIP ? snapshot.getCitizenPeselNumberInputData().getContent().getText() : snapshot.getNonCitizenPeselNumberInputData().getContent().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Label L9(bv2.a aVar, String str) {
        return aVar == bv2.a.POLISH_CITIZENSHIP ? mx.b.b(str, "savedCitizenIdNumber") : Label.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Label M9(bv2.a aVar, String str) {
        return aVar == bv2.a.POLISH_CITIZENSHIP ? mx.b.b(str, "savedCitizenPeselNumber") : Label.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Label N9(bv2.a aVar, String str) {
        return aVar == bv2.a.NO_POLISH_CITIZENSHIP ? mx.b.b(str, "savedNonCitizenIdNumber") : Label.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Label O9(bv2.a aVar, String str) {
        return aVar == bv2.a.NO_POLISH_CITIZENSHIP ? mx.b.b(str, "savedNonCitizenPeselNumber") : Label.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(final y yVar, k10.v vVar) {
        vVar.c(q0.c(n.a.class), new er.l() { // from class: yu2.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.R9(this.f229660a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(n.Initialized.class), new er.l() { // from class: yu2.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.S9(this.f229661a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(y yVar, k10.z zVar) {
        zVar.A(yVar.new b(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(y yVar, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnVerificationCheckRadioButtonChanged.class), oVar, cVar);
        zVar.v(q0.c(OnCitizenPeselPeselChanged.class), oVar, new d(null));
        zVar.v(q0.c(OnCitizenIdNumberChanged.class), oVar, new e(null));
        zVar.v(q0.c(OnNonCitizenPeselPeselChanged.class), oVar, new f(null));
        zVar.v(q0.c(OnNonCitizenIdNumberChanged.class), oVar, new g(null));
        zVar.v(q0.c(OnReasonChanged.class), oVar, new h(null));
        zVar.v(q0.c(yu2.h.class), oVar, yVar.new i(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m mVar) {
        super.P5(mVar);
    }

    @Override // zx.b
    public xw.b<yu2.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<n, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o.Data> getState() {
        return this.state;
    }
}
