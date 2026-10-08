package jw;

import iw.d;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\n\u0010\r\u001a\u00060\u000bR\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0002*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljw/b;", "other", "", "d", "(Ljw/b;Ljw/b;)Z", "e", "g", "", "s", "c", "(Ljw/b;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Liw/d$a;", "Liw/d;", "pos", "a", "(Ljw/b;Liw/d$a;)Ljw/b;", "", "f", "(Ljw/b;Ljava/lang/CharSequence;)I", "b", "(Ljw/b;)Z", "markdown"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class c {
    public static final b a(b bVar, d.a aVar) {
        hw.a aVar2 = hw.a.f86718a;
        if (!(aVar.getLocalPos() == -1)) {
            throw new yv.d("");
        }
        b bVarE = bVar.e(aVar);
        String currentLine = aVar.getCurrentLine();
        while (true) {
            b bVarB = bVarE.b(aVar.m(f(bVarE, currentLine) + 1));
            if (bVarB == null) {
                return bVarE;
            }
            bVarE = bVarB;
        }
    }

    private static final boolean b(b bVar) {
        return bVar.d(bVar.c().length);
    }

    public static final CharSequence c(b bVar, CharSequence charSequence) {
        return charSequence.length() < bVar.f() ? "" : charSequence.subSequence(bVar.f(), charSequence.length());
    }

    public static final boolean d(b bVar, b bVar2) {
        if (bVar2.c().length != 0) {
            return bVar.g(bVar2) && !bVar.d(bVar2.c().length - 1);
        }
        throw new IllegalArgumentException("List constraints should contain at least one item");
    }

    public static final boolean e(b bVar, b bVar2) {
        return bVar.g(bVar2) && !bVar.d(bVar2.c().length);
    }

    public static final int f(b bVar, CharSequence charSequence) {
        return Math.min(bVar.f(), charSequence.length());
    }

    public static final boolean g(b bVar, b bVar2) {
        return bVar2.g(bVar) && !b(bVar);
    }
}
