package q40;

import fr.k;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q40.g, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BM\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0019\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, d2 = {"Lq40/g;", "CONTENT", "BOTTOM_CONTENT", "", "Lq40/j;", "iconSection", "Lmx/a;", "title", "descriptionFirst", "descriptionSecond", "content", "bottomContent", "", "forceTitleFocus", "<init>", "(Lq40/j;Lmx/a;Lmx/a;Lmx/a;Ljava/lang/Object;Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lq40/j;", "f", "()Lq40/j;", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "d", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Z", "()Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IconPageData<CONTENT, BOTTOM_CONTENT> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f164667h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final j iconSection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label descriptionFirst;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label descriptionSecond;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CONTENT content;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BOTTOM_CONTENT bottomContent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean forceTitleFocus;

    public IconPageData(j jVar, Label label, Label label2, Label label3, CONTENT content, BOTTOM_CONTENT bottom_content, boolean z15) {
        this.iconSection = jVar;
        this.title = label;
        this.descriptionFirst = label2;
        this.descriptionSecond = label3;
        this.content = content;
        this.bottomContent = bottom_content;
        this.forceTitleFocus = z15;
    }

    public final BOTTOM_CONTENT a() {
        return this.bottomContent;
    }

    public final CONTENT b() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getDescriptionFirst() {
        return this.descriptionFirst;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getDescriptionSecond() {
        return this.descriptionSecond;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getForceTitleFocus() {
        return this.forceTitleFocus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconPageData)) {
            return false;
        }
        IconPageData iconPageData = (IconPageData) other;
        return t.c(this.iconSection, iconPageData.iconSection) && t.c(this.title, iconPageData.title) && t.c(this.descriptionFirst, iconPageData.descriptionFirst) && t.c(this.descriptionSecond, iconPageData.descriptionSecond) && t.c(this.content, iconPageData.content) && t.c(this.bottomContent, iconPageData.bottomContent) && this.forceTitleFocus == iconPageData.forceTitleFocus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j getIconSection() {
        return this.iconSection;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((this.iconSection.hashCode() * 31) + this.title.hashCode()) * 31;
        Label label = this.descriptionFirst;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        Label label2 = this.descriptionSecond;
        int iHashCode3 = (iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31;
        CONTENT content = this.content;
        int iHashCode4 = (iHashCode3 + (content == null ? 0 : content.hashCode())) * 31;
        BOTTOM_CONTENT bottom_content = this.bottomContent;
        return ((iHashCode4 + (bottom_content != null ? bottom_content.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceTitleFocus);
    }

    public String toString() {
        return "IconPageData(iconSection=" + this.iconSection + ", title=" + this.title + ", descriptionFirst=" + this.descriptionFirst + ", descriptionSecond=" + this.descriptionSecond + ", content=" + this.content + ", bottomContent=" + this.bottomContent + ", forceTitleFocus=" + this.forceTitleFocus + ')';
    }

    public /* synthetic */ IconPageData(j jVar, Label label, Label label2, Label label3, Object obj, Object obj2, boolean z15, int i15, k kVar) {
        this(jVar, label, (i15 & 4) != 0 ? null : label2, (i15 & 8) != 0 ? null : label3, obj, obj2, (i15 & 64) != 0 ? false : z15);
    }
}
