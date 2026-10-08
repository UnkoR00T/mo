package y00;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly00/s;", "Liy/t;", "<init>", "()V", "Liy/f0;", "storeType", "Ldx/i;", "Ldx/b;", "Ljava/security/KeyStore;", "c", "(Liy/f0;)Ldx/i;", "Ljava/io/InputStream;", "inputStream", "", "charArray", "b", "(Liy/f0;Ljava/io/InputStream;[C)Ldx/i;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements iy.t {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222841a;

        static {
            int[] iArr = new int[iy.f0.values().length];
            try {
                iArr[iy.f0.ANDROID_CA_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iy.f0.ANDROID_KEY_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iy.f0.BC_PKCS12_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[iy.f0.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f222841a = iArr;
        }
    }

    @Override // iy.t
    public dx.i<dx.b, KeyStore> b(iy.f0 storeType, InputStream inputStream, char[] charArray) {
        try {
            dx.i<dx.b, KeyStore> iVarC = c(storeType);
            if (iVarC instanceof dx.i.Left) {
                return iVarC;
            }
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            KeyStore keyStore = (KeyStore) ((dx.i.Right) iVarC).b();
            keyStore.load(inputStream, charArray);
            return new dx.i.Right(keyStore);
        } catch (IOException e15) {
            return new dx.i.Left(new dx.b.Generic(new KeyStoreException(e15)));
        } catch (NoSuchAlgorithmException e16) {
            return new dx.i.Left(new dx.b.Generic(new KeyStoreException(e16)));
        } catch (CertificateException e17) {
            return new dx.i.Left(new dx.b.Generic(new KeyStoreException(e17)));
        }
    }

    public dx.i<dx.b, KeyStore> c(iy.f0 storeType) {
        KeyStore keyStore;
        try {
            int i15 = a.f222841a[storeType.ordinal()];
            if (i15 == 1) {
                keyStore = KeyStore.getInstance(storeType.getAlias());
            } else if (i15 == 2 || i15 == 3) {
                keyStore = KeyStore.getInstance(storeType.getAlias(), storeType.getProvider());
            } else {
                if (i15 != 4) {
                    throw new oq.p();
                }
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            }
            return new dx.i.Right(keyStore);
        } catch (KeyStoreException e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        } catch (NoSuchProviderException e16) {
            return new dx.i.Left(new dx.b.Generic(e16));
        }
    }
}
