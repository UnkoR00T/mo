package nr3;

import fr.t;
import fu.o;
import fu.r;
import java.time.LocalDate;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\r\u0010\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnr3/f;", "Lgz/a;", "Lnr3/f$c;", "", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "<init>", "(Lez/e;Lmx/c;)V", "Ljava/time/LocalDate;", "localDate", "date", "c", "(Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;", "params", "b", "(Lnr3/f$c;)Ljava/lang/String;", "a", "Lez/e;", "Lmx/c;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.a<Param, String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f138006d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lnr3/f$b;", "", "a", "c", "b", "Lnr3/f$b$a;", "Lnr3/f$b$b;", "Lnr3/f$b$c;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr3/f$b$a;", "Lnr3/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f138009a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1794001161;
            }

            public String toString() {
                return "DaysWithDate";
            }
        }

        /* JADX INFO: renamed from: nr3.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr3/f$b$b;", "Lnr3/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3406b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3406b f138010a = new C3406b();

            private C3406b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3406b);
            }

            public int hashCode() {
                return 1785748329;
            }

            public String toString() {
                return "DaysWithinAWeekWithDate";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr3/f$b$c;", "Lnr3/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f138011a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1404794623;
            }

            public String toString() {
                return "DaysWithoutDate";
            }
        }
    }

    /* JADX INFO: renamed from: nr3.f$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lnr3/f$c;", "Lgz/b$a;", "Ljava/time/LocalDate;", "localDate", "Lnr3/f$b;", "format", "<init>", "(Ljava/time/LocalDate;Lnr3/f$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "Lnr3/f$b;", "()Lnr3/f$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Param implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate localDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b format;

        public Param(LocalDate localDate, b bVar) {
            this.localDate = localDate;
            this.format = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getLocalDate() {
            return this.localDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Param)) {
                return false;
            }
            Param param = (Param) other;
            return t.c(this.localDate, param.localDate) && t.c(this.format, param.format);
        }

        public int hashCode() {
            return (this.localDate.hashCode() * 31) + this.format.hashCode();
        }

        public String toString() {
            return "Param(localDate=" + this.localDate + ", format=" + this.format + ')';
        }
    }

    public f(ez.e eVar, mx.c cVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
    }

    private final String c(LocalDate localDate, String date) {
        if (ez.d.c(localDate, null, 1, null)) {
            return new o("^\\p{L}*").h(date, this.labelProvider.c(ir3.a.G).getText());
        }
        if (ez.d.e(localDate, null, 1, null)) {
            return new o("^\\p{L}*").h(date, this.labelProvider.c(ir3.a.H).getText());
        }
        return ez.d.m(localDate, null, 1, null) ? new o("^\\p{L}*").h(date, this.labelProvider.c(ir3.a.O).getText()) : date;
    }

    public String b(Param params) {
        fz.c cVar;
        b format = params.getFormat();
        if (t.c(format, b.a.f138009a) || t.c(format, b.C3406b.f138010a)) {
            cVar = fz.c.FULLDAY_DATEDOT;
        } else {
            if (!t.c(format, b.c.f138011a)) {
                throw new p();
            }
            cVar = fz.c.DAY_ONLY;
        }
        String strB = dz.e.b(this.dateFormatter.d(new fz.b.LocalDate(params.getLocalDate()), cVar), null, 1, null);
        return (!t.c(params.getFormat(), b.C3406b.f138010a) || ez.d.g(params.getLocalDate(), null, 1, null)) ? c(params.getLocalDate(), strB) : strB.substring(r.r0(strB, " ", 0, false, 6, null));
    }
}
