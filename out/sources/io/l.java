package io;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    class a implements SecretKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SecretKey f93604a;

        a(SecretKey secretKey) {
            this.f93604a = secretKey;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return "AES";
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            return this.f93604a.getEncoded();
        }

        @Override // java.security.Key
        public String getFormat() {
            return this.f93604a.getFormat();
        }
    }

    public static SecretKey a(SecretKey secretKey) {
        return (secretKey == null || secretKey.getAlgorithm().equals("AES")) ? secretKey : new a(secretKey);
    }
}
