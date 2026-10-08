package dm2;

import a14.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import cm2.c;
import cm2.d;
import du0.ArticleFooter;
import du0.ArticleHeader;
import du0.ArticleParagraph;
import em2.ArticleHeaderScreenData;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import mx.b;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ldm2/a;", "Lxw/f;", "Ldm2/a$a;", "Lcm2/d$a;", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(La14/i;)V", "Ldu0/c;", "Lem2/a;", "f", "(Ldu0/c;)Lem2/a;", "", "value", "Landroid/graphics/Bitmap;", "e", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "params", "c", "(Ldm2/a$a;)Lcm2/d$a;", "a", "La14/i;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i formatHeaderDatesWithDaysUseCase;

    /* JADX INFO: renamed from: dm2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Ldm2/a$a;", "", "Lcm2/c;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "openUrlAction", "Lkotlin/Function0;", "backAction", "<init>", "(Lcm2/c;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/c;", "c", "()Lcm2/c;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrlAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(c cVar, l<? super String, i0> lVar, er.a<i0> aVar) {
            this.state = cVar;
            this.openUrlAction = lVar;
            this.backAction = aVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<String, i0> b() {
            return this.openUrlAction;
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
            return t.c(this.state, params.state) && t.c(this.openUrlAction, params.openUrlAction) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.openUrlAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", openUrlAction=" + this.openUrlAction + ", backAction=" + this.backAction + ')';
        }
    }

    public a(i iVar) {
        this.formatHeaderDatesWithDaysUseCase = iVar;
    }

    private final Bitmap e(String value) {
        byte[] bArrDecode = Base64.decode(value, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    private final ArticleHeaderScreenData f(ArticleHeader articleHeader) {
        Label labelC;
        Label labelB = b.b(articleHeader.getCategory(), "category");
        Bitmap bitmapE = e(articleHeader.getPicture());
        OffsetDateTime publishedFrom = articleHeader.getPublishedFrom();
        if (publishedFrom == null || (labelC = this.formatHeaderDatesWithDaysUseCase.a(new i.Params(publishedFrom, null, 2, null))) == null) {
            labelC = Label.INSTANCE.c();
        }
        return new ArticleHeaderScreenData(labelB, bitmapE, labelC, b.b(articleHeader.getTitle(), "title"));
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        c30.b.c cVar;
        c state = params.getState();
        if (t.c(state, c.a.f28231a)) {
            return d.a.C0725a.f28233a;
        }
        if (!(state instanceof c.Initialized)) {
            throw new p();
        }
        c.Initialized initialized = (c.Initialized) state;
        ArticleHeaderScreenData articleHeaderScreenDataF = f(initialized.getArticle().getHeader());
        List<ArticleParagraph> listA = initialized.getArticle().a();
        ArticleFooter footer = initialized.getArticle().getFooter();
        if (footer != null) {
            cVar = new c30.b.c(null, null, null, b.b(footer.getContent(), "content"), null, null, new c30.a.Link(new LinkData(null, b.b(footer.getUrlDescription(), "urlDescription"), footer.getUrl(), LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null)), 51, null);
        } else {
            cVar = null;
        }
        return new d.a.Initialized(articleHeaderScreenDataF, listA, cVar, params.a(), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), Label.INSTANCE.c(), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
