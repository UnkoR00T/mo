package y54;

import fr.k;
import fr.t;
import fu.r;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y54.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Ly54/a;", "Ly54/d;", "Lrq0/b;", "documentType", "Ly54/f;", "reminderPeriod", "", "title", "message", "Lr54/b;", "documentSubType", "<init>", "(Lrq0/b;Ly54/f;IILr54/b;)V", "", "b", "()Ljava/lang/String;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "g", "()Lrq0/b;", "Ly54/f;", "d", "()Ly54/f;", "c", "I", "getTitle", "e", "Lr54/b;", "()Lr54/b;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentNotificationConfigItem implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f reminderPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final r54.b documentSubType;

    public DocumentNotificationConfigItem(rq0.b bVar, f fVar, int i15, int i16, r54.b bVar2) {
        this.documentType = bVar;
        this.reminderPeriod = fVar;
        this.title = i15;
        this.message = i16;
        this.documentSubType = bVar2;
    }

    @Override // y54.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getMessage() {
        return this.message;
    }

    public String b() {
        String strName;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getDocumentType().getReferenceName());
        sb5.append(getReminderPeriod().getUniqueId());
        sb5.append(getReminderPeriod().getDays());
        r54.b bVar = this.documentSubType;
        if (bVar == null || (strName = bVar.name()) == null) {
            strName = "";
        }
        sb5.append(strName);
        return r.P(sb5.toString(), "_", "", false, 4, null).toUpperCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r54.b getDocumentSubType() {
        return this.documentSubType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public f getReminderPeriod() {
        return this.reminderPeriod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentNotificationConfigItem)) {
            return false;
        }
        DocumentNotificationConfigItem documentNotificationConfigItem = (DocumentNotificationConfigItem) other;
        return t.c(this.documentType, documentNotificationConfigItem.documentType) && t.c(this.reminderPeriod, documentNotificationConfigItem.reminderPeriod) && this.title == documentNotificationConfigItem.title && this.message == documentNotificationConfigItem.message && this.documentSubType == documentNotificationConfigItem.documentSubType;
    }

    @Override // y54.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public rq0.b getDocumentType() {
        return this.documentType;
    }

    @Override // y54.d
    public int getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((this.documentType.hashCode() * 31) + this.reminderPeriod.hashCode()) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.message)) * 31;
        r54.b bVar = this.documentSubType;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "DocumentNotificationConfigItem(documentType=" + this.documentType + ", reminderPeriod=" + this.reminderPeriod + ", title=" + this.title + ", message=" + this.message + ", documentSubType=" + this.documentSubType + ')';
    }

    public /* synthetic */ DocumentNotificationConfigItem(rq0.b bVar, f fVar, int i15, int i16, r54.b bVar2, int i17, k kVar) {
        this(bVar, fVar, i15, i16, (i17 & 16) != 0 ? null : bVar2);
    }
}
