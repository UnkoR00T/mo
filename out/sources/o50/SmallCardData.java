package o50;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o50.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b\u001c\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, d2 = {"Lo50/a;", "", "", "testTag", "Lmx/a;", "title", "contentDescription", "", "iconResId", "Lo50/f;", "smallCardState", "", "hasBorder", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;ILo50/f;ZLer/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "d", "I", "e", "Lo50/f;", "()Lo50/f;", "Z", "()Z", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SmallCardData {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f142457h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final f smallCardState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasBorder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public SmallCardData(String str, Label label, Label label2, int i15, f fVar, boolean z15, er.a<i0> aVar) {
        this.testTag = str;
        this.title = label;
        this.contentDescription = label2;
        this.iconResId = i15;
        this.smallCardState = fVar;
        this.hasBorder = z15;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasBorder() {
        return this.hasBorder;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    public final er.a<i0> d() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getSmallCardState() {
        return this.smallCardState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmallCardData)) {
            return false;
        }
        SmallCardData smallCardData = (SmallCardData) other;
        return t.c(this.testTag, smallCardData.testTag) && t.c(this.title, smallCardData.title) && t.c(this.contentDescription, smallCardData.contentDescription) && this.iconResId == smallCardData.iconResId && t.c(this.smallCardState, smallCardData.smallCardState) && this.hasBorder == smallCardData.hasBorder && t.c(this.onClick, smallCardData.onClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31;
        Label label = this.contentDescription;
        return ((((((((iHashCode + (label != null ? label.hashCode() : 0)) * 31) + Integer.hashCode(this.iconResId)) * 31) + this.smallCardState.hashCode()) * 31) + Boolean.hashCode(this.hasBorder)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "SmallCardData(testTag=" + this.testTag + ", title=" + this.title + ", contentDescription=" + this.contentDescription + ", iconResId=" + this.iconResId + ", smallCardState=" + this.smallCardState + ", hasBorder=" + this.hasBorder + ", onClick=" + this.onClick + ')';
    }

    public /* synthetic */ SmallCardData(String str, Label label, Label label2, int i15, f fVar, boolean z15, er.a aVar, int i16, k kVar) {
        this((i16 & 1) != 0 ? null : str, label, (i16 & 4) != 0 ? null : label2, i15, fVar, (i16 & 32) != 0 ? false : z15, aVar);
    }
}
