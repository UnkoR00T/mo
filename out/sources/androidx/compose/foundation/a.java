package androidx.compose.foundation;

import a4.PointerInputChange;
import a4.y0;
import android.view.KeyEvent;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.g1;
import g4.f1;
import g4.i1;
import g4.q1;
import g4.v0;
import g4.w0;
import ju.d2;
import ju.p0;
import ju.q0;
import ju.z0;
import n4.f0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p143z0.b2;
import r0.m0;
import r0.x;
import w0.e0;
import w0.g0;
import w0.j1;
import w0.n1;
import w0.r1;
import w0.t0;
import x3.IndirectPointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b!\u0018\u0000 ¥\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002¦\u0001BM\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u001bJ\u0019\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010 J\u000f\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010 J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020\u0016*\u000200H\u0016¢\u0006\u0004\b1\u00102JU\u00103\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0004¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0004¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u00162\u0006\u0010%\u001a\u00020:2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0016¢\u0006\u0004\b?\u0010 J\u000f\u0010@\u001a\u00020\u0016H\u0016¢\u0006\u0004\b@\u0010 J\r\u0010A\u001a\u00020\u0016¢\u0006\u0004\bA\u0010 J\u000f\u0010B\u001a\u00020\u0016H\u0004¢\u0006\u0004\bB\u0010 J'\u0010F\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C2\u0006\u0010<\u001a\u00020;2\u0006\u0010E\u001a\u000205H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010 J\u0015\u0010J\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020IH$¢\u0006\u0004\bL\u0010KJ\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020IH$¢\u0006\u0004\bM\u0010KJ\u000f\u0010N\u001a\u00020\u0016H\u0014¢\u0006\u0004\bN\u0010 J\u0015\u0010O\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020I¢\u0006\u0004\bO\u0010KJ\u0011\u0010P\u001a\u00020\u0016*\u000200¢\u0006\u0004\bP\u00102J\u0011\u0010Q\u001a\u0004\u0018\u00010\u0016H\u0004¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00162\u0006\u0010%\u001a\u00020(H\u0004¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\bU\u0010VJ\u001f\u0010Z\u001a\u00020\u00162\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000eH\u0004¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\u00162\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\\\u0010[J\u0017\u0010]\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u000eH\u0004¢\u0006\u0004\b]\u0010\u001eJ\u001c\u0010_\u001a\u00020\u0016*\u00020^2\u0006\u0010X\u001a\u00020WH\u0084@¢\u0006\u0004\b_\u0010`R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020\u000e8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bl\u0010f\u001a\u0004\bm\u0010\u001bR0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010t\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\br\u0010f\u001a\u0004\bs\u0010\u001bR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010z\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010dR\u0018\u0010}\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0080\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0092\u0001\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0086\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010bR\u0018\u0010\u009b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010fR\u001b\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010\u009d\u0001R\u001f\u0010¢\u0001\u001a\u00030\u009f\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bf\u0010 \u0001\u001a\u0006\b\u0098\u0001\u0010¡\u0001R\u0013\u0010¤\u0001\u001a\u00020\u000e8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\u001b¨\u0006§\u0001"}, d2 = {"Landroidx/compose/foundation/a;", "Lg4/j;", "Lg4/f1;", "Ly3/g;", "Lg4/i1;", "Lg4/q1;", "Lg4/e;", "Lg4/v0;", "Lx3/g;", "Lw0/v0;", "Lb1/l;", "interactionSource", "Lw0/r1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Ln4/l;", "role", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lb1/l;Lw0/r1;ZZLjava/lang/String;Ln4/l;Ler/a;Lfr/k;)V", "h4", "()Z", "isFocused", "d4", "(Z)V", "f4", "()V", "Z3", "Y3", "I3", "La4/b0;", "event", "J3", "(La4/b0;)Z", "Lx3/f;", "K3", "(Lx3/f;)Z", "M3", "N3", "La4/y0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37090q, "()La4/y0;", "Ln4/i0;", "F3", "(Ln4/i0;)V", "i4", "(Lb1/l;Lw0/r1;ZZLjava/lang/String;Ln4/l;Ler/a;)V", "Lc5/r;", "size", "Lm3/k;", "P3", "(J)J", "Lx3/c;", "La4/q;", "pass", "v2", "(Lx3/c;La4/q;)V", "W2", "T0", "X2", "L3", "La4/o;", "pointerEvent", "bounds", "Y", "(La4/o;La4/q;J)V", "Z1", "Ly3/b;", "W1", "(Landroid/view/KeyEvent;)Z", "b4", "c4", "a4", "v1", "E2", "g4", "()Loq/i0;", "W3", "(Lx3/f;)V", "V3", "(La4/b0;)V", "Lm3/e;", "offset", "indirectPointer", "X3", "(JZ)V", "U3", "S3", "Lz0/b2;", "R3", "(Lz0/b2;JLtq/e;)Ljava/lang/Object;", "v", "Lb1/l;", "w", "Lw0/r1;", "x", "Z", "y", "Ljava/lang/String;", "z", "Ln4/l;", "value", "A", "O3", "B", "Ler/a;", "Q3", "()Ler/a;", "C", "R2", "shouldAutoInvalidate", "Lw0/t0;", ip.a.f96138c, "Lw0/t0;", "focusableNode", "E", "localIndicationNodeFactory", "F", "La4/y0;", "pointerInputNode", "Lg4/g;", "G", "Lg4/g;", "gestureNode", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "indicationNode", "Lb1/n$b;", "I", "Lb1/n$b;", "pressInteraction", "Lb1/g;", "K", "Lb1/g;", "hoverInteraction", "Lr0/m0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lr0/m0;", "currentKeyPressInteractions", "O", "J", "centerOffset", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "indirectPointerPressInteraction", "R", "Lm3/e;", "indirectPointerEventPressPosition", "T", "userProvidedInteractionSource", "X", "lazilyCreateIndication", "Lju/d2;", "Lju/d2;", "delayJob", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "traverseKey", "F2", "shouldMergeDescendantSemantics", "h0", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a extends g4.j implements f1, y3.g, i1, q1, g4.e, v0, x3.g, w0.v0 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f9505q0 = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private er.a<i0> onClick;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final t0 focusableNode;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private r1 localIndicationNodeFactory;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private y0 pointerInputNode;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private g4.g gestureNode;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private g4.g indicationNode;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private b1.n.b pressInteraction;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private b1.g hoverInteraction;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final m0<b1.n.b> currentKeyPressInteractions;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private long centerOffset;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private b1.n.b indirectPointerPressInteraction;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private m3.e indirectPointerEventPressPosition;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private b1.l userProvidedInteractionSource;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private boolean lazilyCreateIndication;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private d2 delayJob;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private b1.l interactionSource;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private r1 indicationNodeFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean useLocalIndication;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String onClickLabel;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private n4.l role;

    /* JADX INFO: renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/a$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.g f9513g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b1.l lVar, b1.g gVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f9512f = lVar;
            this.f9513g = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9511e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = this.f9512f;
                b1.g gVar = this.f9513g;
                this.f9511e = 1;
                if (lVar.a(gVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f9512f, this.f9513g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9515f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.h f9516g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b1.l lVar, b1.h hVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f9515f = lVar;
            this.f9516g = hVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9514e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = this.f9515f;
                b1.h hVar = this.f9516g;
                this.f9514e = 1;
                if (lVar.a(hVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f9515f, this.f9516g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.l<Boolean, i0> {
        d(Object obj) {
            super(1, obj, a.class, "onFocusChange", "onFocusChange(Z)V", 0);
        }

        public final void E(boolean z15) {
            ((a) this.f66391b).d4(z15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Boolean bool) {
            E(bool.booleanValue());
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f9517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f9518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f9519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b2 f9520h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f9521j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ b1.l f9522k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ a f9523l;

        /* JADX INFO: renamed from: androidx.compose.foundation.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0195a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f9524e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f9525f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a f9526g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f9527h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ b1.l f9528j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0195a(a aVar, long j15, b1.l lVar, tq.e<? super C0195a> eVar) {
                super(2, eVar);
                this.f9526g = aVar;
                this.f9527h = j15;
                this.f9528j = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                b1.n.b bVar;
                Object objE = uq.b.e();
                int i15 = this.f9525f;
                if (i15 == 0) {
                    u.b(obj);
                    if (g0.isDelayPressesUsingGestureConsumptionEnabled ? this.f9526g.J3(null) : this.f9526g.I3()) {
                        long jA = e0.a();
                        this.f9525f = 1;
                        if (z0.b(jA, this) != objE) {
                        }
                    }
                    return objE;
                }
                if (i15 == 1) {
                    u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b1.n.b) this.f9524e;
                    u.b(obj);
                }
                this.f9526g.pressInteraction = bVar;
                return i0.f148189a;
                b1.n.b bVar2 = new b1.n.b(this.f9527h, null);
                b1.l lVar = this.f9528j;
                this.f9524e = bVar2;
                this.f9525f = 2;
                if (lVar.a(bVar2, this) != objE) {
                    bVar = bVar2;
                    this.f9526g.pressInteraction = bVar;
                    return i0.f148189a;
                }
                return objE;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C0195a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C0195a(this.f9526g, this.f9527h, this.f9528j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b2 b2Var, long j15, b1.l lVar, a aVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f9520h = b2Var;
            this.f9521j = j15;
            this.f9522k = lVar;
            this.f9523l = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        
            if (r3.a(r2, r16) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
        
            if (r4.a(r5, r16) == r1) goto L41;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f9520h, this.f9521j, this.f9522k, this.f9523l, eVar);
            eVar2.f9519g = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.a f9531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ju.i1 f9532h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b1.l lVar, b1.n.a aVar, ju.i1 i1Var, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f9530f = lVar;
            this.f9531g = aVar;
            this.f9532h = i1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9529e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = this.f9530f;
                b1.n.a aVar = this.f9531g;
                this.f9529e = 1;
                if (lVar.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            ju.i1 i1Var = this.f9532h;
            if (i1Var != null) {
                i1Var.j();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f9530f, this.f9531g, this.f9532h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f9533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f9534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d2 f9535g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f9536h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b1.l f9537j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(d2 d2Var, long j15, b1.l lVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f9535g = d2Var;
            this.f9536h = j15;
            this.f9537j = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (r8.a(r1, r7) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f9534f
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L26
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                oq.u.b(r8)
                goto L5e
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f9533e
                b1.n$c r1 = (b1.n.c) r1
                oq.u.b(r8)
                goto L51
            L26:
                oq.u.b(r8)
                goto L38
            L2a:
                oq.u.b(r8)
                ju.d2 r8 = r7.f9535g
                r7.f9534f = r5
                java.lang.Object r8 = r8.T0(r7)
                if (r8 != r0) goto L38
                goto L5d
            L38:
                b1.n$b r8 = new b1.n$b
                long r5 = r7.f9536h
                r8.<init>(r5, r2)
                b1.n$c r1 = new b1.n$c
                r1.<init>(r8)
                b1.l r5 = r7.f9537j
                r7.f9533e = r1
                r7.f9534f = r4
                java.lang.Object r8 = r5.a(r8, r7)
                if (r8 != r0) goto L51
                goto L5d
            L51:
                b1.l r8 = r7.f9537j
                r7.f9533e = r2
                r7.f9534f = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L5e
            L5d:
                return r0
            L5e:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new g(this.f9535g, this.f9536h, this.f9537j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.l f9540g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b1.n.b bVar, b1.l lVar, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f9539f = bVar;
            this.f9540g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9538e;
            if (i15 == 0) {
                u.b(obj);
                b1.n.c cVar = new b1.n.c(this.f9539f);
                b1.l lVar = this.f9540g;
                this.f9538e = 1;
                if (lVar.a(cVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new h(this.f9539f, this.f9540g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f9544h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b1.l lVar, b1.n.b bVar, a aVar, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f9542f = lVar;
            this.f9543g = bVar;
            this.f9544h = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r7.a(r1, r6) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f9541e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L3b
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L2e
            L1e:
                oq.u.b(r7)
                long r4 = w0.e0.a()
                r6.f9541e = r3
                java.lang.Object r7 = ju.z0.b(r4, r6)
                if (r7 != r0) goto L2e
                goto L3a
            L2e:
                b1.l r7 = r6.f9542f
                b1.n$b r1 = r6.f9543g
                r6.f9541e = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L3b
            L3a:
                return r0
            L3b:
                androidx.compose.foundation.a r7 = r6.f9544h
                b1.n$b r0 = r6.f9543g
                androidx.compose.foundation.a.D3(r7, r0)
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f9542f, this.f9543g, this.f9544h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9547g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(b1.l lVar, b1.n.b bVar, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f9546f = lVar;
            this.f9547g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9545e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = this.f9546f;
                b1.n.b bVar = this.f9547g;
                this.f9545e = 1;
                if (lVar.a(bVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new j(this.f9546f, this.f9547g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f9551h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(b1.l lVar, b1.n.b bVar, a aVar, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f9549f = lVar;
            this.f9550g = bVar;
            this.f9551h = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r7.a(r1, r6) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f9548e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L3b
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L2e
            L1e:
                oq.u.b(r7)
                long r4 = w0.e0.a()
                r6.f9548e = r3
                java.lang.Object r7 = ju.z0.b(r4, r6)
                if (r7 != r0) goto L2e
                goto L3a
            L2e:
                b1.l r7 = r6.f9549f
                b1.n$b r1 = r6.f9550g
                r6.f9548e = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L3b
            L3a:
                return r0
            L3b:
                androidx.compose.foundation.a r7 = r6.f9551h
                b1.n$b r0 = r6.f9550g
                androidx.compose.foundation.a.E3(r7, r0)
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((k) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new k(this.f9549f, this.f9550g, this.f9551h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class l extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9554g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(b1.l lVar, b1.n.b bVar, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f9553f = lVar;
            this.f9554g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9552e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = this.f9553f;
                b1.n.b bVar = this.f9554g;
                this.f9552e = 1;
                if (lVar.a(bVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((l) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new l(this.f9553f, this.f9554g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class m extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9558h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f9559j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(b1.l lVar, b1.n.b bVar, boolean z15, a aVar, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f9556f = lVar;
            this.f9557g = bVar;
            this.f9558h = z15;
            this.f9559j = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r7.a(r1, r6) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f9555e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L3b
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L2e
            L1e:
                oq.u.b(r7)
                long r4 = w0.e0.a()
                r6.f9555e = r3
                java.lang.Object r7 = ju.z0.b(r4, r6)
                if (r7 != r0) goto L2e
                goto L3a
            L2e:
                b1.l r7 = r6.f9556f
                b1.n$b r1 = r6.f9557g
                r6.f9555e = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L3b
            L3a:
                return r0
            L3b:
                boolean r7 = r6.f9558h
                if (r7 == 0) goto L47
                androidx.compose.foundation.a r7 = r6.f9559j
                b1.n$b r0 = r6.f9557g
                androidx.compose.foundation.a.D3(r7, r0)
                goto L4e
            L47:
                androidx.compose.foundation.a r7 = r6.f9559j
                b1.n$b r0 = r6.f9557g
                androidx.compose.foundation.a.E3(r7, r0)
            L4e:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new m(this.f9556f, this.f9557g, this.f9558h, this.f9559j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class n extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f9561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9562g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(b1.l lVar, b1.n.b bVar, tq.e<? super n> eVar) {
            super(2, eVar);
            this.f9561f = lVar;
            this.f9562g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9560e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = this.f9561f;
                b1.n.b bVar = this.f9562g;
                this.f9560e = 1;
                if (lVar.a(bVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((n) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new n(this.f9561f, this.f9562g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class o extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9563e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9565g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(b1.n.b bVar, tq.e<? super o> eVar) {
            super(2, eVar);
            this.f9565g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9563e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    b1.n.a aVar = new b1.n.a(this.f9565g);
                    this.f9563e = 1;
                    if (lVar.a(aVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((o) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new o(this.f9565g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class p extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9566e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9568g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(b1.n.b bVar, tq.e<? super p> eVar) {
            super(2, eVar);
            this.f9568g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9566e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    b1.n.a aVar = new b1.n.a(this.f9568g);
                    this.f9566e = 1;
                    if (lVar.a(aVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((p) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new p(this.f9568g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class q extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9569e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9571g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(b1.n.b bVar, tq.e<? super q> eVar) {
            super(2, eVar);
            this.f9571g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9569e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    b1.n.b bVar = this.f9571g;
                    this.f9569e = 1;
                    if (lVar.a(bVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((q) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new q(this.f9571g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class r extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9572e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.n.b f9574g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(b1.n.b bVar, tq.e<? super r> eVar) {
            super(2, eVar);
            this.f9574g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9572e;
            if (i15 == 0) {
                u.b(obj);
                b1.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    b1.n.c cVar = new b1.n.c(this.f9574g);
                    this.f9572e = 1;
                    if (lVar.a(cVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((r) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new r(this.f9574g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class s extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9575e;

        s(tq.e<? super s> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f9575e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            a.this.M3();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((s) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new s(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class t extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9577e;

        t(tq.e<? super t> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f9577e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            a.this.N3();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((t) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new t(eVar);
        }
    }

    public /* synthetic */ a(b1.l lVar, r1 r1Var, boolean z15, boolean z16, String str, n4.l lVar2, er.a aVar, fr.k kVar) {
        this(lVar, r1Var, z15, z16, str, lVar2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G3(a aVar) {
        aVar.onClick.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I3() {
        return androidx.compose.foundation.b.u(this) || e0.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J3(PointerInputChange event) {
        boolean zQ;
        if (event == null) {
            zQ = w0.y0.c(this) != null;
        } else {
            zQ = androidx.compose.foundation.b.q(this, event);
        }
        return zQ || e0.b(this);
    }

    private final boolean K3(IndirectPointerInputChange event) {
        return androidx.compose.foundation.b.r(this, event) || e0.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3() {
        if (this.hoverInteraction == null) {
            b1.g gVar = new b1.g();
            b1.l lVar = this.interactionSource;
            if (lVar != null) {
                ju.k.d(M2(), null, null, new b(lVar, gVar, null), 3, null);
            }
            this.hoverInteraction = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N3() {
        b1.g gVar = this.hoverInteraction;
        if (gVar != null) {
            b1.h hVar = new b1.h(gVar);
            b1.l lVar = this.interactionSource;
            if (lVar != null) {
                ju.k.d(M2(), null, null, new c(lVar, hVar, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T3(b1.l lVar, b1.n.a aVar, Throwable th4) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    private final void Y3() {
        if (g0.isDelayPressesUsingGestureConsumptionEnabled && this.gestureNode == null) {
            this.gestureNode = n3(w0.y0.b(this));
        }
    }

    private final void Z3() {
        if (this.indicationNode != null) {
            return;
        }
        r1 r1Var = this.useLocalIndication ? this.localIndicationNodeFactory : this.indicationNodeFactory;
        if (r1Var != null) {
            if (this.interactionSource == null) {
                this.interactionSource = b1.k.a();
            }
            this.focusableNode.G3(this.interactionSource);
            g4.g gVarA = r1Var.a(this.interactionSource);
            n3(gVarA);
            this.indicationNode = gVarA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[LOOP:0: B:11:0x001a->B:21:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[EDGE_INSN: B:28:0x0065->B:22:0x0065 BREAK  A[LOOP:0: B:11:0x001a->B:21:0x0062], SYNTHETIC] */
    public final void d4(boolean isFocused) {
        if (isFocused) {
            Z3();
            return;
        }
        if (this.interactionSource != null) {
            m0<b1.n.b> m0Var = this.currentKeyPressInteractions;
            Object[] objArr = m0Var.values;
            long[] jArr = m0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                ju.k.d(M2(), null, null, new o((b1.n.b) objArr[(i15 << 3) + i17], null), 3, null);
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            b1.n.b bVar = this.indirectPointerPressInteraction;
            if (bVar != null) {
                ju.k.d(M2(), null, null, new p(bVar, null), 3, null);
            }
        }
        this.currentKeyPressInteractions.g();
        this.indirectPointerPressInteraction = null;
        a4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e4(a aVar) {
        j1 j1Var = (j1) g4.f.a(aVar, n1.d());
        if (!(j1Var instanceof r1)) {
            c1.e.a(androidx.compose.foundation.b.z(j1Var));
        }
        r1 r1Var = aVar.localIndicationNodeFactory;
        r1 r1Var2 = (r1) j1Var;
        aVar.localIndicationNodeFactory = r1Var2;
        if (r1Var != null && !fr.t.c(r1Var2, r1Var)) {
            aVar.f4();
        }
        return i0.f148189a;
    }

    private final void f4() {
        g4.g gVar = this.indicationNode;
        if (gVar == null && this.lazilyCreateIndication) {
            return;
        }
        if (gVar != null) {
            q3(gVar);
        }
        this.indicationNode = null;
        Z3();
    }

    private final boolean h4() {
        return this.userProvidedInteractionSource == null;
    }

    @Override // g4.i1
    public final void E2(n4.i0 i0Var) {
        n4.l lVar = this.role;
        if (lVar != null) {
            f0.r0(i0Var, lVar.getValue());
        }
        f0.x(i0Var, this.onClickLabel, new er.a() { // from class: w0.c
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(androidx.compose.foundation.a.G3(this.f208847a));
            }
        });
        if (this.enabled) {
            this.focusableNode.E2(i0Var);
        } else {
            f0.j(i0Var);
        }
        F3(i0Var);
    }

    @Override // g4.i1
    /* JADX INFO: renamed from: F2 */
    public final boolean getMergeDescendants() {
        return true;
    }

    public void F3(n4.i0 i0Var) {
    }

    public y0 H3() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[LOOP:0: B:16:0x0035->B:26:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[EDGE_INSN: B:30:0x0074->B:27:0x0074 BREAK  A[LOOP:0: B:16:0x0035->B:26:0x0071], SYNTHETIC] */
    protected final void L3() {
        b1.l lVar = this.interactionSource;
        if (lVar != null) {
            b1.n.b bVar = this.pressInteraction;
            if (bVar != null) {
                lVar.b(new b1.n.a(bVar));
            }
            b1.n.b bVar2 = this.indirectPointerPressInteraction;
            if (bVar2 != null) {
                lVar.b(new b1.n.a(bVar2));
            }
            b1.g gVar = this.hoverInteraction;
            if (gVar != null) {
                lVar.b(new b1.h(gVar));
            }
            m0<b1.n.b> m0Var = this.currentKeyPressInteractions;
            Object[] objArr = m0Var.values;
            long[] jArr = m0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                lVar.b(new b1.n.a((b1.n.b) objArr[(i15 << 3) + i17]));
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        this.pressInteraction = null;
        this.indirectPointerPressInteraction = null;
        this.indirectPointerEventPressPosition = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.g();
    }

    /* JADX INFO: renamed from: O3, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final long P3(long size) {
        long jB2 = g4.h.o(this).B2(((f3) g4.f.a(this, g1.u())).e());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jB2 >> 32)) - ((int) (size >> 32))) / 2.0f;
        return m3.k.d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB2 & BodyPartID.bodyIdMax)) - ((int) (size & BodyPartID.bodyIdMax))) / 2.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMax) << 32));
    }

    protected final er.a<i0> Q3() {
        return this.onClick;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    protected final Object R3(b2 b2Var, long j15, tq.e<? super i0> eVar) {
        Object objE;
        b1.l lVar = this.interactionSource;
        return (lVar == null || (objE = q0.e(new e(b2Var, j15, lVar, this, null), eVar)) != uq.b.e()) ? i0.f148189a : objE;
    }

    protected final void S3(boolean indirectPointer) {
        final b1.l lVar = this.interactionSource;
        if (lVar != null) {
            d2 d2Var = this.delayJob;
            if (d2Var == null || !d2Var.h()) {
                b1.n.b bVar = indirectPointer ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (bVar != null) {
                    final b1.n.a aVar = new b1.n.a(bVar);
                    d2 d2Var2 = (d2) M2().getCoroutineContext().m(d2.INSTANCE);
                    ju.k.d(M2(), null, null, new f(lVar, aVar, d2Var2 != null ? d2Var2.C0(new er.l() { // from class: w0.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return androidx.compose.foundation.a.T3(lVar, aVar, (Throwable) obj);
                        }
                    }) : null, null), 3, null);
                }
            } else {
                d2 d2Var3 = this.delayJob;
                if (d2Var3 != null) {
                    d2.a.a(d2Var3, null, 1, null);
                }
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // g4.v0
    public void T0() {
        if (this.useLocalIndication) {
            w0.a(this, new er.a() { // from class: w0.a
                @Override // er.a
                public final Object a() {
                    return androidx.compose.foundation.a.e4(this.f208814a);
                }
            });
        }
    }

    protected final void U3(long offset, boolean indirectPointer) {
        b1.l lVar = this.interactionSource;
        if (lVar != null) {
            d2 d2Var = this.delayJob;
            if (d2Var == null || !d2Var.h()) {
                b1.n.b bVar = indirectPointer ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (bVar != null) {
                    ju.k.d(M2(), null, null, new h(bVar, lVar, null), 3, null);
                }
            } else {
                d2.a.a(d2Var, null, 1, null);
                ju.k.d(M2(), null, null, new g(d2Var, offset, lVar, null), 3, null);
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    protected final void V3(PointerInputChange event) {
        b1.l lVar = this.interactionSource;
        if (lVar != null) {
            b1.n.b bVar = new b1.n.b(event.getPosition(), null);
            if (J3(event)) {
                this.delayJob = ju.k.d(M2(), null, null, new k(lVar, bVar, this, null), 3, null);
            } else {
                this.pressInteraction = bVar;
                ju.k.d(M2(), null, null, new l(lVar, bVar, null), 3, null);
            }
        }
    }

    @Override // y3.g
    public final boolean W1(KeyEvent event) {
        boolean z15;
        Z3();
        long jA = y3.d.a(event);
        if (this.enabled && androidx.compose.foundation.b.y(event)) {
            if (this.currentKeyPressInteractions.a(jA)) {
                z15 = false;
            } else {
                b1.n.b bVar = new b1.n.b(this.centerOffset, null);
                this.currentKeyPressInteractions.q(jA, bVar);
                if (this.interactionSource != null) {
                    ju.k.d(M2(), null, null, new q(bVar, null), 3, null);
                }
                z15 = true;
            }
            return b4(event) || z15;
        }
        if (this.enabled && androidx.compose.foundation.b.w(event)) {
            b1.n.b bVarN = this.currentKeyPressInteractions.n(jA);
            if (bVarN != null) {
                if (this.interactionSource != null) {
                    ju.k.d(M2(), null, null, new r(bVarN, null), 3, null);
                }
                c4(event);
            }
            if (bVarN != null) {
                return true;
            }
        }
        return false;
    }

    @Override // f3.m.c
    public final void W2() {
        T0();
        if (!this.lazilyCreateIndication) {
            Z3();
        }
        if (this.enabled) {
            n3(this.focusableNode);
        }
    }

    protected final void W3(IndirectPointerInputChange event) {
        b1.l lVar = this.interactionSource;
        if (lVar != null) {
            b1.n.b bVar = new b1.n.b(event.getPosition(), null);
            if (K3(event)) {
                this.delayJob = ju.k.d(M2(), null, null, new i(lVar, bVar, this, null), 3, null);
            } else {
                this.indirectPointerPressInteraction = bVar;
                ju.k.d(M2(), null, null, new j(lVar, bVar, null), 3, null);
            }
        }
    }

    @Override // f3.m.c
    public final void X2() {
        L3();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        g4.g gVar = this.indicationNode;
        if (gVar != null) {
            q3(gVar);
        }
        this.indicationNode = null;
        g4.g gVar2 = this.gestureNode;
        if (gVar2 != null) {
            q3(gVar2);
        }
        this.gestureNode = null;
    }

    protected final void X3(long offset, boolean indirectPointer) {
        b1.l lVar = this.interactionSource;
        if (lVar != null) {
            b1.n.b bVar = new b1.n.b(offset, null);
            if (g0.isDelayPressesUsingGestureConsumptionEnabled ? J3(null) : I3()) {
                this.delayJob = ju.k.d(M2(), null, null, new m(lVar, bVar, indirectPointer, this, null), 3, null);
                return;
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = bVar;
            } else {
                this.pressInteraction = bVar;
            }
            ju.k.d(M2(), null, null, new n(lVar, bVar, null), 3, null);
        }
    }

    @Override // g4.f1
    public void Y(a4.o pointerEvent, a4.q pass, long bounds) {
        y0 y0VarH3;
        long jB = c5.s.b(bounds);
        this.centerOffset = m3.e.e((((long) Float.floatToRawIntBits(c5.n.i(jB))) << 32) | (((long) Float.floatToRawIntBits(c5.n.j(jB))) & BodyPartID.bodyIdMax));
        Z3();
        if (this.enabled) {
            Y3();
            if (pass == a4.q.Main) {
                int type = pointerEvent.getType();
                a4.s.Companion companion = a4.s.INSTANCE;
                if (a4.s.o(type, companion.a())) {
                    ju.k.d(M2(), null, null, new s(null), 3, null);
                } else if (a4.s.o(type, companion.b())) {
                    ju.k.d(M2(), null, null, new t(null), 3, null);
                }
            }
        }
        if (this.pointerInputNode == null && (y0VarH3 = H3()) != null) {
            this.pointerInputNode = (y0) n3(y0VarH3);
        }
        y0 y0Var = this.pointerInputNode;
        if (y0Var != null) {
            y0Var.Y(pointerEvent, pass, bounds);
        }
    }

    @Override // g4.f1
    public void Z1() {
        b1.g gVar;
        b1.l lVar = this.interactionSource;
        if (lVar != null && (gVar = this.hoverInteraction) != null) {
            lVar.b(new b1.h(gVar));
        }
        this.hoverInteraction = null;
        y0 y0Var = this.pointerInputNode;
        if (y0Var != null) {
            y0Var.Z1();
        }
    }

    protected void a4() {
    }

    protected abstract boolean b4(KeyEvent event);

    protected abstract boolean c4(KeyEvent event);

    protected final i0 g4() {
        y0 y0Var = this.pointerInputNode;
        if (y0Var == null) {
            return null;
        }
        y0Var.r1();
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    protected final void i4(b1.l interactionSource, r1 indicationNodeFactory, boolean useLocalIndication, boolean enabled, String onClickLabel, n4.l role, er.a<i0> onClick) {
        boolean z15;
        boolean z16;
        if (fr.t.c(this.userProvidedInteractionSource, interactionSource)) {
            z15 = false;
        } else {
            L3();
            this.userProvidedInteractionSource = interactionSource;
            this.interactionSource = interactionSource;
            z15 = true;
        }
        if (!fr.t.c(this.indicationNodeFactory, indicationNodeFactory)) {
            this.indicationNodeFactory = indicationNodeFactory;
            z15 = true;
        }
        if (this.useLocalIndication != useLocalIndication) {
            this.useLocalIndication = useLocalIndication;
            if (useLocalIndication) {
                T0();
            }
            z15 = true;
        }
        if (this.enabled != enabled) {
            if (enabled) {
                n3(this.focusableNode);
            } else {
                q3(this.focusableNode);
                L3();
            }
            g4.j1.d(this);
            this.enabled = enabled;
        }
        if (!fr.t.c(this.onClickLabel, onClickLabel)) {
            this.onClickLabel = onClickLabel;
            g4.j1.d(this);
        }
        if (!fr.t.c(this.role, role)) {
            this.role = role;
            g4.j1.d(this);
        }
        this.onClick = onClick;
        if (this.lazilyCreateIndication != h4()) {
            boolean zH4 = h4();
            this.lazilyCreateIndication = zH4;
            z16 = (zH4 || this.indicationNode != null) ? z15 : true;
        }
        if (z16) {
            f4();
        }
        this.focusableNode.G3(this.interactionSource);
    }

    @Override // y3.g
    public final boolean v1(KeyEvent event) {
        return false;
    }

    @Override // x3.g
    public void v2(x3.c event, a4.q pass) {
        Z3();
        if (this.enabled) {
            Y3();
        }
    }

    private a(b1.l lVar, r1 r1Var, boolean z15, boolean z16, String str, n4.l lVar2, er.a<i0> aVar) {
        this.interactionSource = lVar;
        this.indicationNodeFactory = r1Var;
        this.useLocalIndication = z15;
        this.onClickLabel = str;
        this.role = lVar2;
        this.enabled = z16;
        this.onClick = aVar;
        this.focusableNode = new t0(this.interactionSource, l3.t0.INSTANCE.c(), new d(this), null);
        this.currentKeyPressInteractions = x.a();
        this.centerOffset = m3.e.INSTANCE.c();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = h4();
        this.traverseKey = INSTANCE;
    }
}
