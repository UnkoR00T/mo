package a20;

import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0001\u0002\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"La20/a;", "", "Landroidx/compose/ui/graphics/Color;", "h", "()J", "neutral900", "i", "neutral500", "b", "neutral200", "d", "neutral100", "a", "neutral80", "k", "neutral60", "f", "neutral40", "g", "neutral30", "j", "neutral20", "e", "neutral10", "c", "neutral0", "La20/a$a;", "La20/a$b;", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a20.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010!\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001a\u0010\"\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010#\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010%\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b$\u0010\u0013R\u001a\u0010&\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010(\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006)"}, d2 = {"La20/a$a;", "La20/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "h", "()J", "neutral900", "c", "i", "neutral500", "d", "neutral200", "e", "neutral100", "f", "a", "neutral80", "g", "k", "neutral60", "neutral40", "neutral30", "j", "neutral20", "neutral10", "l", "neutral0", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0025a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0025a f2053a = new C0025a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final long neutral900 = o1.d(BodyPartID.bodyIdMax);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final long neutral500 = o1.d(4294375673L);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final long neutral200 = o1.d(4291876059L);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final long neutral100 = o1.d(4288981682L);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final long neutral80 = o1.d(4286613651L);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final long neutral60 = o1.d(4284836469L);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final long neutral40 = o1.d(4283586399L);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final long neutral30 = o1.d(4281612351L);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final long neutral20 = o1.d(4280230696L);

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final long neutral10 = o1.d(4279243543L);

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private static final long neutral0 = o1.d(4278190080L);

        private C0025a() {
        }

        @Override // a20.a
        public long a() {
            return neutral80;
        }

        @Override // a20.a
        public long b() {
            return neutral200;
        }

        @Override // a20.a
        public long c() {
            return neutral0;
        }

        @Override // a20.a
        public long d() {
            return neutral100;
        }

        @Override // a20.a
        public long e() {
            return neutral10;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C0025a);
        }

        @Override // a20.a
        public long f() {
            return neutral40;
        }

        @Override // a20.a
        public long g() {
            return neutral30;
        }

        @Override // a20.a
        public long h() {
            return neutral900;
        }

        public int hashCode() {
            return 516066557;
        }

        @Override // a20.a
        public long i() {
            return neutral500;
        }

        @Override // a20.a
        public long j() {
            return neutral20;
        }

        @Override // a20.a
        public long k() {
            return neutral60;
        }

        public String toString() {
            return "Dark";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010!\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001a\u0010\"\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010#\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010%\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b$\u0010\u0013R\u001a\u0010&\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010(\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006)"}, d2 = {"La20/a$b;", "La20/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "h", "()J", "neutral900", "c", "i", "neutral500", "d", "neutral200", "e", "neutral100", "f", "a", "neutral80", "g", "k", "neutral60", "neutral40", "neutral30", "j", "neutral20", "neutral10", "l", "neutral0", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2065a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final long neutral900 = o1.d(4278190080L);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final long neutral500 = o1.d(4279243543L);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final long neutral200 = o1.d(4283586399L);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final long neutral100 = o1.d(4284836469L);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final long neutral80 = o1.d(4286613651L);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final long neutral60 = o1.d(4288981682L);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final long neutral40 = o1.d(4291876059L);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final long neutral30 = o1.d(4293389037L);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final long neutral20 = o1.d(4293849587L);

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final long neutral10 = o1.d(4294375673L);

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private static final long neutral0 = o1.d(BodyPartID.bodyIdMax);

        private b() {
        }

        @Override // a20.a
        public long a() {
            return neutral80;
        }

        @Override // a20.a
        public long b() {
            return neutral200;
        }

        @Override // a20.a
        public long c() {
            return neutral0;
        }

        @Override // a20.a
        public long d() {
            return neutral100;
        }

        @Override // a20.a
        public long e() {
            return neutral10;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        @Override // a20.a
        public long f() {
            return neutral40;
        }

        @Override // a20.a
        public long g() {
            return neutral30;
        }

        @Override // a20.a
        public long h() {
            return neutral900;
        }

        public int hashCode() {
            return -1174189969;
        }

        @Override // a20.a
        public long i() {
            return neutral500;
        }

        @Override // a20.a
        public long j() {
            return neutral20;
        }

        @Override // a20.a
        public long k() {
            return neutral60;
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

    long k();
}
