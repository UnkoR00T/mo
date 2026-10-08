package g70;

import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g70.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg70/b;", "", "Lmx/a;", "title", "", "iconResId", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;ILer/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "I", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShortcutMoreTransferData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public ShortcutMoreTransferData(Label label, int i15, er.a<i0> aVar) {
        this.title = label;
        this.iconResId = i15;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    public final er.a<i0> b() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutMoreTransferData)) {
            return false;
        }
        ShortcutMoreTransferData shortcutMoreTransferData = (ShortcutMoreTransferData) other;
        return t.c(this.title, shortcutMoreTransferData.title) && this.iconResId == shortcutMoreTransferData.iconResId && t.c(this.onClick, shortcutMoreTransferData.onClick);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Integer.hashCode(this.iconResId)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "ShortcutMoreTransferData(title=" + this.title + ", iconResId=" + this.iconResId + ", onClick=" + this.onClick + ')';
    }
}
