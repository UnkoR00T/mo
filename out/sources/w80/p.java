package w80;

import p071kotlin.Metadata;
import u80.BESubjectGrades;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw80/p;", "Lw80/o;", "Lv80/b;", "repository", "<init>", "(Lv80/b;)V", "", "semesterId", "subjectId", "Ldx/i;", "Ldx/b;", "Lu80/d0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lv80/b;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v80.b repository;

    public p(v80.b bVar) {
        this.repository = bVar;
    }

    @Override // w80.o
    public Object a(String str, String str2, tq.e<? super dx.i<? extends dx.b, BESubjectGrades>> eVar) {
        return this.repository.d(str, str2, eVar);
    }
}
