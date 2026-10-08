package q00;

import ay.g;
import fr.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lr.m;
import oq.r;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\n\u001a\u0004\u0018\u00010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lq00/d;", "Lay/g;", "Lez/c;", "dateConverter", "<init>", "(Lez/c;)V", "", "Loq/r;", "", "name", "b", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "cacheControl", "", "c", "(Ljava/lang/String;)Ljava/lang/Long;", "headers", "nowMillis", "a", "(Ljava/util/List;J)Ljava/lang/Long;", "Lez/c;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f163393b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f163394c = e1.i("no-store", "no-cache", "private");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lq00/d$a;", "", "<init>", "()V", "", "HEADER_CACHE_CONTROL", "Ljava/lang/String;", "HEADER_AGE", "HEADER_EXPIRES", "DIRECTIVE_MAX_AGE", "", "DIRECTIVE_SEPARATOR", "C", "VALUE_SEPARATOR", "", "MILLIS_PER_SECOND", "J", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public d(ez.c cVar) {
        this.dateConverter = cVar;
    }

    private final String b(List<r<String, String>> list, String str) {
        Object next;
        String str2;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fu.r.G((String) ((r) next).c(), str, true));
        r rVar = (r) next;
        if (rVar == null || (str2 = (String) rVar.d()) == null) {
            return null;
        }
        return fu.r.u1(str2).toString();
    }

    private final Long c(String cacheControl) {
        Iterator it = fu.r.U0(cacheControl, new char[]{','}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            String string = fu.r.u1((String) it.next()).toString();
            if (fu.r.V(string, "max-age", false, 2, null)) {
                return fu.r.w(fu.r.u1(fu.r.d1(string, '=', "")).toString());
            }
        }
        return null;
    }

    @Override // ay.g
    public Long a(List<r<String, String>> headers, long nowMillis) {
        Long lC;
        Long lW;
        String strB = b(headers, "Cache-Control");
        String lowerCase = strB != null ? strB.toLowerCase(Locale.US) : null;
        if (lowerCase != null) {
            Set<String> set = f163394c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (fu.r.d0(lowerCase, (String) it.next(), false, 2, null)) {
                        return null;
                    }
                }
            }
            Long lC2 = c(lowerCase);
            if (lC2 != null) {
                long jLongValue = lC2.longValue();
                if (jLongValue <= 0) {
                    return null;
                }
                String strB2 = b(headers, "Age");
                long jF = jLongValue - ((strB2 == null || (lW = fu.r.w(strB2)) == null) ? 0L : m.f(lW.longValue(), 0L));
                if (jF <= 0) {
                    return null;
                }
                return Long.valueOf(nowMillis + (jF * 1000));
            }
        }
        String strB3 = b(headers, "Expires");
        if (strB3 == null || (lC = this.dateConverter.c(strB3)) == null) {
            return null;
        }
        return Long.valueOf(lC.longValue());
    }
}
