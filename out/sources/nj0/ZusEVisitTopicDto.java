package nj0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.w0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lnj0/w0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnj0/w0$a;", "a", "Lnj0/w0$a;", "()Lnj0/w0$a;", "code", "b", "Ljava/lang/String;", "description", "c", "id", "d", "title", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ZusEVisitTopicDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("code")
    private final a code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: nj0.w0$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lnj0/w0$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "j", "k", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        PUE("PUE"),
        EIR("EIR"),
        EIR_MN("EIR_MN"),
        ZAS("ZAS"),
        UIU("UIU"),
        FIP("FIP"),
        PJM_ZAS("PJM_ZAS"),
        PJM_EIR("PJM_EIR"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ wq.a f136808m = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZusEVisitTopicDto)) {
            return false;
        }
        ZusEVisitTopicDto zusEVisitTopicDto = (ZusEVisitTopicDto) other;
        return this.code == zusEVisitTopicDto.code && fr.t.c(this.description, zusEVisitTopicDto.description) && fr.t.c(this.id, zusEVisitTopicDto.id) && fr.t.c(this.title, zusEVisitTopicDto.title);
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.description.hashCode()) * 31) + this.id.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "ZusEVisitTopicDto(code=" + this.code + ", description=" + this.description + ", id=" + this.id + ", title=" + this.title + ')';
    }
}
