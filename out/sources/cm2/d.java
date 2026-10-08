package cm2;

import du0.ArticleParagraph;
import em2.ArticleHeaderScreenData;
import i50.BaseScaffoldData;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcm2/d;", "Ll00/e;", "Lcm2/d$a;", "a", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcm2/d$a;", "", "<init>", "()V", "a", "b", "Lcm2/d$a$a;", "Lcm2/d$a$b;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: cm2.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcm2/d$a$a;", "Lcm2/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0725a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0725a f28233a = new C0725a();

            private C0725a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0725a);
            }

            public int hashCode() {
                return 1815193927;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: cm2.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, d2 = {"Lcm2/d$a$b;", "Lcm2/d$a;", "Lem2/a;", "articleHeader", "", "Ldu0/d;", "articleContent", "Lc30/b;", "alertData", "Lkotlin/Function0;", "Loq/i0;", "onBackButtonClick", "Li50/a;", "scaffoldData", "<init>", "(Lem2/a;Ljava/util/List;Lc30/b;Ler/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lem2/a;", "c", "()Lem2/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lc30/b;", "()Lc30/b;", "d", "Ler/a;", "()Ler/a;", "e", "Li50/a;", "()Li50/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ArticleHeaderScreenData articleHeader;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ArticleParagraph> articleContent;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackButtonClick;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Initialized(ArticleHeaderScreenData articleHeaderScreenData, List<ArticleParagraph> list, c30.b bVar, er.a<i0> aVar, BaseScaffoldData baseScaffoldData) {
                super(null);
                this.articleHeader = articleHeaderScreenData;
                this.articleContent = list;
                this.alertData = bVar;
                this.onBackButtonClick = aVar;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            public final List<ArticleParagraph> b() {
                return this.articleContent;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ArticleHeaderScreenData getArticleHeader() {
                return this.articleHeader;
            }

            public final er.a<i0> d() {
                return this.onBackButtonClick;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.articleHeader, initialized.articleHeader) && fr.t.c(this.articleContent, initialized.articleContent) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.onBackButtonClick, initialized.onBackButtonClick) && fr.t.c(this.scaffoldData, initialized.scaffoldData);
            }

            public int hashCode() {
                int iHashCode = ((this.articleHeader.hashCode() * 31) + this.articleContent.hashCode()) * 31;
                c30.b bVar = this.alertData;
                return ((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.onBackButtonClick.hashCode()) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Initialized(articleHeader=" + this.articleHeader + ", articleContent=" + this.articleContent + ", alertData=" + this.alertData + ", onBackButtonClick=" + this.onBackButtonClick + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
