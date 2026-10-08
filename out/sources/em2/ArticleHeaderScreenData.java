package em2;

import android.graphics.Bitmap;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: em2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lem2/a;", "", "Lmx/a;", "categoryName", "Landroid/graphics/Bitmap;", "picture", "formattedPublishDate", "title", "<init>", "(Lmx/a;Landroid/graphics/Bitmap;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "d", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleHeaderScreenData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label categoryName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap picture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label formattedPublishDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    public ArticleHeaderScreenData(Label label, Bitmap bitmap, Label label2, Label label3) {
        this.categoryName = label;
        this.picture = bitmap;
        this.formattedPublishDate = label2;
        this.title = label3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getFormattedPublishDate() {
        return this.formattedPublishDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleHeaderScreenData)) {
            return false;
        }
        ArticleHeaderScreenData articleHeaderScreenData = (ArticleHeaderScreenData) other;
        return t.c(this.categoryName, articleHeaderScreenData.categoryName) && t.c(this.picture, articleHeaderScreenData.picture) && t.c(this.formattedPublishDate, articleHeaderScreenData.formattedPublishDate) && t.c(this.title, articleHeaderScreenData.title);
    }

    public int hashCode() {
        return (((((this.categoryName.hashCode() * 31) + this.picture.hashCode()) * 31) + this.formattedPublishDate.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "ArticleHeaderScreenData(categoryName=" + this.categoryName + ", picture=" + this.picture + ", formattedPublishDate=" + this.formattedPublishDate + ", title=" + this.title + ')';
    }
}
