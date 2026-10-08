package jp;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Provider f104308a;

    public static Provider a() throws IOException {
        if (f104308a == null) {
            try {
                Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
                Security.addProvider(new BouncyCastleProvider());
                f104308a = (Provider) BouncyCastleProvider.class.getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e15) {
                throw new IOException(e15);
            } catch (IllegalAccessException e16) {
                throw new IOException(e16);
            } catch (InstantiationException e17) {
                throw new IOException(e17);
            } catch (NoSuchMethodException e18) {
                throw new IOException(e18);
            } catch (InvocationTargetException e19) {
                throw new IOException(e19);
            }
        }
        return f104308a;
    }
}
