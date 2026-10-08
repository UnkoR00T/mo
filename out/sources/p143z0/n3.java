package p143z0;

import fr.k;
import fr.m;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import u0.l;
import u0.p;
import u0.s3;
import u0.t3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lz0/n3;", "", "Lu0/l;", "", "animationSpec", "<init>", "(Lu0/l;)V", "Lkotlin/Function1;", "Loq/i0;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "c", "(Ler/l;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lu0/t3;", "Lu0/p;", "a", "Lu0/t3;", "vectorizedSpec", "", "b", "J", "lastFrameTime", "Lu0/p;", "lastVelocity", "", "d", "Z", "isRunning", "e", "F", "getValue", "()F", "f", "(F)V", "value", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f231500f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f231501g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p f231502h = new p(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t3<p> vectorizedSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTime = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p lastVelocity = f231502h;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRunning;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz0/n3$a;", "", "<init>", "()V", "", "", "a", "(F)Z", "VisibilityThreshold", "F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final boolean a(float f15) {
            return Math.abs(f15) < 0.01f;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f231510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f231511g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f231513j;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231511g = obj;
            this.f231513j |= PKIFailureInfo.systemUnavail;
            return n3.this.c(null, null, this);
        }
    }

    public n3(l<Float> lVar) {
        this.vectorizedSpec = lVar.a(s3.P(m.f66405a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(n3 n3Var, float f15, er.l lVar, long j15) {
        if (n3Var.lastFrameTime == Long.MIN_VALUE) {
            n3Var.lastFrameTime = j15;
        }
        p pVar = new p(n3Var.value);
        long jC = f15 == 0.0f ? n3Var.vectorizedSpec.c(new p(n3Var.value), f231502h, n3Var.lastVelocity) : hr.a.f((j15 - n3Var.lastFrameTime) / f15);
        t3<p> t3Var = n3Var.vectorizedSpec;
        p pVar2 = f231502h;
        float value = ((p) t3Var.g(jC, pVar, pVar2, n3Var.lastVelocity)).getValue();
        n3Var.lastVelocity = (p) n3Var.vectorizedSpec.f(jC, pVar, pVar2, n3Var.lastVelocity);
        n3Var.lastFrameTime = j15;
        float f16 = n3Var.value - value;
        n3Var.value = value;
        lVar.b(Float.valueOf(f16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(n3 n3Var, er.l lVar, long j15) {
        float f15 = n3Var.value;
        n3Var.value = 0.0f;
        lVar.b(Float.valueOf(f15));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0035, PHI: r12 r13 r14
      0x0077: PHI (r12v4 float) = (r12v2 float), (r12v5 float) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r13v6 er.l<? super java.lang.Float, oq.i0>) = (r13v2 er.l<? super java.lang.Float, oq.i0>), (r13v7 er.l<? super java.lang.Float, oq.i0>) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r14v16 er.a<oq.i0>) = (r14v8 er.a<oq.i0>), (r14v17 er.a<oq.i0>) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[Catch: all -> 0x0035, PHI: r12 r13 r14
      0x0095: PHI (r12v5 float) = (r12v4 float), (r12v9 float) binds: [B:33:0x0092, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r13v7 er.l<? super java.lang.Float, oq.i0>) = (r13v6 er.l<? super java.lang.Float, oq.i0>), (r13v10 er.l<? super java.lang.Float, oq.i0>) binds: [B:33:0x0092, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r14v17 er.a<oq.i0>) = (r14v16 er.a<oq.i0>), (r14v18 er.a<oq.i0>) binds: [B:33:0x0092, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: all -> 0x0035, PHI: r13 r14
      0x009c: PHI (r13v3 er.l<? super java.lang.Float, oq.i0>) = (r13v6 er.l<? super java.lang.Float, oq.i0>), (r13v7 er.l<? super java.lang.Float, oq.i0>) binds: [B:31:0x007f, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r14v11 er.a<oq.i0>) = (r14v16 er.a<oq.i0>), (r14v17 er.a<oq.i0>) binds: [B:31:0x007f, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0092 -> B:35:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(er.l<? super java.lang.Float, oq.i0> r12, er.a<oq.i0> r13, tq.e<? super oq.i0> r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.n3.c(er.l, er.a, tq.e):java.lang.Object");
    }

    public final void f(float f15) {
        this.value = f15;
    }
}
