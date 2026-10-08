package g84;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g84.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"Lg84/a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "infoText", "", "Lg84/c;", "notificationSettingsSectionData", "Lc30/b;", "alertData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lc30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lc30/b;", "()Lc30/b;", "Ler/a;", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Initialized {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label infoText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<c> notificationSettingsSectionData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final c30.b alertData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onBackAction;

    public Initialized(BaseScaffoldData baseScaffoldData, Label label, List<c> list, c30.b bVar, er.a<i0> aVar) {
        this.scaffoldData = baseScaffoldData;
        this.infoText = label;
        this.notificationSettingsSectionData = list;
        this.alertData = bVar;
        this.onBackAction = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c30.b getAlertData() {
        return this.alertData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getInfoText() {
        return this.infoText;
    }

    public final List<c> c() {
        return this.notificationSettingsSectionData;
    }

    public final er.a<i0> d() {
        return this.onBackAction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Initialized)) {
            return false;
        }
        Initialized initialized = (Initialized) other;
        return t.c(this.scaffoldData, initialized.scaffoldData) && t.c(this.infoText, initialized.infoText) && t.c(this.notificationSettingsSectionData, initialized.notificationSettingsSectionData) && t.c(this.alertData, initialized.alertData) && t.c(this.onBackAction, initialized.onBackAction);
    }

    public int hashCode() {
        int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.infoText.hashCode()) * 31) + this.notificationSettingsSectionData.hashCode()) * 31;
        c30.b bVar = this.alertData;
        return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.onBackAction.hashCode();
    }

    public String toString() {
        return "Initialized(scaffoldData=" + this.scaffoldData + ", infoText=" + this.infoText + ", notificationSettingsSectionData=" + this.notificationSettingsSectionData + ", alertData=" + this.alertData + ", onBackAction=" + this.onBackAction + ')';
    }
}
