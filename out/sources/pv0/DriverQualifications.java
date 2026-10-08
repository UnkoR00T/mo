package pv0;

import fr.t;
import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;
import wq.b;

/* JADX INFO: renamed from: pv0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0015\u0019\u0017B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpv0/a;", "", "", "", "reasonsOfChange", "statements", "Lpv0/a$a;", "categories", "Lpv0/a$b;", "document", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpv0/a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "Lpv0/a$b;", "()Lpv0/a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DriverQualifications {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> reasonsOfChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> statements;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Category> categories;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: pv0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpv0/a$a;", "", "", "name", "Lpv0/a$c;", "expireDate", "<init>", "(Ljava/lang/String;Lpv0/a$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lpv0/a$c;", "()Lpv0/a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Category {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c expireDate;

        public Category(String str, c cVar) {
            this.name = str;
            this.expireDate = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getExpireDate() {
            return this.expireDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Category)) {
                return false;
            }
            Category category = (Category) other;
            return t.c(this.name, category.name) && t.c(this.expireDate, category.expireDate);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.expireDate.hashCode();
        }

        public String toString() {
            return "Category(name=" + this.name + ", expireDate=" + this.expireDate + ")";
        }
    }

    /* JADX INFO: renamed from: pv0.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, d2 = {"Lpv0/a$b;", "", "", "registrationAuthority", "seriesAndNumber", "Lpv0/a$b$a;", "state", "Lpv0/a$b$b;", "type", "Lpv0/a$c;", "expireDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpv0/a$b$a;Lpv0/a$b$b;Lpv0/a$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lpv0/a$b$a;", "d", "()Lpv0/a$b$a;", "Lpv0/a$b$b;", "e", "()Lpv0/a$b$b;", "Lpv0/a$c;", "()Lpv0/a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String registrationAuthority;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String seriesAndNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC4022a state;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC4023b type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c expireDate;

        /* JADX INFO: renamed from: pv0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lpv0/a$b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC4022a {
            ISSUED,
            LOST,
            RETAINED,
            INVALIDATED,
            DESTROYED,
            EXPIRED;


            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ wq.a f162854h = b.a(b());
        }

        /* JADX INFO: renamed from: pv0.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpv0/a$b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC4023b {
            DRIVING_LICENCE,
            TEMPORARY_DRIVING_LICENCE,
            TRAM_LICENCE;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ wq.a f162859e = b.a(b());
        }

        public Document(String str, String str2, EnumC4022a enumC4022a, EnumC4023b enumC4023b, c cVar) {
            this.registrationAuthority = str;
            this.seriesAndNumber = str2;
            this.state = enumC4022a;
            this.type = enumC4023b;
            this.expireDate = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getExpireDate() {
            return this.expireDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRegistrationAuthority() {
            return this.registrationAuthority;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSeriesAndNumber() {
            return this.seriesAndNumber;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC4022a getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC4023b getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return t.c(this.registrationAuthority, document.registrationAuthority) && t.c(this.seriesAndNumber, document.seriesAndNumber) && this.state == document.state && this.type == document.type && t.c(this.expireDate, document.expireDate);
        }

        public int hashCode() {
            return (((((((this.registrationAuthority.hashCode() * 31) + this.seriesAndNumber.hashCode()) * 31) + this.state.hashCode()) * 31) + this.type.hashCode()) * 31) + this.expireDate.hashCode();
        }

        public String toString() {
            return "Document(registrationAuthority=" + this.registrationAuthority + ", seriesAndNumber=" + this.seriesAndNumber + ", state=" + this.state + ", type=" + this.type + ", expireDate=" + this.expireDate + ")";
        }
    }

    /* JADX INFO: renamed from: pv0.a$c */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lpv0/a$c;", "", "b", "a", "Lpv0/a$c$a;", "Lpv0/a$c$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: pv0.a$c$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpv0/a$c$a;", "Lpv0/a$c;", "Ljava/time/LocalDate;", "date", "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Finitely implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate date;

            public Finitely(LocalDate localDate) {
                this.date = localDate;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocalDate getDate() {
                return this.date;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Finitely) && t.c(this.date, ((Finitely) other).date);
            }

            public int hashCode() {
                return this.date.hashCode();
            }

            public String toString() {
                return "Finitely(date=" + this.date + ")";
            }
        }

        /* JADX INFO: renamed from: pv0.a$c$b */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpv0/a$c$b;", "Lpv0/a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f162861a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1065024853;
            }

            public String toString() {
                return "Indefinitely";
            }
        }
    }

    public DriverQualifications(List<String> list, List<String> list2, List<Category> list3, Document document) {
        this.reasonsOfChange = list;
        this.statements = list2;
        this.categories = list3;
        this.document = document;
    }

    public final List<Category> a() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    public final List<String> c() {
        return this.reasonsOfChange;
    }

    public final List<String> d() {
        return this.statements;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriverQualifications)) {
            return false;
        }
        DriverQualifications driverQualifications = (DriverQualifications) other;
        return t.c(this.reasonsOfChange, driverQualifications.reasonsOfChange) && t.c(this.statements, driverQualifications.statements) && t.c(this.categories, driverQualifications.categories) && t.c(this.document, driverQualifications.document);
    }

    public int hashCode() {
        return (((((this.reasonsOfChange.hashCode() * 31) + this.statements.hashCode()) * 31) + this.categories.hashCode()) * 31) + this.document.hashCode();
    }

    public String toString() {
        return "DriverQualifications(reasonsOfChange=" + this.reasonsOfChange + ", statements=" + this.statements + ", categories=" + this.categories + ", document=" + this.document + ")";
    }
}
