package oz;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.p016lifecycle.g0;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroid/content/Context;", "", "orientation", "Loq/i0;", "j", "(Landroid/content/Context;ILm2/r;II)V", "Landroid/app/Activity;", "e", "(Landroid/content/Context;)Landroid/app/Activity;", "Loz/i;", "f", "(Landroid/content/Context;Lm2/r;I)Loz/i;", "foldingState", "lifecycle_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f150738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f150739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<i> f150740h;

        /* JADX INFO: renamed from: oz.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C3719a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f150741e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f150742f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a3<i> f150743g;

            /* JADX INFO: renamed from: oz.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C3720a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a3<i> f150744a;

                C3720a(a3<i> a3Var) {
                    this.f150744a = a3Var;
                }

                @Override // mu.h
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object F(ob.u uVar, tq.e<? super i0> eVar) {
                    List<ob.a> listA = uVar.a();
                    ArrayList arrayList = new ArrayList();
                    for (T t15 : listA) {
                        if (t15 instanceof ob.c) {
                            arrayList.add(t15);
                        }
                    }
                    ob.c cVar = (ob.c) v.n0(arrayList);
                    ob.c.C3575c state = cVar != null ? cVar.getState() : null;
                    p.i(this.f150744a, fr.t.c(state, ob.c.C3575c.f144159c) ? i.FLAT : fr.t.c(state, ob.c.C3575c.f144160d) ? i.HALF_OPENED : i.FOLD);
                    return i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3719a(Context context, a3<i> a3Var, tq.e<? super C3719a> eVar) {
                super(2, eVar);
                this.f150742f = context;
                this.f150743g = a3Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f150741e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.g<ob.u> gVarB = ob.n.INSTANCE.d(this.f150742f).b(this.f150742f);
                    C3720a c3720a = new C3720a(this.f150743g);
                    this.f150741e = 1;
                    if (gVarB.a(c3720a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C3719a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C3719a(this.f150742f, this.f150743g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.p016lifecycle.q qVar, Context context, a3<i> a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f150738f = qVar;
            this.f150739g = context;
            this.f150740h = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150737e;
            if (i15 == 0) {
                oq.u.b(obj);
                androidx.p016lifecycle.q qVar = this.f150738f;
                androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.STARTED;
                C3719a c3719a = new C3719a(this.f150739g, this.f150740h, null);
                this.f150737e = 1;
                if (g0.b(qVar, bVar, c3719a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f150738f, this.f150739g, this.f150740h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"oz/p$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f150745a;

        public b(Activity activity) {
            this.f150745a = activity;
        }

        @Override // p076m2.r0
        public void j() {
            this.f150745a.setRequestedOrientation(-1);
        }
    }

    private static final Activity e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final i f(Context context, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-417636712, i15, -1, "pl.gov.coi.common.lifecycle.getFoldableState (LockScreenOrientation.kt:49)");
        }
        androidx.p016lifecycle.q qVar = (androidx.p016lifecycle.q) rVar.N(m7.n.c());
        Object[] objArr = new Object[0];
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = new er.a() { // from class: oz.o
                @Override // er.a
                public final Object a() {
                    return p.g();
                }
            };
            rVar.v(objE);
        }
        a3 a3Var = (a3) b3.f.k(objArr, (er.a) objE, rVar, 48);
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(qVar) | rVar.G(context) | rVar.W(a3Var);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new a(qVar, context, a3Var, null);
            rVar.v(objE2);
        }
        Function0.d(i0Var, (er.p) objE2, rVar, 6);
        i iVarH = h(a3Var);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return iVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 g() {
        return c6.e(null, null, 2, null);
    }

    private static final i h(a3<i> a3Var) {
        return a3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(a3<i> a3Var, i iVar) {
        a3Var.setValue(iVar);
    }

    public static final void j(final Context context, final int i15, p076m2.r rVar, final int i16, final int i17) {
        int i18;
        p076m2.r rVarH = rVar.h(-233494604);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.G(context) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i19 = i17 & 1;
        if (i19 != 0) {
            i18 |= 48;
        } else if ((i16 & 48) == 0) {
            i18 |= rVarH.c(i15) ? 32 : 16;
        }
        if (rVarH.r((i18 & 19) != 18, i18 & 1)) {
            if (i19 != 0) {
                i15 = 1;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-233494604, i18, -1, "pl.gov.coi.common.lifecycle.lockScreenOrientation (LockScreenOrientation.kt:26)");
            }
            final Activity activityE = e(context);
            if (activityE == null) {
                rVarH.X(1809403693);
            } else {
                rVarH.X(1809403694);
                if (activityE.getRequestedOrientation() != i15) {
                    rVarH.X(-1011750470);
                    if (f(activityE, rVarH, 0) == i.FOLD) {
                        rVarH.X(-1011652634);
                        boolean zG = rVarH.G(activityE) | ((i18 & 112) == 32);
                        Object objE = rVarH.E();
                        if (zG || objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.l() { // from class: oz.m
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return p.k(activityE, i15, (s0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        Function0.a(activityE, (er.l) objE, rVarH, 0);
                    } else {
                        rVarH.X(-1012740114);
                    }
                    rVarH.R();
                } else {
                    rVarH.X(-1012740114);
                }
                rVarH.R();
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oz.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.l(context, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 k(Activity activity, int i15, s0 s0Var) {
        activity.setRequestedOrientation(i15);
        return new b(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Context context, int i15, int i16, int i17, p076m2.r rVar, int i18) {
        j(context, i15, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }
}
