package e80;

import dx.i;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import z70.Challenge;
import z70.UpdatedCertificate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\n¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Le80/e;", "", "Lz70/d;", "challenge", "Lry/c;", "certKeyPairToRevoke", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lz70/d;Lry/c;Ltq/e;)Ljava/lang/Object;", "certKeyPair", "Lz70/j;", "b", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    Object a(Challenge challenge, CertKeyPair certKeyPair, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object b(Challenge challenge, CertKeyPair certKeyPair, tq.e<? super i<? extends dx.b, UpdatedCertificate>> eVar);
}
