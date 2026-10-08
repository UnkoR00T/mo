package oh1;

import b50.RadioButtonItemData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh1.j, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Loh1/j;", "", "Lmx/a;", "text", "Ld40/b;", "iconData", "Lb50/b;", "radioButtonItemData", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Ld40/b;Lb50/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "Ld40/b;", "()Ld40/b;", "c", "Lb50/b;", "()Lb50/b;", "Ler/a;", "()Ler/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentLayoutItem {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f145830e = RadioButtonItemData.f16672d | d40.b.f39676g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d40.b iconData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final RadioButtonItemData radioButtonItemData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public DocumentLayoutItem(Label label, d40.b bVar, RadioButtonItemData radioButtonItemData, er.a<i0> aVar) {
        this.text = label;
        this.iconData = bVar;
        this.radioButtonItemData = radioButtonItemData;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d40.b getIconData() {
        return this.iconData;
    }

    public final er.a<i0> b() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RadioButtonItemData getRadioButtonItemData() {
        return this.radioButtonItemData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentLayoutItem)) {
            return false;
        }
        DocumentLayoutItem documentLayoutItem = (DocumentLayoutItem) other;
        return fr.t.c(this.text, documentLayoutItem.text) && fr.t.c(this.iconData, documentLayoutItem.iconData) && fr.t.c(this.radioButtonItemData, documentLayoutItem.radioButtonItemData) && fr.t.c(this.onClick, documentLayoutItem.onClick);
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.iconData.hashCode()) * 31) + this.radioButtonItemData.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "DocumentLayoutItem(text=" + this.text + ", iconData=" + this.iconData + ", radioButtonItemData=" + this.radioButtonItemData + ", onClick=" + this.onClick + ')';
    }
}
