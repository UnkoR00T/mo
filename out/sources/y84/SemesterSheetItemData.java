package y84;

import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y84.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly84/b;", "", "", "semesterId", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Ljava/lang/String;Lmx/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSemesterId", "b", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "()Ler/a;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemesterSheetItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String semesterId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public SemesterSheetItemData(String str, Label label, er.a<i0> aVar) {
        this.semesterId = str;
        this.title = label;
        this.onClick = aVar;
    }

    public final er.a<i0> a() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemesterSheetItemData)) {
            return false;
        }
        SemesterSheetItemData semesterSheetItemData = (SemesterSheetItemData) other;
        return t.c(this.semesterId, semesterSheetItemData.semesterId) && t.c(this.title, semesterSheetItemData.title) && t.c(this.onClick, semesterSheetItemData.onClick);
    }

    public int hashCode() {
        return (((this.semesterId.hashCode() * 31) + this.title.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "SemesterSheetItemData(semesterId=" + this.semesterId + ", title=" + this.title + ", onClick=" + this.onClick + ')';
    }
}
