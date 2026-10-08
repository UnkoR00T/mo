package jo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.l0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u000fR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Ljo0/l0;", "", "", "caseId", "Ljo0/s0;", "forwardDetails", "subject", "textBody", "threadId", "", "Ljo0/t1;", "to", "<init>", "(Ljava/lang/String;Ljo0/s0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCaseId", "b", "Ljo0/s0;", "getForwardDetails", "()Ljo0/s0;", "c", "getSubject", "d", "getTextBody", "e", "getThreadId", "f", "Ljava/util/List;", "getTo", "()Ljava/util/List;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EdeliveryDraftMessageRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("caseId")
    private final String caseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("forwardDetails")
    private final ForwardDetailsDtoDto forwardDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subject")
    private final String subject;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("textBody")
    private final String textBody;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("threadId")
    private final String threadId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("to")
    private final List<SendEdeliveryMessageAddressDataDtoDto> to;

    public EdeliveryDraftMessageRequestDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdeliveryDraftMessageRequestDto)) {
            return false;
        }
        EdeliveryDraftMessageRequestDto edeliveryDraftMessageRequestDto = (EdeliveryDraftMessageRequestDto) other;
        return fr.t.c(this.caseId, edeliveryDraftMessageRequestDto.caseId) && fr.t.c(this.forwardDetails, edeliveryDraftMessageRequestDto.forwardDetails) && fr.t.c(this.subject, edeliveryDraftMessageRequestDto.subject) && fr.t.c(this.textBody, edeliveryDraftMessageRequestDto.textBody) && fr.t.c(this.threadId, edeliveryDraftMessageRequestDto.threadId) && fr.t.c(this.to, edeliveryDraftMessageRequestDto.to);
    }

    public int hashCode() {
        String str = this.caseId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ForwardDetailsDtoDto forwardDetailsDtoDto = this.forwardDetails;
        int iHashCode2 = (iHashCode + (forwardDetailsDtoDto == null ? 0 : forwardDetailsDtoDto.hashCode())) * 31;
        String str2 = this.subject;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textBody;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threadId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<SendEdeliveryMessageAddressDataDtoDto> list = this.to;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "EdeliveryDraftMessageRequestDto(caseId=" + this.caseId + ", forwardDetails=" + this.forwardDetails + ", subject=" + this.subject + ", textBody=" + this.textBody + ", threadId=" + this.threadId + ", to=" + this.to + ')';
    }

    public EdeliveryDraftMessageRequestDto(String str, ForwardDetailsDtoDto forwardDetailsDtoDto, String str2, String str3, String str4, List<SendEdeliveryMessageAddressDataDtoDto> list) {
        this.caseId = str;
        this.forwardDetails = forwardDetailsDtoDto;
        this.subject = str2;
        this.textBody = str3;
        this.threadId = str4;
        this.to = list;
    }

    public /* synthetic */ EdeliveryDraftMessageRequestDto(String str, ForwardDetailsDtoDto forwardDetailsDtoDto, String str2, String str3, String str4, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : forwardDetailsDtoDto, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : str3, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? null : list);
    }
}
