package pa3;

import fr.t;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpa3/i;", "Lxw/f;", "Lpa3/i$a;", "Ln50/g;", "<init>", "()V", "params", "c", "(Lpa3/i$a;)Ln50/g;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, DefaultSingleCardData> {
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DefaultSingleCardData b(Params params) {
        Params.TopInfoLabel topInfo = params.getTopInfo();
        SingleCardLabel singleCardLabel = topInfo != null ? new SingleCardLabel(topInfo.getLabel(), topInfo.getAccessibilityLabel(), null, 0, 0, null, 60, null) : null;
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(params.getTitle(), null, null, 0, 0, params.getTitleAccessibilityReadMode(), 30, null));
        Label description = params.getDescription();
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, title, description != null ? new SingleCardLabel(description, params.getDescriptionContentDescription(), null, 0, 0, null, 60, null) : null), null, null, null, 3839, null);
    }

    /* JADX INFO: renamed from: pa3.i$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Lpa3/i$a;", "", "Lpa3/i$a$a;", "topInfo", "Lmx/a;", "title", "Lj70/a;", "titleAccessibilityReadMode", "description", "descriptionContentDescription", "<init>", "(Lpa3/i$a$a;Lmx/a;Lj70/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpa3/i$a$a;", "e", "()Lpa3/i$a$a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Lj70/a;", "d", "()Lj70/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TopInfoLabel topInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a titleAccessibilityReadMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label descriptionContentDescription;

        public Params(TopInfoLabel topInfoLabel, Label label, j70.a aVar, Label label2, Label label3) {
            this.topInfo = topInfoLabel;
            this.title = label;
            this.titleAccessibilityReadMode = aVar;
            this.description = label2;
            this.descriptionContentDescription = label3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getDescriptionContentDescription() {
            return this.descriptionContentDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final j70.a getTitleAccessibilityReadMode() {
            return this.titleAccessibilityReadMode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TopInfoLabel getTopInfo() {
            return this.topInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.topInfo, params.topInfo) && t.c(this.title, params.title) && this.titleAccessibilityReadMode == params.titleAccessibilityReadMode && t.c(this.description, params.description) && t.c(this.descriptionContentDescription, params.descriptionContentDescription);
        }

        public int hashCode() {
            TopInfoLabel topInfoLabel = this.topInfo;
            int iHashCode = (((((topInfoLabel == null ? 0 : topInfoLabel.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleAccessibilityReadMode.hashCode()) * 31;
            Label label = this.description;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            Label label2 = this.descriptionContentDescription;
            return iHashCode2 + (label2 != null ? label2.hashCode() : 0);
        }

        public String toString() {
            return "Params(topInfo=" + this.topInfo + ", title=" + this.title + ", titleAccessibilityReadMode=" + this.titleAccessibilityReadMode + ", description=" + this.description + ", descriptionContentDescription=" + this.descriptionContentDescription + ')';
        }

        /* JADX INFO: renamed from: pa3.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpa3/i$a$a;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "accessibilityLabel", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TopInfoLabel {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label label;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label accessibilityLabel;

            public TopInfoLabel(Label label, Label label2) {
                this.label = label;
                this.accessibilityLabel = label2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getAccessibilityLabel() {
                return this.accessibilityLabel;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getLabel() {
                return this.label;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TopInfoLabel)) {
                    return false;
                }
                TopInfoLabel topInfoLabel = (TopInfoLabel) other;
                return t.c(this.label, topInfoLabel.label) && t.c(this.accessibilityLabel, topInfoLabel.accessibilityLabel);
            }

            public int hashCode() {
                int iHashCode = this.label.hashCode() * 31;
                Label label = this.accessibilityLabel;
                return iHashCode + (label == null ? 0 : label.hashCode());
            }

            public String toString() {
                return "TopInfoLabel(label=" + this.label + ", accessibilityLabel=" + this.accessibilityLabel + ')';
            }

            public /* synthetic */ TopInfoLabel(Label label, Label label2, int i15, fr.k kVar) {
                this(label, (i15 & 2) != 0 ? null : label2);
            }
        }

        public /* synthetic */ Params(TopInfoLabel topInfoLabel, Label label, j70.a aVar, Label label2, Label label3, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : topInfoLabel, label, (i15 & 4) != 0 ? j70.a.LOWER_CASE : aVar, (i15 & 8) != 0 ? null : label2, (i15 & 16) != 0 ? null : label3);
        }
    }
}
