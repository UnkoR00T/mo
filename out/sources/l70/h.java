package l70;

import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u0012R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004\u0082\u0001\u0002\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Ll70/h;", "", "Landroidx/compose/ui/graphics/Color;", "d", "()J", "successPrimary", "c", "successSecondary", "f", "warningPrimary", "b", "warningSecondary", "e", "warningStatus", "g", "errorPrimary", "h", "onError", "a", "errorSecondary", "j", "infoPrimary", "i", "infoSecondary", "Ll70/h$a;", "Ll70/h$b;", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001f\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\"\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010$\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b#\u0010\u0013R\u001a\u0010&\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b \u0010\u0013¨\u0006'"}, d2 = {"Ll70/h$a;", "Ll70/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "d", "()J", "successPrimary", "c", "successSecondary", "f", "warningPrimary", "e", "warningSecondary", "warningStatus", "g", "errorPrimary", "h", "onError", "i", "a", "errorSecondary", "j", "infoPrimary", "k", "infoSecondary", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f116736a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final long successPrimary = o1.d(4282967664L);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final long successSecondary = o1.d(4280695604L);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final long warningPrimary = o1.d(4294957637L);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final long warningSecondary = o1.d(4282136604L);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final long warningStatus = o1.d(4292379940L);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final long errorPrimary = o1.d(4294932336L);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final long onError = o1.d(4279243543L);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final long errorSecondary = o1.d(4282854963L);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final long infoPrimary = o1.d(4281570815L);

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final long infoSecondary = o1.d(4281153864L);

        private a() {
        }

        @Override // l70.h
        public long a() {
            return errorSecondary;
        }

        @Override // l70.h
        public long b() {
            return warningSecondary;
        }

        @Override // l70.h
        public long c() {
            return successSecondary;
        }

        @Override // l70.h
        public long d() {
            return successPrimary;
        }

        @Override // l70.h
        public long e() {
            return warningStatus;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        @Override // l70.h
        public long f() {
            return warningPrimary;
        }

        @Override // l70.h
        public long g() {
            return errorPrimary;
        }

        @Override // l70.h
        public long h() {
            return onError;
        }

        public int hashCode() {
            return 1289189071;
        }

        @Override // l70.h
        public long i() {
            return infoSecondary;
        }

        @Override // l70.h
        public long j() {
            return infoPrimary;
        }

        public String toString() {
            return "Dark";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001f\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\"\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010$\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b#\u0010\u0013R\u001a\u0010&\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b \u0010\u0013¨\u0006'"}, d2 = {"Ll70/h$b;", "Ll70/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "d", "()J", "successPrimary", "c", "successSecondary", "f", "warningPrimary", "e", "warningSecondary", "warningStatus", "g", "errorPrimary", "h", "onError", "i", "a", "errorSecondary", "j", "infoPrimary", "k", "infoSecondary", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f116747a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final long successPrimary = o1.d(4281433126L);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final long successSecondary = o1.d(4293851874L);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final long warningPrimary = o1.d(4289617408L);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final long warningSecondary = o1.d(4294832594L);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final long warningStatus = o1.d(4289617408L);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final long errorPrimary = o1.d(4291635484L);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final long onError = o1.d(BodyPartID.bodyIdMax);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final long errorSecondary = o1.d(4294961637L);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final long infoPrimary = o1.d(4278217181L);

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final long infoSecondary = o1.d(4293062655L);

        private b() {
        }

        @Override // l70.h
        public long a() {
            return errorSecondary;
        }

        @Override // l70.h
        public long b() {
            return warningSecondary;
        }

        @Override // l70.h
        public long c() {
            return successSecondary;
        }

        @Override // l70.h
        public long d() {
            return successPrimary;
        }

        @Override // l70.h
        public long e() {
            return warningStatus;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        @Override // l70.h
        public long f() {
            return warningPrimary;
        }

        @Override // l70.h
        public long g() {
            return errorPrimary;
        }

        @Override // l70.h
        public long h() {
            return onError;
        }

        public int hashCode() {
            return 1317771485;
        }

        @Override // l70.h
        public long i() {
            return infoSecondary;
        }

        @Override // l70.h
        public long j() {
            return infoPrimary;
        }

        public String toString() {
            return "Light";
        }
    }

    long a();

    long b();

    long c();

    long d();

    long e();

    long f();

    long g();

    long h();

    long i();

    long j();
}
