package k30;

import fr.k;
import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lk30/c;", "", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "b", "a", "Lk30/c$a;", "Lk30/c$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    Label getContentDescription();

    /* JADX INFO: renamed from: k30.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk30/c$a;", "Lk30/c;", "", "iconResId", "Lmx/a;", "contentDescription", "<init>", "(ILmx/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx/a;", "getContentDescription", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithIcon implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        public WithIcon(int i15, Label label) {
            this.iconResId = i15;
            this.contentDescription = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithIcon)) {
                return false;
            }
            WithIcon withIcon = (WithIcon) other;
            return this.iconResId == withIcon.iconResId && t.c(this.contentDescription, withIcon.contentDescription);
        }

        @Override // k30.c
        public Label getContentDescription() {
            return this.contentDescription;
        }

        public int hashCode() {
            return (Integer.hashCode(this.iconResId) * 31) + this.contentDescription.hashCode();
        }

        public String toString() {
            return "WithIcon(iconResId=" + this.iconResId + ", contentDescription=" + this.contentDescription + ')';
        }

        public /* synthetic */ WithIcon(int i15, Label label, int i16, k kVar) {
            this(i15, (i16 & 2) != 0 ? Label.INSTANCE.c() : label);
        }
    }

    /* JADX INFO: renamed from: k30.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lk30/c$b;", "Lk30/c;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "contentDescription", "<init>", "(Lmx/a;Lmx/a;)V", "a", "(Lmx/a;Lmx/a;)Lk30/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "c", "()Lmx/a;", "b", "getContentDescription", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithText implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        public WithText(Label label, Label label2) {
            this.label = label;
            this.contentDescription = label2;
        }

        public static /* synthetic */ WithText b(WithText withText, Label label, Label label2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                label = withText.label;
            }
            if ((i15 & 2) != 0) {
                label2 = withText.contentDescription;
            }
            return withText.a(label, label2);
        }

        public final WithText a(Label label, Label contentDescription) {
            return new WithText(label, contentDescription);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithText)) {
                return false;
            }
            WithText withText = (WithText) other;
            return t.c(this.label, withText.label) && t.c(this.contentDescription, withText.contentDescription);
        }

        @Override // k30.c
        public Label getContentDescription() {
            return this.contentDescription;
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.contentDescription.hashCode();
        }

        public String toString() {
            return "WithText(label=" + this.label + ", contentDescription=" + this.contentDescription + ')';
        }

        public /* synthetic */ WithText(Label label, Label label2, int i15, k kVar) {
            this(label, (i15 & 2) != 0 ? Label.INSTANCE.c() : label2);
        }
    }
}
