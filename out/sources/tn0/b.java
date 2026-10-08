package tn0;

import p071kotlin.Metadata;
import rn0.BEAttendanceStatusDetails;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltn0/b;", "Ltn0/a;", "Lsn0/a;", "repository", "<init>", "(Lsn0/a;)V", "", "studentId", "Lrn0/b;", "attendanceStatus", "semesterId", "Ldx/i;", "Ldx/b;", "Lrn0/c;", "a", "(Ljava/lang/String;Lrn0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsn0/a;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sn0.a repository;

    public b(sn0.a aVar) {
        this.repository = aVar;
    }

    @Override // tn0.a
    public Object a(String str, rn0.b bVar, String str2, tq.e<? super dx.i<? extends dx.b, BEAttendanceStatusDetails>> eVar) {
        return this.repository.j(str, bVar, str2, eVar);
    }
}
