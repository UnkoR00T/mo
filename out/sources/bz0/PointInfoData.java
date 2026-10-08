package bz0;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bz0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lbz0/a;", "", "Ld40/b;", "iconData", "Lmx/a;", "titleLabel", "descriptionLabel", "secondaryDescriptionLabel", "<init>", "(Ld40/b;Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld40/b;", "b", "()Ld40/b;", "Lmx/a;", "d", "()Lmx/a;", "c", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PointInfoData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22022e = d40.b.f39676g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d40.b iconData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label titleLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label descriptionLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label secondaryDescriptionLabel;

    public PointInfoData(d40.b bVar, Label label, Label label2, Label label3) {
        this.iconData = bVar;
        this.titleLabel = label;
        this.descriptionLabel = label2;
        this.secondaryDescriptionLabel = label3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescriptionLabel() {
        return this.descriptionLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d40.b getIconData() {
        return this.iconData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getSecondaryDescriptionLabel() {
        return this.secondaryDescriptionLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitleLabel() {
        return this.titleLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointInfoData)) {
            return false;
        }
        PointInfoData pointInfoData = (PointInfoData) other;
        return t.c(this.iconData, pointInfoData.iconData) && t.c(this.titleLabel, pointInfoData.titleLabel) && t.c(this.descriptionLabel, pointInfoData.descriptionLabel) && t.c(this.secondaryDescriptionLabel, pointInfoData.secondaryDescriptionLabel);
    }

    public int hashCode() {
        return (((((this.iconData.hashCode() * 31) + this.titleLabel.hashCode()) * 31) + this.descriptionLabel.hashCode()) * 31) + this.secondaryDescriptionLabel.hashCode();
    }

    public String toString() {
        return "PointInfoData(iconData=" + this.iconData + ", titleLabel=" + this.titleLabel + ", descriptionLabel=" + this.descriptionLabel + ", secondaryDescriptionLabel=" + this.secondaryDescriptionLabel + ')';
    }
}
