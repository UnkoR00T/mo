package z1;

import android.content.Context;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.c6;
import p079n1.i4;
import q4.a4;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0001H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\t*\u00020\u00012\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lf3/m;", "Lz1/c2;", "manager", "z", "(Lf3/m;Lz1/c2;)Lf3/m;", "Lju/p0;", "coroutineScope", "m", "(Lf3/m;Lz1/c2;Lju/p0;)Lf3/m;", "", "x", "(Lz1/c2;Ltq/e;)Ljava/lang/Object;", "isStartHandle", "y", "(Lz1/c2;Z)Z", "Lc5/r;", "magnifierSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c3 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f232042f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c2 c2Var, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f232042f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f232041e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f232042f.I();
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new a(this.f232042f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f232044f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c2 c2Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f232044f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f232043e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c2 c2Var = this.f232044f;
            c2Var.C(c2Var.m0());
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new b(this.f232044f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f232046f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c2 c2Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f232046f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f232045e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f232046f.w0();
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new c(this.f232046f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super oq.i0>, Object> f232048f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(er.l<? super tq.e<? super oq.i0>, ? extends Object> lVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f232048f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232047e;
            if (i15 == 0) {
                oq.u.b(obj);
                er.l<tq.e<? super oq.i0>, Object> lVar = this.f232048f;
                this.f232047e = 1;
                if (lVar.b(this) == objE) {
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
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f232048f, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m A(final c2 c2Var, f3.m mVar, p076m2.r rVar, int i15) {
        rVar.X(1980580247);
        if (p076m2.t.k()) {
            p076m2.t.o(1980580247, i15, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:54)");
        }
        final c5.d dVar = (c5.d) rVar.N(androidx.compose.ui.platform.g1.f());
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(c5.r.b(c5.r.INSTANCE.a()), null, 2, null);
            rVar.v(objE);
        }
        final p076m2.a3 a3Var = (p076m2.a3) objE;
        boolean zG = rVar.G(c2Var);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new er.a() { // from class: z1.v2
                @Override // er.a
                public final Object a() {
                    return c3.D(c2Var, a3Var);
                }
            };
            rVar.v(objE2);
        }
        er.a aVar = (er.a) objE2;
        boolean zW = rVar.W(dVar);
        Object objE3 = rVar.E();
        if (zW || objE3 == companion.a()) {
            objE3 = new er.l() { // from class: z1.w2
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.E(dVar, a3Var, (er.a) obj);
                }
            };
            rVar.v(objE3);
        }
        f3.m mVarH = m1.h(mVar, aVar, (er.l) objE3);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return mVarH;
    }

    private static final long B(p076m2.a3<c5.r> a3Var) {
        return a3Var.getValue().getPackedValue();
    }

    private static final void C(p076m2.a3<c5.r> a3Var, long j15) {
        a3Var.setValue(c5.r.b(j15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e D(c2 c2Var, p076m2.a3 a3Var) {
        return m3.e.d(p2.j(c2Var, B(a3Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m E(final c5.d dVar, final p076m2.a3 a3Var, final er.a aVar) {
        return w0.y1.f(f3.m.INSTANCE, new er.l() { // from class: z1.a3
            @Override // er.l
            public final Object b(Object obj) {
                return c3.F(aVar, (c5.d) obj);
            }
        }, null, new er.l() { // from class: z1.b3
            @Override // er.l
            public final Object b(Object obj) {
                return c3.G(dVar, a3Var, (c5.k) obj);
            }
        }, 0.0f, true, 0L, 0.0f, 0.0f, false, w0.l2.INSTANCE.a(), 490, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e F(er.a aVar, c5.d dVar) {
        return (m3.e) aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(c5.d dVar, p076m2.a3 a3Var, c5.k kVar) {
        C(a3Var, c5.r.c((((long) dVar.X0(c5.k.j(kVar.getPackedValue()))) << 32) | (((long) dVar.X0(c5.k.i(kVar.getPackedValue()))) & BodyPartID.bodyIdMax)));
        return oq.i0.f148189a;
    }

    public static final f3.m m(f3.m mVar, final c2 c2Var, final ju.p0 p0Var) {
        return t1.m.a(mVar, new er.p() { // from class: z1.t2
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return c3.n(c2Var, p0Var, (p1.a) obj, (Context) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final c2 c2Var, final ju.p0 p0Var, p1.a aVar, final Context context) {
        boolean zX = c2Var.X();
        q4.e eVarO0 = c2Var.o0();
        z3 z3VarB = null;
        String text = eVarO0 != null ? eVarO0.getText() : null;
        z3 latestSelection = c2Var.getLatestSelection();
        if (latestSelection != null) {
            long packedValue = latestSelection.getPackedValue();
            v4.i0 offsetMapping = c2Var.getOffsetMapping();
            z3VarB = z3.b(a4.b(offsetMapping.e(z3.n(packedValue)), offsetMapping.e(z3.i(packedValue))));
        }
        f0.f(aVar, context, zX, text, z3VarB, c2Var.getPlatformSelectionBehaviors(), new er.l() { // from class: z1.u2
            @Override // er.l
            public final Object b(Object obj) {
                return c3.o(c2Var, p0Var, context, (p1.a) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(final c2 c2Var, ju.p0 p0Var, Context context, p1.a aVar) {
        aVar.d();
        v(aVar, p0Var, context, i4.f130089d, c2Var.y(), new a(c2Var, null));
        v(aVar, p0Var, context, i4.f130090e, c2Var.x(), new b(c2Var, null));
        v(aVar, p0Var, context, i4.f130091f, c2Var.z(), new c(c2Var, null));
        s(aVar, context, i4.f130092g, c2Var.A(), new er.a() { // from class: z1.x2
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(c3.p(c2Var));
            }
        }, new er.a() { // from class: z1.y2
            @Override // er.a
            public final Object a() {
                return c3.q(c2Var);
            }
        });
        u(aVar, context, i4.f130093h, c2Var.w(), null, new er.a() { // from class: z1.z2
            @Override // er.a
            public final Object a() {
                return c3.r(c2Var);
            }
        }, 8, null);
        aVar.d();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(c2 c2Var) {
        return !c2Var.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(c2 c2Var) {
        c2Var.y0();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(c2 c2Var) {
        c2Var.v();
        return oq.i0.f148189a;
    }

    private static final void s(p1.a aVar, Context context, i4 i4Var, boolean z15, final er.a<Boolean> aVar2, final er.a<oq.i0> aVar3) {
        p079n1.l1.d(aVar, context.getResources(), i4Var, z15, new er.l() { // from class: z1.r2
            @Override // er.l
            public final Object b(Object obj) {
                return c3.t(aVar3, aVar2, (q1.g) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(er.a aVar, er.a aVar2, q1.g gVar) {
        aVar.a();
        if (aVar2 != null ? ((Boolean) aVar2.a()).booleanValue() : true) {
            gVar.close();
        }
        return oq.i0.f148189a;
    }

    static /* synthetic */ void u(p1.a aVar, Context context, i4 i4Var, boolean z15, er.a aVar2, er.a aVar3, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            aVar2 = null;
        }
        s(aVar, context, i4Var, z15, aVar2, aVar3);
    }

    private static final void v(p1.a aVar, final ju.p0 p0Var, Context context, i4 i4Var, boolean z15, final er.l<? super tq.e<? super oq.i0>, ? extends Object> lVar) {
        u(aVar, context, i4Var, z15, null, new er.a() { // from class: z1.s2
            @Override // er.a
            public final Object a() {
                return c3.w(p0Var, lVar);
            }
        }, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(ju.p0 p0Var, er.l lVar) {
        ju.k.d(p0Var, null, ju.r0.UNDISPATCHED, new d(lVar, null), 1, null);
        return oq.i0.f148189a;
    }

    public static final Object x(c2 c2Var, tq.e<? super Boolean> eVar) {
        androidx.compose.ui.platform.b1 clipboard = c2Var.getClipboard();
        return vq.b.a(clipboard != null ? c1.a.a(clipboard) : false);
    }

    public static final boolean y(c2 c2Var, boolean z15) {
        return p2.s(c2Var, z15);
    }

    public static final f3.m z(f3.m mVar, final c2 c2Var) {
        return !w0.y1.d(0, 1, null) ? mVar : f3.j.c(mVar, null, new er.q() { // from class: z1.q2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.A(c2Var, (f3.m) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }
}
