package u23;

import java.util.List;
import java.util.Map;
import k23.BusinessDetailsData;
import k23.DetailsModel;
import k23.OtherReportData;
import k23.Place;
import k23.PlaceOfPurchaseData;
import k23.Product;
import k23.ProductData;
import k23.ReportLocationDescription;
import p071kotlin.Metadata;
import st3.AddressData;
import tt0.BEAttachmentsConfiguration;
import tt0.BEReportCategory;
import tt0.BEReportSubCategory;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\t2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b6\u00107J#\u0010;\u001a\u00020\t2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020908H\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000209\u0018\u000108H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\t2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0011\u0010I\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bI\u0010JJ\u0011\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020\t2\b\u0010N\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0011\u0010T\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bT\u0010UJ\u0011\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020VH\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010^\u001a\u0004\u0018\u00010]2\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\t2\u0006\u0010$\u001a\u00020]H\u0016¢\u0006\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR \u0010k\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR&\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030l8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010w\u001a\b\u0012\u0004\u0012\u00020\u00020r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lu23/p2;", "Ll00/g;", "Lu23/f0;", "", "Lu23/g0;", "Lyy/a;", "stateMachineFactory", "<init>", "(Lyy/a;)V", "Loq/i0;", "K5", "()V", "Ltt0/g;", "category", "G5", "(Ltt0/g;)V", ip.a.f96137b, "()Ltt0/g;", "Ltt0/h;", "subType", "s3", "(Ltt0/h;)V", "Lk23/l;", "I", "()Lk23/l;", "locationDescription", "Z3", "(Lk23/l;)V", "c3", "Lk23/h;", "data", "s5", "(Lk23/h;)V", "P0", "()Lk23/h;", "Lk23/g;", "details", "i3", "(Lk23/g;)V", "h6", "()Ltt0/h;", "i0", "()Lk23/g;", "Ltt0/b;", "configuration", "s0", "(Ltt0/b;)V", "p2", "()Ltt0/b;", "", "Lwx/i;", "attachments", "Y7", "(Ljava/util/List;)V", "h", "()Ljava/util/List;", "Ldx/i;", "", "edorAddressEither", "B5", "(Ldx/i;)V", "S7", "()Ldx/i;", "Lk23/k$b$a;", "phoneAndEmail", "S4", "(Lk23/k$b$a;)V", "F5", "()Lk23/k$b$a;", "Lk23/k;", "method", "R7", "(Lk23/k;)V", "K0", "()Lk23/k;", "Lst3/b;", "o", "()Lst3/b;", "address", "l4", "(Lst3/b;)V", "Lk23/j;", "u3", "(Lk23/j;)V", "G0", "()Lk23/j;", "Lk23/i;", "N", "()Lk23/i;", "T5", "(Lk23/i;)V", "Lk23/c;", "businessSelection", "Lk23/b;", "M0", "(Lk23/c;)Lk23/b;", "D2", "(Lk23/b;)V", "b", "Lu23/f0;", "initialState", "Lxw/b;", "Lu23/q;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p2 extends l00.g<State, Object> implements g0, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q> navAction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/w;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<SaveEdorAddressEither, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194810g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveEdorAddressEither saveEdorAddressEither, State state) {
            return State.b(state, null, null, null, null, null, null, saveEdorAddressEither.a(), null, null, null, null, 1983, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveEdorAddressEither saveEdorAddressEither = (SaveEdorAddressEither) this.f194809f;
            k10.c0 c0Var = (k10.c0) this.f194810g;
            uq.b.e();
            if (this.f194808e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.o2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.a.O(saveEdorAddressEither, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveEdorAddressEither saveEdorAddressEither, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f194809f = saveEdorAddressEither;
            aVar.f194810g = c0Var;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/z;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/z;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SavePhoneAndEmail, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194813g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SavePhoneAndEmail savePhoneAndEmail, State state) {
            return State.b(state, null, null, null, null, null, null, null, savePhoneAndEmail.getPhoneAndEmail(), null, null, null, 1919, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SavePhoneAndEmail savePhoneAndEmail = (SavePhoneAndEmail) this.f194812f;
            k10.c0 c0Var = (k10.c0) this.f194813g;
            uq.b.e();
            if (this.f194811e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.q2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.b.O(savePhoneAndEmail, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SavePhoneAndEmail savePhoneAndEmail, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f194812f = savePhoneAndEmail;
            bVar.f194813g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/c0;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/c0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SaveProvidedMethodOfContact, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194816g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveProvidedMethodOfContact saveProvidedMethodOfContact, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, saveProvidedMethodOfContact.getMethod(), null, null, 1791, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveProvidedMethodOfContact saveProvidedMethodOfContact = (SaveProvidedMethodOfContact) this.f194815f;
            k10.c0 c0Var = (k10.c0) this.f194816g;
            uq.b.e();
            if (this.f194814e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.r2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.c.O(saveProvidedMethodOfContact, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveProvidedMethodOfContact saveProvidedMethodOfContact, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f194815f = saveProvidedMethodOfContact;
            cVar.f194816g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/r;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SaveAddress, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194819g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveAddress saveAddress, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, Place.b(state.getCategoryPlace(), null, saveAddress.getAddress(), 1, null), 1023, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveAddress saveAddress = (SaveAddress) this.f194818f;
            k10.c0 c0Var = (k10.c0) this.f194819g;
            uq.b.e();
            if (this.f194817e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.s2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.d.O(saveAddress, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveAddress saveAddress, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f194818f = saveAddress;
            dVar.f194819g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/b0;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/b0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SaveProductData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194822g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveProductData saveProductData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, Product.b(state.getCategoryProduct(), saveProductData.getData(), null, null, 6, null), null, 1535, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveProductData saveProductData = (SaveProductData) this.f194821f;
            k10.c0 c0Var = (k10.c0) this.f194822g;
            uq.b.e();
            if (this.f194820e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.t2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.e.O(saveProductData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveProductData saveProductData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f194821f = saveProductData;
            eVar2.f194822g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/a0;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/a0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SavePlaceOfPurchaseData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194825g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SavePlaceOfPurchaseData savePlaceOfPurchaseData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, Product.b(state.getCategoryProduct(), null, savePlaceOfPurchaseData.getData(), null, 5, null), null, 1535, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SavePlaceOfPurchaseData savePlaceOfPurchaseData = (SavePlaceOfPurchaseData) this.f194824f;
            k10.c0 c0Var = (k10.c0) this.f194825g;
            uq.b.e();
            if (this.f194823e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.u2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.f.O(savePlaceOfPurchaseData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SavePlaceOfPurchaseData savePlaceOfPurchaseData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f194824f = savePlaceOfPurchaseData;
            fVar.f194825g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/u;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<SaveBusinessDetailsData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194827f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194828g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, SaveBusinessDetailsData saveBusinessDetailsData, State state) {
            Product categoryProduct = state.getCategoryProduct();
            Map mapW = pq.v0.w(((State) c0Var.a()).getCategoryProduct().c());
            mapW.put(saveBusinessDetailsData.getData().getBusinessSelection(), saveBusinessDetailsData.getData());
            oq.i0 i0Var = oq.i0.f148189a;
            return State.b(state, null, null, null, null, null, null, null, null, null, Product.b(categoryProduct, null, null, mapW, 3, null), null, 1535, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveBusinessDetailsData saveBusinessDetailsData = (SaveBusinessDetailsData) this.f194827f;
            final k10.c0 c0Var = (k10.c0) this.f194828g;
            uq.b.e();
            if (this.f194826e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.v2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.g.O(c0Var, saveBusinessDetailsData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveBusinessDetailsData saveBusinessDetailsData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f194827f = saveBusinessDetailsData;
            gVar.f194828g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu23/q;", "action", "Lu23/f0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu23/q;Lu23/f0;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<q, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194830f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q qVar = (q) this.f194830f;
            Object objE = uq.b.e();
            int i15 = this.f194829e;
            if (i15 == 0) {
                oq.u.b(obj);
                p2 p2Var = p2.this;
                this.f194830f = vq.j.a(qVar);
                this.f194829e = 1;
                if (p2Var.F(qVar, this) == objE) {
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
        public final Object w(q qVar, State state, tq.e<? super oq.i0> eVar) {
            h hVar = p2.this.new h(eVar);
            hVar.f194830f = qVar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/d0;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/d0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<SaveSelectedCategory, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194834g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveSelectedCategory saveSelectedCategory, State state) {
            return state.a(saveSelectedCategory.getCategory(), null, null, null, null, pq.v.n(), null, null, null, new Product(null, null, null, 7, null), new Place(null, null, 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveSelectedCategory saveSelectedCategory = (SaveSelectedCategory) this.f194833f;
            k10.c0 c0Var = (k10.c0) this.f194834g;
            uq.b.e();
            if (this.f194832e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(saveSelectedCategory.getCategory(), ((State) c0Var.a()).getSelectedReportCategory()) ? c0Var.c() : c0Var.b(new er.l() { // from class: u23.w2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.i.O(saveSelectedCategory, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveSelectedCategory saveSelectedCategory, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f194833f = saveSelectedCategory;
            iVar.f194834g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/e0;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/e0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<SaveSelectedSubType, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194837g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveSelectedSubType saveSelectedSubType, State state) {
            return State.b(state, null, saveSelectedSubType.getSubType(), null, null, null, null, null, null, null, new Product(null, null, null, 7, null), new Place(null, null, 3, null), 509, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveSelectedSubType saveSelectedSubType = (SaveSelectedSubType) this.f194836f;
            k10.c0 c0Var = (k10.c0) this.f194837g;
            uq.b.e();
            if (this.f194835e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(saveSelectedSubType.getSubType(), ((State) c0Var.a()).getSelectedReportSubType()) ? c0Var.c() : c0Var.b(new er.l() { // from class: u23.x2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.j.O(saveSelectedSubType, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveSelectedSubType saveSelectedSubType, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f194836f = saveSelectedSubType;
            jVar.f194837g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/x;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<SaveLocationDescription, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194839f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194840g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveLocationDescription saveLocationDescription, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, Place.b(state.getCategoryPlace(), saveLocationDescription.getLocationDescription(), null, 2, null), 1023, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveLocationDescription saveLocationDescription = (SaveLocationDescription) this.f194839f;
            k10.c0 c0Var = (k10.c0) this.f194840g;
            uq.b.e();
            if (this.f194838e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.y2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.k.O(saveLocationDescription, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveLocationDescription saveLocationDescription, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f194839f = saveLocationDescription;
            kVar.f194840g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/y;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/y;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<SaveOtherReportData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194843g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveOtherReportData saveOtherReportData, State state) {
            return State.b(state, null, null, saveOtherReportData.getData(), null, null, null, null, null, null, null, null, 2043, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveOtherReportData saveOtherReportData = (SaveOtherReportData) this.f194842f;
            k10.c0 c0Var = (k10.c0) this.f194843g;
            uq.b.e();
            if (this.f194841e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.z2
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.l.O(saveOtherReportData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveOtherReportData saveOtherReportData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f194842f = saveOtherReportData;
            lVar.f194843g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/p;", "<unused var>", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<u23.p, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194845f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, 2043, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f194845f;
            uq.b.e();
            if (this.f194844e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.a3
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.m.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(u23.p pVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f194845f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/v;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<SaveDetails, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194848g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveDetails saveDetails, State state) {
            return State.b(state, null, null, null, saveDetails.getDetails(), null, null, null, null, null, null, null, 2039, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveDetails saveDetails = (SaveDetails) this.f194847f;
            k10.c0 c0Var = (k10.c0) this.f194848g;
            uq.b.e();
            if (this.f194846e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.b3
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.n.O(saveDetails, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveDetails saveDetails, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f194847f = saveDetails;
            nVar.f194848g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/t;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<SaveAttachmentsConfiguration, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194851g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveAttachmentsConfiguration saveAttachmentsConfiguration, State state) {
            return State.b(state, null, null, null, null, saveAttachmentsConfiguration.getConfiguration(), null, null, null, null, null, null, 2031, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveAttachmentsConfiguration saveAttachmentsConfiguration = (SaveAttachmentsConfiguration) this.f194850f;
            k10.c0 c0Var = (k10.c0) this.f194851g;
            uq.b.e();
            if (this.f194849e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.c3
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.o.O(saveAttachmentsConfiguration, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveAttachmentsConfiguration saveAttachmentsConfiguration, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f194850f = saveAttachmentsConfiguration;
            oVar.f194851g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu23/s;", "action", "Lk10/c0;", "Lu23/f0;", "state", "Lk10/l;", "<anonymous>", "(Lu23/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<SaveAttachments, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194854g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveAttachments saveAttachments, State state) {
            return State.b(state, null, null, null, null, null, saveAttachments.a(), null, null, null, null, null, 2015, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveAttachments saveAttachments = (SaveAttachments) this.f194853f;
            k10.c0 c0Var = (k10.c0) this.f194854g;
            uq.b.e();
            if (this.f194852e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u23.d3
                @Override // er.l
                public final Object b(Object obj2) {
                    return p2.p.O(saveAttachments, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveAttachments saveAttachments, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = new p(eVar);
            pVar.f194853f = saveAttachments;
            pVar.f194854g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    public p2(yy.a aVar) {
        State state = new State(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: u23.m2
            @Override // er.l
            public final Object b(Object obj) {
                return p2.k9(this.f194775a, (k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k9(final p2 p2Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: u23.n2
            @Override // er.l
            public final Object b(Object obj) {
                return p2.l9(this.f194779a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(p2 p2Var, k10.z zVar) {
        h hVar = p2Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(q.class), oVar, hVar);
        zVar.v(fr.q0.c(SaveSelectedCategory.class), oVar, new i(null));
        zVar.v(fr.q0.c(SaveSelectedSubType.class), oVar, new j(null));
        zVar.v(fr.q0.c(SaveLocationDescription.class), oVar, new k(null));
        zVar.v(fr.q0.c(SaveOtherReportData.class), oVar, new l(null));
        zVar.v(fr.q0.c(u23.p.class), oVar, new m(null));
        zVar.v(fr.q0.c(SaveDetails.class), oVar, new n(null));
        zVar.v(fr.q0.c(SaveAttachmentsConfiguration.class), oVar, new o(null));
        zVar.v(fr.q0.c(SaveAttachments.class), oVar, new p(null));
        zVar.v(fr.q0.c(SaveEdorAddressEither.class), oVar, new a(null));
        zVar.v(fr.q0.c(SavePhoneAndEmail.class), oVar, new b(null));
        zVar.v(fr.q0.c(SaveProvidedMethodOfContact.class), oVar, new c(null));
        zVar.v(fr.q0.c(SaveAddress.class), oVar, new d(null));
        zVar.v(fr.q0.c(SaveProductData.class), oVar, new e(null));
        zVar.v(fr.q0.c(SavePlaceOfPurchaseData.class), oVar, new f(null));
        zVar.v(fr.q0.c(SaveBusinessDetailsData.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    @Override // h33.e
    public void B5(dx.i<oq.i0, String> edorAddressEither) {
        d9(new SaveEdorAddressEither(edorAddressEither));
    }

    @Override // x23.d
    public void D2(BusinessDetailsData details) {
        d9(new SaveBusinessDetailsData(details));
    }

    @Override // h33.e
    public k23.k.Data.PhoneAndEmail F5() {
        return getState().getValue().getPhoneAndEmail();
    }

    @Override // v33.j, r33.f
    public ProductData G0() {
        return getState().getValue().getCategoryProduct().getProductData();
    }

    @Override // t33.d
    public void G5(BEReportCategory category) {
        d9(new SaveSelectedCategory(category));
    }

    @Override // e33.e, v33.j, c33.p
    public ReportLocationDescription I() {
        return getState().getValue().getCategoryPlace().getLocationDescription();
    }

    @Override // h33.e, v33.j
    public k23.k K0() {
        return getState().getValue().getProvidedMethodOfContact();
    }

    @Override // u23.g0
    public void K5() {
        d9(q.a.f194855a);
    }

    @Override // v33.j, x23.d
    public BusinessDetailsData M0(k23.c businessSelection) {
        return getState().getValue().getCategoryProduct().c().get(businessSelection);
    }

    @Override // v33.j, o33.e, x23.d
    public PlaceOfPurchaseData N() {
        return getState().getValue().getCategoryProduct().getPlaceOfPurchaseData();
    }

    @Override // m33.f, v33.j
    public OtherReportData P0() {
        return getState().getValue().getOtherReportData();
    }

    @Override // h33.e
    public void R7(k23.k method) {
        d9(new SaveProvidedMethodOfContact(method));
    }

    @Override // y33.d, v33.j
    public BEReportCategory S() {
        return getState().getValue().getSelectedReportCategory();
    }

    @Override // h33.e
    public void S4(k23.k.Data.PhoneAndEmail phoneAndEmail) {
        d9(new SavePhoneAndEmail(phoneAndEmail));
    }

    @Override // h33.e
    public dx.i<oq.i0, String> S7() {
        return getState().getValue().h();
    }

    @Override // o33.e
    public void T5(PlaceOfPurchaseData data) {
        d9(new SavePlaceOfPurchaseData(data));
    }

    @Override // zx.b
    public xw.b<q> Y1() {
        return this.navAction;
    }

    @Override // z23.f
    public void Y7(List<? extends wx.i> attachments) {
        d9(new SaveAttachments(attachments));
    }

    @Override // e33.e
    public void Z3(ReportLocationDescription locationDescription) {
        d9(new SaveLocationDescription(locationDescription));
    }

    @Override // k33.d
    public void c3() {
        d9(u23.p.f194800a);
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<State> getState() {
        return this.state;
    }

    @Override // z23.f, v33.j, v23.e
    public List<wx.i> h() {
        return getState().getValue().c();
    }

    @Override // v33.j
    public BEReportSubCategory h6() {
        return getState().getValue().getSelectedReportSubType();
    }

    @Override // z23.f, v33.j
    public DetailsModel i0() {
        return getState().getValue().getDetails();
    }

    @Override // z23.f
    public void i3(DetailsModel details) {
        d9(new SaveDetails(details));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(q qVar, tq.e<? super oq.i0> eVar) {
        return super.F(qVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // c33.p
    public void l4(AddressData address) {
        d9(new SaveAddress(address));
    }

    @Override // v33.j, c33.p
    public AddressData o() {
        return getState().getValue().getCategoryPlace().getAddress();
    }

    @Override // v33.j
    public BEAttachmentsConfiguration p2() {
        return getState().getValue().getAttachmentsConfiguration();
    }

    @Override // z23.f, v33.j
    public void s0(BEAttachmentsConfiguration configuration) {
        d9(new SaveAttachmentsConfiguration(configuration));
    }

    @Override // y33.d
    public void s3(BEReportSubCategory subType) {
        d9(new SaveSelectedSubType(subType));
    }

    @Override // m33.f
    public void s5(OtherReportData data) {
        d9(new SaveOtherReportData(data));
    }

    @Override // r33.f
    public void u3(ProductData data) {
        d9(new SaveProductData(data));
    }
}
