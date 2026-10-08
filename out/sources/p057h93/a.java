package p057h93;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lh93/a;", "Lf00/a;", "<init>", "()V", "a", "b", "c", "Lh93/a$a;", "Lh93/a$b;", "Lh93/a$c;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements f00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82199a = 0;

    /* JADX INFO: renamed from: h93.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lh93/a$a;", "Lh93/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "route", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1892a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1892a f82200b = new C1892a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String route = "securitythreats/main";

        private C1892a() {
            super(null);
        }

        @Override // f00.a, zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1892a);
        }

        public int hashCode() {
            return -1927449158;
        }

        public String toString() {
            return "Main";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lh93/a$b;", "Lh93/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "route", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f82202b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String route = "securitythreats/malware";

        private b() {
            super(null);
        }

        @Override // f00.a, zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1216950220;
        }

        public String toString() {
            return "Malware";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lh93/a$c;", "Lh93/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "route", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f82204b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String route = "securitythreats/vulnerability";

        private c() {
            super(null);
        }

        @Override // f00.a, zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1990526779;
        }

        public String toString() {
            return "SecurityVulnerability";
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    @Override // zx.a
    public /* bridge */ boolean e() {
        return super.e();
    }

    private a() {
    }
}
