package p046f2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import u0.c0;
import u0.l;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u000e\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lf2/ac;", "Lf2/ur;", "Lf2/yr;", "state", "Lu0/l;", "", "snapAnimationSpec", "Lu0/c0;", "flingAnimationSpec", "Lkotlin/Function0;", "", "canScroll", "<init>", "(Lf2/yr;Lu0/l;Lu0/c0;Ler/a;)V", "a", "Lf2/yr;", "getState", "()Lf2/yr;", "b", "Lu0/l;", "d", "()Lu0/l;", "c", "Lu0/c0;", "()Lu0/c0;", "Ler/a;", "e", "()Ler/a;", "Z", "()Z", "isPinned", "Lz3/a;", "f", "Lz3/a;", "()Lz3/a;", "setNestedScrollConnection", "(Lz3/a;)V", "nestedScrollConnection", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ac implements ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yr state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0<Float> flingAnimationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> canScroll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z3.a nestedScrollConnection = new a();

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"f2/ac$a", "Lz3/a;", "Lm3/e;", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "Lc5/y;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements z3.a {

        /* JADX INFO: renamed from: f2.ac$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C1301a extends d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f55158d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f55159e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f55161g;

            C1301a(e<? super C1301a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f55159e = obj;
                this.f55161g |= PKIFailureInfo.systemUnavail;
                return a.this.W0(0L, 0L, this);
            }
        }

        a() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        
            if (r13 == r0) goto L26;
         */
        @Override // z3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object W0(long r9, long r11, tq.e<? super c5.y> r13) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r13 instanceof f2.ac.a.C1301a
                if (r0 == 0) goto L14
                r0 = r13
                f2.ac$a$a r0 = (f2.ac.a.C1301a) r0
                int r1 = r0.f55161g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f55161g = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                f2.ac$a$a r0 = new f2.ac$a$a
                r0.<init>(r13)
                goto L12
            L1a:
                java.lang.Object r13 = r6.f55159e
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f55161g
                r7 = 2
                r2 = 1
                if (r1 == 0) goto L40
                if (r1 == r2) goto L39
                if (r1 != r7) goto L31
                long r9 = r6.f55158d
                oq.u.b(r13)
                r1 = r8
                goto L8b
            L31:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L39:
                long r11 = r6.f55158d
                oq.u.b(r13)
                r1 = r8
                goto L64
            L40:
                oq.u.b(r13)
                float r13 = c5.y.i(r11)
                r1 = 0
                int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r13 <= 0) goto L55
                f2.ac r13 = p046f2.ac.this
                f2.yr r13 = r13.getState()
                r13.m(r1)
            L55:
                r6.f55158d = r11
                r6.f55161g = r2
                r1 = r8
                r2 = r9
                r4 = r11
                java.lang.Object r13 = super.W0(r2, r4, r6)
                if (r13 != r0) goto L63
                goto L8a
            L63:
                r11 = r4
            L64:
                c5.y r13 = (c5.y) r13
                long r9 = r13.getPackedValue()
                f2.ac r13 = p046f2.ac.this
                f2.yr r13 = r13.getState()
                float r11 = c5.y.i(r11)
                f2.ac r12 = p046f2.ac.this
                u0.c0 r12 = r12.c()
                f2.ac r2 = p046f2.ac.this
                u0.l r2 = r2.d()
                r6.f55158d = r9
                r6.f55161g = r7
                java.lang.Object r13 = p046f2.Function0.L(r13, r11, r12, r2, r6)
                if (r13 != r0) goto L8b
            L8a:
                return r0
            L8b:
                c5.y r13 = (c5.y) r13
                long r11 = r13.getPackedValue()
                long r9 = c5.y.l(r9, r11)
                c5.y r9 = c5.y.b(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.ac.a.W0(long, long, tq.e):java.lang.Object");
        }

        @Override // z3.a
        public long d1(long consumed, long available, int source) {
            if (!ac.this.e().a().booleanValue()) {
                return m3.e.INSTANCE.c();
            }
            yr state = ac.this.getState();
            float fH = state.h();
            int i15 = (int) (consumed & BodyPartID.bodyIdMax);
            state.m(fH + Float.intBitsToFloat(i15));
            int i16 = (int) (available & BodyPartID.bodyIdMax);
            if (Float.intBitsToFloat(i16) < 0.0f || Float.intBitsToFloat(i15) < 0.0f) {
                float fI = ac.this.getState().i();
                ac.this.getState().n(ac.this.getState().i() + Float.intBitsToFloat(i15));
                return m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ac.this.getState().i() - fI)) & BodyPartID.bodyIdMax));
            }
            if (Float.intBitsToFloat(i16) <= 0.0f) {
                return m3.e.INSTANCE.c();
            }
            float fI2 = ac.this.getState().i();
            ac.this.getState().n(ac.this.getState().i() + Float.intBitsToFloat(i16));
            return m3.e.e((((long) Float.floatToRawIntBits(ac.this.getState().i() - fI2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.0f) << 32));
        }

        @Override // z3.a
        public long h2(long available, int source) {
            if (ac.this.e().a().booleanValue()) {
                int i15 = (int) (BodyPartID.bodyIdMax & available);
                if (Float.intBitsToFloat(i15) <= 0.0f) {
                    float fI = ac.this.getState().i();
                    ac.this.getState().n(ac.this.getState().i() + Float.intBitsToFloat(i15));
                    return fI == ac.this.getState().i() ? m3.e.INSTANCE.c() : m3.e.g(available, 0.0f, 0.0f, 2, null);
                }
            }
            return m3.e.INSTANCE.c();
        }
    }

    public ac(yr yrVar, l<Float> lVar, c0<Float> c0Var, er.a<Boolean> aVar) {
        this.state = yrVar;
        this.snapAnimationSpec = lVar;
        this.flingAnimationSpec = c0Var;
        this.canScroll = aVar;
    }

    @Override // p046f2.ur
    /* JADX INFO: renamed from: a, reason: from getter */
    public z3.a getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // p046f2.ur
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    @Override // p046f2.ur
    public c0<Float> c() {
        return this.flingAnimationSpec;
    }

    @Override // p046f2.ur
    public l<Float> d() {
        return this.snapAnimationSpec;
    }

    public final er.a<Boolean> e() {
        return this.canScroll;
    }

    @Override // p046f2.ur
    public yr getState() {
        return this.state;
    }
}
