package u0;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c6;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0001\u001a\u00020\u00102\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0013\"\b\b\u0001\u0010\u0015*\u00020\u00142\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001c\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001c¨\u0006/²\u0006 \u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00138\nX\u008a\u0084\u0002²\u0006\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00138\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Lu0/l;", "animationSpec", "visibilityThreshold", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Loq/i0;", "finishedListener", "Lm2/f6;", "e", "(FLu0/l;FLjava/lang/String;Ler/l;Lm2/r;II)Lm2/f6;", "Lc5/h;", "d", "(FLu0/l;Ljava/lang/String;Ler/l;Lm2/r;II)Lm2/f6;", "Lc5/n;", "f", "(JLu0/l;Ljava/lang/String;Ler/l;Lm2/r;II)Lm2/f6;", "T", "Lu0/t;", "V", "Lu0/y2;", "typeConverter", "g", "(Ljava/lang/Object;Lu0/y2;Lu0/l;Ljava/lang/Object;Ljava/lang/String;Ler/l;Lm2/r;II)Lm2/f6;", "Lu0/q1;", "a", "Lu0/q1;", "defaultAnimation", "b", "dpDefaultSpring", "Lm3/k;", "c", "sizeDefaultSpring", "Lm3/e;", "offsetDefaultSpring", "Lm3/g;", "rectDefaultSpring", "", "intDefaultSpring", "intOffsetDefaultSpring", "Lc5/r;", "h", "intSizeDefaultSpring", "listener", "animSpec", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q1<Float> f193596a = m.j(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q1<c5.h> f193597b = m.j(0.0f, 0.0f, c5.h.j(g4.a(c5.h.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q1<m3.k> f193598c = m.j(0.0f, 0.0f, m3.k.c(g4.f(m3.k.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q1<m3.e> f193599d = m.j(0.0f, 0.0f, m3.e.d(g4.e(m3.e.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q1<m3.g> f193600e = m.j(0.0f, 0.0f, g4.g(m3.g.INSTANCE), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final q1<Integer> f193601f = m.j(0.0f, 0.0f, Integer.valueOf(g4.b(fr.s.f66413a)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final q1<c5.n> f193602g = m.j(0.0f, 0.0f, c5.n.c(g4.c(c5.n.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final q1<c5.r> f193603h = m.j(0.0f, 0.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 3, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f193606g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ lu.g<T> f193607h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c<T, V> f193608j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ f6<l<T>> f193609k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ f6<er.l<T, oq.i0>> f193610l;

        /* JADX INFO: renamed from: u0.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C5047a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f193611e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ T f193612f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c<T, V> f193613g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ f6<l<T>> f193614h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ f6<er.l<T, oq.i0>> f193615j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C5047a(T t15, c<T, V> cVar, f6<? extends l<T>> f6Var, f6<? extends er.l<? super T, oq.i0>> f6Var2, tq.e<? super C5047a> eVar) {
                super(2, eVar);
                this.f193612f = t15;
                this.f193613g = cVar;
                this.f193614h = f6Var;
                this.f193615j = f6Var2;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                C5047a c5047a;
                Object objE = uq.b.e();
                int i15 = this.f193611e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    if (!fr.t.c(this.f193612f, this.f193613g.k())) {
                        c<T, V> cVar = this.f193613g;
                        T t15 = this.f193612f;
                        l lVarI = f.i(this.f193614h);
                        this.f193611e = 1;
                        c5047a = this;
                        if (c.f(cVar, t15, lVarI, null, null, c5047a, 12, null) == objE) {
                            return objE;
                        }
                    }
                    return oq.i0.f148189a;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                c5047a = this;
                er.l lVarH = f.h(c5047a.f193615j);
                if (lVarH != null) {
                    lVarH.b(c5047a.f193613g.m());
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((C5047a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C5047a(this.f193612f, this.f193613g, this.f193614h, this.f193615j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(lu.g<T> gVar, c<T, V> cVar, f6<? extends l<T>> f6Var, f6<? extends er.l<? super T, oq.i0>> f6Var2, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f193607h = gVar;
            this.f193608j = cVar;
            this.f193609k = f6Var;
            this.f193610l = f6Var2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0039 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0042  */
        /* JADX WARN: Code duplicated, block: B:16:0x0052  */
        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:12:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0039
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r11.f193605f
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f193604e
                lu.i r1 = (lu.i) r1
                java.lang.Object r3 = r11.f193606g
                ju.p0 r3 = (ju.p0) r3
                oq.u.b(r12)
                goto L3a
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                java.lang.Object r12 = r11.f193606g
                ju.p0 r12 = (ju.p0) r12
                lu.g<T> r1 = r11.f193607h
                lu.i r1 = r1.iterator()
                r3 = r12
            L2d:
                r11.f193606g = r3
                r11.f193604e = r1
                r11.f193605f = r2
                java.lang.Object r12 = r1.a(r11)
                if (r12 != r0) goto L3a
                return r0
            L3a:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L6a
                java.lang.Object r12 = r1.next()
                lu.g<T> r4 = r11.f193607h
                java.lang.Object r4 = r4.k()
                java.lang.Object r4 = lu.k.f(r4)
                if (r4 != 0) goto L54
                r6 = r12
                goto L55
            L54:
                r6 = r4
            L55:
                u0.f$a$a r5 = new u0.f$a$a
                u0.c<T, V> r7 = r11.f193608j
                m2.f6<u0.l<T>> r8 = r11.f193609k
                m2.f6<er.l<T, oq.i0>> r9 = r11.f193610l
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r7 = 3
                r8 = 0
                r4 = 0
                r6 = r5
                r5 = 0
                ju.i.d(r3, r4, r5, r6, r7, r8)
                goto L2d
            L6a:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: u0.f.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f193607h, this.f193608j, this.f193609k, this.f193610l, eVar);
            aVar.f193606g = obj;
            return aVar;
        }
    }

    public static final f6<c5.h> d(float f15, l<c5.h> lVar, String str, er.l<? super c5.h, oq.i0> lVar2, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = f193597b;
        }
        l<c5.h> lVar3 = lVar;
        if ((i16 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i16 & 8) != 0) {
            lVar2 = null;
        }
        er.l<? super c5.h, oq.i0> lVar4 = lVar2;
        if (p076m2.t.k()) {
            p076m2.t.o(-1407150062, i15, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:123)");
        }
        int i17 = i15 << 6;
        f6<c5.h> f6VarG = g(c5.h.j(f15), s3.L(c5.h.INSTANCE), lVar3, null, str2, lVar4, rVar, (i15 & 14) | ((i15 << 3) & 896) | (57344 & i17) | (i17 & 458752), 8);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarG;
    }

    public static final f6<Float> e(float f15, l<Float> lVar, float f16, String str, er.l<? super Float, oq.i0> lVar2, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = f193596a;
        }
        if ((i16 & 4) != 0) {
            f16 = 0.01f;
        }
        if ((i16 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        er.l<? super Float, oq.i0> lVar3 = (i16 & 16) != 0 ? null : lVar2;
        if (p076m2.t.k()) {
            p076m2.t.o(668842840, i15, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:74)");
        }
        if (lVar == f193596a) {
            rVar.X(1144115775);
            boolean z15 = (((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.b(f16)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256;
            Object objE = rVar.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = m.j(0.0f, 0.0f, Float.valueOf(f16), 3, null);
                rVar.v(objE);
            }
            lVar = (q1) objE;
            rVar.R();
        } else {
            rVar.X(1144225701);
            rVar.R();
        }
        int i17 = i15 << 3;
        f6<Float> f6VarG = g(Float.valueOf(f15), s3.P(fr.m.f66405a), lVar, f16 != 0.01f ? Float.valueOf(f16) : null, str2, lVar3, rVar, (i15 & 14) | (57344 & i17) | (i17 & 458752), 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarG;
    }

    public static final f6<c5.n> f(long j15, l<c5.n> lVar, String str, er.l<? super c5.n, oq.i0> lVar2, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = f193602g;
        }
        l<c5.n> lVar3 = lVar;
        if ((i16 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i16 & 8) != 0) {
            lVar2 = null;
        }
        er.l<? super c5.n, oq.i0> lVar4 = lVar2;
        if (p076m2.t.k()) {
            p076m2.t.o(-696782904, i15, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:321)");
        }
        int i17 = i15 << 6;
        f6<c5.n> f6VarG = g(c5.n.c(j15), s3.N(c5.n.INSTANCE), lVar3, null, str2, lVar4, rVar, (i15 & 14) | ((i15 << 3) & 896) | (57344 & i17) | (i17 & 458752), 8);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarG;
    }

    public static final <T, V extends t> f6<T> g(final T t15, y2<T, V> y2Var, l<T> lVar, T t16, String str, er.l<? super T, oq.i0> lVar2, p076m2.r rVar, int i15, int i16) {
        l<T> lVarI;
        lu.g gVar;
        if ((i16 & 4) != 0) {
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = m.j(0.0f, 0.0f, null, 7, null);
                rVar.v(objE);
            }
            lVarI = (q1) objE;
        } else {
            lVarI = lVar;
        }
        T t17 = (i16 & 8) != 0 ? null : t16;
        String str2 = (i16 & 16) != 0 ? "ValueAnimation" : str;
        er.l<? super T, oq.i0> lVar3 = (i16 & 32) != 0 ? null : lVar2;
        if (p076m2.t.k()) {
            p076m2.t.o(-1994373980, i15, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:407)");
        }
        Object objE2 = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE2 == companion.a()) {
            objE2 = c6.e(null, null, 2, null);
            rVar.v(objE2);
        }
        p076m2.a3 a3Var = (p076m2.a3) objE2;
        Object objE3 = rVar.E();
        if (objE3 == companion.a()) {
            objE3 = new c(t15, y2Var, t17, str2);
            rVar.v(objE3);
        }
        c cVar = (c) objE3;
        f6 f6VarP = x5.p(lVar3, rVar, (i15 >> 15) & 14);
        if (t17 != null && (lVarI instanceof q1)) {
            q1 q1Var = (q1) lVarI;
            if (!fr.t.c(q1Var.h(), t17)) {
                lVarI = m.i(q1Var.getDampingRatio(), q1Var.getStiffness(), t17);
            }
        }
        f6 f6VarP2 = x5.p(lVarI, rVar, 0);
        Object objE4 = rVar.E();
        if (objE4 == companion.a()) {
            objE4 = lu.j.b(-1, null, null, 6, null);
            rVar.v(objE4);
        }
        final lu.g gVar2 = (lu.g) objE4;
        boolean zG = ((((i15 & 14) ^ 6) > 4 && rVar.G(t15)) || (i15 & 6) == 4) | rVar.G(gVar2);
        Object objE5 = rVar.E();
        if (zG || objE5 == companion.a()) {
            objE5 = new er.a() { // from class: u0.e
                @Override // er.a
                public final Object a() {
                    return f.j(gVar2, t15);
                }
            };
            rVar.v(objE5);
        }
        Function0.g((er.a) objE5, rVar, 0);
        boolean zG2 = rVar.G(gVar2) | rVar.G(cVar) | rVar.W(f6VarP2) | rVar.W(f6VarP);
        Object objE6 = rVar.E();
        if (zG2 || objE6 == companion.a()) {
            gVar = gVar2;
            Object aVar = new a(gVar, cVar, f6VarP2, f6VarP, null);
            rVar.v(aVar);
            objE6 = aVar;
        } else {
            gVar = gVar2;
        }
        Function0.d(gVar, (er.p) objE6, rVar, 0);
        f6<T> f6VarG = (f6) a3Var.getValue();
        if (f6VarG == null) {
            f6VarG = cVar.g();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> er.l<T, oq.i0> h(f6<? extends er.l<? super T, oq.i0>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> l<T> i(f6<? extends l<T>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(lu.g gVar, Object obj) {
        gVar.d(obj);
        return oq.i0.f148189a;
    }
}
