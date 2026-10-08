package p063io3;

import co3.PinAuthResult;
import co3.QrCodeData;
import co3.SummaryData;
import dn0.VerificationResponse;
import jo3.PersonPayloadData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lio3/k;", "Lzx/a;", "f", "e", "h", "i", "a", "b", "c", "k", "j", "d", "g", "Lio3/k$a;", "Lio3/k$b;", "Lio3/k$c;", "Lio3/k$d;", "Lio3/k$e;", "Lio3/k$f;", "Lio3/k$g;", "Lio3/k$h;", "Lio3/k$i;", "Lio3/k$j;", "Lio3/k$k;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends zx.a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$a;", "Lio3/k;", "Lzx/c;", "Ljo3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements k, zx.c<jo3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f96063a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/documentdetail/institutions";

        private a() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1927957972;
        }

        public String toString() {
            return "DocumentDetailInstitutions";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$b;", "Lio3/k;", "Lzx/c;", "Ljo3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements k, zx.c<PersonPayloadData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f96065a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/documentdetail/person";

        private b() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1098637778;
        }

        public String toString() {
            return "DocumentDetailPerson";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$c;", "Lio3/k;", "Lzx/c;", "Lco3/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements k, zx.c<QrCodeData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f96067a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/documentdetail/web";

        private c() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1975591141;
        }

        public String toString() {
            return "DocumentDetailWeb";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio3/k$d;", "Lio3/k;", "Lhb4/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements k, hb4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f96069a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/error";

        private d() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1123386565;
        }

        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$e;", "Lio3/k;", "Lzx/c;", "Luo3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e implements k, zx.c<uo3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f96071a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/infoscanner";

        private e() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -220012445;
        }

        public String toString() {
            return "InfoScanner";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$f;", "Lio3/k;", "Lzx/c;", "Luo3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f implements k, zx.c<uo3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f96073a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/introscanner";

        private f() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -1824883361;
        }

        public String toString() {
            return "IntroScanner";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$g;", "Lio3/k;", "Lzx/c;", "Lco3/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g implements k, zx.c<PinAuthResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f96075a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/pinauthentication";

        private g() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return 1149627424;
        }

        public String toString() {
            return "PinAuthentication";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$h;", "Lio3/k;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h implements k, zx.c<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f96077a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/qr";

        private h() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public int hashCode() {
            return -1158731314;
        }

        public String toString() {
            return "Qr";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$i;", "Lio3/k;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i implements k, zx.c<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f96079a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/scanner";

        private i() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return 1852251761;
        }

        public String toString() {
            return "Scanner";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$j;", "Lio3/k;", "Lzx/c;", "Lco3/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j implements k, zx.c<SummaryData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f96081a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/summary";

        private j() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public int hashCode() {
            return -1916350439;
        }

        public String toString() {
            return "Summary";
        }
    }

    /* JADX INFO: renamed from: io3.k$k, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lio3/k$k;", "Lio3/k;", "Lzx/c;", "Ldn0/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C2246k implements k, zx.c<VerificationResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2246k f96083a = new C2246k();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "verification/verificationdetails";

        private C2246k() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C2246k);
        }

        public int hashCode() {
            return -1819360358;
        }

        public String toString() {
            return "VerificationDetails";
        }
    }
}
