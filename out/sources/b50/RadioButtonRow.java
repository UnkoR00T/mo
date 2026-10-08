package b50;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b50.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b!\u0010'¨\u0006("}, d2 = {"Lb50/c;", "", "Lb50/b;", "item", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lmx/a;", AnnotatedPrivateKey.LABEL, "description", "Lb50/a;", "content", "<init>", "(Lb50/b;Ler/a;Lmx/a;Lmx/a;Lb50/a;)V", "a", "(Lb50/b;Ler/a;Lmx/a;Lmx/a;Lb50/a;)Lb50/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lb50/b;", "e", "()Lb50/b;", "b", "Ler/a;", "g", "()Ler/a;", "c", "Lmx/a;", "f", "()Lmx/a;", "d", "Lb50/a;", "()Lb50/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RadioButtonRow {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final RadioButtonItemData item;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a content;

    public RadioButtonRow(RadioButtonItemData radioButtonItemData, er.a<i0> aVar, Label label, Label label2, a aVar2) {
        this.item = radioButtonItemData;
        this.onClick = aVar;
        this.label = label;
        this.description = label2;
        this.content = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadioButtonRow b(RadioButtonRow radioButtonRow, RadioButtonItemData radioButtonItemData, er.a aVar, Label label, Label label2, a aVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            radioButtonItemData = radioButtonRow.item;
        }
        if ((i15 & 2) != 0) {
            aVar = radioButtonRow.onClick;
        }
        if ((i15 & 4) != 0) {
            label = radioButtonRow.label;
        }
        if ((i15 & 8) != 0) {
            label2 = radioButtonRow.description;
        }
        if ((i15 & 16) != 0) {
            aVar2 = radioButtonRow.content;
        }
        a aVar3 = aVar2;
        Label label3 = label;
        return radioButtonRow.a(radioButtonItemData, aVar, label3, label2, aVar3);
    }

    public final RadioButtonRow a(RadioButtonItemData item, er.a<i0> onClick, Label label, Label description, a content) {
        return new RadioButtonRow(item, onClick, label, description, content);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final RadioButtonItemData getItem() {
        return this.item;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioButtonRow)) {
            return false;
        }
        RadioButtonRow radioButtonRow = (RadioButtonRow) other;
        return t.c(this.item, radioButtonRow.item) && t.c(this.onClick, radioButtonRow.onClick) && t.c(this.label, radioButtonRow.label) && t.c(this.description, radioButtonRow.description) && t.c(this.content, radioButtonRow.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public final er.a<i0> g() {
        return this.onClick;
    }

    public int hashCode() {
        int iHashCode = ((((this.item.hashCode() * 31) + this.onClick.hashCode()) * 31) + this.label.hashCode()) * 31;
        Label label = this.description;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        a aVar = this.content;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "RadioButtonRow(item=" + this.item + ", onClick=" + this.onClick + ", label=" + this.label + ", description=" + this.description + ", content=" + this.content + ')';
    }

    public /* synthetic */ RadioButtonRow(RadioButtonItemData radioButtonItemData, er.a aVar, Label label, Label label2, a aVar2, int i15, k kVar) {
        this(radioButtonItemData, aVar, label, (i15 & 8) != 0 ? null : label2, (i15 & 16) != 0 ? null : aVar2);
    }
}
