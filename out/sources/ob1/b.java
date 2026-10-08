package ob1;

import fr.t;
import fu.o;
import hz.h;
import hz.i;
import java.util.Locale;
import java.util.regex.Pattern;
import mx.Label;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lob1/b;", "Lgz/b;", "Lob1/b$c;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "f", "(Lob1/b$c;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/i;", "Lhz/h;", "c", "Loq/k;", "e", "()Lhz/h;", "textValidator", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f144215d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f144216e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k textValidator = l.a(new er.a() { // from class: ob1.a
        @Override // er.a
        public final Object a() {
            return b.g(this.f144214a);
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lob1/b$a;", "", "<init>", "()V", "", "MAX_LENGTH", "I", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ob1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lob1/b$b;", "Lhz/a;", "", "firstName", "secondName", "lastName", "Lmx/a;", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Ljava/lang/String;", "b", "d", "Lmx/a;", "()Lmx/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C3576b implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String secondName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String lastName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public C3576b(String str, String str2, String str3, Label label) {
            this.firstName = str;
            this.secondName = str2;
            this.lastName = str3;
            this.errorMessage = label;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getErrorMessage() {
            return this.errorMessage;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(String value) {
            boolean zMatches;
            o.Companion companion = o.INSTANCE;
            String str = this.firstName;
            Locale locale = Locale.ROOT;
            String strC = companion.c(str.toLowerCase(locale));
            String strC2 = companion.c(this.lastName.toLowerCase(locale));
            boolean zMatches2 = Pattern.compile("(^|.*\\s)" + strC + "\\s" + strC2 + "(\\s.*|$)").matcher(value.toLowerCase(locale)).matches();
            String str2 = this.secondName;
            if (str2 != null) {
                zMatches = Pattern.compile("(^|.*\\s)" + strC + "\\s" + companion.c(str2.toLowerCase(locale)) + "\\s" + strC2 + "(\\s.*|$)").matcher(value.toLowerCase(locale)).matches();
            } else {
                zMatches = false;
            }
            return zMatches2 || zMatches;
        }
    }

    /* JADX INFO: renamed from: ob1.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lob1/b$c;", "Lgz/b$a;", "", "fullName", "ownerFirstName", "ownerSecondName", "ownerLastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ownerFirstName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ownerSecondName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ownerLastName;

        public Params(String str, String str2, String str3, String str4) {
            this.fullName = str;
            this.ownerFirstName = str2;
            this.ownerSecondName = str3;
            this.ownerLastName = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOwnerFirstName() {
            return this.ownerFirstName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getOwnerLastName() {
            return this.ownerLastName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getOwnerSecondName() {
            return this.ownerSecondName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fullName, params.fullName) && t.c(this.ownerFirstName, params.ownerFirstName) && t.c(this.ownerSecondName, params.ownerSecondName) && t.c(this.ownerLastName, params.ownerLastName);
        }

        public int hashCode() {
            int iHashCode = ((this.fullName.hashCode() * 31) + this.ownerFirstName.hashCode()) * 31;
            String str = this.ownerSecondName;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.ownerLastName.hashCode();
        }

        public String toString() {
            return "Params(fullName=" + this.fullName + ", ownerFirstName=" + this.ownerFirstName + ", ownerSecondName=" + this.ownerSecondName + ", ownerLastName=" + this.ownerLastName + ')';
        }
    }

    public b(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final h e() {
        return (h) this.textValidator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h g(b bVar) {
        return bVar.validatorTextFactory.a();
    }

    public Object f(Params params, tq.e<? super hz.g> eVar) {
        mx.c cVar = this.labelProvider;
        return ((h) hz.c.INSTANCE.a(e().M(cVar.c(ha1.a.P0)), new C3576b(params.getOwnerFirstName(), params.getOwnerSecondName(), params.getOwnerLastName(), cVar.c(ha1.a.O0)))).y(512, cVar.c(ha1.a.f82487r0)).a(params.getFullName());
    }
}
