package mw;

import fr.k;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00112\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmw/e;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "Liw/h;", "productionHolder", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "a", "(Liw/d$a;Ljw/b;)Z", "c", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class e implements kw.d<iw.f.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: mw.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmw/e$a;", "", "<init>", "()V", "", "line", "", "offset", "", "a", "(Ljava/lang/CharSequence;I)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(CharSequence line, int offset) {
            int length = line.length();
            Character chValueOf = null;
            int i15 = 0;
            int i16 = 1;
            while (offset < length) {
                char cCharAt = line.charAt(offset);
                if (chValueOf == null) {
                    if (cCharAt == '*' || cCharAt == '-' || cCharAt == '_') {
                        chValueOf = Character.valueOf(cCharAt);
                    } else {
                        if (i15 >= 3 || cCharAt != ' ') {
                            return false;
                        }
                        i15++;
                    }
                } else if (cCharAt == chValueOf.charValue()) {
                    i16++;
                } else if (cCharAt != ' ' && cCharAt != '\t') {
                    return false;
                }
                offset++;
            }
            return i16 >= 3;
        }

        private Companion() {
        }
    }

    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        return c(pos, constraints);
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        return c(pos, stateInfo.getCurrentConstraints()) ? v.e(new lw.e(stateInfo.getCurrentConstraints(), productionHolder.e())) : v.n();
    }

    public final boolean c(iw.d.a pos, jw.b constraints) {
        if (kw.d.INSTANCE.a(pos, constraints)) {
            return INSTANCE.a(pos.getCurrentLine(), pos.getLocalPos());
        }
        return false;
    }
}
