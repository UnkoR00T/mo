package pc4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpc4/o5;", "", "<init>", "()V", "Lxn3/a;", "sendCodeToInstitutionUseCase", "Lh54/a;", "b", "(Lxn3/a;)Lh54/a;", "Lkx3/f;", "refreshKeycloakTokenUC", "Lk54/c;", "getKeycloakAccessTokenUC", "Lk54/a;", "a", "(Lkx3/f;Lk54/c;)Lk54/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o5 {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"pc4/o5$a", "Lh54/a;", "", "qrCode", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements h54.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xn3.a f155336a;

        a(xn3.a aVar) {
            this.f155336a = aVar;
        }

        @Override // h54.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f155336a.c(new xn3.a.Params(str), eVar);
        }
    }

    public final k54.a a(kx3.f refreshKeycloakTokenUC, k54.c getKeycloakAccessTokenUC) {
        return new kx3.a(refreshKeycloakTokenUC, getKeycloakAccessTokenUC);
    }

    public final h54.a b(xn3.a sendCodeToInstitutionUseCase) {
        return new a(sendCodeToInstitutionUseCase);
    }
}
