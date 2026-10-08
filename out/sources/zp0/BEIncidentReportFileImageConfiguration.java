package zp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzp0/e;", "", "", "quality", "maxFileAmount", "imageMaxSide", "Lzp0/f;", "filesServiceConfiguration", "<init>", "(IIILzp0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Lzp0/f;", "()Lzp0/f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEIncidentReportFileImageConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quality;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxFileAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imageMaxSide;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEIncidentReportFileServiceConfiguration filesServiceConfiguration;

    public BEIncidentReportFileImageConfiguration(int i15, int i16, int i17, BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration) {
        this.quality = i15;
        this.maxFileAmount = i16;
        this.imageMaxSide = i17;
        this.filesServiceConfiguration = bEIncidentReportFileServiceConfiguration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEIncidentReportFileServiceConfiguration getFilesServiceConfiguration() {
        return this.filesServiceConfiguration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getImageMaxSide() {
        return this.imageMaxSide;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxFileAmount() {
        return this.maxFileAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEIncidentReportFileImageConfiguration)) {
            return false;
        }
        BEIncidentReportFileImageConfiguration bEIncidentReportFileImageConfiguration = (BEIncidentReportFileImageConfiguration) other;
        return this.quality == bEIncidentReportFileImageConfiguration.quality && this.maxFileAmount == bEIncidentReportFileImageConfiguration.maxFileAmount && this.imageMaxSide == bEIncidentReportFileImageConfiguration.imageMaxSide && fr.t.c(this.filesServiceConfiguration, bEIncidentReportFileImageConfiguration.filesServiceConfiguration);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.quality) * 31) + Integer.hashCode(this.maxFileAmount)) * 31) + Integer.hashCode(this.imageMaxSide)) * 31) + this.filesServiceConfiguration.hashCode();
    }

    public String toString() {
        return "BEIncidentReportFileImageConfiguration(quality=" + this.quality + ", maxFileAmount=" + this.maxFileAmount + ", imageMaxSide=" + this.imageMaxSide + ", filesServiceConfiguration=" + this.filesServiceConfiguration + ")";
    }
}
