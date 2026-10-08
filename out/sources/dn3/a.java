package dn3;

import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Ldn3/a;", "", "Lmx/a;", "getTitle", "()Lmx/a;", "title", "Ldn3/b;", "b", "()Ldn3/b;", "status", "a", AnnotatedPrivateKey.LABEL, "c", "dateLabel", "Ldn3/a$a;", "Ldn3/a$b;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: dn3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Ldn3/a$a;", "Ldn3/a;", "Lmx/a;", "title", "Ldn3/b;", "status", AnnotatedPrivateKey.LABEL, "dateLabel", "<init>", "(Lmx/a;Ldn3/b;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "Ldn3/b;", "()Ldn3/b;", "c", "d", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Insurance implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b status;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label dateLabel;

        public Insurance(Label label, b bVar, Label label2, Label label3) {
            this.title = label;
            this.status = bVar;
            this.label = label2;
            this.dateLabel = label3;
        }

        @Override // dn3.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // dn3.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public b getStatus() {
            return this.status;
        }

        @Override // dn3.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public Label getDateLabel() {
            return this.dateLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insurance)) {
                return false;
            }
            Insurance insurance = (Insurance) other;
            return t.c(this.title, insurance.title) && this.status == insurance.status && t.c(this.label, insurance.label) && t.c(this.dateLabel, insurance.dateLabel);
        }

        @Override // dn3.a
        public Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.status.hashCode()) * 31) + this.label.hashCode()) * 31;
            Label label = this.dateLabel;
            return iHashCode + (label == null ? 0 : label.hashCode());
        }

        public String toString() {
            return "Insurance(title=" + this.title + ", status=" + this.status + ", label=" + this.label + ", dateLabel=" + this.dateLabel + ')';
        }
    }

    /* JADX INFO: renamed from: dn3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Ldn3/a$b;", "Ldn3/a;", "Lmx/a;", "title", "Ldn3/b;", "status", AnnotatedPrivateKey.LABEL, "dateLabel", "<init>", "(Lmx/a;Ldn3/b;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "Ldn3/b;", "()Ldn3/b;", "c", "d", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TechnicalExamination implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b status;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label dateLabel;

        public TechnicalExamination(Label label, b bVar, Label label2, Label label3) {
            this.title = label;
            this.status = bVar;
            this.label = label2;
            this.dateLabel = label3;
        }

        @Override // dn3.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // dn3.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public b getStatus() {
            return this.status;
        }

        @Override // dn3.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public Label getDateLabel() {
            return this.dateLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TechnicalExamination)) {
                return false;
            }
            TechnicalExamination technicalExamination = (TechnicalExamination) other;
            return t.c(this.title, technicalExamination.title) && this.status == technicalExamination.status && t.c(this.label, technicalExamination.label) && t.c(this.dateLabel, technicalExamination.dateLabel);
        }

        @Override // dn3.a
        public Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.status.hashCode()) * 31) + this.label.hashCode()) * 31;
            Label label = this.dateLabel;
            return iHashCode + (label == null ? 0 : label.hashCode());
        }

        public String toString() {
            return "TechnicalExamination(title=" + this.title + ", status=" + this.status + ", label=" + this.label + ", dateLabel=" + this.dateLabel + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    Label getLabel();

    /* JADX INFO: renamed from: b */
    b getStatus();

    /* JADX INFO: renamed from: c */
    Label getDateLabel();

    Label getTitle();
}
