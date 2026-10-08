package mw;

import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmw/a;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "", "headerSize", "c", "(Liw/d$a;I)I", "Llr/i;", "d", "(Liw/d$a;)Llr/i;", "Liw/h;", "productionHolder", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "a", "(Liw/d$a;Ljw/b;)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class a implements kw.d<iw.f.a> {
    private final int c(iw.d.a pos, int headerSize) {
        CharSequence charSequenceD = pos.d();
        int length = charSequenceD.length() - 1;
        while (length > headerSize && fu.a.c(charSequenceD.charAt(length))) {
            length--;
        }
        while (length > headerSize && charSequenceD.charAt(length) == '#' && charSequenceD.charAt(length - 1) != '\\') {
            length--;
        }
        int i15 = length + 1;
        return (i15 < charSequenceD.length() && fu.a.c(charSequenceD.charAt(length)) && charSequenceD.charAt(i15) == '#') ? pos.getGlobalPos() + length + 1 : pos.getGlobalPos() + charSequenceD.length();
    }

    private final lr.i d(iw.d.a pos) {
        if (pos.getLocalPos() != -1) {
            CharSequence charSequenceD = pos.d();
            int iC = kw.d.Companion.c(kw.d.INSTANCE, charSequenceD, 0, 2, null);
            if (iC < charSequenceD.length() && charSequenceD.charAt(iC) == '#') {
                int i15 = iC;
                for (int i16 = 0; i16 < 6; i16++) {
                    if (i15 < charSequenceD.length() && charSequenceD.charAt(i15) == '#') {
                        i15++;
                    }
                }
                if (i15 >= charSequenceD.length() || v.q(' ', '\t').contains(Character.valueOf(charSequenceD.charAt(i15)))) {
                    return new lr.i(iC, i15 - 1);
                }
                return null;
            }
        }
        return null;
    }

    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        return d(pos) != null;
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        lr.i iVarD = d(pos);
        return iVarD != null ? v.e(new lw.a(stateInfo.getCurrentConstraints(), productionHolder, iVarD, c(pos, iVarD.getLast()), pos.g())) : v.n();
    }
}
