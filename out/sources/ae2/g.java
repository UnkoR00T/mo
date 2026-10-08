package ae2;

import fr.t;
import java.util.List;
import oq.i0;
import oq.r;
import p071kotlin.Metadata;
import vy.Coordinates;
import zd2.ImageAttachments;
import zd2.NewIncidentData;
import zd2.Photo;
import zp0.BEIncidentReportFileServiceConfiguration;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lae2/g;", "Lgz/b;", "Lae2/g$a;", "Lae2/g$b;", "a", "b", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends gz.b<Params, Result> {

    /* JADX INFO: renamed from: ae2.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#R)\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u001a\u0010%¨\u0006&"}, d2 = {"Lae2/g$a;", "Lgz/b$a;", "Lzd2/c;", "newIncidentData", "Lvy/c;", "lastLocalization", "Lzp0/f;", "fileServiceConfiguration", "", "Loq/r;", "Lzd2/d;", "Lzd2/b;", "alreadyUploadedPhotos", "<init>", "(Lzd2/c;Lvy/c;Lzp0/f;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzd2/c;", "d", "()Lzd2/c;", "b", "Lvy/c;", "c", "()Lvy/c;", "Lzp0/f;", "()Lzp0/f;", "Ljava/util/List;", "()Ljava/util/List;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final NewIncidentData newIncidentData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Coordinates lastLocalization;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEIncidentReportFileServiceConfiguration fileServiceConfiguration;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<r<Photo, ImageAttachments>> alreadyUploadedPhotos;

        public Params(NewIncidentData newIncidentData, Coordinates coordinates, BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration, List<r<Photo, ImageAttachments>> list) {
            this.newIncidentData = newIncidentData;
            this.lastLocalization = coordinates;
            this.fileServiceConfiguration = bEIncidentReportFileServiceConfiguration;
            this.alreadyUploadedPhotos = list;
        }

        public final List<r<Photo, ImageAttachments>> a() {
            return this.alreadyUploadedPhotos;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEIncidentReportFileServiceConfiguration getFileServiceConfiguration() {
            return this.fileServiceConfiguration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Coordinates getLastLocalization() {
            return this.lastLocalization;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final NewIncidentData getNewIncidentData() {
            return this.newIncidentData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.newIncidentData, params.newIncidentData) && t.c(this.lastLocalization, params.lastLocalization) && t.c(this.fileServiceConfiguration, params.fileServiceConfiguration) && t.c(this.alreadyUploadedPhotos, params.alreadyUploadedPhotos);
        }

        public int hashCode() {
            return (((((this.newIncidentData.hashCode() * 31) + this.lastLocalization.hashCode()) * 31) + this.fileServiceConfiguration.hashCode()) * 31) + this.alreadyUploadedPhotos.hashCode();
        }

        public String toString() {
            return "Params(newIncidentData=" + this.newIncidentData + ", lastLocalization=" + this.lastLocalization + ", fileServiceConfiguration=" + this.fileServiceConfiguration + ", alreadyUploadedPhotos=" + this.alreadyUploadedPhotos + ')';
        }
    }

    /* JADX INFO: renamed from: ae2.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lae2/g$b;", "Lgz/b$a;", "", "Loq/r;", "Lzd2/d;", "Lzd2/b;", "uploadedPhotos", "Ldx/i;", "Ldx/b;", "Loq/i0;", "either", "<init>", "(Ljava/util/List;Ldx/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ldx/i;", "()Ldx/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<r<Photo, ImageAttachments>> uploadedPhotos;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.i<dx.b, i0> either;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(List<r<Photo, ImageAttachments>> list, dx.i<? extends dx.b, i0> iVar) {
            this.uploadedPhotos = list;
            this.either = iVar;
        }

        public final dx.i<dx.b, i0> a() {
            return this.either;
        }

        public final List<r<Photo, ImageAttachments>> b() {
            return this.uploadedPhotos;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.uploadedPhotos, result.uploadedPhotos) && t.c(this.either, result.either);
        }

        public int hashCode() {
            return (this.uploadedPhotos.hashCode() * 31) + this.either.hashCode();
        }

        public String toString() {
            return "Result(uploadedPhotos=" + this.uploadedPhotos + ", either=" + this.either + ')';
        }
    }
}
