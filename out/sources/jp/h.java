package jp;

import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes4.dex */
public class h extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f104284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KeyStore f104285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f104286c;

    public h(KeyStore keyStore, String str, String str2) {
        this.f104285b = keyStore;
        this.f104286c = str;
        this.f104284a = str2;
    }

    public X509Certificate a() throws KeyStoreException {
        if (this.f104285b.size() == 1) {
            return (X509Certificate) this.f104285b.getCertificate(this.f104285b.aliases().nextElement());
        }
        if (this.f104285b.containsAlias(this.f104286c)) {
            return (X509Certificate) this.f104285b.getCertificate(this.f104286c);
        }
        throw new KeyStoreException("the keystore does not contain the given alias");
    }

    public Key b() throws KeyStoreException {
        try {
            if (this.f104285b.size() == 1) {
                return this.f104285b.getKey(this.f104285b.aliases().nextElement(), this.f104284a.toCharArray());
            }
            if (this.f104285b.containsAlias(this.f104286c)) {
                return this.f104285b.getKey(this.f104286c, this.f104284a.toCharArray());
            }
            throw new KeyStoreException("the keystore does not contain the given alias");
        } catch (NoSuchAlgorithmException e15) {
            throw new KeyStoreException("the algorithm necessary to recover the key is not available", e15);
        } catch (UnrecoverableKeyException e16) {
            throw new KeyStoreException("the private key is not recoverable", e16);
        }
    }
}
