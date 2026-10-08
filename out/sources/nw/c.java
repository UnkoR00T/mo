package nw;

import fr.k;
import fr.t;
import hw.TokenInfo;
import java.util.ArrayList;
import java.util.List;
import lr.m;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, d2 = {"Lnw/c;", "Lnw/i;", "Lhw/d;", "lexer", "<init>", "(Lhw/d;)V", "", "Lhw/f;", "a", "Ljava/util/List;", "()Ljava/util/List;", "cachedTokens", "b", "filteredTokens", "", "c", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "originalText", "Llr/i;", "d", "Llr/i;", "()Llr/i;", "originalTextRange", "e", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class c extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<TokenInfo> cachedTokens;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<TokenInfo> filteredTokens;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CharSequence originalText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lr.i originalTextRange;

    /* JADX INFO: renamed from: nw.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lnw/c$a;", "", "<init>", "()V", "Lyv/a;", "elementType", "", "c", "(Lyv/a;)Z", "Lhw/d;", "lexer", "Lnw/c$a$a;", "b", "(Lhw/d;)Lnw/c$a$a;", "a", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: nw.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lnw/c$a$a;", "", "", "Lhw/f;", "cachedTokens", "filteredTokens", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "()Ljava/util/List;", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCachedTokens", "getFilteredTokens", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final /* data */ class ResultOfCaching {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<TokenInfo> cachedTokens;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<TokenInfo> filteredTokens;

            public ResultOfCaching(List<TokenInfo> list, List<TokenInfo> list2) {
                this.cachedTokens = list;
                this.filteredTokens = list2;
            }

            public final List<TokenInfo> a() {
                return this.cachedTokens;
            }

            public final List<TokenInfo> b() {
                return this.filteredTokens;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ResultOfCaching)) {
                    return false;
                }
                ResultOfCaching resultOfCaching = (ResultOfCaching) other;
                return t.c(this.cachedTokens, resultOfCaching.cachedTokens) && t.c(this.filteredTokens, resultOfCaching.filteredTokens);
            }

            public int hashCode() {
                return (this.cachedTokens.hashCode() * 31) + this.filteredTokens.hashCode();
            }

            public String toString() {
                return "ResultOfCaching(cachedTokens=" + this.cachedTokens + ", filteredTokens=" + this.filteredTokens + ')';
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResultOfCaching b(hw.d lexer) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (lexer.getType() != null) {
                boolean zC = c(lexer.getType());
                TokenInfo tokenInfo = new TokenInfo(lexer.getType(), lexer.getTokenStart(), lexer.getTokenEnd(), arrayList.size(), zC ? -1 : arrayList2.size());
                arrayList.add(tokenInfo);
                if (!zC) {
                    arrayList2.add(tokenInfo);
                }
                lexer.a();
            }
            return new ResultOfCaching(arrayList, arrayList2);
        }

        private final boolean c(yv.a elementType) {
            return t.c(elementType, yv.e.N);
        }

        private Companion() {
        }
    }

    public c(hw.d dVar) {
        Companion.ResultOfCaching resultOfCachingB = INSTANCE.b(dVar);
        List<TokenInfo> listA = resultOfCachingB.a();
        List<TokenInfo> listB = resultOfCachingB.b();
        this.cachedTokens = listA;
        this.filteredTokens = listB;
        this.originalText = dVar.getOriginalText();
        this.originalTextRange = m.w(dVar.getBufferStart(), dVar.getBufferEnd());
        f();
    }

    @Override // nw.i
    public List<TokenInfo> a() {
        return this.cachedTokens;
    }

    @Override // nw.i
    public List<TokenInfo> b() {
        return this.filteredTokens;
    }

    @Override // nw.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public CharSequence getOriginalText() {
        return this.originalText;
    }

    @Override // nw.i
    /* JADX INFO: renamed from: d, reason: from getter */
    public lr.i getOriginalTextRange() {
        return this.originalTextRange;
    }
}
