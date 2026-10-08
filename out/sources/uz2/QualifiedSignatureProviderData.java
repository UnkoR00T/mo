package uz2;

import android.graphics.Bitmap;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uz2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0010R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001e\u0010$¨\u0006%"}, d2 = {"Luz2/a;", "", "Lmx/a;", "title", "subtitle", "Landroid/graphics/Bitmap;", "icon", "contentDescription", "", "testTag", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;Landroid/graphics/Bitmap;Lmx/a;Ljava/lang/String;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "f", "()Lmx/a;", "b", "d", "c", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "e", "Ljava/lang/String;", "Ler/a;", "()Ler/a;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QualifiedSignatureProviderData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap icon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public QualifiedSignatureProviderData(Label label, Label label2, Bitmap bitmap, Label label3, String str, er.a<i0> aVar) {
        this.title = label;
        this.subtitle = label2;
        this.icon = bitmap;
        this.contentDescription = label3;
        this.testTag = str;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getIcon() {
        return this.icon;
    }

    public final er.a<i0> c() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualifiedSignatureProviderData)) {
            return false;
        }
        QualifiedSignatureProviderData qualifiedSignatureProviderData = (QualifiedSignatureProviderData) other;
        return t.c(this.title, qualifiedSignatureProviderData.title) && t.c(this.subtitle, qualifiedSignatureProviderData.subtitle) && t.c(this.icon, qualifiedSignatureProviderData.icon) && t.c(this.contentDescription, qualifiedSignatureProviderData.contentDescription) && t.c(this.testTag, qualifiedSignatureProviderData.testTag) && t.c(this.onClick, qualifiedSignatureProviderData.onClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.icon.hashCode()) * 31;
        Label label = this.contentDescription;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        String str = this.testTag;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "QualifiedSignatureProviderData(title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", testTag=" + this.testTag + ", onClick=" + this.onClick + ')';
    }
}
