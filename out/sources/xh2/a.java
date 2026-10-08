package xh2;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @vl.c("dn")
    private final String f218914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @vl.c("sn")
    private final String f218915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @vl.c("isr")
    private final String f218916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @vl.c("ts")
    private final String f218917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @vl.c("rId")
    private final String f218918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @vl.c("tp")
    private final int f218919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @vl.c("stp")
    private final String f218920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @vl.c("ver")
    private final String f218921h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @vl.c("iid")
    private final String f218922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @vl.c("pe")
    private final String f218923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @vl.c("in")
    private final String f218924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @vl.c("id")
    private final String f218925m;

    public String a() {
        return this.f218925m;
    }

    public String b() {
        return this.f218914a;
    }

    public String c() {
        return this.f218922j;
    }

    public String d() {
        return this.f218925m;
    }

    public String e() {
        return this.f218922j;
    }

    public String f() {
        return this.f218924l;
    }

    public String g() {
        return this.f218924l;
    }

    public String h() {
        return this.f218916c;
    }

    public String i() {
        return this.f218916c;
    }

    public String j() {
        return this.f218923k;
    }

    public String k() {
        return this.f218918e;
    }

    public String m() {
        return this.f218918e;
    }

    public String n() {
        return this.f218915b;
    }

    public String o() {
        return this.f218920g;
    }

    public int p() {
        return this.f218919f;
    }

    public long r() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.forLanguageTag("pl"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date date = simpleDateFormat.parse(this.f218917d);
            if (date != null) {
                return date.getTime();
            }
        } catch (ParseException unused) {
        }
        return 0L;
    }

    public String s() {
        return this.f218917d;
    }

    public String t() {
        return this.f218921h;
    }
}
