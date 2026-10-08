package yv3;

import android.text.Spanned;
import aw3.b;
import b30.AccordionData;
import b30.AccordionElement;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zv3.c;
import zv3.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyv3/a;", "Lxw/f;", "Lyv3/a$a;", "Lzv3/d$a;", "Lu10/d;", "markdownParser", "<init>", "(Lu10/d;)V", "", "Lwv3/c;", "params", "Lzv3/d$b;", "e", "(Ljava/util/List;Lyv3/a$a;)Ljava/util/List;", "c", "(Lyv3/a$a;)Lzv3/d$a;", "a", "Lu10/d;", "getMarkdownParser", "()Lu10/d;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u10.d markdownParser;

    /* JADX INFO: renamed from: yv3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lyv3/a$a;", "", "Lzv3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function1;", "", "onLink", "<init>", "(Lzv3/c;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzv3/c;", "c", "()Lzv3/c;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLink;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(c cVar, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = cVar;
            this.onClose = aVar;
            this.onLink = lVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final l<String, i0> b() {
            return this.onLink;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onLink, params.onLink);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onLink.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onLink=" + this.onLink + ')';
        }
    }

    public a(u10.d dVar) {
        this.markdownParser = dVar;
    }

    private final List<d.b> e(List<? extends wv3.c> list, Params params) {
        d.b textItem;
        List<? extends wv3.c> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (wv3.c cVar : list2) {
            if (cVar instanceof wv3.c.FaqMarkdownItem) {
                wv3.c.FaqMarkdownItem faqMarkdownItem = (wv3.c.FaqMarkdownItem) cVar;
                Label question = faqMarkdownItem.getQuestion();
                Spanned spanned = this.markdownParser.parse(faqMarkdownItem.getMarkdownString());
                l<String, i0> lVarA = faqMarkdownItem.a();
                if (lVarA == null) {
                    lVarA = params.b();
                }
                textItem = new d.b.MarkdownItem(question, spanned, lVarA);
            } else {
                if (!(cVar instanceof wv3.c.FaqTextItem)) {
                    throw new p();
                }
                wv3.c.FaqTextItem faqTextItem = (wv3.c.FaqTextItem) cVar;
                textItem = new d.b.TextItem(faqTextItem.getQuestion(), faqTextItem.getAnswer());
            }
            arrayList.add(textItem);
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        AccordionElement accordionElement;
        c state = params.getState();
        if (!(state instanceof c.DataSet)) {
            throw new p();
        }
        c.DataSet dataSet = (c.DataSet) state;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), dataSet.getData().getScreenTitle(), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        List<d.b> listE = e(dataSet.getData().a(), params);
        List<d.b> listE2 = e(dataSet.getData().a(), params);
        ArrayList arrayList = new ArrayList(v.y(listE2, 10));
        for (d.b bVar : listE2) {
            if (bVar instanceof d.b.TextItem) {
                d.b.TextItem textItem = (d.b.TextItem) bVar;
                accordionElement = new AccordionElement(null, textItem.getQuestion(), null, false, null, false, new aw3.d(textItem.getAnswer()), 61, null);
            } else {
                if (!(bVar instanceof d.b.MarkdownItem)) {
                    throw new p();
                }
                d.b.MarkdownItem markdownItem = (d.b.MarkdownItem) bVar;
                accordionElement = new AccordionElement(null, markdownItem.getQuestion(), null, false, null, false, new b(markdownItem.getAnswer(), markdownItem.b()), 61, null);
            }
            arrayList.add(accordionElement);
        }
        return new d.a.Initialized(baseScaffoldData, aVarA, listE, new AccordionData(arrayList));
    }
}
