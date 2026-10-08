package u0;

import c3.SnapshotStateList;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.p5;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004MIECB1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u0012J'\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b(\u0010'J)\u0010+\u001a\u00020\u00192\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u00102\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0014H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0010H\u0000¢\u0006\u0004\b;\u0010\u0012J\u000f\u0010<\u001a\u00020\u0010H\u0000¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020\u00102\u0018\u0010@\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030?R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010>R+\u0010!\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u00100R7\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000R2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000R8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010N\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010\\\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010Y\u001a\u0004\bZ\u0010\u000f\"\u0004\b[\u0010\u001eR+\u0010^\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010Y\u001a\u0004\b]\u0010\u000f\"\u0004\b\u0001\u0010\u001eR+\u0010c\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010N\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR,\u0010g\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001e\u0010i\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR+\u0010m\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00198G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010N\u001a\u0004\bk\u0010`\"\u0004\bl\u0010bR\"\u0010q\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010-\u001a\u0004\bo\u0010\u000f\"\u0004\bp\u0010\u001eR\u001b\u0010t\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010r\u001a\u0004\bs\u0010\u000fR\u0011\u0010v\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bu\u0010PR\u0011\u0010x\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bw\u0010`R$\u0010\"\u001a\u00020\r2\u0006\u0010y\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010\u000f\"\u0004\b{\u0010\u001eR)\u0010\u007f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000|8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u001d\u0010\u0082\u0001\u001a\u00020\u00198FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0081\u0001\u0010\u0012\u001a\u0005\b\u0080\u0001\u0010`¨\u0006\u0084\u0001²\u0006\r\u0010\u0083\u0001\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lu0/k2;", ip.a.f96137b, "", "Lu0/w2;", "transitionState", "parentTransition", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lu0/w2;Lu0/k2;Ljava/lang/String;)V", "(Lu0/w2;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "m", "()J", "Loq/i0;", "C", "()V", "frameTimeNanos", "", "durationScale", "E", "(JF)V", "scaledPlayTimeNanos", "", "scaleToEnd", "F", "(JZ)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(J)V", ip.a.f96138c, "G", "targetState", "playTimeNanos", "M", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "g", "(Lu0/k2;)Z", "K", "Lu0/k2$d;", "animation", "f", "(Lu0/k2$d;)Z", "J", "(Lu0/k2$d;)V", "Y", "(Ljava/lang/Object;)V", "h", "(Ljava/lang/Object;Lm2/r;I)V", "N", "Lu0/m1$b;", "animationState", "O", "(Lu0/m1$b;)V", "fraction", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(F)V", "n", "X", "toString", "()Ljava/lang/String;", "Lu0/k2$a;", "deferredAnimation", "I", "(Lu0/k2$a;)V", "a", "Lu0/w2;", "b", "Lu0/k2;", "getParentTransition", "()Lu0/k2;", "c", "Ljava/lang/String;", "r", "<set-?>", "d", "Lm2/a3;", "w", "()Ljava/lang/Object;", "T", "Lu0/k2$b;", "e", "u", "()Lu0/k2$b;", "R", "(Lu0/k2$b;)V", "segment", "Lm2/z2;", "z", "V", "_playTimeNanos", "v", "startTimeNanos", "y", "()Z", "U", "(Z)V", "updateChildrenNeeded", "Lc3/f0;", "i", "Lc3/f0;", "_animations", "j", "_transitions", "k", "B", "Q", "isSeeking", "l", "s", "setLastSeekedTimeNanos$animation_core", "lastSeekedTimeNanos", "Lm2/f6;", "x", "totalDurationNanos", "p", "currentState", "A", "isRunning", "value", "t", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "", "o", "()Ljava/util/List;", "animations", "q", "getHasInitialValueAnimations$annotations", "hasInitialValueAnimations", "runFrameLoop", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k2<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w2<S> transitionState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k2<?> parentTransition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 targetState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 segment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p076m2.z2 _playTimeNanos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p076m2.z2 startTimeNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 updateChildrenNeeded;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<k2<S>.d<?, ?>> _animations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<k2<?>> _transitions;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 isSeeking;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final f6 totalDurationNanos;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0011B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR{\u0010$\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e2.\u0010\u001f\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b \u0010#¨\u0006%"}, d2 = {"Lu0/k2$a;", "T", "Lu0/t;", "V", "", "Lu0/y2;", "typeConverter", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lu0/k2;Lu0/y2;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lu0/k2$b;", "Lu0/j0;", "transitionSpec", "targetValueByState", "Lm2/f6;", "a", "(Ler/l;Ler/l;)Lm2/f6;", "Loq/i0;", "d", "()V", "Lu0/y2;", "getTypeConverter", "()Lu0/y2;", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lu0/k2$a$a;", "Lu0/k2;", "<set-?>", "c", "Lm2/a3;", "()Lu0/k2$a$a;", "(Lu0/k2$a$a;)V", "data", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T, V extends t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final y2<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 data = c6.e(null, null, 2, null);

        /* JADX INFO: renamed from: u0.k2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R:\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0014\u0010\"\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lu0/k2$a$a;", "T", "Lu0/t;", "V", "Lm2/f6;", "Lu0/k2$d;", "Lu0/k2;", "animation", "Lkotlin/Function1;", "Lu0/k2$b;", "Lu0/j0;", "transitionSpec", "targetValueByState", "<init>", "(Lu0/k2$a;Lu0/k2$d;Ler/l;Ler/l;)V", "segment", "Loq/i0;", "A", "(Lu0/k2$b;)V", "a", "Lu0/k2$d;", "k", "()Lu0/k2$d;", "b", "Ler/l;", "t", "()Ler/l;", "z", "(Ler/l;)V", "c", "l", "y", "getValue", "()Ljava/lang/Object;", "value", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class C5048a<T, V extends t> implements f6<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final k2<S>.d<T, V> animation;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private er.l<? super b<S>, ? extends j0<T>> transitionSpec;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private er.l<? super S, ? extends T> targetValueByState;

            public C5048a(k2<S>.d<T, V> dVar, er.l<? super b<S>, ? extends j0<T>> lVar, er.l<? super S, ? extends T> lVar2) {
                this.animation = dVar;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            public final void A(b<S> segment) {
                T tB = this.targetValueByState.b(segment.a());
                if (!k2.this.B()) {
                    this.animation.T(tB, this.transitionSpec.b(segment));
                } else {
                    this.animation.R(this.targetValueByState.b(segment.J0()), tB, this.transitionSpec.b(segment));
                }
            }

            @Override // p076m2.f6
            public T getValue() {
                A(k2.this.u());
                return this.animation.getValue();
            }

            public final k2<S>.d<T, V> k() {
                return this.animation;
            }

            public final er.l<S, T> l() {
                return this.targetValueByState;
            }

            public final er.l<b<S>, j0<T>> t() {
                return this.transitionSpec;
            }

            public final void y(er.l<? super S, ? extends T> lVar) {
                this.targetValueByState = lVar;
            }

            public final void z(er.l<? super b<S>, ? extends j0<T>> lVar) {
                this.transitionSpec = lVar;
            }
        }

        public a(y2<T, V> y2Var, String str) {
            this.typeConverter = y2Var;
            this.label = str;
        }

        public final f6<T> a(er.l<? super b<S>, ? extends j0<T>> transitionSpec, er.l<? super S, ? extends T> targetValueByState) {
            k2<S>.C5048a<T, V>.C0004a<T, V> c5048aB = b();
            if (c5048aB == null) {
                k2<S> k2Var = k2.this;
                c5048aB = new C5048a<>(k2Var.new d(targetValueByState.b(k2Var.p()), o.i(this.typeConverter, targetValueByState.b(k2.this.p())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                k2<S> k2Var2 = k2.this;
                c(c5048aB);
                k2Var2.f(c5048aB.k());
            }
            k2<S> k2Var3 = k2.this;
            c5048aB.y(targetValueByState);
            c5048aB.z(transitionSpec);
            c5048aB.A(k2Var3.u());
            return c5048aB;
        }

        public final k2<S>.C5048a<T, V>.C0004a<T, V> b() {
            return (C5048a) this.data.getValue();
        }

        public final void c(k2<S>.C5048a<T, V>.C0004a<T, V> c5048a) {
            this.data.setValue(c5048a);
        }

        public final void d() {
            k2<S>.C5048a<T, V>.C0004a<T, V> c5048aB = b();
            if (c5048aB != null) {
                k2<S> k2Var = k2.this;
                c5048aB.k().R(c5048aB.l().b(k2Var.u().J0()), c5048aB.l().b(k2Var.u().a()), c5048aB.t().b(k2Var.u()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lu0/k2$b;", ip.a.f96137b, "", "targetState", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "J0", "()Ljava/lang/Object;", "initialState", "a", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b<S> {
        S J0();

        S a();

        default boolean c(S s15, S s16) {
            return fr.t.c(s15, J0()) && fr.t.c(s16, a());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu0/k2$c;", ip.a.f96137b, "Lu0/k2$b;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "J0", "()Ljava/lang/Object;", "b", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final S initialState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final S targetState;

        public c(S s15, S s16) {
            this.initialState = s15;
            this.targetState = s16;
        }

        @Override // u0.k2.b
        public S J0() {
            return this.initialState;
        }

        @Override // u0.k2.b
        public S a() {
            return this.targetState;
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return fr.t.c(J0(), bVar.J0()) && fr.t.c(a(), bVar.a());
        }

        public int hashCode() {
            S sJ0 = J0();
            int iHashCode = (sJ0 != null ? sJ0.hashCode() : 0) * 31;
            S sA = a();
            return iHashCode + (sA != null ? sA.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0000¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J%\u0010\u0001\u001a\u00020\u000f2\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b\u0001\u0010*J-\u0010+\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b+\u0010,R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010&R+\u0010'\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R7\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010(8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CRC\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u00106\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010P\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010#R$\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR+\u0010Y\u001a\u00020\r2\u0006\u00104\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010^\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001c8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u001fR\u0016\u0010`\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010_R+\u0010d\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\ba\u00106\u001a\u0004\bb\u00108\"\u0004\bc\u0010:R\u0016\u0010g\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR+\u0010m\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u0018R\u0016\u0010o\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010_R\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lu0/k2$d;", "T", "Lu0/t;", "V", "Lm2/f6;", "initialValue", "initialVelocityVector", "Lu0/y2;", "typeConverter", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lu0/k2;Ljava/lang/Object;Lu0/t;Lu0/y2;Ljava/lang/String;)V", "", "isInterrupted", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "scaleToEnd", ip.a.f96138c, "(JZ)V", "G", "(J)V", ip.a.f96137b, "()V", "E", "", "fraction", "F", "(F)V", "Lu0/m1$b;", "animationState", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lu0/m1$b;)V", "k", "toString", "()Ljava/lang/String;", "targetValue", "Lu0/j0;", "animationSpec", "(Ljava/lang/Object;Lu0/j0;)V", "R", "(Ljava/lang/Object;Ljava/lang/Object;Lu0/j0;)V", "a", "Lu0/y2;", "getTypeConverter", "()Lu0/y2;", "b", "Ljava/lang/String;", "getLabel", "<set-?>", "c", "Lm2/a3;", "B", "()Ljava/lang/Object;", "N", "(Ljava/lang/Object;)V", "Lu0/q1;", "d", "Lu0/q1;", "defaultSpring", "e", "t", "()Lu0/j0;", "I", "(Lu0/j0;)V", "Lu0/f2;", "f", "l", "()Lu0/f2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lu0/f2;)V", "animation", "g", "Lu0/m1$b;", "z", "()Lu0/m1$b;", "setInitialValueState$animation_core", "initialValueState", "h", "Lu0/f2;", "initialValueAnimation", "j", "C", "()Z", "K", "(Z)V", "isFinished", "Lm2/x2;", "A", "()F", "M", "resetSnapValue", "Z", "useOnlyInitialValue", "m", "getValue", "O", "value", "n", "Lu0/t;", "velocityVector", "p", "Lm2/z2;", "y", "()J", "J", "durationNanos", "q", "isSeeking", "r", "Lu0/j0;", "interruptionSpec", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d<T, V extends t> implements f6<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final y2<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 targetValue;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final q1<T> defaultSpring;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 animationSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 animation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private m1.b initialValueState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private f2<T, V> initialValueAnimation;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 isFinished;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final p076m2.x2 resetSnapValue;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean useOnlyInitialValue;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 value;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private V velocityVector;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final p076m2.z2 durationNanos;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final j0<T> interruptionSpec;

        public d(T t15, V v15, y2<T, V> y2Var, String str) {
            T tB;
            this.typeConverter = y2Var;
            this.label = str;
            this.targetValue = c6.e(t15, null, 2, null);
            q1<T> q1VarJ = m.j(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = q1VarJ;
            this.animationSpec = c6.e(q1VarJ, null, 2, null);
            this.animation = c6.e(new f2(t(), y2Var, t15, B(), v15), null, 2, null);
            this.isFinished = c6.e(Boolean.TRUE, null, 2, null);
            this.resetSnapValue = p076m2.x3.a(-1.0f);
            this.value = c6.e(t15, null, 2, null);
            this.velocityVector = v15;
            this.durationNanos = p5.a(l().getDurationNanos());
            Float f15 = g4.h().get(y2Var);
            if (f15 != null) {
                float fFloatValue = f15.floatValue();
                V vB = y2Var.a().b(t15);
                int size = vB.getSize();
                for (int i15 = 0; i15 < size; i15++) {
                    vB.e(i15, fFloatValue);
                }
                tB = this.typeConverter.b().b(vB);
            } else {
                tB = null;
            }
            this.interruptionSpec = m.j(0.0f, 0.0f, tB, 3, null);
        }

        private final T B() {
            return this.targetValue.getValue();
        }

        private final void H(f2<T, V> f2Var) {
            this.animation.setValue(f2Var);
        }

        private final void I(j0<T> j0Var) {
            this.animationSpec.setValue(j0Var);
        }

        private final void N(T t15) {
            this.targetValue.setValue(t15);
        }

        private final void P(T initialValue, boolean isInterrupted) {
            f2<T, V> f2Var = this.initialValueAnimation;
            if (fr.t.c(f2Var != null ? f2Var.g() : null, B())) {
                H(new f2<>(this.interruptionSpec, this.typeConverter, initialValue, initialValue, u.g(this.velocityVector)));
                this.useOnlyInitialValue = true;
                J(l().getDurationNanos());
                return;
            }
            l lVarT = (!isInterrupted || this.isSeeking || (t() instanceof q1)) ? t() : this.interruptionSpec;
            if (k2.this.t() > 0) {
                lVarT = m.c(lVarT, k2.this.t());
            }
            H(new f2<>(lVarT, this.typeConverter, initialValue, B(), this.velocityVector));
            J(l().getDurationNanos());
            this.useOnlyInitialValue = false;
            k2.this.C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void Q(d dVar, Object obj, boolean z15, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i15 & 2) != 0) {
                z15 = false;
            }
            dVar.P(obj, z15);
        }

        public final float A() {
            return this.resetSnapValue.a();
        }

        public final boolean C() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void D(long playTimeNanos, boolean scaleToEnd) {
            if (scaleToEnd) {
                playTimeNanos = l().getDurationNanos();
            }
            O(l().f(playTimeNanos));
            this.velocityVector = (V) l().b(playTimeNanos);
            if (l().c(playTimeNanos)) {
                K(true);
            }
        }

        public final void E() {
            M(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void F(float fraction) {
            if (fraction != -4.0f && fraction != -5.0f) {
                M(fraction);
                return;
            }
            f2<T, V> f2Var = this.initialValueAnimation;
            if (f2Var != null) {
                l().j(f2Var.g());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object objI = fraction == -4.0f ? l().i() : l().g();
            l().j(objI);
            l().k(objI);
            O(objI);
            J(l().getDurationNanos());
        }

        public final void G(long playTimeNanos) {
            if (A() == -1.0f) {
                this.isSeeking = true;
                if (fr.t.c(l().g(), l().i())) {
                    O(l().g());
                } else {
                    O(l().f(playTimeNanos));
                    this.velocityVector = (V) l().b(playTimeNanos);
                }
            }
        }

        public final void J(long j15) {
            this.durationNanos.w(j15);
        }

        public final void K(boolean z15) {
            this.isFinished.setValue(Boolean.valueOf(z15));
        }

        public final void L(m1.b animationState) {
            if (!fr.t.c(l().g(), l().i())) {
                this.initialValueAnimation = l();
                this.initialValueState = animationState;
            }
            H(new f2<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), u.g(this.velocityVector)));
            J(l().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void M(float f15) {
            this.resetSnapValue.p(f15);
        }

        public void O(T t15) {
            this.value.setValue(t15);
        }

        public final void R(T initialValue, T targetValue, j0<T> animationSpec) {
            N(targetValue);
            I(animationSpec);
            if (fr.t.c(l().i(), initialValue) && fr.t.c(l().g(), targetValue)) {
                return;
            }
            Q(this, initialValue, false, 2, null);
        }

        public final void S() {
            f2<T, V> f2Var;
            m1.b bVar = this.initialValueState;
            if (bVar == null || (f2Var = this.initialValueAnimation) == null) {
                return;
            }
            long jE = hr.a.e(bVar.getDurationNanos() * ((double) bVar.getValue()));
            T tF = f2Var.f(jE);
            if (this.useOnlyInitialValue) {
                l().k(tF);
            }
            l().j(tF);
            J(l().getDurationNanos());
            if (A() == -2.0f || this.useOnlyInitialValue) {
                O(tF);
            } else {
                G(k2.this.t());
            }
            if (jE < bVar.getDurationNanos()) {
                bVar.k(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final void T(T targetValue, j0<T> animationSpec) {
            if (this.useOnlyInitialValue) {
                f2<T, V> f2Var = this.initialValueAnimation;
                if (fr.t.c(targetValue, f2Var != null ? f2Var.g() : null)) {
                    return;
                }
            }
            if (fr.t.c(B(), targetValue) && A() == -1.0f) {
                return;
            }
            N(targetValue);
            I(animationSpec);
            P(A() == -3.0f ? targetValue : getValue(), !C());
            K(A() == -3.0f);
            if (A() >= 0.0f) {
                O(l().f((long) (l().getDurationNanos() * A())));
            } else if (A() == -3.0f) {
                O(targetValue);
            }
            this.useOnlyInitialValue = false;
            M(-1.0f);
        }

        @Override // p076m2.f6
        public T getValue() {
            return this.value.getValue();
        }

        public final void k() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public final f2<T, V> l() {
            return (f2) this.animation.getValue();
        }

        public final j0<T> t() {
            return (j0) this.animationSpec.getValue();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + B() + ", spec: " + t();
        }

        public final long y() {
            return this.durationNanos.b();
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final m1.b getInitialValueState() {
            return this.initialValueState;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f193715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f193717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k2<S> f193718h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k2<S> k2Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f193718h = k2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(k2 k2Var, float f15, long j15) {
            if (!k2Var.B()) {
                k2Var.E(j15, f15);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final float fE;
            ju.p0 p0Var;
            Object objE = uq.b.e();
            int i15 = this.f193716f;
            if (i15 == 0) {
                oq.u.b(obj);
                ju.p0 p0Var2 = (ju.p0) this.f193717g;
                fE = e2.E(p0Var2.getCoroutineContext());
                p0Var = p0Var2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fE = this.f193715e;
                p0Var = (ju.p0) this.f193717g;
                oq.u.b(obj);
            }
            while (ju.q0.g(p0Var)) {
                final k2<S> k2Var = this.f193718h;
                er.l lVar = new er.l() { // from class: u0.l2
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k2.e.O(k2Var, fE, ((Long) obj2).longValue());
                    }
                };
                this.f193717g = p0Var;
                this.f193715e = fE;
                this.f193716f = 1;
                if (p076m2.n2.c(lVar, this) == objE) {
                    return objE;
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f193718h, eVar);
            eVar2.f193717g = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/k2$f", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements p076m2.r0 {
        @Override // p076m2.r0
        public void j() {
        }
    }

    public k2(w2<S> w2Var, k2<?> k2Var, String str) {
        this.transitionState = w2Var;
        this.parentTransition = k2Var;
        this.label = str;
        this.targetState = c6.e(p(), null, 2, null);
        this.segment = c6.e(new c(p(), p()), null, 2, null);
        this._playTimeNanos = p5.a(0L);
        this.startTimeNanos = p5.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded = c6.e(bool, null, 2, null);
        this._animations = x5.f();
        this._transitions = x5.f();
        this.isSeeking = c6.e(bool, null, 2, null);
        this.totalDurationNanos = x5.d(new er.a() { // from class: u0.j2
            @Override // er.a
            public final Object a() {
                return Long.valueOf(k2.W(this.f193664a));
            }
        });
        w2Var.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        U(true);
        if (B()) {
            SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
            int size = f0Var.size();
            long jMax = 0;
            for (int i15 = 0; i15 < size; i15++) {
                k2<S>.d<?, ?> dVar = f0Var.get(i15);
                jMax = Math.max(jMax, dVar.y());
                dVar.G(this.lastSeekedTimeNanos);
            }
            U(false);
        }
    }

    private final void R(b<S> bVar) {
        this.segment.setValue(bVar);
    }

    private final void U(boolean z15) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z15));
    }

    private final void V(long j15) {
        this._playTimeNanos.w(j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long W(k2 k2Var) {
        return k2Var.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(k2 k2Var) {
        return !fr.t.c(k2Var.w(), k2Var.p()) || k2Var.A() || k2Var.y();
    }

    private static final boolean j(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 k(ju.p0 p0Var, k2 k2Var, p076m2.s0 s0Var) {
        ju.k.d(p0Var, null, ju.r0.UNDISPATCHED, new e(k2Var, null), 1, null);
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(k2 k2Var, Object obj, int i15, p076m2.r rVar, int i16) {
        k2Var.h(obj, rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private final long m() {
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        long jMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            jMax = Math.max(jMax, f0Var.get(i15).y());
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            jMax = Math.max(jMax, f0Var2.get(i16).m());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean y() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    private final long z() {
        return this._playTimeNanos.b();
    }

    public final boolean A() {
        return v() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void D() {
        G();
        this.transitionState.g();
    }

    public final void E(long frameTimeNanos, float durationScale) {
        if (v() == Long.MIN_VALUE) {
            H(frameTimeNanos);
        }
        long jV = frameTimeNanos - v();
        if (durationScale != 0.0f) {
            jV = hr.a.e(jV / ((double) durationScale));
        }
        P(jV);
        F(jV, durationScale == 0.0f);
    }

    public final void F(long scaledPlayTimeNanos, boolean scaleToEnd) {
        boolean z15 = true;
        if (v() == Long.MIN_VALUE) {
            H(scaledPlayTimeNanos);
        } else if (!this.transitionState.c()) {
            this.transitionState.e(true);
        }
        U(false);
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            k2<S>.d<?, ?> dVar = f0Var.get(i15);
            if (!dVar.C()) {
                dVar.D(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!dVar.C()) {
                z15 = false;
            }
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            k2<?> k2Var = f0Var2.get(i16);
            if (!fr.t.c(k2Var.w(), k2Var.p())) {
                k2Var.F(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!fr.t.c(k2Var.w(), k2Var.p())) {
                z15 = false;
            }
        }
        if (z15) {
            G();
        }
    }

    public final void G() {
        S(Long.MIN_VALUE);
        w2<S> w2Var = this.transitionState;
        if (w2Var instanceof d1) {
            ((d1) w2Var).d(w());
        }
        P(0L);
        this.transitionState.e(false);
        SnapshotStateList<k2<?>> f0Var = this._transitions;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0Var.get(i15).G();
        }
    }

    public final void H(long frameTimeNanos) {
        S(frameTimeNanos);
        this.transitionState.e(true);
    }

    public final void I(k2<S>.a<?, ?> deferredAnimation) {
        k2<S>.d<?, ?> dVarK;
        k2<S>.C5048a<?, ?>.C0004a<?, V> c5048aB = deferredAnimation.b();
        if (c5048aB == 0 || (dVarK = c5048aB.k()) == null) {
            return;
        }
        J(dVarK);
    }

    public final void J(k2<S>.d<?, ?> animation) {
        this._animations.remove(animation);
    }

    public final boolean K(k2<?> transition) {
        return this._transitions.remove(transition);
    }

    public final void L(float fraction) {
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0Var.get(i15).F(fraction);
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            f0Var2.get(i16).L(fraction);
        }
    }

    public final void M(S initialState, S targetState, long playTimeNanos) {
        S(Long.MIN_VALUE);
        this.transitionState.e(false);
        if (!B() || !fr.t.c(p(), initialState) || !fr.t.c(w(), targetState)) {
            if (!fr.t.c(p(), initialState)) {
                w2<S> w2Var = this.transitionState;
                if (w2Var instanceof d1) {
                    ((d1) w2Var).d(initialState);
                }
            }
            T(targetState);
            Q(true);
            R(new c(initialState, targetState));
        }
        SnapshotStateList<k2<?>> f0Var = this._transitions;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            k2<?> k2Var = f0Var.get(i15);
            if (k2Var.B()) {
                k2Var.M(k2Var.p(), k2Var.w(), playTimeNanos);
            }
        }
        SnapshotStateList<k2<S>.d<?, ?>> f0Var2 = this._animations;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            f0Var2.get(i16).G(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void N(long playTimeNanos) {
        if (v() == Long.MIN_VALUE) {
            S(playTimeNanos);
        }
        P(playTimeNanos);
        U(false);
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0Var.get(i15).G(playTimeNanos);
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            k2<?> k2Var = f0Var2.get(i16);
            if (!fr.t.c(k2Var.w(), k2Var.p())) {
                k2Var.N(playTimeNanos);
            }
        }
    }

    public final void O(m1.b animationState) {
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0Var.get(i15).L(animationState);
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            f0Var2.get(i16).O(animationState);
        }
    }

    public final void P(long j15) {
        if (this.parentTransition == null) {
            V(j15);
        }
    }

    public final void Q(boolean z15) {
        this.isSeeking.setValue(Boolean.valueOf(z15));
    }

    public final void S(long j15) {
        this.startTimeNanos.w(j15);
    }

    public final void T(S s15) {
        this.targetState.setValue(s15);
    }

    public final void X() {
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0Var.get(i15).S();
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            f0Var2.get(i16).X();
        }
    }

    public final void Y(S targetState) {
        if (fr.t.c(w(), targetState)) {
            return;
        }
        R(new c(w(), targetState));
        if (!fr.t.c(p(), w())) {
            this.transitionState.d(w());
        }
        T(targetState);
        if (!A()) {
            U(true);
        }
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0Var.get(i15).E();
        }
    }

    public final boolean f(k2<S>.d<?, ?> animation) {
        return this._animations.add(animation);
    }

    public final boolean g(k2<?> transition) {
        return this._transitions.add(transition);
    }

    public final void h(final S s15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1493585151);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(s15) : rVarH.G(s15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(this) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1493585151, i16, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1200)");
            }
            if (B()) {
                rVarH.X(467722849);
                rVarH.R();
            } else {
                rVarH.X(466062241);
                Y(s15);
                int i17 = i16 & 112;
                boolean z15 = i17 == 32;
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = x5.d(new er.a() { // from class: u0.g2
                        @Override // er.a
                        public final Object a() {
                            return Boolean.valueOf(k2.i(this.f193641a));
                        }
                    });
                    rVarH.v(objE);
                }
                if (j((f6) objE)) {
                    rVarH.X(466470356);
                    Object objE2 = rVarH.E();
                    p076m2.r.Companion companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE2);
                    }
                    final ju.p0 p0Var = (ju.p0) objE2;
                    boolean zG = rVarH.G(p0Var) | (i17 == 32);
                    Object objE3 = rVarH.E();
                    if (zG || objE3 == companion.a()) {
                        objE3 = new er.l() { // from class: u0.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return k2.k(p0Var, this, (p076m2.s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    Function0.b(p0Var, this, (er.l) objE3, rVarH, i17);
                    rVarH.R();
                } else {
                    rVarH.X(467712929);
                    rVarH.R();
                }
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u0.i2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k2.l(this.f193658a, s15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void n() {
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0Var.get(i15).k();
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            f0Var2.get(i16).n();
        }
    }

    public final List<k2<S>.d<?, ?>> o() {
        return this._animations;
    }

    public final S p() {
        return this.transitionState.a();
    }

    public final boolean q() {
        SnapshotStateList<k2<S>.d<?, ?>> f0Var = this._animations;
        int size = f0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (f0Var.get(i15).getInitialValueState() != null) {
                return true;
            }
        }
        SnapshotStateList<k2<?>> f0Var2 = this._transitions;
        int size2 = f0Var2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            if (f0Var2.get(i16).q()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long t() {
        k2<?> k2Var = this.parentTransition;
        return k2Var != null ? k2Var.t() : z();
    }

    public String toString() {
        List<k2<S>.d<?, ?>> listO = o();
        int size = listO.size();
        String str = "Transition animation values: ";
        for (int i15 = 0; i15 < size; i15++) {
            str = str + listO.get(i15) + ", ";
        }
        return str;
    }

    public final b<S> u() {
        return (b) this.segment.getValue();
    }

    public final long v() {
        return this.startTimeNanos.b();
    }

    public final S w() {
        return (S) this.targetState.getValue();
    }

    public final long x() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    public k2(w2<S> w2Var, String str) {
        this(w2Var, null, str);
    }

    public k2(S s15, String str) {
        this(new d1(s15), null, str);
    }
}
