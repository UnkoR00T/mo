package p143z0;

import a4.PointerInputChange;
import a4.a0;
import a4.o;
import a4.p0;
import a4.q;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.g1;
import c5.y;
import c5.z;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import fr.t;
import g4.f;
import g4.f1;
import g4.h;
import g4.j;
import java.util.List;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.c0;
import p071kotlin.Metadata;
import pq.v;
import vq.k;
import w0.g0;
import w0.v0;
import w0.y0;
import x3.IndirectPointerInputChange;
import x3.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B7\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\"H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b-\u0010\u001dJ3\u00105\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001b2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u0010\u001dJ'\u0010;\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010<J'\u0010?\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J'\u0010B\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ'\u0010E\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ'\u0010H\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ'\u0010M\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u000202H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u000202H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020.H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001bH\u0002¢\u0006\u0004\bU\u0010\u001dJ@\u0010[\u001a\u00020\u001b2.\u0010Z\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u001b0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0X\u0012\u0006\u0012\u0004\u0018\u00010Y0VH¦@¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u001b2\u0006\u0010]\u001a\u000202H&¢\u0006\u0004\b^\u00108J\u0017\u0010_\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\"H&¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\bH&¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bc\u0010\u001dJ\u000f\u0010d\u001a\u00020\u001bH\u0004¢\u0006\u0004\bd\u0010\u001dJ\u0017\u0010f\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gJ'\u0010j\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010m\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020l2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u001bH\u0016¢\u0006\u0004\bo\u0010\u001dJ\u0017\u0010p\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020.H\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u001bH\u0016¢\u0006\u0004\br\u0010\u001dJ\r\u0010s\u001a\u00020\u001b¢\u0006\u0004\bs\u0010\u001dJO\u0010u\u001a\u00020\u001b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010t\u001a\u00020\b¢\u0006\u0004\bu\u0010vJ\u0015\u0010w\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\bw\u0010xR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R@\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R'\u0010\n\u001a\u00020\b2\u0006\u0010\u007f\u001a\u00020\b8\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010bR,\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u007f\u001a\u0004\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R#\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0081\u0001R!\u0010\u0093\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R(\u0010\u009c\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0098\u0001\u0010\u0085\u0001\u001a\u0005\b\u0099\u0001\u0010b\"\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010 \u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u0085\u0001\u001a\u0005\b\u009e\u0001\u0010b\"\u0006\b\u009f\u0001\u0010\u009b\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010¶\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010:\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¾\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010µ\u0001R\u0017\u0010Á\u0001\u001a\u00020=8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Ä\u0001\u001a\u00020G8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010Ç\u0001\u001a\u00020A8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010Ê\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001¨\u0006Ë\u0001"}, d2 = {"Lz0/t0;", "Lg4/j;", "Lg4/f1;", "Lx3/g;", "Lg4/e;", "Lw0/v0;", "Lkotlin/Function1;", "La4/p0;", "", "canDrag", "enabled", "Lb1/l;", "interactionSource", "Lz0/a2;", "orientationLock", "<init>", "(Ler/l;ZLb1/l;Lz0/a2;)V", "Lb4/g;", "c4", "()Lb4/g;", "Llu/g;", "Lz0/m0;", "a4", "()Llu/g;", "Lz0/g3;", "b4", "()Lz0/g3;", "Loq/i0;", "j4", "()V", "Lz0/m0$c;", "event", "V3", "(Lz0/m0$c;Ltq/e;)Ljava/lang/Object;", "Lz0/m0$d;", "W3", "(Lz0/m0$d;Ltq/e;)Ljava/lang/Object;", "U3", "(Ltq/e;)Ljava/lang/Object;", "La4/o;", "pointerEvent", "La4/q;", "pass", "Z3", "(La4/o;La4/q;)V", "d4", "La4/b0;", "initialDown", "La4/a0;", "pointerId", "Lm3/e;", "initialTouchSlopPositionChange", "verifyConsumptionInFinalPass", "M3", "(La4/b0;JJZ)V", "O3", "(J)V", "K3", "touchSlopDetector", "L3", "(La4/b0;JLz0/g3;)V", "Lz0/l0$a;", "state", "Y3", "(La4/o;La4/q;Lz0/l0$a;)V", "Lz0/l0$c;", "T3", "(La4/o;La4/q;Lz0/l0$c;)V", "Lz0/l0$b;", "S3", "(La4/o;La4/q;Lz0/l0$b;)V", "Lz0/l0$d;", "X3", "(La4/o;La4/q;Lz0/l0$d;)V", "down", "slopTriggerChange", "overSlopOffset", "g4", "(La4/b0;La4/b0;J)V", "change", "dragAmount", "f4", "(La4/b0;J)V", "h4", "(La4/b0;)V", "e4", "Lkotlin/Function2;", "Lz0/m0$b;", "Ltq/e;", "", "forEachDelta", "A3", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "startedPosition", "Q3", "R3", "(Lz0/m0$d;)V", "i4", "()Z", "X2", "I3", "Lx3/f;", "i0", "(Lx3/f;)Z", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "Lx3/c;", "v2", "(Lx3/c;La4/q;)V", "m2", "e0", "(La4/b0;)Z", "Z1", "z3", "shouldResetPointerInputHandling", "k4", "(Ler/l;ZLb1/l;Lz0/a2;Z)V", "P3", "(Lz0/m0;)V", "v", "Lz0/a2;", i.f37090q, "()Lz0/a2;", "setOrientationLock", "(Lz0/a2;)V", "value", "w", "Ler/l;", "E3", "()Ler/l;", "x", "Z", "G3", "y", "Lb1/l;", "getInteractionSource", "()Lb1/l;", "Lg4/g;", "z", "Lg4/g;", "gestureNode", "A", "_canDrag", "B", "Llu/g;", "channel", "Lb1/b;", "C", "Lb1/b;", "dragInteraction", ip.a.f96138c, "J3", "setListeningForEvents$foundation", "(Z)V", "isListeningForEvents", "E", "isListeningForPointerInputEvents$foundation", "setListeningForPointerInputEvents$foundation", "isListeningForPointerInputEvents", "F", "Lz0/l0$a;", "_awaitDownState", "G", "Lz0/l0$d;", "_draggingState", i.f37087n, "Lz0/l0$c;", "_awaitTouchSlopState", "I", "Lz0/l0$b;", "_awaitGesturePickupState", "Lz0/l0;", "K", "Lz0/l0;", "currentDragState", i.f37094u, "Lb4/g;", "velocityTracker", "O", "J", "previousPositionOnScreen", i.f37086m, "Lz0/g3;", "Lz0/h1;", "R", "Lz0/h1;", "indirectPointerInputDragCycleDetector", "T", "nodeOffset", "B3", "()Lz0/l0$a;", "awaitDownState", "F3", "()Lz0/l0$d;", "draggingState", "D3", "()Lz0/l0$c;", "awaitTouchSlopState", "C3", "()Lz0/l0$b;", "awaitGesturePickupState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class t0 extends j implements f1, g, g4.e, v0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final l<p0, Boolean> _canDrag = new l() { // from class: z0.s0
        @Override // er.l
        public final Object b(Object obj) {
            return Boolean.valueOf(t0.u3(this.f231677a, (p0) obj));
        }
    };

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private lu.g<m0> channel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private b1.b dragInteraction;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean isListeningForEvents;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isListeningForPointerInputEvents;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private l0.a _awaitDownState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private l0.d _draggingState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private l0.c _awaitTouchSlopState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private l0.b _awaitGesturePickupState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private l0 currentDragState;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private b4.g velocityTracker;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private long previousPositionOnScreen;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private g3 touchSlopDetector;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private h1 indirectPointerInputDragCycleDetector;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private long nodeOffset;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private a2 orientationLock;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private l<? super p0, Boolean> canDrag;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private b1.l interactionSource;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private g4.g gestureNode;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231685a;

        static {
            int[] iArr = new int[l0.a.EnumC6222a.values().length];
            try {
                iArr[l0.a.EnumC6222a.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f231685a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f231686d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231688f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231686d = obj;
            this.f231688f |= PKIFailureInfo.systemUnavail;
            return t0.this.U3(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f231691f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f231693h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231691f = obj;
            this.f231693h |= PKIFailureInfo.systemUnavail;
            return t0.this.V3(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231695e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231697g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231695e = obj;
            this.f231697g |= PKIFailureInfo.systemUnavail;
            return t0.this.W3(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f231701h;

        /* JADX INFO: renamed from: z0.t0$e$a, reason: from Kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lz0/m0$b;", "Loq/i0;", "processDelta", "<anonymous>", "(Ler/l;)V"}, k = 3, mv = {2, 1, 0})
        static final class Function1 extends k implements p<l<? super m0.b, ? extends i0>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f231703e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f231704f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f231705g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ fr.p0<m0> f231706h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ t0 f231707j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Function1(fr.p0<m0> p0Var, t0 t0Var, tq.e<? super Function1> eVar) {
                super(2, eVar);
                this.f231706h = p0Var;
                this.f231707j = t0Var;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                l lVar;
                m0 m0Var;
                T t15;
                fr.p0<m0> p0Var;
                Object objE = uq.b.e();
                int i15 = this.f231704f;
                if (i15 == 0) {
                    u.b(obj);
                    lVar = (l) this.f231705g;
                    m0Var = this.f231706h.f66410a;
                    if (!(m0Var instanceof m0.d) || (m0Var instanceof m0.a)) {
                        return i0.f148189a;
                    }
                    t15 = 0;
                    m0.b bVar = m0Var instanceof m0.b ? (m0.b) m0Var : null;
                    if (bVar != null) {
                        lVar.b(bVar);
                    }
                    p0Var = this.f231706h;
                    lu.g gVar = this.f231707j.channel;
                    if (gVar != null) {
                        this.f231705g = lVar;
                        this.f231703e = p0Var;
                        this.f231704f = 1;
                        obj = gVar.a(this);
                        if (obj == objE) {
                            return objE;
                        }
                    }
                    p0Var.f66410a = t15;
                    m0Var = this.f231706h.f66410a;
                    if (m0Var instanceof m0.d) {
                    }
                    return i0.f148189a;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (fr.p0) this.f231703e;
                lVar = (l) this.f231705g;
                u.b(obj);
                t15 = (m0) obj;
                p0Var.f66410a = t15;
                m0Var = this.f231706h.f66410a;
                if (m0Var instanceof m0.d) {
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(l<? super m0.b, i0> lVar, tq.e<? super i0> eVar) {
                return ((Function1) v(lVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                Function1 function1 = new Function1(this.f231706h, this.f231707j, eVar);
                function1.f231705g = obj;
                return function1;
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034 A[PHI: r1 r3
          0x0034: PHI (r1v14 fr.p0) = (r1v6 fr.p0), (r1v19 fr.p0) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r3v8 ju.p0) = (r3v5 ju.p0), (r3v10 ju.p0) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x005e A[PHI: r4
          0x005e: PHI (r4v7 ju.p0) = (r4v0 ju.p0), (r4v3 ju.p0), (r4v3 ju.p0), (r4v3 ju.p0), (r4v5 ju.p0), (r4v8 ju.p0) binds: [B:18:0x0056, B:45:0x00d7, B:47:0x00e6, B:41:0x00d0, B:30:0x008e, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:26:0x0082  */
        /* JADX WARN: Code duplicated, block: B:31:0x0090  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d5 A[Catch: CancellationException -> 0x00d3, TryCatch #2 {CancellationException -> 0x00d3, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00d5, B:46:0x00d9), top: B:59:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[Catch: CancellationException -> 0x00d3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d3, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00d5, B:46:0x00d9), top: B:59:0x00bb }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d0 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d7 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e6 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f6 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.t0.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = t0.this.new e(eVar);
            eVar2.f231701h = obj;
            return eVar2;
        }
    }

    public t0(l<? super p0, Boolean> lVar, boolean z15, b1.l lVar2, a2 a2Var) {
        this.orientationLock = a2Var;
        this.canDrag = lVar;
        this.enabled = z15;
        this.interactionSource = lVar2;
        m3.e.Companion companion = m3.e.INSTANCE;
        this.previousPositionOnScreen = companion.b();
        this.nodeOffset = companion.c();
    }

    private final l0.a B3() {
        l0.a aVar = this._awaitDownState;
        if (aVar != null) {
            return aVar;
        }
        l0.a aVar2 = new l0.a(null, false, 3, null);
        this._awaitDownState = aVar2;
        return aVar2;
    }

    private final l0.b C3() {
        l0.b bVar = this._awaitGesturePickupState;
        if (bVar != null) {
            return bVar;
        }
        l0.b bVar2 = new l0.b(null, 0L, null, 7, null);
        this._awaitGesturePickupState = bVar2;
        return bVar2;
    }

    private final l0.c D3() {
        l0.c cVar = this._awaitTouchSlopState;
        if (cVar != null) {
            return cVar;
        }
        l0.c cVar2 = new l0.c(null, 0L, false, 7, null);
        this._awaitTouchSlopState = cVar2;
        return cVar2;
    }

    private final l0.d F3() {
        l0.d dVar = this._draggingState;
        if (dVar != null) {
            return dVar;
        }
        l0.d dVar2 = new l0.d(0L, 1, null);
        this._draggingState = dVar2;
        return dVar2;
    }

    private final void K3() {
        l0.a aVarB3 = B3();
        aVarB3.c(l0.a.EnumC6222a.NotInitialized);
        aVarB3.d(false);
        this.currentDragState = aVarB3;
    }

    private final void L3(PointerInputChange initialDown, long pointerId, g3 touchSlopDetector) {
        l0.b bVarC3 = C3();
        bVarC3.c(initialDown);
        bVarC3.d(pointerId);
        g3.h(touchSlopDetector, 0L, 1, null);
        bVarC3.e(touchSlopDetector);
        this.currentDragState = bVarC3;
    }

    private final void M3(PointerInputChange initialDown, long pointerId, long initialTouchSlopPositionChange, boolean verifyConsumptionInFinalPass) {
        l0.c cVarD3 = D3();
        cVarD3.d(initialDown);
        cVarD3.e(pointerId);
        g3 g3Var = this.touchSlopDetector;
        if (g3Var == null) {
            this.touchSlopDetector = new g3(this.orientationLock, 0L, 2, null);
        } else {
            if (g3Var != null) {
                g3Var.i(this.orientationLock);
            }
            g3 g3Var2 = this.touchSlopDetector;
            if (g3Var2 != null) {
                g3Var2.g(initialTouchSlopPositionChange);
            }
        }
        cVarD3.f(verifyConsumptionInFinalPass);
        this.currentDragState = cVarD3;
    }

    static /* synthetic */ void N3(t0 t0Var, PointerInputChange pointerInputChange, long j15, long j16, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToAwaitTouchSlopState-aWI9W7U");
        }
        if ((i15 & 4) != 0) {
            j16 = m3.e.INSTANCE.c();
        }
        long j17 = j16;
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        t0Var.M3(pointerInputChange, j15, j17, z15);
    }

    private final void O3(long pointerId) {
        l0.d dVarF3 = F3();
        dVarF3.b(pointerId);
        this.currentDragState = dVarF3;
    }

    private final void S3(o pointerEvent, q pass, l0.b state) {
        boolean z15;
        if (pass != q.Final) {
            return;
        }
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                z15 = true;
                break;
            } else {
                if (listC.get(i15).q()) {
                    z15 = false;
                    break;
                }
                i15++;
            }
        }
        List<PointerInputChange> listC2 = pointerEvent.c();
        int size2 = listC2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            if (listC2.get(i16).getPressed()) {
                if (pointerEvent.c().isEmpty()) {
                    break;
                }
                if (z15) {
                    long jP = m3.e.p(((PointerInputChange) v.l0(pointerEvent.c())).getPosition(), state.getInitialDown().getPosition());
                    PointerInputChange initialDown = state.getInitialDown();
                    if (initialDown == null) {
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                    }
                    N3(this, initialDown, state.getPointerId(), jP, false, 8, null);
                    return;
                }
                return;
            }
        }
        K3();
    }

    private final void T3(o pointerEvent, q pass, l0.c state) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (pass == q.Initial) {
            return;
        }
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i15 = 0;
        while (true) {
            pointerInputChange = null;
            if (i15 >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = listC.get(i15);
            if (a0.b(pointerInputChange2.getId(), state.getPointerId())) {
                break;
            } else {
                i15++;
            }
        }
        PointerInputChange pointerInputChange4 = pointerInputChange2;
        if (pointerInputChange4 == null) {
            List<PointerInputChange> listC2 = pointerEvent.c();
            int size2 = listC2.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size2) {
                    pointerInputChange3 = null;
                    break;
                }
                pointerInputChange3 = listC2.get(i16);
                if (pointerInputChange3.getPressed()) {
                    break;
                } else {
                    i16++;
                }
            }
            pointerInputChange4 = pointerInputChange3;
            if (pointerInputChange4 == null) {
                K3();
                return;
            }
            state.e(pointerInputChange4.getId());
        }
        if (pass == q.Main) {
            if (pointerInputChange4.q()) {
                PointerInputChange initialDown = state.getInitialDown();
                if (initialDown == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long pointerId = state.getPointerId();
                g3 g3Var = this.touchSlopDetector;
                if (g3Var == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                L3(initialDown, pointerId, g3Var);
            } else if (a4.p.d(pointerInputChange4)) {
                List<PointerInputChange> listC3 = pointerEvent.c();
                int size3 = listC3.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    PointerInputChange pointerInputChange5 = listC3.get(i17);
                    if (pointerInputChange5.getPressed()) {
                        pointerInputChange = pointerInputChange5;
                        break;
                    }
                }
                PointerInputChange pointerInputChange6 = pointerInputChange;
                if (pointerInputChange6 == null) {
                    K3();
                } else {
                    state.e(pointerInputChange6.getId());
                }
            } else {
                long jD = g3.d(b4(), a4.p.h(pointerInputChange4), q0.p((f3) f.a(this, g1.u()), pointerInputChange4.getType()), false, 4, null);
                if (g0.isNestedDraggablesTouchConflictFixEnabled) {
                    if ((9223372034707292159L & jD) != 9205357640488583168L) {
                        boolean zE0 = e0(pointerInputChange4);
                        v0 v0VarC = y0.c(this);
                        boolean z15 = v0VarC != null && v0VarC.e0(pointerInputChange4);
                        if (zE0 || !z15) {
                            pointerInputChange4.a();
                            g4(state.getInitialDown(), pointerInputChange4, jD);
                            f4(pointerInputChange4, jD);
                            O3(pointerInputChange4.getId());
                        } else {
                            state.f(true);
                        }
                    } else {
                        state.f(true);
                    }
                } else if ((9223372034707292159L & jD) != 9205357640488583168L) {
                    pointerInputChange4.a();
                    g4(state.getInitialDown(), pointerInputChange4, jD);
                    f4(pointerInputChange4, jD);
                    O3(pointerInputChange4.getId());
                } else {
                    state.f(true);
                }
            }
        }
        if (pass == q.Final && state.getVerifyConsumptionInFinalPass()) {
            if (!pointerInputChange4.q()) {
                state.f(false);
                return;
            }
            PointerInputChange initialDown2 = state.getInitialDown();
            if (initialDown2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
            }
            long pointerId2 = state.getPointerId();
            g3 g3Var2 = this.touchSlopDetector;
            if (g3Var2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
            L3(initialDown2, pointerId2, g3Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U3(tq.e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f231688f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f231688f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f231686d;
        Object objE = uq.b.e();
        int i16 = bVar.f231688f;
        if (i16 == 0) {
            u.b(obj);
            b1.b bVar2 = this.dragInteraction;
            if (bVar2 != null) {
                b1.l lVar = this.interactionSource;
                if (lVar != null) {
                    b1.a aVar = new b1.a(bVar2);
                    bVar.f231688f = 1;
                    if (lVar.a(aVar, bVar) == objE) {
                        return objE;
                    }
                }
            }
            R3(new m0.d(y.INSTANCE.a(), false, null));
            return i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u.b(obj);
        this.dragInteraction = null;
        R3(new m0.d(y.INSTANCE.a(), false, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V3(m0.c cVar, tq.e<? super i0> eVar) throws Throwable {
        c cVar2;
        b1.l lVar;
        b1.b bVar;
        m0.c cVar3;
        b1.b bVar2;
        if (eVar instanceof c) {
            cVar2 = (c) eVar;
            int i15 = cVar2.f231693h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f231693h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(eVar);
            }
        } else {
            cVar2 = new c(eVar);
        }
        Object obj = cVar2.f231691f;
        Object objE = uq.b.e();
        int i16 = cVar2.f231693h;
        if (i16 == 0) {
            u.b(obj);
            b1.b bVar3 = this.dragInteraction;
            if (bVar3 != null && (lVar = this.interactionSource) != null) {
                b1.a aVar = new b1.a(bVar3);
                cVar2.f231689d = cVar;
                cVar2.f231693h = 1;
                if (lVar.a(aVar, cVar2) != objE) {
                }
                return objE;
            }
            this.dragInteraction = bVar;
            Q3(cVar.getStartPoint());
            return i0.f148189a;
        }
        if (i16 == 1) {
            cVar = (m0.c) cVar2.f231689d;
            u.b(obj);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (b1.b) cVar2.f231690e;
            cVar3 = (m0.c) cVar2.f231689d;
            u.b(obj);
        }
        bVar = bVar2;
        cVar = cVar3;
        this.dragInteraction = bVar;
        Q3(cVar.getStartPoint());
        return i0.f148189a;
        bVar = new b1.b();
        b1.l lVar2 = this.interactionSource;
        if (lVar2 != null) {
            cVar2.f231689d = cVar;
            cVar2.f231690e = bVar;
            cVar2.f231693h = 2;
            if (lVar2.a(bVar, cVar2) != objE) {
                cVar3 = cVar;
                bVar2 = bVar;
                bVar = bVar2;
                cVar = cVar3;
            }
            return objE;
        }
        this.dragInteraction = bVar;
        Q3(cVar.getStartPoint());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W3(m0.d dVar, tq.e<? super i0> eVar) throws Throwable {
        d dVar2;
        if (eVar instanceof d) {
            dVar2 = (d) eVar;
            int i15 = dVar2.f231697g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f231697g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar2 = new d(eVar);
            }
        } else {
            dVar2 = new d(eVar);
        }
        Object obj = dVar2.f231695e;
        Object objE = uq.b.e();
        int i16 = dVar2.f231697g;
        if (i16 == 0) {
            u.b(obj);
            b1.b bVar = this.dragInteraction;
            if (bVar != null) {
                b1.l lVar = this.interactionSource;
                if (lVar != null) {
                    b1.c cVar = new b1.c(bVar);
                    dVar2.f231694d = dVar;
                    dVar2.f231697g = 1;
                    if (lVar.a(cVar, dVar2) == objE) {
                        return objE;
                    }
                }
            }
            R3(dVar);
            return i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (m0.d) dVar2.f231694d;
        u.b(obj);
        this.dragInteraction = null;
        R3(dVar);
        return i0.f148189a;
    }

    private final void X3(o pointerEvent, q pass, l0.d state) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (pass != q.Main) {
            return;
        }
        long pointerId = state.getPointerId();
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i15 = 0;
        while (true) {
            pointerInputChange = null;
            if (i15 >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = listC.get(i15);
            if (a0.b(pointerInputChange2.getId(), pointerId)) {
                break;
            } else {
                i15++;
            }
        }
        PointerInputChange pointerInputChange3 = pointerInputChange2;
        if (pointerInputChange3 == null) {
            return;
        }
        if (!a4.p.d(pointerInputChange3)) {
            if (pointerInputChange3.q()) {
                e4();
                return;
            } else {
                if (m3.e.k(a4.p.h(pointerInputChange3)) == 0.0f) {
                    return;
                }
                f4(pointerInputChange3, a4.p.g(pointerInputChange3));
                pointerInputChange3.a();
                return;
            }
        }
        List<PointerInputChange> listC2 = pointerEvent.c();
        int size2 = listC2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            PointerInputChange pointerInputChange4 = listC2.get(i16);
            if (pointerInputChange4.getPressed()) {
                pointerInputChange = pointerInputChange4;
                break;
            }
        }
        PointerInputChange pointerInputChange5 = pointerInputChange;
        if (pointerInputChange5 != null) {
            state.b(pointerInputChange5.getId());
            return;
        }
        if (pointerInputChange3.q() || !a4.p.d(pointerInputChange3)) {
            e4();
        } else {
            h4(pointerInputChange3);
        }
        K3();
    }

    private final void Y3(o pointerEvent, q pass, l0.a state) {
        l0.a.EnumC6222a awaitTouchSlop;
        if (!pointerEvent.c().isEmpty() && b3.k(pointerEvent, false, false, 2, null)) {
            PointerInputChange pointerInputChange = (PointerInputChange) v.l0(pointerEvent.c());
            if (a.f231685a[state.getAwaitTouchSlop().ordinal()] == 1) {
                awaitTouchSlop = !getStartDragImmediately() ? l0.a.EnumC6222a.Yes : l0.a.EnumC6222a.No;
            } else {
                awaitTouchSlop = state.getAwaitTouchSlop();
            }
            state.c(awaitTouchSlop);
            if (pass == q.Initial && awaitTouchSlop == l0.a.EnumC6222a.No) {
                pointerInputChange.a();
                state.d(true);
            }
            if (pass == q.Main) {
                if (awaitTouchSlop == l0.a.EnumC6222a.Yes) {
                    N3(this, pointerInputChange, pointerInputChange.getId(), 0L, false, 12, null);
                } else if (state.getConsumedOnInitial()) {
                    m3.e.Companion companion = m3.e.INSTANCE;
                    g4(pointerInputChange, pointerInputChange, companion.c());
                    f4(pointerInputChange, companion.c());
                    O3(pointerInputChange.getId());
                }
            }
        }
    }

    private final void Z3(o pointerEvent, q pass) {
        l0 l0Var = this.currentDragState;
        if (l0Var == null) {
            throw new IllegalArgumentException("currentDragState should not be null");
        }
        if (l0Var instanceof l0.a) {
            Y3(pointerEvent, pass, (l0.a) l0Var);
            return;
        }
        if (l0Var instanceof l0.c) {
            T3(pointerEvent, pass, (l0.c) l0Var);
        } else if (l0Var instanceof l0.b) {
            S3(pointerEvent, pass, (l0.b) l0Var);
        } else {
            if (!(l0Var instanceof l0.d)) {
                throw new oq.p();
            }
            X3(pointerEvent, pass, (l0.d) l0Var);
        }
    }

    private final lu.g<m0> a4() {
        lu.g<m0> gVar = this.channel;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    private final g3 b4() {
        g3 g3Var = this.touchSlopDetector;
        if (g3Var != null) {
            return g3Var;
        }
        throw new IllegalArgumentException("Touch slop detector not initialized.");
    }

    private final b4.g c4() {
        b4.g gVar = this.velocityTracker;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    private final void d4() {
        K3();
        if (this.isListeningForEvents) {
            e4();
        }
        this.velocityTracker = null;
    }

    private final void e4() {
        a4().d(m0.a.f231448a);
    }

    private final void f4(PointerInputChange change, long dragAmount) {
        long jI = c0.i(h.q(getNode()));
        if (!m3.e.j(this.previousPositionOnScreen, m3.e.INSTANCE.b()) && !m3.e.j(jI, this.previousPositionOnScreen)) {
            this.nodeOffset = m3.e.q(this.nodeOffset, m3.e.p(jI, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = jI;
        b4.h.d(c4(), change, this.nodeOffset);
        a4().d(new m0.b(dragAmount, false, null));
    }

    private final void g4(PointerInputChange down, PointerInputChange slopTriggerChange, long overSlopOffset) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new b4.g();
        }
        b4.h.c(c4(), down);
        long jP = m3.e.p(slopTriggerChange.getPosition(), overSlopOffset);
        this.nodeOffset = m3.e.INSTANCE.c();
        if (this.canDrag.b(p0.f(down.getType())).booleanValue()) {
            if (!this.isListeningForEvents) {
                if (this.channel == null) {
                    this.channel = lu.j.b(Integer.MAX_VALUE, null, null, 6, null);
                }
                j4();
            }
            this.previousPositionOnScreen = c0.i(h.q(this));
            a4().d(new m0.c(jP, null));
        }
    }

    private final void h4(PointerInputChange change) {
        b4.h.c(c4(), change);
        float f15 = ((f3) f.a(this, g1.u())).f();
        long jB = c4().b(z.a(f15, f15));
        c4().d();
        a4().d(new m0.d(Function1.l(jB), false, null));
        this.isListeningForPointerInputEvents = false;
    }

    private final void j4() {
        this.isListeningForEvents = true;
        if (this.channel == null) {
            this.channel = lu.j.b(Integer.MAX_VALUE, null, null, 6, null);
        }
        ju.k.d(M2(), null, null, new e(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l4(t0 t0Var, l lVar, boolean z15, b1.l lVar2, a2 a2Var, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i15 & 1) != 0) {
            lVar = t0Var.canDrag;
        }
        if ((i15 & 2) != 0) {
            z15 = t0Var.enabled;
        }
        if ((i15 & 4) != 0) {
            lVar2 = t0Var.interactionSource;
        }
        if ((i15 & 8) != 0) {
            a2Var = t0Var.orientationLock;
        }
        if ((i15 & 16) != 0) {
            z16 = false;
        }
        boolean z17 = z16;
        b1.l lVar3 = lVar2;
        l lVar4 = lVar;
        t0Var.k4(lVar4, z15, lVar3, a2Var, z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u3(t0 t0Var, p0 p0Var) {
        return t0Var.canDrag.b(p0Var).booleanValue();
    }

    public abstract Object A3(p<? super l<? super m0.b, i0>, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar);

    public final l<p0, Boolean> E3() {
        return this.canDrag;
    }

    /* JADX INFO: renamed from: G3, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: H3, reason: from getter */
    public final a2 getOrientationLock() {
        return this.orientationLock;
    }

    protected final void I3() {
        if (g0.isDelayPressesUsingGestureConsumptionEnabled && this.gestureNode == null) {
            this.gestureNode = n3(y0.b(this));
        }
    }

    /* JADX INFO: renamed from: J3, reason: from getter */
    public final boolean getIsListeningForEvents() {
        return this.isListeningForEvents;
    }

    public final void P3(m0 event) {
        if ((event instanceof m0.c) && !this.isListeningForEvents) {
            this.isListeningForEvents = true;
            j4();
        }
        a4().d(event);
    }

    public abstract void Q3(long startedPosition);

    public abstract void R3(m0.d event);

    @Override // f3.m.c
    public void X2() {
        this.isListeningForEvents = false;
        z3();
        this.nodeOffset = m3.e.INSTANCE.c();
        g4.g gVar = this.gestureNode;
        if (gVar != null) {
            q3(gVar);
        }
        this.gestureNode = null;
    }

    @Override // g4.f1
    public void Y(o pointerEvent, q pass, long bounds) {
        this.isListeningForPointerInputEvents = true;
        I3();
        if (this.enabled) {
            if (this.currentDragState == null) {
                this.currentDragState = B3();
            }
            Z3(pointerEvent, pass);
        }
    }

    @Override // g4.f1
    public void Z1() {
        if (this.isListeningForPointerInputEvents) {
            d4();
        }
        this.isListeningForPointerInputEvents = false;
    }

    @Override // w0.v0
    public boolean e0(PointerInputChange event) {
        if (a4.p.b(event)) {
            return this.enabled;
        }
        if (!g0.isNestedDraggablesTouchConflictFixEnabled || a4.p.d(event)) {
            return false;
        }
        if (this.touchSlopDetector == null) {
            this.touchSlopDetector = new g3(this.orientationLock, 0L, 2, null);
        }
        float fG = ((f3) f.a(this, g1.u())).g();
        long jG = a4.p.g(event);
        g3 g3VarB4 = b4();
        return !m3.e.j(g3VarB4.c(jG, fG, false), m3.e.INSTANCE.b()) && g3VarB4.e(jG);
    }

    @Override // w0.v0
    public boolean i0(IndirectPointerInputChange event) {
        return i1.g(event) && this.enabled;
    }

    /* JADX INFO: renamed from: i4 */
    public abstract boolean getStartDragImmediately();

    public final void k4(l<? super p0, Boolean> canDrag, boolean enabled, b1.l interactionSource, a2 orientationLock, boolean shouldResetPointerInputHandling) {
        this.canDrag = canDrag;
        boolean z15 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                z3();
                this.indirectPointerInputDragCycleDetector = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!t.c(this.interactionSource, interactionSource)) {
            z3();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z15 = shouldResetPointerInputHandling;
        }
        if (z15) {
            if (this.isListeningForPointerInputEvents) {
                d4();
            }
            h1 h1Var = this.indirectPointerInputDragCycleDetector;
            if (h1Var != null) {
                h1Var.q();
            }
        }
    }

    @Override // x3.g
    public void m2() {
        h1 h1Var = this.indirectPointerInputDragCycleDetector;
        if (h1Var != null) {
            h1Var.q();
        }
    }

    @Override // x3.g
    public void v2(x3.c event, q pass) {
        I3();
        if (this.enabled) {
            if (this.indirectPointerInputDragCycleDetector == null) {
                this.indirectPointerInputDragCycleDetector = new h1(this);
            }
            h1 h1Var = this.indirectPointerInputDragCycleDetector;
            if (h1Var != null) {
                h1Var.m(event, pass);
            }
        }
    }

    public final void z3() {
        b1.b bVar = this.dragInteraction;
        if (bVar != null) {
            b1.l lVar = this.interactionSource;
            if (lVar != null) {
                lVar.b(new b1.a(bVar));
            }
            this.dragInteraction = null;
        }
    }
}
