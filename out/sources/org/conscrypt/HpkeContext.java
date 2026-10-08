package org.conscrypt;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;

/* JADX INFO: loaded from: classes5.dex */
public abstract class HpkeContext {
    protected final HpkeSpi spi;

    protected HpkeContext(HpkeSpi hpkeSpi) {
        this.spi = hpkeSpi;
    }

    private static Provider findFirstProvider(String str) throws NoSuchAlgorithmException {
        for (Provider provider : Security.getProviders()) {
            Provider.Service service = provider.getService("ConscryptHpke", str);
            if (service != null) {
                return service.getProvider();
            }
        }
        throw new NoSuchAlgorithmException("No Provider found for: " + str);
    }

    protected static HpkeSpi findSpi(String str) throws NoSuchAlgorithmException {
        if (str != null) {
            return findSpi(str, findFirstProvider(str));
        }
        throw new NoSuchAlgorithmException("null algorithm");
    }

    public byte[] export(int i15, byte[] bArr) {
        return this.spi.engineExport(i15, bArr);
    }

    public HpkeSpi getSpi() {
        return this.spi;
    }

    protected static HpkeSpi findSpi(String str, String str2) throws NoSuchProviderException {
        if (str2 != null && !str2.isEmpty()) {
            Provider provider = Security.getProvider(str2);
            if (provider != null) {
                return findSpi(str, provider);
            }
            throw new NoSuchProviderException("Unknown Provider: " + str2);
        }
        throw new IllegalArgumentException("Invalid provider name");
    }

    protected static HpkeSpi findSpi(String str, Provider provider) throws NoSuchAlgorithmException {
        if (provider != null) {
            Provider.Service service = provider.getService("ConscryptHpke", str);
            if (service != null) {
                Object objNewInstance = service.newInstance(null);
                HpkeSpi hpkeSpiNewInstance = objNewInstance instanceof HpkeSpi ? (HpkeSpi) objNewInstance : DuckTypedHpkeSpi.newInstance(objNewInstance);
                if (hpkeSpiNewInstance != null) {
                    return hpkeSpiNewInstance;
                }
                throw new IllegalStateException(String.format("Provider %s is providing incorrect instances", provider.getName()));
            }
            throw new NoSuchAlgorithmException("Unknown algorithm");
        }
        throw new IllegalArgumentException("null Provider");
    }
}
