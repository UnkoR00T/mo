package dq2;

import al0.s0;
import eq2.YourDataValidatedData;
import fr.q0;
import hq2.AttachmentsToSend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import k10.c0;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.eac.CertificateBody;
import p050fp2.d0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010#J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0011\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b6\u00107J\u001b\u0010;\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020?2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\b\u0012\u0004\u0012\u00020F0EH\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR&\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030L8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010X\u001a\b\u0012\u0004\u0012\u00020S0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Ldq2/f;", "Ll00/g;", "Ldq2/c;", "Ldq2/a;", "", "Lyy/a;", "stateMachineFactory", "Lfp2/d0;", "passportAgreementExitDialogMapper", "<init>", "(Lyy/a;Lfp2/d0;)V", "Loq/i0;", "k9", "()V", "Lcq2/a$a;", "data", "l8", "(Lcq2/a$a;)V", "Lkq2/a$a;", "M7", "(Lkq2/a$a;)V", "", "childId", "a0", "(Ljava/lang/String;)V", "Lop2/a$b;", "a2", "()Lop2/a$b;", "Lop2/a$c;", "childDataSetupFormData", "U5", "(Lop2/a$c;)V", "Leq2/a;", "childDataValidatedData", "g5", "(Leq2/a;)V", "Lwp2/b$c;", "formData", "h7", "(Lwp2/b$c;)V", "Lwp2/b$b;", "e0", "()Lwp2/b$b;", "w2", "Lnq2/d$a;", "F6", "(Lnq2/d$a;)V", "r7", "()Lnq2/d$a;", "Leq2/c;", "validatedData", "t7", "(Leq2/c;)V", "Lkq2/b;", "n0", "()Lkq2/b;", "Ldx/i;", "Ldx/b;", "Lhq2/c$a;", "m0", "()Ldx/i;", "Ljp2/b;", "attachmentType", "Ljp2/c$a;", "attachmentsData", "P2", "(Ljp2/b;Ljp2/c$a;)V", "x4", "(Ljp2/b;)Ljp2/c$a;", "", "Lhq2/a;", "q0", "()Ljava/util/List;", "b", "Ldq2/c;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ldq2/b;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends l00.g<State, dq2.a> implements l00.e, cq2.a, kq2.a, rp2.a, nq2.d, wp2.b, op2.a, jp2.c, hq2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<State, dq2.a> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dq2.b> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44083b;

        static {
            int[] iArr = new int[jp2.b.values().length];
            try {
                iArr[jp2.b.GUARDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jp2.b.DIPLOMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jp2.b.MSWIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44082a = iArr;
            int[] iArr2 = new int[s0.values().length];
            try {
                iArr2[s0.BUSINESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s0.DIPLOMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s0.TEMPORARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[s0.BIOMETRIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f44083b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$j;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<dq2.a.SaveParentFormValidatedData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44086g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, dq2.a.SaveParentFormValidatedData saveParentFormValidatedData, State state) {
            return State.b(state, null, null, null, nq2.d.PassportAgreementYourDataContractData.b(((State) c0Var.a()).getYourDataContractData(), null, saveParentFormValidatedData.getParentFormData(), 1, null), null, null, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.SaveParentFormValidatedData saveParentFormValidatedData = (dq2.a.SaveParentFormValidatedData) this.f44085f;
            final c0 c0Var = (c0) this.f44086g;
            uq.b.e();
            if (this.f44084e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.g
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.b.O(c0Var, saveParentFormValidatedData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.SaveParentFormValidatedData saveParentFormValidatedData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f44085f = saveParentFormValidatedData;
            bVar.f44086g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$g;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<dq2.a.SaveEnterChildSetupFormData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44089g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, dq2.a.SaveEnterChildSetupFormData saveEnterChildSetupFormData, State state) {
            wp2.b.EnterChildContractData enterChildContractData = ((State) c0Var.a()).getEnterChildContractData();
            wp2.b.c data = saveEnterChildSetupFormData.getData();
            kq2.a.WhoAgreesData whoAgreesData = ((State) c0Var.a()).getWhoAgreesData();
            return State.b(state, null, null, null, null, null, enterChildContractData.a(new wp2.b.EnterChildSetupData(data, whoAgreesData != null ? whoAgreesData.getWhoAgrees() : null, ((State) c0Var.a()).getPassportTypeData().getPassportType())), null, null, 223, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.SaveEnterChildSetupFormData saveEnterChildSetupFormData = (dq2.a.SaveEnterChildSetupFormData) this.f44088f;
            final c0 c0Var = (c0) this.f44089g;
            uq.b.e();
            if (this.f44087e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.h
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.c.O(c0Var, saveEnterChildSetupFormData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.SaveEnterChildSetupFormData saveEnterChildSetupFormData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f44088f = saveEnterChildSetupFormData;
            cVar.f44089g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$h;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<dq2.a.SaveEnterChildValidatedData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44092g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, dq2.a.SaveEnterChildValidatedData saveEnterChildValidatedData, State state) {
            return State.b(state, null, null, null, null, op2.a.ChildDataContractData.b(((State) c0Var.a()).getChildContractData(), null, saveEnterChildValidatedData.getData(), 1, null), null, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.SaveEnterChildValidatedData saveEnterChildValidatedData = (dq2.a.SaveEnterChildValidatedData) this.f44091f;
            final c0 c0Var = (c0) this.f44092g;
            uq.b.e();
            if (this.f44090e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.d.O(c0Var, saveEnterChildValidatedData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.SaveEnterChildValidatedData saveEnterChildValidatedData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f44091f = saveEnterChildValidatedData;
            dVar.f44092g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldq2/a$k;", "<unused var>", "Ldq2/c;", "Loq/i0;", "<anonymous>", "(Ldq2/a$k;Ldq2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dq2.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44093e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d0 f44095g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d0 d0Var, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f44095g = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44093e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<dq2.b> bVarY1 = f.this.Y1();
                dq2.b.ShowDialog showDialog = new dq2.b.ShowDialog(this.f44095g.b(new d0.Params(f.this.b9(dq2.a.c.f44050a))));
                this.f44093e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.k kVar, State state, tq.e<? super i0> eVar) {
            return f.this.new e(this.f44095g, eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: dq2.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$d;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C0991f extends vq.k implements er.q<dq2.a.PassportTypeChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44098g;

        C0991f(tq.e<? super C0991f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(dq2.a.PassportTypeChanged passportTypeChanged, c0 c0Var, State state) {
            cq2.a.PassportTypeData data = passportTypeChanged.getData();
            jp2.c.AttachmentsData privilegeAttachmentsData = state.getPassportTypeData().getPassportType() == passportTypeChanged.getData().getPassportType() ? state.getPrivilegeAttachmentsData() : new jp2.c.AttachmentsData(v.n());
            wp2.b.EnterChildContractData enterChildContractData = ((State) c0Var.a()).getEnterChildContractData();
            wp2.b.EnterChildSetupData enterChildSetupData = ((State) c0Var.a()).getEnterChildContractData().getEnterChildSetupData();
            return State.b(state, data, null, null, null, null, enterChildContractData.a(enterChildSetupData != null ? wp2.b.EnterChildSetupData.b(enterChildSetupData, null, null, passportTypeChanged.getData().getPassportType(), 3, null) : null), null, privilegeAttachmentsData, 94, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.PassportTypeChanged passportTypeChanged = (dq2.a.PassportTypeChanged) this.f44097f;
            final c0 c0Var = (c0) this.f44098g;
            uq.b.e();
            if (this.f44096e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.j
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.C0991f.O(passportTypeChanged, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.PassportTypeChanged passportTypeChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C0991f c0991f = new C0991f(eVar);
            c0991f.f44097f = passportTypeChanged;
            c0991f.f44098g = c0Var;
            return c0991f.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$l;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dq2.a.WhoAgreesChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44101g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(dq2.a.WhoAgreesChanged whoAgreesChanged, c0 c0Var, State state) {
            kq2.a.WhoAgreesData data = whoAgreesChanged.getData();
            wp2.b.EnterChildContractData enterChildContractData = ((State) c0Var.a()).getEnterChildContractData();
            wp2.b.EnterChildSetupData enterChildSetupData = ((State) c0Var.a()).getEnterChildContractData().getEnterChildSetupData();
            return State.b(state, null, data, null, null, null, enterChildContractData.a(enterChildSetupData != null ? wp2.b.EnterChildSetupData.b(enterChildSetupData, null, whoAgreesChanged.getData().getWhoAgrees(), null, 5, null) : null), null, null, 221, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.WhoAgreesChanged whoAgreesChanged = (dq2.a.WhoAgreesChanged) this.f44100f;
            final c0 c0Var = (c0) this.f44101g;
            uq.b.e();
            if (this.f44099e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.g.O(whoAgreesChanged, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.WhoAgreesChanged whoAgreesChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f44100f = whoAgreesChanged;
            gVar.f44101g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$b;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dq2.a.ChildIdChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44104g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(dq2.a.ChildIdChanged childIdChanged, c0 c0Var, State state) {
            String childId = childIdChanged.getChildId();
            op2.a.ChildDataContractData childContractData = ((State) c0Var.a()).getChildContractData();
            op2.a.ChildDataSetupFormData childSetupFormData = ((State) c0Var.a()).getChildContractData().getChildSetupFormData();
            if (childSetupFormData == null || !fr.t.c(state.getPickedChildId(), childIdChanged.getChildId())) {
                childSetupFormData = null;
            }
            return State.b(state, null, null, childId, null, op2.a.ChildDataContractData.b(childContractData, childSetupFormData, null, 2, null), null, null, null, 235, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.ChildIdChanged childIdChanged = (dq2.a.ChildIdChanged) this.f44103f;
            final c0 c0Var = (c0) this.f44104g;
            uq.b.e();
            if (this.f44102e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.h.O(childIdChanged, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.ChildIdChanged childIdChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f44103f = childIdChanged;
            hVar.f44104g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$a;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<dq2.a.AttachmentsChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44107g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44108a;

            static {
                int[] iArr = new int[jp2.b.values().length];
                try {
                    iArr[jp2.b.GUARDIAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[jp2.b.MSWIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[jp2.b.DIPLOMATIC.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f44108a = iArr;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(dq2.a.AttachmentsChanged attachmentsChanged, State state) {
            int i15 = a.f44108a[attachmentsChanged.getAttachmentType().ordinal()];
            if (i15 == 1) {
                return State.b(state, null, null, null, null, null, null, attachmentsChanged.getAttachmentsData(), null, 191, null);
            }
            if (i15 == 2 || i15 == 3) {
                return State.b(state, null, null, null, null, null, null, null, attachmentsChanged.getAttachmentsData(), CertificateBody.profileType, null);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.AttachmentsChanged attachmentsChanged = (dq2.a.AttachmentsChanged) this.f44106f;
            c0 c0Var = (c0) this.f44107g;
            uq.b.e();
            if (this.f44105e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.i.O(attachmentsChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.AttachmentsChanged attachmentsChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f44106f = attachmentsChanged;
            iVar.f44107g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$e;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<dq2.a.SaveChildSetupFormData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44111g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, dq2.a.SaveChildSetupFormData saveChildSetupFormData, State state) {
            return State.b(state, null, null, null, null, op2.a.ChildDataContractData.b(((State) c0Var.a()).getChildContractData(), saveChildSetupFormData.getChildDataSetupFormData(), null, 2, null), null, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.SaveChildSetupFormData saveChildSetupFormData = (dq2.a.SaveChildSetupFormData) this.f44110f;
            final c0 c0Var = (c0) this.f44111g;
            uq.b.e();
            if (this.f44109e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.j.O(c0Var, saveChildSetupFormData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.SaveChildSetupFormData saveChildSetupFormData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f44110f = saveChildSetupFormData;
            jVar.f44111g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$f;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dq2.a.SaveChildValidatedData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44114g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, dq2.a.SaveChildValidatedData saveChildValidatedData, State state) {
            return State.b(state, null, null, null, null, op2.a.ChildDataContractData.b(((State) c0Var.a()).getChildContractData(), null, saveChildValidatedData.getChildDataValidatedData(), 1, null), null, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.SaveChildValidatedData saveChildValidatedData = (dq2.a.SaveChildValidatedData) this.f44113f;
            final c0 c0Var = (c0) this.f44114g;
            uq.b.e();
            if (this.f44112e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.k.O(c0Var, saveChildValidatedData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.SaveChildValidatedData saveChildValidatedData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f44113f = saveChildValidatedData;
            kVar.f44114g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldq2/a$c;", "<unused var>", "Ldq2/c;", "Loq/i0;", "<anonymous>", "(Ldq2/a$c;Ldq2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<dq2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44115e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44115e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<dq2.b> bVarY1 = f.this.Y1();
                dq2.b.a aVar = dq2.b.a.f44064a;
                this.f44115e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.c cVar, State state, tq.e<? super i0> eVar) {
            return f.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq2/a$i;", "action", "Lk10/c0;", "Ldq2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldq2/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<dq2.a.SaveParentFormSetupData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44119g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, dq2.a.SaveParentFormSetupData saveParentFormSetupData, State state) {
            return State.b(state, null, null, null, nq2.d.PassportAgreementYourDataContractData.b(((State) c0Var.a()).getYourDataContractData(), saveParentFormSetupData.getParentFormData(), null, 2, null), null, null, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dq2.a.SaveParentFormSetupData saveParentFormSetupData = (dq2.a.SaveParentFormSetupData) this.f44118f;
            final c0 c0Var = (c0) this.f44119g;
            uq.b.e();
            if (this.f44117e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dq2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.m.O(c0Var, saveParentFormSetupData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dq2.a.SaveParentFormSetupData saveParentFormSetupData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f44118f = saveParentFormSetupData;
            mVar.f44119g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public f(yy.a aVar, final d0 d0Var) {
        State state = new State(new cq2.a.PassportTypeData(null), null, null, new nq2.d.PassportAgreementYourDataContractData(null, null), new op2.a.ChildDataContractData(null, null), new wp2.b.EnterChildContractData(null), new jp2.c.AttachmentsData(v.n()), new jp2.c.AttachmentsData(v.n()));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: dq2.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.l9(this.f44074a, d0Var, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final f fVar, final d0 d0Var, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dq2.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.m9(this.f44076a, d0Var, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(f fVar, d0 d0Var, z zVar) {
        e eVar = fVar.new e(d0Var, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dq2.a.k.class), oVar, eVar);
        zVar.v(q0.c(dq2.a.PassportTypeChanged.class), oVar, new C0991f(null));
        zVar.v(q0.c(dq2.a.WhoAgreesChanged.class), oVar, new g(null));
        zVar.v(q0.c(dq2.a.ChildIdChanged.class), oVar, new h(null));
        zVar.v(q0.c(dq2.a.AttachmentsChanged.class), oVar, new i(null));
        zVar.v(q0.c(dq2.a.SaveChildSetupFormData.class), oVar, new j(null));
        zVar.v(q0.c(dq2.a.SaveChildValidatedData.class), oVar, new k(null));
        zVar.x(q0.c(dq2.a.c.class), oVar, fVar.new l(null));
        zVar.v(q0.c(dq2.a.SaveParentFormSetupData.class), oVar, new m(null));
        zVar.v(q0.c(dq2.a.SaveParentFormValidatedData.class), oVar, new b(null));
        zVar.v(q0.c(dq2.a.SaveEnterChildSetupFormData.class), oVar, new c(null));
        zVar.v(q0.c(dq2.a.SaveEnterChildValidatedData.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // nq2.d
    public void F6(nq2.d.ParentFormSetupData data) {
        d9(new dq2.a.SaveParentFormSetupData(data));
    }

    @Override // kq2.a
    public void M7(kq2.a.WhoAgreesData data) {
        d9(new dq2.a.WhoAgreesChanged(data));
    }

    @Override // jp2.c
    public void P2(jp2.b attachmentType, jp2.c.AttachmentsData attachmentsData) {
        d9(new dq2.a.AttachmentsChanged(attachmentType, attachmentsData));
    }

    @Override // op2.a
    public void U5(op2.a.ChildDataSetupFormData childDataSetupFormData) {
        d9(new dq2.a.SaveChildSetupFormData(childDataSetupFormData));
    }

    @Override // zx.b
    public xw.b<dq2.b> Y1() {
        return this.navAction;
    }

    @Override // rp2.a
    public void a0(String childId) {
        d9(new dq2.a.ChildIdChanged(childId));
    }

    @Override // op2.a
    public op2.a.ChildDataSetupData a2() {
        String pickedChildId;
        s0 passportType = getState().getValue().getPassportTypeData().getPassportType();
        if (passportType == null || (pickedChildId = getState().getValue().getPickedChildId()) == null) {
            return null;
        }
        return new op2.a.ChildDataSetupData(getState().getValue().getChildContractData().getChildSetupFormData(), passportType, pickedChildId);
    }

    @Override // wp2.b
    public wp2.b.EnterChildSetupData e0() {
        wp2.b.EnterChildSetupData enterChildSetupData = getState().getValue().getEnterChildContractData().getEnterChildSetupData();
        if (enterChildSetupData == null) {
            kq2.a.WhoAgreesData whoAgreesData = getState().getValue().getWhoAgreesData();
            enterChildSetupData = new wp2.b.EnterChildSetupData(null, whoAgreesData != null ? whoAgreesData.getWhoAgrees() : null, getState().getValue().getPassportTypeData().getPassportType());
        }
        return enterChildSetupData;
    }

    @Override // l00.g
    protected t<State, dq2.a> e9() {
        return this.stateMachine;
    }

    @Override // op2.a
    public void g5(eq2.a childDataValidatedData) {
        d9(new dq2.a.SaveChildValidatedData(childDataValidatedData));
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // wp2.b
    public void h7(wp2.b.c formData) {
        d9(new dq2.a.SaveEnterChildSetupFormData(formData));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    public void k9() {
        d9(dq2.a.k.f44062a);
    }

    @Override // cq2.a
    public void l8(cq2.a.PassportTypeData data) {
        d9(new dq2.a.PassportTypeChanged(data));
    }

    @Override // hq2.c
    public dx.i<dx.b, hq2.c.SummaryContractData> m0() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    State value = getState().getValue();
                    s0 passportType = value.getPassportTypeData().getPassportType();
                    if (passportType == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    YourDataValidatedData yourDataValidatedData = value.getYourDataContractData().getYourDataValidatedData();
                    if (yourDataValidatedData == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    eq2.a childDataValidatedData = value.getChildContractData().getChildDataValidatedData();
                    if (childDataValidatedData == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    List<wx.i> listA = value.getGuardianAttachmentsData().a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(wx.j.a((wx.i) it.next()));
                    }
                    kq2.a.WhoAgreesData whoAgreesData = value.getWhoAgreesData();
                    if ((whoAgreesData != null ? whoAgreesData.getWhoAgrees() : null) != kq2.b.GUARDIAN) {
                        arrayList = null;
                    }
                    List<wx.i> listA2 = value.getPrivilegeAttachmentsData().a();
                    ArrayList arrayList2 = new ArrayList(v.y(listA2, 10));
                    Iterator<T> it4 = listA2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(wx.j.a((wx.i) it4.next()));
                    }
                    if (value.getPassportTypeData().getPassportType() != s0.BUSINESS && value.getPassportTypeData().getPassportType() != s0.DIPLOMATIC) {
                        arrayList2 = null;
                    }
                    return new dx.i.Right(new hq2.c.SummaryContractData(passportType, yourDataValidatedData, childDataValidatedData, arrayList, arrayList2));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // nq2.d
    public kq2.b n0() {
        kq2.a.WhoAgreesData whoAgreesData = getState().getValue().getWhoAgreesData();
        if (whoAgreesData != null) {
            return whoAgreesData.getWhoAgrees();
        }
        return null;
    }

    @Override // hq2.c
    public List<AttachmentsToSend> q0() {
        State value = getState().getValue();
        List listC = v.c();
        kq2.a.WhoAgreesData whoAgreesData = value.getWhoAgreesData();
        if ((whoAgreesData != null ? whoAgreesData.getWhoAgrees() : null) == kq2.b.GUARDIAN) {
            Iterator<T> it = value.getGuardianAttachmentsData().a().iterator();
            while (it.hasNext()) {
                listC.add(new AttachmentsToSend((wx.i) it.next(), jl0.t.CHILD_GUARDIAN));
            }
        }
        s0 passportType = value.getPassportTypeData().getPassportType();
        int i15 = passportType == null ? -1 : a.f44083b[passportType.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                Iterator<T> it4 = value.getPrivilegeAttachmentsData().a().iterator();
                while (it4.hasNext()) {
                    listC.add(new AttachmentsToSend((wx.i) it4.next(), jl0.t.BUSINESS_PASSPORT_ENTITLEMENT));
                }
            } else if (i15 == 2) {
                Iterator<T> it5 = value.getPrivilegeAttachmentsData().a().iterator();
                while (it5.hasNext()) {
                    listC.add(new AttachmentsToSend((wx.i) it5.next(), jl0.t.DIPLOMATIC_PASSPORT_ENTITLEMENT));
                }
            } else if (i15 != 3 && i15 != 4 && i15 != 5) {
                throw new oq.p();
            }
        }
        return v.a(listC);
    }

    @Override // nq2.d
    public nq2.d.ParentFormSetupData r7() {
        return getState().getValue().getYourDataContractData().getParentFormSetupData();
    }

    @Override // nq2.d
    public void t7(YourDataValidatedData validatedData) {
        d9(new dq2.a.SaveParentFormValidatedData(validatedData));
    }

    @Override // wp2.b
    public void w2(eq2.a data) {
        d9(new dq2.a.SaveEnterChildValidatedData(data));
    }

    @Override // jp2.c
    public jp2.c.AttachmentsData x4(jp2.b attachmentType) {
        int i15 = a.f44082a[attachmentType.ordinal()];
        if (i15 == 1) {
            return getState().getValue().getGuardianAttachmentsData();
        }
        if (i15 == 2 || i15 == 3) {
            return getState().getValue().getPrivilegeAttachmentsData();
        }
        throw new oq.p();
    }
}
