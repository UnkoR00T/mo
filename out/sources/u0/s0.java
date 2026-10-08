package u0;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!¨\u0006*"}, d2 = {"Lu0/s0;", "", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "Loq/i0;", "j", "(J)V", "Lu0/s0$a;", "animation", "g", "(Lu0/s0$a;)V", "k", "l", "(Lm2/r;I)V", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Ln2/c;", "b", "Ln2/c;", "_animations", "", "<set-?>", "c", "Lm2/a3;", "h", "()Z", "n", "(Z)V", "refreshChildNeeded", "d", "J", "startTimeNanos", "e", "i", "o", "isRunning", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f193856f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n2.c<a<?, ?>> _animations = new n2.c<>(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 refreshChildNeeded = c6.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 isRunning = c6.e(Boolean.TRUE, null, 2, null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R+\u0010/\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103RB\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001042\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010F¨\u0006H"}, d2 = {"Lu0/s0$a;", "T", "Lu0/t;", "V", "Lm2/f6;", "initialValue", "targetValue", "Lu0/y2;", "typeConverter", "Lu0/l;", "animationSpec", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lu0/s0;Ljava/lang/Object;Ljava/lang/Object;Lu0/y2;Lu0/l;Ljava/lang/String;)V", "Loq/i0;", "C", "(Ljava/lang/Object;Ljava/lang/Object;Lu0/l;)V", "", "playTimeNanos", "y", "(J)V", "B", "()V", "z", "a", "Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "setInitialValue$animation_core", "(Ljava/lang/Object;)V", "b", "l", "setTargetValue$animation_core", "c", "Lu0/y2;", "getTypeConverter", "()Lu0/y2;", "d", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "e", "Lm2/a3;", "getValue", "A", "value", "f", "Lu0/l;", "getAnimationSpec", "()Lu0/l;", "Lu0/f2;", "g", "Lu0/f2;", "getAnimation", "()Lu0/f2;", "setAnimation$animation_core", "(Lu0/f2;)V", "animation", "", "h", "Z", "t", "()Z", "setFinished$animation_core", "(Z)V", "isFinished", "j", "startOnTheNextFrame", "J", "playTimeNanosOffset", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T, V extends t> implements f6<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private T initialValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T targetValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final y2<T, V> typeConverter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 value;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private l<T> animationSpec;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private f2<T, V> animation;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long playTimeNanosOffset;

        public a(T t15, T t16, y2<T, V> y2Var, l<T> lVar, String str) {
            this.initialValue = t15;
            this.targetValue = t16;
            this.typeConverter = y2Var;
            this.label = str;
            this.value = c6.e(t15, null, 2, null);
            this.animationSpec = lVar;
            this.animation = new f2<>(this.animationSpec, y2Var, this.initialValue, this.targetValue, null, 16, null);
        }

        public void A(T t15) {
            this.value.setValue(t15);
        }

        public final void B() {
            A(this.animation.g());
            this.startOnTheNextFrame = true;
        }

        public final void C(T initialValue, T targetValue, l<T> animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new f2<>(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null);
            s0.this.n(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        @Override // p076m2.f6
        public T getValue() {
            return this.value.getValue();
        }

        public final T k() {
            return this.initialValue;
        }

        public final T l() {
            return this.targetValue;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void y(long playTimeNanos) {
            s0.this.n(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j15 = playTimeNanos - this.playTimeNanosOffset;
            A(this.animation.f(j15));
            this.isFinished = this.animation.c(j15);
        }

        public final void z() {
            this.startOnTheNextFrame = true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f193875g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p076m2.a3<f6<Long>> f193876h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ s0 f193877j;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.k implements er.p<Float, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f193878e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ float f193879f;

            a(tq.e<? super a> eVar) {
                super(2, eVar);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(Float f15, tq.e<? super Boolean> eVar) {
                return M(f15.floatValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f193878e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return vq.b.a(this.f193879f > 0.0f);
            }

            public final Object M(float f15, tq.e<? super Boolean> eVar) {
                return ((a) v(Float.valueOf(f15), eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(eVar);
                aVar.f193879f = ((Number) obj).floatValue();
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p076m2.a3<f6<Long>> a3Var, s0 s0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f193876h = a3Var;
            this.f193877j = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V(p076m2.a3 a3Var, s0 s0Var, fr.m0 m0Var, ju.p0 p0Var, long j15) {
            f6 f6Var = (f6) a3Var.getValue();
            long jLongValue = f6Var != null ? ((Number) f6Var.getValue()).longValue() : j15;
            if (s0Var.startTimeNanos == Long.MIN_VALUE || m0Var.f66406a != e2.E(p0Var.getCoroutineContext())) {
                s0Var.startTimeNanos = j15;
                n2.c cVar = s0Var._animations;
                Object[] objArr = cVar.content;
                int size = cVar.getSize();
                for (int i15 = 0; i15 < size; i15++) {
                    ((a) objArr[i15]).z();
                }
                m0Var.f66406a = e2.E(p0Var.getCoroutineContext());
            }
            if (m0Var.f66406a == 0.0f) {
                n2.c cVar2 = s0Var._animations;
                Object[] objArr2 = cVar2.content;
                int size2 = cVar2.getSize();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((a) objArr2[i16]).B();
                }
            } else {
                s0Var.j((long) ((jLongValue - s0Var.startTimeNanos) / m0Var.f66406a));
            }
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float X(ju.p0 p0Var) {
            return e2.E(p0Var.getCoroutineContext());
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040 A[PHI: r1 r8
          0x0040: PHI (r1v3 fr.m0) = (r1v1 fr.m0), (r1v2 fr.m0), (r1v2 fr.m0), (r1v7 fr.m0) binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r8v4 ju.p0) = (r8v2 ju.p0), (r8v3 ju.p0), (r8v3 ju.p0), (r8v7 ju.p0) binds: [B:10:0x0030, B:15:0x005b, B:17:0x0076, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x0056 A[PHI: r1 r8
          0x0056: PHI (r1v2 fr.m0) = (r1v3 fr.m0), (r1v5 fr.m0) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x0056: PHI (r8v3 ju.p0) = (r8v4 ju.p0), (r8v5 ju.p0) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f193874f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f193873e
                fr.m0 r1 = (fr.m0) r1
                java.lang.Object r4 = r7.f193875g
                ju.p0 r4 = (ju.p0) r4
                oq.u.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f193873e
                fr.m0 r1 = (fr.m0) r1
                java.lang.Object r4 = r7.f193875g
                ju.p0 r4 = (ju.p0) r4
                oq.u.b(r8)
                r8 = r4
                goto L56
            L30:
                oq.u.b(r8)
                java.lang.Object r8 = r7.f193875g
                ju.p0 r8 = (ju.p0) r8
                fr.m0 r1 = new fr.m0
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f66406a = r4
            L40:
                m2.a3<m2.f6<java.lang.Long>> r4 = r7.f193876h
                u0.s0 r5 = r7.f193877j
                u0.t0 r6 = new u0.t0
                r6.<init>()
                r7.f193875g = r8
                r7.f193873e = r1
                r7.f193874f = r3
                java.lang.Object r4 = u0.p0.a(r6, r7)
                if (r4 != r0) goto L56
                goto L78
            L56:
                float r4 = r1.f66406a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                u0.u0 r4 = new u0.u0
                r4.<init>()
                mu.g r4 = p076m2.x5.q(r4)
                u0.s0$b$a r5 = new u0.s0$b$a
                r6 = 0
                r5.<init>(r6)
                r7.f193875g = r8
                r7.f193873e = r1
                r7.f193874f = r2
                java.lang.Object r4 = mu.i.y(r4, r5, r7)
                if (r4 != r0) goto L40
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u0.s0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f193876h, this.f193877j, eVar);
            bVar.f193875g = obj;
            return bVar;
        }
    }

    public s0(String str) {
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(long playTimeNanos) {
        n2.c<a<?, ?>> cVar = this._animations;
        a<?, ?>[] aVarArr = cVar.content;
        int size = cVar.getSize();
        boolean z15 = true;
        for (int i15 = 0; i15 < size; i15++) {
            a<?, ?> aVar = aVarArr[i15];
            if (!aVar.getIsFinished()) {
                aVar.y(playTimeNanos);
            }
            if (!aVar.getIsFinished()) {
                z15 = false;
            }
        }
        o(!z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(s0 s0Var, int i15, p076m2.r rVar, int i16) {
        s0Var.l(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(boolean z15) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z15));
    }

    private final void o(boolean z15) {
        this.isRunning.setValue(Boolean.valueOf(z15));
    }

    public final void g(a<?, ?> animation) {
        this._animations.d(animation);
        n(true);
    }

    public final void k(a<?, ?> animation) {
        this._animations.t(animation);
    }

    public final void l(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-318043801);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-318043801, i16, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(null, null, 2, null);
                rVarH.v(objE);
            }
            p076m2.a3 a3Var = (p076m2.a3) objE;
            if (i() || h()) {
                rVarH.X(-144841960);
                boolean zG = rVarH.G(this);
                Object objE2 = rVarH.E();
                if (zG || objE2 == companion.a()) {
                    objE2 = new b(a3Var, this, null);
                    rVarH.v(objE2);
                }
                Function0.d(this, (er.p) objE2, rVarH, i16 & 14);
                rVarH.R();
            } else {
                rVarH.X(-143455237);
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
            d5VarM.a(new er.p() { // from class: u0.r0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s0.m(this.f193845a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
