package mw;

import fr.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmw/g;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "Liw/h;", "productionHolder", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "a", "(Liw/d$a;Ljw/b;)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class g implements kw.d<iw.f.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: mw.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fR\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lmw/g$a;", "", "<init>", "()V", "", "text", "", "start", "g", "(Ljava/lang/CharSequence;I)I", "Llr/i;", "range", "t", "a", "(Llr/i;I)Llr/i;", "Liw/d$a;", "Liw/d;", "pos", "", "b", "(Liw/d$a;)Z", "startOffset", "", "c", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "d", "(Ljava/lang/CharSequence;I)Llr/i;", "f", "e", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final int g(CharSequence text, int start) {
            char cCharAt;
            char cCharAt2;
            while (start < text.length() && ((cCharAt2 = text.charAt(start)) == ' ' || cCharAt2 == '\t')) {
                start++;
            }
            if (start < text.length() && text.charAt(start) == '\n') {
                while (true) {
                    start++;
                    if (start >= text.length() || ((cCharAt = text.charAt(start)) != ' ' && cCharAt != '\t')) {
                        break;
                    }
                }
            }
            return start;
        }

        public final lr.i a(lr.i range, int t15) {
            return new lr.i(range.getFirst() + t15, range.getLast() + t15 + 1);
        }

        public final boolean b(iw.d.a pos) {
            return pos.getLocalPos() == -1 || pos.a() == null;
        }

        public final List<lr.i> c(CharSequence text, int startOffset) {
            int last;
            int last2;
            lr.i iVarD;
            char cCharAt;
            lr.i iVarE = e(text, kw.d.INSTANCE.b(text, startOffset));
            if (iVarE == null || (last2 = (last = iVarE.getLast()) + 1) >= text.length() || text.charAt(last2) != ':' || (iVarD = d(text, g(text, last + 2))) == null) {
                return null;
            }
            lr.i iVarF = f(text, g(text, iVarD.getLast() + 1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(iVarE);
            arrayList.add(iVarD);
            if (iVarF != null) {
                int last3 = iVarF.getLast();
                while (true) {
                    last3++;
                    if (last3 >= text.length() || ((cCharAt = text.charAt(last3)) != ' ' && cCharAt != '\t')) {
                        break;
                    }
                }
                if (last3 >= text.length() || text.charAt(last3) == '\n') {
                    arrayList.add(iVarF);
                }
            }
            return arrayList;
        }

        public final lr.i d(CharSequence text, int start) {
            char cCharAt;
            int i15;
            char cCharAt2;
            int i16;
            char cCharAt3;
            if (start >= text.length()) {
                return null;
            }
            if (text.charAt(start) == '<') {
                int i17 = start + 1;
                while (i17 < text.length()) {
                    char cCharAt4 = text.charAt(i17);
                    if (cCharAt4 == '>') {
                        return new lr.i(start, i17);
                    }
                    if (cCharAt4 == '<' || cCharAt4 == '>' || cCharAt4 == ' ' || cCharAt4 == '\t' || cCharAt4 == '\n') {
                        break;
                    }
                    if (cCharAt4 == '\\' && (i16 = i17 + 1) < text.length() && (cCharAt3 = text.charAt(i16)) != ' ' && cCharAt3 != '\t' && cCharAt3 != '\n') {
                        i17 = i16;
                    }
                    i17++;
                }
                return null;
            }
            int i18 = start;
            boolean z15 = false;
            while (i18 < text.length() && (cCharAt = text.charAt(i18)) != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt > 27) {
                if (cCharAt != '(') {
                    if (cCharAt == ')') {
                        if (!z15) {
                            break;
                        }
                        z15 = false;
                    } else if (cCharAt == '\\' && (i15 = i18 + 1) < text.length() && (cCharAt2 = text.charAt(i15)) != ' ' && cCharAt2 != '\t' && cCharAt2 != '\n') {
                        i18 = i15;
                    }
                    i18++;
                } else {
                    if (z15) {
                        break;
                    }
                    z15 = true;
                    i18++;
                }
            }
            if (start == i18) {
                return null;
            }
            return new lr.i(start, i18 - 1);
        }

        public final lr.i e(CharSequence text, int start) {
            if (start < text.length() && text.charAt(start) == '[') {
                int i15 = start + 1;
                boolean z15 = false;
                for (int i16 = 1; i16 < 1000; i16++) {
                    if (i15 >= text.length()) {
                        return null;
                    }
                    char cCharAt = text.charAt(i15);
                    if (cCharAt == '[' || cCharAt == ']') {
                        break;
                    }
                    if (cCharAt == '\\') {
                        i15++;
                        if (i15 >= text.length()) {
                            return null;
                        }
                        cCharAt = text.charAt(i15);
                    }
                    if (!fu.a.c(cCharAt)) {
                        z15 = true;
                    }
                    i15++;
                }
                if (z15 && i15 < text.length() && text.charAt(i15) == ']') {
                    return new lr.i(start, i15);
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r2
          0x001c: PHI (r2v1 char) = (r2v0 char), (r2v2 char), (r2v4 char) binds: [B:6:0x000e, B:9:0x0013, B:13:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x0026  */
        /* JADX WARN: Code duplicated, block: B:21:0x0032  */
        /* JADX WARN: Code duplicated, block: B:23:0x003b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:25:0x003e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0040  */
        /* JADX WARN: Code duplicated, block: B:27:0x0042 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:32:0x004a  */
        /* JADX WARN: Code duplicated, block: B:44:0x002c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x005f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        public final lr.i f(CharSequence text, int start) {
            int i15;
            boolean z15;
            char cCharAt;
            int i16;
            char cCharAt2;
            if (start >= text.length()) {
                return null;
            }
            char cCharAt3 = text.charAt(start);
            char c15 = '\'';
            if (cCharAt3 == '\'') {
                i15 = start + 1;
                z15 = false;
                while (i15 < text.length()) {
                    cCharAt = text.charAt(i15);
                    if (cCharAt == c15) {
                        return new lr.i(start, i15);
                    }
                    if (cCharAt == '\n') {
                        if (z15) {
                            return null;
                        }
                        z15 = true;
                    } else if (cCharAt != ' ' && cCharAt != '\t') {
                        z15 = false;
                    }
                    if (cCharAt != '\\' && (i16 = i15 + 1) < text.length() && (cCharAt2 = text.charAt(i16)) != ' ' && cCharAt2 != '\t' && cCharAt2 != '\n') {
                        i15 = i16;
                    }
                    i15++;
                }
            } else {
                c15 = '\"';
                if (cCharAt3 == '\"') {
                    i15 = start + 1;
                    z15 = false;
                    while (i15 < text.length()) {
                        cCharAt = text.charAt(i15);
                        if (cCharAt == c15) {
                            return new lr.i(start, i15);
                        }
                        if (cCharAt == '\n') {
                            if (z15) {
                                return null;
                            }
                            z15 = true;
                        } else if (cCharAt != ' ') {
                            z15 = false;
                        }
                        if (cCharAt != '\\') {
                        }
                        i15++;
                    }
                } else if (cCharAt3 == '(') {
                    c15 = ')';
                    i15 = start + 1;
                    z15 = false;
                    while (i15 < text.length()) {
                        cCharAt = text.charAt(i15);
                        if (cCharAt == c15) {
                            return new lr.i(start, i15);
                        }
                        if (cCharAt == '\n') {
                            if (z15) {
                                return null;
                            }
                            z15 = true;
                        } else if (cCharAt != ' ') {
                            z15 = false;
                        }
                        if (cCharAt != '\\') {
                        }
                        i15++;
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        return false;
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        List<lr.i> listC;
        yv.a aVar;
        if (kw.d.INSTANCE.a(pos, stateInfo.getCurrentConstraints()) && (listC = INSTANCE.c(pos.j(), pos.getGlobalPos())) != null) {
            Iterator<T> it = listC.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                int i16 = i15 + 1;
                lr.i iVarA = INSTANCE.a((lr.i) it.next(), 0);
                if (i15 == 0) {
                    aVar = yv.c.LINK_LABEL;
                } else if (i15 == 1) {
                    aVar = yv.c.LINK_DESTINATION;
                } else {
                    if (i15 != 2) {
                        throw new AssertionError("There are no more than three groups in this regex");
                    }
                    aVar = yv.c.LINK_TITLE;
                }
                productionHolder.b(v.e(new nw.f.Node(iVarA, aVar)));
                i15 = i16;
            }
            int last = (((lr.i) v.x0(listC)).getLast() - pos.getGlobalPos()) + 1;
            iw.d.a aVarM = pos.m(last);
            return (aVarM == null || INSTANCE.b(aVarM)) ? v.e(new lw.g(stateInfo.getCurrentConstraints(), productionHolder.e(), pos.getGlobalPos() + last)) : v.n();
        }
        return v.n();
    }
}
