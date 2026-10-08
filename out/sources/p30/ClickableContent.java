package p30;

import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: p30.t, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Lp30/t;", "", "", "value", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Ljava/lang/String;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ler/a;", "()Ler/a;", "Lh30/a;", "Lh30/a;", "()Lh30/a;", "actionButtonData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ClickableContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ButtonData actionButtonData;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableContent(String str, er.a<i0> aVar) {
        this.value = str;
        this.onClick = aVar;
        this.actionButtonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b(str, "buttonTypeValue"), null, 2, null), new k30.d.Secondary(null, 1, 0 == true ? 1 : 0), null, aVar, 35, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonData getActionButtonData() {
        return this.actionButtonData;
    }

    public final er.a<i0> b() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableContent)) {
            return false;
        }
        ClickableContent clickableContent = (ClickableContent) other;
        return fr.t.c(this.value, clickableContent.value) && fr.t.c(this.onClick, clickableContent.onClick);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "ClickableContent(value=" + this.value + ", onClick=" + this.onClick + ')';
    }
}
