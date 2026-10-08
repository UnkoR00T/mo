package pv2;

import al0.ApplicantDataModel;
import fr.t;
import gz.b;
import ml0.f;
import ml0.i;
import mw2.l;
import oq.p;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpv2/a;", "", "Lpv2/a$a;", "Lal0/e;", "Lml0/f;", "getApplicantDataUseCase", "Lml0/i;", "getChildAndParentsDataUseCase", "<init>", "(Lml0/f;Lml0/i;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lpv2/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lml0/f;", "b", "Lml0/i;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f getApplicantDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i getChildAndParentsDataUseCase;

    /* JADX INFO: renamed from: pv2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpv2/a$a;", "Lgz/b$a;", "Lmw2/l;", "applicantDataRequester", "<init>", "(Lmw2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmw2/l;", "()Lmw2/l;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l applicantDataRequester;

        public Params(l lVar) {
            this.applicantDataRequester = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final l getApplicantDataRequester() {
            return this.applicantDataRequester;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.applicantDataRequester, ((Params) other).applicantDataRequester);
        }

        public int hashCode() {
            return this.applicantDataRequester.hashCode();
        }

        public String toString() {
            return "Params(applicantDataRequester=" + this.applicantDataRequester + ')';
        }
    }

    public a(f fVar, i iVar) {
        this.getApplicantDataUseCase = fVar;
        this.getChildAndParentsDataUseCase = iVar;
    }

    public Object d(Params params, e<? super dx.i<? extends dx.b, ApplicantDataModel>> eVar) {
        l applicantDataRequester = params.getApplicantDataRequester();
        if (applicantDataRequester instanceof l.Child) {
            return this.getChildAndParentsDataUseCase.c(new i.Params(kv2.a.a(((l.Child) applicantDataRequester).getChildData())), eVar);
        }
        if (applicantDataRequester instanceof l.b) {
            return this.getApplicantDataUseCase.c(b.a.C1792a.f78542a, eVar);
        }
        throw new p();
    }
}
