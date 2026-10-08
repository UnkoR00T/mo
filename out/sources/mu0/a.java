package mu0;

import java.io.InputStream;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmu0/a;", "Leu0/a;", "Llu0/b;", "repository", "<init>", "(Llu0/b;)V", "Leu0/a$a;", "params", "Ljava/io/InputStream;", "d", "(Leu0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Llu0/b;", "getRepository", "()Llu0/b;", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements eu0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lu0.b repository;

    public a(lu0.b bVar) {
        this.repository = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(eu0.a.Params params, tq.e<? super InputStream> eVar) {
        return this.repository.e(params.getUrl(), eVar);
    }
}
