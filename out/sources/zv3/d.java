package zv3;

import android.text.Spanned;
import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzv3/d;", "Ll00/e;", "Lzv3/d$a;", "Li70/n;", "a", "b", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lzv3/d$a;", "", "a", "Lzv3/d$a$a;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: zv3.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006&"}, d2 = {"Lzv3/d$a$a;", "Lzv3/d$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "", "Lzv3/d$b;", "items", "Lb30/a;", "accordionData", "<init>", "(Li50/a;Ler/a;Ljava/util/List;Lb30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ler/a;", "c", "()Ler/a;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "d", "Lb30/a;", "()Lb30/a;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onCloseAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<b> items;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData accordionData;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, List<? extends b> list, AccordionData accordionData) {
                this.baseScaffoldData = baseScaffoldData;
                this.onCloseAction = aVar;
                this.items = list;
                this.accordionData = accordionData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AccordionData getAccordionData() {
                return this.accordionData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final er.a<i0> c() {
                return this.onCloseAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.baseScaffoldData, initialized.baseScaffoldData) && t.c(this.onCloseAction, initialized.onCloseAction) && t.c(this.items, initialized.items) && t.c(this.accordionData, initialized.accordionData);
            }

            public int hashCode() {
                return (((((this.baseScaffoldData.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.items.hashCode()) * 31) + this.accordionData.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", onCloseAction=" + this.onCloseAction + ", items=" + this.items + ", accordionData=" + this.accordionData + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzv3/d$b;", "", "b", "a", "Lzv3/d$b$a;", "Lzv3/d$b$b;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: zv3.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lzv3/d$b$a;", "Lzv3/d$b;", "Lmx/a;", "question", "Landroid/text/Spanned;", "answer", "Lkotlin/Function1;", "", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Landroid/text/Spanned;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Landroid/text/Spanned;", "()Landroid/text/Spanned;", "Ler/l;", "()Ler/l;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MarkdownItem implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label question;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Spanned answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<String, i0> onClick;

            /* JADX WARN: Multi-variable type inference failed */
            public MarkdownItem(Label label, Spanned spanned, er.l<? super String, i0> lVar) {
                this.question = label;
                this.answer = spanned;
                this.onClick = lVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Spanned getAnswer() {
                return this.answer;
            }

            public final er.l<String, i0> b() {
                return this.onClick;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getQuestion() {
                return this.question;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarkdownItem)) {
                    return false;
                }
                MarkdownItem markdownItem = (MarkdownItem) other;
                return t.c(this.question, markdownItem.question) && t.c(this.answer, markdownItem.answer) && t.c(this.onClick, markdownItem.onClick);
            }

            public int hashCode() {
                return (((this.question.hashCode() * 31) + this.answer.hashCode()) * 31) + this.onClick.hashCode();
            }

            public String toString() {
                return "MarkdownItem(question=" + this.question + ", answer=" + ((Object) this.answer) + ", onClick=" + this.onClick + ')';
            }
        }

        /* JADX INFO: renamed from: zv3.d$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzv3/d$b$b;", "Lzv3/d$b;", "Lmx/a;", "question", "answer", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TextItem implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label question;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label answer;

            public TextItem(Label label, Label label2) {
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
                if (!(other instanceof TextItem)) {
                    return false;
                }
                TextItem textItem = (TextItem) other;
                return t.c(this.question, textItem.question) && t.c(this.answer, textItem.answer);
            }

            public int hashCode() {
                return (this.question.hashCode() * 31) + this.answer.hashCode();
            }

            public String toString() {
                return "TextItem(question=" + this.question + ", answer=" + this.answer + ')';
            }
        }
    }
}
