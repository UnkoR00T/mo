package kw;

import er.l;
import fr.w;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\b\u0018\u00010\u0004R\u00020\u00052\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkw/a;", "", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "a", "(Liw/d$a;Ljw/b;)I", "eolsToSkip", "c", "(Liw/d$a;I)Liw/d$a;", "", "d", "(Liw/d$a;Ljw/b;)Z", "", "s", "e", "(Ljava/lang/CharSequence;)Z", "b", "(Ljw/b;Liw/d$a;)Liw/d$a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f112851a = new a();

    /* JADX INFO: renamed from: kw.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liw/d$a;", "Liw/d;", "pos", "", "c", "(Liw/d$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0})
    static final class C2729a extends w implements l<iw.d.a, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ jw.b f112852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2729a(jw.b bVar) {
            super(1);
            this.f112852b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0031  */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(iw.d.a aVar) {
            boolean z15;
            jw.b bVarE = this.f112852b.e(aVar);
            int iF = jw.c.f(bVarE, aVar.getCurrentLine());
            if (jw.c.g(bVarE, this.f112852b)) {
                z15 = true;
                if (iF < aVar.getCurrentLine().length()) {
                    iw.d.a aVarM = aVar.m(iF + 1);
                    if ((aVarM != null ? aVarM.a() : null) != null) {
                        z15 = false;
                    }
                }
            } else {
                z15 = false;
            }
            return Boolean.valueOf(z15);
        }
    }

    private a() {
    }

    public final int a(iw.d.a pos, jw.b constraints) {
        hw.a aVar = hw.a.f86718a;
        int i15 = 1;
        if (!(pos.getLocalPos() == -1)) {
            throw new yv.d("");
        }
        C2729a c2729a = new C2729a(constraints);
        while (c2729a.b(pos).booleanValue() && (pos = pos.l()) != null && (i15 = i15 + 1) <= 4) {
        }
        return i15;
    }

    public final iw.d.a b(jw.b constraints, iw.d.a pos) {
        do {
            jw.b bVarA = jw.c.a(constraints, pos);
            if (!jw.c.g(bVarA, constraints) || !jw.c.e(bVarA, constraints)) {
                break;
            }
            if (!f112851a.e(jw.c.c(bVarA, pos.getCurrentLine()))) {
                return pos;
            }
            pos = pos.l();
        } while (pos != null);
        return null;
    }

    public final iw.d.a c(iw.d.a pos, int eolsToSkip) {
        int i15 = eolsToSkip - 1;
        iw.d.a aVarL = pos;
        for (int i16 = 0; i16 < i15; i16++) {
            aVarL = pos.l();
            if (aVarL == null) {
                return null;
            }
        }
        while (aVarL.a() == null) {
            aVarL = aVarL.l();
            if (aVarL == null) {
                return null;
            }
        }
        return aVarL;
    }

    public final boolean d(iw.d.a pos, jw.b constraints) {
        int iF = jw.c.f(constraints, pos.getCurrentLine());
        if (pos.getLocalPos() >= iF + 4) {
            return true;
        }
        int localPos = pos.getLocalPos();
        if (iF > localPos) {
            return false;
        }
        while (pos.getCurrentLine().charAt(iF) != '\t') {
            if (iF == localPos) {
                return false;
            }
            iF++;
        }
        return true;
    }

    public final boolean e(CharSequence s15) {
        for (int i15 = 0; i15 < s15.length(); i15++) {
            char cCharAt = s15.charAt(i15);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return false;
            }
        }
        return true;
    }
}
