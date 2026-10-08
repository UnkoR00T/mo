package f80;

import dx.i;
import p071kotlin.Metadata;
import z70.ActivationChallengeWithKeysResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf80/d;", "La80/d;", "Le80/b;", "repository", "<init>", "(Le80/b;)V", "La80/d$a;", "params", "Ldx/i;", "Ldx/b;", "Lz70/a;", "d", "(La80/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Le80/b;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements a80.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e80.b repository;

    public d(e80.b bVar) {
        this.repository = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(a80.d.Params params, tq.e<? super i<? extends dx.b, ActivationChallengeWithKeysResponse>> eVar) {
        return this.repository.b(params.getToken(), eVar);
    }
}
