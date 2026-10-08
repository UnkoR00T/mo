package fl;

import dl.f;
import dl.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements el.b<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.d<Object> f64739e = new dl.d() { // from class: fl.a
        @Override // dl.d
        public final void a(Object obj, Object obj2) {
            d.c(obj, (dl.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f<String> f64740f = new f() { // from class: fl.b
        @Override // dl.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f<Boolean> f64741g = new f() { // from class: fl.c
        @Override // dl.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).c(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f64742h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, dl.d<?>> f64743a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, f<?>> f64744b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl.d<Object> f64745c = f64739e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f64746d = false;

    class a implements dl.a {
        a() {
        }

        @Override // dl.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f64743a, d.this.f64744b, d.this.f64745c, d.this.f64746d);
            eVar.g(obj, false);
            eVar.o();
        }

        @Override // dl.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements f<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f64748a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f64748a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // dl.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.add(f64748a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f64740f);
        m(Boolean.class, f64741g);
        m(Date.class, f64742h);
    }

    public static /* synthetic */ void c(Object obj, dl.e eVar) {
        throw new dl.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public dl.a i() {
        return new a();
    }

    public d j(el.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z15) {
        this.f64746d = z15;
        return this;
    }

    @Override // el.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, dl.d<? super T> dVar) {
        this.f64743a.put(cls, dVar);
        this.f64744b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, f<? super T> fVar) {
        this.f64744b.put(cls, fVar);
        this.f64743a.remove(cls);
        return this;
    }
}
