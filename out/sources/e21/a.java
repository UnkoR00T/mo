package e21;

import dx.b;
import dx.i;
import g21.ConversationData;
import g21.RateAnswerModel;
import g21.f;
import iy.b0;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Le21/a;", "", "Ldx/i;", "Ldx/b;", "Lg21/b;", "b", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "conversationId", "", "question", "Lmu/g;", "Lg21/i;", "a", "(Liy/b0;Ljava/lang/String;)Lmu/g;", "responseId", "Lg21/d;", "rateAnswerModel", "Loq/i0;", "c", "(Liy/b0;Liy/b0;Lg21/d;Ltq/e;)Ljava/lang/Object;", "Lg21/f;", "ratingScale", "userReview", "d", "(Liy/b0;Lg21/f;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    g<i<b, g21.i>> a(b0 conversationId, String question);

    Object b(e<? super i<? extends b, ConversationData>> eVar);

    Object c(b0 b0Var, b0 b0Var2, RateAnswerModel rateAnswerModel, e<? super i<? extends b, i0>> eVar);

    Object d(b0 b0Var, f fVar, String str, e<? super i<? extends b, i0>> eVar);
}
