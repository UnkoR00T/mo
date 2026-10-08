package gm2;

import a14.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import du0.ArticleSummary;
import er.l;
import er.p;
import fr.t;
import ja.n0;
import ja.u0;
import java.time.OffsetDateTime;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u0004*\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgm2/c;", "Lxw/f;", "Lgm2/c$a;", "Lja/n0;", "Ln50/g;", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(La14/i;)V", "Ldu0/e;", "Lkotlin/Function1;", "", "Loq/i0;", "navigateToDetails", "f", "(Ldu0/e;Ler/l;)Ln50/g;", "value", "Landroid/graphics/Bitmap;", "l", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "params", "i", "(Lgm2/c$a;)Lja/n0;", "a", "La14/i;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, n0<DefaultSingleCardData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i formatHeaderDatesWithDaysUseCase;

    /* JADX INFO: renamed from: gm2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lgm2/c$a;", "", "Lja/n0;", "Ldu0/e;", "articlesPagingData", "Lkotlin/Function0;", "Loq/i0;", "navigateBack", "Lkotlin/Function1;", "", "navigateToDetails", "<init>", "(Lja/n0;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/n0;", "()Lja/n0;", "b", "Ler/a;", "getNavigateBack", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0<ArticleSummary> articlesPagingData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> navigateToDetails;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(n0<ArticleSummary> n0Var, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.articlesPagingData = n0Var;
            this.navigateBack = aVar;
            this.navigateToDetails = lVar;
        }

        public final n0<ArticleSummary> a() {
            return this.articlesPagingData;
        }

        public final l<String, i0> b() {
            return this.navigateToDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.articlesPagingData, params.articlesPagingData) && t.c(this.navigateBack, params.navigateBack) && t.c(this.navigateToDetails, params.navigateToDetails);
        }

        public int hashCode() {
            return (((this.articlesPagingData.hashCode() * 31) + this.navigateBack.hashCode()) * 31) + this.navigateToDetails.hashCode();
        }

        public String toString() {
            return "Params(articlesPagingData=" + this.articlesPagingData + ", navigateBack=" + this.navigateBack + ", navigateToDetails=" + this.navigateToDetails + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldu0/e;", "article", "Ln50/g;", "<anonymous>", "(Ldu0/e;)Ln50/g;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<ArticleSummary, e<? super DefaultSingleCardData>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f74966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f74967f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f74969h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, e<? super b> eVar) {
            super(2, eVar);
            this.f74969h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ArticleSummary articleSummary = (ArticleSummary) this.f74967f;
            uq.b.e();
            if (this.f74966e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c.this.f(articleSummary, this.f74969h.b());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ArticleSummary articleSummary, e<? super DefaultSingleCardData> eVar) {
            return ((b) v(articleSummary, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = c.this.new b(this.f74969h, eVar);
            bVar.f74967f = obj;
            return bVar;
        }
    }

    public c(i iVar) {
        this.formatHeaderDatesWithDaysUseCase = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DefaultSingleCardData f(final ArticleSummary articleSummary, final l<? super String, i0> lVar) {
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Image(l(articleSummary.getPicture()), null, null, 6, null), 3, null);
        SingleCardLabel singleCardLabelB = n50.l.b(mx.b.b(articleSummary.getCategory(), "category"), null, null, 3, null);
        n50.b.Title title = new n50.b.Title(n50.l.b(mx.b.b(articleSummary.getTitle(), "title"), null, null, 3, null));
        OffsetDateTime publishedFrom = articleSummary.getPublishedFrom();
        return new DefaultSingleCardData(null, new er.a() { // from class: gm2.b
            @Override // er.a
            public final Object a() {
                return c.h(lVar, articleSummary);
            }
        }, false, null, null, false, null, null, new BodySection(singleCardLabelB, title, publishedFrom != null ? n50.l.b(this.formatHeaderDatesWithDaysUseCase.a(new i.Params(publishedFrom, null, 2, null)), null, null, 3, null) : null), leadingSection, x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, ArticleSummary articleSummary) {
        lVar.b(articleSummary.getArticleId());
        return i0.f148189a;
    }

    private final Bitmap l(String value) {
        byte[] bArrDecode = Base64.decode(value, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public n0<DefaultSingleCardData> b(Params params) {
        return u0.c(params.a(), new b(params, null));
    }
}
