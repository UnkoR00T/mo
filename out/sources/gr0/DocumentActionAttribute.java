package gr0;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gr0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgr0/d;", "", "Lgr0/d$a;", "actionType", "", "Lgr0/n;", AnnotatedPrivateKey.LABEL, "<init>", "(Lgr0/d$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgr0/d$a;", "()Lgr0/d$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentActionAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a actionType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> label;

    /* JADX INFO: renamed from: gr0.d$a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0003\u0003\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lgr0/d$a;", "", "", "b", "()Ljava/lang/String;", "backendValue", "U", "c", "a", "Lgr0/d$a$b;", "Lgr0/d$a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: U, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.f76259a;

        /* JADX INFO: renamed from: gr0.d$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgr0/d$a$a;", "", "<init>", "()V", "", "actionType", "Lgr0/d$a;", "a", "(Ljava/lang/String;)Lgr0/d$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f76259a = new Companion();

            private Companion() {
            }

            public final a a(String actionType) {
                b next;
                Iterator<b> it = b.g().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fr.t.c(next.getBackendValue(), actionType));
                b bVar = next;
                return bVar != null ? bVar : new Unknown(actionType);
            }
        }

        /* JADX INFO: renamed from: gr0.d$a$b */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lgr0/d$a$b;", "Lgr0/d$a;", "", "", "backendValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum b implements a {
            ELECTRONIC_DIPLOMA_GRADUATION_PDF_LIST("electronic_diploma_graduation_pdf_list"),
            ELECTRONIC_DIPLOMA_PHD_PDF_LIST("electronic_diploma_phd_pdf_list"),
            ELECTRONIC_DIPLOMA_DSC_PDF_LIST("electronic_diploma_dsc_pdf_list");


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ wq.a f76264f = wq.b.a(e());

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String backendValue;

            b(String str) {
                this.backendValue = str;
            }

            public static wq.a<b> g() {
                return f76264f;
            }

            @Override // gr0.DocumentActionAttribute.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getBackendValue() {
                return this.backendValue;
            }
        }

        /* JADX INFO: renamed from: gr0.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lgr0/d$a$c;", "Lgr0/d$a;", "", "backendValue", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unknown implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String backendValue;

            public Unknown(String str) {
                this.backendValue = str;
            }

            @Override // gr0.DocumentActionAttribute.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getBackendValue() {
                return this.backendValue;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && fr.t.c(this.backendValue, ((Unknown) other).backendValue);
            }

            public int hashCode() {
                return this.backendValue.hashCode();
            }

            public String toString() {
                return "Unknown(backendValue=" + this.backendValue + ")";
            }
        }

        /* JADX INFO: renamed from: b */
        String getBackendValue();
    }

    public DocumentActionAttribute(a aVar, List<DocumentSchemaLabel> list) {
        this.actionType = aVar;
        this.label = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getActionType() {
        return this.actionType;
    }

    public final List<DocumentSchemaLabel> b() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentActionAttribute)) {
            return false;
        }
        DocumentActionAttribute documentActionAttribute = (DocumentActionAttribute) other;
        return fr.t.c(this.actionType, documentActionAttribute.actionType) && fr.t.c(this.label, documentActionAttribute.label);
    }

    public int hashCode() {
        return (this.actionType.hashCode() * 31) + this.label.hashCode();
    }

    public String toString() {
        return "DocumentActionAttribute(actionType=" + this.actionType + ", label=" + this.label + ")";
    }
}
