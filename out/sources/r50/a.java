package r50;

import fr.k;
import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u0013B9\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, d2 = {"Lr50/a;", "", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "", "withBorder", "contentDescription", "", "maxLines", "<init>", "(Ljava/lang/String;Lmx/a;ZLmx/a;I)V", "addStatusPrefix", "a", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Lmx/a;", "c", "()Lmx/a;", "Z", "f", "()Z", "d", "I", "()I", "Lr50/a$a;", "Lr50/a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f171863f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean withBorder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Label contentDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    public /* synthetic */ a(String str, Label label, boolean z15, Label label2, int i15, k kVar) {
        this(str, label, z15, label2, i15);
    }

    public final String a(boolean addStatusPrefix) {
        StringBuilder sb5 = new StringBuilder();
        if (addStatusPrefix) {
            sb5.append(c70.a.f23835a.a().Q0().getText());
            sb5.append(Label.INSTANCE.d().getText());
        }
        Label contentDescription = getContentDescription();
        if (contentDescription == null) {
            contentDescription = getLabel();
        }
        sb5.append(contentDescription.getText());
        return sb5.toString();
    }

    /* JADX INFO: renamed from: b */
    public abstract Label getContentDescription();

    /* JADX INFO: renamed from: c */
    public abstract Label getLabel();

    /* JADX INFO: renamed from: d */
    public abstract int getMaxLines();

    /* JADX INFO: renamed from: e */
    public abstract String getTestTag();

    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getWithBorder() {
        return this.withBorder;
    }

    private a(String str, Label label, boolean z15, Label label2, int i15) {
        this.testTag = str;
        this.label = label;
        this.withBorder = z15;
        this.contentDescription = label2;
        this.maxLines = i15;
    }

    /* JADX INFO: renamed from: r50.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010$¨\u0006%"}, d2 = {"Lr50/a$a;", "Lr50/a;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "contentDescription", "", "maxLines", "Lr50/f;", "status", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;ILr50/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "e", "h", "Lmx/a;", "c", "()Lmx/a;", "i", "b", "j", "I", "d", "k", "Lr50/f;", "()Lr50/f;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithDot extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f171869l = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxLines;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        public WithDot(String str, Label label, Label label2, int i15, f fVar) {
            super(str, label, false, null, i15, 8, null);
            this.testTag = str;
            this.label = label;
            this.contentDescription = label2;
            this.maxLines = i15;
            this.status = fVar;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public Label getContentDescription() {
            return this.contentDescription;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: d, reason: from getter */
        public int getMaxLines() {
            return this.maxLines;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithDot)) {
                return false;
            }
            WithDot withDot = (WithDot) other;
            return t.c(this.testTag, withDot.testTag) && t.c(this.label, withDot.label) && t.c(this.contentDescription, withDot.contentDescription) && this.maxLines == withDot.maxLines && this.status == withDot.status;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final f getStatus() {
            return this.status;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.label.hashCode()) * 31;
            Label label = this.contentDescription;
            return ((((iHashCode + (label != null ? label.hashCode() : 0)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.status.hashCode();
        }

        public String toString() {
            return "WithDot(testTag=" + this.testTag + ", label=" + this.label + ", contentDescription=" + this.contentDescription + ", maxLines=" + this.maxLines + ", status=" + this.status + ')';
        }

        public /* synthetic */ WithDot(String str, Label label, Label label2, int i15, f fVar, int i16, k kVar) {
            this((i16 & 1) != 0 ? null : str, label, (i16 & 4) != 0 ? null : label2, (i16 & 8) != 0 ? Integer.MAX_VALUE : i15, fVar);
        }
    }

    /* JADX INFO: renamed from: r50.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0017\u0010)¨\u0006*"}, d2 = {"Lr50/a$b;", "Lr50/a;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "contentDescription", "", "maxLines", "", "withBorder", "Lr50/g;", "status", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;IZLr50/g;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "e", "h", "Lmx/a;", "c", "()Lmx/a;", "i", "b", "j", "I", "d", "k", "Z", "f", "()Z", "l", "Lr50/g;", "()Lr50/g;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithIcon extends a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f171875m = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxLines;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean withBorder;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final g status;

        public WithIcon(String str, Label label, Label label2, int i15, boolean z15, g gVar) {
            super(str, label, z15, null, i15, 8, null);
            this.testTag = str;
            this.label = label;
            this.contentDescription = label2;
            this.maxLines = i15;
            this.withBorder = z15;
            this.status = gVar;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public Label getContentDescription() {
            return this.contentDescription;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: d, reason: from getter */
        public int getMaxLines() {
            return this.maxLines;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithIcon)) {
                return false;
            }
            WithIcon withIcon = (WithIcon) other;
            return t.c(this.testTag, withIcon.testTag) && t.c(this.label, withIcon.label) && t.c(this.contentDescription, withIcon.contentDescription) && this.maxLines == withIcon.maxLines && this.withBorder == withIcon.withBorder && this.status == withIcon.status;
        }

        @Override // r50.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getWithBorder() {
            return this.withBorder;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final g getStatus() {
            return this.status;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.label.hashCode()) * 31;
            Label label = this.contentDescription;
            return ((((((iHashCode + (label != null ? label.hashCode() : 0)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Boolean.hashCode(this.withBorder)) * 31) + this.status.hashCode();
        }

        public String toString() {
            return "WithIcon(testTag=" + this.testTag + ", label=" + this.label + ", contentDescription=" + this.contentDescription + ", maxLines=" + this.maxLines + ", withBorder=" + this.withBorder + ", status=" + this.status + ')';
        }

        public /* synthetic */ WithIcon(String str, Label label, Label label2, int i15, boolean z15, g gVar, int i16, k kVar) {
            this((i16 & 1) != 0 ? null : str, label, (i16 & 4) != 0 ? null : label2, (i16 & 8) != 0 ? Integer.MAX_VALUE : i15, (i16 & 16) != 0 ? true : z15, gVar);
        }
    }

    public /* synthetic */ a(String str, Label label, boolean z15, Label label2, int i15, int i16, k kVar) {
        this(str, label, (i16 & 4) != 0 ? false : z15, (i16 & 8) != 0 ? null : label2, i15, null);
    }
}
