package fd4;

import dx.i;
import p071kotlin.Metadata;
import wz3.h;
import xy.AccessToken;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lfd4/e;", "Lwy/d;", "Lwz3/h;", "loadAccessTokenUseCase", "<init>", "(Lwz3/h;)V", "Ldx/i;", "Ldx/b;", "Lxy/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lwz3/h;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements wy.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h loadAccessTokenUseCase;

    public e(h hVar) {
        this.loadAccessTokenUseCase = hVar;
    }

    @Override // wy.d
    public Object a(tq.e<? super i<? extends dx.b, AccessToken>> eVar) {
        return this.loadAccessTokenUseCase.c(gz.b.a.C1792a.f78542a, eVar);
    }
}
