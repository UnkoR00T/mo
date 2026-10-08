package k50;

import er.p;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: renamed from: k50.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u0017\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006'"}, d2 = {"Lk50/a;", "", "", "testTag", "", "iconResId", "Lkotlin/Function0;", "Loq/i0;", "slot", "onClick", "Lmx/a;", "contentDescription", "", "enabled", "<init>", "(Ljava/lang/String;ILer/p;Ler/a;Lmx/a;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "I", "c", "Ler/p;", "e", "()Ler/p;", "d", "Ler/a;", "()Ler/a;", "Lmx/a;", "()Lmx/a;", "Z", "()Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServiceWidgetLargeData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f108577g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<r, Integer, i0> slot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceWidgetLargeData(String str, int i15, p<? super r, ? super Integer, i0> pVar, er.a<i0> aVar, Label label, boolean z15) {
        this.testTag = str;
        this.iconResId = i15;
        this.slot = pVar;
        this.onClick = aVar;
        this.contentDescription = label;
        this.enabled = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    public final er.a<i0> d() {
        return this.onClick;
    }

    public final p<r, Integer, i0> e() {
        return this.slot;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceWidgetLargeData)) {
            return false;
        }
        ServiceWidgetLargeData serviceWidgetLargeData = (ServiceWidgetLargeData) other;
        return t.c(this.testTag, serviceWidgetLargeData.testTag) && this.iconResId == serviceWidgetLargeData.iconResId && t.c(this.slot, serviceWidgetLargeData.slot) && t.c(this.onClick, serviceWidgetLargeData.onClick) && t.c(this.contentDescription, serviceWidgetLargeData.contentDescription) && this.enabled == serviceWidgetLargeData.enabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    public int hashCode() {
        return (((((((((this.testTag.hashCode() * 31) + Integer.hashCode(this.iconResId)) * 31) + this.slot.hashCode()) * 31) + this.onClick.hashCode()) * 31) + this.contentDescription.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "ServiceWidgetLargeData(testTag=" + this.testTag + ", iconResId=" + this.iconResId + ", slot=" + this.slot + ", onClick=" + this.onClick + ", contentDescription=" + this.contentDescription + ", enabled=" + this.enabled + ')';
    }
}
