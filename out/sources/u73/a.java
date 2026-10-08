package u73;

import oq.i0;
import p071kotlin.Metadata;
import y73.ActivateCodeSetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lu73/a;", "Lzx/a;", "<init>", "()V", "f", "c", "e", "d", "a", "b", "Lu73/a$a;", "Lu73/a$b;", "Lu73/a$c;", "Lu73/a$d;", "Lu73/a$e;", "Lu73/a$f;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements zx.a {

    /* JADX INFO: renamed from: u73.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lu73/a$a;", "Lu73/a;", "Lzx/c;", "Ly73/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C5105a extends a implements zx.c<ActivateCodeSetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5105a f196168a = new C5105a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "activatestudentorschoolcard/activationcode";

        private C5105a() {
            super(null);
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C5105a);
        }

        public int hashCode() {
            return 2100136552;
        }

        public String toString() {
            return "ActivationCode";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0013"}, d2 = {"Lu73/a$b;", "Lu73/a;", "Lhb4/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a implements hb4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f196170a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "activatestudentorschoolcard/error";

        private b() {
            super(null);
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1197202979;
        }

        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lu73/a$c;", "Lu73/a;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends a implements zx.c<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f196172a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "activatestudentorschoolcard/faq";

        private c() {
            super(null);
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 546497009;
        }

        public String toString() {
            return "Faq";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lu73/a$d;", "Lu73/a;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends a implements zx.c<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f196174a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "activatestudentorschoolcard/juniorqrcodeinfo";

        private d() {
            super(null);
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -336899062;
        }

        public String toString() {
            return "JuniorQrCodeInfo";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lu73/a$e;", "Lu73/a;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends a implements zx.c<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f196176a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "activatestudentorschoolcard/scanner";

        private e() {
            super(null);
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -1444190375;
        }

        public String toString() {
            return "Scanner";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lu73/a$f;", "Lu73/a;", "Lzx/c;", "Lk83/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends a implements zx.c<k83.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f196178a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "activatestudentorschoolcard/welcome";

        private f() {
            super(null);
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -2122052419;
        }

        public String toString() {
            return "Welcome";
        }
    }

    public /* synthetic */ a(fr.k kVar) {
        this();
    }

    @Override // zx.a
    public /* bridge */ boolean e() {
        return super.e();
    }

    private a() {
    }
}
