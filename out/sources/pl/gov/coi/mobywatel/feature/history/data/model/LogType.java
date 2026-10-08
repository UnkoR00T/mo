package pl.gov.coi.mobywatel.feature.history.data.model;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;", "", "<init>", "(Ljava/lang/String;I)V", "LOGGER_INIT", "LOGIN", "LOGIN_ERROR", "LOGIN_COUNT_ERROR", "INSTITUTION_CONFIRM_ERROR", "BIOMETRICS_WITH_PIN_ON", "BIOMETRICS_ON", "BIOMETRICS_WITH_PIN_OFF", "BIOMETRICS_OFF", "PASS_CHANGE", "PIN_CHANGE", "FINGERPRINT_KEY_INVALIDATED", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum LogType {
    LOGGER_INIT,
    LOGIN,
    LOGIN_ERROR,
    LOGIN_COUNT_ERROR,
    INSTITUTION_CONFIRM_ERROR,
    BIOMETRICS_WITH_PIN_ON,
    BIOMETRICS_ON,
    BIOMETRICS_WITH_PIN_OFF,
    BIOMETRICS_OFF,
    PASS_CHANGE,
    PIN_CHANGE,
    FINGERPRINT_KEY_INVALIDATED;

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    public static a<LogType> getEntries() {
        return $ENTRIES;
    }
}
