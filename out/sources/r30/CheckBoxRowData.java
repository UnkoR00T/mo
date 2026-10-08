package r30;

import er.l;
import er.p;
import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: renamed from: r30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J|\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b'\u0010.R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b#\u00100¨\u00061"}, d2 = {"Lr30/a;", "", "", "testTag", "", "isChecked", "Lkotlin/Function1;", "Loq/i0;", "onCheckedChange", "Lmx/a;", AnnotatedPrivateKey.LABEL, "description", "contentDescription", "Lr30/d;", "clickableTextData", "Lkotlin/Function0;", "checkboxCustomContent", "<init>", "(Ljava/lang/String;ZLer/l;Lmx/a;Lmx/a;Lmx/a;Lr30/d;Ler/p;)V", "a", "(Ljava/lang/String;ZLer/l;Lmx/a;Lmx/a;Lmx/a;Lr30/d;Ler/p;)Lr30/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "Z", "j", "()Z", "c", "Ler/l;", "h", "()Ler/l;", "d", "Lmx/a;", "g", "()Lmx/a;", "e", "f", "Lr30/d;", "()Lr30/d;", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckBoxRowData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<Boolean, i0> onCheckedChange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final d clickableTextData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<r, Integer, i0> checkboxCustomContent;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckBoxRowData(String str, boolean z15, l<? super Boolean, i0> lVar, Label label, Label label2, Label label3, d dVar, p<? super r, ? super Integer, i0> pVar) {
        this.testTag = str;
        this.isChecked = z15;
        this.onCheckedChange = lVar;
        this.label = label;
        this.description = label2;
        this.contentDescription = label3;
        this.clickableTextData = dVar;
        this.checkboxCustomContent = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckBoxRowData b(CheckBoxRowData checkBoxRowData, String str, boolean z15, l lVar, Label label, Label label2, Label label3, d dVar, p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = checkBoxRowData.testTag;
        }
        if ((i15 & 2) != 0) {
            z15 = checkBoxRowData.isChecked;
        }
        if ((i15 & 4) != 0) {
            lVar = checkBoxRowData.onCheckedChange;
        }
        if ((i15 & 8) != 0) {
            label = checkBoxRowData.label;
        }
        if ((i15 & 16) != 0) {
            label2 = checkBoxRowData.description;
        }
        if ((i15 & 32) != 0) {
            label3 = checkBoxRowData.contentDescription;
        }
        if ((i15 & 64) != 0) {
            dVar = checkBoxRowData.clickableTextData;
        }
        if ((i15 & 128) != 0) {
            pVar = checkBoxRowData.checkboxCustomContent;
        }
        d dVar2 = dVar;
        p pVar2 = pVar;
        Label label4 = label2;
        Label label5 = label3;
        return checkBoxRowData.a(str, z15, lVar, label, label4, label5, dVar2, pVar2);
    }

    public final CheckBoxRowData a(String testTag, boolean isChecked, l<? super Boolean, i0> onCheckedChange, Label label, Label description, Label contentDescription, d clickableTextData, p<? super r, ? super Integer, i0> checkboxCustomContent) {
        return new CheckBoxRowData(testTag, isChecked, onCheckedChange, label, description, contentDescription, clickableTextData, checkboxCustomContent);
    }

    public final p<r, Integer, i0> c() {
        return this.checkboxCustomContent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getClickableTextData() {
        return this.clickableTextData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBoxRowData)) {
            return false;
        }
        CheckBoxRowData checkBoxRowData = (CheckBoxRowData) other;
        return t.c(this.testTag, checkBoxRowData.testTag) && this.isChecked == checkBoxRowData.isChecked && t.c(this.onCheckedChange, checkBoxRowData.onCheckedChange) && t.c(this.label, checkBoxRowData.label) && t.c(this.description, checkBoxRowData.description) && t.c(this.contentDescription, checkBoxRowData.contentDescription) && t.c(this.clickableTextData, checkBoxRowData.clickableTextData) && t.c(this.checkboxCustomContent, checkBoxRowData.checkboxCustomContent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public final l<Boolean, i0> h() {
        return this.onCheckedChange;
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isChecked)) * 31) + this.onCheckedChange.hashCode()) * 31) + this.label.hashCode()) * 31;
        Label label = this.description;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        Label label2 = this.contentDescription;
        int iHashCode3 = (iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31;
        d dVar = this.clickableTextData;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        p<r, Integer, i0> pVar = this.checkboxCustomContent;
        return iHashCode4 + (pVar != null ? pVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public String toString() {
        return "CheckBoxRowData(testTag=" + this.testTag + ", isChecked=" + this.isChecked + ", onCheckedChange=" + this.onCheckedChange + ", label=" + this.label + ", description=" + this.description + ", contentDescription=" + this.contentDescription + ", clickableTextData=" + this.clickableTextData + ", checkboxCustomContent=" + this.checkboxCustomContent + ')';
    }

    public /* synthetic */ CheckBoxRowData(String str, boolean z15, l lVar, Label label, Label label2, Label label3, d dVar, p pVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, z15, lVar, (i15 & 8) != 0 ? Label.INSTANCE.c() : label, (i15 & 16) != 0 ? null : label2, (i15 & 32) != 0 ? null : label3, (i15 & 64) != 0 ? null : dVar, (i15 & 128) != 0 ? null : pVar);
    }
}
