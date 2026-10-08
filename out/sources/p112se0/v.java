package p112se0;

import er.q;
import fr.q0;
import k10.c0;
import k10.l;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import l00.e;
import l00.g;
import mu.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pe0.VerificationDocumentData;
import vq.k;
import we0.VerificationDataModel;
import we0.d;
import ze0.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lse0/v;", "Ll00/g;", "Lse0/r;", "", "Lyy/a;", "stateMachineFactory", "<init>", "(Lyy/a;)V", "Lpe0/d;", "documentData", "Loq/i0;", "i9", "(Lpe0/d;)V", "Lwe0/i0;", "data", "j9", "(Lwe0/i0;)V", "b", "Lse0/r;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "g0", "()Lpe0/d;", "getData", "()Lwe0/i0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends g<State, Object> implements e, f, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lse0/p;", "action", "Lk10/c0;", "Lse0/r;", "state", "Lk10/l;", "<anonymous>", "(Lse0/p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements q<DocumentDataChanged, c0<State>, tq.e<? super l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181042g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(DocumentDataChanged documentDataChanged, State state) {
            return State.b(state, documentDataChanged.getDocumentData(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final DocumentDataChanged documentDataChanged = (DocumentDataChanged) this.f181041f;
            c0 c0Var = (c0) this.f181042g;
            uq.b.e();
            if (this.f181040e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: se0.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.a.O(documentDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(DocumentDataChanged documentDataChanged, c0<State> c0Var, tq.e<? super l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f181041f = documentDataChanged;
            aVar.f181042g = c0Var;
            return aVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lse0/q;", "action", "Lk10/c0;", "Lse0/r;", "state", "Lk10/l;", "<anonymous>", "(Lse0/q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements q<VerificationDataChanged, c0<State>, tq.e<? super l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181045g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(VerificationDataChanged verificationDataChanged, State state) {
            return State.b(state, null, verificationDataChanged.getData(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final VerificationDataChanged verificationDataChanged = (VerificationDataChanged) this.f181044f;
            c0 c0Var = (c0) this.f181045g;
            uq.b.e();
            if (this.f181043e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: se0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.b.O(verificationDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(VerificationDataChanged verificationDataChanged, c0<State> c0Var, tq.e<? super l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f181044f = verificationDataChanged;
            bVar.f181045g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar) {
        State state = new State(null, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: se0.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.k9((v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: se0.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.l9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(z zVar) {
        a aVar = new a(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.v(q0.c(DocumentDataChanged.class), oVar, aVar);
        zVar.v(q0.c(VerificationDataChanged.class), oVar, new b(null));
        return i0.f148189a;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // ze0.f, we0.d
    public VerificationDocumentData g0() {
        return getState().getValue().getDocumentData();
    }

    @Override // we0.d
    public VerificationDataModel getData() {
        return getState().getValue().getData();
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    public void i9(VerificationDocumentData documentData) {
        d9(new DocumentDataChanged(documentData));
    }

    public void j9(VerificationDataModel data) {
        d9(new VerificationDataChanged(data));
    }
}
