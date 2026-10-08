package p123uw0;

import fr.k;
import p071kotlin.Metadata;
import ww0.AboutApplicationSetupData;
import zx.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Luw0/a;", "Lzx/a;", "<init>", "()V", "a", "Luw0/a$a;", "aboutapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements zx.a {

    /* JADX INFO: renamed from: uw0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Luw0/a$a;", "Luw0/a;", "Lzx/c;", "Lww0/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "aboutapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C5243a extends a implements c<AboutApplicationSetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5243a f201848a = new C5243a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "aboutapplication/main";

        private C5243a() {
            super(null);
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C5243a);
        }

        public int hashCode() {
            return -1446104096;
        }

        public String toString() {
            return "AboutApplication";
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
