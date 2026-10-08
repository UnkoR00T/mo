package da2;

import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.history.data.model.LogItem;
import pl.gov.coi.mobywatel.feature.history.data.model.LogLevel;
import pl.gov.coi.mobywatel.feature.history.data.model.LogType;
import y92.LocalAppActivityLog;
import y92.e;
import y92.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0010*\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0016*\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lda2/a;", "", "<init>", "()V", "Lpl/gov/coi/mobywatel/feature/history/data/model/LogItem;", "Lmx/a;", "description", "Ly92/d;", "a", "(Lpl/gov/coi/mobywatel/feature/history/data/model/LogItem;Lmx/a;)Ly92/d;", "Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;", "Ly92/f;", "c", "(Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;)Ly92/f;", "e", "(Ly92/f;)Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;", "Lpl/gov/coi/mobywatel/feature/history/data/model/LogLevel;", "Ly92/e;", "b", "(Lpl/gov/coi/mobywatel/feature/history/data/model/LogLevel;)Ly92/e;", "d", "(Ly92/e;)Lpl/gov/coi/mobywatel/feature/history/data/model/LogLevel;", "", "g", "(Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;)I", "f", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40584a = new a();

    /* JADX INFO: renamed from: da2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0894a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f40587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f40588d;

        static {
            int[] iArr = new int[LogType.values().length];
            try {
                iArr[LogType.LOGGER_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogType.LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogType.LOGIN_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogType.LOGIN_COUNT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogType.INSTITUTION_CONFIRM_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogType.BIOMETRICS_WITH_PIN_ON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LogType.BIOMETRICS_ON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LogType.BIOMETRICS_WITH_PIN_OFF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LogType.BIOMETRICS_OFF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LogType.PASS_CHANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LogType.PIN_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LogType.FINGERPRINT_KEY_INVALIDATED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f40585a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.APP_ACTIVATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[f.PASSWORD_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[f.PIN_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[f.LOGIN_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[f.LOGIN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[f.LOGIN_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[f.BIOMETRIC_WITH_PIN_ON.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[f.BIOMETRIC_WITHOUT_PIN_ON.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[f.BIOMETRIC_WITH_PIN_OFF.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[f.BIOMETRIC_WITHOUT_PIN_OFF.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[f.BIOMETRIC_KEY_INVALIDATED.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[f.INSTITUTION_EXCHANGE_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[f.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            f40586b = iArr2;
            int[] iArr3 = new int[LogLevel.values().length];
            try {
                iArr3[LogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[LogLevel.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[LogLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            f40587c = iArr3;
            int[] iArr4 = new int[e.values().length];
            try {
                iArr4[e.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[e.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[e.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            f40588d = iArr4;
        }
    }

    private a() {
    }

    public final LocalAppActivityLog a(LogItem logItem, Label label) {
        return new LocalAppActivityLog(logItem.getTimestamp(), c(logItem.getType()), b(logItem.getLvl()), label, f(logItem.getType()));
    }

    public final e b(LogLevel logLevel) {
        int i15 = C0894a.f40587c[logLevel.ordinal()];
        if (i15 == 1) {
            return e.INFO;
        }
        if (i15 == 2) {
            return e.WARN;
        }
        if (i15 == 3) {
            return e.ERROR;
        }
        throw new p();
    }

    public final f c(LogType logType) {
        switch (logType == null ? -1 : C0894a.f40585a[logType.ordinal()]) {
            case -1:
                return f.UNKNOWN;
            case 0:
            default:
                throw new p();
            case 1:
                return f.APP_ACTIVATION;
            case 2:
                return f.LOGIN_SUCCESS;
            case 3:
                return f.LOGIN_ERROR;
            case 4:
                return f.LOGIN_TIMEOUT;
            case 5:
                return f.INSTITUTION_EXCHANGE_FAILED;
            case 6:
                return f.BIOMETRIC_WITH_PIN_ON;
            case 7:
                return f.BIOMETRIC_WITHOUT_PIN_ON;
            case 8:
                return f.BIOMETRIC_WITH_PIN_OFF;
            case 9:
                return f.BIOMETRIC_WITHOUT_PIN_OFF;
            case 10:
                return f.PASSWORD_CHANGE;
            case 11:
                return f.PIN_CHANGE;
            case 12:
                return f.BIOMETRIC_KEY_INVALIDATED;
        }
    }

    public final LogLevel d(e eVar) {
        int i15 = C0894a.f40588d[eVar.ordinal()];
        if (i15 == 1) {
            return LogLevel.INFO;
        }
        if (i15 == 2) {
            return LogLevel.WARN;
        }
        if (i15 == 3) {
            return LogLevel.ERROR;
        }
        throw new p();
    }

    public final LogType e(f fVar) {
        switch (C0894a.f40586b[fVar.ordinal()]) {
            case 1:
                return LogType.LOGGER_INIT;
            case 2:
                return LogType.PASS_CHANGE;
            case 3:
                return LogType.PIN_CHANGE;
            case 4:
                return LogType.LOGIN;
            case 5:
                return LogType.LOGIN_ERROR;
            case 6:
                return LogType.LOGIN_COUNT_ERROR;
            case 7:
                return LogType.BIOMETRICS_WITH_PIN_ON;
            case 8:
                return LogType.BIOMETRICS_ON;
            case 9:
                return LogType.BIOMETRICS_WITH_PIN_OFF;
            case 10:
                return LogType.BIOMETRICS_OFF;
            case 11:
                return LogType.FINGERPRINT_KEY_INVALIDATED;
            case 12:
                return LogType.INSTITUTION_CONFIRM_ERROR;
            case 13:
                return null;
            default:
                throw new p();
        }
    }

    public final int f(LogType logType) {
        switch (logType == null ? -1 : C0894a.f40585a[logType.ordinal()]) {
            case 2:
            case 3:
            case 4:
                return jz.a.f106784h0;
            case 5:
            default:
                return jz.a.T;
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                return jz.a.f106775g;
            case 10:
                return jz.a.f106767f;
        }
    }

    public final int g(LogType logType) {
        switch (C0894a.f40585a[logType.ordinal()]) {
            case 1:
                return x92.a.f217614f;
            case 2:
                return x92.a.f217622n;
            case 3:
                return x92.a.f217621m;
            case 4:
                return x92.a.f217623o;
            case 5:
                return x92.a.f217625q;
            case 6:
                return x92.a.f217615g;
            case 7:
                return x92.a.f217616h;
            case 8:
                return x92.a.f217617i;
            case 9:
                return x92.a.f217618j;
            case 10:
                return x92.a.f217624p;
            case 11:
                return x92.a.f217620l;
            case 12:
                return x92.a.f217619k;
            default:
                throw new p();
        }
    }
}
