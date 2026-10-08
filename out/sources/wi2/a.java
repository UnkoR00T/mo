package wi2;

import android.content.Context;
import iy.j;
import iy.v;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.legacy.storage.l;
import pl.gov.coi.mobywatel.feature.legacy.storage.m;
import y00.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J9\u00102\u001a\u0002012\b\b\u0001\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001fH\u0007¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lwi2/a;", "", "<init>", "()V", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "Liy/v;", "pkcs12Manager", "Liy/c;", "bytesConverter", "Laz/f;", "fileManager", "Loi2/b;", "e", "(Ly00/h0;Liy/i;Liy/g;Liy/v;Liy/c;Laz/f;)Loi2/b;", "Lui2/a;", "b", "()Lui2/a;", "Liy/a;", "base64Coder", "Ldx/a;", "deactivateDomainErrorFactory", "Lac4/d;", "getCurrentServerTimeUseCase", "Liy/j;", "a", "(Liy/a;Ldx/a;Lac4/d;)Liy/j;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "serviceToContainerIdMapper", "Liy/d;", "bytesGenerator", "Lpx/d;", "remoteLogger", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "Lg34/c;", "d", "(Lpl/gov/coi/mobywatel/feature/legacy/storage/l;Liy/v;Liy/c;Liy/d;Lpx/d;Liy/a;Liy/l;)Lg34/c;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/g;", "c", "()Lpl/gov/coi/mobywatel/feature/legacy/storage/g;", "Landroid/content/Context;", "context", "Ljx/d;", "deviceInfo", "Lu64/b;", "h", "(Landroid/content/Context;Ljx/d;Liy/v;Lpx/d;Liy/a;)Lu64/b;", "Lay/j;", "jsonSerializer", "Lpi2/a;", "f", "(Lay/j;)Lpi2/a;", "g", "()Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f213705a = new a();

    private a() {
    }

    public final j a(iy.a base64Coder, dx.a deactivateDomainErrorFactory, ac4.d getCurrentServerTimeUseCase) {
        return new mi2.a(base64Coder, getCurrentServerTimeUseCase, deactivateDomainErrorFactory);
    }

    public final ui2.a b() {
        return new zi2.a();
    }

    public final pl.gov.coi.mobywatel.feature.legacy.storage.g c() {
        return new pl.gov.coi.mobywatel.feature.legacy.storage.h();
    }

    public final g34.c d(l serviceToContainerIdMapper, v pkcs12Manager, iy.c bytesConverter, iy.d bytesGenerator, px.d remoteLogger, iy.a base64Coder, iy.l digest) {
        return new pl.gov.coi.mobywatel.feature.legacy.storage.i(serviceToContainerIdMapper, pkcs12Manager, bytesConverter, bytesGenerator, remoteLogger, base64Coder, digest);
    }

    public final oi2.b e(h0 securityProviderFactory, iy.i cipherRsa, iy.g cipherAes, v pkcs12Manager, iy.c bytesConverter, az.f fileManager) {
        return new rh2.b(securityProviderFactory, cipherRsa, cipherAes, pkcs12Manager, bytesConverter, fileManager);
    }

    public final pi2.a f(ay.j jsonSerializer) {
        return new fj2.a(jsonSerializer);
    }

    public final l g() {
        return new m();
    }

    public final u64.b h(Context context, jx.d deviceInfo, v pkcs12Manager, px.d remoteLogger, iy.a base64Coder) {
        return new ij2.b(context, deviceInfo, pkcs12Manager, remoteLogger, base64Coder);
    }
}
