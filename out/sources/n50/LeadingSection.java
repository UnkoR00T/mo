package n50;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: n50.h, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Ln50/h;", "", "", "alignSectionsToTop", "Ln50/d;", "controlSection", "Ln50/i;", "mediaSection", "<init>", "(ZLn50/d;Ln50/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ln50/d;", "()Ln50/d;", "c", "Ln50/i;", "()Ln50/i;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LeadingSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean alignSectionsToTop;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d controlSection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i mediaSection;

    public LeadingSection(boolean z15, d dVar, i iVar) {
        this.alignSectionsToTop = z15;
        this.controlSection = dVar;
        this.mediaSection = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAlignSectionsToTop() {
        return this.alignSectionsToTop;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getControlSection() {
        return this.controlSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getMediaSection() {
        return this.mediaSection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadingSection)) {
            return false;
        }
        LeadingSection leadingSection = (LeadingSection) other;
        return this.alignSectionsToTop == leadingSection.alignSectionsToTop && fr.t.c(this.controlSection, leadingSection.controlSection) && fr.t.c(this.mediaSection, leadingSection.mediaSection);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.alignSectionsToTop) * 31;
        d dVar = this.controlSection;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.mediaSection;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        return "LeadingSection(alignSectionsToTop=" + this.alignSectionsToTop + ", controlSection=" + this.controlSection + ", mediaSection=" + this.mediaSection + ')';
    }

    public /* synthetic */ LeadingSection(boolean z15, d dVar, i iVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? null : dVar, (i15 & 4) != 0 ? null : iVar);
    }
}
