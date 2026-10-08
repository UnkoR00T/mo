package wn0;

import ge4.x;
import ie4.f;
import ie4.o;
import p071kotlin.Metadata;
import tq.e;
import yn0.AvailableElectionSupportsRequest;
import yn0.AvailableElectionSupportsResponse;
import yn0.ElectionActionEligibilityResponse;
import yn0.ElectionSupportsHistoryRequest;
import yn0.ElectionSupportsHistoryResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lwn0/a;", "", "Lyn0/a;", "availableElectionSupportsRequest", "Lge4/x;", "Lyn0/b;", "a", "(Lyn0/a;Ltq/e;)Ljava/lang/Object;", "Lyn0/d;", "c", "(Ltq/e;)Ljava/lang/Object;", "Lyn0/m;", "electionSupportsHistoryRequest", "Lyn0/n;", "b", "(Lyn0/m;Ltq/e;)Ljava/lang/Object;", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @o("signature-gathering-elections/mobile/api/signature-gathering-elections/election-action/available-supports")
    Object a(@ie4.a AvailableElectionSupportsRequest availableElectionSupportsRequest, e<? super x<AvailableElectionSupportsResponse>> eVar);

    @o("signature-gathering-elections/mobile/api/signature-gathering-elections/election-action/supports-history")
    Object b(@ie4.a ElectionSupportsHistoryRequest electionSupportsHistoryRequest, e<? super x<ElectionSupportsHistoryResponse>> eVar);

    @f("signature-gathering-elections/mobile/api/signature-gathering-elections/election-action/eligibility")
    Object c(e<? super x<ElectionActionEligibilityResponse>> eVar);
}
