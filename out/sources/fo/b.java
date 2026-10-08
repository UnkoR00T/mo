package fo;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import yn.a0;
import yn.f;
import yn.t;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
final class b extends z<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a0 f65535b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f65536a;

    class a implements a0 {
        a() {
        }

        @Override // yn.a0
        public <T> z<T> b(f fVar, go.a<T> aVar) {
            a aVar2 = null;
            if (aVar.d() == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // yn.z
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(ho.a aVar) throws IOException {
        Time time;
        if (aVar.a0() == ho.b.NULL) {
            aVar.O();
            return null;
        }
        String strQ2 = aVar.q2();
        synchronized (this) {
            TimeZone timeZone = this.f65536a.getTimeZone();
            try {
                try {
                    time = new Time(this.f65536a.parse(strQ2).getTime());
                    this.f65536a.setTimeZone(timeZone);
                } catch (ParseException e15) {
                    throw new t("Failed parsing '" + strQ2 + "' as SQL Time; at path " + aVar.E(), e15);
                }
            } catch (Throwable th4) {
                this.f65536a.setTimeZone(timeZone);
                throw th4;
            }
        }
        return time;
    }

    @Override // yn.z
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ho.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.M();
            return;
        }
        synchronized (this) {
            str = this.f65536a.format((Date) time);
        }
        cVar.H0(str);
    }

    private b() {
        this.f65536a = new SimpleDateFormat("hh:mm:ss a");
    }
}
