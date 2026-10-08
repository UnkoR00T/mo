package si0;

import dx.b;
import dx.i;
import iy.b0;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import ri0.BEConversationData;
import ri0.BERateAnswerModel;
import ri0.BERateConversationModel;
import ri0.j;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lsi0/a;", "", "Ldx/i;", "Ldx/b;", "Lri0/b;", "b", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "conversationId", "responseId", "Lri0/d;", "rateAnswerModel", "Loq/i0;", "c", "(Liy/b0;Liy/b0;Lri0/d;Ltq/e;)Ljava/lang/Object;", "Lri0/e;", "rateConversationModel", "d", "(Liy/b0;Lri0/e;Ltq/e;)Ljava/lang/Object;", "", "question", "Lmu/g;", "Lri0/j;", "a", "(Liy/b0;Ljava/lang/String;)Lmu/g;", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    g<i<b, j>> a(b0 conversationId, String question);

    Object b(e<? super i<? extends b, BEConversationData>> eVar);

    Object c(b0 b0Var, b0 b0Var2, BERateAnswerModel bERateAnswerModel, e<? super i<? extends b, i0>> eVar);

    Object d(b0 b0Var, BERateConversationModel bERateConversationModel, e<? super i<? extends b, i0>> eVar);
}
