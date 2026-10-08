package fu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00162\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\"2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lfu/o;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lfu/q;", "option", "(Ljava/lang/String;Lfu/q;)V", "", "input", "", "f", "(Ljava/lang/CharSequence;)Z", "a", "", "startIndex", "Lfu/l;", "b", "(Ljava/lang/CharSequence;I)Lfu/l;", "e", "(Ljava/lang/CharSequence;)Lfu/l;", "replacement", "h", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "g", "(Ljava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "limit", "", "i", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "Ljava/util/regex/Pattern;", "d", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Pattern nativePattern;

    /* JADX INFO: renamed from: fu.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfu/o$a;", "", "<init>", "()V", "", "flags", "b", "(I)I", "", "literal", "c", "(Ljava/lang/String;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int flags) {
            return (flags & 2) != 0 ? flags | 64 : flags;
        }

        public final String c(String literal) {
            return Pattern.quote(literal);
        }

        private Companion() {
        }
    }

    public o(Pattern pattern) {
        this.nativePattern = pattern;
    }

    public static /* synthetic */ l c(o oVar, CharSequence charSequence, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        return oVar.b(charSequence, i15);
    }

    public final boolean a(CharSequence input) {
        return this.nativePattern.matcher(input).find();
    }

    public final l b(CharSequence input, int startIndex) {
        return p.e(this.nativePattern.matcher(input), startIndex, input);
    }

    public final String d() {
        return this.nativePattern.pattern();
    }

    public final l e(CharSequence input) {
        return p.f(this.nativePattern.matcher(input), input);
    }

    public final boolean f(CharSequence input) {
        return this.nativePattern.matcher(input).matches();
    }

    public final String g(CharSequence input, er.l<? super l, ? extends CharSequence> transform) {
        int iIntValue = 0;
        l lVarC = c(this, input, 0, 2, null);
        if (lVarC == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb5 = new StringBuilder(length);
        do {
            sb5.append(input, iIntValue, lVarC.a().t().intValue());
            sb5.append(transform.b(lVarC));
            iIntValue = lVarC.a().s().intValue() + 1;
            lVarC = lVarC.next();
            if (iIntValue >= length) {
                break;
            }
        } while (lVarC != null);
        if (iIntValue < length) {
            sb5.append(input, iIntValue, length);
        }
        return sb5.toString();
    }

    public final String h(CharSequence input, String replacement) {
        return this.nativePattern.matcher(input).replaceAll(replacement);
    }

    public final List<String> i(CharSequence input, int limit) {
        g0.Q0(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return pq.v.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(limit > 0 ? lr.m.j(limit, 10) : 10);
        int i15 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i15 >= 0 && arrayList.size() == i15) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        return this.nativePattern.toString();
    }

    public o(String str) {
        this(Pattern.compile(str));
    }

    public o(String str, q qVar) {
        this(Pattern.compile(str, INSTANCE.b(qVar.getValue())));
    }
}
