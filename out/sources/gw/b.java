package gw;

import er.l;
import fr.w;
import fu.k;
import fu.o;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lgw/b;", "", "<init>", "()V", "", "text", "", "processEntities", "processEscapes", "", "b", "(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;", "", "", "Ljava/util/Map;", "replacements", "Lfu/o;", "c", "Lfu/o;", "REGEX", "d", "REGEX_ESCAPES", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f77346a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Character, String> replacements = v0.l(y.a('\"', "&quot;"), y.a('&', "&amp;"), y.a('<', "&lt;"), y.a('>', "&gt;"));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final o REGEX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final o REGEX_ESCAPES;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfu/l;", "match", "", "c", "(Lfu/l;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 0})
    static final class a extends w implements l<fu.l, CharSequence> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f77350b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15) {
            super(1);
            this.f77350b = z15;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0063  */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence b(fu.l lVar) {
            Integer numValueOf;
            k kVarB = lVar.b();
            if (kVarB.size() > 5 && kVarB.get(5) != null) {
                char cCharAt = kVarB.get(5).getValue().charAt(0);
                String str = (String) b.replacements.get(Character.valueOf(cCharAt));
                return str == null ? String.valueOf(cCharAt) : str;
            }
            if (kVarB.get(4) != null) {
                String str2 = (String) b.replacements.get(Character.valueOf(kVarB.get(4).getValue().charAt(0)));
                return str2 == null ? lVar.getValue() : str2;
            }
            if (!this.f77350b) {
                numValueOf = null;
            } else if (kVarB.get(1) != null) {
                numValueOf = gw.a.f77344a.a().get(lVar.getValue());
            } else if (kVarB.get(2) != null) {
                numValueOf = Integer.valueOf(Integer.parseInt(kVarB.get(2).getValue()));
            } else if (kVarB.get(3) != null) {
                numValueOf = Integer.valueOf(Integer.parseInt(kVarB.get(3).getValue(), fu.a.a(16)));
            } else {
                numValueOf = null;
            }
            Character chValueOf = numValueOf != null ? Character.valueOf((char) numValueOf.intValue()) : null;
            if (chValueOf != null) {
                String str3 = (String) b.replacements.get(chValueOf);
                return str3 == null ? chValueOf.toString() : str3;
            }
            return "&amp;" + lVar.getValue().substring(1);
        }
    }

    static {
        o oVar = new o("&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|([\"&<>])");
        REGEX = oVar;
        REGEX_ESCAPES = new o(oVar.d() + "|\\\\([!\"#\\$%&'\\(\\)\\*\\+,\\-.\\/:;<=>\\?@\\[\\\\\\]\\^_`{\\|}~])");
    }

    private b() {
    }

    public final String b(CharSequence text, boolean processEntities, boolean processEscapes) {
        return (processEscapes ? REGEX_ESCAPES : REGEX).g(text, new a(processEntities));
    }
}
