package bi0;

import java.util.List;
import p071kotlin.Metadata;
import th0.UserCertificateMobileApi;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbi0/m;", "Luh0/m;", "Lai0/j;", "userCertificateRepository", "<init>", "(Lai0/j;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lth0/t;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lai0/j;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements uh0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ai0.j userCertificateRepository;

    public m(ai0.j jVar) {
        this.userCertificateRepository = jVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<UserCertificateMobileApi>>> eVar) {
        return this.userCertificateRepository.a(eVar);
    }
}
