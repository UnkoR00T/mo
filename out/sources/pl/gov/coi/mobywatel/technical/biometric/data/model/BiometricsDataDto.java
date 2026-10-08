package pl.gov.coi.mobywatel.technical.biometric.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsDataDto;", "Ljava/io/Serializable;", "biometricsInAppAuthStatus", "Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsInAppAuthStatusDto;", "encryptedPassword", "", "<init>", "(Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsInAppAuthStatusDto;Ljava/lang/String;)V", "getBiometricsInAppAuthStatus", "()Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsInAppAuthStatusDto;", "getEncryptedPassword", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricsDataDto implements Serializable {
    private final BiometricsInAppAuthStatusDto biometricsInAppAuthStatus;
    private final String encryptedPassword;

    public BiometricsDataDto(BiometricsInAppAuthStatusDto biometricsInAppAuthStatusDto, String str) {
        this.biometricsInAppAuthStatus = biometricsInAppAuthStatusDto;
        this.encryptedPassword = str;
    }

    public static /* synthetic */ BiometricsDataDto copy$default(BiometricsDataDto biometricsDataDto, BiometricsInAppAuthStatusDto biometricsInAppAuthStatusDto, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            biometricsInAppAuthStatusDto = biometricsDataDto.biometricsInAppAuthStatus;
        }
        if ((i15 & 2) != 0) {
            str = biometricsDataDto.encryptedPassword;
        }
        return biometricsDataDto.copy(biometricsInAppAuthStatusDto, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BiometricsInAppAuthStatusDto getBiometricsInAppAuthStatus() {
        return this.biometricsInAppAuthStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public final BiometricsDataDto copy(BiometricsInAppAuthStatusDto biometricsInAppAuthStatus, String encryptedPassword) {
        return new BiometricsDataDto(biometricsInAppAuthStatus, encryptedPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricsDataDto)) {
            return false;
        }
        BiometricsDataDto biometricsDataDto = (BiometricsDataDto) other;
        return this.biometricsInAppAuthStatus == biometricsDataDto.biometricsInAppAuthStatus && t.c(this.encryptedPassword, biometricsDataDto.encryptedPassword);
    }

    public final BiometricsInAppAuthStatusDto getBiometricsInAppAuthStatus() {
        return this.biometricsInAppAuthStatus;
    }

    public final String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public int hashCode() {
        return (this.biometricsInAppAuthStatus.hashCode() * 31) + this.encryptedPassword.hashCode();
    }

    public String toString() {
        return "BiometricsDataDto(biometricsInAppAuthStatus=" + this.biometricsInAppAuthStatus + ", encryptedPassword=" + this.encryptedPassword + ')';
    }
}
