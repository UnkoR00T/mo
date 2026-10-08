package s20;

import fr.k;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000e\bB\u001b\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Ls20/d;", "", "", "iconResId", "Lmx/a;", "contentDescription", "<init>", "(ILmx/a;)V", "a", "I", "b", "()I", "Lmx/a;", "()Lmx/a;", "c", "Ls20/d$a;", "Ls20/d$b;", "Ls20/d$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label contentDescription;

    /* JADX INFO: renamed from: s20.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls20/d$a;", "Ls20/d;", "Lmx/a;", "contentDescription", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmx/a;", "a", "()Lmx/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckMark extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        public CheckMark(Label label) {
            super(jz.a.f106914z4, label, null);
            this.contentDescription = label;
        }

        @Override // s20.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getContentDescription() {
            return this.contentDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckMark) && t.c(this.contentDescription, ((CheckMark) other).contentDescription);
        }

        public int hashCode() {
            return this.contentDescription.hashCode();
        }

        public String toString() {
            return "CheckMark(contentDescription=" + this.contentDescription + ')';
        }
    }

    /* JADX INFO: renamed from: s20.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls20/d$b;", "Ls20/d;", "Lmx/a;", "contentDescription", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmx/a;", "a", "()Lmx/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Notice extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        public Notice(Label label) {
            super(jz.a.f106900x4, label, null);
            this.contentDescription = label;
        }

        @Override // s20.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getContentDescription() {
            return this.contentDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Notice) && t.c(this.contentDescription, ((Notice) other).contentDescription);
        }

        public int hashCode() {
            return this.contentDescription.hashCode();
        }

        public String toString() {
            return "Notice(contentDescription=" + this.contentDescription + ')';
        }
    }

    /* JADX INFO: renamed from: s20.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls20/d$c;", "Ls20/d;", "Lmx/a;", "contentDescription", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmx/a;", "a", "()Lmx/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class XMark extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        public XMark(Label label) {
            super(jz.a.f106907y4, label, null);
            this.contentDescription = label;
        }

        @Override // s20.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getContentDescription() {
            return this.contentDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof XMark) && t.c(this.contentDescription, ((XMark) other).contentDescription);
        }

        public int hashCode() {
            return this.contentDescription.hashCode();
        }

        public String toString() {
            return "XMark(contentDescription=" + this.contentDescription + ')';
        }
    }

    public /* synthetic */ d(int i15, Label label, k kVar) {
        this(i15, label);
    }

    /* JADX INFO: renamed from: a */
    public abstract Label getContentDescription();

    /* JADX INFO: renamed from: b, reason: from getter */
    public int getIconResId() {
        return this.iconResId;
    }

    private d(int i15, Label label) {
        this.iconResId = i15;
        this.contentDescription = label;
    }
}
