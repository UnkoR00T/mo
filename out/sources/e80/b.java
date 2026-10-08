package e80;

import dx.i;
import p071kotlin.Metadata;
import z70.ActivationChallengeWithKeysResponse;
import z70.AppActivationWithKeysResponse;
import z70.TokenApplicationActivationRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Le80/b;", "", "", "token", "Ldx/i;", "Ldx/b;", "Lz70/a;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lz70/i;", "tokenAppActivationRequest", "Lz70/b;", "a", "(Lz70/i;Ltq/e;)Ljava/lang/Object;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(TokenApplicationActivationRequest tokenApplicationActivationRequest, tq.e<? super i<? extends dx.b, AppActivationWithKeysResponse>> eVar);

    Object b(String str, tq.e<? super i<? extends dx.b, ActivationChallengeWithKeysResponse>> eVar);
}
