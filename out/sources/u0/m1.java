package u0;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 s*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002*/B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0017\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00028\u00002\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001eH\u0086@¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0010¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010\bR+\u0010\u0017\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010\u0005R+\u00101\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b/\u0010,\"\u0004\b0\u0010\u0005R\"\u00105\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00102\u001a\u0004\b3\u0010,\"\u0004\b4\u0010\u0005R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010?R.\u0010I\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\b8\u0010L\"\u0004\bM\u0010NR*\u0010V\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010\\\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00108R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\r0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR \u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR \u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010l¨\u0006t"}, d2 = {"Lu0/m1;", ip.a.f96137b, "Lu0/w2;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Loq/i0;", "E", "()V", "Q", "(Ltq/e;)Ljava/lang/Object;", ip.a.f96138c, "z", "Lu0/m1$b;", "animation", "", "deltaPlayTimeNanos", "O", "(Lu0/m1$b;J)V", "b0", "a0", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "T", "targetState", "Z", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "", "fraction", "R", "(FLjava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Lu0/j0;", "animationSpec", "B", "(Ljava/lang/Object;Lu0/j0;Ltq/e;)Ljava/lang/Object;", "Lu0/k2;", "transition", "f", "(Lu0/k2;)V", "g", "M", "N", "<set-?>", "b", "Lm2/a3;", "()Ljava/lang/Object;", "Y", "c", "a", "d", "currentState", "Ljava/lang/Object;", "G", "U", "composedTargetState", "e", "Lu0/k2;", "J", "K", "()J", "setTotalDurationNanos$animation_core", "(J)V", "totalDurationNanos", "Lkotlin/Function0;", "Ler/a;", "recalculateTotalDurationNanos", "Lc3/m0;", "value", "h", "Lc3/m0;", "getSnapshotStateObserver$animation_core", "()Lc3/m0;", "X", "(Lc3/m0;)V", "snapshotStateObserver", "i", "Lm2/x2;", "()F", "W", "(F)V", "Lju/n;", "j", "Lju/n;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lju/n;", "V", "(Lju/n;)V", "compositionContinuation", "Lsu/a;", "k", "Lsu/a;", "I", "()Lsu/a;", "compositionContinuationMutex", "Lu0/g1;", "l", "Lu0/g1;", "mutatorMutex", "m", "lastFrameTimeNanos", "Lr0/q0;", "n", "Lr0/q0;", "initialValueAnimations", "o", "Lu0/m1$b;", "currentAnimation", "Lkotlin/Function1;", "p", "Ler/l;", "firstFrameLambda", "q", "F", "durationScale", "r", "animateOneFrameLambda", "s", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m1<S> extends w2<S> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a f193724s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f193725t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p f193726u = new p(0.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final p f193727v = new p(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 targetState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 currentState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private S composedTargetState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k2<S> transition;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long totalDurationNanos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> recalculateTotalDurationNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private c3.m0 snapshotStateObserver;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p076m2.x2 fraction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ju.n<? super S> compositionContinuation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final su.a compositionContinuationMutex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final g1 mutatorMutex;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final r0.q0<b> initialValueAnimations;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private b currentAnimation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final er.l<Long, oq.i0> firstFrameLambda;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float durationScale;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final er.l<Long, oq.i0> animateOneFrameLambda;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lu0/m1$a;", "", "<init>", "()V", "Lu0/p;", "ZeroVelocity", "Lu0/p;", "b", "()Lu0/p;", "Target1", "a", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final p a() {
            return m1.f193727v;
        }

        public final p b() {
            return m1.f193726u;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010.\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b \u0010)\"\u0004\b-\u0010+R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b/\u0010\rR\"\u00102\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b1\u0010\r¨\u00063"}, d2 = {"Lu0/m1$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "n", "(J)V", "progressNanos", "Lu0/t3;", "Lu0/p;", "b", "Lu0/t3;", "()Lu0/t3;", "i", "(Lu0/t3;)V", "animationSpec", "", "c", "Z", "h", "()Z", "k", "(Z)V", "isComplete", "", "d", "F", "g", "()F", "o", "(F)V", "value", "Lu0/p;", "f", "()Lu0/p;", "setStart", "(Lu0/p;)V", "start", "m", "initialVelocity", "l", "durationNanos", "j", "animationSpecDuration", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long progressNanos;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private t3<p> animationSpec;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isComplete;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float value;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private p start = new p(0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private p initialVelocity;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long durationNanos;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long animationSpecDuration;

        public final t3<p> a() {
            return this.animationSpec;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getDurationNanos() {
            return this.durationNanos;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final p getInitialVelocity() {
            return this.initialVelocity;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getProgressNanos() {
            return this.progressNanos;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final p getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final void i(t3<p> t3Var) {
            this.animationSpec = t3Var;
        }

        public final void j(long j15) {
            this.animationSpecDuration = j15;
        }

        public final void k(boolean z15) {
            this.isComplete = z15;
        }

        public final void l(long j15) {
            this.durationNanos = j15;
        }

        public final void m(p pVar) {
            this.initialVelocity = pVar;
        }

        public final void n(long j15) {
            this.progressNanos = j15;
        }

        public final void o(float f15) {
            this.value = f15;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k2<S> f193754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m1<S> f193755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ S f193756h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ j0<Float> f193757j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f193758e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f193759f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f193760g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ m1<S> f193761h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ S f193762j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ k2<S> f193763k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ j0<Float> f193764l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m1<S> m1Var, S s15, k2<S> k2Var, j0<Float> j0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f193761h = m1Var;
                this.f193762j = s15;
                this.f193763k = k2Var;
                this.f193764l = j0Var;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
            /* JADX WARN: Code duplicated, block: B:38:0x00df  */
            /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
            /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:47:0x0102  */
            /* JADX WARN: Code duplicated, block: B:49:0x0118  */
            /* JADX WARN: Code duplicated, block: B:51:0x0129  */
            /* JADX WARN: Code duplicated, block: B:52:0x012b  */
            /* JADX WARN: Code duplicated, block: B:62:0x015e  */
            /* JADX WARN: Code duplicated, block: B:64:0x0168  */
            /* JADX WARN: Code duplicated, block: B:67:0x019b  */
            /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
            /* JADX WARN: Code duplicated, block: B:73:0x01d9  */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01e8, code lost:
            
                if (r2.a0(r18) == r0) goto L75;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 504
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: u0.m1.c.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f193761h, this.f193762j, this.f193763k, this.f193764l, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k2<S> k2Var, m1<S> m1Var, S s15, j0<Float> j0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f193754f = k2Var;
            this.f193755g = m1Var;
            this.f193756h = s15;
            this.f193757j = j0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f193753e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = new a(this.f193755g, this.f193756h, this.f193754f, this.f193757j, null);
                this.f193753e = 1;
                if (ju.q0.e(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            this.f193754f.G();
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new c(this.f193754f, this.f193755g, this.f193756h, this.f193757j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f193765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m1<S> f193766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193767f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m1<S> m1Var, tq.e<? super d> eVar) {
            super(eVar);
            this.f193766e = m1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193765d = obj;
            this.f193767f |= PKIFailureInfo.systemUnavail;
            return this.f193766e.Q(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f193769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ S f193770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m1<S> f193771h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k2<S> f193772j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f193773k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f193774e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f193775f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ S f193776g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ S f193777h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ m1<S> f193778j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ k2<S> f193779k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ float f193780l;

            /* JADX INFO: renamed from: u0.m1$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C5049a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f193781e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ m1<S> f193782f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C5049a(m1<S> m1Var, tq.e<? super C5049a> eVar) {
                    super(2, eVar);
                    this.f193782f = m1Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f193781e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        m1<S> m1Var = this.f193782f;
                        this.f193781e = 1;
                        if (m1Var.Q(this) == objE) {
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

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C5049a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C5049a(this.f193782f, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(S s15, S s16, m1<S> m1Var, k2<S> k2Var, float f15, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f193776g = s15;
                this.f193777h = s16;
                this.f193778j = m1Var;
                this.f193779k = k2Var;
                this.f193780l = f15;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f193774e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.p0 p0Var = (ju.p0) this.f193775f;
                    if (fr.t.c(this.f193776g, this.f193777h)) {
                        ((m1) this.f193778j).currentAnimation = null;
                        if (fr.t.c(this.f193778j.a(), this.f193776g)) {
                            return oq.i0.f148189a;
                        }
                    } else {
                        this.f193778j.L();
                    }
                    if (!fr.t.c(this.f193776g, this.f193777h)) {
                        this.f193779k.Y(this.f193776g);
                        this.f193779k.P(0L);
                        this.f193778j.Y(this.f193776g);
                        this.f193779k.L(this.f193780l);
                    }
                    this.f193778j.W(this.f193780l);
                    if (((m1) this.f193778j).initialValueAnimations.h()) {
                        ju.k.d(p0Var, null, null, new C5049a(this.f193778j, null), 3, null);
                    } else {
                        ((m1) this.f193778j).lastFrameTimeNanos = Long.MIN_VALUE;
                    }
                    m1<S> m1Var = this.f193778j;
                    this.f193774e = 1;
                    if (m1Var.b0(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                this.f193778j.T();
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f193776g, this.f193777h, this.f193778j, this.f193779k, this.f193780l, eVar);
                aVar.f193775f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(S s15, S s16, m1<S> m1Var, k2<S> k2Var, float f15, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f193769f = s15;
            this.f193770g = s16;
            this.f193771h = m1Var;
            this.f193772j = k2Var;
            this.f193773k = f15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f193768e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = new a(this.f193769f, this.f193770g, this.f193771h, this.f193772j, this.f193773k, null);
                this.f193768e = 1;
                if (ju.q0.e(aVar, this) == objE) {
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

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new e(this.f193769f, this.f193770g, this.f193771h, this.f193772j, this.f193773k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((e) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m1<S> f193784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ S f193785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k2<S> f193786h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m1<S> m1Var, S s15, k2<S> k2Var, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f193784f = m1Var;
            this.f193785g = s15;
            this.f193786h = k2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            float f15;
            Object objE = uq.b.e();
            int i15 = this.f193783e;
            if (i15 == 0) {
                oq.u.b(obj);
                this.f193784f.E();
                ((m1) this.f193784f).lastFrameTimeNanos = Long.MIN_VALUE;
                this.f193784f.W(0.0f);
                S s15 = this.f193785g;
                if (fr.t.c(s15, this.f193784f.a())) {
                    f15 = -4.0f;
                } else {
                    f15 = fr.t.c(s15, this.f193784f.b()) ? -5.0f : -3.0f;
                }
                this.f193786h.Y(this.f193785g);
                this.f193786h.P(0L);
                this.f193784f.Y(this.f193785g);
                this.f193784f.W(0.0f);
                this.f193784f.d(this.f193785g);
                this.f193786h.L(f15);
                if (f15 == -3.0f) {
                    m1<S> m1Var = this.f193784f;
                    this.f193783e = 1;
                    if (m1Var.b0(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            this.f193786h.G();
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new f(this.f193784f, this.f193785g, this.f193786h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((f) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m1<S> f193789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193790g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m1<S> m1Var, tq.e<? super g> eVar) {
            super(eVar);
            this.f193789f = m1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193788e = obj;
            this.f193790g |= PKIFailureInfo.systemUnavail;
            return this.f193789f.a0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m1<S> f193793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193794g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m1<S> m1Var, tq.e<? super h> eVar) {
            super(eVar);
            this.f193793f = m1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193792e = obj;
            this.f193794g |= PKIFailureInfo.systemUnavail;
            return this.f193793f.b0(this);
        }
    }

    public m1(S s15) {
        super(null);
        this.targetState = c6.e(s15, null, 2, null);
        this.currentState = c6.e(s15, null, 2, null);
        this.composedTargetState = s15;
        this.recalculateTotalDurationNanos = new er.a() { // from class: u0.j1
            @Override // er.a
            public final Object a() {
                return m1.P(this.f193663a);
            }
        };
        this.fraction = p076m2.x3.a(0.0f);
        this.compositionContinuationMutex = su.g.b(false, 1, null);
        this.mutatorMutex = new g1();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new r0.q0<>(0, 1, null);
        this.firstFrameLambda = new er.l() { // from class: u0.k1
            @Override // er.l
            public final Object b(Object obj) {
                return m1.F(this.f193674a, ((Long) obj).longValue());
            }
        };
        this.animateOneFrameLambda = new er.l() { // from class: u0.l1
            @Override // er.l
            public final Object b(Object obj) {
                return m1.A(this.f193719a, ((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(m1 m1Var, long j15) {
        long j16 = j15 - m1Var.lastFrameTimeNanos;
        m1Var.lastFrameTimeNanos = j15;
        long jE = hr.a.e(j16 / ((double) m1Var.durationScale));
        if (m1Var.initialValueAnimations.h()) {
            r0.q0<b> q0Var = m1Var.initialValueAnimations;
            Object[] objArr = q0Var.content;
            int i15 = q0Var._size;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                b bVar = (b) objArr[i17];
                m1Var.O(bVar, jE);
                bVar.k(true);
            }
            k2<S> k2Var = m1Var.transition;
            if (k2Var != null) {
                k2Var.X();
            }
            r0.q0<b> q0Var2 = m1Var.initialValueAnimations;
            int i18 = q0Var2._size;
            Object[] objArr2 = q0Var2.content;
            lr.i iVarW = lr.m.w(0, i18);
            int first = iVarW.getFirst();
            int last = iVarW.getLast();
            if (first <= last) {
                while (true) {
                    objArr2[first - i16] = objArr2[first];
                    if (((b) objArr2[first]).getIsComplete()) {
                        i16++;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
            pq.n.z(objArr2, null, i18 - i16, i18);
            q0Var2._size -= i16;
        }
        b bVar2 = m1Var.currentAnimation;
        if (bVar2 != null) {
            bVar2.l(m1Var.totalDurationNanos);
            m1Var.O(bVar2, jE);
            m1Var.W(bVar2.getValue());
            if (bVar2.getValue() == 1.0f) {
                m1Var.currentAnimation = null;
            }
            m1Var.T();
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object C(m1 m1Var, Object obj, j0 j0Var, tq.e eVar, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            obj = m1Var.b();
        }
        if ((i15 & 2) != 0) {
            j0Var = null;
        }
        return m1Var.B(obj, j0Var, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(tq.e<? super oq.i0> eVar) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objC = p076m2.n2.c(this.firstFrameLambda, eVar);
            return objC == uq.b.e() ? objC : oq.i0.f148189a;
        }
        Object objZ = z(eVar);
        return objZ == uq.b.e() ? objZ : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        k2<S> k2Var = this.transition;
        if (k2Var != null) {
            k2Var.n();
        }
        this.initialValueAnimations.u();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            W(1.0f);
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(m1 m1Var, long j15) {
        m1Var.lastFrameTimeNanos = j15;
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        k2<S> k2Var = this.transition;
        if (k2Var == null) {
            return;
        }
        b bVar = this.currentAnimation;
        if (bVar == null) {
            if (this.totalDurationNanos <= 0 || J() == 1.0f || fr.t.c(a(), b())) {
                bVar = null;
            } else {
                bVar = new b();
                bVar.o(J());
                long j15 = this.totalDurationNanos;
                bVar.l(j15);
                bVar.j(hr.a.e(j15 * (1.0d - ((double) J()))));
                bVar.getStart().e(0, J());
            }
        }
        if (bVar != null) {
            bVar.l(this.totalDurationNanos);
            this.initialValueAnimations.n(bVar);
            k2Var.O(bVar);
        }
        this.currentAnimation = null;
    }

    private final void O(b animation, long deltaPlayTimeNanos) {
        long progressNanos = animation.getProgressNanos() + deltaPlayTimeNanos;
        animation.n(progressNanos);
        long animationSpecDuration = animation.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            animation.o(1.0f);
            return;
        }
        t3<p> t3VarA = animation.a();
        if (t3VarA == null) {
            float f15 = progressNanos / animationSpecDuration;
            animation.o((animation.getStart().a(0) * (1 - f15)) + (f15 * 1.0f));
        } else {
            p start = animation.getStart();
            p pVar = f193727v;
            p initialVelocity = animation.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = f193726u;
            }
            animation.o(lr.m.m(((p) t3VarA.g(progressNanos, start, pVar, initialVelocity)).a(0), 0.0f, 1.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(m1 m1Var) {
        k2<S> k2Var = m1Var.transition;
        m1Var.totalDurationNanos = k2Var != null ? k2Var.x() : 0L;
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(tq.e<? super oq.i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f193767f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f193767f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(this, eVar);
            }
        } else {
            dVar = new d(this, eVar);
        }
        Object obj = dVar.f193765d;
        Object objE = uq.b.e();
        int i16 = dVar.f193767f;
        if (i16 == 0) {
            oq.u.b(obj);
            if (this.initialValueAnimations.g() && this.currentAnimation == null) {
                return oq.i0.f148189a;
            }
            if (e2.E(dVar.getContext()) == 0.0f) {
                E();
                this.lastFrameTimeNanos = Long.MIN_VALUE;
                return oq.i0.f148189a;
            }
            if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
                er.l<Long, oq.i0> lVar = this.firstFrameLambda;
                dVar.f193767f = 1;
                if (p076m2.n2.c(lVar, dVar) != objE) {
                }
            }
            return objE;
        }
        if (i16 != 1 && i16 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oq.u.b(obj);
        do {
            if (!this.initialValueAnimations.h() && this.currentAnimation == null) {
                this.lastFrameTimeNanos = Long.MIN_VALUE;
                return oq.i0.f148189a;
            }
            dVar.f193767f = 2;
        } while (z(dVar) != objE);
        return objE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object S(m1 m1Var, float f15, Object obj, tq.e eVar, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            obj = m1Var.b();
        }
        return m1Var.R(f15, obj, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        k2<S> k2Var = this.transition;
        if (k2Var == null) {
            return;
        }
        k2Var.N(hr.a.e(((double) J()) * k2Var.x()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(float f15) {
        this.fraction.p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a0(tq.e<? super oq.i0> eVar) throws Throwable {
        g gVar;
        Object objB;
        Object obj;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f193790g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f193790g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(this, eVar);
            }
        } else {
            gVar = new g(this, eVar);
        }
        Object obj2 = gVar.f193788e;
        Object objE = uq.b.e();
        int i16 = gVar.f193790g;
        if (i16 == 0) {
            oq.u.b(obj2);
            objB = b();
            su.a aVar = this.compositionContinuationMutex;
            gVar.f193787d = objB;
            gVar.f193790g = 1;
            if (su.a.C4762a.a(aVar, null, gVar, 1, null) != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            Object obj3 = gVar.f193787d;
            oq.u.b(obj2);
            objB = obj3;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = gVar.f193787d;
            oq.u.b(obj2);
        }
        if (fr.t.c(obj2, obj)) {
            return oq.i0.f148189a;
        }
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        gVar.f193787d = objB;
        gVar.f193790g = 2;
        ju.p pVar = new ju.p(uq.b.c(gVar), 1);
        pVar.D();
        V(pVar);
        su.a.C4762a.c(getCompositionContinuationMutex(), null, 1, null);
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(gVar);
        }
        if (objX != objE) {
            obj = objB;
            obj2 = objX;
            if (fr.t.c(obj2, obj)) {
                return oq.i0.f148189a;
            }
            this.lastFrameTimeNanos = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0095, please report this as an issue */
    public final Object b0(tq.e<? super oq.i0> eVar) throws Throwable {
        h hVar;
        Object objB;
        Object obj;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f193794g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f193794g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(this, eVar);
            }
        } else {
            hVar = new h(this, eVar);
        }
        Object obj2 = hVar.f193792e;
        Object objE = uq.b.e();
        int i16 = hVar.f193794g;
        if (i16 == 0) {
            oq.u.b(obj2);
            objB = b();
            su.a aVar = this.compositionContinuationMutex;
            hVar.f193791d = objB;
            hVar.f193794g = 1;
            if (su.a.C4762a.a(aVar, null, hVar, 1, null) != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            Object obj3 = hVar.f193791d;
            oq.u.b(obj2);
            objB = obj3;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = hVar.f193791d;
            oq.u.b(obj2);
        }
        if (!fr.t.c(obj2, obj)) {
            this.lastFrameTimeNanos = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return oq.i0.f148189a;
        if (!fr.t.c(objB, this.composedTargetState)) {
            hVar.f193791d = objB;
            hVar.f193794g = 2;
            ju.p pVar = new ju.p(uq.b.c(hVar), 1);
            pVar.D();
            V(pVar);
            su.a.C4762a.c(getCompositionContinuationMutex(), null, 1, null);
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                vq.g.c(hVar);
            }
            if (objX != objE) {
                obj = objB;
                obj2 = objX;
                if (!fr.t.c(obj2, obj)) {
                    this.lastFrameTimeNanos = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return objE;
        }
        su.a.C4762a.c(this.compositionContinuationMutex, null, 1, null);
        return oq.i0.f148189a;
    }

    private final Object z(tq.e<? super oq.i0> eVar) {
        float fE = e2.E(eVar.getContext());
        if (fE <= 0.0f) {
            E();
            return oq.i0.f148189a;
        }
        this.durationScale = fE;
        Object objC = p076m2.n2.c(this.animateOneFrameLambda, eVar);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    public final Object B(S s15, j0<Float> j0Var, tq.e<? super oq.i0> eVar) {
        Object objE;
        k2<S> k2Var = this.transition;
        return (k2Var != null && (objE = g1.e(this.mutatorMutex, null, new c(k2Var, this, s15, j0Var, null), eVar, 1, null)) == uq.b.e()) ? objE : oq.i0.f148189a;
    }

    public final S G() {
        return this.composedTargetState;
    }

    public final ju.n<S> H() {
        return this.compositionContinuation;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final su.a getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    public final float J() {
        return this.fraction.a();
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public final void M() {
        c3.m0 m0Var = this.snapshotStateObserver;
        if (m0Var != null) {
            m0Var.k(this, v2.f193911a, this.recalculateTotalDurationNanos);
        }
    }

    public final void N() {
        long j15 = this.totalDurationNanos;
        M();
        long j16 = this.totalDurationNanos;
        if (j15 != j16) {
            b bVar = this.currentAnimation;
            if (bVar == null) {
                if (j16 != 0) {
                    T();
                    return;
                }
                return;
            }
            long progressNanos = bVar.getProgressNanos();
            long j17 = this.totalDurationNanos;
            if (progressNanos > j17) {
                E();
                return;
            }
            bVar.l(j17);
            if (bVar.a() == null) {
                bVar.j(hr.a.e((1.0d - ((double) bVar.getStart().a(0))) * this.totalDurationNanos));
            }
        }
    }

    public final Object R(float f15, S s15, tq.e<? super oq.i0> eVar) {
        boolean z15 = false;
        if (0.0f <= f15 && f15 <= 1.0f) {
            z15 = true;
        }
        if (!z15) {
            h1.a("Expecting fraction between 0 and 1. Got " + f15);
        }
        k2<S> k2Var = this.transition;
        if (k2Var == null) {
            return oq.i0.f148189a;
        }
        Object objE = g1.e(this.mutatorMutex, null, new e(s15, b(), this, k2Var, f15, null), eVar, 1, null);
        return objE == uq.b.e() ? objE : oq.i0.f148189a;
    }

    public final void U(S s15) {
        this.composedTargetState = s15;
    }

    public final void V(ju.n<? super S> nVar) {
        this.compositionContinuation = nVar;
    }

    public final void X(c3.m0 m0Var) {
        if (fr.t.c(this.snapshotStateObserver, m0Var)) {
            return;
        }
        c3.m0 m0Var2 = this.snapshotStateObserver;
        if (m0Var2 != null) {
            m0Var2.g(this);
        }
        c3.m0 m0Var3 = this.snapshotStateObserver;
        if (m0Var3 != null) {
            m0Var3.r();
        }
        this.snapshotStateObserver = m0Var;
        if (m0Var != null) {
            m0Var.q();
        }
        M();
    }

    public void Y(S s15) {
        this.targetState.setValue(s15);
    }

    public final Object Z(S s15, tq.e<? super oq.i0> eVar) {
        Object objE;
        k2<S> k2Var = this.transition;
        if (k2Var == null) {
            return oq.i0.f148189a;
        }
        return (!(fr.t.c(a(), s15) && fr.t.c(b(), s15)) && (objE = g1.e(this.mutatorMutex, null, new f(this, s15, k2Var, null), eVar, 1, null)) == uq.b.e()) ? objE : oq.i0.f148189a;
    }

    @Override // u0.w2
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // u0.w2
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // u0.w2
    public void d(S s15) {
        this.currentState.setValue(s15);
    }

    @Override // u0.w2
    public void f(k2<S> transition) {
        k2<S> k2Var = this.transition;
        if (!(k2Var == null || fr.t.c(transition, k2Var))) {
            h1.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // u0.w2
    public void g() {
        this.transition = null;
        c3.m0 m0Var = this.snapshotStateObserver;
        if (m0Var != null) {
            m0Var.g(this);
        }
    }
}
