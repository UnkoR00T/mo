package fo;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import yn.a0;
import yn.f;
import yn.t;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
final class a extends z<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a0 f65533b = new C1460a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f65534a;

    /* JADX INFO: renamed from: fo.a$a, reason: collision with other inner class name */
    class C1460a implements a0 {
        C1460a() {
        }

        @Override // yn.a0
        public <T> z<T> b(f fVar, go.a<T> aVar) {
            C1460a c1460a = null;
            if (aVar.d() == Date.class) {
                return new a(c1460a);
            }
            return null;
        }
    }

    /* synthetic */ a(C1460a c1460a) {
        this();
    }

    @Override // yn.z
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(ho.a aVar) throws IOException {
        Date date;
        if (aVar.a0() == ho.b.NULL) {
            aVar.O();
            return null;
        }
        String strQ2 = aVar.q2();
        synchronized (this) {
            TimeZone timeZone = this.f65534a.getTimeZone();
            try {
                try {
                    date = new Date(this.f65534a.parse(strQ2).getTime());
                    this.f65534a.setTimeZone(timeZone);
                } catch (ParseException e15) {
                    throw new t("Failed parsing '" + strQ2 + "' as SQL Date; at path " + aVar.E(), e15);
                }
            } catch (Throwable th4) {
                this.f65534a.setTimeZone(timeZone);
                throw th4;
            }
        }
        return date;
    }

    @Override // yn.z
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ho.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.M();
            return;
        }
        synchronized (this) {
            str = this.f65534a.format((java.util.Date) date);
        }
        cVar.H0(str);
    }

    private a() {
        this.f65534a = new SimpleDateFormat("MMM d, yyyy");
    }
}
