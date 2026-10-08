package ju;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J[\u0010/\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b/\u00100JK\u00102\u001a\u0004\u0018\u000101\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\rH\u0001¢\u0006\u0004\b:\u0010\u000fJ\u0011\u0010;\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010A\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020C2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bD\u0010EJC\u0010G\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00028\u0001¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00102\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bM\u0010<J\u000f\u0010N\u001a\u00020\u0016H\u0000¢\u0006\u0004\bN\u00108J\u001d\u0010Q\u001a\u00020\u00162\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000OH\u0016¢\u0006\u0004\bQ\u0010!J-\u0010S\u001a\u00020\u00162\u0006\u0010F\u001a\u00028\u00002\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJC\u0010\u0001\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010F\u001a\u00028\u00012 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\b\u0001\u0010UJ#\u0010W\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010Z\u001a\u00020\u00162\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00160Rj\u0002`YH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020CH\u0000¢\u0006\u0004\b\\\u0010]JI\u0010^\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\"\b\u0002\u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0016H\u0000¢\u0006\u0004\b`\u00108JO\u0010a\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010F\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\ba\u0010bJ\u0019\u0010d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00162\u0006\u0010f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bg\u0010!J\u001b\u0010(\u001a\u00020\u0016*\u00020h2\u0006\u0010F\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010iJ\u001f\u0010j\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bj\u0010kJ\u001b\u0010l\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bl\u0010mJ\u000f\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020nH\u0014¢\u0006\u0004\bq\u0010pR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010y\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0016\u0010{\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010\u001dR\u0014\u0010}\u001a\u00020n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010pR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010<R\u0015\u0010\u0080\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u000fR\u0016\u0010\u0082\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u000fR\u001e\u0010\u0084\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bu\u0010\u0083\u0001R\r\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004R\u0015\u0010\u0088\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0087\u00018\u0002X\u0082\u0004R\u0015\u0010\u0089\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0087\u00018\u0002X\u0082\u0004¨\u0006\u008a\u0001"}, d2 = {"Lju/p;", "T", "Lju/d1;", "Lju/n;", "Lvq/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lju/k3;", "Ltq/e;", "delegate", "", "resumeMode", "<init>", "(Ltq/e;I)V", "", "J", "()Z", "", "cause", "q", "(Ljava/lang/Throwable;)Z", "Lou/b0;", "segment", "Loq/i0;", "p", "(Lou/b0;Ljava/lang/Throwable;)V", "b0", "Z", "Lju/i1;", "F", "()Lju/i1;", "", "handler", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/lang/Object;)V", "state", "K", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "u", "(I)V", "R", "Lju/r2;", "proposedUpdate", "Lkotlin/Function3;", "Ltq/i;", "onCancellation", "idempotent", "Y", "(Lju/r2;Ljava/lang/Object;ILer/q;Ljava/lang/Object;)Ljava/lang/Object;", "Lou/e0;", "a0", "(Ljava/lang/Object;Ljava/lang/Object;Ler/q;)Lou/e0;", "", "m", "(Ljava/lang/Object;)Ljava/lang/Void;", "t", "()V", ip.a.f96138c, "O", "k", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Q", "M", "(Ljava/lang/Throwable;)V", "Lju/m;", "n", "(Lju/m;Ljava/lang/Throwable;)V", "value", "o", "(Ler/q;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lju/d2;", "parent", "v", "(Lju/d2;)Ljava/lang/Throwable;", "x", "N", "Loq/t;", "result", "i", "Lkotlin/Function1;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ljava/lang/Object;Ler/l;)V", "(Ljava/lang/Object;Ler/q;)V", "index", "g", "(Lou/b0;I)V", "Lkotlinx/coroutines/CompletionHandler;", "E", "(Ler/l;)V", "I", "(Lju/m;)V", "V", "(Ljava/lang/Object;ILer/q;)V", "s", "U", "(Ljava/lang/Object;Ljava/lang/Object;Ler/q;)Ljava/lang/Object;", "exception", "G", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "W", "Lju/l0;", "(Lju/l0;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Ltq/e;", "b", "()Ltq/e;", "e", "Ltq/i;", "c", "()Ltq/i;", "context", "w", "parentHandle", "z", "stateDebugRepresentation", "y", "h", "isActive", "r", "isCompleted", "()Lvq/e;", "callerFrame", "Liu/c;", "_decisionAndIndex", "Liu/e;", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p<T> extends d1<T> implements n<T>, vq.e, k3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105765f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105766g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105767h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tq.e<T> delegate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tq.i context;

    /* JADX WARN: Multi-variable type inference failed */
    public p(tq.e<? super T> eVar, int i15) {
        super(i15);
        this.delegate = eVar;
        this.context = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f105668a;
    }

    private final i1 F() {
        d2 d2Var = (d2) getContext().m(d2.INSTANCE);
        if (d2Var == null) {
            return null;
        }
        i1 i1VarM = h2.m(d2Var, false, new t(this), 1, null);
        androidx.concurrent.futures.b.a(f105767h, this, null, i1VarM);
        return i1VarM;
    }

    private final void H(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105766g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d) {
                if (androidx.concurrent.futures.b.a(f105766g, this, obj, handler)) {
                    return;
                }
            } else if ((obj instanceof m) || (obj instanceof ou.b0)) {
                K(handler, obj);
            } else {
                if (obj instanceof c0) {
                    c0 c0Var = (c0) obj;
                    if (!c0Var.c()) {
                        K(handler, obj);
                    }
                    if (obj instanceof s) {
                        Throwable th4 = c0Var.cause;
                        if (handler instanceof m) {
                            n((m) handler, th4);
                            return;
                        } else {
                            p((ou.b0) handler, th4);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        K(handler, obj);
                    }
                    if (handler instanceof ou.b0) {
                        return;
                    }
                    m mVar = (m) handler;
                    if (completedContinuation.c()) {
                        n(mVar, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f105766g, this, obj, CompletedContinuation.b(completedContinuation, null, mVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof ou.b0) {
                        return;
                    }
                    if (androidx.concurrent.futures.b.a(f105766g, this, obj, new CompletedContinuation(obj, (m) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean J() {
        return e1.c(this.resumeMode) && ((ou.i) this.delegate).q();
    }

    private final void K(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(er.l lVar, Throwable th4, Object obj, tq.i iVar) {
        lVar.b(th4);
        return oq.i0.f148189a;
    }

    public static /* synthetic */ void X(p pVar, Object obj, int i15, er.q qVar, int i16, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i16 & 4) != 0) {
            qVar = null;
        }
        pVar.V(obj, i15, qVar);
    }

    private final <R> Object Y(r2 state, R proposedUpdate, int resumeMode, er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof c0) {
            return proposedUpdate;
        }
        if ((e1.b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof m) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof m ? (m) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    private final boolean Z() {
        int i15;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105765f;
        do {
            i15 = atomicIntegerFieldUpdater.get(this);
            int i16 = i15 >> 29;
            if (i16 != 0) {
                if (i16 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f105765f.compareAndSet(this, i15, 1073741824 + (536870911 & i15)));
        return true;
    }

    private final <R> ou.e0 a0(R proposedUpdate, Object idempotent, er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105766g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                Object obj2 = idempotent;
                if ((obj instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj).idempotentResume == obj2) {
                    return q.f105771a;
                }
                return null;
            }
            R r15 = proposedUpdate;
            Object obj3 = idempotent;
            er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> qVar = onCancellation;
            if (androidx.concurrent.futures.b.a(f105766g, this, obj, Y((r2) obj, r15, this.resumeMode, qVar, obj3))) {
                t();
                return q.f105771a;
            }
            proposedUpdate = r15;
            onCancellation = qVar;
            idempotent = obj3;
        }
    }

    private final boolean b0() {
        int i15;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105765f;
        do {
            i15 = atomicIntegerFieldUpdater.get(this);
            int i16 = i15 >> 29;
            if (i16 != 0) {
                if (i16 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f105765f.compareAndSet(this, i15, PKIFailureInfo.duplicateCertReq + (536870911 & i15)));
        return true;
    }

    private final Void m(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void p(ou.b0<?> segment, Throwable cause) {
        int i15 = f105765f.get(this) & 536870911;
        if (i15 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.s(i15, cause, getContext());
        } catch (Throwable th4) {
            n0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    private final boolean q(Throwable cause) {
        if (J()) {
            return ((ou.i) this.delegate).s(cause);
        }
        return false;
    }

    private final void t() {
        if (J()) {
            return;
        }
        s();
    }

    private final void u(int mode) {
        if (Z()) {
            return;
        }
        e1.a(this, mode);
    }

    private final i1 w() {
        return (i1) f105767h.get(this);
    }

    private final String z() {
        Object objY = y();
        if (objY instanceof r2) {
            return "Active";
        }
        return objY instanceof s ? "Cancelled" : "Completed";
    }

    public void D() {
        i1 i1VarF = F();
        if (i1VarF != null && r()) {
            i1VarF.j();
            f105767h.set(this, q2.f105774a);
        }
    }

    @Override // ju.n
    public void E(er.l<? super Throwable, oq.i0> handler) {
        r.c(this, new m.a(handler));
    }

    @Override // ju.n
    public Object G(Throwable exception) {
        return a0(new c0(exception, false, 2, null), null, null);
    }

    public final void I(m handler) {
        H(handler);
    }

    protected String L() {
        return "CancellableContinuation";
    }

    public final void M(Throwable cause) {
        if (q(cause)) {
            return;
        }
        Q(cause);
        t();
    }

    public final void N() {
        Throwable thU;
        tq.e<T> eVar = this.delegate;
        ou.i iVar = eVar instanceof ou.i ? (ou.i) eVar : null;
        if (iVar == null || (thU = iVar.u(this)) == null) {
            return;
        }
        s();
        Q(thU);
    }

    public final boolean O() {
        Object obj = f105766g.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            s();
            return false;
        }
        f105765f.set(this, 536870911);
        f105766g.set(this, d.f105668a);
        return true;
    }

    public void P(T value, final er.l<? super Throwable, oq.i0> onCancellation) {
        V(value, this.resumeMode, onCancellation != null ? new er.q() { // from class: ju.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p.S(onCancellation, (Throwable) obj, obj2, (tq.i) obj3);
            }
        } : null);
    }

    @Override // ju.n
    public boolean Q(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105766g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f105766g, this, obj, new s(this, cause, (obj instanceof m) || (obj instanceof ou.b0))));
        r2 r2Var = (r2) obj;
        if (r2Var instanceof m) {
            n((m) obj, cause);
        } else if (r2Var instanceof ou.b0) {
            p((ou.b0) obj, cause);
        }
        t();
        u(this.resumeMode);
        return true;
    }

    @Override // ju.n
    public void R(l0 l0Var, T t15) {
        tq.e<T> eVar = this.delegate;
        ou.i iVar = eVar instanceof ou.i ? (ou.i) eVar : null;
        X(this, t15, (iVar != null ? iVar.dispatcher : null) == l0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // ju.n
    public <R extends T> void T(R value, er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation) {
        V(value, this.resumeMode, onCancellation);
    }

    @Override // ju.n
    public <R extends T> Object U(R value, Object idempotent, er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation) {
        return a0(value, idempotent, onCancellation);
    }

    public final <R> void V(R proposedUpdate, int resumeMode, er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105766g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                R r15 = proposedUpdate;
                er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> qVar = onCancellation;
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (sVar.e()) {
                        if (qVar != null) {
                            o(qVar, sVar.cause, r15);
                            return;
                        }
                        return;
                    }
                }
                m(r15);
                throw new oq.g();
            }
            R r16 = proposedUpdate;
            int i15 = resumeMode;
            er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> qVar2 = onCancellation;
            if (androidx.concurrent.futures.b.a(f105766g, this, obj, Y((r2) obj, r16, i15, qVar2, null))) {
                t();
                u(i15);
                return;
            } else {
                proposedUpdate = r16;
                resumeMode = i15;
                onCancellation = qVar2;
            }
        }
    }

    @Override // ju.n
    public void W(Object token) {
        u(this.resumeMode);
    }

    @Override // ju.d1
    public void a(Object takenState, Throwable cause) {
        Throwable th4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105766g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof r2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof c0) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (completedContinuation.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th5 = cause;
                th4 = th5;
                if (androidx.concurrent.futures.b.a(f105766g, this, obj, CompletedContinuation.b(completedContinuation, null, null, null, null, th5, 15, null))) {
                    completedContinuation.d(this, th4);
                    return;
                }
            } else {
                th4 = cause;
                if (androidx.concurrent.futures.b.a(f105766g, this, obj, new CompletedContinuation(obj, null, null, null, th4, 14, null))) {
                    return;
                }
            }
            cause = th4;
        }
    }

    @Override // ju.d1
    public final tq.e<T> b() {
        return this.delegate;
    }

    @Override // tq.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public tq.i getContext() {
        return this.context;
    }

    @Override // ju.d1
    public Throwable d(Object state) {
        Throwable thD = super.d(state);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // vq.e
    public vq.e e() {
        tq.e<T> eVar = this.delegate;
        if (eVar instanceof vq.e) {
            return (vq.e) eVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ju.d1
    public <T> T f(Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // ju.k3
    public void g(ou.b0<?> segment, int index) {
        int i15;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105765f;
        do {
            i15 = atomicIntegerFieldUpdater.get(this);
            if ((i15 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i15, ((i15 >> 29) << 29) + index));
        H(segment);
    }

    @Override // ju.n
    public boolean h() {
        return y() instanceof r2;
    }

    @Override // tq.e
    public void i(Object result) {
        X(this, e0.c(result, this), this.resumeMode, null, 4, null);
    }

    @Override // ju.d1
    public Object k() {
        return y();
    }

    public final void n(m handler, Throwable cause) {
        try {
            handler.e(cause);
        } catch (Throwable th4) {
            n0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void o(er.q<? super Throwable, ? super R, ? super tq.i, oq.i0> onCancellation, Throwable cause, R value) {
        try {
            onCancellation.w(cause, value, getContext());
        } catch (Throwable th4) {
            n0.a(getContext(), new d0("Exception in resume onCancellation handler for " + this, th4));
        }
    }

    @Override // ju.n
    public boolean r() {
        return !(y() instanceof r2);
    }

    public final void s() {
        i1 i1VarW = w();
        if (i1VarW == null) {
            return;
        }
        i1VarW.j();
        f105767h.set(this, q2.f105774a);
    }

    public String toString() {
        return L() + '(' + t0.c(this.delegate) + "){" + z() + "}@" + t0.b(this);
    }

    public Throwable v(d2 parent) {
        return parent.N();
    }

    public final Object x() {
        d2 d2Var;
        boolean zJ = J();
        if (b0()) {
            if (w() == null) {
                F();
            }
            if (zJ) {
                N();
            }
            return uq.b.e();
        }
        if (zJ) {
            N();
        }
        Object objY = y();
        if (objY instanceof c0) {
            throw ((c0) objY).cause;
        }
        if (!e1.b(this.resumeMode) || (d2Var = (d2) getContext().m(d2.INSTANCE)) == null || d2Var.h()) {
            return f(objY);
        }
        CancellationException cancellationExceptionN = d2Var.N();
        a(objY, cancellationExceptionN);
        throw cancellationExceptionN;
    }

    public final Object y() {
        return f105766g.get(this);
    }
}
