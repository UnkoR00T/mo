package ot0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ot0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lot0/i;", "", "", "enabled", "", "type", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getEnabled", "()Z", "b", "Ljava/lang/String;", "getType", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushSettingsEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final String type;

    public PushSettingsEntryDto(boolean z15, String str) {
        this.enabled = z15;
        this.type = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushSettingsEntryDto)) {
            return false;
        }
        PushSettingsEntryDto pushSettingsEntryDto = (PushSettingsEntryDto) other;
        return this.enabled == pushSettingsEntryDto.enabled && t.c(this.type, pushSettingsEntryDto.type);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PushSettingsEntryDto(enabled=" + this.enabled + ", type=" + this.type + ')';
    }
}
