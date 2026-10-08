package o14;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo14/h;", "La14/i;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/h;", "timeProvider", "<init>", "(Lmx/c;Lez/e;Lez/h;)V", "Ljava/time/OffsetDateTime;", "date", "Ljava/time/ZoneId;", "zoneId", "", "b", "(Ljava/time/OffsetDateTime;Ljava/time/ZoneId;)Ljava/lang/String;", "La14/i$a;", "params", "Lmx/a;", "c", "(La14/i$a;)Lmx/a;", "a", "Lmx/c;", "Lez/e;", "Lez/h;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements a14.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.h timeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140618a;

        static {
            int[] iArr = new int[fz.a.values().length];
            try {
                iArr[fz.a.TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fz.a.YESTERDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fz.a.THIS_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fz.a.AFTER_THIS_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f140618a = iArr;
        }
    }

    public h(mx.c cVar, ez.e eVar, ez.h hVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.timeProvider = hVar;
    }

    private final String b(OffsetDateTime date, ZoneId zoneId) {
        int i15 = a.f140618a[this.timeProvider.c(date, zoneId).ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(s04.b.R0).getText();
        }
        if (i15 == 2) {
            return this.labelProvider.c(s04.b.X1).getText();
        }
        if (i15 == 3) {
            return dz.e.b(date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()), null, 1, null);
        }
        if (i15 == 4) {
            return "";
        }
        throw new oq.p();
    }

    @Override // gz.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Label a(a14.i.Params params) {
        ZoneId zoneIdSystemDefault;
        StringBuilder sb5 = new StringBuilder();
        OffsetDateTime date = params.getDate();
        fz.f timeZoneId = params.getTimeZoneId();
        if (timeZoneId == null || (zoneIdSystemDefault = ZoneId.of(timeZoneId.getId())) == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        sb5.append(b(date, zoneIdSystemDefault));
        if (sb5.length() > 0) {
            sb5.append(", ");
        }
        sb5.append(this.dateFormatter.d(new fz.b.OffsetDateTime(params.getDate()), fz.c.DOTTED));
        return mx.b.b(sb5.toString(), "dateWithTimezone");
    }
}
