package h40;

import fu.r;
import fz.FormattedRangeDate;
import java.time.LocalDate;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u0006*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u0006*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh40/l;", "Lh40/k;", "Lez/e;", "dateFormatter", "<init>", "(Lez/e;)V", "", "tag", "Lmx/a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "Ljava/time/LocalDate;", "d", "(Ljava/time/LocalDate;)Ljava/lang/String;", "c", "start", "end", "Lh40/a;", "a", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)Lh40/a;", "Lez/e;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f80810b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80811c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lh40/l$a;", "", "<init>", "()V", "", "START_TAG", "Ljava/lang/String;", "END_TAG", "DOT_CHARACTER", "DOT_CHARACTER_REPLACEMENT", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public l(ez.e eVar) {
        this.dateFormatter = eVar;
    }

    private final Label b(String str, String str2) {
        return mx.b.b(r.P(str, ".", ".\u200b", false, 4, null), str2);
    }

    private final String c(LocalDate localDate) {
        String strD;
        return (localDate == null || (strD = this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DAY_MONTH_YEAR_WEEK_DAY_DOTTED)) == null) ? c70.a.f23835a.a().e().getText() : strD;
    }

    private final String d(LocalDate localDate) {
        String strD;
        return (localDate == null || (strD = this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED)) == null) ? c70.a.f23835a.a().E0().getText() : strD;
    }

    @Override // h40.k
    public FormattedRangePickerHeadline a(LocalDate start, LocalDate end) {
        c70.a aVar = c70.a.f23835a;
        Label labelB0 = aVar.a().b0(c(start), c(end));
        if (start == null || end == null) {
            return new FormattedRangePickerHeadline(b(d(start), "rangeStartTag"), null, aVar.a().A().n("rangeEndTag"), labelB0, 2, null);
        }
        FormattedRangeDate formattedRangeDateA = this.dateFormatter.a(new fz.e.LocalDate(start, end));
        return new FormattedRangePickerHeadline(b(formattedRangeDateA.getStart(), "rangeStartTag"), null, b(formattedRangeDateA.getEnd(), "rangeEndTag"), labelB0, 2, null);
    }
}
