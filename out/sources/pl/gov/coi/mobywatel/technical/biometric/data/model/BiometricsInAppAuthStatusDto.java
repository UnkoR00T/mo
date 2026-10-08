package pl.gov.coi.mobywatel.technical.biometric.data.model;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsInAppAuthStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "BIOMETRICS_WITH_PIN", "BIOMETRICS_WITHOUT_PIN", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum BiometricsInAppAuthStatusDto {
    DISABLED,
    BIOMETRICS_WITH_PIN,
    BIOMETRICS_WITHOUT_PIN;

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    public static a<BiometricsInAppAuthStatusDto> getEntries() {
        return $ENTRIES;
    }
}
