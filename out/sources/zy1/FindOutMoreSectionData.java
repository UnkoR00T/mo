package zy1;

import fr.t;
import j30.ButtonTextData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zy1.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzy1/d;", "", "Lmx/a;", "title", "description", "Lj30/a;", "buttonTextData", "<init>", "(Lmx/a;Lmx/a;Lj30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lj30/a;", "()Lj30/a;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FindOutMoreSectionData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f238512d = ButtonTextData.f99099f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonTextData buttonTextData;

    public FindOutMoreSectionData(Label label, Label label2, ButtonTextData buttonTextData) {
        this.title = label;
        this.description = label2;
        this.buttonTextData = buttonTextData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonTextData getButtonTextData() {
        return this.buttonTextData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FindOutMoreSectionData)) {
            return false;
        }
        FindOutMoreSectionData findOutMoreSectionData = (FindOutMoreSectionData) other;
        return t.c(this.title, findOutMoreSectionData.title) && t.c(this.description, findOutMoreSectionData.description) && t.c(this.buttonTextData, findOutMoreSectionData.buttonTextData);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.buttonTextData.hashCode();
    }

    public String toString() {
        return "FindOutMoreSectionData(title=" + this.title + ", description=" + this.description + ", buttonTextData=" + this.buttonTextData + ')';
    }
}
