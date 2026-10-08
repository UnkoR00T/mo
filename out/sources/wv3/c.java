package wv3;

import er.l;
import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwv3/c;", "", "b", "a", "Lwv3/c$a;", "Lwv3/c$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: wv3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lwv3/c$b;", "Lwv3/c;", "Lmx/a;", "question", "answer", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaqTextItem implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label question;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label answer;

        public FaqTextItem(Label label, Label label2) {
            this.question = label;
            this.answer = label2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getAnswer() {
            return this.answer;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getQuestion() {
            return this.question;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaqTextItem)) {
                return false;
            }
            FaqTextItem faqTextItem = (FaqTextItem) other;
            return t.c(this.question, faqTextItem.question) && t.c(this.answer, faqTextItem.answer);
        }

        public int hashCode() {
            return (this.question.hashCode() * 31) + this.answer.hashCode();
        }

        public String toString() {
            return "FaqTextItem(question=" + this.question + ", answer=" + this.answer + ")";
        }
    }

    /* JADX INFO: renamed from: wv3.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwv3/c$a;", "Lwv3/c;", "Lmx/a;", "question", "", "markdownString", "Lkotlin/Function1;", "Loq/i0;", "actionOnClick", "<init>", "(Lmx/a;Ljava/lang/String;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/lang/String;", "Ler/l;", "()Ler/l;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaqMarkdownItem implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label question;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String markdownString;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> actionOnClick;

        /* JADX WARN: Multi-variable type inference failed */
        public FaqMarkdownItem(Label label, String str, l<? super String, i0> lVar) {
            this.question = label;
            this.markdownString = str;
            this.actionOnClick = lVar;
        }

        public final l<String, i0> a() {
            return this.actionOnClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMarkdownString() {
            return this.markdownString;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getQuestion() {
            return this.question;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaqMarkdownItem)) {
                return false;
            }
            FaqMarkdownItem faqMarkdownItem = (FaqMarkdownItem) other;
            return t.c(this.question, faqMarkdownItem.question) && t.c(this.markdownString, faqMarkdownItem.markdownString) && t.c(this.actionOnClick, faqMarkdownItem.actionOnClick);
        }

        public int hashCode() {
            int iHashCode = ((this.question.hashCode() * 31) + this.markdownString.hashCode()) * 31;
            l<String, i0> lVar = this.actionOnClick;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "FaqMarkdownItem(question=" + this.question + ", markdownString=" + this.markdownString + ", actionOnClick=" + this.actionOnClick + ")";
        }

        public /* synthetic */ FaqMarkdownItem(Label label, String str, l lVar, int i15, k kVar) {
            this(label, str, (i15 & 4) != 0 ? null : lVar);
        }
    }
}
