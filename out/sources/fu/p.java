package fu;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljava/util/regex/Matcher;", "", "from", "", "input", "Lfu/l;", "e", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lfu/l;", "f", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lfu/l;", "Ljava/util/regex/MatchResult;", "Llr/i;", "g", "(Ljava/util/regex/MatchResult;)Llr/i;", "groupIndex", "h", "(Ljava/util/regex/MatchResult;I)Llr/i;", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final l e(Matcher matcher, int i15, CharSequence charSequence) {
        if (matcher.find(i15)) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lr.i g(MatchResult matchResult) {
        return lr.m.w(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lr.i h(MatchResult matchResult, int i15) {
        return lr.m.w(matchResult.start(i15), matchResult.end(i15));
    }
}
