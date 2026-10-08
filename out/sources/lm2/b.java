package lm2;

import fr.k;
import fr.t;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.i;
import n50.l;
import p071kotlin.Metadata;
import r40.ImageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\r8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Llm2/b;", "", "Lmx/a;", "title", "description", "<init>", "(Lmx/a;Lmx/a;)V", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "getDescription", "Ln50/g;", "()Ln50/g;", "cardData", "Llm2/b$a;", "Llm2/b$b;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label description;

    /* JADX INFO: renamed from: lm2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Llm2/b$a;", "Llm2/b;", "Lmx/a;", "title", "description", "Lr40/a;", "leadingImageData", "<init>", "(Lmx/a;Lmx/a;Lr40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmx/a;", "()Lmx/a;", "d", "b", "e", "Lr40/a;", "getLeadingImageData", "()Lr40/a;", "Ln50/g;", "f", "Ln50/g;", "a", "()Ln50/g;", "cardData", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image extends b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f118848g = ImageData.f171563f;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageData leadingImageData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DefaultSingleCardData cardData;

        public Image(Label label, Label label2, ImageData imageData) {
            super(label, label2, null);
            this.title = label;
            this.description = label2;
            this.leadingImageData = imageData;
            this.cardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(getTitle(), null, null, 3, null)), l.b(getDescription(), null, null, 3, null), 1, null), new LeadingSection(false, null, new i.Image(imageData.getImage(), null, null, 6, null), 3, null), null, null, 3327, null);
        }

        @Override // lm2.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public DefaultSingleCardData getCardData() {
            return this.cardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return t.c(this.title, image.title) && t.c(this.description, image.description) && t.c(this.leadingImageData, image.leadingImageData);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.leadingImageData.hashCode();
        }

        public String toString() {
            return "Image(title=" + this.title + ", description=" + this.description + ", leadingImageData=" + this.leadingImageData + ')';
        }
    }

    /* JADX INFO: renamed from: lm2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u00178\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Llm2/b$b;", "Llm2/b;", "Lmx/a;", "title", "description", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmx/a;", "()Lmx/a;", "d", "b", "Ln50/g;", "e", "Ln50/g;", "a", "()Ln50/g;", "cardData", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final DefaultSingleCardData cardData;

        public Regular(Label label, Label label2) {
            super(label, label2, null);
            this.title = label;
            this.description = label2;
            this.cardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(getTitle(), null, null, 3, null)), l.b(getDescription(), null, null, 3, null), 1, null), new LeadingSection(false, null, new i.Icon(jz.a.M0, null, null, d40.i.g.f39710e, null, 22, null), 3, null), null, null, 3327, null);
        }

        @Override // lm2.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public DefaultSingleCardData getCardData() {
            return this.cardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) other;
            return t.c(this.title, regular.title) && t.c(this.description, regular.description);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.description.hashCode();
        }

        public String toString() {
            return "Regular(title=" + this.title + ", description=" + this.description + ')';
        }
    }

    public /* synthetic */ b(Label label, Label label2, k kVar) {
        this(label, label2);
    }

    /* JADX INFO: renamed from: a */
    public abstract DefaultSingleCardData getCardData();

    private b(Label label, Label label2) {
        this.title = label;
        this.description = label2;
    }
}
