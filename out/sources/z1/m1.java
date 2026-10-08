package z1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.f6;
import p076m2.x5;
import u0.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#²\u0006\f\u0010!\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lf3/m;", "Lkotlin/Function0;", "Lm3/e;", "magnifierCenter", "Lkotlin/Function1;", "platformMagnifier", "h", "(Lf3/m;Ler/a;Ler/l;)Lf3/m;", "targetCalculation", "Lm2/f6;", "m", "(Ler/a;Lm2/r;I)Lm2/f6;", "Lu0/q;", "a", "Lu0/q;", "UnspecifiedAnimationVector2D", "Lu0/y2;", "b", "Lu0/y2;", "getUnspecifiedSafeOffsetVectorConverter", "()Lu0/y2;", "UnspecifiedSafeOffsetVectorConverter", "c", "J", "getOffsetDisplacementThreshold", "()J", "OffsetDisplacementThreshold", "Lu0/q1;", "d", "Lu0/q1;", "l", "()Lu0/q1;", "MagnifierSpringSpec", "animatedCenter", "targetValue", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u0.q f232129a = new u0.q(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u0.y2<m3.e, u0.q> f232130b = s3.K(new er.l() { // from class: z1.h1
        @Override // er.l
        public final Object b(Object obj) {
            return m1.e((m3.e) obj);
        }
    }, new er.l() { // from class: z1.i1
        @Override // er.l
        public final Object b(Object obj) {
            return m1.f((u0.q) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f232131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u0.q1<m3.e> f232132d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f232134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f6<m3.e> f232135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u0.c<m3.e, u0.q> f232136h;

        /* JADX INFO: renamed from: z1.m1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C6229a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u0.c<m3.e, u0.q> f232137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ju.p0 f232138b;

            /* JADX INFO: renamed from: z1.m1$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C6230a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f232139e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ u0.c<m3.e, u0.q> f232140f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ long f232141g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C6230a(u0.c<m3.e, u0.q> cVar, long j15, tq.e<? super C6230a> eVar) {
                    super(2, eVar);
                    this.f232140f = cVar;
                    this.f232141g = j15;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f232139e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        u0.c<m3.e, u0.q> cVar = this.f232140f;
                        m3.e eVarD = m3.e.d(this.f232141g);
                        u0.q1<m3.e> q1VarL = m1.l();
                        this.f232139e = 1;
                        if (u0.c.f(cVar, eVarD, q1VarL, null, null, this, 12, null) == objE) {
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
                    return ((C6230a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C6230a(this.f232140f, this.f232141g, eVar);
                }
            }

            C6229a(u0.c<m3.e, u0.q> cVar, ju.p0 p0Var) {
                this.f232137a = cVar;
                this.f232138b = p0Var;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((m3.e) obj).getPackedValue(), eVar);
            }

            public final Object a(long j15, tq.e<? super oq.i0> eVar) {
                if ((this.f232137a.m().getPackedValue() & 9223372034707292159L) == 9205357640488583168L || (j15 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (this.f232137a.m().getPackedValue() & BodyPartID.bodyIdMax)) == Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax))) {
                    Object objT = this.f232137a.t(m3.e.d(j15), eVar);
                    return objT == uq.b.e() ? objT : oq.i0.f148189a;
                }
                ju.k.d(this.f232138b, null, null, new C6230a(this.f232137a, j15, null), 3, null);
                return oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f6<m3.e> f6Var, u0.c<m3.e, u0.q> cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f232135g = f6Var;
            this.f232136h = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m3.e O(f6 f6Var) {
            return m3.e.d(m1.n(f6Var));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232133e;
            if (i15 == 0) {
                oq.u.b(obj);
                ju.p0 p0Var = (ju.p0) this.f232134f;
                final f6<m3.e> f6Var = this.f232135g;
                mu.g gVarQ = x5.q(new er.a() { // from class: z1.l1
                    @Override // er.a
                    public final Object a() {
                        return m1.a.O(f6Var);
                    }
                });
                C6229a c6229a = new C6229a(this.f232136h, p0Var);
                this.f232133e = 1;
                if (gVarQ.a(c6229a, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f232135g, this.f232136h, eVar);
            aVar.f232134f = obj;
            return aVar;
        }
    }

    static {
        long jE = m3.e.e((((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & BodyPartID.bodyIdMax));
        f232131c = jE;
        f232132d = new u0.q1<>(0.0f, 0.0f, m3.e.d(jE), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.q e(m3.e eVar) {
        return (eVar.getPackedValue() & 9223372034707292159L) != 9205357640488583168L ? new u0.q(Float.intBitsToFloat((int) (eVar.getPackedValue() >> 32)), Float.intBitsToFloat((int) (eVar.getPackedValue() & BodyPartID.bodyIdMax))) : f232129a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e f(u0.q qVar) {
        float v15 = qVar.getV1();
        float v16 = qVar.getV2();
        return m3.e.d(m3.e.e((((long) Float.floatToRawIntBits(v15)) << 32) | (((long) Float.floatToRawIntBits(v16)) & BodyPartID.bodyIdMax)));
    }

    public static final f3.m h(f3.m mVar, final er.a<m3.e> aVar, final er.l<? super er.a<m3.e>, ? extends f3.m> lVar) {
        return f3.j.c(mVar, null, new er.q() { // from class: z1.j1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m1.i(aVar, lVar, (f3.m) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m i(er.a aVar, er.l lVar, f3.m mVar, p076m2.r rVar, int i15) {
        rVar.X(759876635);
        if (p076m2.t.k()) {
            p076m2.t.o(759876635, i15, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
        }
        final f6<m3.e> f6VarM = m(aVar, rVar, 0);
        boolean zW = rVar.W(f6VarM);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: z1.k1
                @Override // er.a
                public final Object a() {
                    return m1.k(f6VarM);
                }
            };
            rVar.v(objE);
        }
        f3.m mVar2 = (f3.m) lVar.b((er.a) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return mVar2;
    }

    private static final long j(f6<m3.e> f6Var) {
        return f6Var.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e k(f6 f6Var) {
        return m3.e.d(j(f6Var));
    }

    public static final u0.q1<m3.e> l() {
        return f232132d;
    }

    private static final f6<m3.e> m(er.a<m3.e> aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1589795249, i15, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:73)");
        }
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = x5.d(aVar);
            rVar.v(objE);
        }
        f6 f6Var = (f6) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            Object cVar = new u0.c(m3.e.d(n(f6Var)), f232130b, m3.e.d(f232131c), null, 8, null);
            rVar.v(cVar);
            objE2 = cVar;
        }
        u0.c cVar2 = (u0.c) objE2;
        oq.i0 i0Var = oq.i0.f148189a;
        boolean zG = rVar.G(cVar2);
        Object objE3 = rVar.E();
        if (zG || objE3 == companion.a()) {
            objE3 = new a(f6Var, cVar2, null);
            rVar.v(objE3);
        }
        Function0.d(i0Var, (er.p) objE3, rVar, 6);
        f6<m3.e> f6VarG = cVar2.g();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(f6<m3.e> f6Var) {
        return f6Var.getValue().getPackedValue();
    }
}
