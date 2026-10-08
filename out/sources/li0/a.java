package li0;

import ge4.x;
import ie4.o;
import ie4.p;
import ie4.s;
import ni0.ConversationDto;
import ni0.ConversationRatingDto;
import ni0.MessageReplyRatingDto;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lli0/a;", "", "", "conversationId", "Lni0/f;", "conversationRatingDto", "Lge4/x;", "Loq/i0;", "b", "(Ljava/lang/String;Lni0/f;Ltq/e;)Ljava/lang/Object;", "responseId", "Lni0/h;", "messageReplyRatingDto", "c", "(Ljava/lang/String;Ljava/lang/String;Lni0/h;Ltq/e;)Ljava/lang/Object;", "Lni0/d;", "a", "(Ltq/e;)Ljava/lang/Object;", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @o("chat/mobile/api/conversations")
    Object a(e<? super x<ConversationDto>> eVar);

    @p("chat/mobile/api/conversations/{conversationId}/rating")
    Object b(@s("conversationId") String str, @ie4.a ConversationRatingDto conversationRatingDto, e<? super x<i0>> eVar);

    @p("chat/mobile/api/conversations/{conversationId}/messages/{responseId}/reply-rating")
    Object c(@s("conversationId") String str, @s("responseId") String str2, @ie4.a MessageReplyRatingDto messageReplyRatingDto, e<? super x<i0>> eVar);
}
