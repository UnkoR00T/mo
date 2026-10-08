package j21;

import g21.ConversationData;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lj21/i1;", "", "<init>", "()V", "", "Lj21/h1;", "conversations", "Lj21/h1$a;", "newAnswer", "Lg21/b;", "conversationData", "", "b", "(Ljava/util/List;Lj21/h1$a;Lg21/b;)Ljava/util/List;", "", "question", "errorMessage", "", "showActionButton", "e", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;", "d", "(Ljava/util/List;)Ljava/util/List;", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Liy/b0;", "responseId", "Lg21/e;", "rating", "c", "(Ljava/util/List;Liy/b0;Lg21/e;)Ljava/util/List;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f98767a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj21/i1$a;", "", "<init>", "()V", "", "NO_SUCH_ELEMENT_INDEX", "I", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public final List<h1> a(List<? extends h1> conversations, String question) {
        List<h1> listI1 = pq.v.i1(conversations);
        listI1.add(new h1.Question(question));
        listI1.add(h1.e.f98761a);
        return listI1;
    }

    public final List<h1> b(List<? extends h1> conversations, h1.a newAnswer, ConversationData conversationData) {
        List<h1> listI1 = pq.v.i1(conversations);
        listI1.remove(pq.v.p(listI1));
        listI1.add(newAnswer);
        h1.a.Full full = newAnswer instanceof h1.a.Full ? (h1.a.Full) newAnswer : null;
        if (full != null) {
            int currentMessages = full.getCurrentMessages();
            if (currentMessages == conversationData.getLimits().getMaxQuestions() - 1) {
                listI1.add(new h1.Warning(conversationData.getStaticMessages().getLimitExceededWarningMessage()));
                return listI1;
            }
            if (currentMessages == conversationData.getLimits().getMaxQuestions()) {
                listI1.add(new h1.LimitExceeded(conversationData.getStaticMessages().getLimitExceededMessage()));
            }
        }
        return listI1;
    }

    public final List<h1> c(List<? extends h1> conversations, iy.b0 responseId, g21.e rating) {
        List<h1> listI1 = pq.v.i1(conversations);
        Iterator<h1> it = listI1.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            h1 next = it.next();
            h1.a.Full full = next instanceof h1.a.Full ? (h1.a.Full) next : null;
            if (fr.t.c(full != null ? full.getResponseId() : null, responseId)) {
                break;
            }
            i15++;
        }
        Integer numValueOf = Integer.valueOf(i15);
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        if (num != null) {
            int iIntValue = num.intValue();
            listI1.set(iIntValue, h1.a.Full.b((h1.a.Full) listI1.get(iIntValue), null, null, null, null, null, false, 0, false, rating, GF2Field.MASK, null));
        }
        return listI1;
    }

    public final List<h1> d(List<? extends h1> conversations) {
        List<h1> listI1 = pq.v.i1(conversations);
        listI1.remove(pq.v.p(listI1));
        return listI1;
    }

    public final List<h1> e(List<? extends h1> conversations, String question, String errorMessage, boolean showActionButton) {
        List<h1> listI1 = pq.v.i1(conversations);
        listI1.remove(pq.v.p(listI1));
        listI1.add(new h1.Error(question, errorMessage, showActionButton));
        return listI1;
    }
}
