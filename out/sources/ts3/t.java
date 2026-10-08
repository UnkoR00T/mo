package ts3;

import android.text.TextUtils;
import cj0.ZusEVisitPersonalData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mr3.UserDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xi0.ContactDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010#J\u0017\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010#J\u0017\u0010.\u001a\u00020!2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR,\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR \u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001c0T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010K\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lts3/t;", "Ll00/g;", "Lts3/c;", "Lts3/a;", "Lts3/d;", "", "Lyy/a;", "stateMachineFactory", "Lfj0/g;", "getContactDetailsUseCase", "Lnr3/e;", "checkPersonalDataNameValidUseCase", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/a;", "checkEmailCorrectUC", "Lus3/r;", "screenMapper", "Llr3/a;", "zusVisitContainersInteractor", "Lts3/b;", "setupData", "<init>", "(Lyy/a;Lfj0/g;Lnr3/e;Lj14/n;Lj14/a;Lus3/r;Llr3/a;Lts3/b;)V", "Lts3/c$b;", "state", "Q9", "(Lts3/c$b;Ltq/e;)Ljava/lang/Object;", "Lts3/d$a;", "D9", "(Lts3/c;)Lts3/d$a;", "Liy/b0;", "email", "Loq/i0;", "H9", "(Liy/b0;)V", "phoneNumber", "J9", "name", "F9", "surname", "G9", "K9", "L9", "", "checked", "I9", "(Z)V", "b", "Lfj0/g;", "c", "Lnr3/e;", "d", "Lj14/n;", "e", "Lj14/a;", "f", "Lus3/r;", "g", "Llr3/a;", "h", "Lts3/b;", "j", "Z", "ignoreFetchData", "Lts3/c$a;", "k", "Lts3/c$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lts3/a$m;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<ts3.c, ts3.a> implements ts3.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fj0.g getContactDetailsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nr3.e checkPersonalDataNameValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final us3.r screenMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final lr3.a zusVisitContainersInteractor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreFetchData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ts3.c.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ts3.c, ts3.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ts3.a.m> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ts3.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<iy.b0, oq.i0> {
        a(Object obj) {
            super(1, obj, t.class, "onCaregiverNameChange", "onCaregiverNameChange(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(iy.b0 b0Var) {
            ((t) this.f66391b).F9(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(iy.b0 b0Var) {
            E(b0Var);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$l;", "<unused var>", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<ts3.a.l, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f191988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f191989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f191991h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f191992j;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.c.Initialized initialized, ts3.c.Initialized initialized2) {
            return ts3.c.Initialized.b(initialized, null, initialized.getEmailValidationState(), null, null, initialized.getPhoneValidationState(), null, null, initialized.getCaregiverNameValidationState(), null, null, initialized.getCaregiverSurnameValidationState(), null, false, null, initialized.getTranslatorNameValidationState(), null, null, initialized.getTranslatorSurnameValidationState(), null, false, null, false, 4045677, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objQ9;
            final ts3.c.Initialized initialized;
            ts3.c.Initialized initialized2;
            k10.c0 c0Var = (k10.c0) this.f191992j;
            Object objE = uq.b.e();
            int i15 = this.f191991h;
            int i16 = 1;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                ts3.c.Initialized initialized3 = (ts3.c.Initialized) c0Var.a();
                this.f191992j = c0Var;
                this.f191991h = 1;
                objQ9 = tVar.Q9(initialized3, this);
                if (objQ9 != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
                objQ9 = obj;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initialized2 = (ts3.c.Initialized) this.f191988e;
                oq.u.b(obj);
            }
            initialized = initialized2;
            return c0Var.b(new er.l() { // from class: ts3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.a0.O(initialized, (c.Initialized) obj2);
                }
            });
            initialized = (ts3.c.Initialized) objQ9;
            List listQ = pq.v.q(initialized.getEmailValidationState(), initialized.getPhoneValidationState(), initialized.getCaregiverNameValidationState(), initialized.getCaregiverSurnameValidationState(), initialized.getTranslatorNameValidationState(), initialized.getTranslatorSurnameValidationState());
            List list = listQ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((hz.b) it.next()).a()) {
                        i16 = 0;
                        break;
                    }
                }
            }
            if (i16 != 0) {
                t tVar2 = t.this;
                ts3.a.m.GoToSummary goToSummary = new ts3.a.m.GoToSummary(new ZusEVisitPersonalData(initialized.getEmail(), initialized.getPhoneNumber(), initialized.getCaregiverName(), initialized.getCaregiverSurname(), initialized.getTranslatorName(), initialized.getTranslatorSurname(), initialized.getPesel(), initialized.getSharePesel()));
                this.f191992j = c0Var;
                this.f191988e = initialized;
                this.f191989f = vq.j.a(listQ);
                this.f191990g = i16;
                this.f191991h = 2;
                if (tVar2.F(goToSummary, this) != objE) {
                    initialized2 = initialized;
                    initialized = initialized2;
                }
                return objE;
            }
            return c0Var.b(new er.l() { // from class: ts3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.a0.O(initialized, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.l lVar, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            a0 a0Var = t.this.new a0(eVar);
            a0Var.f191992j = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<iy.b0, oq.i0> {
        b(Object obj) {
            super(1, obj, t.class, "onCaregiverSurnameChange", "onCaregiverSurnameChange(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(iy.b0 b0Var) {
            ((t) this.f66391b).G9(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(iy.b0 b0Var) {
            E(b0Var);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$c;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<ts3.a.AddEmail, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191995f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f191996g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.AddEmail addEmail, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, addEmail.getEmail(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194302, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.AddEmail addEmail = (ts3.a.AddEmail) this.f191995f;
            k10.c0 c0Var = (k10.c0) this.f191996g;
            uq.b.e();
            if (this.f191994e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.ignoreFetchData = true;
            return c0Var.b(new er.l() { // from class: ts3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.b0.O(addEmail, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.AddEmail addEmail, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            b0 b0Var = t.this.new b0(eVar);
            b0Var.f191995f = addEmail;
            b0Var.f191996g = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<iy.b0, oq.i0> {
        c(Object obj) {
            super(1, obj, t.class, "onTranslatorSurnameChange", "onTranslatorSurnameChange(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(iy.b0 b0Var) {
            ((t) this.f66391b).L9(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(iy.b0 b0Var) {
            E(b0Var);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$d;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<ts3.a.AddPhoneNumber, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192000g;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.AddPhoneNumber addPhoneNumber, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, addPhoneNumber.getPhoneNumber(), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194295, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.AddPhoneNumber addPhoneNumber = (ts3.a.AddPhoneNumber) this.f191999f;
            k10.c0 c0Var = (k10.c0) this.f192000g;
            uq.b.e();
            if (this.f191998e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.ignoreFetchData = true;
            return c0Var.b(new er.l() { // from class: ts3.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.c0.O(addPhoneNumber, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.AddPhoneNumber addPhoneNumber, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            c0 c0Var2 = t.this.new c0(eVar);
            c0Var2.f191999f = addPhoneNumber;
            c0Var2.f192000g = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.l<iy.b0, oq.i0> {
        d(Object obj) {
            super(1, obj, t.class, "onTranslatorNameChange", "onTranslatorNameChange(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(iy.b0 b0Var) {
            ((t) this.f66391b).K9(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(iy.b0 b0Var) {
            E(b0Var);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$a;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<ts3.a.AddCaregiverName, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192003f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192004g;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.AddCaregiverName addCaregiverName, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, addCaregiverName.getName(), null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.AddCaregiverName addCaregiverName = (ts3.a.AddCaregiverName) this.f192003f;
            k10.c0 c0Var = (k10.c0) this.f192004g;
            uq.b.e();
            if (this.f192002e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d0.O(addCaregiverName, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.AddCaregiverName addCaregiverName, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            d0 d0Var = new d0(eVar);
            d0Var.f192003f = addCaregiverName;
            d0Var.f192004g = c0Var;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<iy.b0, oq.i0> {
        e(Object obj) {
            super(1, obj, t.class, "onPhoneNumberChange", "onPhoneNumberChange(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(iy.b0 b0Var) {
            ((t) this.f66391b).J9(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(iy.b0 b0Var) {
            E(b0Var);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$b;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<ts3.a.AddCaregiverSurname, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192007g;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.AddCaregiverSurname addCaregiverSurname, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, addCaregiverSurname.getSurname(), null, null, false, null, null, null, null, null, null, false, null, false, 4193791, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.AddCaregiverSurname addCaregiverSurname = (ts3.a.AddCaregiverSurname) this.f192006f;
            k10.c0 c0Var = (k10.c0) this.f192007g;
            uq.b.e();
            if (this.f192005e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e0.O(addCaregiverSurname, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.AddCaregiverSurname addCaregiverSurname, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            e0 e0Var = new e0(eVar);
            e0Var.f192006f = addCaregiverSurname;
            e0Var.f192007g = c0Var;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.l<Boolean, oq.i0> {
        f(Object obj) {
            super(1, obj, t.class, "onPeselSwitchChange", "onPeselSwitchChange(Z)V", 0);
        }

        public final void E(boolean z15) {
            ((t) this.f66391b).I9(z15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Boolean bool) {
            E(bool.booleanValue());
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$n;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<ts3.a.SetCaregiverCardExpanded, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192010g;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.SetCaregiverCardExpanded setCaregiverCardExpanded, ts3.c.Initialized initialized) {
            boolean isExpanded = setCaregiverCardExpanded.getIsExpanded();
            hz.b.d dVar = hz.b.d.f86848c;
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, dVar, null, null, dVar, null, isExpanded, null, null, null, null, null, null, false, null, false, 4189055, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.SetCaregiverCardExpanded setCaregiverCardExpanded = (ts3.a.SetCaregiverCardExpanded) this.f192009f;
            k10.c0 c0Var = (k10.c0) this.f192010g;
            uq.b.e();
            if (this.f192008e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f0.O(setCaregiverCardExpanded, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.SetCaregiverCardExpanded setCaregiverCardExpanded, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            f0 f0Var = new f0(eVar);
            f0Var.f192009f = setCaregiverCardExpanded;
            f0Var.f192010g = c0Var;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.l<iy.b0, oq.i0> {
        g(Object obj) {
            super(1, obj, t.class, "onEmailChange", "onEmailChange(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(iy.b0 b0Var) {
            ((t) this.f66391b).H9(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(iy.b0 b0Var) {
            E(b0Var);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$e;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<ts3.a.AddTranslatorName, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192013g;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.AddTranslatorName addTranslatorName, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, null, null, false, addTranslatorName.getName(), null, null, null, null, null, false, null, false, 4186111, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.AddTranslatorName addTranslatorName = (ts3.a.AddTranslatorName) this.f192012f;
            k10.c0 c0Var = (k10.c0) this.f192013g;
            uq.b.e();
            if (this.f192011e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g0.O(addTranslatorName, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.AddTranslatorName addTranslatorName, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            g0 g0Var = new g0(eVar);
            g0Var.f192012f = addTranslatorName;
            g0Var.f192013g = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192014e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f192016g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(iy.b0 b0Var, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f192016g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f192014e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new ts3.a.AddCaregiverName(this.f192016g));
            t.this.d9(new ts3.a.CheckCaregiver(this.f192016g, null, 2, null));
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return t.this.new h(this.f192016g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((h) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$f;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<ts3.a.AddTranslatorSurname, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192019g;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.AddTranslatorSurname addTranslatorSurname, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, addTranslatorSurname.getSurname(), null, null, false, null, false, 4128767, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.AddTranslatorSurname addTranslatorSurname = (ts3.a.AddTranslatorSurname) this.f192018f;
            k10.c0 c0Var = (k10.c0) this.f192019g;
            uq.b.e();
            if (this.f192017e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h0.O(addTranslatorSurname, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.AddTranslatorSurname addTranslatorSurname, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f192018f = addTranslatorSurname;
            h0Var.f192019g = c0Var;
            return h0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192020e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f192022g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(iy.b0 b0Var, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f192022g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f192020e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new ts3.a.AddCaregiverSurname(this.f192022g));
            t.this.d9(new ts3.a.CheckCaregiver(null, this.f192022g, 1, null));
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return t.this.new i(this.f192022g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((i) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$o;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<ts3.a.SetTranslatorCardExpanded, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192025g;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.SetTranslatorCardExpanded setTranslatorCardExpanded, ts3.c.Initialized initialized) {
            boolean isExpanded = setTranslatorCardExpanded.getIsExpanded();
            hz.b.d dVar = hz.b.d.f86848c;
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, null, null, false, null, dVar, null, null, dVar, null, isExpanded, null, false, 3522559, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.SetTranslatorCardExpanded setTranslatorCardExpanded = (ts3.a.SetTranslatorCardExpanded) this.f192024f;
            k10.c0 c0Var = (k10.c0) this.f192025g;
            uq.b.e();
            if (this.f192023e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.i0.O(setTranslatorCardExpanded, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.SetTranslatorCardExpanded setTranslatorCardExpanded, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f192024f = setTranslatorCardExpanded;
            i0Var.f192025g = c0Var;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192026e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f192028g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(iy.b0 b0Var, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f192028g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f192026e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new ts3.a.AddEmail(this.f192028g));
            t.this.d9(new ts3.a.CheckEmail(this.f192028g));
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return t.this.new j(this.f192028g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((j) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192032g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f192034j;

        j0(tq.e<? super j0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192032g = obj;
            this.f192034j |= PKIFailureInfo.systemUnavail;
            return t.this.Q9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192035e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f192037g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(iy.b0 b0Var, tq.e<? super k> eVar) {
            super(1, eVar);
            this.f192037g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f192035e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new ts3.a.AddPhoneNumber(this.f192037g));
            t.this.d9(new ts3.a.CheckPhoneNumber(this.f192037g));
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return t.this.new k(this.f192037g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((k) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192038e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f192040g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(iy.b0 b0Var, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f192040g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f192038e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new ts3.a.AddTranslatorName(this.f192040g));
            t.this.d9(new ts3.a.CheckTranslator(this.f192040g, null, 2, null));
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return t.this.new l(this.f192040g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((l) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class m implements mu.g<ts3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f192041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f192042b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f192043a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f192044b;

            /* JADX INFO: renamed from: ts3.t$m$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5015a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f192045d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f192046e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f192047f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f192049h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f192050j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f192051k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f192052l;

                public C5015a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f192045d = obj;
                    this.f192046e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f192043a = hVar;
                this.f192044b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5015a c5015a;
                if (eVar instanceof C5015a) {
                    c5015a = (C5015a) eVar;
                    int i15 = c5015a.f192046e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5015a.f192046e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5015a = new C5015a(eVar);
                    }
                } else {
                    c5015a = new C5015a(eVar);
                }
                Object obj2 = c5015a.f192045d;
                Object objE = uq.b.e();
                int i16 = c5015a.f192046e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f192043a;
                    ts3.d.a aVarD9 = this.f192044b.D9((ts3.c) obj);
                    c5015a.f192047f = vq.j.a(obj);
                    c5015a.f192049h = vq.j.a(c5015a);
                    c5015a.f192050j = vq.j.a(obj);
                    c5015a.f192051k = vq.j.a(hVar);
                    c5015a.f192052l = 0;
                    c5015a.f192046e = 1;
                    if (hVar.F(aVarD9, c5015a) == objE) {
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

        public m(mu.g gVar, t tVar) {
            this.f192041a = gVar;
            this.f192042b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ts3.d.a> hVar, tq.e eVar) {
            Object objA = this.f192041a.a(new a(hVar, this.f192042b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lts3/c$a;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<ts3.c.a>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192055g;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized V(ZusEVisitPersonalData zusEVisitPersonalData, ts3.c.a aVar) {
            return new ts3.c.Initialized(zusEVisitPersonalData.getEmail(), null, hz.b.d.f86848c, zusEVisitPersonalData.getPhoneNumber(), null, null, zusEVisitPersonalData.getCaregiverName(), null, null, zusEVisitPersonalData.getCaregiverSurname(), null, null, !fu.r.t0(iy.c0.e(zusEVisitPersonalData.getCaregiverName())), zusEVisitPersonalData.getTranslatorName(), null, null, zusEVisitPersonalData.getTranslatorSurname(), null, null, !fu.r.t0(iy.c0.e(zusEVisitPersonalData.getTranslatorName())), zusEVisitPersonalData.getPesel(), false, 2543026, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized X(String str, ts3.c.a aVar) {
            return new ts3.c.Initialized(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, str != null ? iy.c0.g(str) : null, false, 3145727, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192055g;
            Object objE = uq.b.e();
            int i15 = this.f192054f;
            if (i15 == 0) {
                oq.u.b(obj);
                final ZusEVisitPersonalData personalData = t.this.setupData.getPersonalData();
                if (personalData != null) {
                    t.this.ignoreFetchData = true;
                    return c0Var.d(new er.l() { // from class: ts3.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.n.V(personalData, (c.a) obj2);
                        }
                    });
                }
                lr3.a aVar = t.this.zusVisitContainersInteractor;
                this.f192055g = c0Var;
                this.f192053e = vq.j.a(personalData);
                this.f192054f = 1;
                obj = aVar.a(this);
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
            final String pesel = null;
            if (iVar instanceof dx.i.Left) {
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                UserDocumentData userDocumentData = (UserDocumentData) ((dx.i.Right) iVar).b();
                if (TextUtils.isDigitsOnly(userDocumentData.getPesel())) {
                    pesel = userDocumentData.getPesel();
                }
            }
            return c0Var.d(new er.l() { // from class: ts3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.n.X(pesel, (c.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ts3.c.a> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            return ((n) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = t.this.new n(eVar);
            nVar.f192055g = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$i;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ts3.a.CheckEmail, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192058f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192059g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(hz.g gVar, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, hz.b.INSTANCE.a(gVar), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194299, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ts3.a.CheckEmail checkEmail = (ts3.a.CheckEmail) this.f192058f;
            k10.c0 c0Var = (k10.c0) this.f192059g;
            Object objE = uq.b.e();
            int i15 = this.f192057e;
            if (i15 == 0) {
                oq.u.b(obj);
                j14.a aVar = t.this.checkEmailCorrectUC;
                j14.a.Params params = new j14.a.Params(checkEmail.getEmail(), false, null, 6, null);
                this.f192058f = vq.j.a(checkEmail);
                this.f192059g = c0Var;
                this.f192057e = 1;
                obj = aVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.g gVar = (hz.g) obj;
            return c0Var.b(new er.l() { // from class: ts3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.o.O(gVar, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.CheckEmail checkEmail, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            o oVar = t.this.new o(eVar);
            oVar.f192058f = checkEmail;
            oVar.f192059g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$j;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ts3.a.CheckPhoneNumber, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f192062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f192064h;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(hz.b bVar, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, bVar, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194271, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b.Companion companion;
            ts3.a.CheckPhoneNumber checkPhoneNumber = (ts3.a.CheckPhoneNumber) this.f192063g;
            k10.c0 c0Var = (k10.c0) this.f192064h;
            Object objE = uq.b.e();
            int i15 = this.f192062f;
            if (i15 == 0) {
                oq.u.b(obj);
                hz.b.Companion companion2 = hz.b.INSTANCE;
                j14.n nVar = t.this.checkPhoneNumberCorrectUC;
                j14.n.a.CheckNumberPolishOnly checkNumberPolishOnly = new j14.n.a.CheckNumberPolishOnly(checkPhoneNumber.getPhoneNumber(), false);
                this.f192063g = vq.j.a(checkPhoneNumber);
                this.f192064h = c0Var;
                this.f192061e = companion2;
                this.f192062f = 1;
                Object objC = nVar.c(checkNumberPolishOnly, this);
                if (objC == objE) {
                    return objE;
                }
                companion = companion2;
                obj = objC;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f192061e;
                oq.u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            return c0Var.b(new er.l() { // from class: ts3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.p.O(bVarA, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.CheckPhoneNumber checkPhoneNumber, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            p pVar = t.this.new p(eVar);
            pVar.f192063g = checkPhoneNumber;
            pVar.f192064h = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$h;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ts3.a.CheckCaregiver, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f192068g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192069h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f192070j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f192071k;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(hz.g gVar, hz.g gVar2, ts3.c.Initialized initialized) {
            hz.b.Companion companion = hz.b.INSTANCE;
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, companion.a(gVar), null, null, companion.a(gVar2), false, null, null, null, null, null, null, false, null, false, 4191999, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy.b0 surname;
            iy.b0 b0Var;
            final hz.g gVar;
            ts3.a.CheckCaregiver checkCaregiver = (ts3.a.CheckCaregiver) this.f192070j;
            k10.c0 c0Var = (k10.c0) this.f192071k;
            Object objE = uq.b.e();
            int i15 = this.f192069h;
            if (i15 != 0) {
                if (i15 == 1) {
                    surname = (iy.b0) this.f192067f;
                    b0Var = (iy.b0) this.f192066e;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (hz.g) this.f192068g;
                    oq.u.b(obj);
                }
                final hz.g gVar2 = (hz.g) obj;
                return c0Var.b(new er.l() { // from class: ts3.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.q.O(gVar, gVar2, (c.Initialized) obj2);
                    }
                });
            }
            oq.u.b(obj);
            iy.b0 name = checkCaregiver.getName();
            if (name == null) {
                name = ((ts3.c.Initialized) c0Var.a()).getCaregiverName();
            }
            surname = checkCaregiver.getSurname();
            if (surname == null) {
                surname = ((ts3.c.Initialized) c0Var.a()).getCaregiverSurname();
            }
            nr3.e eVar = t.this.checkPersonalDataNameValidUseCase;
            nr3.e.Params params = new nr3.e.Params(name);
            this.f192070j = vq.j.a(checkCaregiver);
            this.f192071k = c0Var;
            this.f192066e = vq.j.a(name);
            this.f192067f = surname;
            this.f192069h = 1;
            Object objF = eVar.f(params, this);
            if (objF != objE) {
                b0Var = name;
                obj = objF;
            }
            return objE;
            hz.g gVar3 = (hz.g) obj;
            nr3.e eVar2 = t.this.checkPersonalDataNameValidUseCase;
            nr3.e.Params params2 = new nr3.e.Params(surname);
            this.f192070j = vq.j.a(checkCaregiver);
            this.f192071k = c0Var;
            this.f192066e = vq.j.a(b0Var);
            this.f192067f = vq.j.a(surname);
            this.f192068g = gVar3;
            this.f192069h = 2;
            Object objF2 = eVar2.f(params2, this);
            if (objF2 != objE) {
                gVar = gVar3;
                obj = objF2;
                final hz.g gVar4 = (hz.g) obj;
                return c0Var.b(new er.l() { // from class: ts3.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.q.O(gVar, gVar4, (c.Initialized) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.CheckCaregiver checkCaregiver, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            q qVar = t.this.new q(eVar);
            qVar.f192070j = checkCaregiver;
            qVar.f192071k = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$k;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ts3.a.CheckTranslator, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192074f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f192075g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192076h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f192077j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f192078k;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(hz.g gVar, hz.g gVar2, ts3.c.Initialized initialized) {
            hz.b.Companion companion = hz.b.INSTANCE;
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, companion.a(gVar), null, null, companion.a(gVar2), false, null, false, 3899391, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy.b0 surname;
            iy.b0 b0Var;
            final hz.g gVar;
            ts3.a.CheckTranslator checkTranslator = (ts3.a.CheckTranslator) this.f192077j;
            k10.c0 c0Var = (k10.c0) this.f192078k;
            Object objE = uq.b.e();
            int i15 = this.f192076h;
            if (i15 != 0) {
                if (i15 == 1) {
                    surname = (iy.b0) this.f192074f;
                    b0Var = (iy.b0) this.f192073e;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (hz.g) this.f192075g;
                    oq.u.b(obj);
                }
                final hz.g gVar2 = (hz.g) obj;
                return c0Var.b(new er.l() { // from class: ts3.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.r.O(gVar, gVar2, (c.Initialized) obj2);
                    }
                });
            }
            oq.u.b(obj);
            iy.b0 name = checkTranslator.getName();
            if (name == null) {
                name = ((ts3.c.Initialized) c0Var.a()).getTranslatorName();
            }
            surname = checkTranslator.getSurname();
            if (surname == null) {
                surname = ((ts3.c.Initialized) c0Var.a()).getTranslatorSurname();
            }
            nr3.e eVar = t.this.checkPersonalDataNameValidUseCase;
            nr3.e.Params params = new nr3.e.Params(name);
            this.f192077j = vq.j.a(checkTranslator);
            this.f192078k = c0Var;
            this.f192073e = vq.j.a(name);
            this.f192074f = surname;
            this.f192076h = 1;
            Object objF = eVar.f(params, this);
            if (objF != objE) {
                b0Var = name;
                obj = objF;
            }
            return objE;
            hz.g gVar3 = (hz.g) obj;
            nr3.e eVar2 = t.this.checkPersonalDataNameValidUseCase;
            nr3.e.Params params2 = new nr3.e.Params(surname);
            this.f192077j = vq.j.a(checkTranslator);
            this.f192078k = c0Var;
            this.f192073e = vq.j.a(b0Var);
            this.f192074f = vq.j.a(surname);
            this.f192075g = gVar3;
            this.f192076h = 2;
            Object objF2 = eVar2.f(params2, this);
            if (objF2 != objE) {
                gVar = gVar3;
                obj = objF2;
                final hz.g gVar4 = (hz.g) obj;
                return c0Var.b(new er.l() { // from class: ts3.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.r.O(gVar, gVar4, (c.Initialized) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.CheckTranslator checkTranslator, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            r rVar = t.this.new r(eVar);
            rVar.f192077j = checkTranslator;
            rVar.f192078k = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$r;", "<unused var>", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ts3.a.r, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192081f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, initialized.getEmailValidationState(), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194301, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192081f;
            uq.b.e();
            if (this.f192080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.s.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.r rVar, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            s sVar = new s(eVar);
            sVar.f192081f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: ts3.t$t, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$s;", "<unused var>", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5016t extends vq.k implements er.q<ts3.a.s, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192083f;

        C5016t(tq.e<? super C5016t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, initialized.getPhoneValidationState(), null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194287, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192083f;
            uq.b.e();
            if (this.f192082e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.C5016t.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.s sVar, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            C5016t c5016t = new C5016t(eVar);
            c5016t.f192083f = c0Var;
            return c5016t.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$p;", "<unused var>", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<ts3.a.p, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192085f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, initialized.getCaregiverNameValidationState(), null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194175, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192085f;
            uq.b.e();
            if (this.f192084e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.u.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.p pVar, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            u uVar = new u(eVar);
            uVar.f192085f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$q;", "<unused var>", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<ts3.a.q, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192087f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, initialized.getCaregiverSurnameValidationState(), null, false, null, null, null, null, null, null, false, null, false, 4193279, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192087f;
            uq.b.e();
            if (this.f192086e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.v.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.q qVar, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            v vVar = new v(eVar);
            vVar.f192087f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$t;", "<unused var>", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<ts3.a.t, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192089f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, null, null, false, null, initialized.getTranslatorNameValidationState(), null, null, null, null, false, null, false, 4177919, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192089f;
            uq.b.e();
            if (this.f192088e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.w.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.t tVar, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            w wVar = new w(eVar);
            wVar.f192089f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$u;", "<unused var>", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<ts3.a.u, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192091f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, initialized.getTranslatorSurnameValidationState(), null, false, null, false, 4063231, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f192091f;
            uq.b.e();
            if (this.f192090e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.x.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.u uVar, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            x xVar = new x(eVar);
            xVar.f192091f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lts3/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lts3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<ts3.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192093f;

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy.b0 b0VarA;
            ts3.c.Initialized initialized = (ts3.c.Initialized) this.f192093f;
            Object objE = uq.b.e();
            int i15 = this.f192092e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.d9(new ts3.a.CheckEmail(initialized.getEmail()));
                fj0.g gVar = t.this.getContactDetailsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f192093f = vq.j.a(initialized);
                this.f192092e = 1;
                obj = gVar.c(c1792a, this);
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
            t tVar = t.this;
            if (iVar instanceof dx.i.Right) {
                ContactDetails contactDetails = (ContactDetails) ((dx.i.Right) iVar).b();
                if (!tVar.ignoreFetchData) {
                    iy.b0 registeredEmail = contactDetails.getRegisteredEmail();
                    if (registeredEmail == null) {
                        registeredEmail = iy.b0.INSTANCE.a();
                    }
                    PhoneNumber registeredPhoneNumber = contactDetails.getRegisteredPhoneNumber();
                    if (registeredPhoneNumber == null || (b0VarA = registeredPhoneNumber.g()) == null) {
                        b0VarA = iy.b0.INSTANCE.a();
                    }
                    tVar.d9(new ts3.a.AddEmail(registeredEmail));
                    tVar.d9(new ts3.a.CheckEmail(registeredEmail));
                    tVar.d9(new ts3.a.AddPhoneNumber(b0VarA));
                    tVar.d9(new ts3.a.CheckPhoneNumber(b0VarA));
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ts3.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return ((y) v(initialized, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            y yVar = t.this.new y(eVar);
            yVar.f192093f = obj;
            return yVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lts3/a$g;", "event", "Lk10/c0;", "Lts3/c$b;", "state", "Lk10/l;", "Lts3/c;", "<anonymous>", "(Lts3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<ts3.a.ChangeSharePeselState, k10.c0<ts3.c.Initialized>, tq.e<? super k10.l<? extends ts3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192097g;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ts3.c.Initialized O(ts3.a.ChangeSharePeselState changeSharePeselState, ts3.c.Initialized initialized) {
            return ts3.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, changeSharePeselState.getSharePesel(), 2097151, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ts3.a.ChangeSharePeselState changeSharePeselState = (ts3.a.ChangeSharePeselState) this.f192096f;
            k10.c0 c0Var = (k10.c0) this.f192097g;
            uq.b.e();
            if (this.f192095e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ts3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.z.O(changeSharePeselState, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ts3.a.ChangeSharePeselState changeSharePeselState, k10.c0<ts3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ts3.c>> eVar) {
            z zVar = new z(eVar);
            zVar.f192096f = changeSharePeselState;
            zVar.f192097g = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public t(yy.a aVar, fj0.g gVar, nr3.e eVar, j14.n nVar, j14.a aVar2, us3.r rVar, lr3.a aVar3, SetupData setupData) {
        this.getContactDetailsUseCase = gVar;
        this.checkPersonalDataNameValidUseCase = eVar;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkEmailCorrectUC = aVar2;
        this.screenMapper = rVar;
        this.zusVisitContainersInteractor = aVar3;
        this.setupData = setupData;
        ts3.c.a aVar4 = ts3.c.a.f191908a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: ts3.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.N9(this.f191974a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new m(e9().getState(), this), D9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ts3.d.a D9(ts3.c cVar) {
        us3.r rVar = this.screenMapper;
        a aVar = new a(this);
        b bVar = new b(this);
        c cVar2 = new c(this);
        d dVar = new d(this);
        return rVar.b(new us3.r.Params(cVar, aVar, new g(this), new e(this), bVar, dVar, cVar2, new f(this), new er.l() { // from class: ts3.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f191969a, (a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(t tVar, ts3.a aVar) {
        tVar.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9(iy.b0 name) {
        i00.a.a(this, new h(name, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G9(iy.b0 surname) {
        i00.a.a(this, new i(surname, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H9(iy.b0 email) {
        i00.a.a(this, new j(email, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I9(boolean checked) {
        d9(new ts3.a.ChangeSharePeselState(checked));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9(iy.b0 phoneNumber) {
        i00.a.a(this, new k(phoneNumber, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K9(iy.b0 name) {
        i00.a.a(this, new l(name, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L9(iy.b0 surname) {
        d9(new ts3.a.AddTranslatorSurname(surname));
        d9(new ts3.a.CheckTranslator(null, surname, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final t tVar, k10.v vVar) {
        vVar.c(fr.q0.c(ts3.c.a.class), new er.l() { // from class: ts3.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.O9(this.f191971a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ts3.c.Initialized.class), new er.l() { // from class: ts3.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.P9(this.f191972a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(t tVar, k10.z zVar) {
        zVar.A(tVar.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(t tVar, k10.z zVar) {
        zVar.C(tVar.new y(null));
        b0 b0Var = tVar.new b0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ts3.a.AddEmail.class), oVar, b0Var);
        zVar.v(fr.q0.c(ts3.a.AddPhoneNumber.class), oVar, tVar.new c0(null));
        zVar.v(fr.q0.c(ts3.a.AddCaregiverName.class), oVar, new d0(null));
        zVar.v(fr.q0.c(ts3.a.AddCaregiverSurname.class), oVar, new e0(null));
        zVar.v(fr.q0.c(ts3.a.SetCaregiverCardExpanded.class), oVar, new f0(null));
        zVar.v(fr.q0.c(ts3.a.AddTranslatorName.class), oVar, new g0(null));
        zVar.v(fr.q0.c(ts3.a.AddTranslatorSurname.class), oVar, new h0(null));
        zVar.v(fr.q0.c(ts3.a.SetTranslatorCardExpanded.class), oVar, new i0(null));
        zVar.v(fr.q0.c(ts3.a.CheckEmail.class), oVar, tVar.new o(null));
        zVar.v(fr.q0.c(ts3.a.CheckPhoneNumber.class), oVar, tVar.new p(null));
        zVar.v(fr.q0.c(ts3.a.CheckCaregiver.class), oVar, tVar.new q(null));
        zVar.v(fr.q0.c(ts3.a.CheckTranslator.class), oVar, tVar.new r(null));
        zVar.v(fr.q0.c(ts3.a.r.class), oVar, new s(null));
        zVar.v(fr.q0.c(ts3.a.s.class), oVar, new C5016t(null));
        zVar.v(fr.q0.c(ts3.a.p.class), oVar, new u(null));
        zVar.v(fr.q0.c(ts3.a.q.class), oVar, new v(null));
        zVar.v(fr.q0.c(ts3.a.t.class), oVar, new w(null));
        zVar.v(fr.q0.c(ts3.a.u.class), oVar, new x(null));
        zVar.v(fr.q0.c(ts3.a.ChangeSharePeselState.class), oVar, new z(null));
        zVar.v(fr.q0.c(ts3.a.l.class), oVar, tVar.new a0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0127  */
    /* JADX WARN: Code duplicated, block: B:38:0x013f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0161  */
    /* JADX WARN: Code duplicated, block: B:45:0x0196  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Q9(ts3.c.Initialized initialized, tq.e<? super ts3.c.Initialized> eVar) throws Throwable {
        j0 j0Var;
        ts3.c.Initialized initializedB;
        ts3.c.Initialized initialized2;
        ts3.c.Initialized initialized3;
        hz.g gVar;
        ts3.c.Initialized initialized4;
        ts3.c.Initialized initialized5;
        ts3.c.Initialized initialized6;
        hz.g gVar2;
        Object objF;
        hz.g gVar3;
        if (eVar instanceof j0) {
            j0Var = (j0) eVar;
            int i15 = j0Var.f192034j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                j0Var.f192034j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                j0Var = new j0(eVar);
            }
        } else {
            j0Var = new j0(eVar);
        }
        Object objF2 = j0Var.f192032g;
        Object objE = uq.b.e();
        int i16 = j0Var.f192034j;
        if (i16 == 0) {
            oq.u.b(objF2);
            if (initialized.getCaregiverCardExpanded()) {
                nr3.e eVar2 = this.checkPersonalDataNameValidUseCase;
                nr3.e.Params params = new nr3.e.Params(initialized.getCaregiverName());
                j0Var.f192029d = initialized;
                j0Var.f192034j = 1;
                objF2 = eVar2.f(params, j0Var);
                if (objF2 != objE) {
                    initialized3 = initialized;
                }
            } else {
                iy.b0.Companion companion = iy.b0.INSTANCE;
                iy.b0 b0VarA = companion.a();
                iy.b0 b0VarA2 = companion.a();
                hz.b.d dVar = hz.b.d.f86848c;
                initializedB = ts3.c.Initialized.b(initialized, null, null, null, null, null, null, b0VarA, null, dVar, b0VarA2, null, dVar, false, null, null, null, null, null, null, false, null, false, 4191423, null);
                initialized2 = initialized;
                initialized4 = initializedB;
                if (!initialized4.getTranslatorCardExpanded()) {
                    iy.b0.Companion companion2 = iy.b0.INSTANCE;
                    iy.b0 b0VarA3 = companion2.a();
                    iy.b0 b0VarA4 = companion2.a();
                    hz.b.d dVar2 = hz.b.d.f86848c;
                    return ts3.c.Initialized.b(initialized4, null, null, null, null, null, null, null, null, null, null, null, null, false, b0VarA3, null, dVar2, b0VarA4, null, dVar2, false, null, false, 3825663, null);
                }
                nr3.e eVar3 = this.checkPersonalDataNameValidUseCase;
                nr3.e.Params params2 = new nr3.e.Params(initialized2.getTranslatorName());
                j0Var.f192029d = initialized2;
                j0Var.f192030e = initialized4;
                j0Var.f192034j = 3;
                objF2 = eVar3.f(params2, j0Var);
                if (objF2 != objE) {
                    initialized5 = initialized2;
                    initialized6 = initialized4;
                    gVar2 = (hz.g) objF2;
                    nr3.e eVar4 = this.checkPersonalDataNameValidUseCase;
                    nr3.e.Params params3 = new nr3.e.Params(initialized5.getTranslatorSurname());
                    j0Var.f192029d = vq.j.a(initialized5);
                    j0Var.f192030e = initialized6;
                    j0Var.f192031f = gVar2;
                    j0Var.f192034j = 4;
                    objF = eVar4.f(params3, j0Var);
                    if (objF != objE) {
                        gVar3 = gVar2;
                        objF2 = objF;
                        hz.b.Companion companion3 = hz.b.INSTANCE;
                        return ts3.c.Initialized.b(initialized6, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, companion3.a(gVar3), null, null, companion3.a((hz.g) objF2), false, null, false, 3899391, null);
                    }
                }
            }
            return objE;
        }
        if (i16 == 1) {
            initialized3 = (ts3.c.Initialized) j0Var.f192029d;
            oq.u.b(objF2);
        } else {
            if (i16 == 2) {
                gVar = (hz.g) j0Var.f192030e;
                ts3.c.Initialized initialized7 = (ts3.c.Initialized) j0Var.f192029d;
                oq.u.b(objF2);
                initialized2 = initialized7;
                hz.b.Companion companion4 = hz.b.INSTANCE;
                initializedB = ts3.c.Initialized.b(initialized2, null, null, null, null, null, null, null, null, companion4.a(gVar), null, null, companion4.a((hz.g) objF2), false, null, null, null, null, null, null, false, null, false, 4191999, null);
                initialized4 = initializedB;
                if (!initialized4.getTranslatorCardExpanded()) {
                    iy.b0.Companion companion5 = iy.b0.INSTANCE;
                    iy.b0 b0VarA5 = companion5.a();
                    iy.b0 b0VarA6 = companion5.a();
                    hz.b.d dVar3 = hz.b.d.f86848c;
                    return ts3.c.Initialized.b(initialized4, null, null, null, null, null, null, null, null, null, null, null, null, false, b0VarA5, null, dVar3, b0VarA6, null, dVar3, false, null, false, 3825663, null);
                }
                nr3.e eVar5 = this.checkPersonalDataNameValidUseCase;
                nr3.e.Params params4 = new nr3.e.Params(initialized2.getTranslatorName());
                j0Var.f192029d = initialized2;
                j0Var.f192030e = initialized4;
                j0Var.f192034j = 3;
                objF2 = eVar5.f(params4, j0Var);
                if (objF2 != objE) {
                    initialized5 = initialized2;
                    initialized6 = initialized4;
                    gVar2 = (hz.g) objF2;
                    nr3.e eVar6 = this.checkPersonalDataNameValidUseCase;
                    nr3.e.Params params5 = new nr3.e.Params(initialized5.getTranslatorSurname());
                    j0Var.f192029d = vq.j.a(initialized5);
                    j0Var.f192030e = initialized6;
                    j0Var.f192031f = gVar2;
                    j0Var.f192034j = 4;
                    objF = eVar6.f(params5, j0Var);
                    if (objF != objE) {
                        gVar3 = gVar2;
                        objF2 = objF;
                    }
                }
                return objE;
            }
            if (i16 == 3) {
                initialized6 = (ts3.c.Initialized) j0Var.f192030e;
                initialized5 = (ts3.c.Initialized) j0Var.f192029d;
                oq.u.b(objF2);
                gVar2 = (hz.g) objF2;
                nr3.e eVar7 = this.checkPersonalDataNameValidUseCase;
                nr3.e.Params params6 = new nr3.e.Params(initialized5.getTranslatorSurname());
                j0Var.f192029d = vq.j.a(initialized5);
                j0Var.f192030e = initialized6;
                j0Var.f192031f = gVar2;
                j0Var.f192034j = 4;
                objF = eVar7.f(params6, j0Var);
                if (objF != objE) {
                    gVar3 = gVar2;
                    objF2 = objF;
                }
                return objE;
            }
            if (i16 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar3 = (hz.g) j0Var.f192031f;
            initialized6 = (ts3.c.Initialized) j0Var.f192030e;
            oq.u.b(objF2);
        }
        hz.b.Companion companion6 = hz.b.INSTANCE;
        return ts3.c.Initialized.b(initialized6, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, companion6.a(gVar3), null, null, companion6.a((hz.g) objF2), false, null, false, 3899391, null);
        hz.g gVar4 = (hz.g) objF2;
        nr3.e eVar8 = this.checkPersonalDataNameValidUseCase;
        nr3.e.Params params7 = new nr3.e.Params(initialized3.getCaregiverSurname());
        j0Var.f192029d = initialized3;
        j0Var.f192030e = gVar4;
        j0Var.f192034j = 2;
        Object objF3 = eVar8.f(params7, j0Var);
        if (objF3 != objE) {
            initialized2 = initialized3;
            gVar = gVar4;
            objF2 = objF3;
            hz.b.Companion companion7 = hz.b.INSTANCE;
            initializedB = ts3.c.Initialized.b(initialized2, null, null, null, null, null, null, null, null, companion7.a(gVar), null, null, companion7.a((hz.g) objF2), false, null, null, null, null, null, null, false, null, false, 4191999, null);
            initialized4 = initializedB;
            if (!initialized4.getTranslatorCardExpanded()) {
                iy.b0.Companion companion8 = iy.b0.INSTANCE;
                iy.b0 b0VarA7 = companion8.a();
                iy.b0 b0VarA8 = companion8.a();
                hz.b.d dVar4 = hz.b.d.f86848c;
                return ts3.c.Initialized.b(initialized4, null, null, null, null, null, null, null, null, null, null, null, null, false, b0VarA7, null, dVar4, b0VarA8, null, dVar4, false, null, false, 3825663, null);
            }
            nr3.e eVar9 = this.checkPersonalDataNameValidUseCase;
            nr3.e.Params params8 = new nr3.e.Params(initialized2.getTranslatorName());
            j0Var.f192029d = initialized2;
            j0Var.f192030e = initialized4;
            j0Var.f192034j = 3;
            objF2 = eVar9.f(params8, j0Var);
            if (objF2 != objE) {
                initialized5 = initialized2;
                initialized6 = initialized4;
                gVar2 = (hz.g) objF2;
                nr3.e eVar10 = this.checkPersonalDataNameValidUseCase;
                nr3.e.Params params9 = new nr3.e.Params(initialized5.getTranslatorSurname());
                j0Var.f192029d = vq.j.a(initialized5);
                j0Var.f192030e = initialized6;
                j0Var.f192031f = gVar2;
                j0Var.f192034j = 4;
                objF = eVar10.f(params9, j0Var);
                if (objF != objE) {
                    gVar3 = gVar2;
                    objF2 = objF;
                    hz.b.Companion companion9 = hz.b.INSTANCE;
                    return ts3.c.Initialized.b(initialized6, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, companion9.a(gVar3), null, null, companion9.a((hz.g) objF2), false, null, false, 3899391, null);
                }
            }
        }
        return objE;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ts3.a.m mVar, tq.e<? super oq.i0> eVar) {
        return super.F(mVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<ts3.a.m> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ts3.c, ts3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ts3.d.a> getState() {
        return this.state;
    }
}
