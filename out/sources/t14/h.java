package t14;

import a14.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt14/h;", "La14/r;", "Ljx/g;", "systemInfo", "<init>", "(Ljx/g;)V", "La14/r$a;", "params", "", "d", "(La14/r$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljx/g;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jx.g systemInfo;

    public h(jx.g gVar) {
        this.systemInfo = gVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(r.Params params, tq.e<? super Boolean> eVar) {
        return vq.b.a(this.systemInfo.k(params.getPackageName()));
    }
}
