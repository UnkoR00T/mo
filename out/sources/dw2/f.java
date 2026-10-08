package dw2;

import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldw2/f;", "Ll00/e;", "Ldw2/f$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: dw2.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, d2 = {"Ldw2/f$a;", "", "Li50/a;", "scaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "", "Ldw2/f$a$a;", "questionAnswerList", "Lb30/a;", "questionAccordionData", "<init>", "(Li50/a;Ler/a;Ljava/util/List;Lb30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ler/a;", "()Ler/a;", "Ljava/util/List;", "getQuestionAnswerList", "()Ljava/util/List;", "d", "Lb30/a;", "()Lb30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<QuestionAnswerData> questionAnswerList;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccordionData questionAccordionData;

        public Data(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, List<QuestionAnswerData> list, AccordionData accordionData) {
            this.scaffoldData = baseScaffoldData;
            this.onCloseAction = aVar;
            this.questionAnswerList = list;
            this.questionAccordionData = accordionData;
        }

        public final er.a<i0> a() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AccordionData getQuestionAccordionData() {
            return this.questionAccordionData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.onCloseAction, data.onCloseAction) && t.c(this.questionAnswerList, data.questionAnswerList) && t.c(this.questionAccordionData, data.questionAccordionData);
        }

        public int hashCode() {
            return (((((this.scaffoldData.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.questionAnswerList.hashCode()) * 31) + this.questionAccordionData.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", onCloseAction=" + this.onCloseAction + ", questionAnswerList=" + this.questionAnswerList + ", questionAccordionData=" + this.questionAccordionData + ')';
        }

        /* JADX INFO: renamed from: dw2.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Ldw2/f$a$a;", "", "Lmx/a;", "question", "answer", "Lj30/a;", "buttonData", "<init>", "(Lmx/a;Lmx/a;Lj30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lj30/a;", "()Lj30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class QuestionAnswerData {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f44956d = ButtonTextData.f99099f;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label question;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData buttonData;

            public QuestionAnswerData(Label label, Label label2, ButtonTextData buttonTextData) {
                this.question = label;
                this.answer = label2;
                this.buttonData = buttonTextData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getAnswer() {
                return this.answer;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonTextData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getQuestion() {
                return this.question;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuestionAnswerData)) {
                    return false;
                }
                QuestionAnswerData questionAnswerData = (QuestionAnswerData) other;
                return t.c(this.question, questionAnswerData.question) && t.c(this.answer, questionAnswerData.answer) && t.c(this.buttonData, questionAnswerData.buttonData);
            }

            public int hashCode() {
                int iHashCode = ((this.question.hashCode() * 31) + this.answer.hashCode()) * 31;
                ButtonTextData buttonTextData = this.buttonData;
                return iHashCode + (buttonTextData == null ? 0 : buttonTextData.hashCode());
            }

            public String toString() {
                return "QuestionAnswerData(question=" + this.question + ", answer=" + this.answer + ", buttonData=" + this.buttonData + ')';
            }

            public /* synthetic */ QuestionAnswerData(Label label, Label label2, ButtonTextData buttonTextData, int i15, fr.k kVar) {
                this(label, label2, (i15 & 4) != 0 ? null : buttonTextData);
            }
        }
    }
}
