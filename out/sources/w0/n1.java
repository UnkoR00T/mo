package w0;

import p071kotlin.Metadata;
import p076m2.b4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lf3/m;", "Lb1/j;", "interactionSource", "Lw0/j1;", "indication", "e", "(Lf3/m;Lb1/j;Lw0/j1;)Lf3/m;", "Lm2/b4;", "a", "Lm2/b4;", "d", "()Lm2/b4;", "LocalIndication", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<j1> f209020a = p076m2.d0.h(null, new er.a() { // from class: w0.l1
        @Override // er.a
        public final Object a() {
            return n1.c();
        }
    }, 1, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1.j f209021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j1 f209022c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b1.j jVar, j1 j1Var) {
            super(1);
            this.f209021b = jVar;
            this.f209022c = j1Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("indication");
            v1Var.getProperties().b("interactionSource", this.f209021b);
            v1Var.getProperties().b("indication", this.f209022c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 c() {
        return j0.f208960a;
    }

    public static final b4<j1> d() {
        return f209020a;
    }

    public static final f3.m e(f3.m mVar, final b1.j jVar, final j1 j1Var) {
        if (j1Var == null) {
            return mVar;
        }
        if (j1Var instanceof r1) {
            return mVar.u(new p1(jVar, (r1) j1Var));
        }
        return f3.j.b(mVar, androidx.compose.ui.platform.t1.b() ? new a(jVar, j1Var) : androidx.compose.ui.platform.t1.a(), new er.q() { // from class: w0.m1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n1.f(j1Var, jVar, (f3.m) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m f(j1 j1Var, b1.j jVar, f3.m mVar, p076m2.r rVar, int i15) {
        rVar.X(-353972293);
        if (p076m2.t.k()) {
            p076m2.t.o(-353972293, i15, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
        }
        k1 k1VarB = j1Var.b(jVar, rVar, 0);
        boolean zW = rVar.W(k1VarB);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new o1(k1VarB);
            rVar.v(objE);
        }
        o1 o1Var = (o1) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return o1Var;
    }
}
