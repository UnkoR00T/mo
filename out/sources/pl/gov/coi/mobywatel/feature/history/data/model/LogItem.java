package pl.gov.coi.mobywatel.feature.history.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J=\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lpl/gov/coi/mobywatel/feature/history/data/model/LogItem;", "", "timestamp", "", "lvl", "Lpl/gov/coi/mobywatel/feature/history/data/model/LogLevel;", "type", "Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;", "data", "", "visible", "", "<init>", "(JLpl/gov/coi/mobywatel/feature/history/data/model/LogLevel;Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;Ljava/lang/String;Z)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getLvl", "()Lpl/gov/coi/mobywatel/feature/history/data/model/LogLevel;", "getType", "()Lpl/gov/coi/mobywatel/feature/history/data/model/LogType;", "getData", "()Ljava/lang/String;", "getVisible", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LogItem {
    public static final int $stable = 8;

    @c("data")
    private final String data;

    @c("lvl")
    private final LogLevel lvl;

    @c("time")
    private long timestamp;

    @c("type")
    private final LogType type;

    @c("visible")
    private final boolean visible;

    public LogItem(long j15, LogLevel logLevel, LogType logType, String str, boolean z15) {
        this.timestamp = j15;
        this.lvl = logLevel;
        this.type = logType;
        this.data = str;
        this.visible = z15;
    }

    public static /* synthetic */ LogItem copy$default(LogItem logItem, long j15, LogLevel logLevel, LogType logType, String str, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = logItem.timestamp;
        }
        long j16 = j15;
        if ((i15 & 2) != 0) {
            logLevel = logItem.lvl;
        }
        LogLevel logLevel2 = logLevel;
        if ((i15 & 4) != 0) {
            logType = logItem.type;
        }
        LogType logType2 = logType;
        if ((i15 & 8) != 0) {
            str = logItem.data;
        }
        String str2 = str;
        if ((i15 & 16) != 0) {
            z15 = logItem.visible;
        }
        return logItem.copy(j16, logLevel2, logType2, str2, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LogLevel getLvl() {
        return this.lvl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LogType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public final LogItem copy(long timestamp, LogLevel lvl, LogType type, String data, boolean visible) {
        return new LogItem(timestamp, lvl, type, data, visible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogItem)) {
            return false;
        }
        LogItem logItem = (LogItem) other;
        return this.timestamp == logItem.timestamp && this.lvl == logItem.lvl && this.type == logItem.type && t.c(this.data, logItem.data) && this.visible == logItem.visible;
    }

    public final String getData() {
        return this.data;
    }

    public final LogLevel getLvl() {
        return this.lvl;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final LogType getType() {
        return this.type;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.timestamp) * 31) + this.lvl.hashCode()) * 31;
        LogType logType = this.type;
        return ((((iHashCode + (logType == null ? 0 : logType.hashCode())) * 31) + this.data.hashCode()) * 31) + Boolean.hashCode(this.visible);
    }

    public final void setTimestamp(long j15) {
        this.timestamp = j15;
    }

    public String toString() {
        return "LogItem(timestamp=" + this.timestamp + ", lvl=" + this.lvl + ", type=" + this.type + ", data=" + this.data + ", visible=" + this.visible + ')';
    }

    public /* synthetic */ LogItem(long j15, LogLevel logLevel, LogType logType, String str, boolean z15, int i15, k kVar) {
        this(j15, logLevel, logType, str, (i15 & 16) != 0 ? true : z15);
    }
}
