package ry;

import fr.t;
import java.util.List;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ry.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b\u0017\u0010GR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\b\u0018\u0010GR\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\b\u0019\u0010GR\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\b\u001a\u0010GR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b'\u0010MR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010/\u001a\u0004\bO\u0010#¨\u0006P"}, d2 = {"Lry/d;", "", "", "alias", "Lry/j;", "origin", "", "keySizeInBits", "Lry/m;", "validity", "purpose", "", "Lry/g;", "blockMode", "Lry/l;", "signaturePadding", "Lry/i;", "encryptionPadding", "Lry/h;", CMSAttributeTableGenerator.DIGEST, "Lry/o;", "userAuthentication", "", "isUserConfirmationRequired", "isUserAuthenticationValidWhileOnBody", "isInvalidatedByBiometricEnrollment", "isTrustedUserPresenceRequired", "Lry/k;", "keySecurityLevel", "remainingUsageCount", "<init>", "(Ljava/lang/String;Lry/j;ILry/m;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lry/o;ZZZZLry/k;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAlias", "b", "Lry/j;", "getOrigin", "()Lry/j;", "c", "I", "getKeySizeInBits", "d", "Lry/m;", "getValidity", "()Lry/m;", "e", "getPurpose", "f", "Ljava/util/List;", "getBlockMode", "()Ljava/util/List;", "g", "getSignaturePadding", "h", "getEncryptionPadding", "i", "getDigest", "j", "Lry/o;", "getUserAuthentication", "()Lry/o;", "k", "Z", "()Z", "l", "m", "n", "o", "Lry/k;", "()Lry/k;", "p", "getRemainingUsageCount", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DomainKeyInfo {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f176785q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String alias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final j origin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keySizeInBits;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyValidity validity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int purpose;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<g> blockMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<l> signaturePadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<i> encryptionPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<h> digest;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final o userAuthentication;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUserConfirmationRequired;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUserAuthenticationValidWhileOnBody;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInvalidatedByBiometricEnrollment;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTrustedUserPresenceRequired;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final k keySecurityLevel;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final int remainingUsageCount;

    /* JADX WARN: Multi-variable type inference failed */
    public DomainKeyInfo(String str, j jVar, int i15, KeyValidity keyValidity, int i16, List<? extends g> list, List<? extends l> list2, List<? extends i> list3, List<? extends h> list4, o oVar, boolean z15, boolean z16, boolean z17, boolean z18, k kVar, int i17) {
        this.alias = str;
        this.origin = jVar;
        this.keySizeInBits = i15;
        this.validity = keyValidity;
        this.purpose = i16;
        this.blockMode = list;
        this.signaturePadding = list2;
        this.encryptionPadding = list3;
        this.digest = list4;
        this.userAuthentication = oVar;
        this.isUserConfirmationRequired = z15;
        this.isUserAuthenticationValidWhileOnBody = z16;
        this.isInvalidatedByBiometricEnrollment = z17;
        this.isTrustedUserPresenceRequired = z18;
        this.keySecurityLevel = kVar;
        this.remainingUsageCount = i17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getKeySecurityLevel() {
        return this.keySecurityLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainKeyInfo)) {
            return false;
        }
        DomainKeyInfo domainKeyInfo = (DomainKeyInfo) other;
        return t.c(this.alias, domainKeyInfo.alias) && this.origin == domainKeyInfo.origin && this.keySizeInBits == domainKeyInfo.keySizeInBits && t.c(this.validity, domainKeyInfo.validity) && this.purpose == domainKeyInfo.purpose && t.c(this.blockMode, domainKeyInfo.blockMode) && t.c(this.signaturePadding, domainKeyInfo.signaturePadding) && t.c(this.encryptionPadding, domainKeyInfo.encryptionPadding) && t.c(this.digest, domainKeyInfo.digest) && t.c(this.userAuthentication, domainKeyInfo.userAuthentication) && this.isUserConfirmationRequired == domainKeyInfo.isUserConfirmationRequired && this.isUserAuthenticationValidWhileOnBody == domainKeyInfo.isUserAuthenticationValidWhileOnBody && this.isInvalidatedByBiometricEnrollment == domainKeyInfo.isInvalidatedByBiometricEnrollment && this.isTrustedUserPresenceRequired == domainKeyInfo.isTrustedUserPresenceRequired && this.keySecurityLevel == domainKeyInfo.keySecurityLevel && this.remainingUsageCount == domainKeyInfo.remainingUsageCount;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.alias.hashCode() * 31) + this.origin.hashCode()) * 31) + Integer.hashCode(this.keySizeInBits)) * 31) + this.validity.hashCode()) * 31) + Integer.hashCode(this.purpose)) * 31) + this.blockMode.hashCode()) * 31) + this.signaturePadding.hashCode()) * 31) + this.encryptionPadding.hashCode()) * 31) + this.digest.hashCode()) * 31) + this.userAuthentication.hashCode()) * 31) + Boolean.hashCode(this.isUserConfirmationRequired)) * 31) + Boolean.hashCode(this.isUserAuthenticationValidWhileOnBody)) * 31) + Boolean.hashCode(this.isInvalidatedByBiometricEnrollment)) * 31) + Boolean.hashCode(this.isTrustedUserPresenceRequired)) * 31) + this.keySecurityLevel.hashCode()) * 31) + Integer.hashCode(this.remainingUsageCount);
    }

    public String toString() {
        return "DomainKeyInfo(alias=" + this.alias + ", origin=" + this.origin + ", keySizeInBits=" + this.keySizeInBits + ", validity=" + this.validity + ", purpose=" + this.purpose + ", blockMode=" + this.blockMode + ", signaturePadding=" + this.signaturePadding + ", encryptionPadding=" + this.encryptionPadding + ", digest=" + this.digest + ", userAuthentication=" + this.userAuthentication + ", isUserConfirmationRequired=" + this.isUserConfirmationRequired + ", isUserAuthenticationValidWhileOnBody=" + this.isUserAuthenticationValidWhileOnBody + ", isInvalidatedByBiometricEnrollment=" + this.isInvalidatedByBiometricEnrollment + ", isTrustedUserPresenceRequired=" + this.isTrustedUserPresenceRequired + ", keySecurityLevel=" + this.keySecurityLevel + ", remainingUsageCount=" + this.remainingUsageCount + ")";
    }
}
