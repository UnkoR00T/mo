package p046f2;

import fr.k;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import u0.c0;
import u0.l;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\f\u0010\u001cR\u001a\u0010!\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 R\"\u0010(\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u000f\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lf2/zb;", "Lf2/ur;", "Lf2/yr;", "state", "Lu0/l;", "", "snapAnimationSpec", "Lu0/c0;", "flingAnimationSpec", "Lkotlin/Function0;", "", "canScroll", "isScrollingContentAtStart", "<init>", "(Lf2/yr;Lu0/l;Lu0/c0;Ler/a;Ler/a;)V", "a", "Lf2/yr;", "getState", "()Lf2/yr;", "b", "Lu0/l;", "d", "()Lu0/l;", "c", "Lu0/c0;", "()Lu0/c0;", "Ler/a;", "i", "()Ler/a;", "e", "f", "Z", "()Z", "isPinned", "Lz3/a;", "g", "Lz3/a;", "()Lz3/a;", "setNestedScrollConnection", "(Lz3/a;)V", "nestedScrollConnection", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zb implements ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yr state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0<Float> flingAnimationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> canScroll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> isScrollingContentAtStart;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private z3.a nestedScrollConnection;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"f2/zb$a", "Lz3/a;", "Lm3/e;", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "Lc5/y;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements z3.a {

        /* JADX INFO: renamed from: f2.zb$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C1312a extends d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f58487d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f58488e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f58490g;

            C1312a(e<? super C1312a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f58488e = obj;
                this.f58490g |= PKIFailureInfo.systemUnavail;
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
                boolean r0 = r13 instanceof f2.zb.a.C1312a
                if (r0 == 0) goto L14
                r0 = r13
                f2.zb$a$a r0 = (f2.zb.a.C1312a) r0
                int r1 = r0.f58490g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f58490g = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                f2.zb$a$a r0 = new f2.zb$a$a
                r0.<init>(r13)
                goto L12
            L1a:
                java.lang.Object r13 = r6.f58488e
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f58490g
                r7 = 2
                r2 = 1
                if (r1 == 0) goto L40
                if (r1 == r2) goto L39
                if (r1 != r7) goto L31
                long r9 = r6.f58487d
                oq.u.b(r13)
                r1 = r8
                goto L8b
            L31:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L39:
                long r11 = r6.f58487d
                oq.u.b(r13)
                r1 = r8
                goto L64
            L40:
                oq.u.b(r13)
                float r13 = c5.y.i(r11)
                r1 = 0
                int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r13 <= 0) goto L55
                f2.zb r13 = p046f2.zb.this
                f2.yr r13 = r13.getState()
                r13.m(r1)
            L55:
                r6.f58487d = r11
                r6.f58490g = r2
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
                f2.zb r13 = p046f2.zb.this
                f2.yr r13 = r13.getState()
                float r11 = c5.y.i(r11)
                f2.zb r12 = p046f2.zb.this
                u0.c0 r12 = r12.c()
                f2.zb r2 = p046f2.zb.this
                u0.l r2 = r2.d()
                r6.f58487d = r9
                r6.f58490g = r7
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
            throw new UnsupportedOperationException("Method not decompiled: f2.zb.a.W0(long, long, tq.e):java.lang.Object");
        }

        @Override // z3.a
        public long d1(long consumed, long available, int source) {
            if (!zb.this.i().a().booleanValue()) {
                return m3.e.INSTANCE.c();
            }
            yr state = zb.this.getState();
            state.m(state.h() + Float.intBitsToFloat((int) (consumed & BodyPartID.bodyIdMax)));
            return m3.e.INSTANCE.c();
        }

        @Override // z3.a
        public long h2(long available, int source) {
            if (!zb.this.i().a().booleanValue()) {
                return m3.e.INSTANCE.c();
            }
            float fI = zb.this.getState().i();
            yr state = zb.this.getState();
            state.n(state.i() + Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & available)));
            return fI == zb.this.getState().i() ? m3.e.INSTANCE.c() : m3.e.g(available, 0.0f, 0.0f, 2, null);
        }
    }

    public zb(yr yrVar, l<Float> lVar, c0<Float> c0Var, er.a<Boolean> aVar, er.a<Boolean> aVar2) {
        this.state = yrVar;
        this.snapAnimationSpec = lVar;
        this.flingAnimationSpec = c0Var;
        this.canScroll = aVar;
        this.isScrollingContentAtStart = aVar2;
        getState().p(aVar2);
        this.nestedScrollConnection = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h() {
        return true;
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

    @Override // p046f2.ur
    public yr getState() {
        return this.state;
    }

    public final er.a<Boolean> i() {
        return this.canScroll;
    }

    public /* synthetic */ zb(yr yrVar, l lVar, c0 c0Var, er.a aVar, er.a aVar2, int i15, k kVar) {
        this(yrVar, lVar, c0Var, (i15 & 8) != 0 ? new er.a() { // from class: f2.xb
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(zb.g());
            }
        } : aVar, (i15 & 16) != 0 ? new er.a() { // from class: f2.yb
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(zb.h());
            }
        } : aVar2);
    }
}
