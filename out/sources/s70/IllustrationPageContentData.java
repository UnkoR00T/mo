package s70;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s70.e, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Ls70/e;", "CONTENT", "", "", "imageResId", "Lmx/a;", "title", "description", "content", "<init>", "(ILmx/a;Lmx/a;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lmx/a;", "d", "()Lmx/a;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IllustrationPageContentData<CONTENT> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f178596e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imageResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CONTENT content;

    public IllustrationPageContentData(int i15, Label label, Label label2, CONTENT content) {
        this.imageResId = i15;
        this.title = label;
        this.description = label2;
        this.content = content;
    }

    public final CONTENT a() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getImageResId() {
        return this.imageResId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IllustrationPageContentData)) {
            return false;
        }
        IllustrationPageContentData illustrationPageContentData = (IllustrationPageContentData) other;
        return this.imageResId == illustrationPageContentData.imageResId && t.c(this.title, illustrationPageContentData.title) && t.c(this.description, illustrationPageContentData.description) && t.c(this.content, illustrationPageContentData.content);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.imageResId) * 31) + this.title.hashCode()) * 31;
        Label label = this.description;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        CONTENT content = this.content;
        return iHashCode2 + (content != null ? content.hashCode() : 0);
    }

    public String toString() {
        return "IllustrationPageContentData(imageResId=" + this.imageResId + ", title=" + this.title + ", description=" + this.description + ", content=" + this.content + ')';
    }
}
