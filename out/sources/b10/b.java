package b10;

import dx.i;
import ky.JweHeader;
import oq.p;
import p071kotlin.Metadata;
import ry.EC;
import ry.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb10/b;", "Ljy/a;", "Ljy/c;", "jwePublicKeyEncrypter", "Ljy/b;", "jweJwkEncrypter", "<init>", "(Ljy/c;Ljy/b;)V", "Lry/e;", "encryptionType", "Lky/b;", "jweHeader", "Lky/c;", "jwePayload", "Ldx/i;", "Ldx/b;", "", "a", "(Lry/e;Lky/b;Lky/c;)Ldx/i;", "Ljy/c;", "b", "Ljy/b;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements jy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jy.c jwePublicKeyEncrypter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jy.b jweJwkEncrypter;

    public b(jy.c cVar, jy.b bVar) {
        this.jwePublicKeyEncrypter = cVar;
        this.jweJwkEncrypter = bVar;
    }

    @Override // jy.a
    public i<dx.b, String> a(e encryptionType, JweHeader jweHeader, ky.c jwePayload) {
        if (encryptionType instanceof EC) {
            return this.jwePublicKeyEncrypter.a(((EC) encryptionType).getValue(), jweHeader, jwePayload);
        }
        if (encryptionType instanceof e.a) {
            return this.jweJwkEncrypter.a(((e.a) encryptionType).a(), jweHeader, jwePayload);
        }
        throw new p();
    }
}
