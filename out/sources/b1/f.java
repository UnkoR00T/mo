package b1;

import er.p;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb1/j;", "Lm2/f6;", "", "a", "(Lb1/j;Lm2/r;I)Lm2/f6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f15870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f15871g;

        /* JADX INFO: renamed from: b1.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C0374a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<d> f15872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a3<Boolean> f15873b;

            C0374a(List<d> list, a3<Boolean> a3Var) {
                this.f15872a = list;
                this.f15873b = a3Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, tq.e<? super i0> eVar) {
                if (iVar instanceof d) {
                    this.f15872a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f15872a.remove(((e) iVar).getFocus());
                }
                this.f15873b.setValue(vq.b.a(!this.f15872a.isEmpty()));
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, a3<Boolean> a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f15870f = jVar;
            this.f15871g = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15869e;
            if (i15 == 0) {
                u.b(obj);
                ArrayList arrayList = new ArrayList();
                mu.g<i> gVarC = this.f15870f.c();
                C0374a c0374a = new C0374a(arrayList, this.f15871g);
                this.f15869e = 1;
                if (gVarC.a(c0374a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
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
            return new a(this.f15870f, this.f15871g, eVar);
        }
    }

    public static final f6<Boolean> a(j jVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1805515472, i15, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(Boolean.FALSE, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        int i16 = i15 & 14;
        boolean z15 = ((i16 ^ 6) > 4 && rVar.W(jVar)) || (i15 & 6) == 4;
        Object objE2 = rVar.E();
        if (z15 || objE2 == companion.a()) {
            objE2 = new a(jVar, a3Var, null);
            rVar.v(objE2);
        }
        Function0.d(jVar, (p) objE2, rVar, i16);
        if (t.k()) {
            t.n();
        }
        return a3Var;
    }
}
