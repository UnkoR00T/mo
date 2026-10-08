package j04;

import iy.t;
import iy.w;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import v64.s;
import y00.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u001dH\u0007¢\u0006\u0004\b2\u00103Jg\u0010C\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00182\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010)\u001a\u00020(2\u0006\u0010;\u001a\u00020:2\u0006\u0010+\u001a\u00020*2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020F2\u0006\u0010!\u001a\u00020 2\u0006\u0010E\u001a\u00020BH\u0007¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020\u001bH\u0007¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bM\u0010NJ7\u0010O\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bO\u0010PJG\u0010Q\u001a\u00020\u00102\u0006\u00109\u001a\u0002082\u0006\u00107\u001a\u0002062\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bQ\u0010RJ\u001f\u0010U\u001a\u0002042\u0006\u0010)\u001a\u00020(2\u0006\u0010T\u001a\u00020SH\u0007¢\u0006\u0004\bU\u0010VJ\u001f\u0010W\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\bW\u0010XJ/\u0010a\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_H\u0007¢\u0006\u0004\ba\u0010bJ7\u0010g\u001a\u00020@2\u0006\u0010d\u001a\u00020c2\u0006\u0010)\u001a\u00020(2\u0006\u0010T\u001a\u00020S2\u0006\u0010`\u001a\u00020_2\u0006\u0010f\u001a\u00020eH\u0007¢\u0006\u0004\bg\u0010hJ'\u0010l\u001a\u00020k2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010j\u001a\u00020i2\u0006\u0010`\u001a\u00020_H\u0007¢\u0006\u0004\bl\u0010mJ/\u0010n\u001a\u00020>2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020@2\u0006\u0010`\u001a\u00020_2\u0006\u0010j\u001a\u00020iH\u0007¢\u0006\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lj04/a;", "", "<init>", "()V", "Liy/t;", "keyStoreProvider", "Lpy/i;", "keyStoreAesKeyGenerator", "Liy/s;", "keyInspector", "Liy/g;", "cipherAes", "Lmx/c;", "labelProvider", "Lax/e;", "biometricManager", "Lg04/i;", "deactivateBiometricUseCase", "Lg04/f;", "checkBiometricRequirementsUseCase", "Ljx/h;", "systemInfoUpdater", "Lpx/d;", "remoteLogger", "Lg04/b;", "b", "(Liy/t;Lpy/i;Liy/s;Liy/g;Lmx/c;Lax/e;Lg04/i;Lg04/f;Ljx/h;Lpx/d;)Lg04/b;", "Lf04/a;", "biometricRepository", "Lg04/j;", "k", "(Lf04/a;)Lg04/j;", "Lg04/g;", "checkBiometricStatusUseCase", "Lv64/j;", "compareWithCurrentPasswordUseCase", "Lg04/l;", "getPasswordFromBiometricUseCase", "Lv64/i;", "comparePinWithCommonContainerUseCase", "Liy/c;", "bytesConverter", "Ly00/c0;", "securityExceptionParser", "Lg04/h;", "i", "(Lg04/g;Lv64/j;Lg04/l;Lv64/i;Liy/c;Ly00/c0;Lpx/d;)Lg04/h;", "authenticateWithBiometricUseCase", "getBiometricEncryptedCredentialUseCase", "Lg04/c;", "c", "(Lg04/b;Lg04/j;)Lg04/c;", "Lg04/p;", "xorPasswordWithPinUseCase", "Lv64/s;", "setBiometricPinProtectionUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Liy/w;", "secureRandomFactory", "Ll04/a;", "biometricUserInteractor", "Lg04/o;", "saveBiometricPinUC", "Lg04/m;", "hashPinUseCase", "Lg04/a;", "a", "(Lf04/a;Lg04/b;Lg04/p;Lv64/s;Lac4/a;Liy/c;Liy/w;Ly00/c0;Ll04/a;Lg04/o;Lg04/m;)Lg04/a;", "activateBiometricUseCase", "Lg04/d;", "e", "(Lg04/g;Lg04/a;)Lg04/d;", "repository", "Lg04/e;", "f", "(Lf04/a;)Lg04/e;", "g", "(Lax/e;Lpy/i;)Lg04/f;", "h", "(Lg04/f;Lg04/i;Lf04/a;Lpx/d;Lmx/c;)Lg04/g;", "j", "(Lac4/a;Lv64/s;Lf04/a;Liy/t;Lpx/d;Ll04/a;Lg04/o;)Lg04/i;", "Liy/e;", "bytesManager", "p", "(Liy/c;Liy/e;)Lg04/p;", "m", "(Liy/c;Lg04/p;)Lg04/l;", "Lcz/c;", "persistentStorageFactory", "Lay/j;", "jsonSerializer", "Ld00/a;", "inMemoryCache", "Liy/a;", "base64Coder", "d", "(Lcz/c;Lay/j;Ld00/a;Liy/a;)Lf04/a;", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "Ljx/d;", "deviceInfo", "n", "(Liy/l;Liy/c;Liy/e;Liy/a;Ljx/d;)Lg04/m;", "Lf10/b;", "masterKeyCipher", "Lg04/k;", "l", "(Lf04/a;Lf10/b;Liy/a;)Lg04/k;", "o", "(Lf04/a;Lg04/m;Liy/a;Lf10/b;)Lg04/o;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final g04.a a(f04.a biometricRepository, g04.b authenticateWithBiometricUseCase, g04.p xorPasswordWithPinUseCase, s setBiometricPinProtectionUseCase, ac4.a callActionWithLoaderUseCase, iy.c bytesConverter, w secureRandomFactory, c0 securityExceptionParser, l04.a biometricUserInteractor, g04.o saveBiometricPinUC, g04.m hashPinUseCase) {
        return new m04.a(authenticateWithBiometricUseCase, xorPasswordWithPinUseCase, setBiometricPinProtectionUseCase, callActionWithLoaderUseCase, biometricRepository, bytesConverter, secureRandomFactory, securityExceptionParser, biometricUserInteractor, saveBiometricPinUC, hashPinUseCase);
    }

    public final g04.b b(t keyStoreProvider, py.i keyStoreAesKeyGenerator, iy.s keyInspector, iy.g cipherAes, mx.c labelProvider, ax.e biometricManager, g04.i deactivateBiometricUseCase, g04.f checkBiometricRequirementsUseCase, jx.h systemInfoUpdater, px.d remoteLogger) {
        return new m04.b(keyStoreProvider, keyStoreAesKeyGenerator, keyInspector, cipherAes, labelProvider, biometricManager, deactivateBiometricUseCase, checkBiometricRequirementsUseCase, systemInfoUpdater, remoteLogger);
    }

    public final g04.c c(g04.b authenticateWithBiometricUseCase, g04.j getBiometricEncryptedCredentialUseCase) {
        return new m04.c(authenticateWithBiometricUseCase, getBiometricEncryptedCredentialUseCase);
    }

    public final f04.a d(cz.c persistentStorageFactory, ay.j jsonSerializer, d00.a inMemoryCache, iy.a base64Coder) {
        return new h04.b(persistentStorageFactory, jsonSerializer, inMemoryCache, base64Coder);
    }

    public final g04.d e(g04.g checkBiometricStatusUseCase, g04.a activateBiometricUseCase) {
        return new m04.d(checkBiometricStatusUseCase, activateBiometricUseCase);
    }

    public final g04.e f(f04.a repository) {
        return new m04.e(repository);
    }

    public final g04.f g(ax.e biometricManager, py.i keyStoreAesKeyGenerator) {
        return new m04.f(biometricManager, keyStoreAesKeyGenerator);
    }

    public final g04.g h(g04.f checkBiometricRequirementsUseCase, g04.i deactivateBiometricUseCase, f04.a repository, px.d remoteLogger, mx.c labelProvider) {
        return new m04.g(checkBiometricRequirementsUseCase, deactivateBiometricUseCase, repository, remoteLogger, labelProvider);
    }

    public final g04.h i(g04.g checkBiometricStatusUseCase, v64.j compareWithCurrentPasswordUseCase, g04.l getPasswordFromBiometricUseCase, v64.i comparePinWithCommonContainerUseCase, iy.c bytesConverter, c0 securityExceptionParser, px.d remoteLogger) {
        return new m04.h(checkBiometricStatusUseCase, compareWithCurrentPasswordUseCase, getPasswordFromBiometricUseCase, comparePinWithCommonContainerUseCase, bytesConverter, securityExceptionParser, remoteLogger);
    }

    public final g04.i j(ac4.a callActionWithLoaderUseCase, s setBiometricPinProtectionUseCase, f04.a repository, t keyStoreProvider, px.d remoteLogger, l04.a biometricUserInteractor, g04.o saveBiometricPinUC) {
        return new m04.i(callActionWithLoaderUseCase, setBiometricPinProtectionUseCase, repository, keyStoreProvider, remoteLogger, biometricUserInteractor, saveBiometricPinUC);
    }

    public final g04.j k(f04.a biometricRepository) {
        return new m04.j(biometricRepository);
    }

    public final g04.k l(f04.a repository, f10.b masterKeyCipher, iy.a base64Coder) {
        return new m04.k(repository, masterKeyCipher, base64Coder);
    }

    public final g04.l m(iy.c bytesConverter, g04.p xorPasswordWithPinUseCase) {
        return new m04.l(bytesConverter, xorPasswordWithPinUseCase);
    }

    public final g04.m n(iy.l digest, iy.c bytesConverter, iy.e bytesManager, iy.a base64Coder, jx.d deviceInfo) {
        return new m04.m(digest, bytesConverter, bytesManager, base64Coder, deviceInfo);
    }

    public final g04.o o(f04.a repository, g04.m hashPinUseCase, iy.a base64Coder, f10.b masterKeyCipher) {
        return new m04.n(repository, hashPinUseCase, base64Coder, masterKeyCipher);
    }

    public final g04.p p(iy.c bytesConverter, iy.e bytesManager) {
        return new m04.o(bytesConverter, bytesManager);
    }
}
