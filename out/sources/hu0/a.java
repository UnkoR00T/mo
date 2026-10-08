package hu0;

import du0.Article;
import du0.ArticleFooter;
import du0.ArticleHeader;
import du0.ArticleParagraph;
import du0.ArticleSummary;
import iu0.ArticleDto;
import iu0.ArticleFooterDto;
import iu0.ArticleHeaderDto;
import iu0.ArticleParagraphDto;
import iu0.ArticleSummaryDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Liu0/a;", "Ldu0/a;", "a", "(Liu0/a;)Ldu0/a;", "Liu0/d;", "Ldu0/d;", "d", "(Liu0/d;)Ldu0/d;", "Liu0/b;", "Ldu0/b;", "b", "(Liu0/b;)Ldu0/b;", "Liu0/c;", "Ldu0/c;", "c", "(Liu0/c;)Ldu0/c;", "Liu0/e;", "Ldu0/e;", "e", "(Liu0/e;)Ldu0/e;", "securityincidentservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final Article a(ArticleDto articleDto) {
        String id5 = articleDto.getId();
        ArticleHeader articleHeaderC = c(articleDto.getHeader());
        List<ArticleParagraphDto> listD = articleDto.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(d((ArticleParagraphDto) it.next()));
        }
        ArticleFooterDto footer = articleDto.getFooter();
        return new Article(id5, articleHeaderC, arrayList, footer != null ? b(footer) : null);
    }

    public static final ArticleFooter b(ArticleFooterDto articleFooterDto) {
        return new ArticleFooter(articleFooterDto.getUrl(), articleFooterDto.getContent(), articleFooterDto.getUrlDescription());
    }

    public static final ArticleHeader c(ArticleHeaderDto articleHeaderDto) {
        return new ArticleHeader(articleHeaderDto.getCategory(), articleHeaderDto.getPicture(), articleHeaderDto.getPublishedFrom(), articleHeaderDto.getTitle());
    }

    public static final ArticleParagraph d(ArticleParagraphDto articleParagraphDto) {
        return new ArticleParagraph(articleParagraphDto.getTitle(), articleParagraphDto.getContent());
    }

    public static final ArticleSummary e(ArticleSummaryDto articleSummaryDto) {
        return new ArticleSummary(articleSummaryDto.getArticleId(), articleSummaryDto.getCategory(), articleSummaryDto.getPicture(), articleSummaryDto.getTitle(), articleSummaryDto.getPublishedFrom());
    }
}
