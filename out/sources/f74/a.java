package f74;

import iy.l;
import iy.m;
import my.JWSHeaderData;
import my.JWSPayloadData;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import q34.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J;\u0010.\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0)H\u0007¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lf74/a;", "", "<init>", "()V", "Lg74/b;", "f", "()Lg74/b;", "dataSource", "Lac4/d;", "getCurrentServerTimeUseCase", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Lrp0/a;", "getJWSSigningParamsUC", "Ld74/e;", "parseJWSForEIDUC", "Lez/c;", "dateConverter", "Ld74/c;", "c", "(Lg74/b;Lac4/d;Lq34/z0;Lrp0/a;Ld74/e;Lez/c;)Ld74/c;", "Ld74/d;", "parseJWSEForEIDUC", "Liy/a;", "base64Coder", "Liy/m;", "ecdsaTranscoder", "Ld74/a;", "a", "(Lg74/b;Ld74/d;Liy/a;Liy/m;)Ld74/a;", "Lj74/f;", "parseJwseForMIDUC", "Lh74/a;", "wkContainersInteractor", "Ld74/b;", "b", "(Lrp0/a;Lj74/f;Liy/a;Lac4/d;Lq34/z0;Lez/c;Lh74/a;)Ld74/b;", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "Lxw/d;", "dispatcherProvider", "Lly/b;", "Lmy/a;", "jwsHeaderFactory", "Lmy/c;", "jwsPayloadFactory", "e", "(Liy/l;Lxw/d;Lly/b;Lly/b;)Ld74/e;", "Ljy/a;", "jweEncrypterStrategy", "d", "(Lxw/d;Ljy/a;Liy/a;)Ld74/d;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final d74.a a(g74.b dataSource, d74.d parseJWSEForEIDUC, iy.a base64Coder, m ecdsaTranscoder) {
        return new j74.a(dataSource, parseJWSEForEIDUC, base64Coder, ecdsaTranscoder);
    }

    public final d74.b b(rp0.a getJWSSigningParamsUC, j74.f parseJwseForMIDUC, iy.a base64Coder, ac4.d getCurrentServerTimeUseCase, z0 getPeselFromPersonalIdCertificate, ez.c dateConverter, h74.a wkContainersInteractor) {
        return new j74.b(getJWSSigningParamsUC, parseJwseForMIDUC, base64Coder, getCurrentServerTimeUseCase, getPeselFromPersonalIdCertificate, dateConverter, wkContainersInteractor);
    }

    public final d74.c c(g74.b dataSource, ac4.d getCurrentServerTimeUseCase, z0 getPeselFromPersonalIdCertificate, rp0.a getJWSSigningParamsUC, d74.e parseJWSForEIDUC, ez.c dateConverter) {
        return new j74.d(dataSource, getCurrentServerTimeUseCase, getPeselFromPersonalIdCertificate, getJWSSigningParamsUC, parseJWSForEIDUC, dateConverter);
    }

    public final d74.d d(xw.d dispatcherProvider, jy.a jweEncrypterStrategy, iy.a base64Coder) {
        return new j74.e(dispatcherProvider, jweEncrypterStrategy, base64Coder);
    }

    public final d74.e e(l digest, xw.d dispatcherProvider, ly.b<JWSHeaderData> jwsHeaderFactory, ly.b<JWSPayloadData> jwsPayloadFactory) {
        return new j74.g(digest, dispatcherProvider, jwsHeaderFactory, jwsPayloadFactory);
    }

    public final g74.b f() {
        return new e74.a();
    }
}
