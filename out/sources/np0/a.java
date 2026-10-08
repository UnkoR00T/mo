package np0;

import iy.e0;
import iy.i0;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J7\u0010(\u001a\u00020'2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020!H\u0007¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010,\u001a\u00020'H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0018H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u00100\u001a\u00020\u0018H\u0007¢\u0006\u0004\b5\u00106J\u001f\u0010;\u001a\u00020:2\u0006\u00107\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020-H\u0007¢\u0006\u0004\b?\u0010@J?\u0010B\u001a\u00020A2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020D2\u0006\u00100\u001a\u00020AH\u0007¢\u0006\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lnp0/a;", "", "<init>", "()V", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Liy/e0;", "signedDataDecoder", "Liy/i0;", "x509CertificateDecoder", "Lay/j;", "jsonSerializer", "Lhp0/e;", "h", "(Liy/j;Liy/a;Liy/e0;Liy/i0;Lay/j;)Lhp0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Ljp0/a;", "frontSrvRequestFactory", "institutionAndCertDataParser", "Lop0/a;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Ljp0/a;Lhp0/e;)Lop0/a;", "Lb00/c;", "imageConverter", "Lxx/a;", "exifDataManager", "Lqx/a;", "imagePropertiesProvider", "Lhp0/a;", "e", "(Lb00/c;Lxx/a;Lqx/a;)Lhp0/a;", "Lez/a;", "timeProvider", "giosAttachmentCreator", "Lhp0/c;", "f", "(Lay/j;Lez/a;Liy/a;Liy/j;Lhp0/a;)Lhp0/c;", "Ljp0/b;", "requestFactory", "giosReportRequestCreator", "Lop0/b;", "g", "(Lpl/gov/coi/common/network/w;Ljp0/b;Lpl/gov/coi/common/network/g0;Lhp0/c;)Lop0/b;", "repository", "Lgp0/c;", "d", "(Lop0/a;)Lgp0/c;", "Lgp0/e;", "k", "(Lop0/a;)Lgp0/e;", "frontSrvRepository", "Lhz/i;", "validatorTextFactory", "Lgp0/a;", "b", "(Lop0/a;Lhz/i;)Lgp0/a;", "giosRepository", "Lgp0/d;", "j", "(Lop0/b;)Lgp0/d;", "Lop0/c;", "i", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/a;Liy/j;Lay/j;Liy/i0;)Lop0/c;", "Lgp0/b;", "c", "(Lop0/c;)Lgp0/b;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final op0.a a(w httpServiceFactory, g0 networkCallMediator, jp0.a frontSrvRequestFactory, hp0.e institutionAndCertDataParser) {
        return new mp0.b(httpServiceFactory, networkCallMediator, frontSrvRequestFactory, institutionAndCertDataParser);
    }

    public final gp0.a b(op0.a frontSrvRepository, hz.i validatorTextFactory) {
        return new pp0.a(frontSrvRepository, validatorTextFactory);
    }

    public final gp0.b c(op0.c repository) {
        return new pp0.b(repository);
    }

    public final gp0.c d(op0.a repository) {
        return new pp0.c(repository);
    }

    public final hp0.a e(b00.c imageConverter, xx.a exifDataManager, qx.a imagePropertiesProvider) {
        return new hp0.b(imageConverter, exifDataManager, imagePropertiesProvider);
    }

    public final hp0.c f(ay.j jsonSerializer, ez.a timeProvider, iy.a base64Coder, iy.j cmsManager, hp0.a giosAttachmentCreator) {
        return new hp0.d(jsonSerializer, timeProvider, base64Coder, cmsManager, giosAttachmentCreator);
    }

    public final op0.b g(w httpServiceFactory, jp0.b requestFactory, g0 networkCallMediator, hp0.c giosReportRequestCreator) {
        return new mp0.c(httpServiceFactory, requestFactory, networkCallMediator, giosReportRequestCreator);
    }

    public final hp0.e h(iy.j cmsManager, iy.a base64Coder, e0 signedDataDecoder, i0 x509CertificateDecoder, ay.j jsonSerializer) {
        return new hp0.f(cmsManager, base64Coder, signedDataDecoder, x509CertificateDecoder, jsonSerializer);
    }

    public final op0.c i(w httpServiceFactory, g0 networkCallMediator, iy.a base64Coder, iy.j cmsManager, ay.j jsonSerializer, i0 x509CertificateDecoder) {
        return new mp0.d(httpServiceFactory, networkCallMediator, base64Coder, jsonSerializer, cmsManager, x509CertificateDecoder);
    }

    public final gp0.d j(op0.b giosRepository) {
        return new pp0.d(giosRepository);
    }

    public final gp0.e k(op0.a repository) {
        return new pp0.e(repository);
    }
}
