package p046f2;

import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import u0.d1;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lf2/lr;", "", "Lw0/z1;", "mutatePriority", "Loq/i0;", "b", "(Lw0/z1;Ltq/e;)Ljava/lang/Object;", "dismiss", "()V", "a", "Lu0/d1;", "", "c", "()Lu0/d1;", "transition", "isVisible", "()Z", "e", "isPersistent", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface lr {
    static /* synthetic */ Object d(lr lrVar, z1 z1Var, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i15 & 1) != 0) {
            z1Var = z1.Default;
        }
        return lrVar.b(z1Var, eVar);
    }

    void a();

    Object b(z1 z1Var, e<? super i0> eVar);

    d1<Boolean> c();

    void dismiss();

    boolean e();

    boolean isVisible();
}
