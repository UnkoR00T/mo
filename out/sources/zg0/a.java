package zg0;

import java.security.cert.X509Certificate;
import java.time.Instant;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f235129a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f235130b = new c();

    public static ah0.b a(ah0.a aVar, byte[] bArr) {
        return ah0.b.a().b(f235130b.b(aVar.d(), Hex.toHexString(f235129a.c(aVar.d(), aVar.b(), bArr, aVar.e()).getEncoded()).toUpperCase())).a();
    }

    public static ah0.a b(byte[] bArr, X509Certificate x509Certificate, b bVar, Instant instant) {
        byte[] bArrA = bVar.a(bArr, instant, i.f(x509Certificate));
        return ah0.a.a().d(bArrA).c(Hex.toHexString(f235129a.d(bArrA, x509Certificate, instant)).toLowerCase()).e(instant).b(x509Certificate).a();
    }
}
