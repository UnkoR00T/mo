package wd2;

import p071kotlin.Metadata;
import zp0.BEIncidentReportFileServiceConfiguration;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzp0/f;", "Lo04/b$b;", "a", "(Lzp0/f;)Lo04/b$b;", "incidentreport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final o04.b.Uploader a(BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration) {
        return new o04.b.Uploader(bEIncidentReportFileServiceConfiguration.getUrl(), bEIncidentReportFileServiceConfiguration.getJwtToken(), bEIncidentReportFileServiceConfiguration.getExpiredDate(), bEIncidentReportFileServiceConfiguration.getFileEncryptionKey(), bEIncidentReportFileServiceConfiguration.getDomainCertificate(), null);
    }
}
