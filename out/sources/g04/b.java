package g04;

import fr.t;
import iy.a0;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lg04/b;", "Lgz/b;", "Lg04/b$b;", "Le04/a;", "b", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b<AbstractC1552b, e04.a> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lg04/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        LOGIN,
        CHECK;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f69202d = wq.b.a(b());
    }

    /* JADX INFO: renamed from: g04.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\nB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\n\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lg04/b$b;", "Lgz/b$a;", "Lg04/b$a;", "reason", "Lmx/a;", "title", "subtitle", "description", "<init>", "(Lg04/b$a;Lmx/a;Lmx/a;Lmx/a;)V", "a", "Lg04/b$a;", "b", "()Lg04/b$a;", "Lmx/a;", "d", "()Lmx/a;", "c", "Lg04/b$b$a;", "Lg04/b$b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC1552b implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a reason;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Label subtitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Label description;

        public /* synthetic */ AbstractC1552b(a aVar, Label label, Label label2, Label label3, fr.k kVar) {
            this(aVar, label, label2, label3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public a getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public Label getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getTitle() {
            return this.title;
        }

        private AbstractC1552b(a aVar, Label label, Label label2, Label label3) {
            this.reason = aVar;
            this.title = label;
            this.subtitle = label2;
            this.description = label3;
        }

        /* JADX INFO: renamed from: g04.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lg04/b$b$a;", "Lg04/b$b;", "Liy/a0;", "data", "Lg04/b$a;", "reason", "Lmx/a;", "title", "subtitle", "description", "<init>", "(Liy/a0;Lg04/b$a;Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Liy/a0;", "f", "()Liy/a0;", "Lg04/b$a;", "b", "()Lg04/b$a;", "g", "Lmx/a;", "d", "()Lmx/a;", "h", "c", "j", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Decrypt extends AbstractC1552b {

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final a0 data;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final a reason;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            public Decrypt(a0 a0Var, a aVar, Label label, Label label2, Label label3) {
                super(aVar, label, label2, label3, null);
                this.data = a0Var;
                this.reason = aVar;
                this.title = label;
                this.subtitle = label2;
                this.description = label3;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: a, reason: from getter */
            public Label getDescription() {
                return this.description;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: b, reason: from getter */
            public a getReason() {
                return this.reason;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Label getSubtitle() {
                return this.subtitle;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: d, reason: from getter */
            public Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Decrypt)) {
                    return false;
                }
                Decrypt decrypt = (Decrypt) other;
                return t.c(this.data, decrypt.data) && this.reason == decrypt.reason && t.c(this.title, decrypt.title) && t.c(this.subtitle, decrypt.subtitle) && t.c(this.description, decrypt.description);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final a0 getData() {
                return this.data;
            }

            public int hashCode() {
                return (((((((this.data.hashCode() * 31) + this.reason.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "Decrypt(data=" + this.data + ", reason=" + this.reason + ", title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ")";
            }

            public /* synthetic */ Decrypt(a0 a0Var, a aVar, Label label, Label label2, Label label3, int i15, fr.k kVar) {
                this(a0Var, aVar, (i15 & 4) != 0 ? Label.INSTANCE.c() : label, (i15 & 8) != 0 ? Label.INSTANCE.c() : label2, (i15 & 16) != 0 ? Label.INSTANCE.c() : label3);
            }
        }

        /* JADX INFO: renamed from: g04.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lg04/b$b$b;", "Lg04/b$b;", "Liy/a0;", "data", "Lg04/b$a;", "reason", "Lmx/a;", "title", "subtitle", "description", "<init>", "(Liy/a0;Lg04/b$a;Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Liy/a0;", "f", "()Liy/a0;", "Lg04/b$a;", "b", "()Lg04/b$a;", "g", "Lmx/a;", "d", "()Lmx/a;", "h", "c", "j", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Encrypt extends AbstractC1552b {

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final a0 data;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final a reason;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            public Encrypt(a0 a0Var, a aVar, Label label, Label label2, Label label3) {
                super(aVar, label, label2, label3, null);
                this.data = a0Var;
                this.reason = aVar;
                this.title = label;
                this.subtitle = label2;
                this.description = label3;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: a, reason: from getter */
            public Label getDescription() {
                return this.description;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: b, reason: from getter */
            public a getReason() {
                return this.reason;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Label getSubtitle() {
                return this.subtitle;
            }

            @Override // g04.b.AbstractC1552b
            /* JADX INFO: renamed from: d, reason: from getter */
            public Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Encrypt)) {
                    return false;
                }
                Encrypt encrypt = (Encrypt) other;
                return t.c(this.data, encrypt.data) && this.reason == encrypt.reason && t.c(this.title, encrypt.title) && t.c(this.subtitle, encrypt.subtitle) && t.c(this.description, encrypt.description);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final a0 getData() {
                return this.data;
            }

            public int hashCode() {
                return (((((((this.data.hashCode() * 31) + this.reason.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "Encrypt(data=" + this.data + ", reason=" + this.reason + ", title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ")";
            }

            public /* synthetic */ Encrypt(a0 a0Var, a aVar, Label label, Label label2, Label label3, int i15, fr.k kVar) {
                this(a0Var, aVar, (i15 & 4) != 0 ? Label.INSTANCE.c() : label, (i15 & 8) != 0 ? Label.INSTANCE.c() : label2, (i15 & 16) != 0 ? Label.INSTANCE.c() : label3);
            }
        }
    }
}
