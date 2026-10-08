package y00;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Collections;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly00/y;", "Ly00/i;", "Landroid/content/Context;", "context", "Lpx/d;", "logger", "Liy/t;", "keyStoreProvider", "Ly00/j;", "certUpdaterConfig", "<init>", "(Landroid/content/Context;Lpx/d;Liy/t;Ly00/j;)V", "Ljava/security/KeyStore;", "prevKs", "newKs", "Loq/i0;", "b", "(Ljava/security/KeyStore;Ljava/security/KeyStore;)V", "defaultKeyStore", "c", "(Ljava/security/KeyStore;)V", "keyStore", "a", "(Ljava/security/KeyStore;)Ljava/security/KeyStore;", "Landroid/content/Context;", "Lpx/d;", "Liy/t;", "d", "Ly00/j;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j certUpdaterConfig;

    public y(Context context, px.d dVar, iy.t tVar, j jVar) {
        this.context = context;
        this.logger = dVar;
        this.keyStoreProvider = tVar;
        this.certUpdaterConfig = jVar;
    }

    private final void b(KeyStore prevKs, KeyStore newKs) throws KeyStoreException {
        for (String str : Collections.list(prevKs.aliases())) {
            if (prevKs.isCertificateEntry(str)) {
                newKs.setCertificateEntry(str, prevKs.getCertificate(str));
            }
        }
    }

    private final void c(KeyStore defaultKeyStore) throws KeyStoreException {
        for (Map.Entry<String, Integer> entry : this.certUpdaterConfig.i().entrySet()) {
            String key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            try {
                InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(iIntValue);
                try {
                    Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(inputStreamOpenRawResource);
                    ar.b.a(inputStreamOpenRawResource, null);
                    defaultKeyStore.setCertificateEntry(key, certificateGenerateCertificate);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ar.b.a(inputStreamOpenRawResource, th4);
                        throw th5;
                    }
                }
            } catch (Resources.NotFoundException e15) {
                this.logger.T6("Critical cert raw id not found: " + iIntValue, e15, px.c.a(this));
            } catch (CertificateException e16) {
                this.logger.T6("Critical cert factory not retrieved or certificate not generated from stream", e16, px.c.a(this));
            }
        }
    }

    @Override // y00.i
    public KeyStore a(KeyStore keyStore) {
        dx.i iVarA = iy.t.a(this.keyStoreProvider, iy.f0.DEFAULT, null, null, 6, null);
        if (iVarA instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVarA).b();
            px.b.y5(this.logger, "Critical cert, default KeyStore is null, can't update cert list, " + bVar, null, px.c.a(this), 2, null);
            return keyStore;
        }
        if (!(iVarA instanceof dx.i.Right)) {
            throw new oq.p();
        }
        KeyStore keyStore2 = (KeyStore) ((dx.i.Right) iVarA).b();
        try {
            b(keyStore, keyStore2);
            c(keyStore2);
            return keyStore2;
        } catch (KeyStoreException e15) {
            this.logger.T6("Critical cert, error while working with KeyStore", e15, px.c.a(this));
            return keyStore;
        }
    }
}
