package nr3;

import fr.t;
import iy.b0;
import iy.c0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnr3/a;", "Lgz/b;", "Lnr3/a$a;", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "Lmx/c;", "labelProvider", "La14/a;", "addEventToCalendarUseCase", "<init>", "(Lmx/c;La14/a;)V", "params", "d", "(Lnr3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "La14/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, dx.i<? extends dx.b.Business, ? extends i0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.a addEventToCalendarUseCase;

    /* JADX INFO: renamed from: nr3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lnr3/a$a;", "Lgz/b$a;", "", "visitTopic", "", "visitStartTimeMillis", "visitEndTimeMillis", "Liy/b0;", "visitUrl", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "J", "()J", "Ljava/lang/Long;", "()Ljava/lang/Long;", "d", "Liy/b0;", "()Liy/b0;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f137984e = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String visitTopic;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long visitStartTimeMillis;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long visitEndTimeMillis;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 visitUrl;

        public Params(String str, long j15, Long l15, b0 b0Var) {
            this.visitTopic = str;
            this.visitStartTimeMillis = j15;
            this.visitEndTimeMillis = l15;
            this.visitUrl = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getVisitEndTimeMillis() {
            return this.visitEndTimeMillis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getVisitStartTimeMillis() {
            return this.visitStartTimeMillis;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getVisitTopic() {
            return this.visitTopic;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getVisitUrl() {
            return this.visitUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.visitTopic, params.visitTopic) && this.visitStartTimeMillis == params.visitStartTimeMillis && t.c(this.visitEndTimeMillis, params.visitEndTimeMillis) && t.c(this.visitUrl, params.visitUrl);
        }

        public int hashCode() {
            int iHashCode = ((this.visitTopic.hashCode() * 31) + Long.hashCode(this.visitStartTimeMillis)) * 31;
            Long l15 = this.visitEndTimeMillis;
            return ((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31) + this.visitUrl.hashCode();
        }

        public String toString() {
            return "Params(visitTopic=" + this.visitTopic + ", visitStartTimeMillis=" + this.visitStartTimeMillis + ", visitEndTimeMillis=" + this.visitEndTimeMillis + ", visitUrl=" + this.visitUrl + ')';
        }
    }

    public a(mx.c cVar, a14.a aVar) {
        this.labelProvider = cVar;
        this.addEventToCalendarUseCase = aVar;
    }

    public Object d(Params params, tq.e<? super dx.i<dx.b.Business, i0>> eVar) {
        return this.addEventToCalendarUseCase.c(new a14.a.Params(this.labelProvider.c(ir3.a.f96815q0).getText(), params.getVisitStartTimeMillis(), params.getVisitEndTimeMillis(), false, params.getVisitTopic() + ", " + c0.e(params.getVisitUrl()), null, 32, null), eVar);
    }
}
