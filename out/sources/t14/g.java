package t14;

import a14.q;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lt14/g;", "La14/q;", "Lac4/j;", "goToStoreIntentUC", "<init>", "(Lac4/j;)V", "La14/q$a;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "d", "(La14/q$a;Ltq/e;)Ljava/lang/Object;", "a", "Lac4/j;", "b", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.j goToStoreIntentUC;

    public g(ac4.j jVar) {
        this.goToStoreIntentUC = jVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q.Params params, tq.e<? super dx.i<dx.b.Business, i0>> eVar) {
        ac4.j jVar = this.goToStoreIntentUC;
        String packageName = params.getPackageName();
        if (packageName == null) {
            packageName = "pl.nask.mobywatel";
        }
        return jVar.c(new ac4.j.Params(packageName), eVar);
    }
}
