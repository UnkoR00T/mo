package v14;

import p071kotlin.Metadata;
import tq.e;
import tx.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv14/a;", "Lf14/a;", "Ltx/b;", "dynamicModuleInstaller", "<init>", "(Ltx/b;)V", "Lf14/a$a;", "params", "Ltx/b$a;", "d", "(Lf14/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Ltx/b;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b dynamicModuleInstaller;

    public a(b bVar) {
        this.dynamicModuleInstaller = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(f14.a.Params params, e<? super b.a> eVar) {
        return this.dynamicModuleInstaller.a(params.getDynamicModule(), eVar);
    }
}
