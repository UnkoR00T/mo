package o02;

import eo0.EpuapApplicationType;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o02.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0016\u0010\u000e¨\u0006 "}, d2 = {"Lo02/d;", "", "", "Lm02/c;", "files", "", "title", "content", "Leo0/a0;", "epuapApplicationType", "applicationName", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Leo0/a0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/String;", "e", "c", "Leo0/a0;", "()Leo0/a0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Epuap implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<m02.c> files;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String content;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EpuapApplicationType epuapApplicationType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String applicationName;

    /* JADX WARN: Multi-variable type inference failed */
    public Epuap(List<? extends m02.c> list, String str, String str2, EpuapApplicationType epuapApplicationType, String str3) {
        this.files = list;
        this.title = str;
        this.content = str2;
        this.epuapApplicationType = epuapApplicationType;
        this.applicationName = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EpuapApplicationType getEpuapApplicationType() {
        return this.epuapApplicationType;
    }

    public List<m02.c> d() {
        return this.files;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Epuap)) {
            return false;
        }
        Epuap epuap = (Epuap) other;
        return t.c(this.files, epuap.files) && t.c(this.title, epuap.title) && t.c(this.content, epuap.content) && t.c(this.epuapApplicationType, epuap.epuapApplicationType) && t.c(this.applicationName, epuap.applicationName);
    }

    @Override // o02.b, h00.b
    public /* bridge */ Object getData() {
        return super.getData();
    }

    public int hashCode() {
        List<m02.c> list = this.files;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31;
        EpuapApplicationType epuapApplicationType = this.epuapApplicationType;
        int iHashCode2 = (iHashCode + (epuapApplicationType == null ? 0 : epuapApplicationType.hashCode())) * 31;
        String str = this.applicationName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Epuap(files=" + this.files + ", title=" + this.title + ", content=" + this.content + ", epuapApplicationType=" + this.epuapApplicationType + ", applicationName=" + this.applicationName + ')';
    }
}
