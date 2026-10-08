package n50;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: n50.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Ln50/a;", "", "Ln50/i0;", "info", "Ln50/b;", "title", "description", "<init>", "(Ln50/i0;Ln50/b;Ln50/i0;)V", "a", "(Ln50/i0;Ln50/b;Ln50/i0;)Ln50/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln50/i0;", "d", "()Ln50/i0;", "b", "Ln50/b;", "e", "()Ln50/b;", "c", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BodySection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SingleCardLabel info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SingleCardLabel description;

    public BodySection(SingleCardLabel singleCardLabel, b bVar, SingleCardLabel singleCardLabel2) {
        this.info = singleCardLabel;
        this.title = bVar;
        this.description = singleCardLabel2;
    }

    public static /* synthetic */ BodySection b(BodySection bodySection, SingleCardLabel singleCardLabel, b bVar, SingleCardLabel singleCardLabel2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            singleCardLabel = bodySection.info;
        }
        if ((i15 & 2) != 0) {
            bVar = bodySection.title;
        }
        if ((i15 & 4) != 0) {
            singleCardLabel2 = bodySection.description;
        }
        return bodySection.a(singleCardLabel, bVar, singleCardLabel2);
    }

    public final BodySection a(SingleCardLabel info, b title, SingleCardLabel description) {
        return new BodySection(info, title, description);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SingleCardLabel getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SingleCardLabel getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodySection)) {
            return false;
        }
        BodySection bodySection = (BodySection) other;
        return fr.t.c(this.info, bodySection.info) && fr.t.c(this.title, bodySection.title) && fr.t.c(this.description, bodySection.description);
    }

    public int hashCode() {
        SingleCardLabel singleCardLabel = this.info;
        int iHashCode = (((singleCardLabel == null ? 0 : singleCardLabel.hashCode()) * 31) + this.title.hashCode()) * 31;
        SingleCardLabel singleCardLabel2 = this.description;
        return iHashCode + (singleCardLabel2 != null ? singleCardLabel2.hashCode() : 0);
    }

    public String toString() {
        return "BodySection(info=" + this.info + ", title=" + this.title + ", description=" + this.description + ')';
    }

    public /* synthetic */ BodySection(SingleCardLabel singleCardLabel, b bVar, SingleCardLabel singleCardLabel2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : singleCardLabel, bVar, (i15 & 4) != 0 ? null : singleCardLabel2);
    }
}
