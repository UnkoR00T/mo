package w80;

import p071kotlin.Metadata;
import u80.BEAttendanceStatusDetails;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw80/b;", "Lw80/a;", "Lv80/a;", "repository", "<init>", "(Lv80/a;)V", "Lu80/b;", "attendanceStatus", "", "semesterId", "Ldx/i;", "Ldx/b;", "Lu80/c;", "a", "(Lu80/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lv80/a;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v80.a repository;

    public b(v80.a aVar) {
        this.repository = aVar;
    }

    @Override // w80.a
    public Object a(u80.b bVar, String str, tq.e<? super dx.i<? extends dx.b, BEAttendanceStatusDetails>> eVar) {
        return this.repository.b(bVar, str, eVar);
    }
}
