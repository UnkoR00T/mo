package mw;

import er.l;
import fr.w;
import fu.o;
import fu.q;
import java.util.List;
import oq.r;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmw/f;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "c", "(Liw/d$a;Ljw/b;)I", "Liw/h;", "productionHolder", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", "", "a", "(Liw/d$a;Ljw/b;)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class f implements kw.d<iw.f.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f128694c = "address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f128695d = "[a-zA-Z][a-zA-Z0-9-]*";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f128696e = "[A-Za-z:_][A-Za-z0-9_.:-]*";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f128697f = "\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\")";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f128698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f128699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f128700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<r<o, o>> f128701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final o f128702k;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loq/r;", "Lfu/o;", "it", "", "c", "(Loq/r;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 0})
    static final class a extends w implements l<r<? extends o, ? extends o>, CharSequence> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f128703b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence b(r<o, o> rVar) {
            return '(' + rVar.c().d() + ')';
        }
    }

    static {
        String str = "\\s+[A-Za-z:_][A-Za-z0-9_.:-]*(?:\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\"))?";
        f128698g = str;
        String str2 = "<[a-zA-Z][a-zA-Z0-9-]*(?:" + str + ")*\\s*/?>";
        f128699h = str2;
        String str3 = "</[a-zA-Z][a-zA-Z0-9-]*\\s*>";
        f128700i = str3;
        q qVar = q.IGNORE_CASE;
        List<r<o, o>> listQ = v.q(new r(new o("<(?:script|pre|style)(?: |>|$)", qVar), new o("</(?:script|style|pre)>", qVar)), new r(new o("<!--"), new o("-->")), new r(new o("<\\?"), new o("\\?>")), new r(new o("<![A-Z]"), new o(">")), new r(new o("<!\\[CDATA\\["), new o("\\]\\]>")), new r(new o("</?(?:" + fu.r.P("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", "|", false, 4, null) + ")(?: |/?>|$)", qVar), null), new r(new o("(?:" + str2 + '|' + str3 + ")(?: |$)"), null));
        f128701j = listQ;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("^(");
        sb5.append(v.v0(listQ, "|", null, null, 0, null, a.f128703b, 30, null));
        sb5.append(')');
        f128702k = new o(sb5.toString());
    }

    private final int c(iw.d.a pos, jw.b constraints) {
        fu.l lVarC;
        kw.d.Companion companion = kw.d.INSTANCE;
        if (!companion.a(pos, constraints)) {
            return -1;
        }
        CharSequence charSequenceD = pos.d();
        int iC = kw.d.Companion.c(companion, charSequenceD, 0, 2, null);
        if (iC >= charSequenceD.length() || charSequenceD.charAt(iC) != '<' || (lVarC = o.c(f128702k, charSequenceD.subSequence(iC, charSequenceD.length()).toString(), 0, 2, null)) == null) {
            return -1;
        }
        hw.a aVar = hw.a.f86718a;
        int size = lVarC.getGroups().size();
        List<r<o, o>> list = f128701j;
        if (!(size == list.size() + 2)) {
            throw new yv.d("There are some excess capturing groups probably!");
        }
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            if (lVarC.getGroups().get(i15 + 2) != null) {
                return i15;
            }
        }
        hw.a aVar2 = hw.a.f86718a;
        throw new yv.d("Match found but all groups are empty!");
    }

    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        int iC = c(pos, constraints);
        return iC >= 0 && iC < 6;
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        int iC = c(pos, stateInfo.getCurrentConstraints());
        return iC != -1 ? v.e(new lw.f(stateInfo.getCurrentConstraints(), productionHolder, f128701j.get(iC).d(), pos)) : v.n();
    }
}
