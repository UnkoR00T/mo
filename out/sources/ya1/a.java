package ya1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"Lya1/a;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements f00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f225699a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String route = "company/applicationwizard";

    private a() {
    }

    @Override // f00.a, zx.a
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
        return 2064404518;
    }

    public String toString() {
        return "ApplicationWizard";
    }
}
