package e;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class x0 extends vq.k implements er.p<ju.p0, tq.e<Object>, Object> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f46437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ju.w0<List<ju.w0<Object>>> f46438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f46439g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(ju.w0<? extends List<? extends ju.w0<Object>>> w0Var, int i15, tq.e<? super x0> eVar) {
        super(2, eVar);
        this.f46438f = w0Var;
        this.f46439g = i15;
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        Object objE = uq.b.e();
        int i15 = this.f46437e;
        if (i15 == 0) {
            oq.u.b(obj);
            ju.w0<List<ju.w0<Object>>> w0Var = this.f46438f;
            this.f46437e = 1;
            obj = w0Var.I(this);
            if (obj != objE) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return obj;
        }
        oq.u.b(obj);
        List list = (List) obj;
        if (this.f46439g >= list.size()) {
            return null;
        }
        ju.w0 w0Var2 = (ju.w0) list.get(this.f46439g);
        this.f46437e = 2;
        Object objI = w0Var2.I(this);
        return objI == objE ? objE : objI;
    }

    @Override // er.p
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final Object B(ju.p0 p0Var, tq.e<Object> eVar) {
        return ((x0) v(p0Var, eVar)).J(oq.i0.f148189a);
    }

    @Override // vq.a
    public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
        return new x0(this.f46438f, this.f46439g, eVar);
    }
}
