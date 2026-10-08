package bo;

import ao.e0;
import ao.y;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import yn.a0;
import yn.t;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class c<T extends Date> extends z<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f20464c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f20465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f20466b;

    class a implements a0 {
        a() {
        }

        @Override // yn.a0
        public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
            a aVar2 = null;
            if (aVar.d() != Date.class) {
                return null;
            }
            int i15 = 2;
            return new c(b.f20467b, i15, i15, aVar2);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b<T extends Date> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b<Date> f20467b = new a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f20468a;

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // bo.c.b
            protected Date d(Date date) {
                return date;
            }
        }

        protected b(Class<T> cls) {
            this.f20468a = cls;
        }

        private a0 c(c<T> cVar) {
            return p.b(this.f20468a, cVar);
        }

        public final a0 a(int i15, int i16) {
            return c(new c<>(this, i15, i16, null));
        }

        public final a0 b(String str) {
            return c(new c<>(this, str, (a) null));
        }

        protected abstract T d(Date date);
    }

    /* synthetic */ c(b bVar, int i15, int i16, a aVar) {
        this(bVar, i15, i16);
    }

    private Date e(ho.a aVar) throws IOException {
        String strQ2 = aVar.q2();
        synchronized (this.f20466b) {
            try {
                for (DateFormat dateFormat : this.f20466b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            Date date = dateFormat.parse(strQ2);
                            dateFormat.setTimeZone(timeZone);
                            return date;
                        } catch (Throwable th4) {
                            dateFormat.setTimeZone(timeZone);
                            throw th4;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return co.a.c(strQ2, new ParsePosition(0));
                } catch (ParseException e15) {
                    throw new t("Failed parsing '" + strQ2 + "' as Date; at path " + aVar.E(), e15);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // yn.z
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T b(ho.a aVar) throws IOException {
        if (aVar.a0() == ho.b.NULL) {
            aVar.O();
            return null;
        }
        return (T) this.f20465a.d(e(aVar));
    }

    @Override // yn.z
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(ho.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.M();
            return;
        }
        DateFormat dateFormat = this.f20466b.get(0);
        synchronized (this.f20466b) {
            str = dateFormat.format(date);
        }
        cVar.H0(str);
    }

    public String toString() {
        DateFormat dateFormat = this.f20466b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* synthetic */ c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    private c(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f20466b = arrayList;
        Objects.requireNonNull(bVar);
        this.f20465a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private c(b<T> bVar, int i15, int i16) {
        ArrayList arrayList = new ArrayList();
        this.f20466b = arrayList;
        Objects.requireNonNull(bVar);
        this.f20465a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i15, i16, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i15, i16));
        }
        if (y.c()) {
            arrayList.add(e0.c(i15, i16));
        }
    }
}
