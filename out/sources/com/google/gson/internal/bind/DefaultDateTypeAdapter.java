package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.u;
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
import wl.d0;
import wl.x;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends a0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f36719c = new b0() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() != Date.class) {
                return null;
            }
            int i15 = 2;
            return new DefaultDateTypeAdapter(a.f36722b, i15, i15);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<T> f36720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f36721b;

    public static abstract class a<T extends Date> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a<Date> f36722b = new C0764a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f36723a;

        /* JADX INFO: renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        class C0764a extends a<Date> {
            C0764a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            protected Date d(Date date) {
                return date;
            }
        }

        protected a(Class<T> cls) {
            this.f36723a = cls;
        }

        private b0 c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.f36723a, defaultDateTypeAdapter);
        }

        public final b0 a(int i15, int i16) {
            return c(new DefaultDateTypeAdapter<>(this, i15, i16));
        }

        public final b0 b(String str) {
            return c(new DefaultDateTypeAdapter<>(this, str));
        }

        protected abstract T d(Date date);
    }

    private Date e(zl.a aVar) throws IOException {
        String strQ2 = aVar.q2();
        synchronized (this.f36721b) {
            try {
                for (DateFormat dateFormat : this.f36721b) {
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
                    return xl.a.c(strQ2, new ParsePosition(0));
                } catch (ParseException e15) {
                    throw new u("Failed parsing '" + strQ2 + "' as Date; at path " + aVar.E(), e15);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T b(zl.a aVar) throws IOException {
        if (aVar.a0() == zl.b.NULL) {
            aVar.O();
            return null;
        }
        return (T) this.f36720a.d(e(aVar));
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(zl.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.M();
            return;
        }
        DateFormat dateFormat = this.f36721b.get(0);
        synchronized (this.f36721b) {
            str = dateFormat.format(date);
        }
        cVar.H0(str);
    }

    public String toString() {
        DateFormat dateFormat = this.f36721b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(a<T> aVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f36721b = arrayList;
        Objects.requireNonNull(aVar);
        this.f36720a = aVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(a<T> aVar, int i15, int i16) {
        ArrayList arrayList = new ArrayList();
        this.f36721b = arrayList;
        Objects.requireNonNull(aVar);
        this.f36720a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i15, i16, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i15, i16));
        }
        if (x.c()) {
            arrayList.add(d0.c(i15, i16));
        }
    }
}
