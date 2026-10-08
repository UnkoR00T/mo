package d34;

import android.content.Context;
import iy.d0;
import iy.i0;
import iy.k0;
import org.conscrypt.CertPinManager;
import org.conscrypt.ct.LogStore;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpRequestExecutor;
import pl.gov.coi.common.network.m0;
import pl.gov.coi.common.network.r;
import py.m;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJg\u0010\u001f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00172\b\b\u0001\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J/\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u0002072\u0006\u00106\u001a\u0002052\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b8\u00109J/\u0010=\u001a\u00020<2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b=\u0010>JO\u0010G\u001a\u00020F2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010?\u001a\u0002072\u0006\u0010A\u001a\u00020@2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\bG\u0010H¨\u0006I"}, d2 = {"Ld34/a;", "", "<init>", "()V", "Le34/b;", "ctLogListRepository", "Ly24/a;", "a", "(Le34/b;)Ly24/a;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "httpRequestExecutor", "La34/d;", "ctLogListStorageCache", "Liy/a;", "base64Coder", "Lpy/m;", "rsaKeyDecoder", "Lpy/e;", "ecKeyDecoder", "Liy/d0;", "signatureVerifier", "Lay/j;", "jsonSerializer", "La34/f;", "gStaticBuildConfigRepository", "Lez/a;", "currentTimeProvider", "Lpx/d;", "remoteLogger", "Lz24/b;", "certificateTransparencyEndpoints", "b", "(Lpl/gov/coi/common/network/HttpRequestExecutor;La34/d;Liy/a;Lpy/m;Lpy/e;Liy/d0;Lay/j;La34/f;Lez/a;Lpx/d;Lz24/b;)Le34/b;", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)La34/f;", "Lpl/gov/coi/common/network/r;", "httpClientConfig", "Liy/i0;", "certificateDecoder", "Lpl/gov/coi/common/network/b;", "certPinStore", "Lorg/conscrypt/CertPinManager;", "e", "(Lpl/gov/coi/common/network/r;Liy/a;Liy/i0;Lpl/gov/coi/common/network/b;)Lorg/conscrypt/CertPinManager;", "Lz00/a;", "d", "(Lpx/d;Liy/a;)Lz00/a;", "ctGetKnownLogUseCase", "Lorg/conscrypt/ct/LogStore;", "c", "(Ly24/a;)Lorg/conscrypt/ct/LogStore;", "Lt10/k;", "sharedPreferencesFactory", "Lb34/b;", "g", "(Lt10/k;Lay/j;)Lb34/b;", "Lpl/gov/coi/common/network/k0;", "ocspResponseVerifier", "Lpl/gov/coi/common/network/m0;", "i", "(Lpl/gov/coi/common/network/HttpRequestExecutor;Lpl/gov/coi/common/network/k0;Lez/a;Lpx/d;)Lpl/gov/coi/common/network/m0;", "crlStorageCache", "Lay/g;", "httpCacheHeaderParser", "Lpl/gov/coi/common/network/e;", "crlVerifier", "Liy/k0;", "x509CrlParser", "Lpl/gov/coi/common/network/d;", "f", "(Lpl/gov/coi/common/network/HttpRequestExecutor;Lb34/b;Lay/g;Liy/a;Lez/a;Lpl/gov/coi/common/network/e;Liy/k0;Lpx/d;)Lpl/gov/coi/common/network/d;", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final y24.a a(e34.b ctLogListRepository) {
        return new e34.a(ctLogListRepository);
    }

    public final e34.b b(HttpRequestExecutor httpRequestExecutor, a34.d ctLogListStorageCache, iy.a base64Coder, m rsaKeyDecoder, py.e ecKeyDecoder, d0 signatureVerifier, ay.j jsonSerializer, a34.f gStaticBuildConfigRepository, ez.a currentTimeProvider, px.d remoteLogger, z24.b certificateTransparencyEndpoints) {
        return new a34.c(httpRequestExecutor, ctLogListStorageCache, base64Coder, rsaKeyDecoder, ecKeyDecoder, signatureVerifier, jsonSerializer, currentTimeProvider, remoteLogger, gStaticBuildConfigRepository, certificateTransparencyEndpoints);
    }

    public final LogStore c(y24.a ctGetKnownLogUseCase) {
        return new a34.e(ctGetKnownLogUseCase);
    }

    public final z00.a d(px.d remoteLogger, iy.a base64Coder) {
        return new pl.gov.coi.common.network.h(remoteLogger, base64Coder);
    }

    public final CertPinManager e(r httpClientConfig, iy.a base64Coder, i0 certificateDecoder, pl.gov.coi.common.network.b certPinStore) {
        return new pl.gov.coi.common.network.a(httpClientConfig, base64Coder, certificateDecoder, certPinStore);
    }

    public final pl.gov.coi.common.network.d f(HttpRequestExecutor httpRequestExecutor, b34.b crlStorageCache, ay.g httpCacheHeaderParser, iy.a base64Coder, ez.a currentTimeProvider, pl.gov.coi.common.network.e crlVerifier, k0 x509CrlParser, px.d remoteLogger) {
        return new b34.a(httpRequestExecutor, crlStorageCache, httpCacheHeaderParser, base64Coder, currentTimeProvider, crlVerifier, x509CrlParser, remoteLogger);
    }

    public final b34.b g(k sharedPreferencesFactory, ay.j jsonSerializer) {
        return new b34.b(sharedPreferencesFactory, jsonSerializer);
    }

    public final a34.f h(Context context) {
        return new a34.g(context.getResources());
    }

    public final m0 i(HttpRequestExecutor httpRequestExecutor, pl.gov.coi.common.network.k0 ocspResponseVerifier, ez.a currentTimeProvider, px.d remoteLogger) {
        return new c34.a(httpRequestExecutor, ocspResponseVerifier, currentTimeProvider, remoteLogger);
    }
}
