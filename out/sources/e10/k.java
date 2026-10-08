package e10;

import android.os.Build;
import android.security.keystore.KeyInfo;
import fr.t;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p071kotlin.Metadata;
import ry.DomainKeyInfo;
import ry.KeyValidity;
import ry.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/security/keystore/KeyInfo;", "Lry/d;", "a", "(Landroid/security/keystore/KeyInfo;)Lry/d;", "security_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final DomainKeyInfo a(KeyInfo keyInfo) {
        ry.j jVar;
        ry.k kVar;
        o biometricStrong;
        ry.h hVar;
        ry.i iVar;
        ry.l lVar;
        ry.g gVar;
        String keystoreAlias = keyInfo.getKeystoreAlias();
        int origin = keyInfo.getOrigin();
        if (origin == 1) {
            jVar = ry.j.ORIGIN_GENERATED;
        } else if (origin != 2) {
            jVar = (origin == 4 || origin != 8) ? ry.j.ORIGIN_UNKNOWN : ry.j.ORIGIN_SECURELY_IMPORTED;
        } else {
            jVar = ry.j.ORIGIN_IMPORTED;
        }
        int keySize = keyInfo.getKeySize();
        KeyValidity keyValidity = new KeyValidity(keyInfo.getKeyValidityStart(), keyInfo.getKeyValidityForConsumptionEnd(), keyInfo.getKeyValidityForOriginationEnd());
        if (Build.VERSION.SDK_INT >= 31) {
            int securityLevel = keyInfo.getSecurityLevel();
            if (securityLevel == -2) {
                kVar = ry.k.UNKNOWN;
            } else if (securityLevel == -1) {
                kVar = ry.k.UNKNOWN_SECURE;
            } else if (securityLevel == 0) {
                kVar = ry.k.SOFTWARE;
            } else if (securityLevel != 1) {
                kVar = securityLevel != 2 ? ry.k.UNKNOWN : ry.k.STRONGBOX;
            } else {
                kVar = ry.k.TRUSTED_ENVIRONMENT;
            }
        } else {
            kVar = keyInfo.isInsideSecureHardware() ? ry.k.UNKNOWN_SECURE : ry.k.UNKNOWN;
        }
        ry.k kVar2 = kVar;
        int purposes = keyInfo.getPurposes();
        String[] blockModes = keyInfo.getBlockModes();
        ArrayList arrayList = new ArrayList(blockModes.length);
        for (String str : blockModes) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 66500:
                        if (str.equals("CBC")) {
                            gVar = ry.g.BLOCK_MODE_CBC;
                        }
                        break;
                    case 67073:
                        if (str.equals("CTR")) {
                            gVar = ry.g.BLOCK_MODE_CTR;
                        }
                        break;
                    case 68452:
                        if (str.equals("ECB")) {
                            gVar = ry.g.BLOCK_MODE_ECB;
                        }
                        break;
                    case 70385:
                        if (str.equals("GCM")) {
                            gVar = ry.g.BLOCK_MODE_GCM;
                        }
                        break;
                    default:
                        break;
                }
                arrayList.add(gVar);
            }
            throw new IllegalArgumentException("Unknown block mode");
        }
        String[] signaturePaddings = keyInfo.getSignaturePaddings();
        ArrayList arrayList2 = new ArrayList(signaturePaddings.length);
        for (String str2 : signaturePaddings) {
            if (t.c(str2, "PSS")) {
                lVar = ry.l.SIGNATURE_PADDING_RSA_PSS;
            } else {
                if (!t.c(str2, "PKCS1")) {
                    throw new IllegalArgumentException("Unknown signature padding");
                }
                lVar = ry.l.SIGNATURE_PADDING_RSA_PKCS1;
            }
            arrayList2.add(lVar);
        }
        String[] encryptionPaddings = keyInfo.getEncryptionPaddings();
        ArrayList arrayList3 = new ArrayList(encryptionPaddings.length);
        for (String str3 : encryptionPaddings) {
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case -1938416507:
                        if (str3.equals("PKCS7Padding")) {
                            iVar = ry.i.ENCRYPTION_PADDING_PKCS7;
                            arrayList3.add(iVar);
                        }
                        break;
                    case -1724799148:
                        if (str3.equals("OAEPPadding")) {
                            iVar = ry.i.ENCRYPTION_PADDING_RSA_OAEP;
                            arrayList3.add(iVar);
                        }
                        break;
                    case 489623371:
                        if (str3.equals("PKCS1Padding")) {
                            iVar = ry.i.ENCRYPTION_PADDING_RSA_PKCS1;
                            arrayList3.add(iVar);
                        }
                        break;
                    case 1789205232:
                        if (str3.equals("NoPadding")) {
                            iVar = ry.i.ENCRYPTION_PADDING_NONE;
                            arrayList3.add(iVar);
                        }
                        break;
                    default:
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature padding");
        }
        String[] digests = keyInfo.getDigests();
        ArrayList arrayList4 = new ArrayList(digests.length);
        for (String str4 : digests) {
            if (str4 != null) {
                switch (str4.hashCode()) {
                    case -1523887821:
                        if (str4.equals("SHA-224")) {
                            hVar = ry.h.DIGEST_SHA224;
                            arrayList4.add(hVar);
                        }
                        break;
                    case -1523887726:
                        if (str4.equals(XMSSKeyParameters.SHA_256)) {
                            hVar = ry.h.DIGEST_SHA256;
                            arrayList4.add(hVar);
                        }
                        break;
                    case -1523886674:
                        if (str4.equals("SHA-384")) {
                            hVar = ry.h.DIGEST_SHA384;
                            arrayList4.add(hVar);
                        }
                        break;
                    case -1523884971:
                        if (str4.equals(XMSSKeyParameters.SHA_512)) {
                            hVar = ry.h.DIGEST_SHA512;
                            arrayList4.add(hVar);
                        }
                        break;
                    case 76158:
                        if (str4.equals("MD5")) {
                            hVar = ry.h.DIGEST_MD5;
                            arrayList4.add(hVar);
                        }
                        break;
                    case 2402104:
                        if (str4.equals("NONE")) {
                            hVar = ry.h.DIGEST_NONE;
                            arrayList4.add(hVar);
                        }
                        break;
                    case 78861104:
                        if (str4.equals("SHA-1")) {
                            hVar = ry.h.DIGEST_SHA1;
                            arrayList4.add(hVar);
                        }
                        break;
                    default:
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown digest");
        }
        if (!keyInfo.isUserAuthenticationRequired()) {
            biometricStrong = o.c.f176860a;
        } else if (Build.VERSION.SDK_INT >= 30) {
            biometricStrong = keyInfo.getUserAuthenticationType() == 2 ? new o.BiometricStrong(keyInfo.getUserAuthenticationValidityDurationSeconds(), keyInfo.isUserAuthenticationRequirementEnforcedBySecureHardware()) : new o.DeviceCredential(keyInfo.getUserAuthenticationValidityDurationSeconds(), keyInfo.isUserAuthenticationRequirementEnforcedBySecureHardware());
        } else {
            biometricStrong = keyInfo.isInvalidatedByBiometricEnrollment() ? new o.BiometricStrong(keyInfo.getUserAuthenticationValidityDurationSeconds(), keyInfo.isUserAuthenticationRequirementEnforcedBySecureHardware()) : new o.DeviceCredential(keyInfo.getUserAuthenticationValidityDurationSeconds(), keyInfo.isUserAuthenticationRequirementEnforcedBySecureHardware());
        }
        int i15 = Build.VERSION.SDK_INT;
        return new DomainKeyInfo(keystoreAlias, jVar, keySize, keyValidity, purposes, arrayList, arrayList2, arrayList3, arrayList4, biometricStrong, i15 >= 28 && keyInfo.isUserConfirmationRequired(), keyInfo.isUserAuthenticationValidWhileOnBody(), keyInfo.isInvalidatedByBiometricEnrollment(), i15 >= 28 && keyInfo.isTrustedUserPresenceRequired(), kVar2, i15 >= 31 ? keyInfo.getRemainingUsageCount() : -1);
    }
}
