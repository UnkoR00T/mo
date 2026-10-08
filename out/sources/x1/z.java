package x1;

import java.util.concurrent.atomic.AtomicReference;
import ju.d2;
import p071kotlin.Metadata;
import p076m2.x2;
import p076m2.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR*\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lx1/z;", "", "", "animate", "<init>", "(Z)V", "Loq/i0;", "f", "(Ltq/e;)Ljava/lang/Object;", "a", "Z", "c", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lju/d2;", "Landroidx/compose/foundation/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "animationJob", "", "<set-?>", "Lm2/x2;", "d", "()F", "e", "(F)V", "cursorAlpha", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean animate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AtomicReference<d2> animationJob = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x2 cursorAlpha = x3.a(0.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f216425f;

        /* JADX INFO: renamed from: x1.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C5762a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f216427e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d2 f216428f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ z f216429g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5762a(d2 d2Var, z zVar, tq.e<? super C5762a> eVar) {
                super(2, eVar);
                this.f216428f = d2Var;
                this.f216429g = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x0067  */
            /* JADX WARN: Code duplicated, block: B:33:0x0068 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0076, B:30:0x005f, B:33:0x0068, B:14:0x0027, B:15:0x002b, B:28:0x0059, B:29:0x005e, B:23:0x0043, B:25:0x0050), top: B:40:0x000f }] */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
            
                if (ju.z0.b(500, r10) == r0) goto L35;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    r10 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r10.f216427e
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r9) goto L2f
                    if (r1 == r8) goto L2b
                    if (r1 == r7) goto L27
                    if (r1 != r6) goto L1f
                    oq.u.b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L76
                L1d:
                    r11 = move-exception
                    goto L7c
                L1f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L27:
                    oq.u.b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L68
                L2b:
                    oq.u.b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L59
                L2f:
                    oq.u.b(r11)
                    goto L43
                L33:
                    oq.u.b(r11)
                    ju.d2 r11 = r10.f216428f
                    if (r11 == 0) goto L43
                    r10.f216427e = r9
                    java.lang.Object r11 = ju.g2.g(r11, r10)
                    if (r11 != r0) goto L43
                    goto L75
                L43:
                    x1.z r11 = r10.f216429g     // Catch: java.lang.Throwable -> L1d
                    x1.z.b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    x1.z r11 = r10.f216429g     // Catch: java.lang.Throwable -> L1d
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1d
                    if (r11 != 0) goto L5f
                    r10.f216427e = r8     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = ju.z0.a(r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L59
                    goto L75
                L59:
                    oq.g r11 = new oq.g     // Catch: java.lang.Throwable -> L1d
                    r11.<init>()     // Catch: java.lang.Throwable -> L1d
                    throw r11     // Catch: java.lang.Throwable -> L1d
                L5f:
                    r10.f216427e = r7     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = ju.z0.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L68
                    goto L75
                L68:
                    x1.z r11 = r10.f216429g     // Catch: java.lang.Throwable -> L1d
                    x1.z.b(r11, r2)     // Catch: java.lang.Throwable -> L1d
                    r10.f216427e = r6     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = ju.z0.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L76
                L75:
                    return r0
                L76:
                    x1.z r11 = r10.f216429g     // Catch: java.lang.Throwable -> L1d
                    x1.z.b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    goto L5f
                L7c:
                    x1.z r0 = r10.f216429g
                    x1.z.b(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: x1.z.a.C5762a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((C5762a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C5762a(this.f216428f, this.f216429g, eVar);
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f216424e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return vq.b.a(androidx.camera.view.i.a(z.this.animationJob, null, ju.k.d((ju.p0) this.f216425f, null, null, new C5762a((d2) z.this.animationJob.getAndSet(null), z.this, null), 3, null)));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = z.this.new a(eVar);
            aVar.f216425f = obj;
            return aVar;
        }
    }

    public z(boolean z15) {
        this.animate = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(float f15) {
        this.cursorAlpha.p(f15);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAnimate() {
        return this.animate;
    }

    public final float d() {
        return this.cursorAlpha.a();
    }

    public final Object f(tq.e<? super oq.i0> eVar) {
        Object objE = ju.q0.e(new a(null), eVar);
        return objE == uq.b.e() ? objE : oq.i0.f148189a;
    }
}
