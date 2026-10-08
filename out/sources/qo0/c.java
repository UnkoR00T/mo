package qo0;

import ge4.x;
import ie4.f;
import ie4.s;
import p071kotlin.Metadata;
import so0.CategorizedTopicsDtoDto;
import so0.ReportIssueReasonResponseDto;
import so0.b0;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lqo0/c;", "", "Lge4/x;", "Lso0/c;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lso0/b0;", "topicType", "Lso0/z;", "b", "(Lso0/b0;Ltq/e;)Ljava/lang/Object;", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @f("feedback/mobile/api/topics")
    Object a(e<? super x<CategorizedTopicsDtoDto>> eVar);

    @f("feedback/mobile/api/report-issue-reason/{topicType}")
    Object b(@s("topicType") b0 b0Var, e<? super x<ReportIssueReasonResponseDto>> eVar);
}
